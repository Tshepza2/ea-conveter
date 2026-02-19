package com.bellyforex.tradeportea.ui.home.assets.types;

import android.app.ProgressDialog;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AsyncListDiffer;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.adapters.SymbolsAdapter;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Licence;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.network.module.Symbols;
import com.bellyforex.tradeportea.ui.home.assets.AssetsViewModel;
import com.bellyforex.tradeportea.utils.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: AllAssetsFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bellyforex/tradeportea/utils/Resource;", "Lcom/bellyforex/tradeportea/network/module/Symbols;", "kotlin.jvm.PlatformType", "invoke"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class AllAssetsFragment$onViewCreated$2 extends Lambda implements Function1<Resource<Symbols>, Unit> {
    final /* synthetic */ Ref.ObjectRef<ProgressDialog> $dialog;
    final /* synthetic */ View $view;
    final /* synthetic */ AllAssetsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllAssetsFragment$onViewCreated$2(Ref.ObjectRef<ProgressDialog> objectRef, AllAssetsFragment allAssetsFragment, View view) {
        super(1);
        this.$dialog = objectRef;
        this.this$0 = allAssetsFragment;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Resource) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Resource<Symbols> resource) {
        List<Symbol> symbols;
        SymbolsAdapter symbolsAdapter;
        if (resource instanceof Resource.Loading) {
            ProgressDialog progressDialog = (ProgressDialog) this.$dialog.element;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.$dialog.element = ProgressDialog.show(this.this$0.getContext(), "Loading", "Please wait...", true);
            ((LinearLayout) this.$view.findViewById(R.id.error_note)).setVisibility(8);
        } else if (resource instanceof Resource.Error) {
            ProgressDialog progressDialog2 = (ProgressDialog) this.$dialog.element;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            ((LinearLayout) this.$view.findViewById(R.id.error_note)).setVisibility(0);
            final AllAssetsFragment allAssetsFragment = this.this$0;
            ((Button) this.$view.findViewById(R.id.reload_button)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.assets.types.AllAssetsFragment$onViewCreated$2$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AllAssetsFragment$onViewCreated$2.invoke$lambda$0(AllAssetsFragment.this, view);
                }
            });
        } else if (resource instanceof Resource.Success) {
            ProgressDialog progressDialog3 = (ProgressDialog) this.$dialog.element;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
            ((LinearLayout) this.$view.findViewById(R.id.error_note)).setVisibility(8);
            Symbols data = resource.getData();
            Intrinsics.checkNotNull(data != null ? data.getSymbols() : null);
            if (!symbols.isEmpty()) {
                symbolsAdapter = this.this$0.symbolsAdapter;
                if (symbolsAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("symbolsAdapter");
                    symbolsAdapter = null;
                }
                AsyncListDiffer<Symbol> differ = symbolsAdapter.getDiffer();
                Symbols data2 = resource.getData();
                differ.submitList(data2 != null ? data2.getSymbols() : null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AllAssetsFragment allAssetsFragment, View view) {
        AssetsViewModel assetsViewModel;
        Intrinsics.checkNotNullParameter(allAssetsFragment, "this$0");
        assetsViewModel = allAssetsFragment.assetsViewModel;
        if (assetsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetsViewModel");
            assetsViewModel = null;
        }
        Licence sLicence = allAssetsFragment.getSLicence();
        Intrinsics.checkNotNull(sLicence);
        assetsViewModel.getSymbols(new AuthBody(null, sLicence.getPhone_secret_key()));
    }
}

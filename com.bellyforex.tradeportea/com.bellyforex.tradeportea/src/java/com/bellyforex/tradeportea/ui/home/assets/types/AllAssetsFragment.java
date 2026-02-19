package com.bellyforex.tradeportea.ui.home.assets.types;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.adapters.SymbolsAdapter;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Licence;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.ui.HomeActivity;
import com.bellyforex.tradeportea.ui.home.addrobot.AddRobotViewModel;
import com.bellyforex.tradeportea.ui.home.assets.AssetsViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: AllAssetsFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/assets/types/AllAssetsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addRobotViewModel", "Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;", "assetsViewModel", "Lcom/bellyforex/tradeportea/ui/home/assets/AssetsViewModel;", "sLicence", "Lcom/bellyforex/tradeportea/network/module/Licence;", "getSLicence", "()Lcom/bellyforex/tradeportea/network/module/Licence;", "setSLicence", "(Lcom/bellyforex/tradeportea/network/module/Licence;)V", "symbolsAdapter", "Lcom/bellyforex/tradeportea/adapters/SymbolsAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecycler", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AllAssetsFragment extends Fragment {
    private AddRobotViewModel addRobotViewModel;
    private AssetsViewModel assetsViewModel;
    private Licence sLicence;
    private SymbolsAdapter symbolsAdapter;

    public AllAssetsFragment() {
        super(R.layout.fragment_all_assets);
    }

    public final Licence getSLicence() {
        return this.sLicence;
    }

    public final void setSLicence(Licence licence) {
        this.sLicence = licence;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setupRecycler(view);
        HomeActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        this.assetsViewModel = activity.getAssetsViewModel();
        HomeActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        AddRobotViewModel addRobotViewModel = activity2.getAddRobotViewModel();
        this.addRobotViewModel = addRobotViewModel;
        SymbolsAdapter symbolsAdapter = null;
        if (addRobotViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
            addRobotViewModel = null;
        }
        addRobotViewModel.getSelectedLicences().observe((LifecycleOwner) this, new AllAssetsFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Sicence>, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.assets.types.AllAssetsFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<Sicence> list) {
                AssetsViewModel assetsViewModel;
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    Sicence sicence = list.get(0);
                    Licence licence = new Licence(sicence.getEa_name(), sicence.getEa_notification(), sicence.getExpires(), sicence.getKey(), sicence.getOwner(), sicence.getPhone_secret_key(), sicence.getStatus(), sicence.getUser(), false, 256, null);
                    assetsViewModel = AllAssetsFragment.this.assetsViewModel;
                    if (assetsViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("assetsViewModel");
                        assetsViewModel = null;
                    }
                    assetsViewModel.getSymbols(new AuthBody(null, licence.getPhone_secret_key()));
                    AllAssetsFragment.this.setSLicence(licence);
                }
            }
        }));
        new AlertDialog.Builder(getContext());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AssetsViewModel assetsViewModel = this.assetsViewModel;
        if (assetsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetsViewModel");
            assetsViewModel = null;
        }
        assetsViewModel.getSymbolsData().observe(getViewLifecycleOwner(), new AllAssetsFragment$sam$androidx_lifecycle_Observer$0(new AllAssetsFragment$onViewCreated$2(objectRef, this, view)));
        SymbolsAdapter symbolsAdapter2 = this.symbolsAdapter;
        if (symbolsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbolsAdapter");
        } else {
            symbolsAdapter = symbolsAdapter2;
        }
        symbolsAdapter.setOnItemClickListener(new Function1<Symbol, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.assets.types.AllAssetsFragment$onViewCreated$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Symbol) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Symbol symbol) {
                Intrinsics.checkNotNullParameter(symbol, "it");
                int id = symbol.getId();
                String name = symbol.getName();
                Licence sLicence = AllAssetsFragment.this.getSLicence();
                Intrinsics.checkNotNull(sLicence);
                Symbol symbol2 = new Symbol(id, name, sLicence.getPhone_secret_key(), null, null, null);
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("symbol", symbol2);
                FragmentKt.findNavController(AllAssetsFragment.this).navigate(R.id.action_assetsFragment_to_editAssetFragment, bundle2);
            }
        });
    }

    private final void setupRecycler(View view) {
        RecyclerView findViewById = view.findViewById(R.id.symbols_recyclerView);
        this.symbolsAdapter = new SymbolsAdapter();
        findViewById.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        findViewById.hasFixedSize();
        SymbolsAdapter symbolsAdapter = this.symbolsAdapter;
        if (symbolsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbolsAdapter");
            symbolsAdapter = null;
        }
        findViewById.setAdapter(symbolsAdapter);
    }
}

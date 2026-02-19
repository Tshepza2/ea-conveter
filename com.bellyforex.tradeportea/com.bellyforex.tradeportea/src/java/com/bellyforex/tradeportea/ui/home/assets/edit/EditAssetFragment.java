package com.bellyforex.tradeportea.ui.home.assets.edit;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.ui.HomeActivity;
import com.bellyforex.tradeportea.ui.home.assets.AssetsViewModel;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EditAssetFragment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/assets/edit/EditAssetFragment;", "Landroidx/fragment/app/Fragment;", "()V", "assetsViewModel", "Lcom/bellyforex/tradeportea/ui/home/assets/AssetsViewModel;", "back", "", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class EditAssetFragment extends Fragment {
    private AssetsViewModel assetsViewModel;

    public EditAssetFragment() {
        super(R.layout.fragment_edit_asset);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        back(view);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("symbol") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.bellyforex.tradeportea.network.module.Symbol");
        final Symbol symbol = (Symbol) serializable;
        HomeActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        this.assetsViewModel = activity.getAssetsViewModel();
        View findViewById = view.findViewById(R.id.outlined_edit_text);
        Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.outlined_edit_text_2);
        Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) findViewById2;
        View findViewById3 = view.findViewById(R.id.outlined_edit_text_3);
        Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) findViewById3;
        View findViewById4 = view.findViewById(R.id.outlined_edit_text_4);
        Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText4 = (EditText) findViewById4;
        final Editable text = editText3.getText();
        final Editable text2 = editText4.getText();
        if (symbol.getLotSize() != null) {
            editText.setText(symbol.getLotSize().toString());
        }
        if (symbol.getAction() != null) {
            editText2.setText(StringsKt.trim(symbol.getAction().toString()).toString());
        }
        if (symbol.getPlatform() != null) {
            List split$default = StringsKt.split$default(StringsKt.trim(symbol.getPlatform().toString()).toString(), new String[]{":"}, false, 0, 6, (Object) null);
            if (split$default.size() == 2) {
                String upperCase = ((String) split$default.get(0)).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                editText3.setText(upperCase);
                String upperCase2 = ((String) split$default.get(1)).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                editText4.setText(upperCase2);
            }
        }
        ((TextView) view.findViewById(R.id.top_text)).setText(symbol.getName());
        ((Button) view.findViewById(R.id.submit)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.assets.edit.EditAssetFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditAssetFragment.onViewCreated$lambda$0(editText, editText2, editText3, symbol, text, text2, this, view2);
            }
        });
        Button button = (Button) view.findViewById(R.id.submit);
        if (symbol.getLotSize() != null) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
        }
        final ImageButton imageButton = (ImageButton) view.findViewById(R.id.delete_symbol);
        if (symbol.getLotSize() != null) {
            imageButton.setVisibility(0);
        } else {
            imageButton.setVisibility(8);
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.assets.edit.EditAssetFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditAssetFragment.onViewCreated$lambda$3$lambda$2(EditAssetFragment.this, symbol, imageButton, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(EditText editText, EditText editText2, EditText editText3, Symbol symbol, Editable editable, Editable editable2, EditAssetFragment editAssetFragment, View view) {
        Intrinsics.checkNotNullParameter(editText, "$lot");
        Intrinsics.checkNotNullParameter(editText2, "$act");
        Intrinsics.checkNotNullParameter(editText3, "$pla");
        Intrinsics.checkNotNullParameter(symbol, "$symbol");
        Intrinsics.checkNotNullParameter(editAssetFragment, "this$0");
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() > 0) {
            Editable text2 = editText2.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() > 0) {
                Editable text3 = editText3.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                if (text3.length() > 0) {
                    List listOf = CollectionsKt.listOf(new String[]{"BUY", "SELL", "BOTH"});
                    String upperCase = editText2.getText().toString().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (listOf.contains(upperCase)) {
                        List listOf2 = CollectionsKt.listOf(new String[]{"MT5", "MT4"});
                        String upperCase2 = editText3.getText().toString().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                        if (listOf2.contains(upperCase2)) {
                            int id = symbol.getId();
                            String name = symbol.getName();
                            String phone_secret = symbol.getPhone_secret();
                            Double valueOf = Double.valueOf(Double.parseDouble(editText.getText().toString()));
                            String upperCase3 = editText2.getText().toString().toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                            Symbol symbol2 = new Symbol(id, name, phone_secret, valueOf, upperCase3, ((Object) editable) + ":" + ((Object) editable2));
                            AssetsViewModel assetsViewModel = editAssetFragment.assetsViewModel;
                            if (assetsViewModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("assetsViewModel");
                                assetsViewModel = null;
                            }
                            assetsViewModel.saveSymbol(symbol2);
                            Toast.makeText(editAssetFragment.getContext(), "Symbol Saved!", 0).show();
                            FragmentKt.findNavController(editAssetFragment).popBackStack();
                            return;
                        }
                        Toast.makeText(editAssetFragment.getContext(), "Platform Fields Can Only be MT5", 0).show();
                        return;
                    }
                    Toast.makeText(editAssetFragment.getContext(), "Action Fields Can Only be BUY, SELL or BOTH.", 0).show();
                    return;
                }
            }
        }
        Toast.makeText(editAssetFragment.getContext(), "Text Fields Cannot be empty", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$2(EditAssetFragment editAssetFragment, Symbol symbol, ImageButton imageButton, View view) {
        Intrinsics.checkNotNullParameter(editAssetFragment, "this$0");
        Intrinsics.checkNotNullParameter(symbol, "$symbol");
        AssetsViewModel assetsViewModel = editAssetFragment.assetsViewModel;
        if (assetsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetsViewModel");
            assetsViewModel = null;
        }
        assetsViewModel.deleteSymbol(symbol);
        Toast.makeText(imageButton.getContext(), "Symbol will no long be traded.", 0).show();
        FragmentKt.findNavController(editAssetFragment).popBackStack();
    }

    private final void back(View view) {
        ((ImageButton) view.findViewById(R.id.backbtn)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.assets.edit.EditAssetFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditAssetFragment.back$lambda$4(EditAssetFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void back$lambda$4(EditAssetFragment editAssetFragment, View view) {
        Intrinsics.checkNotNullParameter(editAssetFragment, "this$0");
        FragmentKt.findNavController(editAssetFragment).popBackStack();
    }
}

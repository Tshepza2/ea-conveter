package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FragmentEditAssetBinding implements ViewBinding {
    public final ImageButton backbtn;
    public final ImageButton deleteSymbol;
    public final TextInputEditText outlinedEditText;
    public final TextInputEditText outlinedEditText2;
    public final TextInputEditText outlinedEditText3;
    public final TextInputEditText outlinedEditText4;
    public final TextInputLayout outlinedTextInputLayout;
    public final TextInputLayout outlinedTextInputLayout2;
    public final TextInputLayout outlinedTextInputLayout3;
    public final TextInputLayout outlinedTextInputLayout4;
    private final RelativeLayout rootView;
    public final AppCompatButton submit;
    public final TextView topText;

    private FragmentEditAssetBinding(RelativeLayout rootView, ImageButton backbtn, ImageButton deleteSymbol, TextInputEditText outlinedEditText, TextInputEditText outlinedEditText2, TextInputEditText outlinedEditText3, TextInputEditText outlinedEditText4, TextInputLayout outlinedTextInputLayout, TextInputLayout outlinedTextInputLayout2, TextInputLayout outlinedTextInputLayout3, TextInputLayout outlinedTextInputLayout4, AppCompatButton submit, TextView topText) {
        this.rootView = rootView;
        this.backbtn = backbtn;
        this.deleteSymbol = deleteSymbol;
        this.outlinedEditText = outlinedEditText;
        this.outlinedEditText2 = outlinedEditText2;
        this.outlinedEditText3 = outlinedEditText3;
        this.outlinedEditText4 = outlinedEditText4;
        this.outlinedTextInputLayout = outlinedTextInputLayout;
        this.outlinedTextInputLayout2 = outlinedTextInputLayout2;
        this.outlinedTextInputLayout3 = outlinedTextInputLayout3;
        this.outlinedTextInputLayout4 = outlinedTextInputLayout4;
        this.submit = submit;
        this.topText = topText;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditAssetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentEditAssetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_edit_asset, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentEditAssetBinding bind(View rootView) {
        TextInputEditText findChildViewById;
        TextInputEditText findChildViewById2;
        TextInputEditText findChildViewById3;
        TextInputEditText findChildViewById4;
        TextInputLayout findChildViewById5;
        TextInputLayout findChildViewById6;
        TextInputLayout findChildViewById7;
        TextInputLayout findChildViewById8;
        AppCompatButton findChildViewById9;
        int i = R.id.backbtn;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, i);
        if (imageButton != null) {
            i = R.id.delete_symbol;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, i);
            if (imageButton2 != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text))) != null && (findChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text_2))) != null && (findChildViewById3 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text_3))) != null && (findChildViewById4 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text_4))) != null && (findChildViewById5 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout))) != null && (findChildViewById6 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout_2))) != null && (findChildViewById7 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout_3))) != null && (findChildViewById8 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout_4))) != null && (findChildViewById9 = ViewBindings.findChildViewById(rootView, (i = R.id.submit))) != null) {
                i = R.id.top_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    return new FragmentEditAssetBinding((RelativeLayout) rootView, imageButton, imageButton2, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, findChildViewById7, findChildViewById8, findChildViewById9, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

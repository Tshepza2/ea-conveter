package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FragmentMetatraderBinding implements ViewBinding {
    public final LinearLayout TopBtns;
    public final TextView accountConnectedText;
    public final View circleView;
    public final ImageView logoImg;
    public final Button mt4Btn;
    public final Button mt5Btn;
    public final TextInputEditText outlinedEditText;
    public final TextInputEditText outlinedEditText2;
    public final TextInputEditText outlinedEditText3;
    public final TextInputLayout outlinedTextInputLayout;
    public final TextInputLayout outlinedTextInputLayout2;
    public final TextInputLayout outlinedTextInputLayout3;
    private final RelativeLayout rootView;
    public final AppCompatButton submitMt4;
    public final AppCompatButton submitMt5;
    public final TextView topText;
    public final View v1;
    public final View v2;
    public final WebView webView;

    private FragmentMetatraderBinding(RelativeLayout rootView, LinearLayout TopBtns, TextView accountConnectedText, View circleView, ImageView logoImg, Button mt4Btn, Button mt5Btn, TextInputEditText outlinedEditText, TextInputEditText outlinedEditText2, TextInputEditText outlinedEditText3, TextInputLayout outlinedTextInputLayout, TextInputLayout outlinedTextInputLayout2, TextInputLayout outlinedTextInputLayout3, AppCompatButton submitMt4, AppCompatButton submitMt5, TextView topText, View v1, View v2, WebView webView) {
        this.rootView = rootView;
        this.TopBtns = TopBtns;
        this.accountConnectedText = accountConnectedText;
        this.circleView = circleView;
        this.logoImg = logoImg;
        this.mt4Btn = mt4Btn;
        this.mt5Btn = mt5Btn;
        this.outlinedEditText = outlinedEditText;
        this.outlinedEditText2 = outlinedEditText2;
        this.outlinedEditText3 = outlinedEditText3;
        this.outlinedTextInputLayout = outlinedTextInputLayout;
        this.outlinedTextInputLayout2 = outlinedTextInputLayout2;
        this.outlinedTextInputLayout3 = outlinedTextInputLayout3;
        this.submitMt4 = submitMt4;
        this.submitMt5 = submitMt5;
        this.topText = topText;
        this.v1 = v1;
        this.v2 = v2;
        this.webView = webView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMetatraderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentMetatraderBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_metatrader, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMetatraderBinding bind(View rootView) {
        View findChildViewById;
        TextInputEditText findChildViewById2;
        TextInputEditText findChildViewById3;
        TextInputEditText findChildViewById4;
        TextInputLayout findChildViewById5;
        TextInputLayout findChildViewById6;
        TextInputLayout findChildViewById7;
        AppCompatButton findChildViewById8;
        AppCompatButton findChildViewById9;
        View findChildViewById10;
        View findChildViewById11;
        int i = R.id.TopBtns;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.accountConnectedText;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.circleView))) != null) {
                i = R.id.logo_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = R.id.mt4_btn;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                    if (button != null) {
                        i = R.id.mt5_btn;
                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, i);
                        if (button2 != null && (findChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text))) != null && (findChildViewById3 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text_2))) != null && (findChildViewById4 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text_3))) != null && (findChildViewById5 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout))) != null && (findChildViewById6 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout_2))) != null && (findChildViewById7 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout_3))) != null && (findChildViewById8 = ViewBindings.findChildViewById(rootView, (i = R.id.submitMt4))) != null && (findChildViewById9 = ViewBindings.findChildViewById(rootView, (i = R.id.submitMt5))) != null) {
                            i = R.id.top_text;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView2 != null && (findChildViewById10 = ViewBindings.findChildViewById(rootView, (i = R.id.v1))) != null && (findChildViewById11 = ViewBindings.findChildViewById(rootView, (i = R.id.v2))) != null) {
                                i = R.id.webView;
                                WebView webView = (WebView) ViewBindings.findChildViewById(rootView, i);
                                if (webView != null) {
                                    return new FragmentMetatraderBinding((RelativeLayout) rootView, linearLayout, textView, findChildViewById, imageView, button, button2, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, findChildViewById7, findChildViewById8, findChildViewById9, textView2, findChildViewById10, findChildViewById11, webView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

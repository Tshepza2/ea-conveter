package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ActivityHomeBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final TextView eeeTxt;
    public final RelativeLayout errorCode;
    public final ImageView logoImg;
    public final ProgressBar mainProgress;
    public final RelativeLayout mainView;
    public final BottomNavigationView navView;
    public final TextInputEditText outlinedEditText2;
    public final TextInputEditText outlinedEditText3;
    public final TextInputLayout outlinedTextInputLayout2;
    public final TextInputLayout outlinedTextInputLayout3;
    public final RelativeLayout payLayout;
    public final ProgressBar progress;
    public final Button reloadReload;
    private final ConstraintLayout rootView;
    public final AppCompatButton subscribe;

    private ActivityHomeBinding(ConstraintLayout rootView, ConstraintLayout container, TextView eeeTxt, RelativeLayout errorCode, ImageView logoImg, ProgressBar mainProgress, RelativeLayout mainView, BottomNavigationView navView, TextInputEditText outlinedEditText2, TextInputEditText outlinedEditText3, TextInputLayout outlinedTextInputLayout2, TextInputLayout outlinedTextInputLayout3, RelativeLayout payLayout, ProgressBar progress, Button reloadReload, AppCompatButton subscribe) {
        this.rootView = rootView;
        this.container = container;
        this.eeeTxt = eeeTxt;
        this.errorCode = errorCode;
        this.logoImg = logoImg;
        this.mainProgress = mainProgress;
        this.mainView = mainView;
        this.navView = navView;
        this.outlinedEditText2 = outlinedEditText2;
        this.outlinedEditText3 = outlinedEditText3;
        this.outlinedTextInputLayout2 = outlinedTextInputLayout2;
        this.outlinedTextInputLayout3 = outlinedTextInputLayout3;
        this.payLayout = payLayout;
        this.progress = progress;
        this.reloadReload = reloadReload;
        this.subscribe = subscribe;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityHomeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_home, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHomeBinding bind(View rootView) {
        BottomNavigationView findChildViewById;
        TextInputEditText findChildViewById2;
        TextInputEditText findChildViewById3;
        TextInputLayout findChildViewById4;
        TextInputLayout findChildViewById5;
        AppCompatButton findChildViewById6;
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.eee_txt;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.error_code;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = R.id.logo_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = R.id.mainProgress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                    if (progressBar != null) {
                        i = R.id.main_view;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                        if (relativeLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.nav_view))) != null && (findChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text_2))) != null && (findChildViewById3 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text_3))) != null && (findChildViewById4 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout_2))) != null && (findChildViewById5 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout_3))) != null) {
                            i = R.id.payLayout;
                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                            if (relativeLayout3 != null) {
                                i = R.id.progress;
                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                                if (progressBar2 != null) {
                                    i = R.id.reload_reload;
                                    Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                                    if (button != null && (findChildViewById6 = ViewBindings.findChildViewById(rootView, (i = R.id.subscribe))) != null) {
                                        return new ActivityHomeBinding(constraintLayout, constraintLayout, textView, relativeLayout, imageView, progressBar, relativeLayout2, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, relativeLayout3, progressBar2, button, findChildViewById6);
                                    }
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

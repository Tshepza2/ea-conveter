package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ActivityMainBinding implements ViewBinding {
    public final AppCompatButton drawBtn;
    public final ImageView logoImg;
    public final TextView note;
    public final TextView note1;
    private final RelativeLayout rootView;

    private ActivityMainBinding(RelativeLayout rootView, AppCompatButton drawBtn, ImageView logoImg, TextView note, TextView note1) {
        this.rootView = rootView;
        this.drawBtn = drawBtn;
        this.logoImg = logoImg;
        this.note = note;
        this.note1 = note1;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_main, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View rootView) {
        int i = R.id.draw_btn;
        AppCompatButton findChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (findChildViewById != null) {
            i = R.id.logo_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.note;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.note1;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new ActivityMainBinding((RelativeLayout) rootView, findChildViewById, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

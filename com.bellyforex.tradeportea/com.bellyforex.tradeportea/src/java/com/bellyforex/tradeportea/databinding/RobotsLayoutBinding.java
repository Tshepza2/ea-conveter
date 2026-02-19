package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class RobotsLayoutBinding implements ViewBinding {
    public final TextView botName;
    public final ImageView logoImg;
    private final RelativeLayout rootView;

    private RobotsLayoutBinding(RelativeLayout rootView, TextView botName, ImageView logoImg) {
        this.rootView = rootView;
        this.botName = botName;
        this.logoImg = logoImg;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static RobotsLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static RobotsLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.robots_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static RobotsLayoutBinding bind(View rootView) {
        int i = R.id.bot_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.logo_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                return new RobotsLayoutBinding((RelativeLayout) rootView, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

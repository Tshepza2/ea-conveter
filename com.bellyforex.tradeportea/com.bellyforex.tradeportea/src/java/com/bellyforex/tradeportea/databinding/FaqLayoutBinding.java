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
public final class FaqLayoutBinding implements ViewBinding {
    public final TextView body;
    public final ImageView downArrow;
    private final RelativeLayout rootView;
    public final TextView title;
    public final ImageView upArrow;

    private FaqLayoutBinding(RelativeLayout rootView, TextView body, ImageView downArrow, TextView title, ImageView upArrow) {
        this.rootView = rootView;
        this.body = body;
        this.downArrow = downArrow;
        this.title = title;
        this.upArrow = upArrow;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FaqLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FaqLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.faq_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FaqLayoutBinding bind(View rootView) {
        int i = R.id.body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.down_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.up_arrow;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView2 != null) {
                        return new FaqLayoutBinding((RelativeLayout) rootView, textView, imageView, textView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

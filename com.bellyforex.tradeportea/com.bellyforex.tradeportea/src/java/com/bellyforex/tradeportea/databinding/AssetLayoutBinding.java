package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AssetLayoutBinding implements ViewBinding {
    public final TextView actxt;
    public final TextView lotTxt;
    private final RelativeLayout rootView;
    public final TextView symbolname;

    private AssetLayoutBinding(RelativeLayout rootView, TextView actxt, TextView lotTxt, TextView symbolname) {
        this.rootView = rootView;
        this.actxt = actxt;
        this.lotTxt = lotTxt;
        this.symbolname = symbolname;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static AssetLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AssetLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.asset_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AssetLayoutBinding bind(View rootView) {
        int i = R.id.actxt;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.lot_txt;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.symbolname;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView3 != null) {
                    return new AssetLayoutBinding((RelativeLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

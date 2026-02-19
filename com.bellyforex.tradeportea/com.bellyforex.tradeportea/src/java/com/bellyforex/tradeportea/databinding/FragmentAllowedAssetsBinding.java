package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FragmentAllowedAssetsBinding implements ViewBinding {
    public final TextView emptytext;
    public final TextView note;
    private final RelativeLayout rootView;
    public final RecyclerView symbolsRecyclerView;

    private FragmentAllowedAssetsBinding(RelativeLayout rootView, TextView emptytext, TextView note, RecyclerView symbolsRecyclerView) {
        this.rootView = rootView;
        this.emptytext = emptytext;
        this.note = note;
        this.symbolsRecyclerView = symbolsRecyclerView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAllowedAssetsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentAllowedAssetsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_allowed_assets, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAllowedAssetsBinding bind(View rootView) {
        RecyclerView findChildViewById;
        int i = R.id.emptytext;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.note;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.symbols_recyclerView))) != null) {
                return new FragmentAllowedAssetsBinding((RelativeLayout) rootView, textView, textView2, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

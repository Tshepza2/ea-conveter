package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FragmentAllAssetsBinding implements ViewBinding {
    public final LinearLayout errorNote;
    public final TextView note;
    public final Button reloadButton;
    private final RelativeLayout rootView;
    public final RecyclerView symbolsRecyclerView;

    private FragmentAllAssetsBinding(RelativeLayout rootView, LinearLayout errorNote, TextView note, Button reloadButton, RecyclerView symbolsRecyclerView) {
        this.rootView = rootView;
        this.errorNote = errorNote;
        this.note = note;
        this.reloadButton = reloadButton;
        this.symbolsRecyclerView = symbolsRecyclerView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAllAssetsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentAllAssetsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_all_assets, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAllAssetsBinding bind(View rootView) {
        RecyclerView findChildViewById;
        int i = R.id.error_note;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.note;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.reload_button;
                Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                if (button != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.symbols_recyclerView))) != null) {
                    return new FragmentAllAssetsBinding((RelativeLayout) rootView, linearLayout, textView, button, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

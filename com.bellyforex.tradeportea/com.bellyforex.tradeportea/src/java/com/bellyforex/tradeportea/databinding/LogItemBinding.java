package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class LogItemBinding implements ViewBinding {
    public final TextView logText;
    private final LinearLayout rootView;

    private LogItemBinding(LinearLayout rootView, TextView logText) {
        this.rootView = rootView;
        this.logText = logText;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LogItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LogItemBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.log_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LogItemBinding bind(View rootView) {
        int i = R.id.log_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            return new LogItemBinding((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

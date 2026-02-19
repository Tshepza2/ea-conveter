package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class InfoLayoutBinding implements ViewBinding {
    public final TextView appname;
    public final RelativeLayout autotrade;
    public final Button forceStop;
    public final ImageView icon;
    public final TextView logMessage;
    public final TextView noteText;
    private final RelativeLayout rootView;
    public final NestedScrollView sv;

    private InfoLayoutBinding(RelativeLayout rootView, TextView appname, RelativeLayout autotrade, Button forceStop, ImageView icon, TextView logMessage, TextView noteText, NestedScrollView sv) {
        this.rootView = rootView;
        this.appname = appname;
        this.autotrade = autotrade;
        this.forceStop = forceStop;
        this.icon = icon;
        this.logMessage = logMessage;
        this.noteText = noteText;
        this.sv = sv;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static InfoLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static InfoLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.info_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static InfoLayoutBinding bind(View rootView) {
        NestedScrollView findChildViewById;
        int i = R.id.appname;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.autotrade;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
            if (relativeLayout != null) {
                i = R.id.force_stop;
                Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                if (button != null) {
                    i = R.id.icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = R.id.log_message;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null) {
                            i = R.id.note_text;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView3 != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.sv))) != null) {
                                return new InfoLayoutBinding((RelativeLayout) rootView, textView, relativeLayout, button, imageView, textView2, textView3, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

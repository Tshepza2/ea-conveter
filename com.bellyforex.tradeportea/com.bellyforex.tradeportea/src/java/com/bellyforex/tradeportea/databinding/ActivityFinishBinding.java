package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ActivityFinishBinding implements ViewBinding {
    public final TextView appname;
    public final Button copyBtn;
    public final RelativeLayout loading;
    public final TextView logMessage;
    private final RelativeLayout rootView;
    public final NestedScrollView sv;
    public final TextView textView;
    public final TextView textView2;
    public final TextView textView22;
    public final TextView timeLine1;
    public final TextView timeLine2;
    public final ProgressBar timeProgressBar;
    public final LinearLayout tmLayout;
    public final RelativeLayout update;
    public final Button updatebutton;
    public final RelativeLayout wheels;

    private ActivityFinishBinding(RelativeLayout rootView, TextView appname, Button copyBtn, RelativeLayout loading, TextView logMessage, NestedScrollView sv, TextView textView, TextView textView2, TextView textView22, TextView timeLine1, TextView timeLine2, ProgressBar timeProgressBar, LinearLayout tmLayout, RelativeLayout update, Button updatebutton, RelativeLayout wheels) {
        this.rootView = rootView;
        this.appname = appname;
        this.copyBtn = copyBtn;
        this.loading = loading;
        this.logMessage = logMessage;
        this.sv = sv;
        this.textView = textView;
        this.textView2 = textView2;
        this.textView22 = textView22;
        this.timeLine1 = timeLine1;
        this.timeLine2 = timeLine2;
        this.timeProgressBar = timeProgressBar;
        this.tmLayout = tmLayout;
        this.update = update;
        this.updatebutton = updatebutton;
        this.wheels = wheels;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFinishBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityFinishBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_finish, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityFinishBinding bind(View rootView) {
        NestedScrollView findChildViewById;
        int i = R.id.appname;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.copy_btn;
            Button button = (Button) ViewBindings.findChildViewById(rootView, i);
            if (button != null) {
                i = R.id.loading;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                if (relativeLayout != null) {
                    i = R.id.log_message;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.sv))) != null) {
                        i = R.id.textView;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.textView2;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                i = R.id.textView22;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView5 != null) {
                                    i = R.id.time_line_1;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                    if (textView6 != null) {
                                        i = R.id.time_line_2;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView7 != null) {
                                            i = R.id.time_progressBar;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                                            if (progressBar != null) {
                                                i = R.id.tm_layout;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                if (linearLayout != null) {
                                                    i = R.id.update;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                    if (relativeLayout2 != null) {
                                                        i = R.id.updatebutton;
                                                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, i);
                                                        if (button2 != null) {
                                                            i = R.id.wheels;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                            if (relativeLayout3 != null) {
                                                                return new ActivityFinishBinding((RelativeLayout) rootView, textView, button, relativeLayout, textView2, findChildViewById, textView3, textView4, textView5, textView6, textView7, progressBar, linearLayout, relativeLayout2, button2, relativeLayout3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ActivityTradeBinding implements ViewBinding {
    public final TextView appname;
    public final RelativeLayout autotrade;
    public final CardView cardview;
    public final ImageView centeredIcon;
    public final Button forceStop;
    public final TextView logMessage;
    private final RelativeLayout rootView;
    public final NestedScrollView sv;
    public final WebView webView;

    private ActivityTradeBinding(RelativeLayout rootView, TextView appname, RelativeLayout autotrade, CardView cardview, ImageView centeredIcon, Button forceStop, TextView logMessage, NestedScrollView sv, WebView webView) {
        this.rootView = rootView;
        this.appname = appname;
        this.autotrade = autotrade;
        this.cardview = cardview;
        this.centeredIcon = centeredIcon;
        this.forceStop = forceStop;
        this.logMessage = logMessage;
        this.sv = sv;
        this.webView = webView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTradeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityTradeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_trade, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityTradeBinding bind(View rootView) {
        CardView findChildViewById;
        NestedScrollView findChildViewById2;
        int i = R.id.appname;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.autotrade;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
            if (relativeLayout != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.cardview))) != null) {
                i = R.id.centered_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView != null) {
                    i = R.id.force_stop;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                    if (button != null) {
                        i = R.id.log_message;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView2 != null && (findChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.sv))) != null) {
                            i = R.id.webView;
                            WebView webView = (WebView) ViewBindings.findChildViewById(rootView, i);
                            if (webView != null) {
                                return new ActivityTradeBinding((RelativeLayout) rootView, textView, relativeLayout, findChildViewById, imageView, button, textView2, findChildViewById2, webView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

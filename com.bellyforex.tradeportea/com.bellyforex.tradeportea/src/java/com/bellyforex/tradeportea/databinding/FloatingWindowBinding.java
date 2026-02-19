package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FloatingWindowBinding implements ViewBinding {
    public final Button accountButton;
    public final Button allowedSymbols;
    public final TextView botName;
    public final Button closeButton;
    public final Button executeButton;
    public final Button internetStatus;
    public final ImageView logoImg;
    public final LinearLayout mainContent;
    public final Button modeb;
    public final TextView ownerName;
    private final FrameLayout rootView;
    public final RelativeLayout selectedBotHeader;
    public final Button statusButton;
    public final LinearLayout statusbuttons;

    private FloatingWindowBinding(FrameLayout rootView, Button accountButton, Button allowedSymbols, TextView botName, Button closeButton, Button executeButton, Button internetStatus, ImageView logoImg, LinearLayout mainContent, Button modeb, TextView ownerName, RelativeLayout selectedBotHeader, Button statusButton, LinearLayout statusbuttons) {
        this.rootView = rootView;
        this.accountButton = accountButton;
        this.allowedSymbols = allowedSymbols;
        this.botName = botName;
        this.closeButton = closeButton;
        this.executeButton = executeButton;
        this.internetStatus = internetStatus;
        this.logoImg = logoImg;
        this.mainContent = mainContent;
        this.modeb = modeb;
        this.ownerName = ownerName;
        this.selectedBotHeader = selectedBotHeader;
        this.statusButton = statusButton;
        this.statusbuttons = statusbuttons;
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FloatingWindowBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FloatingWindowBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.floating_window, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FloatingWindowBinding bind(View rootView) {
        int i = R.id.accountButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, i);
        if (button != null) {
            i = R.id.allowedSymbols;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, i);
            if (button2 != null) {
                i = R.id.bot_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.closeButton;
                    Button button3 = (Button) ViewBindings.findChildViewById(rootView, i);
                    if (button3 != null) {
                        i = R.id.executeButton;
                        Button button4 = (Button) ViewBindings.findChildViewById(rootView, i);
                        if (button4 != null) {
                            i = R.id.internetStatus;
                            Button button5 = (Button) ViewBindings.findChildViewById(rootView, i);
                            if (button5 != null) {
                                i = R.id.logo_img;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                if (imageView != null) {
                                    i = R.id.mainContent;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                    if (linearLayout != null) {
                                        i = R.id.modeb;
                                        Button button6 = (Button) ViewBindings.findChildViewById(rootView, i);
                                        if (button6 != null) {
                                            i = R.id.owner_name;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView2 != null) {
                                                i = R.id.selected_bot_header;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                if (relativeLayout != null) {
                                                    i = R.id.statusButton;
                                                    Button button7 = (Button) ViewBindings.findChildViewById(rootView, i);
                                                    if (button7 != null) {
                                                        i = R.id.statusbuttons;
                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                        if (linearLayout2 != null) {
                                                            return new FloatingWindowBinding((FrameLayout) rootView, button, button2, textView, button3, button4, button5, imageView, linearLayout, button6, textView2, relativeLayout, button7, linearLayout2);
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

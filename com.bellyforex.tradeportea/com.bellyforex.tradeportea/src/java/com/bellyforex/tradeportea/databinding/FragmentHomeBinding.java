package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FragmentHomeBinding implements ViewBinding {
    public final CardView addBotBtn;
    public final ImageButton botInfo;
    public final TextView botName;
    public final RelativeLayout botsList;
    public final RecyclerView botsListRecyclerView;
    public final CardView controls;
    public final LinearLayout deleteEa;
    public final LinearLayout gotoasset;
    public final TextView label;
    public final ImageView logoImg;
    public final TextView note;
    public final TextView ownerName;
    private final RelativeLayout rootView;
    public final RelativeLayout selectedBotHeader;
    public final LinearLayout startButton;
    public final LinearLayout stopButton;

    private FragmentHomeBinding(RelativeLayout rootView, CardView addBotBtn, ImageButton botInfo, TextView botName, RelativeLayout botsList, RecyclerView botsListRecyclerView, CardView controls, LinearLayout deleteEa, LinearLayout gotoasset, TextView label, ImageView logoImg, TextView note, TextView ownerName, RelativeLayout selectedBotHeader, LinearLayout startButton, LinearLayout stopButton) {
        this.rootView = rootView;
        this.addBotBtn = addBotBtn;
        this.botInfo = botInfo;
        this.botName = botName;
        this.botsList = botsList;
        this.botsListRecyclerView = botsListRecyclerView;
        this.controls = controls;
        this.deleteEa = deleteEa;
        this.gotoasset = gotoasset;
        this.label = label;
        this.logoImg = logoImg;
        this.note = note;
        this.ownerName = ownerName;
        this.selectedBotHeader = selectedBotHeader;
        this.startButton = startButton;
        this.stopButton = stopButton;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_home, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHomeBinding bind(View rootView) {
        RecyclerView findChildViewById;
        CardView findChildViewById2;
        int i = R.id.add_bot_btn;
        CardView findChildViewById3 = ViewBindings.findChildViewById(rootView, i);
        if (findChildViewById3 != null) {
            i = R.id.bot_info;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, i);
            if (imageButton != null) {
                i = R.id.bot_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.bots_list;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                    if (relativeLayout != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.bots_list_recycler_view))) != null && (findChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.controls))) != null) {
                        i = R.id.delete_ea;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                        if (linearLayout != null) {
                            i = R.id.gotoasset;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                            if (linearLayout2 != null) {
                                i = R.id.label;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView2 != null) {
                                    i = R.id.logo_img;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                    if (imageView != null) {
                                        i = R.id.note;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView3 != null) {
                                            i = R.id.owner_name;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView4 != null) {
                                                i = R.id.selected_bot_header;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, i);
                                                if (relativeLayout2 != null) {
                                                    i = R.id.startButton;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.stopButton;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                        if (linearLayout4 != null) {
                                                            return new FragmentHomeBinding((RelativeLayout) rootView, findChildViewById3, imageButton, textView, relativeLayout, findChildViewById, findChildViewById2, linearLayout, linearLayout2, textView2, imageView, textView3, textView4, relativeLayout2, linearLayout3, linearLayout4);
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

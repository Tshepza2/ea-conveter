package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.bellyforex.tradeportea.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AssetsFragmentBinding implements ViewBinding {
    public final ImageButton backbtn;
    public final TextView noAccount;
    private final RelativeLayout rootView;
    public final TabLayout tabLayout;
    public final TextView topText;
    public final ViewPager viewPager;

    private AssetsFragmentBinding(RelativeLayout rootView, ImageButton backbtn, TextView noAccount, TabLayout tabLayout, TextView topText, ViewPager viewPager) {
        this.rootView = rootView;
        this.backbtn = backbtn;
        this.noAccount = noAccount;
        this.tabLayout = tabLayout;
        this.topText = topText;
        this.viewPager = viewPager;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static AssetsFragmentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AssetsFragmentBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.assets_fragment, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AssetsFragmentBinding bind(View rootView) {
        TabLayout findChildViewById;
        ViewPager findChildViewById2;
        int i = R.id.backbtn;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, i);
        if (imageButton != null) {
            i = R.id.no_account;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.tab_layout))) != null) {
                i = R.id.top_text;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null && (findChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.view_pager))) != null) {
                    return new AssetsFragmentBinding((RelativeLayout) rootView, imageButton, textView, findChildViewById, textView2, findChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

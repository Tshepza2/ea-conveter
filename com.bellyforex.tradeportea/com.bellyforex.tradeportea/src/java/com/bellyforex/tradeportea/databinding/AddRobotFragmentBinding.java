package com.bellyforex.tradeportea.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bellyforex.tradeportea.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AddRobotFragmentBinding implements ViewBinding {
    public final ImageButton backbtn;
    public final TextView noteText;
    public final TextInputEditText outlinedEditText;
    public final TextInputLayout outlinedTextInputLayout;
    private final RelativeLayout rootView;
    public final AppCompatButton submit;
    public final TextView topText;

    private AddRobotFragmentBinding(RelativeLayout rootView, ImageButton backbtn, TextView noteText, TextInputEditText outlinedEditText, TextInputLayout outlinedTextInputLayout, AppCompatButton submit, TextView topText) {
        this.rootView = rootView;
        this.backbtn = backbtn;
        this.noteText = noteText;
        this.outlinedEditText = outlinedEditText;
        this.outlinedTextInputLayout = outlinedTextInputLayout;
        this.submit = submit;
        this.topText = topText;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static AddRobotFragmentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static AddRobotFragmentBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.add_robot_fragment, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static AddRobotFragmentBinding bind(View rootView) {
        TextInputEditText findChildViewById;
        TextInputLayout findChildViewById2;
        AppCompatButton findChildViewById3;
        int i = R.id.backbtn;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, i);
        if (imageButton != null) {
            i = R.id.note_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null && (findChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_edit_text))) != null && (findChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.outlined_text_input_layout))) != null && (findChildViewById3 = ViewBindings.findChildViewById(rootView, (i = R.id.submit))) != null) {
                i = R.id.top_text;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new AddRobotFragmentBinding((RelativeLayout) rootView, imageButton, textView, findChildViewById, findChildViewById2, findChildViewById3, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

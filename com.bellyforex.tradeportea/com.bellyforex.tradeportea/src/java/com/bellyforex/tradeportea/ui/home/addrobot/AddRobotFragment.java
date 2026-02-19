package com.bellyforex.tradeportea.ui.home.addrobot;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.ui.HomeActivity;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: AddRobotFragment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotFragment;", "Landroidx/fragment/app/Fragment;", "()V", "viewModel", "Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;", "back", "", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AddRobotFragment extends Fragment {
    private AddRobotViewModel viewModel;

    public AddRobotFragment() {
        super(R.layout.add_robot_fragment);
    }

    public void onViewCreated(final View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        back(view);
        HomeActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        this.viewModel = activity.getAddRobotViewModel();
        ((Button) view.findViewById(R.id.submit)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.addrobot.AddRobotFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddRobotFragment.onViewCreated$lambda$0(view, this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(View view, AddRobotFragment addRobotFragment, View view2) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(addRobotFragment, "this$0");
        TextInputEditText findViewById = view.findViewById(R.id.outlined_edit_text);
        Editable text = findViewById.getText();
        AddRobotViewModel addRobotViewModel = null;
        Integer valueOf = text != null ? Integer.valueOf(text.length()) : null;
        Intrinsics.checkNotNull(valueOf);
        if (valueOf.intValue() > 0) {
            AddRobotViewModel addRobotViewModel2 = addRobotFragment.viewModel;
            if (addRobotViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                addRobotViewModel2 = null;
            }
            addRobotViewModel2.authenticate(new AuthBody(String.valueOf(findViewById.getText()), null));
            AlertDialog.Builder builder = new AlertDialog.Builder(addRobotFragment.getContext());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            AddRobotViewModel addRobotViewModel3 = addRobotFragment.viewModel;
            if (addRobotViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                addRobotViewModel = addRobotViewModel3;
            }
            addRobotViewModel.getAccountData().observe(addRobotFragment.getViewLifecycleOwner(), new AddRobotFragment$sam$androidx_lifecycle_Observer$0(new AddRobotFragment$onViewCreated$1$1(objectRef, builder, addRobotFragment)));
            return;
        }
        Toast.makeText(addRobotFragment.getContext(), "Text Box is empty", 0).show();
    }

    private final void back(View view) {
        ((ImageButton) view.findViewById(R.id.backbtn)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.addrobot.AddRobotFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddRobotFragment.back$lambda$1(AddRobotFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void back$lambda$1(AddRobotFragment addRobotFragment, View view) {
        Intrinsics.checkNotNullParameter(addRobotFragment, "this$0");
        FragmentKt.findNavController(addRobotFragment).popBackStack();
    }
}

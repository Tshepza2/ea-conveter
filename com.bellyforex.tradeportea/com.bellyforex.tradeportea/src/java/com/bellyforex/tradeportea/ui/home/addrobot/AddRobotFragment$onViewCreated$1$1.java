package com.bellyforex.tradeportea.ui.home.addrobot;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.bellyforex.tradeportea.network.module.Account;
import com.bellyforex.tradeportea.utils.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddRobotFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bellyforex/tradeportea/utils/Resource;", "Lcom/bellyforex/tradeportea/network/module/Account;", "kotlin.jvm.PlatformType", "invoke"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AddRobotFragment$onViewCreated$1$1 extends Lambda implements Function1<Resource<Account>, Unit> {
    final /* synthetic */ AlertDialog.Builder $builder;
    final /* synthetic */ Ref.ObjectRef<ProgressDialog> $dialog;
    final /* synthetic */ AddRobotFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddRobotFragment$onViewCreated$1$1(Ref.ObjectRef<ProgressDialog> objectRef, AlertDialog.Builder builder, AddRobotFragment addRobotFragment) {
        super(1);
        this.$dialog = objectRef;
        this.$builder = builder;
        this.this$0 = addRobotFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Resource) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Resource<Account> resource) {
        if (resource instanceof Resource.Error) {
            ProgressDialog progressDialog = (ProgressDialog) this.$dialog.element;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.$builder.setTitle("Error");
            this.$builder.setMessage(String.valueOf(resource.getMessage()));
            this.$builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.addrobot.AddRobotFragment$onViewCreated$1$1$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            this.$builder.create().show();
        } else if (resource instanceof Resource.Loading) {
            ProgressDialog progressDialog2 = (ProgressDialog) this.$dialog.element;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            this.$dialog.element = ProgressDialog.show(this.this$0.getContext(), "Loading", "Please wait...", true);
        } else if (resource instanceof Resource.Success) {
            ProgressDialog progressDialog3 = (ProgressDialog) this.$dialog.element;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
            this.$builder.setTitle("Success");
            this.$builder.setMessage("New account is successfully added!!");
            this.$builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.addrobot.AddRobotFragment$onViewCreated$1$1$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            this.$builder.create().show();
        }
    }
}

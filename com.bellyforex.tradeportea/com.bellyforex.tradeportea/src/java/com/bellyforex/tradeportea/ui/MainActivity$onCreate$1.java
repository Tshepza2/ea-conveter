package com.bellyforex.tradeportea.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.bellyforex.tradeportea.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class MainActivity$onCreate$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$1(MainActivity mainActivity) {
        super(1);
        this.this$0 = mainActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Boolean bool) {
        Window window = this.this$0.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        if (Intrinsics.areEqual(bool, true)) {
            this.this$0.drawPass = true;
            Button button = (Button) this.this$0.findViewById(R.id.draw_btn);
            button.setEnabled(false);
            button.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_baseline_check_circle_24, 0);
            window.addFlags(128);
            return;
        }
        this.this$0.drawPass = false;
        View findViewById = this.this$0.findViewById(R.id.draw_btn);
        final MainActivity mainActivity = this.this$0;
        Button button2 = (Button) findViewById;
        button2.setEnabled(true);
        button2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_baseline_cancel_24, 0);
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.MainActivity$onCreate$1$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity$onCreate$1.invoke$lambda$3$lambda$2(MainActivity.this, view);
            }
        });
        window.clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$3$lambda$2(MainActivity mainActivity, View view) {
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        mainActivity.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + mainActivity.getPackageName())), 0);
    }
}

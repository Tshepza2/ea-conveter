package com.bellyforex.tradeportea.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.db.LicenceDB;
import com.bellyforex.tradeportea.network.module.log;
import com.bellyforex.tradeportea.repository.RTRepository;
import com.bellyforex.tradeportea.utils.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: FinishActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bellyforex/tradeportea/ui/FinishActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "rtRepository", "Lcom/bellyforex/tradeportea/repository/RTRepository;", "savedLogData", "Landroidx/lifecycle/LiveData;", "", "Lcom/bellyforex/tradeportea/network/module/log;", "savedLogObserver", "Landroidx/lifecycle/Observer;", "copyTextToClipboard", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FinishActivity extends AppCompatActivity {
    private LiveData<List<log>> savedLogData;
    private final RTRepository rtRepository = new RTRepository(LicenceDB.Companion.invoke((Context) this));
    private final Observer<List<log>> savedLogObserver = new Observer() { // from class: com.bellyforex.tradeportea.ui.FinishActivity$$ExternalSyntheticLambda0
        public final void onChanged(Object obj) {
            FinishActivity.savedLogObserver$lambda$2(FinishActivity.this, (List) obj);
        }
    };

    /* JADX WARN: Type inference failed for: r8v28, types: [com.bellyforex.tradeportea.ui.FinishActivity$onCreate$timer1$1] */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_finish);
        LiveData<List<log>> dBLogs = this.rtRepository.getDBLogs();
        this.savedLogData = dBLogs;
        if (dBLogs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savedLogData");
            dBLogs = null;
        }
        dBLogs.observeForever(this.savedLogObserver);
        if (!getIntent().getBooleanExtra("update", false)) {
            ((RelativeLayout) findViewById(R.id.loading)).setVisibility(0);
            ((RelativeLayout) findViewById(R.id.update)).setVisibility(8);
            final Ref.IntRef intRef = new Ref.IntRef();
            final ProgressBar progressBar = (ProgressBar) findViewById(R.id.time_progressBar);
            final TextView textView = (TextView) findViewById(R.id.time_line_2);
            final Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = 50;
            new CountDownTimer() { // from class: com.bellyforex.tradeportea.ui.FinishActivity$onCreate$timer1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(50000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j) {
                    Ref.IntRef intRef3 = intRef2;
                    intRef3.element--;
                    textView.setText(String.valueOf(intRef2.element));
                    if (intRef.element <= 50) {
                        progressBar.setProgress(intRef.element);
                    }
                    intRef.element++;
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    ProgressBar progressBar2 = progressBar;
                    FinishActivity finishActivity = this;
                    progressBar2.setProgress(50);
                    finishActivity.finish();
                }
            }.start();
            return;
        }
        ((RelativeLayout) findViewById(R.id.loading)).setVisibility(8);
        ((RelativeLayout) findViewById(R.id.update)).setVisibility(0);
        ((Button) findViewById(R.id.updatebutton)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.FinishActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FinishActivity.onCreate$lambda$0(FinishActivity.this, view);
            }
        });
        Unit unit = Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(FinishActivity finishActivity, View view) {
        Intrinsics.checkNotNullParameter(finishActivity, "this$0");
        finishActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(Constants.UPDATE_LINK)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void savedLogObserver$lambda$2(final FinishActivity finishActivity, List list) {
        Intrinsics.checkNotNullParameter(finishActivity, "this$0");
        Intrinsics.checkNotNullParameter(list, "it");
        if (!(!list.isEmpty()) || list.size() <= 1) {
            return;
        }
        ((TextView) finishActivity.findViewById(R.id.log_message)).setText(((log) list.get(1)).getMessage());
        ((Button) finishActivity.findViewById(R.id.copy_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.FinishActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FinishActivity.savedLogObserver$lambda$2$lambda$1(FinishActivity.this, view);
            }
        });
        NestedScrollView findViewById = finishActivity.findViewById(R.id.sv);
        findViewById.scrollTo(0, findViewById.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void savedLogObserver$lambda$2$lambda$1(FinishActivity finishActivity, View view) {
        Intrinsics.checkNotNullParameter(finishActivity, "this$0");
        finishActivity.copyTextToClipboard();
    }

    private final void copyTextToClipboard() {
        CharSequence text = ((TextView) findViewById(R.id.log_message)).getText();
        Object systemService = getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", text));
        Toast.makeText((Context) this, "Text copied to clipboard", 1).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}

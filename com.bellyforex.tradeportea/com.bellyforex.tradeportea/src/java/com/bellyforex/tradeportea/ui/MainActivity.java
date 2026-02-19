package com.bellyforex.tradeportea.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.db.LicenceDB;
import com.bellyforex.tradeportea.repository.RTRepository;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bellyforex/tradeportea/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "drawAllowed", "Landroidx/lifecycle/MutableLiveData;", "", "drawPass", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "open", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class MainActivity extends AppCompatActivity {
    private boolean drawPass;
    public Job job;
    private final MutableLiveData<Boolean> drawAllowed = new MutableLiveData<>();
    private final MutableLiveData<Boolean> open = new MutableLiveData<>();

    public final Job getJob() {
        Job job = this.job;
        if (job != null) {
            return job;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void setJob(Job job) {
        Intrinsics.checkNotNullParameter(job, "<set-?>");
        this.job = job;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        new RTRepository(LicenceDB.Companion.invoke((Context) this));
        getApplicationContext().getSharedPreferences("comp", 0);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this;
        this.drawAllowed.observe(lifecycleOwner, new MainActivity$sam$androidx_lifecycle_Observer$0(new MainActivity$onCreate$1(this)));
        this.open.observe(lifecycleOwner, new MainActivity$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.bellyforex.tradeportea.ui.MainActivity$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Boolean bool) {
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    Job.DefaultImpls.cancel$default(MainActivity.this.getJob(), (CancellationException) null, 1, (Object) null);
                    MainActivity.this.startActivity(new Intent((Context) MainActivity.this, HomeActivity.class));
                    MainActivity.this.finish();
                }
            }
        }));
        setJob(BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new MainActivity$onCreate$3(this, null), 3, (Object) null));
    }
}

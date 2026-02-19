package com.bellyforex.tradeportea;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bellyforex.tradeportea.network.db.LicenceDB;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.network.module.Signal;
import com.bellyforex.tradeportea.network.module.Signals;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.network.module.log;
import com.bellyforex.tradeportea.repository.RTRepository;
import com.bellyforex.tradeportea.ui.FinishActivity;
import com.bellyforex.tradeportea.ui.HomeActivity;
import com.bellyforex.tradeportea.ui.TradeActivity;
import com.bellyforex.tradeportea.utils.Constants;
import com.bellyforex.tradeportea.utils.Resource;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: ControlService.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020F2\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020FH\u0002J\u001c\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0#0\"2\u0006\u0010O\u001a\u00020IH\u0002J\u0014\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0#0\"H\u0002J\u0010\u0010Q\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020SH\u0002J\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\n0UJ\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020;0:2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020;0XH\u0002J\u000e\u0010Y\u001a\u00020\n2\u0006\u0010K\u001a\u00020LJ\u0014\u0010Z\u001a\u0004\u0018\u00010[2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\u0012\u0010^\u001a\u00020F2\b\u0010_\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010`\u001a\u00020FH\u0016J\"\u0010a\u001a\u00020\f2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020\fH\u0016J\u001c\u0010d\u001a\u00020\n2\b\u0010_\u001a\u0004\u0018\u00010\u00112\b\u0010e\u001a\u0004\u0018\u00010fH\u0016J\u0010\u0010g\u001a\u00020F2\u0006\u0010h\u001a\u000206H\u0002J\b\u0010i\u001a\u00020FH\u0002J\u0010\u0010j\u001a\u00020F2\u0006\u0010k\u001a\u00020IH\u0002J\u0010\u0010l\u001a\u00020F2\u0006\u0010m\u001a\u00020\fH\u0002J\"\u0010n\u001a\u0004\u0018\u00010>2\b\u0010o\u001a\u0004\u0018\u00010I2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0#H\u0002R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040#0\"X\u0082.¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060#0\"X\u0082.¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060#0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:09X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0#0%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0#0\"X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020>0#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082.¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/bellyforex/tradeportea/ControlService;", "Landroid/app/Service;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnClickListener;", "()V", "binder", "Lcom/bellyforex/tradeportea/ControlService$MyBinder;", "btnParams", "Landroid/view/WindowManager$LayoutParams;", "busy", "", "checkCount", "", "ea_nameModePref", "Landroid/content/SharedPreferences;", "ea_nameSharedPref", "floatingWindowView", "Landroid/view/View;", "initialTouchX", "", "initialTouchY", "initialX", "initialY", "isExpanded", "isMovingDisabled", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "lic", "Lcom/bellyforex/tradeportea/network/module/Sicence;", "licence", "Landroidx/lifecycle/LiveData;", "", "licenceObserver", "Landroidx/lifecycle/Observer;", "logged4", "logged5", "moving", "mt4SharedPref", "mt5SharedPref", "myPendingIntent", "Landroid/app/PendingIntent;", "myPendingIntent2", "myView", "pendingIntent", "pendingIntentMT4", "rtRepository", "Lcom/bellyforex/tradeportea/repository/RTRepository;", "savedLogData", "Lcom/bellyforex/tradeportea/network/module/log;", "savedSignalData", "Lcom/bellyforex/tradeportea/network/module/Signal;", "savedSignalObserver", "signalData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bellyforex/tradeportea/utils/Resource;", "Lcom/bellyforex/tradeportea/network/module/Signals;", "signalsObserver", "symbolObserver", "Lcom/bellyforex/tradeportea/network/module/Symbol;", "symbols", "trading", "useSymbols", "wait", "windowManager", "Landroid/view/WindowManager;", "addLogMessage", "", "id", "msg", "", "createNotificationChannel", "context", "Landroid/content/Context;", "createOverlay", "getSavedSymbols", "phone_secret_key", "getSelectedLicences", "getSignals", "authBody", "Lcom/bellyforex/tradeportea/network/module/AuthBody;", "getStatus", "Lkotlinx/coroutines/flow/Flow;", "handleSignalResponse", "response", "Lretrofit2/Response;", "isNetworkAvailable", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onClick", "view", "onDestroy", "onStartCommand", "flags", "startId", "onTouch", "event", "Landroid/view/MotionEvent;", "openMT", "signal", "resetVariable", "storeBotName", "botName", "storeMode", "mode", "testIfSymbolIsAllowed", "name", "MyBinder", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ControlService extends Service implements View.OnTouchListener, View.OnClickListener {
    private WindowManager.LayoutParams btnParams;
    private boolean busy;
    private int checkCount;
    private SharedPreferences ea_nameModePref;
    private SharedPreferences ea_nameSharedPref;
    private View floatingWindowView;
    private float initialTouchX;
    private float initialTouchY;
    private int initialX;
    private int initialY;
    private boolean isExpanded;
    private boolean isMovingDisabled;
    public Job job;
    private Sicence lic;
    private boolean logged4;
    private boolean logged5;
    private SharedPreferences mt4SharedPref;
    private SharedPreferences mt5SharedPref;
    private PendingIntent myPendingIntent;
    private PendingIntent myPendingIntent2;
    private View myView;
    private PendingIntent pendingIntent;
    private PendingIntent pendingIntentMT4;
    private LiveData<List<log>> savedLogData;
    private LiveData<List<Signal>> savedSignalData;
    private LiveData<List<Symbol>> symbols;
    private boolean trading;
    private boolean wait;
    private WindowManager windowManager;
    private final MyBinder binder = new MyBinder();
    private final RTRepository rtRepository = new RTRepository(LicenceDB.Companion.invoke(this));
    private final LiveData<List<Sicence>> licence = getSelectedLicences();
    private final MutableLiveData<Resource<Signals>> signalData = new MutableLiveData<>();
    private List<Symbol> useSymbols = CollectionsKt.emptyList();
    private Observer<List<Symbol>> symbolObserver = new Observer() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda0
        public final void onChanged(Object obj) {
            ControlService.symbolObserver$lambda$0(ControlService.this, (List) obj);
        }
    };
    private final Observer<List<Signal>> savedSignalObserver = new Observer() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda1
        public final void onChanged(Object obj) {
            ControlService.savedSignalObserver$lambda$4(ControlService.this, (List) obj);
        }
    };
    private final Observer<List<Sicence>> licenceObserver = new Observer() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda2
        public final void onChanged(Object obj) {
            ControlService.licenceObserver$lambda$5(ControlService.this, (List) obj);
        }
    };
    private final Observer<Resource<Signals>> signalsObserver = new Observer() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda3
        public final void onChanged(Object obj) {
            ControlService.signalsObserver$lambda$6(ControlService.this, (Resource) obj);
        }
    };
    private boolean moving = true;

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

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d("runnable", "service is bound");
        return this.binder;
    }

    /* compiled from: ControlService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bellyforex/tradeportea/ControlService$MyBinder;", "Landroid/os/Binder;", "(Lcom/bellyforex/tradeportea/ControlService;)V", "getService", "Lcom/bellyforex/tradeportea/ControlService;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public final class MyBinder extends Binder {
        public MyBinder() {
        }

        public final ControlService getService() {
            return ControlService.this;
        }
    }

    public final Flow<Boolean> getStatus() {
        return FlowKt.flow(new ControlService$getStatus$1(this, null));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PendingIntent activity;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        createNotificationChannel(applicationContext);
        resetVariable();
        createOverlay();
        ControlService controlService = this;
        Intent intent2 = new Intent(controlService, TradeActivity.class);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.ea_nameSharedPref = sharedPreferences;
        SharedPreferences sharedPreferences2 = getSharedPreferences("EANameModePrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        this.ea_nameModePref = sharedPreferences2;
        intent2.setFlags(4194304);
        if (Build.VERSION.SDK_INT >= 31) {
            activity = PendingIntent.getActivity(controlService, 0, intent2, 201326592);
            Intrinsics.checkNotNull(activity);
        } else {
            activity = PendingIntent.getActivity(controlService, 0, intent2, 134217728);
            Intrinsics.checkNotNull(activity);
        }
        this.pendingIntent = activity;
        this.trading = true;
        Log.d("runnable", "service is started");
        this.licence.observeForever(this.licenceObserver);
        this.signalData.observeForever(this.signalsObserver);
        this.savedLogData = this.rtRepository.getDBLogs();
        return 1;
    }

    private final void resetVariable() {
        this.busy = false;
        this.checkCount = 0;
        this.wait = false;
    }

    private final LiveData<List<Symbol>> getSavedSymbols(String str) {
        return this.rtRepository.getSavedSymbols(str);
    }

    private final LiveData<List<Sicence>> getSelectedLicences() {
        return this.rtRepository.getSicences();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void symbolObserver$lambda$0(ControlService controlService, List list) {
        Intrinsics.checkNotNullParameter(controlService, "this$0");
        Intrinsics.checkNotNullParameter(list, "it");
        controlService.useSymbols = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void savedSignalObserver$lambda$4(ControlService controlService, List list) {
        List split$default;
        Intrinsics.checkNotNullParameter(controlService, "this$0");
        Intrinsics.checkNotNullParameter(list, "it");
        if (!list.isEmpty()) {
            controlService.busy = true;
            if (!((Signal) list.get(0)).getUsed()) {
                String platform = ((Signal) list.get(0)).getPlatform();
                View view = null;
                String str = (platform == null || (split$default = StringsKt.split$default(platform, new String[]{":"}, false, 0, 6, (Object) null)) == null) ? null : (String) split$default.get(0);
                if (Intrinsics.areEqual(str, "MT5")) {
                    controlService.addLogMessage(0, ">>Automated Trading is in Progress, Please Do not Use your phone.");
                    controlService.openMT((Signal) list.get(0));
                    controlService.addLogMessage(0, ">>Opening MT5");
                    View view2 = controlService.myView;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("myView");
                    } else {
                        view = view2;
                    }
                    ((RelativeLayout) view.findViewById(R.id.autotrade)).setVisibility(8);
                    return;
                } else if (Intrinsics.areEqual(str, "MT4")) {
                    controlService.addLogMessage(0, ">>Automated Trading is in Progress, Please Do not Use your phone.");
                    controlService.openMT((Signal) list.get(0));
                    controlService.addLogMessage(0, ">>Opening MT4");
                    View view3 = controlService.myView;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("myView");
                    } else {
                        view = view3;
                    }
                    ((RelativeLayout) view.findViewById(R.id.autotrade)).setVisibility(8);
                    return;
                } else {
                    View view4 = controlService.myView;
                    if (view4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("myView");
                    } else {
                        view = view4;
                    }
                    TextView textView = (TextView) view.findViewById(R.id.note_text);
                    textView.setText(TextUtils.concat("Automated Trading Failed, please add a platform to this symbol."));
                    textView.setVisibility(0);
                    return;
                }
            }
            controlService.wait = true;
            controlService.checkCount = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void licenceObserver$lambda$5(ControlService controlService, List list) {
        Intrinsics.checkNotNullParameter(controlService, "this$0");
        Intrinsics.checkNotNullParameter(list, "data");
        if (!list.isEmpty()) {
            Sicence sicence = (Sicence) list.get(0);
            controlService.lic = sicence;
            if (sicence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lic");
                sicence = null;
            }
            LiveData<List<Symbol>> savedSymbols = controlService.getSavedSymbols(sicence.getPhone_secret_key());
            controlService.symbols = savedSymbols;
            if (savedSymbols == null) {
                Intrinsics.throwUninitializedPropertyAccessException("symbols");
                savedSymbols = null;
            }
            savedSymbols.observeForever(controlService.symbolObserver);
            controlService.setJob(BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new ControlService$licenceObserver$1$1(controlService, null), 3, (Object) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void signalsObserver$lambda$6(ControlService controlService, Resource resource) {
        boolean z;
        Intrinsics.checkNotNullParameter(controlService, "this$0");
        Intrinsics.checkNotNullParameter(resource, "data");
        if (resource instanceof Resource.Loading) {
            z = true;
        } else {
            if (!(resource instanceof Resource.Error)) {
                if (resource instanceof Resource.Success) {
                    if (resource.getData() != null && ((Signals) resource.getData()).getSignal() != null) {
                        Signal signal = ((Signals) resource.getData()).getSignal();
                        Symbol testIfSymbolIsAllowed = controlService.testIfSymbolIsAllowed(signal.getAsset(), controlService.useSymbols);
                        if (testIfSymbolIsAllowed != null && (Intrinsics.areEqual(signal.getAction(), testIfSymbolIsAllowed.getAction()) || Intrinsics.areEqual(testIfSymbolIsAllowed.getAction(), "BOTH"))) {
                            BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new ControlService$signalsObserver$1$1(signal, controlService, testIfSymbolIsAllowed, null), 3, (Object) null);
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            z = false;
        }
        controlService.busy = z;
    }

    private final void openMT(Signal signal) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("signal", signal);
        Intent intent = new Intent(this, TradeActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("signal", bundle);
        startActivity(intent);
    }

    private final Symbol testIfSymbolIsAllowed(String str, List<Symbol> list) {
        for (Symbol symbol : list) {
            if (Intrinsics.areEqual(str, symbol.getName())) {
                return symbol;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job getSignals(AuthBody authBody) {
        return BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new ControlService$getSignals$1(this, authBody, null), 3, (Object) null);
    }

    private final void addLogMessage(int i, String str) {
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new ControlService$addLogMessage$1(this, i, str, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Resource<Signals> handleSignalResponse(Response<Signals> response) {
        Signals signals;
        if (response.isSuccessful() && (signals = (Signals) response.body()) != null) {
            if (Intrinsics.areEqual(signals.getMessage(), "accept")) {
                return new Resource.Success(signals);
            }
            return new Resource.Error("Unknown Error Occurred!!", null, 2, null);
        }
        String message = response.message();
        Intrinsics.checkNotNullExpressionValue(message, "message(...)");
        return new Resource.Error(message, null, 2, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.trading = false;
        this.busy = false;
        this.useSymbols = CollectionsKt.emptyList();
        this.licence.removeObserver(this.licenceObserver);
        this.signalData.removeObserver(this.signalsObserver);
        LiveData<List<Symbol>> liveData = this.symbols;
        View view = null;
        if (liveData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbols");
            liveData = null;
        }
        liveData.removeObserver(this.symbolObserver);
        Job.DefaultImpls.cancel$default(getJob(), (CancellationException) null, 1, (Object) null);
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        View view2 = this.myView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myView");
        } else {
            view = view2;
        }
        windowManager.removeView(view);
        resetVariable();
        Log.d("runnable", "service stopped");
        stopSelf();
    }

    private final void createNotificationChannel(Context context) {
        PendingIntent activity;
        PendingIntent activity2;
        NotificationChannel notificationChannel = new NotificationChannel("RoboTrader", "Robo Trader", 2);
        notificationChannel.setLightColor(-16776961);
        notificationChannel.setImportance(2);
        notificationChannel.setLockscreenVisibility(1);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        intent.setFlags(268435456);
        if (Build.VERSION.SDK_INT >= 31) {
            activity = PendingIntent.getActivity(this, 0, intent, 201326592);
            Intrinsics.checkNotNull(activity);
        } else {
            activity = PendingIntent.getActivity(this, 0, intent, 134217728);
            Intrinsics.checkNotNull(activity);
        }
        this.myPendingIntent = activity;
        ControlService controlService = this;
        Intent intent2 = new Intent(controlService, FinishActivity.class);
        intent2.setFlags(268435456);
        if (Build.VERSION.SDK_INT >= 31) {
            activity2 = PendingIntent.getActivity(controlService, 0, intent2, 201326592);
            Intrinsics.checkNotNull(activity2);
        } else {
            activity2 = PendingIntent.getActivity(controlService, 0, intent2, 134217728);
            Intrinsics.checkNotNull(activity2);
        }
        this.myPendingIntent2 = activity2;
        Notification build = new NotificationCompat.Builder(controlService, "RoboTrader").setOngoing(true).setSmallIcon(R.mipmap.ic_launcher).setPriority(-2).setCategory("service").setContentTitle("TradePortEA is Active").setContentText("Connected Robot will trade for you.").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        startForeground(1, build);
    }

    private final void createOverlay() {
        Object systemService = getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        Object systemService2 = getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
        WindowManager.LayoutParams layoutParams = null;
        View inflate = ((LayoutInflater) systemService2).inflate(R.layout.info_layout, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.myView = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myView");
            inflate = null;
        }
        inflate.setOnTouchListener(this);
        View view = this.myView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myView");
            view = null;
        }
        view.setOnClickListener(this);
        View view2 = this.myView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myView");
            view2 = null;
        }
        ((Button) view2.findViewById(R.id.force_stop)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ControlService.createOverlay$lambda$9(view3);
            }
        });
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, 2038, 136, -3);
        this.btnParams = layoutParams2;
        layoutParams2.gravity = 49;
        WindowManager.LayoutParams layoutParams3 = this.btnParams;
        if (layoutParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnParams");
            layoutParams3 = null;
        }
        layoutParams3.x = 0;
        WindowManager.LayoutParams layoutParams4 = this.btnParams;
        if (layoutParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnParams");
            layoutParams4 = null;
        }
        layoutParams4.y = 0;
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        View view3 = this.myView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myView");
            view3 = null;
        }
        WindowManager.LayoutParams layoutParams5 = this.btnParams;
        if (layoutParams5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnParams");
        } else {
            layoutParams = layoutParams5;
        }
        windowManager.addView(view3, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createOverlay$lambda$9(View view) {
        Process.killProcess(Process.myPid());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Sicence sicence = this.lic;
        View view2 = null;
        WindowManager.LayoutParams layoutParams = null;
        if (sicence == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lic");
            sicence = null;
        }
        storeBotName(sicence.getEa_name());
        if (this.isMovingDisabled) {
            return true;
        }
        Intrinsics.checkNotNull(view);
        view.performClick();
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            WindowManager.LayoutParams layoutParams2 = this.btnParams;
            if (layoutParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                layoutParams2 = null;
            }
            this.initialX = layoutParams2.x;
            WindowManager.LayoutParams layoutParams3 = this.btnParams;
            if (layoutParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnParams");
            } else {
                layoutParams = layoutParams3;
            }
            this.initialY = layoutParams.y;
            this.initialTouchX = motionEvent.getRawX();
            this.initialTouchY = motionEvent.getRawY();
            this.moving = true;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            this.moving = false;
        } else if (valueOf != null && valueOf.intValue() == 2 && this.moving) {
            WindowManager.LayoutParams layoutParams4 = this.btnParams;
            if (layoutParams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                layoutParams4 = null;
            }
            layoutParams4.x = this.initialX + ((int) (motionEvent.getRawX() - this.initialTouchX));
            WindowManager.LayoutParams layoutParams5 = this.btnParams;
            if (layoutParams5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                layoutParams5 = null;
            }
            layoutParams5.y = this.initialY + ((int) (motionEvent.getRawY() - this.initialTouchY));
            WindowManager windowManager = this.windowManager;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                windowManager = null;
            }
            View view3 = this.myView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myView");
                view3 = null;
            }
            WindowManager.LayoutParams layoutParams6 = this.btnParams;
            if (layoutParams6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                layoutParams6 = null;
            }
            windowManager.updateViewLayout(view3, layoutParams6);
            if (this.isExpanded) {
                WindowManager.LayoutParams layoutParams7 = new WindowManager.LayoutParams(-2, -2, 2038, 8, -3);
                layoutParams7.gravity = 49;
                WindowManager.LayoutParams layoutParams8 = this.btnParams;
                if (layoutParams8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                    layoutParams8 = null;
                }
                layoutParams7.x = layoutParams8.x;
                WindowManager.LayoutParams layoutParams9 = this.btnParams;
                if (layoutParams9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                    layoutParams9 = null;
                }
                int i = layoutParams9.y;
                View view4 = this.myView;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("myView");
                    view4 = null;
                }
                layoutParams7.y = i + view4.getHeight();
                WindowManager windowManager2 = this.windowManager;
                if (windowManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                    windowManager2 = null;
                }
                View view5 = this.floatingWindowView;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                } else {
                    view2 = view5;
                }
                windowManager2.updateViewLayout(view2, layoutParams7);
            }
        }
        return true;
    }

    public final boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View view2;
        String str;
        int i;
        Typeface typeface;
        List list;
        View view3;
        View view4;
        SharedPreferences sharedPreferences = getSharedPreferences("mt4", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.mt4SharedPref = sharedPreferences;
        SharedPreferences sharedPreferences2 = getSharedPreferences("mt5", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        this.mt5SharedPref = sharedPreferences2;
        SharedPreferences sharedPreferences3 = this.mt4SharedPref;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
            sharedPreferences3 = null;
        }
        boolean z = sharedPreferences3.getBoolean("logged", false);
        SharedPreferences sharedPreferences4 = this.mt5SharedPref;
        if (sharedPreferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
            sharedPreferences4 = null;
        }
        boolean z2 = sharedPreferences4.getBoolean("logged", false);
        LiveData<List<Symbol>> liveData = this.symbols;
        if (liveData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbols");
            liveData = null;
        }
        List list2 = (List) liveData.getValue();
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        if (this.moving) {
            return;
        }
        if (!this.isExpanded) {
            Object systemService = getSystemService("power");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            ((PowerManager) systemService).newWakeLock(1, "MyWakeLock");
            WindowManager.LayoutParams layoutParams = this.btnParams;
            if (layoutParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                layoutParams = null;
            }
            int i2 = layoutParams.x;
            WindowManager.LayoutParams layoutParams2 = this.btnParams;
            if (layoutParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnParams");
                layoutParams2 = null;
            }
            int i3 = layoutParams2.y;
            ControlService controlService = this;
            View inflate = LayoutInflater.from(controlService).inflate(R.layout.floating_window, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            this.floatingWindowView = inflate;
            if (inflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                inflate = null;
            }
            View findViewById = inflate.findViewById(R.id.closeButton);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            ((Button) findViewById).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    ControlService.onClick$lambda$10(ControlService.this, view5);
                }
            });
            View view5 = this.floatingWindowView;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view5 = null;
            }
            View findViewById2 = view5.findViewById(R.id.statusButton);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            Button button = (Button) findViewById2;
            View view6 = this.floatingWindowView;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view6 = null;
            }
            View findViewById3 = view6.findViewById(R.id.accountButton);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            final Button button2 = (Button) findViewById3;
            View view7 = this.floatingWindowView;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view7 = null;
            }
            View findViewById4 = view7.findViewById(R.id.internetStatus);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            final Button button3 = (Button) findViewById4;
            View view8 = this.floatingWindowView;
            if (view8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view8 = null;
            }
            View findViewById5 = view8.findViewById(R.id.allowedSymbols);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            final Button button4 = (Button) findViewById5;
            View view9 = this.floatingWindowView;
            if (view9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view9 = null;
            }
            View findViewById6 = view9.findViewById(R.id.executeButton);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
            final Button button5 = (Button) findViewById6;
            View view10 = this.floatingWindowView;
            if (view10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                str = "windowManager";
                view10 = null;
            } else {
                str = "windowManager";
            }
            View findViewById7 = view10.findViewById(R.id.modeb);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
            final Button button6 = (Button) findViewById7;
            int color = ContextCompat.getColor(controlService, R.color.black);
            ContextCompat.getDrawable(controlService, R.drawable.ic_baseline_cancel_23);
            this.logged4 = z;
            this.logged5 = z2;
            if (z || z2) {
                i = 1;
                typeface = null;
            } else {
                button2.setTextColor(color);
                i = 1;
                typeface = null;
                button2.setTypeface(null, 1);
            }
            if (!isNetworkAvailable(controlService)) {
                button3.setTextColor(color);
                button3.setTypeface(typeface, i);
            }
            if ((list2.isEmpty() ^ i) != 0) {
                button4.setText(CollectionsKt.joinToString$default(list2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<Symbol, CharSequence>() { // from class: com.bellyforex.tradeportea.ControlService$onClick$2
                    public final CharSequence invoke(Symbol symbol) {
                        Intrinsics.checkNotNullParameter(symbol, "it");
                        return symbol.getName();
                    }
                }, 30, (Object) null));
            } else {
                button4.setTextColor(color);
                button4.setTypeface(null, 1);
                button4.setText(" NO QUOTES SELECTED");
            }
            final Handler handler = new Handler(Looper.getMainLooper());
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            button.setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view11) {
                    ControlService.onClick$lambda$13(booleanRef, button2, r3, button3, r6, button4, button5, handler, view11);
                }
            });
            final Ref.IntRef intRef = new Ref.IntRef();
            SharedPreferences sharedPreferences5 = this.ea_nameModePref;
            if (sharedPreferences5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ea_nameModePref");
                sharedPreferences5 = null;
            }
            intRef.element = sharedPreferences5.getInt("mode", 1);
            button6.setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view11) {
                    ControlService.onClick$lambda$14(intRef, button6, this, view11);
                }
            });
            if (!(!list.isEmpty()) || !isNetworkAvailable(controlService) || (!this.logged4 && !this.logged5)) {
                button5.setText("BOT NOT ACTIVE");
                button5.setTextColor(ContextCompat.getColor(controlService, R.color.black));
                button5.setTypeface(null, 1);
            }
            View view11 = this.floatingWindowView;
            if (view11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view11 = null;
            }
            View findViewById8 = view11.findViewById(R.id.owner_name);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
            TextView textView = (TextView) findViewById8;
            View view12 = this.floatingWindowView;
            if (view12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view12 = null;
            }
            View findViewById9 = view12.findViewById(R.id.bot_name);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
            TextView textView2 = (TextView) findViewById9;
            View view13 = this.floatingWindowView;
            if (view13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view13 = null;
            }
            View findViewById10 = view13.findViewById(R.id.logo_img);
            Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
            ImageView imageView = (ImageView) findViewById10;
            Sicence sicence = this.lic;
            if (sicence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lic");
                sicence = null;
            }
            textView.setText(sicence.getOwner().getName());
            Sicence sicence2 = this.lic;
            if (sicence2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lic");
                sicence2 = null;
            }
            textView2.setText(sicence2.getEa_name());
            Sicence sicence3 = this.lic;
            if (sicence3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lic");
                sicence3 = null;
            }
            if (Intrinsics.areEqual(sicence3.getOwner().getLogo(), "none")) {
                view3 = null;
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_circle_right_24, null));
            } else {
                view3 = null;
                RequestManager with = Glide.with(controlService);
                Sicence sicence4 = this.lic;
                if (sicence4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lic");
                    sicence4 = null;
                }
                with.load(Constants.LOGO_BASE_URL + sicence4.getOwner().getLogo()).placeholder(R.drawable.ic_baseline_arrow_circle_right_24).optionalCircleCrop().into(imageView);
                imageView.setBackgroundResource(17170445);
            }
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-2, -2, 2038, 8, -3);
            layoutParams3.gravity = 48;
            layoutParams3.x = i2;
            View view14 = this.myView;
            if (view14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myView");
                view14 = view3;
            }
            layoutParams3.y = i3 + view14.getHeight();
            WindowManager windowManager = this.windowManager;
            WindowManager windowManager2 = windowManager;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                windowManager2 = view3;
            }
            View view15 = this.floatingWindowView;
            if (view15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
                view4 = view3;
            } else {
                view4 = view15;
            }
            windowManager2.addView(view4, layoutParams3);
            this.isExpanded = true;
            return;
        }
        WindowManager windowManager3 = this.windowManager;
        if (windowManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager3 = null;
        }
        View view16 = this.floatingWindowView;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
            view2 = null;
        } else {
            view2 = view16;
        }
        windowManager3.removeView(view2);
        this.isExpanded = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$10(ControlService controlService, View view) {
        Intrinsics.checkNotNullParameter(controlService, "this$0");
        WindowManager windowManager = controlService.windowManager;
        View view2 = null;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        View view3 = controlService.floatingWindowView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingWindowView");
        } else {
            view2 = view3;
        }
        windowManager.removeView(view2);
        controlService.isExpanded = false;
    }

    private static final void onClick$lambda$13$showButtonWithDelay(Handler handler, final Button button, long j) {
        handler.postDelayed(new Runnable() { // from class: com.bellyforex.tradeportea.ControlService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ControlService.onClick$lambda$13$showButtonWithDelay$lambda$11(button);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$13$showButtonWithDelay$lambda$11(Button button) {
        Intrinsics.checkNotNullParameter(button, "$button");
        button.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$13$hideButtonWithDelay$lambda$12(Button button) {
        Intrinsics.checkNotNullParameter(button, "$button");
        button.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$13(Ref.BooleanRef booleanRef, Button button, long j, Button button2, long j2, Button button3, Button button4, Handler handler, View view) {
        Intrinsics.checkNotNullParameter(booleanRef, "$areButtonsVisible");
        Intrinsics.checkNotNullParameter(button, "$accountButton");
        Intrinsics.checkNotNullParameter(button2, "$internetStatus");
        Intrinsics.checkNotNullParameter(button3, "$allowedSymbols");
        Intrinsics.checkNotNullParameter(button4, "$executeButton");
        Intrinsics.checkNotNullParameter(handler, "$handler");
        if (!booleanRef.element) {
            onClick$lambda$13$showButtonWithDelay(handler, button, j);
            onClick$lambda$13$showButtonWithDelay(handler, button2, j + j2);
            onClick$lambda$13$showButtonWithDelay(handler, button3, (2 * j2) + j);
            onClick$lambda$13$showButtonWithDelay(handler, button4, j + (3 * j2));
            booleanRef.element = true;
            return;
        }
        button.setVisibility(8);
        button2.setVisibility(8);
        button3.setVisibility(8);
        button4.setVisibility(8);
        booleanRef.element = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$14(Ref.IntRef intRef, Button button, ControlService controlService, View view) {
        Intrinsics.checkNotNullParameter(intRef, "$mode");
        Intrinsics.checkNotNullParameter(button, "$modeB");
        Intrinsics.checkNotNullParameter(controlService, "this$0");
        int i = intRef.element;
        if (i == 1) {
            button.setText("Dynamic");
            intRef.element = 2;
            controlService.storeMode(intRef.element);
            button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (i == 2) {
            button.setText("Intense");
            intRef.element = 3;
            controlService.storeMode(intRef.element);
            button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (i == 3) {
            button.setText("Normal");
            intRef.element = 1;
            controlService.storeMode(intRef.element);
            button.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        button.setVisibility(0);
    }

    private final void storeBotName(String str) {
        SharedPreferences sharedPreferences = this.ea_nameSharedPref;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ea_nameSharedPref");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("ea_name", str);
        edit.apply();
    }

    private final void storeMode(int i) {
        SharedPreferences sharedPreferences = this.ea_nameModePref;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ea_nameModePref");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("mode", i);
        edit.apply();
    }
}

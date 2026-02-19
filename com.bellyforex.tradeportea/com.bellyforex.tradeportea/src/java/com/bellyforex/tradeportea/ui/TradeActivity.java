package com.bellyforex.tradeportea.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.db.LicenceDB;
import com.bellyforex.tradeportea.network.module.Signal;
import com.bellyforex.tradeportea.network.module.log;
import com.bellyforex.tradeportea.repository.RTRepository;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: TradeActivity.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001GB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)2\u0006\u00104\u001a\u000205H\u0002J\u0012\u00106\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0014Jm\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;2\u0006\u00103\u001a\u0002052\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u0002052\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\u0006\u0010A\u001a\u0002052\u0006\u0010B\u001a\u0002052\b\u0010C\u001a\u0004\u0018\u0001052\b\u0010D\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010EJm\u0010F\u001a\u0002022\u0006\u0010:\u001a\u00020;2\u0006\u00103\u001a\u0002052\u0006\u0010<\u001a\u0002052\u0006\u0010=\u001a\u0002052\u0006\u0010>\u001a\u0002052\b\u0010?\u001a\u0004\u0018\u0001052\b\u0010@\u001a\u0004\u0018\u0001052\u0006\u0010A\u001a\u0002052\u0006\u0010B\u001a\u0002052\b\u0010C\u001a\u0004\u0018\u0001052\b\u0010D\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0002\u0010ER\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0!0 X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0!0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/bellyforex/tradeportea/ui/TradeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "chatLoading", "", "chechDisc", "checkEmsg", "chooseSymbol", "ea_nameModePref", "Landroid/content/SharedPreferences;", "ea_nameSharedPref", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "job2", "getJob2", "setJob2", "loading", "loggedIn", "mt4SharedPref", "mt5SharedPref", "mySig", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bellyforex/tradeportea/network/module/Signal;", "obData", "pressExecuteTrade", "rtRepository", "Lcom/bellyforex/tradeportea/repository/RTRepository;", "savedLogData", "Landroidx/lifecycle/LiveData;", "", "Lcom/bellyforex/tradeportea/network/module/log;", "savedLogObserver", "Landroidx/lifecycle/Observer;", "savedSignalData", "savedSignalObserver", "showAllSymbols", "symbolCount", "", "timer1", "Landroid/os/CountDownTimer;", "getTimer1", "()Landroid/os/CountDownTimer;", "setTimer1", "(Landroid/os/CountDownTimer;)V", "trade", "addLogMessage", "", "id", "msg", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "tradeMT4", "webView", "Landroid/webkit/WebView;", "password", "server", "asset", "tp", "sl", "volume", "action", "botname", "numberOfTrades", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "tradeMT5", "TradeDetails", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class TradeActivity extends AppCompatActivity {
    private boolean checkEmsg;
    private boolean chooseSymbol;
    private SharedPreferences ea_nameModePref;
    private SharedPreferences ea_nameSharedPref;
    public Job job;
    public Job job2;
    private boolean loading;
    private boolean loggedIn;
    private SharedPreferences mt4SharedPref;
    private SharedPreferences mt5SharedPref;
    private boolean pressExecuteTrade;
    private LiveData<List<log>> savedLogData;
    private LiveData<List<Signal>> savedSignalData;
    private boolean showAllSymbols;
    private int symbolCount;
    public CountDownTimer timer1;
    private boolean chechDisc = true;
    private boolean trade = true;
    private boolean chatLoading = true;
    private final RTRepository rtRepository = new RTRepository(LicenceDB.Companion.invoke((Context) this));
    private MutableLiveData<Signal> mySig = new MutableLiveData<>();
    private boolean obData = true;
    private final Observer<List<log>> savedLogObserver = new Observer() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$$ExternalSyntheticLambda1
        public final void onChanged(Object obj) {
            TradeActivity.savedLogObserver$lambda$2(TradeActivity.this, (List) obj);
        }
    };
    private final Observer<List<Signal>> savedSignalObserver = new Observer() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$$ExternalSyntheticLambda2
        public final void onChanged(Object obj) {
            TradeActivity.savedSignalObserver$lambda$3(TradeActivity.this, (List) obj);
        }
    };

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

    public final Job getJob2() {
        Job job = this.job2;
        if (job != null) {
            return job;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job2");
        return null;
    }

    public final void setJob2(Job job) {
        Intrinsics.checkNotNullParameter(job, "<set-?>");
        this.job2 = job;
    }

    public final CountDownTimer getTimer1() {
        CountDownTimer countDownTimer = this.timer1;
        if (countDownTimer != null) {
            return countDownTimer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("timer1");
        return null;
    }

    public final void setTimer1(CountDownTimer countDownTimer) {
        Intrinsics.checkNotNullParameter(countDownTimer, "<set-?>");
        this.timer1 = countDownTimer;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.bellyforex.tradeportea.ui.TradeActivity$onCreate$1] */
    protected void onCreate(Bundle bundle) {
        Integer intOrNull;
        super.onCreate(bundle);
        setContentView(R.layout.activity_trade);
        LiveData<List<Signal>> dBSignals = this.rtRepository.getDBSignals();
        this.savedSignalData = dBSignals;
        if (dBSignals == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savedSignalData");
            dBSignals = null;
        }
        dBSignals.observeForever(this.savedSignalObserver);
        LiveData<List<log>> dBLogs = this.rtRepository.getDBLogs();
        this.savedLogData = dBLogs;
        if (dBLogs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savedLogData");
            dBLogs = null;
        }
        dBLogs.observeForever(this.savedLogObserver);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.ea_nameSharedPref = sharedPreferences;
        final Ref.IntRef intRef = new Ref.IntRef();
        SharedPreferences sharedPreferences2 = getSharedPreferences("mt4", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        this.mt4SharedPref = sharedPreferences2;
        SharedPreferences sharedPreferences3 = getSharedPreferences("mt5", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getSharedPreferences(...)");
        this.mt5SharedPref = sharedPreferences3;
        CookieSyncManager.createInstance(getApplicationContext());
        CookieManager cookieManager = CookieManager.getInstance();
        Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
        cookieManager.removeAllCookies(null);
        this.obData = false;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = 100;
        CountDownTimer start = new CountDownTimer() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(100000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                Ref.IntRef intRef3 = intRef2;
                intRef3.element--;
                int i = intRef.element;
                intRef.element++;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.addLogMessage(0, "Time's Up. There was an unknown error preventing trade to take place. Please Check your network connection.");
                TradeActivity tradeActivity = this;
                tradeActivity.addLogMessage(1, ((TextView) tradeActivity.findViewById(R.id.log_message)).getText().toString());
                Job.DefaultImpls.cancel$default(this.getJob(), (CancellationException) null, 1, (Object) null);
                Job.DefaultImpls.cancel$default(this.getJob2(), (CancellationException) null, 1, (Object) null);
                this.startActivity(new Intent((Context) this, FinishActivity.class));
                this.finish();
            }
        }.start();
        Intrinsics.checkNotNullExpressionValue(start, "start(...)");
        setTimer1(start);
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.requestFocus();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setCacheMode(1);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSaveFormData(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        Bundle bundleExtra = getIntent().getBundleExtra("signal");
        Serializable serializable = bundleExtra != null ? bundleExtra.getSerializable("signal") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.bellyforex.tradeportea.network.module.Signal");
        Signal signal = (Signal) serializable;
        List split$default = StringsKt.split$default(StringsKt.trim(String.valueOf(signal.getPlatform())).toString(), new String[]{":"}, false, 0, 6, (Object) null);
        Object obj = split$default.get(0);
        String str = (String) CollectionsKt.getOrNull(split$default, 1);
        Pair pair = TuplesKt.to(obj, Integer.valueOf((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue()));
        String str2 = (String) pair.component1();
        int intValue = ((Number) pair.component2()).intValue();
        if (Intrinsics.areEqual(str2, "MT5")) {
            SharedPreferences sharedPreferences4 = this.mt5SharedPref;
            if (sharedPreferences4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
                sharedPreferences4 = null;
            }
            String string = sharedPreferences4.getString("login", null);
            SharedPreferences sharedPreferences5 = this.mt5SharedPref;
            if (sharedPreferences5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
                sharedPreferences5 = null;
            }
            String string2 = sharedPreferences5.getString("password", null);
            SharedPreferences sharedPreferences6 = this.mt5SharedPref;
            if (sharedPreferences6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
                sharedPreferences6 = null;
            }
            String string3 = sharedPreferences6.getString("server", null);
            SharedPreferences sharedPreferences7 = this.ea_nameSharedPref;
            if (sharedPreferences7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ea_nameSharedPref");
                sharedPreferences7 = null;
            }
            String string4 = sharedPreferences7.getString("ea_name", "Default Value");
            if (string != null && string2 != null && string3 != null) {
                webView.setFocusableInTouchMode(true);
                webView.setFocusable(true);
                Intrinsics.checkNotNull(webView);
                tradeMT5(webView, string, string2, string3, signal.getAsset(), signal.getTp(), signal.getSl(), String.valueOf(signal.getLotSize()), signal.getAction(), string4, Integer.valueOf(intValue));
            } else {
                addLogMessage(0, "Opps it seems like you did not add your MT5 Login details. Please press metatrader and add them.");
                addLogMessage(1, "Opps it seems like you did not add your MT4 Login details. Please press metatrader and add them.");
                startActivity(new Intent((Context) this, FinishActivity.class));
                finish();
            }
        } else if (Intrinsics.areEqual(str2, "MT4")) {
            SharedPreferences sharedPreferences8 = this.mt4SharedPref;
            if (sharedPreferences8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
                sharedPreferences8 = null;
            }
            String string5 = sharedPreferences8.getString("login", null);
            SharedPreferences sharedPreferences9 = this.mt4SharedPref;
            if (sharedPreferences9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
                sharedPreferences9 = null;
            }
            String string6 = sharedPreferences9.getString("password", null);
            SharedPreferences sharedPreferences10 = this.mt4SharedPref;
            if (sharedPreferences10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
                sharedPreferences10 = null;
            }
            String string7 = sharedPreferences10.getString("server", null);
            SharedPreferences sharedPreferences11 = this.ea_nameSharedPref;
            if (sharedPreferences11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ea_nameSharedPref");
                sharedPreferences11 = null;
            }
            String string8 = sharedPreferences11.getString("ea_name", "Default Value");
            if (string5 != null && string6 != null && string7 != null) {
                webView.setFocusableInTouchMode(false);
                webView.setFocusable(false);
                String obj2 = StringsKt.trim(string7).toString();
                String obj3 = StringsKt.trim(string5).toString();
                String obj4 = StringsKt.trim(string6).toString();
                Intrinsics.checkNotNull(webView);
                tradeMT4(webView, obj3, obj4, obj2, signal.getAsset(), signal.getTp(), signal.getSl(), String.valueOf(signal.getLotSize()), signal.getAction(), string8, Integer.valueOf(intValue));
            } else {
                addLogMessage(0, "Opps it seems like you did not add your MT4 Login details. Please press metatrader and add them.");
                addLogMessage(1, "Opps it seems like you did not add your MT4 Login details. Please press metatrader and add them.");
                startActivity(new Intent((Context) this, FinishActivity.class));
                finish();
            }
        } else {
            Job.DefaultImpls.cancel$default(getJob(), (CancellationException) null, 1, (Object) null);
            Job.DefaultImpls.cancel$default(getJob2(), (CancellationException) null, 1, (Object) null);
            finish();
        }
        setJob(BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new TradeActivity$onCreate$3(this, null), 3, (Object) null));
        ((Button) findViewById(R.id.force_stop)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TradeActivity.onCreate$lambda$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(View view) {
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addLogMessage(int i, String str) {
        BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new TradeActivity$addLogMessage$1(this, str, i, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void savedLogObserver$lambda$2(TradeActivity tradeActivity, List list) {
        Intrinsics.checkNotNullParameter(tradeActivity, "this$0");
        Intrinsics.checkNotNullParameter(list, "it");
        if (!list.isEmpty()) {
            ((TextView) tradeActivity.findViewById(R.id.log_message)).setText(TextUtils.concat(((TextView) tradeActivity.findViewById(R.id.log_message)).getText().toString(), "\n", ((log) list.get(0)).getMessage()).toString());
            NestedScrollView findViewById = tradeActivity.findViewById(R.id.sv);
            findViewById.scrollTo(0, findViewById.getBottom());
            return;
        }
        ((TextView) tradeActivity.findViewById(R.id.log_message)).setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void savedSignalObserver$lambda$3(TradeActivity tradeActivity, List list) {
        Intrinsics.checkNotNullParameter(tradeActivity, "this$0");
        Intrinsics.checkNotNullParameter(list, "it");
        if (!list.isEmpty()) {
            if (!((Signal) list.get(0)).getUsed()) {
                tradeActivity.mySig.postValue(list.get(0));
            } else {
                tradeActivity.mySig.postValue((Object) null);
            }
        }
    }

    /* compiled from: TradeActivity.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/bellyforex/tradeportea/ui/TradeActivity$TradeDetails;", "", "lot", "", "tp", "sl", "symbol", "action", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getLot", "getSl", "getSymbol", "getTp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public static final class TradeDetails {
        private final String action;
        private final String lot;
        private final String sl;
        private final String symbol;
        private final String tp;

        public static /* synthetic */ TradeDetails copy$default(TradeDetails tradeDetails, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tradeDetails.lot;
            }
            if ((i & 2) != 0) {
                str2 = tradeDetails.tp;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = tradeDetails.sl;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = tradeDetails.symbol;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = tradeDetails.action;
            }
            return tradeDetails.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.lot;
        }

        public final String component2() {
            return this.tp;
        }

        public final String component3() {
            return this.sl;
        }

        public final String component4() {
            return this.symbol;
        }

        public final String component5() {
            return this.action;
        }

        public final TradeDetails copy(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "lot");
            Intrinsics.checkNotNullParameter(str4, "symbol");
            Intrinsics.checkNotNullParameter(str5, "action");
            return new TradeDetails(str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TradeDetails) {
                TradeDetails tradeDetails = (TradeDetails) obj;
                return Intrinsics.areEqual(this.lot, tradeDetails.lot) && Intrinsics.areEqual(this.tp, tradeDetails.tp) && Intrinsics.areEqual(this.sl, tradeDetails.sl) && Intrinsics.areEqual(this.symbol, tradeDetails.symbol) && Intrinsics.areEqual(this.action, tradeDetails.action);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.lot.hashCode() * 31;
            String str = this.tp;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sl;
            return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.symbol.hashCode()) * 31) + this.action.hashCode();
        }

        public String toString() {
            String str = this.lot;
            String str2 = this.tp;
            String str3 = this.sl;
            String str4 = this.symbol;
            return "TradeDetails(lot=" + str + ", tp=" + str2 + ", sl=" + str3 + ", symbol=" + str4 + ", action=" + this.action + ")";
        }

        public TradeDetails(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "lot");
            Intrinsics.checkNotNullParameter(str4, "symbol");
            Intrinsics.checkNotNullParameter(str5, "action");
            this.lot = str;
            this.tp = str2;
            this.sl = str3;
            this.symbol = str4;
            this.action = str5;
        }

        public final String getLot() {
            return this.lot;
        }

        public final String getTp() {
            return this.tp;
        }

        public final String getSl() {
            return this.sl;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getAction() {
            return this.action;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void tradeMT5(WebView webView, String str, String str2, String str3, final String str4, final String str5, final String str6, String str7, final String str8, String str9, Integer num) {
        Integer num2;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        final Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        String str10;
        Ref.ObjectRef objectRef7;
        Ref.ObjectRef objectRef8;
        Ref.ObjectRef objectRef9;
        Ref.ObjectRef objectRef10;
        String str11;
        String str12;
        Ref.ObjectRef objectRef11;
        Ref.ObjectRef objectRef12;
        Ref.ObjectRef objectRef13;
        Ref.ObjectRef objectRef14;
        Ref.ObjectRef objectRef15;
        SharedPreferences sharedPreferences = getSharedPreferences("EANameModePrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.ea_nameModePref = sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ea_nameModePref");
            sharedPreferences = null;
        }
        int i = sharedPreferences.getInt("mode", 1);
        addLogMessage(0, "Setting up MT5...");
        if (i != 1) {
            num2 = i != 2 ? i != 3 ? 1 : 15 : 10;
        } else {
            num2 = num;
        }
        Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
        objectRef16.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str2 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
        Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
        objectRef17.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
        Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
        objectRef18.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
        Ref.ObjectRef objectRef19 = new Ref.ObjectRef();
        objectRef19.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null) {\n        var text = symbolSpan.innerText.trim();\n        if (text === '" + str4 + "' || text === '" + str4 + ".mic') {\n            symbolSpan.click();\n            true;\n        } else {\n            false;\n        }\n    } else {\n        false;\n    }\n";
        Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
        objectRef20.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = '" + str4 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
        TradeDetails tradeDetails = new TradeDetails(str7, str5, str6, str4, str8);
        Ref.ObjectRef objectRef21 = new Ref.ObjectRef();
        objectRef21.element = "\njavascript: \n// Find the volume input element\nvar volumeInput = document.querySelector('.trade-input input[type=\"text\"]');\nif (volumeInput !== null) {\n    volumeInput.value = 0.00;\n    volumeInput.value = " + tradeDetails.getLot() + "||" + str7 + ";\n    volumeInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the stop loss input element\nvar stopLossInput = document.querySelector('.sl input[type=\"text\"]');\nif (stopLossInput !== null) {\n    stopLossInput.value = " + tradeDetails.getSl() + "||" + str6 + " ;\n    stopLossInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the take profit input element\nvar takeProfitInput = document.querySelector('.tp input[type=\"text\"]');\nif (takeProfitInput !== null) {\n    takeProfitInput.value = " + tradeDetails.getTp() + "||" + str5 + ";\n    takeProfitInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the comment input element\nvar commentInput = document.querySelector('.input.svelte-1d8k9kk input[type=\"text\"]');\nif (commentInput !== null) {\n    commentInput.value = '" + str9 + "';\n    commentInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\nif(takeProfitInput.value == null || stopLossInput == null || volumeInput.value == null || commentInput.value == null)\n{\n     false;\n}\nelse\n{\n     true;\n}\n";
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -2079013787:
                objectRef = objectRef16;
                objectRef2 = objectRef19;
                objectRef3 = objectRef20;
                objectRef4 = objectRef18;
                objectRef5 = objectRef17;
                objectRef6 = objectRef21;
                if (lowerCase.equals("derivsvg-server-02")) {
                    webView.loadUrl("https://mt5-real02-web-svg.deriv.com/terminal");
                    break;
                }
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case -2079013786:
                objectRef = objectRef16;
                objectRef2 = objectRef19;
                objectRef3 = objectRef20;
                objectRef4 = objectRef18;
                objectRef5 = objectRef17;
                objectRef6 = objectRef21;
                if (lowerCase.equals("derivsvg-server-03")) {
                    webView.loadUrl("https://mt5-real03-web-svg.deriv.com/terminal");
                    break;
                }
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case -1985250416:
                objectRef = objectRef16;
                objectRef5 = objectRef17;
                if (!lowerCase.equals("razormarkets-live")) {
                    objectRef4 = objectRef18;
                    objectRef3 = objectRef20;
                    objectRef2 = objectRef19;
                    objectRef6 = objectRef21;
                    webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                    break;
                } else {
                    webView.loadUrl("https://webtrader.razormarkets.co.za/terminal");
                    objectRef.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str2 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
                    objectRef5.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
                    objectRef18.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
                    objectRef3 = objectRef20;
                    objectRef3.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = '" + str4 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
                    objectRef4 = objectRef18;
                    objectRef6 = objectRef21;
                    objectRef6.element = "\njavascript: \n// Find the volume input element\nvar volumeInput = document.querySelector('.trade-input input[type=\"text\"]');\nif (volumeInput !== null) {\n    volumeInput.value = 0.00;\n    volumeInput.value = " + tradeDetails.getLot() + "||" + str7 + ";\n    volumeInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the stop loss input element\nvar stopLossInput = document.querySelector('.sl input[type=\"text\"]');\nif (stopLossInput !== null) {\n    stopLossInput.value = " + tradeDetails.getSl() + "||" + str6 + " ;\n    stopLossInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the take profit input element\nvar takeProfitInput = document.querySelector('.tp input[type=\"text\"]');\nif (takeProfitInput !== null) {\n    takeProfitInput.value = " + tradeDetails.getTp() + "||" + str5 + ";\n    takeProfitInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the comment input element\nvar commentInput = document.querySelector('.input.svelte-mtorg2 input[type=\"text\"]');\nif (commentInput !== null) {\n    commentInput.value = '" + str9 + "';\n    commentInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\nif(takeProfitInput.value == null || stopLossInput == null || volumeInput.value == null || commentInput.value == null)\n{\n     false;\n}\nelse\n{\n     true;\n}\n";
                    objectRef2 = objectRef19;
                    objectRef2.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null) {\n        var text = symbolSpan.innerText.trim();\n        if (text === '" + str4 + "' || text === '" + str4 + ".mic') {\n            symbolSpan.click();\n            true;\n        } else {\n            false;\n        }\n    } else {\n        false;\n    }\n";
                    break;
                }
            case -1738067640:
                objectRef = objectRef16;
                if (!lowerCase.equals("spacemarkets-live")) {
                    objectRef3 = objectRef20;
                    objectRef6 = objectRef21;
                    objectRef5 = objectRef17;
                    objectRef4 = objectRef18;
                    objectRef2 = objectRef19;
                    webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                    break;
                } else {
                    webView.loadUrl("https://webtrader.spacemarkets.io:1960/terminal");
                    objectRef.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str2 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
                    objectRef21.element = "\njavascript: \n// Find the volume input element\nvar volumeInput = document.querySelector('.trade-input input[type=\"text\"]');\nif (volumeInput !== null) {\n    volumeInput.value = 0.00;\n    volumeInput.value = " + tradeDetails.getLot() + "||" + str7 + ";\n    volumeInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the stop loss input element\nvar stopLossInput = document.querySelector('.sl input[type=\"text\"]');\nif (stopLossInput !== null) {\n    stopLossInput.value = " + tradeDetails.getSl() + "||" + str6 + " ;\n    stopLossInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the take profit input element\nvar takeProfitInput = document.querySelector('.tp input[type=\"text\"]');\nif (takeProfitInput !== null) {\n    takeProfitInput.value = " + tradeDetails.getTp() + "||" + str5 + ";\n    takeProfitInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the comment input element\nvar commentInput = document.querySelector('.input.svelte-mtorg2 input[type=\"text\"]');\nif (commentInput !== null) {\n    commentInput.value = '" + str9 + "';\n    commentInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\nif(takeProfitInput.value == null || stopLossInput == null || volumeInput.value == null || commentInput.value == null)\n{\n     false;\n}\nelse\n{\n     true;\n}\n";
                    objectRef3 = objectRef20;
                    objectRef3.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = '" + str4 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
                    objectRef17.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
                    objectRef18.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
                    objectRef19.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null && symbolSpan.innerText.trim() === '" + str4 + "') {\n        // Click on the symbol\n        symbolSpan.click();\n        true; // Return true if symbol found and clicked\n    } else {\n        false; // Return false if symbol not found or doesn't match\n    }\n";
                    objectRef6 = objectRef21;
                    objectRef4 = objectRef18;
                    objectRef2 = objectRef19;
                    objectRef5 = objectRef17;
                    break;
                }
            case -1402389166:
                str10 = str4;
                objectRef = objectRef16;
                objectRef7 = objectRef19;
                objectRef3 = objectRef20;
                objectRef8 = objectRef18;
                objectRef9 = objectRef17;
                objectRef10 = objectRef21;
                if (lowerCase.equals("deriv-demo")) {
                    webView.loadUrl("https://mt5-demo-web.deriv.com/terminal");
                    objectRef4 = objectRef8;
                    objectRef6 = objectRef10;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef9;
                    break;
                }
                objectRef4 = objectRef8;
                objectRef6 = objectRef10;
                objectRef2 = objectRef7;
                objectRef5 = objectRef9;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case -1017862919:
                str10 = str4;
                objectRef = objectRef16;
                objectRef7 = objectRef19;
                objectRef3 = objectRef20;
                objectRef8 = objectRef18;
                objectRef9 = objectRef17;
                objectRef10 = objectRef21;
                if (lowerCase.equals("derivbvi-server")) {
                    webView.loadUrl("https://mt5-real01-web-bvi.deriv.com/terminal");
                    objectRef4 = objectRef8;
                    objectRef6 = objectRef10;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef9;
                    break;
                }
                objectRef4 = objectRef8;
                objectRef6 = objectRef10;
                objectRef2 = objectRef7;
                objectRef5 = objectRef9;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case -685065386:
                str10 = str4;
                objectRef = objectRef16;
                objectRef7 = objectRef19;
                objectRef3 = objectRef20;
                objectRef8 = objectRef18;
                objectRef9 = objectRef17;
                objectRef10 = objectRef21;
                if (lowerCase.equals("derivbvi-server-02")) {
                    webView.loadUrl("https://mt5-real02-web-bvi.deriv.com/terminal");
                    objectRef4 = objectRef8;
                    objectRef6 = objectRef10;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef9;
                    break;
                }
                objectRef4 = objectRef8;
                objectRef6 = objectRef10;
                objectRef2 = objectRef7;
                objectRef5 = objectRef9;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case -685065385:
                str10 = str4;
                objectRef = objectRef16;
                objectRef7 = objectRef19;
                objectRef3 = objectRef20;
                objectRef8 = objectRef18;
                objectRef9 = objectRef17;
                objectRef10 = objectRef21;
                if (lowerCase.equals("derivbvi-server-03")) {
                    webView.loadUrl("https://mt5-real03-web-bvi.deriv.com/terminal");
                    objectRef4 = objectRef8;
                    objectRef6 = objectRef10;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef9;
                    break;
                }
                objectRef4 = objectRef8;
                objectRef6 = objectRef10;
                objectRef2 = objectRef7;
                objectRef5 = objectRef9;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case -685063149:
                str10 = str4;
                objectRef = objectRef16;
                objectRef7 = objectRef19;
                objectRef3 = objectRef20;
                objectRef8 = objectRef18;
                objectRef9 = objectRef17;
                objectRef10 = objectRef21;
                if (lowerCase.equals("derivbvi-server-vu")) {
                    webView.loadUrl("https://mt5-real01-web-vu.deriv.com/terminal");
                    objectRef4 = objectRef8;
                    objectRef6 = objectRef10;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef9;
                    break;
                }
                objectRef4 = objectRef8;
                objectRef6 = objectRef10;
                objectRef2 = objectRef7;
                objectRef5 = objectRef9;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case -340448860:
                objectRef = objectRef16;
                str10 = str4;
                objectRef5 = objectRef17;
                if (!lowerCase.equals("justMarkets-live2")) {
                    objectRef4 = objectRef18;
                    objectRef3 = objectRef20;
                    objectRef2 = objectRef19;
                    objectRef6 = objectRef21;
                    webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                    break;
                } else {
                    webView.loadUrl("https://live2.justmarkets.com/terminal");
                    objectRef.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str2 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
                    objectRef5.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
                    objectRef18.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
                    objectRef3 = objectRef20;
                    objectRef3.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = '" + str10 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
                    objectRef8 = objectRef18;
                    objectRef9 = objectRef5;
                    objectRef10 = objectRef21;
                    objectRef10.element = "\njavascript: \n// Find the volume input element\nvar volumeInput = document.querySelector('.trade-input input[type=\"text\"]');\nif (volumeInput !== null) {\n    volumeInput.value = 0.00;\n    volumeInput.value = " + tradeDetails.getLot() + "||" + str7 + ";\n    volumeInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the stop loss input element\nvar stopLossInput = document.querySelector('.sl input[type=\"text\"]');\nif (stopLossInput !== null) {\n    stopLossInput.value = " + tradeDetails.getSl() + "||" + str6 + " ;\n    stopLossInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the take profit input element\nvar takeProfitInput = document.querySelector('.tp input[type=\"text\"]');\nif (takeProfitInput !== null) {\n    takeProfitInput.value = " + tradeDetails.getTp() + "||" + str5 + ";\n    takeProfitInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the comment input element\nvar commentInput = document.querySelector('.input.svelte-mtorg2 input[type=\"text\"]');\nif (commentInput !== null) {\n    commentInput.value = '" + str9 + "';\n    commentInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\nif(takeProfitInput.value == null || stopLossInput == null || volumeInput.value == null || commentInput.value == null)\n{\n     false;\n}\nelse\n{\n     true;\n}\n";
                    objectRef7 = objectRef19;
                    objectRef7.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null && symbolSpan.innerText.trim() === '" + str10 + "') {\n        // Click on the symbol\n        symbolSpan.click();\n        true; // Return true if symbol found and clicked\n    } else {\n        false; // Return false if symbol not found or doesn't match\n    }\n";
                    objectRef4 = objectRef8;
                    objectRef6 = objectRef10;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef9;
                    break;
                }
            case 745721418:
                str11 = str4;
                str12 = str6;
                objectRef = objectRef16;
                objectRef11 = objectRef19;
                objectRef12 = objectRef20;
                objectRef13 = objectRef18;
                objectRef14 = objectRef17;
                objectRef15 = objectRef21;
                if (!lowerCase.equals("derivsvg-server")) {
                    objectRef6 = objectRef15;
                    objectRef4 = objectRef13;
                    objectRef2 = objectRef11;
                    objectRef5 = objectRef14;
                    objectRef3 = objectRef12;
                    webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                    break;
                } else {
                    webView.loadUrl("https://mt5-real01-web-svg.deriv.com/terminal");
                    objectRef6 = objectRef15;
                    objectRef4 = objectRef13;
                    objectRef2 = objectRef11;
                    objectRef5 = objectRef14;
                    objectRef3 = objectRef12;
                    break;
                }
            case 820131061:
                objectRef = objectRef16;
                str12 = str6;
                if (!lowerCase.equals("rocketx-live")) {
                    objectRef3 = objectRef20;
                    objectRef5 = objectRef17;
                    objectRef6 = objectRef21;
                    objectRef4 = objectRef18;
                    objectRef2 = objectRef19;
                    webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                    break;
                } else {
                    webView.loadUrl("https://webtrader.rocketx.io:1950/terminal");
                    objectRef.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str2 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
                    objectRef15 = objectRef21;
                    objectRef15.element = "\njavascript: \n// Find the volume input element\nvar volumeInput = document.querySelector('.trade-input input[type=\"text\"]');\nif (volumeInput !== null) {\n    volumeInput.value = 0.00;\n    volumeInput.value = " + tradeDetails.getLot() + "||" + str7 + ";\n    volumeInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the stop loss input element\nvar stopLossInput = document.querySelector('.sl input[type=\"text\"]');\nif (stopLossInput !== null) {\n    stopLossInput.value = " + tradeDetails.getSl() + "||" + str12 + " ;\n    stopLossInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the take profit input element\nvar takeProfitInput = document.querySelector('.tp input[type=\"text\"]');\nif (takeProfitInput !== null) {\n    takeProfitInput.value = " + tradeDetails.getTp() + "||" + str5 + ";\n    takeProfitInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the comment input element\nvar commentInput = document.querySelector('.input.svelte-mtorg2 input[type=\"text\"]');\nif (commentInput !== null) {\n    commentInput.value = '" + str9 + "';\n    commentInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\nif(takeProfitInput.value == null || stopLossInput == null || volumeInput.value == null || commentInput.value == null)\n{\n     false;\n}\nelse\n{\n     true;\n}\n";
                    str11 = str4;
                    objectRef12 = objectRef20;
                    objectRef12.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = '" + str11 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
                    objectRef14 = objectRef17;
                    objectRef14.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
                    objectRef13 = objectRef18;
                    objectRef13.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
                    objectRef11 = objectRef19;
                    objectRef11.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null && symbolSpan.innerText.trim() === '" + str11 + "') {\n        // Click on the symbol\n        symbolSpan.click();\n        true; // Return true if symbol found and clicked\n    } else {\n        false; // Return false if symbol not found or doesn't match\n    }\n";
                    objectRef6 = objectRef15;
                    objectRef4 = objectRef13;
                    objectRef2 = objectRef11;
                    objectRef5 = objectRef14;
                    objectRef3 = objectRef12;
                    break;
                }
            case 958606661:
                objectRef = objectRef16;
                str10 = str4;
                objectRef9 = objectRef17;
                if (!lowerCase.equals("justMarkets-demo")) {
                    objectRef5 = objectRef9;
                    objectRef4 = objectRef18;
                    objectRef3 = objectRef20;
                    objectRef2 = objectRef19;
                    objectRef6 = objectRef21;
                    webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                    break;
                } else {
                    webView.loadUrl("https://demo.justmarkets.com/terminal");
                    objectRef.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str2 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
                    objectRef9.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
                    objectRef18.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
                    objectRef3 = objectRef20;
                    objectRef3.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = '" + str10 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
                    objectRef21.element = "\njavascript: \n// Find the volume input element\nvar volumeInput = document.querySelector('.trade-input input[type=\"text\"]');\nif (volumeInput !== null) {\n    volumeInput.value = 0.00;\n    volumeInput.value = " + tradeDetails.getLot() + "||" + str7 + ";\n    volumeInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the stop loss input element\nvar stopLossInput = document.querySelector('.sl input[type=\"text\"]');\nif (stopLossInput !== null) {\n    stopLossInput.value = " + tradeDetails.getSl() + "||" + str6 + " ;\n    stopLossInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the take profit input element\nvar takeProfitInput = document.querySelector('.tp input[type=\"text\"]');\nif (takeProfitInput !== null) {\n    takeProfitInput.value = " + tradeDetails.getTp() + "||" + str5 + ";\n    takeProfitInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the comment input element\nvar commentInput = document.querySelector('.input.svelte-mtorg2 input[type=\"text\"]');\nif (commentInput !== null) {\n    commentInput.value = '" + str9 + "';\n    commentInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\nif(takeProfitInput.value == null || stopLossInput == null || volumeInput.value == null || commentInput.value == null)\n{\n     false;\n}\nelse\n{\n     true;\n}\n";
                    objectRef19.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null && symbolSpan.innerText.trim() === '" + str10 + "') {\n        // Click on the symbol\n        symbolSpan.click();\n        true; // Return true if symbol found and clicked\n    } else {\n        false; // Return false if symbol not found or doesn't match\n    }\n";
                    objectRef4 = objectRef18;
                    objectRef6 = objectRef21;
                    objectRef2 = objectRef19;
                    objectRef5 = objectRef9;
                    break;
                }
            case 958849102:
                if (lowerCase.equals("justMarkets-live")) {
                    webView.loadUrl("https://live.justmarkets.com/terminal");
                    objectRef = objectRef16;
                    objectRef.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str2 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
                    objectRef17.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
                    objectRef18.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
                    objectRef20.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = '" + str4 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
                    objectRef21.element = "\njavascript: \n// Find the volume input element\nvar volumeInput = document.querySelector('.trade-input input[type=\"text\"]');\nif (volumeInput !== null) {\n    volumeInput.value = 0.00;\n    volumeInput.value = " + tradeDetails.getLot() + "||" + str7 + ";\n    volumeInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the stop loss input element\nvar stopLossInput = document.querySelector('.sl input[type=\"text\"]');\nif (stopLossInput !== null) {\n    stopLossInput.value = " + tradeDetails.getSl() + "||" + str6 + " ;\n    stopLossInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the take profit input element\nvar takeProfitInput = document.querySelector('.tp input[type=\"text\"]');\nif (takeProfitInput !== null) {\n    takeProfitInput.value = " + tradeDetails.getTp() + "||" + str5 + ";\n    takeProfitInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\n// Find the comment input element\nvar commentInput = document.querySelector('.input.svelte-mtorg2 input[type=\"text\"]');\nif (commentInput !== null) {\n    commentInput.value = '" + str9 + "';\n    commentInput.dispatchEvent(new Event('input', { bubbles: true }));\n}\n\nif(takeProfitInput.value == null || stopLossInput == null || volumeInput.value == null || commentInput.value == null)\n{\n     false;\n}\nelse\n{\n     true;\n}\n";
                    objectRef19.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null && symbolSpan.innerText.trim() === '" + str4 + "') {\n        // Click on the symbol\n        symbolSpan.click();\n        true; // Return true if symbol found and clicked\n    } else {\n        false; // Return false if symbol not found or doesn't match\n    }\n";
                    objectRef2 = objectRef19;
                    objectRef3 = objectRef20;
                    objectRef5 = objectRef17;
                    objectRef6 = objectRef21;
                    objectRef4 = objectRef18;
                    break;
                }
                objectRef = objectRef16;
                objectRef2 = objectRef19;
                objectRef3 = objectRef20;
                objectRef4 = objectRef18;
                objectRef5 = objectRef17;
                objectRef6 = objectRef21;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case 968363516:
                if (lowerCase.equals("derivbvi-server-vu-02")) {
                    webView.loadUrl("https://mt5-real02-web-vu.deriv.com/terminal");
                    objectRef = objectRef16;
                    objectRef2 = objectRef19;
                    objectRef3 = objectRef20;
                    objectRef4 = objectRef18;
                    objectRef5 = objectRef17;
                    objectRef6 = objectRef21;
                    break;
                }
                objectRef = objectRef16;
                objectRef2 = objectRef19;
                objectRef3 = objectRef20;
                objectRef4 = objectRef18;
                objectRef5 = objectRef17;
                objectRef6 = objectRef21;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            case 968363517:
                if (lowerCase.equals("derivbvi-server-vu-03")) {
                    webView.loadUrl("https://mt5-real03-web-vu.deriv.com/terminal");
                    objectRef = objectRef16;
                    objectRef2 = objectRef19;
                    objectRef3 = objectRef20;
                    objectRef4 = objectRef18;
                    objectRef5 = objectRef17;
                    objectRef6 = objectRef21;
                    break;
                }
                objectRef = objectRef16;
                objectRef2 = objectRef19;
                objectRef3 = objectRef20;
                objectRef4 = objectRef18;
                objectRef5 = objectRef17;
                objectRef6 = objectRef21;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
            default:
                objectRef = objectRef16;
                objectRef2 = objectRef19;
                objectRef3 = objectRef20;
                objectRef4 = objectRef18;
                objectRef5 = objectRef17;
                objectRef6 = objectRef21;
                webView.loadUrl("https://webterminal.accumarkets.co.za/terminal");
                break;
        }
        final Ref.ObjectRef objectRef22 = objectRef;
        final Ref.ObjectRef objectRef23 = objectRef5;
        final Ref.ObjectRef objectRef24 = objectRef3;
        final Ref.ObjectRef objectRef25 = objectRef6;
        final Ref.ObjectRef objectRef26 = objectRef2;
        final Integer num3 = num2;
        webView.setWebViewClient(new WebViewClient() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT5$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str13) {
                Intrinsics.checkNotNullParameter(webView2, "view");
                TradeActivity.this.setJob2(BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new TradeActivity$tradeMT5$1$onPageFinished$1(TradeActivity.this, webView2, objectRef24, objectRef26, num3, r7, objectRef25, str8, r10, r11, r12, objectRef4, objectRef22, objectRef23, str4, str5, str6, null), 3, (Object) null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tradeMT4(final WebView webView, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final Integer num) {
        final Integer num2;
        int i;
        SharedPreferences sharedPreferences = getSharedPreferences("EANameModePrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.ea_nameModePref = sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ea_nameModePref");
            sharedPreferences = null;
        }
        int i2 = sharedPreferences.getInt("mode", 1);
        addLogMessage(0, "Setting up MT4...");
        if (i2 != 1) {
            if (i2 == 2) {
                i = 10;
            } else if (i2 == 3) {
                i = 15;
            } else {
                i = 1;
            }
            num2 = i;
        } else {
            num2 = num;
        }
        webView.loadUrl("https://metatraderweb.app/trade?version=4");
        final String str10 = "javascript:var x=document.getElementById('login').value = '" + str + "'; var x=document.getElementById('server').value = '" + str3 + "';var y=document.getElementById('password').value='" + str2 + "';";
        final String str11 = "javascript:var tableB = document.querySelector('body > div.page-window.market-watch.compact > div > div.b > div.page-block > div > table > tbody');var allTRs = tableB.querySelectorAll('tr');var input, filter, ul, li, a, i, txtValue;var clickEvent  = document.createEvent ('MouseEvents');\n            clickEvent.initEvent ('dblclick', true, true);\nfor (i = 0; i < allTRs.length; i++) {\n            a = allTRs[i].getElementsByTagName('td')[0];\n            if (a.textContent.trimLeft(0) === '" + str4 + "') {\n              a.style.background = 'red';\n                a.dispatchEvent(clickEvent);\n            }           }";
        final String str12 = "\n    javascript:\n(function() {\n    // Function to set input value and dispatch events\n    function setInputValue(inputId, value) {\n        var input = document.querySelector('#' + inputId);\n        if (input) {\n            input.value = value;  // Set the value\n            input.dispatchEvent(new Event('input', { bubbles: true, cancelable: true }));\n            input.dispatchEvent(new Event('change', { bubbles: true, cancelable: true }));\n            input.dispatchEvent(new Event('focus', { bubbles: true }));\n        }\n    }\n\n    // Function to invalidate input value based on its ID\n    function invalidateInput(inputId) {\n        var input = document.querySelector('#' + inputId);\n        if (input) {\n            if (inputId === 'sl') {\n                input.value = '" + str6 + "';  // Set to valid SL value\n            } else if (inputId === 'tp') {\n                input.value = '" + str5 + "';  // Set to valid TP value\n            } else {\n                input.value = '';  // For other inputs, reset to empty\n            }\n            input.dispatchEvent(new Event('input', { bubbles: true, cancelable: true }));\n            input.dispatchEvent(new Event('change', { bubbles: true, cancelable: true }));\n        }\n    }\n\n    // Set values for SL and TP\n    var slValue = '" + str6 + "';  // Replace with actual SL value\n    var tpValue = '" + str5 + "';  // Replace with actual TP value\n\n    setInputValue('sl', slValue);\n    setInputValue('tp', tpValue);\n\n    // Optionally invalidate the TP input (for demonstration)\n    invalidateInput('tp'); // This will set the TP input to a valid value\n    invalidateInput('sl'); // This will set the TP input to a valid value\n    // Set and commit volume input value\n    var volumeInput = document.querySelector('#volume');\n    if (volumeInput) {\n        volumeInput.value = '" + str7 + "'; \n        volumeInput.dispatchEvent(new Event('input', { bubbles: true, cancelable: true }));\n        volumeInput.dispatchEvent(new Event('change', { bubbles: true, cancelable: true }));\n        volumeInput.dispatchEvent(new Event('focus', { bubbles: true }));\n    }\n\n    // Set and commit comment input value\n    var commentInput = document.querySelector('#comment');\n    if (commentInput) {\n        commentInput.value = '" + str9 + "'; \n        commentInput.dispatchEvent(new Event('input', { bubbles: true, cancelable: true }));\n        commentInput.dispatchEvent(new Event('change', { bubbles: true, cancelable: true }));\n        commentInput.dispatchEvent(new Event('focus', { bubbles: true }));\n    }\n\n})();\n";
        webView.setWebViewClient(new WebViewClient() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str13) {
                Intrinsics.checkNotNullParameter(webView2, "view");
                TradeActivity.this.setJob2(BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new TradeActivity$tradeMT4$1$onPageFinished$1(TradeActivity.this, webView2, str4, str10, r6, r7, r8, str11, num2, str12, str8, r13, r14, null), 3, (Object) null));
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView2, String str13) {
                webView.clearCache(true);
                TradeActivity.this.loading = true;
                TradeActivity.this.addLogMessage(0, ">>Loading... ");
                super.onLoadResource(webView2, str13);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                Intrinsics.checkNotNullParameter(webResourceError, "error");
                TradeActivity.this.addLogMessage(0, ">>Your Internet Connection May not be active Or Poor. " + ((Object) webResourceError.getDescription()));
                TradeActivity.this.tradeMT4(webView, str, str2, str3, str4, str5, str6, str7, str8, str9, num);
            }
        });
    }
}

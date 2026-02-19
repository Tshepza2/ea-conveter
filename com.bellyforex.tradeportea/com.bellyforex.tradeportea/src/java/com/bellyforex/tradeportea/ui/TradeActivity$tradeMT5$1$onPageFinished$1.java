package com.bellyforex.tradeportea.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: TradeActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.TradeActivity$tradeMT5$1$onPageFinished$1", f = "TradeActivity.kt", i = {7}, l = {1072, 1092, 1104, 1117, 1131, 1135, 1160, 1174}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class TradeActivity$tradeMT5$1$onPageFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $action;
    final /* synthetic */ String $asset;
    final /* synthetic */ Ref.ObjectRef<String> $js;
    final /* synthetic */ String $jsBuy;
    final /* synthetic */ String $jsDone;
    final /* synthetic */ String $jsOrder;
    final /* synthetic */ Ref.ObjectRef<String> $jsOrderInfo;
    final /* synthetic */ Ref.ObjectRef<String> $jsPress;
    final /* synthetic */ Ref.ObjectRef<String> $jsPressRemove;
    final /* synthetic */ Ref.ObjectRef<String> $jsSearch;
    final /* synthetic */ Ref.ObjectRef<String> $jsSelect;
    final /* synthetic */ String $jsSell;
    final /* synthetic */ Integer $numberOfOrders;
    final /* synthetic */ String $sl;
    final /* synthetic */ String $tp;
    final /* synthetic */ WebView $view;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ TradeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeActivity$tradeMT5$1$onPageFinished$1(TradeActivity tradeActivity, WebView webView, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, Integer num, String str, Ref.ObjectRef<String> objectRef3, String str2, String str3, String str4, String str5, Ref.ObjectRef<String> objectRef4, Ref.ObjectRef<String> objectRef5, Ref.ObjectRef<String> objectRef6, String str6, String str7, String str8, Continuation<? super TradeActivity$tradeMT5$1$onPageFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeActivity;
        this.$view = webView;
        this.$jsSearch = objectRef;
        this.$jsSelect = objectRef2;
        this.$numberOfOrders = num;
        this.$jsOrder = str;
        this.$jsOrderInfo = objectRef3;
        this.$action = str2;
        this.$jsBuy = str3;
        this.$jsDone = str4;
        this.$jsSell = str5;
        this.$jsPressRemove = objectRef4;
        this.$js = objectRef5;
        this.$jsPress = objectRef6;
        this.$asset = str6;
        this.$tp = str7;
        this.$sl = str8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeActivity$tradeMT5$1$onPageFinished$1(this.this$0, this.$view, this.$jsSearch, this.$jsSelect, this.$numberOfOrders, this.$jsOrder, this.$jsOrderInfo, this.$action, this.$jsBuy, this.$jsDone, this.$jsSell, this.$jsPressRemove, this.$js, this.$jsPress, this.$asset, this.$tp, this.$sl, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0253  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:15:0x004a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0173 -> B:94:0x024b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x017b -> B:94:0x024b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0183 -> B:94:0x024b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x018b -> B:94:0x024b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0196 -> B:94:0x024b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01bd -> B:82:0x01c0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT5$1$onPageFinished$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WebView webView, TradeActivity tradeActivity, String str) {
        Log.d("TAG", "Initializing trade");
        Intrinsics.checkNotNull(str);
        if (str.length() == 0) {
            return;
        }
        webView.loadUrl("javascript:document.querySelector('.accept-button').click()");
        tradeActivity.chechDisc = false;
        tradeActivity.addLogMessage(0, "Accepting disclaimer and linking account...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TradeActivity tradeActivity, WebView webView, Ref.ObjectRef objectRef, String str) {
        boolean z;
        System.out.println(str);
        if (Boolean.parseBoolean(str) || str == null) {
            return;
        }
        z = tradeActivity.showAllSymbols;
        if (z) {
            return;
        }
        webView.evaluateJavascript((String) objectRef.element, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(TradeActivity tradeActivity, WebView webView, Ref.ObjectRef objectRef, String str) {
        boolean z;
        System.out.println((Object) "Printing Logging in to MT5 Account.");
        System.out.println((Object) str);
        if (Boolean.parseBoolean(str) || str == null) {
            return;
        }
        z = tradeActivity.showAllSymbols;
        if (z) {
            return;
        }
        webView.evaluateJavascript((String) objectRef.element, null);
        tradeActivity.addLogMessage(0, "Connecting to server...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(TradeActivity tradeActivity, WebView webView, Ref.ObjectRef objectRef, String str) {
        boolean z;
        System.out.println(str);
        if (Boolean.parseBoolean(str) || str == null) {
            return;
        }
        z = tradeActivity.showAllSymbols;
        if (z) {
            return;
        }
        webView.evaluateJavascript((String) objectRef.element, null);
        tradeActivity.showAllSymbols = true;
        tradeActivity.addLogMessage(0, "....... ..");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(TradeActivity tradeActivity, String str, String str2) {
        int i;
        int i2;
        if (str2 != null ? Boolean.parseBoolean(str2) : false) {
            tradeActivity.addLogMessage(0, "Successfully connected to account.");
            tradeActivity.chatLoading = true;
            tradeActivity.showAllSymbols = true;
            tradeActivity.chooseSymbol = true;
            tradeActivity.pressExecuteTrade = false;
            tradeActivity.loggedIn = true;
            tradeActivity.addLogMessage(0, "Loading  Symbol: " + str + " ");
            return;
        }
        tradeActivity.addLogMessage(0, ">> Looking for Symbol: " + str + ", Ensure Broker has the symbol " + str + " or Connect correct broker");
        i = tradeActivity.symbolCount;
        tradeActivity.symbolCount = i + 1;
        i2 = tradeActivity.symbolCount;
        if (i2 > 4) {
            tradeActivity.checkEmsg = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5(TradeActivity tradeActivity, String str) {
        if (str != null ? Boolean.parseBoolean(str) : false) {
            tradeActivity.addLogMessage(0, "Order placement in progress");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6(TradeActivity tradeActivity, String str) {
        if (str != null ? Boolean.parseBoolean(str) : false) {
            tradeActivity.addLogMessage(0, "Trading");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$7(TradeActivity tradeActivity, String str, String str2, String str3, String str4) {
        if (str4 != null ? Boolean.parseBoolean(str4) : false) {
            tradeActivity.addLogMessage(0, "Trade Automated >> " + str + " BUY TP:" + str2 + " SL:" + str3 + " Placed for order");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$8(TradeActivity tradeActivity, String str) {
        if (str != null ? Boolean.parseBoolean(str) : false) {
            tradeActivity.addLogMessage(0, "Trades Placed for order ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9(TradeActivity tradeActivity, String str, String str2, String str3, String str4) {
        if (str4 != null ? Boolean.parseBoolean(str4) : false) {
            tradeActivity.addLogMessage(0, ">> " + str + " SELL TP:" + str2 + " SL:" + str3 + " Placed for order ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$10(TradeActivity tradeActivity, int i, String str) {
        if (str != null ? Boolean.parseBoolean(str) : false) {
            tradeActivity.addLogMessage(0, ">> Order Executed for order " + i + ".");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$12(final TradeActivity tradeActivity) {
        Job.DefaultImpls.cancel$default(tradeActivity.getJob(), (CancellationException) null, 1, (Object) null);
        Job.DefaultImpls.cancel$default(tradeActivity.getJob2(), (CancellationException) null, 1, (Object) null);
        tradeActivity.getTimer1().cancel();
        Intent intent = new Intent((Context) tradeActivity, FinishActivity.class);
        intent.addFlags(335544320);
        tradeActivity.startActivity(intent);
        tradeActivity.finish();
        new Handler().postDelayed(new Runnable() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT5$1$onPageFinished$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TradeActivity$tradeMT5$1$onPageFinished$1.invokeSuspend$lambda$12$lambda$11(TradeActivity.this);
            }
        }, 55000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$12$lambda$11(TradeActivity tradeActivity) {
        Intent intent = new Intent((Context) tradeActivity, FinishActivity.class);
        intent.addFlags(335544320);
        tradeActivity.startActivity(intent);
        tradeActivity.finish();
    }
}

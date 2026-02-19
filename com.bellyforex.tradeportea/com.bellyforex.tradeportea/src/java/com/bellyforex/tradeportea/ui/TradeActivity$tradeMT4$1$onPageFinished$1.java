package com.bellyforex.tradeportea.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.TextView;
import com.bellyforex.tradeportea.R;
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
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1", f = "TradeActivity.kt", i = {}, l = {1426, 1452}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class TradeActivity$tradeMT4$1$onPageFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $action;
    final /* synthetic */ String $asset;
    final /* synthetic */ String $buyItem;
    final /* synthetic */ String $choose_symbol;
    final /* synthetic */ String $combinedScript;
    final /* synthetic */ String $item1InSymbolsRightClick;
    final /* synthetic */ String $js;
    final /* synthetic */ String $jsPress;
    final /* synthetic */ Integer $numberOfOrders;
    final /* synthetic */ String $press_show_all;
    final /* synthetic */ String $sellItem;
    final /* synthetic */ WebView $view;
    int label;
    final /* synthetic */ TradeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeActivity$tradeMT4$1$onPageFinished$1(TradeActivity tradeActivity, WebView webView, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, Continuation<? super TradeActivity$tradeMT4$1$onPageFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeActivity;
        this.$view = webView;
        this.$asset = str;
        this.$js = str2;
        this.$jsPress = str3;
        this.$item1InSymbolsRightClick = str4;
        this.$press_show_all = str5;
        this.$choose_symbol = str6;
        this.$numberOfOrders = num;
        this.$combinedScript = str7;
        this.$action = str8;
        this.$buyItem = str9;
        this.$sellItem = str10;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeActivity$tradeMT4$1$onPageFinished$1(this.this$0, this.$view, this.$asset, this.$js, this.$jsPress, this.$item1InSymbolsRightClick, this.$press_show_all, this.$choose_symbol, this.$numberOfOrders, this.$combinedScript, this.$action, this.$buyItem, this.$sellItem, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:11:0x0025). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0062 -> B:26:0x0090). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:25:0x0080). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WebView webView, String str, String str2, TradeActivity tradeActivity, String str3) {
        if (Boolean.parseBoolean(str3) || str3 == null) {
            return;
        }
        webView.loadUrl(str);
        webView.loadUrl(str2);
        tradeActivity.showAllSymbols = true;
        tradeActivity.addLogMessage(0, "linking Bot to Account");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(WebView webView, String str, TradeActivity tradeActivity, String str2) {
        if (str2 != null) {
            webView.loadUrl(str);
            tradeActivity.addLogMessage(0, "checking all available assets.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(WebView webView, String str, TradeActivity tradeActivity, String str2) {
        if (str2 != null) {
            webView.loadUrl(str);
            tradeActivity.chooseSymbol = true;
            tradeActivity.addLogMessage(0, "Viewing all available assets.");
        }
    }

    private static final void invokeSuspend$executeOrder(final Ref.IntRef intRef, final Integer num, final TradeActivity tradeActivity, final WebView webView, final String str, final String str2, final String str3, final String str4, final String str5) {
        int i = intRef.element;
        Intrinsics.checkNotNull(num);
        if (i >= num.intValue()) {
            tradeActivity.checkEmsg = true;
            tradeActivity.pressExecuteTrade = false;
            return;
        }
        webView.evaluateJavascript("javascript: document.querySelector('body > div:nth-child(18)').classList.contains('hidden')", new ValueCallback() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                TradeActivity$tradeMT4$1$onPageFinished$1.invokeSuspend$executeOrder$lambda$6(TradeActivity.this, webView, str, str2, str3, str4, str5, intRef, num, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$executeOrder$lambda$6(final TradeActivity tradeActivity, final WebView webView, final String str, final String str2, final String str3, final String str4, final String str5, final Ref.IntRef intRef, final Integer num, String str6) {
        if (str6 == null || Boolean.parseBoolean(str6)) {
            return;
        }
        tradeActivity.chooseSymbol = false;
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                TradeActivity$tradeMT4$1$onPageFinished$1.invokeSuspend$executeOrder$lambda$6$lambda$3(TradeActivity.this, (String) obj);
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TradeActivity$tradeMT4$1$onPageFinished$1.invokeSuspend$executeOrder$lambda$6$lambda$5(str2, webView, str3, str4, tradeActivity, str5, intRef, num, str);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$executeOrder$lambda$6$lambda$3(TradeActivity tradeActivity, String str) {
        if (str != null ? Boolean.parseBoolean(str) : false) {
            tradeActivity.addLogMessage(0, "Setting LotSize , TP and SL.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$executeOrder$lambda$6$lambda$5(final String str, final WebView webView, final String str2, final String str3, final TradeActivity tradeActivity, final String str4, final Ref.IntRef intRef, final Integer num, final String str5) {
        new Handler().postDelayed(new Runnable() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TradeActivity$tradeMT4$1$onPageFinished$1.invokeSuspend$executeOrder$lambda$6$lambda$5$lambda$4(str, webView, str2, str3, tradeActivity, str4, intRef, num, str5);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$executeOrder$lambda$6$lambda$5$lambda$4(String str, WebView webView, String str2, String str3, TradeActivity tradeActivity, String str4, Ref.IntRef intRef, Integer num, String str5) {
        if (Intrinsics.areEqual(str, "BUY")) {
            webView.loadUrl(str2);
        } else {
            webView.loadUrl(str3);
        }
        tradeActivity.addLogMessage(0, ">> " + str + " " + str4 + " ");
        intRef.element++;
        invokeSuspend$executeOrder(intRef, num, tradeActivity, webView, str5, str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9(WebView webView, final TradeActivity tradeActivity, String str) {
        if (str == null || Boolean.parseBoolean(str)) {
            return;
        }
        webView.evaluateJavascript("javascript: document.querySelector('body > div:nth-child(16) > div > div.b > div:nth-child(37)').innerText;", new ValueCallback() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1$$ExternalSyntheticLambda4
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                TradeActivity$tradeMT4$1$onPageFinished$1.invokeSuspend$lambda$9$lambda$8(TradeActivity.this, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9$lambda$8(final TradeActivity tradeActivity, String str) {
        if (str != null) {
            tradeActivity.addLogMessage(0, ">>" + str + " ");
            tradeActivity.addLogMessage(1, ((Object) ((TextView) tradeActivity.findViewById(R.id.log_message)).getText()) + "\n>>" + str);
        }
        new Handler().postDelayed(new Runnable() { // from class: com.bellyforex.tradeportea.ui.TradeActivity$tradeMT4$1$onPageFinished$1$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                TradeActivity$tradeMT4$1$onPageFinished$1.invokeSuspend$lambda$9$lambda$8$lambda$7(TradeActivity.this);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9$lambda$8$lambda$7(TradeActivity tradeActivity) {
        Job.DefaultImpls.cancel$default(tradeActivity.getJob(), (CancellationException) null, 1, (Object) null);
        Job.DefaultImpls.cancel$default(tradeActivity.getJob2(), (CancellationException) null, 1, (Object) null);
        tradeActivity.getTimer1().cancel();
        tradeActivity.trade = false;
        tradeActivity.startActivity(new Intent((Context) tradeActivity, FinishActivity.class));
        tradeActivity.finish();
    }
}

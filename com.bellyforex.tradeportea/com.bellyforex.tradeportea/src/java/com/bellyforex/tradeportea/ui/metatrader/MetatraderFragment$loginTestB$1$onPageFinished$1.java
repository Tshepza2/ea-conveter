package com.bellyforex.tradeportea.ui.metatrader;

import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
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

/* compiled from: MetatraderFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTestB$1$onPageFinished$1", f = "MetatraderFragment.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER}, l = {999, 1015, 1030, 1041}, m = "invokeSuspend", n = {"activity", "attempt", "shouldContinue", "activity", "attempt", "shouldContinue", "activity", "attempt", "shouldContinue", "activity", "attempt", "shouldContinue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class MetatraderFragment$loginTestB$1$onPageFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $circleView;
    final /* synthetic */ String $item1InSymbolsRightClick;
    final /* synthetic */ String $js;
    final /* synthetic */ String $jsPress;
    final /* synthetic */ String $login;
    final /* synthetic */ String $password;
    final /* synthetic */ String $platform;
    final /* synthetic */ String $press_show_all;
    final /* synthetic */ String $server;
    final /* synthetic */ WebView $view;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MetatraderFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetatraderFragment$loginTestB$1$onPageFinished$1(MetatraderFragment metatraderFragment, WebView webView, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, View view, Continuation<? super MetatraderFragment$loginTestB$1$onPageFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = metatraderFragment;
        this.$view = webView;
        this.$js = str;
        this.$jsPress = str2;
        this.$item1InSymbolsRightClick = str3;
        this.$press_show_all = str4;
        this.$platform = str5;
        this.$login = str6;
        this.$password = str7;
        this.$server = str8;
        this.$circleView = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MetatraderFragment$loginTestB$1$onPageFinished$1(this.this$0, this.$view, this.$js, this.$jsPress, this.$item1InSymbolsRightClick, this.$press_show_all, this.$platform, this.$login, this.$password, this.$server, this.$circleView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0198  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c5 -> B:16:0x00a7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0138 -> B:43:0x0194). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x015b -> B:42:0x015e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTestB$1$onPageFinished$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WebView webView, String str, String str2, MetatraderFragment metatraderFragment, String str3) {
        if (str3 == null || !Intrinsics.areEqual(str3, "false")) {
            return;
        }
        webView.loadUrl(str);
        webView.loadUrl(str2);
        metatraderFragment.showAllSymbols = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(WebView webView, String str, String str2, final MetatraderFragment metatraderFragment, String str3) {
        if (str3 == null || !Intrinsics.areEqual(str3, "false")) {
            return;
        }
        webView.loadUrl(str);
        webView.evaluateJavascript(str2, new ValueCallback() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTestB$1$onPageFinished$1$$ExternalSyntheticLambda6
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                MetatraderFragment$loginTestB$1$onPageFinished$1.invokeSuspend$lambda$2$lambda$1(MetatraderFragment.this, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2$lambda$1(MetatraderFragment metatraderFragment, String str) {
        if (str != null) {
            metatraderFragment.showAllSymbols = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(WebView webView, String str, MetatraderFragment metatraderFragment, String str2) {
        if (str2 != null) {
            webView.loadUrl(str);
            Toast.makeText(metatraderFragment.getContext(), "Authenticating Login", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6(WebView webView, String str, final MetatraderFragment metatraderFragment, final FragmentActivity fragmentActivity, final Ref.IntRef intRef, final String str2, final String str3, final String str4, final String str5, final View view, final Ref.BooleanRef booleanRef, String str6) {
        if (str6 != null && Intrinsics.areEqual(str6, "true")) {
            webView.loadUrl(str);
            metatraderFragment.chooseSymbol = true;
            fragmentActivity.runOnUiThread(new Runnable() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTestB$1$onPageFinished$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MetatraderFragment$loginTestB$1$onPageFinished$1.invokeSuspend$lambda$6$lambda$4(MetatraderFragment.this, intRef, str2, str3, str4, str5, view, fragmentActivity, booleanRef);
                }
            });
            return;
        }
        fragmentActivity.runOnUiThread(new Runnable() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTestB$1$onPageFinished$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MetatraderFragment$loginTestB$1$onPageFinished$1.invokeSuspend$lambda$6$lambda$5(MetatraderFragment.this, intRef, booleanRef, fragmentActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6$lambda$4(MetatraderFragment metatraderFragment, Ref.IntRef intRef, String str, String str2, String str3, String str4, View view, FragmentActivity fragmentActivity, Ref.BooleanRef booleanRef) {
        Toast.makeText(metatraderFragment.getContext(), "Login Successful", 0).show();
        intRef.element = 0;
        metatraderFragment.loading = true;
        metatraderFragment.logged = true;
        metatraderFragment.saveDetail(str, str2, str3, str4);
        metatraderFragment.chechDisc = true;
        metatraderFragment.chatLoading = true;
        Job.DefaultImpls.cancel$default(metatraderFragment.getJob2(), (CancellationException) null, 1, (Object) null);
        view.setBackgroundResource(R.drawable.circle_background_green);
        fragmentActivity.getWindow().clearFlags(16);
        booleanRef.element = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6$lambda$5(MetatraderFragment metatraderFragment, Ref.IntRef intRef, Ref.BooleanRef booleanRef, FragmentActivity fragmentActivity) {
        Toast.makeText(metatraderFragment.getContext(), "Login failed", 0).show();
        intRef.element++;
        if (intRef.element >= 1) {
            Toast.makeText(metatraderFragment.getContext(), "Invalid Login or Password", 0).show();
            booleanRef.element = false;
            fragmentActivity.getWindow().clearFlags(16);
            Job.DefaultImpls.cancel$default(metatraderFragment.getJob2(), (CancellationException) null, 1, (Object) null);
        }
    }
}

package com.bellyforex.tradeportea.ui.metatrader;

import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.bellyforex.tradeportea.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: MetatraderFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTest$1$onPageFinished$1", f = "MetatraderFragment.kt", i = {0, 1, 2, WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, 4, 5, 6}, l = {824, 834, 843, 852, 861, 864, 868}, m = "invokeSuspend", n = {"activity", "activity", "activity", "activity", "activity", "activity", "activity"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class MetatraderFragment$loginTest$1$onPageFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $circleView;
    final /* synthetic */ Ref.ObjectRef<String> $js;
    final /* synthetic */ Ref.ObjectRef<String> $jsPress;
    final /* synthetic */ Ref.ObjectRef<String> $jsPressRemove;
    final /* synthetic */ Ref.ObjectRef<String> $jsSearch;
    final /* synthetic */ Ref.ObjectRef<String> $jsSelect;
    final /* synthetic */ String $login;
    final /* synthetic */ String $password;
    final /* synthetic */ String $platform;
    final /* synthetic */ String $server;
    final /* synthetic */ WebView $view;
    Object L$0;
    int label;
    final /* synthetic */ MetatraderFragment this$0;
    final /* synthetic */ MetatraderFragment$loginTest$1 this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetatraderFragment$loginTest$1$onPageFinished$1(MetatraderFragment metatraderFragment, WebView webView, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, MetatraderFragment$loginTest$1 metatraderFragment$loginTest$1, Ref.ObjectRef<String> objectRef3, Ref.ObjectRef<String> objectRef4, Ref.ObjectRef<String> objectRef5, String str, String str2, String str3, String str4, View view, Continuation<? super MetatraderFragment$loginTest$1$onPageFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = metatraderFragment;
        this.$view = webView;
        this.$jsSearch = objectRef;
        this.$jsSelect = objectRef2;
        this.this$1 = metatraderFragment$loginTest$1;
        this.$jsPressRemove = objectRef3;
        this.$js = objectRef4;
        this.$jsPress = objectRef5;
        this.$platform = str;
        this.$login = str2;
        this.$password = str3;
        this.$server = str4;
        this.$circleView = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MetatraderFragment$loginTest$1$onPageFinished$1(this.this$0, this.$view, this.$jsSearch, this.$jsSelect, this.this$1, this.$jsPressRemove, this.$js, this.$jsPress, this.$platform, this.$login, this.$password, this.$server, this.$circleView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTest$1$onPageFinished$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(WebView webView, MetatraderFragment metatraderFragment, String str) {
        Intrinsics.checkNotNull(str);
        if (str.length() > 0) {
            webView.loadUrl("javascript:document.querySelector('.accept-button').click()");
            Toast.makeText(metatraderFragment.getContext(), "Checking Login..", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(WebView webView, Ref.ObjectRef objectRef, MetatraderFragment metatraderFragment, String str) {
        if (Boolean.parseBoolean(str) || str == null) {
            return;
        }
        webView.evaluateJavascript((String) objectRef.element, null);
        Toast.makeText(metatraderFragment.getContext(), "Checking password...", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(WebView webView, Ref.ObjectRef objectRef, MetatraderFragment metatraderFragment, String str) {
        if (Boolean.parseBoolean(str) || str == null) {
            return;
        }
        webView.evaluateJavascript((String) objectRef.element, null);
        Toast.makeText(metatraderFragment.getContext(), "Connecting to Server....", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(WebView webView, Ref.ObjectRef objectRef, MetatraderFragment metatraderFragment, String str) {
        if (Boolean.parseBoolean(str) || str == null) {
            return;
        }
        webView.evaluateJavascript((String) objectRef.element, null);
        Toast.makeText(metatraderFragment.getContext(), "Connecting to Server....", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(MetatraderFragment metatraderFragment, String str, String str2, String str3, String str4, View view, MetatraderFragment$loginTest$1 metatraderFragment$loginTest$1, String str5) {
        if (str5 != null ? Boolean.parseBoolean(str5) : false) {
            metatraderFragment.showAllSymbols = false;
            metatraderFragment.loggedIn = false;
            metatraderFragment.loading = true;
            metatraderFragment.logged = true;
            metatraderFragment.saveDetail(str, str2, str3, str4);
            Toast.makeText(metatraderFragment.getContext(), "Login Successful", 0).show();
            view.setBackgroundResource(R.drawable.circle_background_green);
            metatraderFragment$loginTest$1.stopJob();
            return;
        }
        Toast.makeText(metatraderFragment.getContext(), "Invalid Login or Password.", 0).show();
        metatraderFragment.showAllSymbols = false;
        metatraderFragment.loggedIn = false;
        metatraderFragment.loading = true;
        metatraderFragment.logged = false;
        metatraderFragment$loginTest$1.stopJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5(FragmentActivity fragmentActivity) {
        fragmentActivity.getWindow().clearFlags(16);
    }
}

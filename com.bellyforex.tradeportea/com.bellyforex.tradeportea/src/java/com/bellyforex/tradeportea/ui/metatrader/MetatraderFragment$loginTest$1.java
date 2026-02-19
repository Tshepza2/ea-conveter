package com.bellyforex.tradeportea.ui.metatrader;

import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: MetatraderFragment.kt */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"com/bellyforex/tradeportea/ui/metatrader/MetatraderFragment$loginTest$1", "Landroid/webkit/WebViewClient;", "job", "Lkotlinx/coroutines/Job;", "onLoadResource", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "prepareForNextAttempt", "stopJob", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class MetatraderFragment$loginTest$1 extends WebViewClient {
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
    private Job job;
    final /* synthetic */ MetatraderFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetatraderFragment$loginTest$1(MetatraderFragment metatraderFragment, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, Ref.ObjectRef<String> objectRef3, Ref.ObjectRef<String> objectRef4, Ref.ObjectRef<String> objectRef5, String str, String str2, String str3, String str4, View view) {
        this.this$0 = metatraderFragment;
        this.$jsSearch = objectRef;
        this.$jsSelect = objectRef2;
        this.$jsPressRemove = objectRef3;
        this.$js = objectRef4;
        this.$jsPress = objectRef5;
        this.$platform = str;
        this.$login = str2;
        this.$password = str3;
        this.$server = str4;
        this.$circleView = view;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Intrinsics.checkNotNullParameter(webView, "view");
        stopJob();
        this.job = BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new MetatraderFragment$loginTest$1$onPageFinished$1(this.this$0, webView, this.$jsSearch, this.$jsSelect, this, this.$jsPressRemove, this.$js, this.$jsPress, this.$platform, this.$login, this.$password, this.$server, this.$circleView, null), 3, (Object) null);
    }

    public final void prepareForNextAttempt(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "view");
        webView.clearCache(true);
        this.this$0.showAllSymbols = false;
        this.this$0.loggedIn = false;
        this.this$0.chechDisc = true;
        this.this$0.chatLoading = false;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Intrinsics.checkNotNullParameter(webResourceError, "error");
        Toast.makeText(this.this$0.getContext(), "You have lost internet connection", 0).show();
    }

    public final void stopJob() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}

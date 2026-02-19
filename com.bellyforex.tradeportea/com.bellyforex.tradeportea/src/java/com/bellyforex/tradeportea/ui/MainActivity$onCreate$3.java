package com.bellyforex.tradeportea.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.MainActivity$onCreate$3", f = "MainActivity.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class MainActivity$onCreate$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$3(MainActivity mainActivity, Continuation<? super MainActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$onCreate$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: x
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at aa.w.a(SourceFile:83)
        	at aa.w.c(SourceFile:9)
        	at z8.a0.H0(SourceFile:1)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            com.bellyforex.tradeportea.ui.MainActivity r6 = r5.this$0
            androidx.lifecycle.MutableLiveData r6 = com.bellyforex.tradeportea.ui.MainActivity.access$getDrawAllowed$p(r6)
            com.bellyforex.tradeportea.ui.MainActivity r1 = r5.this$0
            android.content.Context r1 = (android.content.Context) r1
            boolean r1 = android.provider.Settings.canDrawOverlays(r1)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r6.postValue(r1)
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.label = r2
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L3d
            return r0
        L3d:
            com.bellyforex.tradeportea.ui.MainActivity r6 = r5.this$0
            boolean r6 = com.bellyforex.tradeportea.ui.MainActivity.access$getDrawPass$p(r6)
            if (r6 == 0) goto L1a
            com.bellyforex.tradeportea.ui.MainActivity r6 = r5.this$0
            androidx.lifecycle.MutableLiveData r6 = com.bellyforex.tradeportea.ui.MainActivity.access$getOpen$p(r6)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            r6.postValue(r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bellyforex.tradeportea.ui.MainActivity$onCreate$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

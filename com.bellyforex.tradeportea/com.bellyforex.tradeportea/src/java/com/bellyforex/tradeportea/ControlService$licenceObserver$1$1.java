package com.bellyforex.tradeportea;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ControlService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ControlService$licenceObserver$1$1", f = "ControlService.kt", i = {}, l = {197, 198, 203, 208, 209, 227, 229}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ControlService$licenceObserver$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ControlService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlService$licenceObserver$1$1(ControlService controlService, Continuation<? super ControlService$licenceObserver$1$1> continuation) {
        super(2, continuation);
        this.this$0 = controlService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ControlService$licenceObserver$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011a -> B:23:0x0084). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x017d -> B:61:0x0180). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0190 -> B:66:0x01a0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x019b -> B:66:0x01a0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bellyforex.tradeportea.ControlService$licenceObserver$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.bellyforex.tradeportea;

import android.util.Log;
import com.bellyforex.tradeportea.network.module.Signal;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.repository.RTRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ControlService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ControlService$signalsObserver$1$1", f = "ControlService.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ControlService$signalsObserver$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Signal $mySig;
    final /* synthetic */ Symbol $mySymbol;
    int label;
    final /* synthetic */ ControlService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlService$signalsObserver$1$1(Signal signal, ControlService controlService, Symbol symbol, Continuation<? super ControlService$signalsObserver$1$1> continuation) {
        super(2, continuation);
        this.$mySig = signal;
        this.this$0 = controlService;
        this.$mySymbol = symbol;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ControlService$signalsObserver$1$1(this.$mySig, this.this$0, this.$mySymbol, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        RTRepository rTRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("runnable", "got the signal" + this.$mySig.getId());
            rTRepository = this.this$0.rtRepository;
            this.label = 1;
            if (rTRepository.saveSignals(new Signal(this.$mySig.getId(), this.$mySig.getAction(), this.$mySig.getAsset(), this.$mySig.getLatestupdate(), this.$mySig.getPrice(), this.$mySig.getSl(), this.$mySig.getTime(), this.$mySig.getTp(), this.$mySymbol.getLotSize(), this.$mySymbol.getPlatform(), this.$mySig.getUsed()), (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

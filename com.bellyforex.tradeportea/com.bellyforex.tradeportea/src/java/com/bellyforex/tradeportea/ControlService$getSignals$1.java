package com.bellyforex.tradeportea;

import androidx.lifecycle.MutableLiveData;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.repository.RTRepository;
import com.bellyforex.tradeportea.utils.Resource;
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
import retrofit2.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ControlService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ControlService$getSignals$1", f = "ControlService.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ControlService$getSignals$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthBody $authBody;
    int label;
    final /* synthetic */ ControlService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlService$getSignals$1(ControlService controlService, AuthBody authBody, Continuation<? super ControlService$getSignals$1> continuation) {
        super(2, continuation);
        this.this$0 = controlService;
        this.$authBody = authBody;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ControlService$getSignals$1(this.this$0, this.$authBody, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        RTRepository rTRepository;
        MutableLiveData mutableLiveData3;
        Resource handleSignalResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableLiveData2 = this.this$0.signalData;
                mutableLiveData2.postValue(new Resource.Loading());
                rTRepository = this.this$0.rtRepository;
                this.label = 1;
                obj = rTRepository.getSignals(this.$authBody, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData3 = this.this$0.signalData;
            handleSignalResponse = this.this$0.handleSignalResponse((Response) obj);
            mutableLiveData3.postValue(handleSignalResponse);
        } catch (Throwable unused) {
            mutableLiveData = this.this$0.signalData;
            mutableLiveData.postValue(new Resource.Error("Oops! Something went wrong", null, 2, null));
        }
        return Unit.INSTANCE;
    }
}

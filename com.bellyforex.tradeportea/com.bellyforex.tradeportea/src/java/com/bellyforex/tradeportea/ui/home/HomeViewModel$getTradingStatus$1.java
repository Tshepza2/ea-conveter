package com.bellyforex.tradeportea.ui.home;

import com.bellyforex.tradeportea.ControlService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.home.HomeViewModel$getTradingStatus$1", f = "HomeViewModel.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class HomeViewModel$getTradingStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ControlService $mService;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getTradingStatus$1(ControlService controlService, HomeViewModel homeViewModel, Continuation<? super HomeViewModel$getTradingStatus$1> continuation) {
        super(2, continuation);
        this.$mService = controlService;
        this.this$0 = homeViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$getTradingStatus$1(this.$mService, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> status = this.$mService.getStatus();
            final HomeViewModel homeViewModel = this.this$0;
            this.label = 1;
            if (status.collect(new FlowCollector() { // from class: com.bellyforex.tradeportea.ui.home.HomeViewModel$getTradingStatus$1.1
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    HomeViewModel.this.getTradingInProgress().postValue(Boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }
            }, (Continuation) this) == coroutine_suspended) {
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

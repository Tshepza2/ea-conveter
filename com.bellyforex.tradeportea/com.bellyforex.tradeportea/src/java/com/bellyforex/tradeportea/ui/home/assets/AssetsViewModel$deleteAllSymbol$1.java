package com.bellyforex.tradeportea.ui.home.assets;

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
/* compiled from: AssetsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.home.assets.AssetsViewModel$deleteAllSymbol$1", f = "AssetsViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AssetsViewModel$deleteAllSymbol$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $phone_secret;
    int label;
    final /* synthetic */ AssetsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsViewModel$deleteAllSymbol$1(AssetsViewModel assetsViewModel, String str, Continuation<? super AssetsViewModel$deleteAllSymbol$1> continuation) {
        super(2, continuation);
        this.this$0 = assetsViewModel;
        this.$phone_secret = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetsViewModel$deleteAllSymbol$1(this.this$0, this.$phone_secret, continuation);
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
            rTRepository = this.this$0.rtRepository;
            this.label = 1;
            if (rTRepository.deleteAllSymbol(this.$phone_secret, (Continuation) this) == coroutine_suspended) {
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

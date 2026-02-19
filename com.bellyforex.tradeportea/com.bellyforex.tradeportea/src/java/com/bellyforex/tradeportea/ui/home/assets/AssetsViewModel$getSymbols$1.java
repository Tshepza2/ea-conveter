package com.bellyforex.tradeportea.ui.home.assets;

import androidx.lifecycle.MutableLiveData;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Symbols;
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
/* compiled from: AssetsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.home.assets.AssetsViewModel$getSymbols$1", f = "AssetsViewModel.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AssetsViewModel$getSymbols$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthBody $authBody;
    int label;
    final /* synthetic */ AssetsViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsViewModel$getSymbols$1(AssetsViewModel assetsViewModel, AuthBody authBody, Continuation<? super AssetsViewModel$getSymbols$1> continuation) {
        super(2, continuation);
        this.this$0 = assetsViewModel;
        this.$authBody = authBody;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetsViewModel$getSymbols$1(this.this$0, this.$authBody, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        RTRepository rTRepository;
        Resource handleSymbolsResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getSymbolsData().postValue(new Resource.Loading());
                rTRepository = this.this$0.rtRepository;
                this.label = 1;
                obj = rTRepository.getSymbols(this.$authBody, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            MutableLiveData<Resource<Symbols>> symbolsData = this.this$0.getSymbolsData();
            handleSymbolsResponse = this.this$0.handleSymbolsResponse((Response) obj);
            symbolsData.postValue(handleSymbolsResponse);
        } catch (Throwable unused) {
            this.this$0.getSymbolsData().postValue(new Resource.Error("Oops! Something went wrong", null, 2, null));
        }
        return Unit.INSTANCE;
    }
}

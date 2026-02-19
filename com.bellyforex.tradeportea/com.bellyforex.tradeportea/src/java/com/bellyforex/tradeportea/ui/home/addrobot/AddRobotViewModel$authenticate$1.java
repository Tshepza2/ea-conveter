package com.bellyforex.tradeportea.ui.home.addrobot;

import androidx.lifecycle.MutableLiveData;
import com.bellyforex.tradeportea.network.module.Account;
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
/* compiled from: AddRobotViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.home.addrobot.AddRobotViewModel$authenticate$1", f = "AddRobotViewModel.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AddRobotViewModel$authenticate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AuthBody $authBody;
    int label;
    final /* synthetic */ AddRobotViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddRobotViewModel$authenticate$1(AddRobotViewModel addRobotViewModel, AuthBody authBody, Continuation<? super AddRobotViewModel$authenticate$1> continuation) {
        super(2, continuation);
        this.this$0 = addRobotViewModel;
        this.$authBody = authBody;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddRobotViewModel$authenticate$1(this.this$0, this.$authBody, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        RTRepository rTRepository;
        Resource handleAccountResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getAccountData().postValue(new Resource.Loading());
                rTRepository = this.this$0.rtRepository;
                this.label = 1;
                obj = rTRepository.authenticate(this.$authBody, (Continuation) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            MutableLiveData<Resource<Account>> accountData = this.this$0.getAccountData();
            handleAccountResponse = this.this$0.handleAccountResponse((Response) obj);
            accountData.postValue(handleAccountResponse);
        } catch (Throwable unused) {
            this.this$0.getAccountData().postValue(new Resource.Error("Oops! Something went wrong", null, 2, null));
        }
        return Unit.INSTANCE;
    }
}

package com.bellyforex.tradeportea.ui.home;

import androidx.lifecycle.MutableLiveData;
import com.bellyforex.tradeportea.network.module.App;
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
/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.bellyforex.tradeportea.ui.home.HomeViewModel$getApp$1", f = "HomeViewModel.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class HomeViewModel$getApp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $email;
    final /* synthetic */ Boolean $use;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getApp$1(HomeViewModel homeViewModel, String str, Boolean bool, Continuation<? super HomeViewModel$getApp$1> continuation) {
        super(2, continuation);
        this.this$0 = homeViewModel;
        this.$email = str;
        this.$use = bool;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$getApp$1(this.this$0, this.$email, this.$use, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MutableLiveData<Resource<App>> app;
        RTRepository rTRepository;
        HomeViewModel homeViewModel;
        Resource handleappresponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getApp().postValue(new Resource.Loading());
                app = this.this$0.getApp();
                HomeViewModel homeViewModel2 = this.this$0;
                rTRepository = homeViewModel2.rtRepository;
                this.L$0 = app;
                this.L$1 = homeViewModel2;
                this.label = 1;
                Object app2 = rTRepository.getApp(this.$email, this.$use, (Continuation) this);
                if (app2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                homeViewModel = homeViewModel2;
                obj = app2;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                homeViewModel = (HomeViewModel) this.L$1;
                app = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            handleappresponse = homeViewModel.handleappresponse((Response) obj);
            app.postValue(handleappresponse);
        } catch (Throwable th) {
            this.this$0.getApp().postValue(new Resource.Error("something went wrong " + th, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}

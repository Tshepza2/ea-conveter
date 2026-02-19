package com.bellyforex.tradeportea.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bellyforex.tradeportea.ControlService;
import com.bellyforex.tradeportea.network.module.App;
import com.bellyforex.tradeportea.repository.RTRepository;
import com.bellyforex.tradeportea.utils.Resource;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import retrofit2.Response;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\t\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "rtRepository", "Lcom/bellyforex/tradeportea/repository/RTRepository;", "(Lcom/bellyforex/tradeportea/repository/RTRepository;)V", "app", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bellyforex/tradeportea/utils/Resource;", "Lcom/bellyforex/tradeportea/network/module/App;", "getApp", "()Landroidx/lifecycle/MutableLiveData;", "tradingInProgress", "", "getTradingInProgress", "Lkotlinx/coroutines/Job;", "email", "", "use", "(Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/coroutines/Job;", "getTradingStatus", "mService", "Lcom/bellyforex/tradeportea/ControlService;", "handleappresponse", "res", "Lretrofit2/Response;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class HomeViewModel extends ViewModel {
    private final MutableLiveData<Resource<App>> app;
    private final RTRepository rtRepository;
    private final MutableLiveData<Boolean> tradingInProgress;

    public HomeViewModel(RTRepository rTRepository) {
        Intrinsics.checkNotNullParameter(rTRepository, "rtRepository");
        this.rtRepository = rTRepository;
        this.tradingInProgress = new MutableLiveData<>();
        this.app = new MutableLiveData<>();
    }

    public final MutableLiveData<Boolean> getTradingInProgress() {
        return this.tradingInProgress;
    }

    public final MutableLiveData<Resource<App>> getApp() {
        return this.app;
    }

    public final Job getTradingStatus(ControlService controlService) {
        Intrinsics.checkNotNullParameter(controlService, "mService");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$getTradingStatus$1(controlService, this, null), 3, (Object) null);
    }

    public final Job getApp(String str, Boolean bool) {
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HomeViewModel$getApp$1(this, str, bool, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Resource<App> handleappresponse(Response<App> response) {
        App app;
        if (response.isSuccessful() && (app = (App) response.body()) != null) {
            return new Resource.Success(app);
        }
        return new Resource.Error("something went wrong ", null, 2, null);
    }
}

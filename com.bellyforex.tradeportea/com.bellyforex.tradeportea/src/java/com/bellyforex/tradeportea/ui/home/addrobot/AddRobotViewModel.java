package com.bellyforex.tradeportea.ui.home.addrobot;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bellyforex.tradeportea.network.module.Account;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Licence;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.repository.RTRepository;
import com.bellyforex.tradeportea.utils.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import retrofit2.Response;

/* compiled from: AddRobotViewModel.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0014J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u0014J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;", "Landroidx/lifecycle/ViewModel;", "rtRepository", "Lcom/bellyforex/tradeportea/repository/RTRepository;", "(Lcom/bellyforex/tradeportea/repository/RTRepository;)V", "accountData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bellyforex/tradeportea/utils/Resource;", "Lcom/bellyforex/tradeportea/network/module/Account;", "getAccountData", "()Landroidx/lifecycle/MutableLiveData;", "authenticate", "Lkotlinx/coroutines/Job;", "authBody", "Lcom/bellyforex/tradeportea/network/module/AuthBody;", "deleteLicence", "licence", "Lcom/bellyforex/tradeportea/network/module/Licence;", "deleteSicence", "getLicences", "Landroidx/lifecycle/LiveData;", "", "getSelectedLicences", "Lcom/bellyforex/tradeportea/network/module/Sicence;", "handleAccountResponse", "response", "Lretrofit2/Response;", "saveLicence", "saveSicence", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AddRobotViewModel extends ViewModel {
    private final MutableLiveData<Resource<Account>> accountData;
    private final RTRepository rtRepository;

    public AddRobotViewModel(RTRepository rTRepository) {
        Intrinsics.checkNotNullParameter(rTRepository, "rtRepository");
        this.rtRepository = rTRepository;
        this.accountData = new MutableLiveData<>();
    }

    public final MutableLiveData<Resource<Account>> getAccountData() {
        return this.accountData;
    }

    public final Job authenticate(AuthBody authBody) {
        Intrinsics.checkNotNullParameter(authBody, "authBody");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AddRobotViewModel$authenticate$1(this, authBody, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Resource<Account> handleAccountResponse(Response<Account> response) {
        Account account;
        if (response.isSuccessful() && (account = (Account) response.body()) != null) {
            if (Intrinsics.areEqual(account.getMessage(), "used")) {
                return new Resource.Error("The License key is already used in another device.", null, 2, null);
            }
            if (Intrinsics.areEqual(account.getMessage(), "accept")) {
                saveLicence(account.getLicence());
                saveSicence(account.getLicence());
                return new Resource.Success(account);
            }
            return new Resource.Error("Unknown Error Occurred!!", null, 2, null);
        }
        String message = response.message();
        Intrinsics.checkNotNullExpressionValue(message, "message(...)");
        return new Resource.Error(message, null, 2, null);
    }

    private final Job saveLicence(Licence licence) {
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AddRobotViewModel$saveLicence$1(this, licence, null), 3, (Object) null);
    }

    public final LiveData<List<Licence>> getLicences() {
        return this.rtRepository.getLicences();
    }

    public final Job deleteLicence(Licence licence) {
        Intrinsics.checkNotNullParameter(licence, "licence");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AddRobotViewModel$deleteLicence$1(this, licence, null), 3, (Object) null);
    }

    public final Job deleteSicence(Licence licence) {
        Intrinsics.checkNotNullParameter(licence, "licence");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AddRobotViewModel$deleteSicence$1(licence, this, null), 3, (Object) null);
    }

    private final Job saveSicence(Licence licence) {
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AddRobotViewModel$saveSicence$1(licence, this, null), 3, (Object) null);
    }

    public final LiveData<List<Sicence>> getSelectedLicences() {
        return this.rtRepository.getSicences();
    }
}

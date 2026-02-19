package com.bellyforex.tradeportea.ui.home.assets;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.network.module.Symbols;
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

/* compiled from: AssetsViewModel.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/assets/AssetsViewModel;", "Landroidx/lifecycle/ViewModel;", "rtRepository", "Lcom/bellyforex/tradeportea/repository/RTRepository;", "(Lcom/bellyforex/tradeportea/repository/RTRepository;)V", "symbolsData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bellyforex/tradeportea/utils/Resource;", "Lcom/bellyforex/tradeportea/network/module/Symbols;", "getSymbolsData", "()Landroidx/lifecycle/MutableLiveData;", "deleteAllSymbol", "Lkotlinx/coroutines/Job;", "phone_secret", "", "deleteSymbol", "symbol", "Lcom/bellyforex/tradeportea/network/module/Symbol;", "getSavedSymbols", "Landroidx/lifecycle/LiveData;", "", "phone_secret_key", "getSymbols", "authBody", "Lcom/bellyforex/tradeportea/network/module/AuthBody;", "handleSymbolsResponse", "response", "Lretrofit2/Response;", "saveSymbol", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AssetsViewModel extends ViewModel {
    private final RTRepository rtRepository;
    private final MutableLiveData<Resource<Symbols>> symbolsData;

    public AssetsViewModel(RTRepository rTRepository) {
        Intrinsics.checkNotNullParameter(rTRepository, "rtRepository");
        this.rtRepository = rTRepository;
        this.symbolsData = new MutableLiveData<>();
    }

    public final MutableLiveData<Resource<Symbols>> getSymbolsData() {
        return this.symbolsData;
    }

    public final Job getSymbols(AuthBody authBody) {
        Intrinsics.checkNotNullParameter(authBody, "authBody");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AssetsViewModel$getSymbols$1(this, authBody, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Resource<Symbols> handleSymbolsResponse(Response<Symbols> response) {
        Symbols symbols;
        if (response.isSuccessful() && (symbols = (Symbols) response.body()) != null) {
            if (Intrinsics.areEqual(symbols.getMessage(), "accept")) {
                return new Resource.Success(symbols);
            }
            return new Resource.Error("Unknown Error Occurred!!", null, 2, null);
        }
        String message = response.message();
        Intrinsics.checkNotNullExpressionValue(message, "message(...)");
        return new Resource.Error(message, null, 2, null);
    }

    public final Job saveSymbol(Symbol symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AssetsViewModel$saveSymbol$1(this, symbol, null), 3, (Object) null);
    }

    public final LiveData<List<Symbol>> getSavedSymbols(String str) {
        Intrinsics.checkNotNullParameter(str, "phone_secret_key");
        return this.rtRepository.getSavedSymbols(str);
    }

    public final Job deleteSymbol(Symbol symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AssetsViewModel$deleteSymbol$1(this, symbol, null), 3, (Object) null);
    }

    public final Job deleteAllSymbol(String str) {
        Intrinsics.checkNotNullParameter(str, "phone_secret");
        return BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new AssetsViewModel$deleteAllSymbol$1(this, str, null), 3, (Object) null);
    }
}

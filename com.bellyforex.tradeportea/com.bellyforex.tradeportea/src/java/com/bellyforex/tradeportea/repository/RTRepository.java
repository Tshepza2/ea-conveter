package com.bellyforex.tradeportea.repository;

import androidx.lifecycle.LiveData;
import com.bellyforex.tradeportea.network.api.RetrofitInstance;
import com.bellyforex.tradeportea.network.db.LicenceDB;
import com.bellyforex.tradeportea.network.module.Account;
import com.bellyforex.tradeportea.network.module.App;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Licence;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.network.module.Signal;
import com.bellyforex.tradeportea.network.module.Signals;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.network.module.Symbols;
import com.bellyforex.tradeportea.network.module.log;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* compiled from: RTRepository.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\b\u0010 \u001a\u0004\u0018\u00010\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0002\u0010#J\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%J\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0&0%J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120&0%J\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0&0%2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170&0%J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u001c\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)H\u0086@¢\u0006\u0002\u00104J\u0016\u00105\u001a\u0002022\u0006\u00103\u001a\u00020)H\u0086@¢\u0006\u0002\u00104J\u0016\u00106\u001a\u0002022\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0016\u00107\u001a\u0002022\u0006\u00108\u001a\u00020'H\u0086@¢\u0006\u0002\u00109J\u0016\u0010:\u001a\u0002022\u0006\u0010\u0011\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010;\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/bellyforex/tradeportea/repository/RTRepository;", "", "db", "Lcom/bellyforex/tradeportea/network/db/LicenceDB;", "(Lcom/bellyforex/tradeportea/network/db/LicenceDB;)V", "authenticate", "Lretrofit2/Response;", "Lcom/bellyforex/tradeportea/network/module/Account;", "authBody", "Lcom/bellyforex/tradeportea/network/module/AuthBody;", "(Lcom/bellyforex/tradeportea/network/module/AuthBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllSymbol", "", "phone_secret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLicence", "licence", "Lcom/bellyforex/tradeportea/network/module/Licence;", "(Lcom/bellyforex/tradeportea/network/module/Licence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLogs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSicence", "Lcom/bellyforex/tradeportea/network/module/Sicence;", "(Lcom/bellyforex/tradeportea/network/module/Sicence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSignals", "deleteSymbol", "symbol", "Lcom/bellyforex/tradeportea/network/module/Symbol;", "(Lcom/bellyforex/tradeportea/network/module/Symbol;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getApp", "Lcom/bellyforex/tradeportea/network/module/App;", "email", "use", "", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDBLogs", "Landroidx/lifecycle/LiveData;", "", "Lcom/bellyforex/tradeportea/network/module/log;", "getDBSignals", "Lcom/bellyforex/tradeportea/network/module/Signal;", "getLicences", "getSavedSymbols", "getSicences", "getSignals", "Lcom/bellyforex/tradeportea/network/module/Signals;", "getSymbols", "Lcom/bellyforex/tradeportea/network/module/Symbols;", "saveSignals", "", "signal", "(Lcom/bellyforex/tradeportea/network/module/Signal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSignals", "upsetLicence", "upsetLog", "log", "(Lcom/bellyforex/tradeportea/network/module/log;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsetSel", "upsetSymbol", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class RTRepository {
    private final LicenceDB db;

    public RTRepository(LicenceDB licenceDB) {
        Intrinsics.checkNotNullParameter(licenceDB, "db");
        this.db = licenceDB;
    }

    public final Object authenticate(AuthBody authBody, Continuation<? super Response<Account>> continuation) {
        return RetrofitInstance.Companion.getApi().authenticate(authBody, continuation);
    }

    public final Object getSignals(AuthBody authBody, Continuation<? super Response<Signals>> continuation) {
        return RetrofitInstance.Companion.getApi().getSignals(authBody.getPhone_secret(), continuation);
    }

    public final Object getSymbols(AuthBody authBody, Continuation<? super Response<Symbols>> continuation) {
        return RetrofitInstance.Companion.getApi().getSymbols(authBody.getPhone_secret(), continuation);
    }

    public final Object getApp(String str, Boolean bool, Continuation<? super Response<App>> continuation) {
        return RetrofitInstance.Companion.getApi().getApp(str, bool, continuation);
    }

    public final Object upsetLicence(Licence licence, Continuation<? super Long> continuation) {
        return this.db.getLicenceDao().upsert(licence, continuation);
    }

    public final LiveData<List<Licence>> getLicences() {
        return this.db.getLicenceDao().getDBLicences();
    }

    public final Object deleteLicence(Licence licence, Continuation<? super Unit> continuation) {
        Object deleteLicence = this.db.getLicenceDao().deleteLicence(licence, continuation);
        return deleteLicence == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteLicence : Unit.INSTANCE;
    }

    public final Object upsetSel(Sicence sicence, Continuation<? super Long> continuation) {
        return this.db.getLicenceDao().selectedupsert(sicence, continuation);
    }

    public final LiveData<List<Sicence>> getSicences() {
        return this.db.getLicenceDao().getSELicences();
    }

    public final Object deleteSicence(Sicence sicence, Continuation<? super Unit> continuation) {
        Object deleteSicence = this.db.getLicenceDao().deleteSicence(sicence, continuation);
        return deleteSicence == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSicence : Unit.INSTANCE;
    }

    public final Object upsetSymbol(Symbol symbol, Continuation<? super Long> continuation) {
        return this.db.getLicenceDao().upsetSymbol(symbol, continuation);
    }

    public final LiveData<List<Symbol>> getSavedSymbols(String str) {
        Intrinsics.checkNotNullParameter(str, "phone_secret");
        return this.db.getLicenceDao().getSavedSymbols(str);
    }

    public final Object deleteSymbol(Symbol symbol, Continuation<? super Unit> continuation) {
        Object deleteSymbol = this.db.getLicenceDao().deleteSymbol(symbol, continuation);
        return deleteSymbol == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSymbol : Unit.INSTANCE;
    }

    public final Object deleteAllSymbol(String str, Continuation<? super Unit> continuation) {
        Object deleteAllSymbol = this.db.getLicenceDao().deleteAllSymbol(str, continuation);
        return deleteAllSymbol == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteAllSymbol : Unit.INSTANCE;
    }

    public final Object saveSignals(Signal signal, Continuation<? super Long> continuation) {
        return this.db.getLicenceDao().saveSignals(signal, continuation);
    }

    public final Object updateSignals(Signal signal, Continuation<? super Long> continuation) {
        return this.db.getLicenceDao().updateSignals(signal, continuation);
    }

    public final LiveData<List<Signal>> getDBSignals() {
        return this.db.getLicenceDao().getDBSignals();
    }

    public final Object deleteSignals(Continuation<? super Unit> continuation) {
        Object deleteSignals = this.db.getLicenceDao().deleteSignals(continuation);
        return deleteSignals == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteSignals : Unit.INSTANCE;
    }

    public final Object upsetLog(log logVar, Continuation<? super Long> continuation) {
        return this.db.getLicenceDao().upSetLog(logVar, continuation);
    }

    public final LiveData<List<log>> getDBLogs() {
        return this.db.getLicenceDao().getDBLogs();
    }

    public final Object deleteLogs(Continuation<? super Unit> continuation) {
        Object deleteLogs = this.db.getLicenceDao().deleteLogs(continuation);
        return deleteLogs == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteLogs : Unit.INSTANCE;
    }
}

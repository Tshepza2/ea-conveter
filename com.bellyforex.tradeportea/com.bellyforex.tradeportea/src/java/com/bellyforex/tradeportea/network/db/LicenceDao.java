package com.bellyforex.tradeportea.network.db;

import androidx.lifecycle.LiveData;
import com.bellyforex.tradeportea.network.module.Licence;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.network.module.Signal;
import com.bellyforex.tradeportea.network.module.Symbol;
import com.bellyforex.tradeportea.network.module.log;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: LicenceDao.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00170\u0016H'J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00170\u0016H'J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u0016H'J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u0016H'J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00170\u00162\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH§@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0019H§@¢\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH§@¢\u0006\u0002\u0010!J\u0016\u0010'\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010(\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014¨\u0006)"}, d2 = {"Lcom/bellyforex/tradeportea/network/db/LicenceDao;", "", "deleteAllSymbol", "", "phone_secret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLicence", "licence", "Lcom/bellyforex/tradeportea/network/module/Licence;", "(Lcom/bellyforex/tradeportea/network/module/Licence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLogs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSicence", "Lcom/bellyforex/tradeportea/network/module/Sicence;", "(Lcom/bellyforex/tradeportea/network/module/Sicence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSignals", "deleteSymbol", "symbol", "Lcom/bellyforex/tradeportea/network/module/Symbol;", "(Lcom/bellyforex/tradeportea/network/module/Symbol;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDBLicences", "Landroidx/lifecycle/LiveData;", "", "getDBLogs", "Lcom/bellyforex/tradeportea/network/module/log;", "getDBSignals", "Lcom/bellyforex/tradeportea/network/module/Signal;", "getSELicences", "getSavedSymbols", "saveSignals", "", "signal", "(Lcom/bellyforex/tradeportea/network/module/Signal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedupsert", "upSetLog", "log", "(Lcom/bellyforex/tradeportea/network/module/log;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSignals", "upsert", "upsetSymbol", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public interface LicenceDao {
    Object deleteAllSymbol(String str, Continuation<? super Unit> continuation);

    Object deleteLicence(Licence licence, Continuation<? super Unit> continuation);

    Object deleteLogs(Continuation<? super Unit> continuation);

    Object deleteSicence(Sicence sicence, Continuation<? super Unit> continuation);

    Object deleteSignals(Continuation<? super Unit> continuation);

    Object deleteSymbol(Symbol symbol, Continuation<? super Unit> continuation);

    LiveData<List<Licence>> getDBLicences();

    LiveData<List<log>> getDBLogs();

    LiveData<List<Signal>> getDBSignals();

    LiveData<List<Sicence>> getSELicences();

    LiveData<List<Symbol>> getSavedSymbols(String str);

    Object saveSignals(Signal signal, Continuation<? super Long> continuation);

    Object selectedupsert(Sicence sicence, Continuation<? super Long> continuation);

    Object upSetLog(log logVar, Continuation<? super Long> continuation);

    Object updateSignals(Signal signal, Continuation<? super Long> continuation);

    Object upsert(Licence licence, Continuation<? super Long> continuation);

    Object upsetSymbol(Symbol symbol, Continuation<? super Long> continuation);
}

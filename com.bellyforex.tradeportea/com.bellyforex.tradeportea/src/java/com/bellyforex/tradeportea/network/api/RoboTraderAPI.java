package com.bellyforex.tradeportea.network.api;

import com.bellyforex.tradeportea.network.module.Account;
import com.bellyforex.tradeportea.network.module.App;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Signals;
import com.bellyforex.tradeportea.network.module.Symbols;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: RoboTraderAPI.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0002\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bellyforex/tradeportea/network/api/RoboTraderAPI;", "", "authenticate", "Lretrofit2/Response;", "Lcom/bellyforex/tradeportea/network/module/Account;", "authBody", "Lcom/bellyforex/tradeportea/network/module/AuthBody;", "(Lcom/bellyforex/tradeportea/network/module/AuthBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getApp", "Lcom/bellyforex/tradeportea/network/module/App;", "email", "", "use", "", "(Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSignals", "Lcom/bellyforex/tradeportea/network/module/Signals;", "phone_secret", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSymbols", "Lcom/bellyforex/tradeportea/network/module/Symbols;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public interface RoboTraderAPI {
    @POST("auth/")
    Object authenticate(@Body AuthBody authBody, Continuation<? super Response<Account>> continuation);

    @GET("auth/app/")
    Object getApp(@Query("email") String str, @Query("use") Boolean bool, Continuation<? super Response<App>> continuation);

    @GET("signals/")
    Object getSignals(@Query("phone_secret") String str, Continuation<? super Response<Signals>> continuation);

    @GET("symbols/")
    Object getSymbols(@Query("phone_secret") String str, Continuation<? super Response<Symbols>> continuation);
}

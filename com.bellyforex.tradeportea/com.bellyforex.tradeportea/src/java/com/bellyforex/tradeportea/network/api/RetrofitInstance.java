package com.bellyforex.tradeportea.network.api;

import com.bellyforex.tradeportea.utils.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: RetrofitInstance.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bellyforex/tradeportea/network/api/RetrofitInstance;", "", "()V", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class RetrofitInstance {
    public static final Companion Companion = new Companion(null);
    private static final Lazy<Retrofit> retrofit$delegate = LazyKt.lazy(new Function0<Retrofit>() { // from class: com.bellyforex.tradeportea.network.api.RetrofitInstance$Companion$retrofit$2
        public final Retrofit invoke() {
            Interceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null);
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
            return new Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()).build();
        }
    });
    private static final Lazy<RoboTraderAPI> api$delegate = LazyKt.lazy(new Function0<RoboTraderAPI>() { // from class: com.bellyforex.tradeportea.network.api.RetrofitInstance$Companion$api$2
        /* renamed from: invoke */
        public final RoboTraderAPI m24invoke() {
            Retrofit retrofit;
            retrofit = RetrofitInstance.Companion.getRetrofit();
            return (RoboTraderAPI) retrofit.create(RoboTraderAPI.class);
        }
    });

    /* compiled from: RetrofitInstance.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/bellyforex/tradeportea/network/api/RetrofitInstance$Companion;", "", "()V", "api", "Lcom/bellyforex/tradeportea/network/api/RoboTraderAPI;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/bellyforex/tradeportea/network/api/RoboTraderAPI;", "api$delegate", "Lkotlin/Lazy;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Retrofit getRetrofit() {
            return (Retrofit) RetrofitInstance.retrofit$delegate.getValue();
        }

        public final RoboTraderAPI getApi() {
            return (RoboTraderAPI) RetrofitInstance.api$delegate.getValue();
        }
    }
}

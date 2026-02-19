package com.bellyforex.tradeportea.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Resource.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\f\r\u000eB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bellyforex/tradeportea/utils/Resource;", "T", "", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "Error", "Loading", "Success", "Lcom/bellyforex/tradeportea/utils/Resource$Error;", "Lcom/bellyforex/tradeportea/utils/Resource$Loading;", "Lcom/bellyforex/tradeportea/utils/Resource$Success;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public abstract class Resource<T> {
    private final T data;
    private final String message;

    public /* synthetic */ Resource(Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str);
    }

    private Resource(T t, String str) {
        this.data = t;
        this.message = str;
    }

    public /* synthetic */ Resource(Object obj, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, null);
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bellyforex/tradeportea/utils/Resource$Success;", "T", "Lcom/bellyforex/tradeportea/utils/Resource;", "data", "(Ljava/lang/Object;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public static final class Success<T> extends Resource<T> {
        public Success(T t) {
            super(t, null, 2, null);
        }
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bellyforex/tradeportea/utils/Resource$Error;", "T", "Lcom/bellyforex/tradeportea/utils/Resource;", "message", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public static final class Error<T> extends Resource<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, T t) {
            super(t, str, null);
            Intrinsics.checkNotNullParameter(str, "message");
        }

        public /* synthetic */ Error(String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : obj);
        }
    }

    /* compiled from: Resource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bellyforex/tradeportea/utils/Resource$Loading;", "T", "Lcom/bellyforex/tradeportea/utils/Resource;", "()V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public static final class Loading<T> extends Resource<T> {
        public Loading() {
            super(null, null, 3, null);
        }
    }
}

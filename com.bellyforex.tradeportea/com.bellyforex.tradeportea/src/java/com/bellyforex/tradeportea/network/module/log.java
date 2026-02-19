package com.bellyforex.tradeportea.network.module;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: log.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/log;", "", "id", "", "message", "", "(ILjava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class log {
    private int id;
    private String message;

    public static /* synthetic */ log copy$default(log logVar, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = logVar.id;
        }
        if ((i2 & 2) != 0) {
            str = logVar.message;
        }
        return logVar.copy(i, str);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.message;
    }

    public final log copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        return new log(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof log) {
            log logVar = (log) obj;
            return this.id == logVar.id && Intrinsics.areEqual(this.message, logVar.message);
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.message.hashCode();
    }

    public String toString() {
        int i = this.id;
        return "log(id=" + i + ", message=" + this.message + ")";
    }

    public log(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.id = i;
        this.message = str;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }
}

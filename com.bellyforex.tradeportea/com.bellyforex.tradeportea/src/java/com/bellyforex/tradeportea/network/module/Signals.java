package com.bellyforex.tradeportea.network.module;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Signals.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Signals;", "", "signal", "Lcom/bellyforex/tradeportea/network/module/Signal;", "message", "", "(Lcom/bellyforex/tradeportea/network/module/Signal;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getSignal", "()Lcom/bellyforex/tradeportea/network/module/Signal;", "setSignal", "(Lcom/bellyforex/tradeportea/network/module/Signal;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Signals {
    private String message;
    @SerializedName("data")
    private Signal signal;

    public static /* synthetic */ Signals copy$default(Signals signals, Signal signal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            signal = signals.signal;
        }
        if ((i & 2) != 0) {
            str = signals.message;
        }
        return signals.copy(signal, str);
    }

    public final Signal component1() {
        return this.signal;
    }

    public final String component2() {
        return this.message;
    }

    public final Signals copy(Signal signal, String str) {
        Intrinsics.checkNotNullParameter(signal, "signal");
        Intrinsics.checkNotNullParameter(str, "message");
        return new Signals(signal, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Signals) {
            Signals signals = (Signals) obj;
            return Intrinsics.areEqual(this.signal, signals.signal) && Intrinsics.areEqual(this.message, signals.message);
        }
        return false;
    }

    public int hashCode() {
        return (this.signal.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        Signal signal = this.signal;
        return "Signals(signal=" + signal + ", message=" + this.message + ")";
    }

    public Signals(Signal signal, String str) {
        Intrinsics.checkNotNullParameter(signal, "signal");
        Intrinsics.checkNotNullParameter(str, "message");
        this.signal = signal;
        this.message = str;
    }

    public final Signal getSignal() {
        return this.signal;
    }

    public final void setSignal(Signal signal) {
        Intrinsics.checkNotNullParameter(signal, "<set-?>");
        this.signal = signal;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }
}

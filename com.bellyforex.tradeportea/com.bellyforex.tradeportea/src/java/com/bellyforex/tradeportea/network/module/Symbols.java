package com.bellyforex.tradeportea.network.module;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Symbols.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Symbols;", "", "symbols", "", "Lcom/bellyforex/tradeportea/network/module/Symbol;", "message", "", "(Ljava/util/List;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getSymbols", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Symbols {
    private final String message;
    @SerializedName("data")
    private final List<Symbol> symbols;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Symbols copy$default(Symbols symbols, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = symbols.symbols;
        }
        if ((i & 2) != 0) {
            str = symbols.message;
        }
        return symbols.copy(list, str);
    }

    public final List<Symbol> component1() {
        return this.symbols;
    }

    public final String component2() {
        return this.message;
    }

    public final Symbols copy(List<Symbol> list, String str) {
        Intrinsics.checkNotNullParameter(list, "symbols");
        Intrinsics.checkNotNullParameter(str, "message");
        return new Symbols(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Symbols) {
            Symbols symbols = (Symbols) obj;
            return Intrinsics.areEqual(this.symbols, symbols.symbols) && Intrinsics.areEqual(this.message, symbols.message);
        }
        return false;
    }

    public int hashCode() {
        return (this.symbols.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        List<Symbol> list = this.symbols;
        return "Symbols(symbols=" + list + ", message=" + this.message + ")";
    }

    public Symbols(List<Symbol> list, String str) {
        Intrinsics.checkNotNullParameter(list, "symbols");
        Intrinsics.checkNotNullParameter(str, "message");
        this.symbols = list;
        this.message = str;
    }

    public final List<Symbol> getSymbols() {
        return this.symbols;
    }

    public final String getMessage() {
        return this.message;
    }
}

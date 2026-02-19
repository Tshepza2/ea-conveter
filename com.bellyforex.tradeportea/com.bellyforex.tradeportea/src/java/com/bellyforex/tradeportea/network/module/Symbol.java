package com.bellyforex.tradeportea.network.module;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Symbol.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JR\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Symbol;", "Ljava/io/Serializable;", "id", "", "name", "", "phone_secret", "lotSize", "", "action", "platform", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getId", "()I", "getLotSize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getName", "getPhone_secret", "getPlatform", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/bellyforex/tradeportea/network/module/Symbol;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Symbol implements Serializable {
    private final String action;
    private final int id;
    private final Double lotSize;
    private final String name;
    private final String phone_secret;
    private final String platform;

    public static /* synthetic */ Symbol copy$default(Symbol symbol, int i, String str, String str2, Double d, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = symbol.id;
        }
        if ((i2 & 2) != 0) {
            str = symbol.name;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = symbol.phone_secret;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            d = symbol.lotSize;
        }
        Double d2 = d;
        if ((i2 & 16) != 0) {
            str3 = symbol.action;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = symbol.platform;
        }
        return symbol.copy(i, str5, str6, d2, str7, str4);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.phone_secret;
    }

    public final Double component4() {
        return this.lotSize;
    }

    public final String component5() {
        return this.action;
    }

    public final String component6() {
        return this.platform;
    }

    public final Symbol copy(int i, String str, String str2, Double d, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new Symbol(i, str, str2, d, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Symbol) {
            Symbol symbol = (Symbol) obj;
            return this.id == symbol.id && Intrinsics.areEqual(this.name, symbol.name) && Intrinsics.areEqual(this.phone_secret, symbol.phone_secret) && Intrinsics.areEqual(this.lotSize, symbol.lotSize) && Intrinsics.areEqual(this.action, symbol.action) && Intrinsics.areEqual(this.platform, symbol.platform);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31;
        String str = this.phone_secret;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.lotSize;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.action;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.phone_secret;
        Double d = this.lotSize;
        String str3 = this.action;
        return "Symbol(id=" + i + ", name=" + str + ", phone_secret=" + str2 + ", lotSize=" + d + ", action=" + str3 + ", platform=" + this.platform + ")";
    }

    public Symbol(int i, String str, String str2, Double d, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.id = i;
        this.name = str;
        this.phone_secret = str2;
        this.lotSize = d;
        this.action = str3;
        this.platform = str4;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone_secret() {
        return this.phone_secret;
    }

    public final Double getLotSize() {
        return this.lotSize;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getPlatform() {
        return this.platform;
    }
}

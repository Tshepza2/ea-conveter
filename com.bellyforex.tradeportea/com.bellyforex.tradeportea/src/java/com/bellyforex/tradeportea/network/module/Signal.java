package com.bellyforex.tradeportea.network.module;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Signal.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0080\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Signal;", "Ljava/io/Serializable;", "id", "", "action", "", "asset", "latestupdate", "price", "sl", "time", "tp", "lotSize", "", "platform", "used", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getAsset", "setAsset", "getId", "()I", "setId", "(I)V", "getLatestupdate", "setLatestupdate", "getLotSize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPlatform", "getPrice", "setPrice", "getSl", "setSl", "getTime", "setTime", "getTp", "setTp", "getUsed", "()Z", "setUsed", "(Z)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Z)Lcom/bellyforex/tradeportea/network/module/Signal;", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Signal implements Serializable {
    private String action;
    private String asset;
    private int id;
    private String latestupdate;
    private final Double lotSize;
    private final String platform;
    private String price;
    private String sl;
    private String time;
    private String tp;
    private boolean used;

    public final int component1() {
        return this.id;
    }

    public final String component10() {
        return this.platform;
    }

    public final boolean component11() {
        return this.used;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.asset;
    }

    public final String component4() {
        return this.latestupdate;
    }

    public final String component5() {
        return this.price;
    }

    public final String component6() {
        return this.sl;
    }

    public final String component7() {
        return this.time;
    }

    public final String component8() {
        return this.tp;
    }

    public final Double component9() {
        return this.lotSize;
    }

    public final Signal copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(str2, "asset");
        Intrinsics.checkNotNullParameter(str3, "latestupdate");
        Intrinsics.checkNotNullParameter(str4, "price");
        Intrinsics.checkNotNullParameter(str5, "sl");
        Intrinsics.checkNotNullParameter(str6, "time");
        Intrinsics.checkNotNullParameter(str7, "tp");
        return new Signal(i, str, str2, str3, str4, str5, str6, str7, d, str8, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Signal) {
            Signal signal = (Signal) obj;
            return this.id == signal.id && Intrinsics.areEqual(this.action, signal.action) && Intrinsics.areEqual(this.asset, signal.asset) && Intrinsics.areEqual(this.latestupdate, signal.latestupdate) && Intrinsics.areEqual(this.price, signal.price) && Intrinsics.areEqual(this.sl, signal.sl) && Intrinsics.areEqual(this.time, signal.time) && Intrinsics.areEqual(this.tp, signal.tp) && Intrinsics.areEqual(this.lotSize, signal.lotSize) && Intrinsics.areEqual(this.platform, signal.platform) && this.used == signal.used;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.id) * 31) + this.action.hashCode()) * 31) + this.asset.hashCode()) * 31) + this.latestupdate.hashCode()) * 31) + this.price.hashCode()) * 31) + this.sl.hashCode()) * 31) + this.time.hashCode()) * 31) + this.tp.hashCode()) * 31;
        Double d = this.lotSize;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.platform;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.used);
    }

    public String toString() {
        int i = this.id;
        String str = this.action;
        String str2 = this.asset;
        String str3 = this.latestupdate;
        String str4 = this.price;
        String str5 = this.sl;
        String str6 = this.time;
        String str7 = this.tp;
        Double d = this.lotSize;
        String str8 = this.platform;
        return "Signal(id=" + i + ", action=" + str + ", asset=" + str2 + ", latestupdate=" + str3 + ", price=" + str4 + ", sl=" + str5 + ", time=" + str6 + ", tp=" + str7 + ", lotSize=" + d + ", platform=" + str8 + ", used=" + this.used + ")";
    }

    public Signal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(str2, "asset");
        Intrinsics.checkNotNullParameter(str3, "latestupdate");
        Intrinsics.checkNotNullParameter(str4, "price");
        Intrinsics.checkNotNullParameter(str5, "sl");
        Intrinsics.checkNotNullParameter(str6, "time");
        Intrinsics.checkNotNullParameter(str7, "tp");
        this.id = i;
        this.action = str;
        this.asset = str2;
        this.latestupdate = str3;
        this.price = str4;
        this.sl = str5;
        this.time = str6;
        this.tp = str7;
        this.lotSize = d;
        this.platform = str8;
        this.used = z;
    }

    public /* synthetic */ Signal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, String str8, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, d, str8, (i2 & 1024) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getAction() {
        return this.action;
    }

    public final void setAction(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action = str;
    }

    public final String getAsset() {
        return this.asset;
    }

    public final void setAsset(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.asset = str;
    }

    public final String getLatestupdate() {
        return this.latestupdate;
    }

    public final void setLatestupdate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.latestupdate = str;
    }

    public final String getPrice() {
        return this.price;
    }

    public final void setPrice(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public final String getSl() {
        return this.sl;
    }

    public final void setSl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sl = str;
    }

    public final String getTime() {
        return this.time;
    }

    public final void setTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    public final String getTp() {
        return this.tp;
    }

    public final void setTp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tp = str;
    }

    public final Double getLotSize() {
        return this.lotSize;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final boolean getUsed() {
        return this.used;
    }

    public final void setUsed(boolean z) {
        this.used = z;
    }
}

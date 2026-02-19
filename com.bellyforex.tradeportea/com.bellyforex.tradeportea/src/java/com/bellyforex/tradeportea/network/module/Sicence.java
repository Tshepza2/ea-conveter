package com.bellyforex.tradeportea.network.module;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Licence.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003Jc\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u00067"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Sicence;", "Ljava/io/Serializable;", "ea_name", "", "ea_notification", "expires", "key", "owner", "Lcom/bellyforex/tradeportea/network/module/Owner;", "phone_secret_key", "status", "user", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bellyforex/tradeportea/network/module/Owner;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEa_name", "()Ljava/lang/String;", "setEa_name", "(Ljava/lang/String;)V", "getEa_notification", "setEa_notification", "getExpires", "setExpires", "getKey", "setKey", "getOwner", "()Lcom/bellyforex/tradeportea/network/module/Owner;", "setOwner", "(Lcom/bellyforex/tradeportea/network/module/Owner;)V", "getPhone_secret_key", "setPhone_secret_key", "getSelected", "()Z", "setSelected", "(Z)V", "getStatus", "setStatus", "getUser", "setUser", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Sicence implements Serializable {
    private String ea_name;
    private String ea_notification;
    private String expires;
    private String key;
    private Owner owner;
    private String phone_secret_key;
    private boolean selected;
    private String status;
    private String user;

    public final String component1() {
        return this.ea_name;
    }

    public final String component2() {
        return this.ea_notification;
    }

    public final String component3() {
        return this.expires;
    }

    public final String component4() {
        return this.key;
    }

    public final Owner component5() {
        return this.owner;
    }

    public final String component6() {
        return this.phone_secret_key;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.user;
    }

    public final boolean component9() {
        return this.selected;
    }

    public final Sicence copy(String str, String str2, String str3, String str4, Owner owner, String str5, String str6, String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "ea_name");
        Intrinsics.checkNotNullParameter(str2, "ea_notification");
        Intrinsics.checkNotNullParameter(str3, "expires");
        Intrinsics.checkNotNullParameter(str4, "key");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(str5, "phone_secret_key");
        Intrinsics.checkNotNullParameter(str6, "status");
        Intrinsics.checkNotNullParameter(str7, "user");
        return new Sicence(str, str2, str3, str4, owner, str5, str6, str7, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Sicence) {
            Sicence sicence = (Sicence) obj;
            return Intrinsics.areEqual(this.ea_name, sicence.ea_name) && Intrinsics.areEqual(this.ea_notification, sicence.ea_notification) && Intrinsics.areEqual(this.expires, sicence.expires) && Intrinsics.areEqual(this.key, sicence.key) && Intrinsics.areEqual(this.owner, sicence.owner) && Intrinsics.areEqual(this.phone_secret_key, sicence.phone_secret_key) && Intrinsics.areEqual(this.status, sicence.status) && Intrinsics.areEqual(this.user, sicence.user) && this.selected == sicence.selected;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((this.ea_name.hashCode() * 31) + this.ea_notification.hashCode()) * 31) + this.expires.hashCode()) * 31) + this.key.hashCode()) * 31) + this.owner.hashCode()) * 31) + this.phone_secret_key.hashCode()) * 31) + this.status.hashCode()) * 31) + this.user.hashCode()) * 31) + Boolean.hashCode(this.selected);
    }

    public String toString() {
        String str = this.ea_name;
        String str2 = this.ea_notification;
        String str3 = this.expires;
        String str4 = this.key;
        Owner owner = this.owner;
        String str5 = this.phone_secret_key;
        String str6 = this.status;
        String str7 = this.user;
        return "Sicence(ea_name=" + str + ", ea_notification=" + str2 + ", expires=" + str3 + ", key=" + str4 + ", owner=" + owner + ", phone_secret_key=" + str5 + ", status=" + str6 + ", user=" + str7 + ", selected=" + this.selected + ")";
    }

    public Sicence(String str, String str2, String str3, String str4, Owner owner, String str5, String str6, String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "ea_name");
        Intrinsics.checkNotNullParameter(str2, "ea_notification");
        Intrinsics.checkNotNullParameter(str3, "expires");
        Intrinsics.checkNotNullParameter(str4, "key");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(str5, "phone_secret_key");
        Intrinsics.checkNotNullParameter(str6, "status");
        Intrinsics.checkNotNullParameter(str7, "user");
        this.ea_name = str;
        this.ea_notification = str2;
        this.expires = str3;
        this.key = str4;
        this.owner = owner;
        this.phone_secret_key = str5;
        this.status = str6;
        this.user = str7;
        this.selected = z;
    }

    public /* synthetic */ Sicence(String str, String str2, String str3, String str4, Owner owner, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, owner, str5, str6, str7, (i & 256) != 0 ? false : z);
    }

    public final String getEa_name() {
        return this.ea_name;
    }

    public final void setEa_name(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ea_name = str;
    }

    public final String getEa_notification() {
        return this.ea_notification;
    }

    public final void setEa_notification(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ea_notification = str;
    }

    public final String getExpires() {
        return this.expires;
    }

    public final void setExpires(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expires = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final void setOwner(Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "<set-?>");
        this.owner = owner;
    }

    public final String getPhone_secret_key() {
        return this.phone_secret_key;
    }

    public final void setPhone_secret_key(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone_secret_key = str;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final String getUser() {
        return this.user;
    }

    public final void setUser(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.user = str;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}

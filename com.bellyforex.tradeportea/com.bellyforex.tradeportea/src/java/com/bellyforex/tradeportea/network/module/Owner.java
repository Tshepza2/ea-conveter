package com.bellyforex.tradeportea.network.module;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Owner.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Owner;", "", "email", "", "name", "phone", "logo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getLogo", "setLogo", "getName", "setName", "getPhone", "setPhone", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Owner {
    private String email;
    private String logo;
    private String name;
    private String phone;

    public static /* synthetic */ Owner copy$default(Owner owner, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = owner.email;
        }
        if ((i & 2) != 0) {
            str2 = owner.name;
        }
        if ((i & 4) != 0) {
            str3 = owner.phone;
        }
        if ((i & 8) != 0) {
            str4 = owner.logo;
        }
        return owner.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.logo;
    }

    public final Owner copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "phone");
        Intrinsics.checkNotNullParameter(str4, "logo");
        return new Owner(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Owner) {
            Owner owner = (Owner) obj;
            return Intrinsics.areEqual(this.email, owner.email) && Intrinsics.areEqual(this.name, owner.name) && Intrinsics.areEqual(this.phone, owner.phone) && Intrinsics.areEqual(this.logo, owner.logo);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.email.hashCode() * 31) + this.name.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.logo.hashCode();
    }

    public String toString() {
        String str = this.email;
        String str2 = this.name;
        String str3 = this.phone;
        return "Owner(email=" + str + ", name=" + str2 + ", phone=" + str3 + ", logo=" + this.logo + ")";
    }

    public Owner(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "phone");
        Intrinsics.checkNotNullParameter(str4, "logo");
        this.email = str;
        this.name = str2;
        this.phone = str3;
        this.logo = str4;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone = str;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final void setLogo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logo = str;
    }
}

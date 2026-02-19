package com.bellyforex.tradeportea.network.module;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/AuthBody;", "", "licence", "", "phone_secret", "(Ljava/lang/String;Ljava/lang/String;)V", "getLicence", "()Ljava/lang/String;", "setLicence", "(Ljava/lang/String;)V", "getPhone_secret", "setPhone_secret", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AuthBody {
    private String licence;
    private String phone_secret;

    public static /* synthetic */ AuthBody copy$default(AuthBody authBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authBody.licence;
        }
        if ((i & 2) != 0) {
            str2 = authBody.phone_secret;
        }
        return authBody.copy(str, str2);
    }

    public final String component1() {
        return this.licence;
    }

    public final String component2() {
        return this.phone_secret;
    }

    public final AuthBody copy(String str, String str2) {
        return new AuthBody(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthBody) {
            AuthBody authBody = (AuthBody) obj;
            return Intrinsics.areEqual(this.licence, authBody.licence) && Intrinsics.areEqual(this.phone_secret, authBody.phone_secret);
        }
        return false;
    }

    public int hashCode() {
        String str = this.licence;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone_secret;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.licence;
        return "AuthBody(licence=" + str + ", phone_secret=" + this.phone_secret + ")";
    }

    public AuthBody(String str, String str2) {
        this.licence = str;
        this.phone_secret = str2;
    }

    public final String getLicence() {
        return this.licence;
    }

    public final void setLicence(String str) {
        this.licence = str;
    }

    public final String getPhone_secret() {
        return this.phone_secret;
    }

    public final void setPhone_secret(String str) {
        this.phone_secret = str;
    }
}

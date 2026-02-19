package com.bellyforex.tradeportea.network.module;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Account.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Account;", "", "Licence", "Lcom/bellyforex/tradeportea/network/module/Licence;", "message", "", "(Lcom/bellyforex/tradeportea/network/module/Licence;Ljava/lang/String;)V", "getLicence", "()Lcom/bellyforex/tradeportea/network/module/Licence;", "setLicence", "(Lcom/bellyforex/tradeportea/network/module/Licence;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Account {
    @SerializedName("data")
    private Licence Licence;
    private String message;

    public static /* synthetic */ Account copy$default(Account account, Licence licence, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            licence = account.Licence;
        }
        if ((i & 2) != 0) {
            str = account.message;
        }
        return account.copy(licence, str);
    }

    public final Licence component1() {
        return this.Licence;
    }

    public final String component2() {
        return this.message;
    }

    public final Account copy(Licence licence, String str) {
        Intrinsics.checkNotNullParameter(licence, "Licence");
        Intrinsics.checkNotNullParameter(str, "message");
        return new Account(licence, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Account) {
            Account account = (Account) obj;
            return Intrinsics.areEqual(this.Licence, account.Licence) && Intrinsics.areEqual(this.message, account.message);
        }
        return false;
    }

    public int hashCode() {
        return (this.Licence.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        Licence licence = this.Licence;
        return "Account(Licence=" + licence + ", message=" + this.message + ")";
    }

    public Account(Licence licence, String str) {
        Intrinsics.checkNotNullParameter(licence, "Licence");
        Intrinsics.checkNotNullParameter(str, "message");
        this.Licence = licence;
        this.message = str;
    }

    public final Licence getLicence() {
        return this.Licence;
    }

    public final void setLicence(Licence licence) {
        Intrinsics.checkNotNullParameter(licence, "<set-?>");
        this.Licence = licence;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }
}

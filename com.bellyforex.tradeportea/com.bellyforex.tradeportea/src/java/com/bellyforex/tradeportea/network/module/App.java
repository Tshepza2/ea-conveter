package com.bellyforex.tradeportea.network.module;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: App.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/App;", "", "message", "", "version", "", "(Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class App {
    private final String message;
    private final int version;

    public static /* synthetic */ App copy$default(App app, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = app.message;
        }
        if ((i2 & 2) != 0) {
            i = app.version;
        }
        return app.copy(str, i);
    }

    public final String component1() {
        return this.message;
    }

    public final int component2() {
        return this.version;
    }

    public final App copy(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "message");
        return new App(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof App) {
            App app = (App) obj;
            return Intrinsics.areEqual(this.message, app.message) && this.version == app.version;
        }
        return false;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        String str = this.message;
        return "App(message=" + str + ", version=" + this.version + ")";
    }

    public App(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.message = str;
        this.version = i;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getVersion() {
        return this.version;
    }
}

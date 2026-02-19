package com.bellyforex.tradeportea.network.module;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Faqs.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/bellyforex/tradeportea/network/module/Faqs;", "", "title", "", "body", "selected", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBody", "()Ljava/lang/String;", "getSelected", "()Z", "setSelected", "(Z)V", "getTitle", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class Faqs {
    private final String body;
    private boolean selected;
    private final String title;

    public static /* synthetic */ Faqs copy$default(Faqs faqs, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faqs.title;
        }
        if ((i & 2) != 0) {
            str2 = faqs.body;
        }
        if ((i & 4) != 0) {
            z = faqs.selected;
        }
        return faqs.copy(str, str2, z);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final boolean component3() {
        return this.selected;
    }

    public final Faqs copy(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "body");
        return new Faqs(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Faqs) {
            Faqs faqs = (Faqs) obj;
            return Intrinsics.areEqual(this.title, faqs.title) && Intrinsics.areEqual(this.body, faqs.body) && this.selected == faqs.selected;
        }
        return false;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + Boolean.hashCode(this.selected);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        return "Faqs(title=" + str + ", body=" + str2 + ", selected=" + this.selected + ")";
    }

    public Faqs(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "body");
        this.title = str;
        this.body = str2;
        this.selected = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}

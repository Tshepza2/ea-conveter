package com.bellyforex.tradeportea.network.db;

import com.bellyforex.tradeportea.network.module.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: LicenceDB.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/bellyforex/tradeportea/network/db/OwnerTypeConverter;", "", "()V", "fromOwner", "", "owner", "Lcom/bellyforex/tradeportea/network/module/Owner;", "toOwner", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class OwnerTypeConverter {
    public final String fromOwner(Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", owner.getName());
        jSONObject.put("email", owner.getEmail());
        jSONObject.put("phone", owner.getPhone());
        jSONObject.put("logo", owner.getLogo());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final Owner toOwner(String str) {
        Intrinsics.checkNotNullParameter(str, "owner");
        JSONObject jSONObject = new JSONObject(str);
        Object obj = jSONObject.get("email");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = jSONObject.get("name");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = jSONObject.get("phone");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = jSONObject.get("logo");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
        return new Owner((String) obj, (String) obj2, (String) obj3, (String) obj4);
    }
}

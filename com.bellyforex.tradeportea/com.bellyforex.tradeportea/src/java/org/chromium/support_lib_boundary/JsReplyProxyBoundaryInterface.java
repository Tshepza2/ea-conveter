package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    void postMessage(String str);

    void postMessageWithPayload(InvocationHandler invocationHandler);
}

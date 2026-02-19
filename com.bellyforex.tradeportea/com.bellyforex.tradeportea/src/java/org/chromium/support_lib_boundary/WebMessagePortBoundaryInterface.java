package org.chromium.support_lib_boundary;

import android.os.Handler;
import java.lang.reflect.InvocationHandler;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public interface WebMessagePortBoundaryInterface {
    void close();

    void postMessage(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler);

    void setWebMessageCallback(InvocationHandler invocationHandler, Handler handler);
}

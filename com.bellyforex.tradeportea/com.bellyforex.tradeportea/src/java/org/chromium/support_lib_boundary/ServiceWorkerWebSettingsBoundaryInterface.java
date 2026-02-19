package org.chromium.support_lib_boundary;

import java.util.Set;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z);

    void setAllowFileAccess(boolean z);

    void setBlockNetworkLoads(boolean z);

    void setCacheMode(int i);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}

package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public @interface WebMessagePayloadType {
        public static final int TYPE_ARRAY_BUFFER = 1;
        public static final int TYPE_STRING = 0;
    }

    byte[] getAsArrayBuffer();

    String getAsString();

    int getType();
}

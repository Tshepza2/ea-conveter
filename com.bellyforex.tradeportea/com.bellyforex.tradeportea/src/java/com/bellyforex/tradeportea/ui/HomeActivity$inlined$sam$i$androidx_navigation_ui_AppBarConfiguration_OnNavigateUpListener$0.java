package com.bellyforex.tradeportea.ui;

import androidx.navigation.ui.AppBarConfiguration;
import com.bellyforex.tradeportea.utils.Constants;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: AppBarConfiguration.kt */
@Metadata(k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, Constants.CURRENT_VERSION, 0}, xi = 176)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class HomeActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements AppBarConfiguration.OnNavigateUpListener, FunctionAdapter {
    private final /* synthetic */ Function0 function;

    public HomeActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "function");
        this.function = function0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AppBarConfiguration.OnNavigateUpListener) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ boolean onNavigateUp() {
        return ((Boolean) this.function.invoke()).booleanValue();
    }
}

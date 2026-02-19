package com.bellyforex.tradeportea.ui.home;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bellyforex.tradeportea.repository.RTRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewModelProviderFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/ViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "rtRepository", "Lcom/bellyforex/tradeportea/repository/RTRepository;", "(Lcom/bellyforex/tradeportea/repository/RTRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ViewModelProviderFactory implements ViewModelProvider.Factory {
    private final RTRepository rtRepository;

    public ViewModelProviderFactory(RTRepository rTRepository) {
        Intrinsics.checkNotNullParameter(rTRepository, "rtRepository");
        this.rtRepository = rTRepository;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        return new HomeViewModel(this.rtRepository);
    }
}

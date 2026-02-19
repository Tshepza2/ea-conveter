package com.bellyforex.tradeportea.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.customview.widget.Openable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.BottomNavigationViewKt;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.databinding.ActivityHomeBinding;
import com.bellyforex.tradeportea.network.db.LicenceDB;
import com.bellyforex.tradeportea.repository.RTRepository;
import com.bellyforex.tradeportea.ui.home.HomeViewModel;
import com.bellyforex.tradeportea.ui.home.addrobot.AddRobotViewModel;
import com.bellyforex.tradeportea.ui.home.addrobot.ViewModelProviderFactory;
import com.bellyforex.tradeportea.ui.home.assets.AssetsViewModel;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HomeActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lcom/bellyforex/tradeportea/ui/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addRobotViewModel", "Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;", "getAddRobotViewModel", "()Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;", "setAddRobotViewModel", "(Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;)V", "assetsViewModel", "Lcom/bellyforex/tradeportea/ui/home/assets/AssetsViewModel;", "getAssetsViewModel", "()Lcom/bellyforex/tradeportea/ui/home/assets/AssetsViewModel;", "setAssetsViewModel", "(Lcom/bellyforex/tradeportea/ui/home/assets/AssetsViewModel;)V", "binding", "Lcom/bellyforex/tradeportea/databinding/ActivityHomeBinding;", "email", "", "homeViewModel", "Lcom/bellyforex/tradeportea/ui/home/HomeViewModel;", "getHomeViewModel", "()Lcom/bellyforex/tradeportea/ui/home/HomeViewModel;", "setHomeViewModel", "(Lcom/bellyforex/tradeportea/ui/home/HomeViewModel;)V", "isValidEmail", "", "target", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class HomeActivity extends AppCompatActivity {
    public AddRobotViewModel addRobotViewModel;
    public AssetsViewModel assetsViewModel;
    private ActivityHomeBinding binding;
    private CharSequence email;
    public HomeViewModel homeViewModel;

    public final AddRobotViewModel getAddRobotViewModel() {
        AddRobotViewModel addRobotViewModel = this.addRobotViewModel;
        if (addRobotViewModel != null) {
            return addRobotViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
        return null;
    }

    public final void setAddRobotViewModel(AddRobotViewModel addRobotViewModel) {
        Intrinsics.checkNotNullParameter(addRobotViewModel, "<set-?>");
        this.addRobotViewModel = addRobotViewModel;
    }

    public final AssetsViewModel getAssetsViewModel() {
        AssetsViewModel assetsViewModel = this.assetsViewModel;
        if (assetsViewModel != null) {
            return assetsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("assetsViewModel");
        return null;
    }

    public final void setAssetsViewModel(AssetsViewModel assetsViewModel) {
        Intrinsics.checkNotNullParameter(assetsViewModel, "<set-?>");
        this.assetsViewModel = assetsViewModel;
    }

    public final HomeViewModel getHomeViewModel() {
        HomeViewModel homeViewModel = this.homeViewModel;
        if (homeViewModel != null) {
            return homeViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
        return null;
    }

    public final void setHomeViewModel(HomeViewModel homeViewModel) {
        Intrinsics.checkNotNullParameter(homeViewModel, "<set-?>");
        this.homeViewModel = homeViewModel;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RTRepository rTRepository = new RTRepository(LicenceDB.Companion.invoke((Context) this));
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this;
        setAddRobotViewModel((AddRobotViewModel) new ViewModelProvider(viewModelStoreOwner, new ViewModelProviderFactory(rTRepository)).get(AddRobotViewModel.class));
        setAssetsViewModel((AssetsViewModel) new ViewModelProvider(viewModelStoreOwner, new com.bellyforex.tradeportea.ui.home.assets.ViewModelProviderFactory(rTRepository)).get(AssetsViewModel.class));
        setHomeViewModel((HomeViewModel) new ViewModelProvider(viewModelStoreOwner, new com.bellyforex.tradeportea.ui.home.ViewModelProviderFactory(rTRepository)).get(HomeViewModel.class));
        ActivityHomeBinding inflate = ActivityHomeBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView((View) inflate.getRoot());
        ActivityHomeBinding activityHomeBinding = this.binding;
        if (activityHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding = null;
        }
        NavigationBarView navigationBarView = activityHomeBinding.navView;
        Intrinsics.checkNotNullExpressionValue(navigationBarView, "navView");
        NavController findNavController = ActivityKt.findNavController((Activity) this, R.id.nav_host_fragment_activity_home);
        new AppBarConfiguration.Builder(SetsKt.setOf(new Integer[]{Integer.valueOf(R.id.navigation_home), Integer.valueOf(R.id.navigation_metatrader)})).setOpenableLayout((Openable) null).setFallbackOnNavigateUpListener(new HomeActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(new Function0<Boolean>() { // from class: com.bellyforex.tradeportea.ui.HomeActivity$onCreate$$inlined$AppBarConfiguration$default$1
            /* renamed from: invoke */
            public final Boolean m40invoke() {
                return false;
            }
        })).build();
        BottomNavigationViewKt.setupWithNavController(navigationBarView, findNavController);
        final SharedPreferences sharedPreferences = getSharedPreferences("MEMBERS", 0);
        HomeViewModel homeViewModel = getHomeViewModel();
        String string = sharedPreferences.getString("email", null);
        homeViewModel.getApp(string != null ? StringsKt.trim(string).toString() : null, null);
        getHomeViewModel().getApp().observe((LifecycleOwner) this, new HomeActivity$sam$androidx_lifecycle_Observer$0(new HomeActivity$onCreate$1(this, sharedPreferences)));
        ((Button) findViewById(R.id.reload_reload)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.HomeActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.onCreate$lambda$0(HomeActivity.this, sharedPreferences, view);
            }
        });
        ((Button) findViewById(R.id.subscribe)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.HomeActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.onCreate$lambda$1(HomeActivity.this, sharedPreferences, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(HomeActivity homeActivity, SharedPreferences sharedPreferences, View view) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        homeActivity.getHomeViewModel().getApp(sharedPreferences.getString("email", null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(HomeActivity homeActivity, SharedPreferences sharedPreferences, View view) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        Editable text = homeActivity.findViewById(R.id.outlined_edit_text_3).getText();
        homeActivity.email = text;
        if (homeActivity.isValidEmail(text)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("email", String.valueOf(homeActivity.email));
            edit.apply();
            homeActivity.getHomeViewModel().getApp(String.valueOf(homeActivity.email), null);
            return;
        }
        Toast.makeText((Context) homeActivity, "Don't leave any empty spaces,insert valid address", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValidEmail(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }
}

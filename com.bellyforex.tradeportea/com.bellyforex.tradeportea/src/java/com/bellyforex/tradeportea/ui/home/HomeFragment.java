package com.bellyforex.tradeportea.ui.home;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bellyforex.tradeportea.ControlService;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.adapters.RobotsAdapter;
import com.bellyforex.tradeportea.network.module.AuthBody;
import com.bellyforex.tradeportea.network.module.Licence;
import com.bellyforex.tradeportea.network.module.Owner;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.ui.HomeActivity;
import com.bellyforex.tradeportea.ui.home.addrobot.AddRobotViewModel;
import com.bellyforex.tradeportea.ui.home.assets.AssetsViewModel;
import com.bellyforex.tradeportea.utils.Constants;
import com.bellyforex.tradeportea.utils.DateTimeCKt;
import com.bumptech.glide.Glide;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeFragment.kt */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000*\u0001\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addRobotViewModel", "Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;", "assetsViewModel", "Lcom/bellyforex/tradeportea/ui/home/assets/AssetsViewModel;", "authenticated", "", "ea_nameSharedPref", "Landroid/content/SharedPreferences;", "homeViewModel", "Lcom/bellyforex/tradeportea/ui/home/HomeViewModel;", "mBound", "Landroidx/lifecycle/MutableLiveData;", "mConnection", "com/bellyforex/tradeportea/ui/home/HomeFragment$mConnection$1", "Lcom/bellyforex/tradeportea/ui/home/HomeFragment$mConnection$1;", "mService", "Lcom/bellyforex/tradeportea/ControlService;", "robotsAdapter", "Lcom/bellyforex/tradeportea/adapters/RobotsAdapter;", "sLicence", "Lcom/bellyforex/tradeportea/network/module/Licence;", "getSLicence", "()Lcom/bellyforex/tradeportea/network/module/Licence;", "setSLicence", "(Lcom/bellyforex/tradeportea/network/module/Licence;)V", "trading", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecycler", "showTopView", "licence", "storeBotName", "botName", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class HomeFragment extends Fragment {
    private AddRobotViewModel addRobotViewModel;
    private AssetsViewModel assetsViewModel;
    private boolean authenticated;
    private SharedPreferences ea_nameSharedPref;
    private HomeViewModel homeViewModel;
    private MutableLiveData<Boolean> mBound;
    private final HomeFragment$mConnection$1 mConnection;
    private ControlService mService;
    private RobotsAdapter robotsAdapter;
    private Licence sLicence;
    private boolean trading;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bellyforex.tradeportea.ui.home.HomeFragment$mConnection$1] */
    public HomeFragment() {
        super(R.layout.fragment_home);
        this.mBound = new MutableLiveData<>();
        this.mConnection = new ServiceConnection() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$mConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                MutableLiveData mutableLiveData;
                Intrinsics.checkNotNull(iBinder, "null cannot be cast to non-null type com.bellyforex.tradeportea.ControlService.MyBinder");
                HomeFragment.this.mService = ((ControlService.MyBinder) iBinder).getService();
                mutableLiveData = HomeFragment.this.mBound;
                mutableLiveData.postValue(true);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                MutableLiveData mutableLiveData;
                mutableLiveData = HomeFragment.this.mBound;
                mutableLiveData.postValue(false);
            }
        };
    }

    public final Licence getSLicence() {
        return this.sLicence;
    }

    public final void setSLicence(Licence licence) {
        this.sLicence = licence;
    }

    public void onViewCreated(final View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setupRecycler(view);
        HomeActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        this.addRobotViewModel = activity.getAddRobotViewModel();
        HomeActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        this.assetsViewModel = activity2.getAssetsViewModel();
        HomeActivity activity3 = getActivity();
        Intrinsics.checkNotNull(activity3, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        this.homeViewModel = activity3.getHomeViewModel();
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.ea_nameSharedPref = sharedPreferences;
        final NavController findNavController = FragmentKt.findNavController(this);
        this.mBound.observe(getViewLifecycleOwner(), new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Boolean bool) {
                HomeViewModel homeViewModel;
                ControlService controlService;
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    homeViewModel = HomeFragment.this.homeViewModel;
                    ControlService controlService2 = null;
                    if (homeViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                        homeViewModel = null;
                    }
                    controlService = HomeFragment.this.mService;
                    if (controlService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mService");
                    } else {
                        controlService2 = controlService;
                    }
                    homeViewModel.getTradingStatus(controlService2);
                }
            }
        }));
        HomeViewModel homeViewModel = this.homeViewModel;
        RobotsAdapter robotsAdapter = null;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeViewModel = null;
        }
        homeViewModel.getTradingInProgress().observe(getViewLifecycleOwner(), new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Boolean bool) {
                HomeFragment homeFragment = HomeFragment.this;
                Intrinsics.checkNotNull(bool);
                homeFragment.trading = bool.booleanValue();
                if (Intrinsics.areEqual(bool, true)) {
                    ((LinearLayout) view.findViewById(R.id.stopButton)).setVisibility(0);
                    ((LinearLayout) view.findViewById(R.id.startButton)).setVisibility(8);
                } else if (Intrinsics.areEqual(bool, false)) {
                    ((LinearLayout) view.findViewById(R.id.stopButton)).setVisibility(8);
                    Licence sLicence = HomeFragment.this.getSLicence();
                    if (Intrinsics.areEqual(sLicence != null ? sLicence.getStatus() : null, "Expired")) {
                        return;
                    }
                    ((LinearLayout) view.findViewById(R.id.startButton)).setVisibility(0);
                }
            }
        }));
        view.findViewById(R.id.add_bot_btn).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment.onViewCreated$lambda$0(findNavController, view2);
            }
        });
        ((LinearLayout) view.findViewById(R.id.startButton)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment.onViewCreated$lambda$2(HomeFragment.this, view2);
            }
        });
        ((LinearLayout) view.findViewById(R.id.stopButton)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment.onViewCreated$lambda$3(HomeFragment.this, view2);
            }
        });
        ((LinearLayout) view.findViewById(R.id.gotoasset)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment.onViewCreated$lambda$4(findNavController, view2);
            }
        });
        ((LinearLayout) view.findViewById(R.id.delete_ea)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment.onViewCreated$lambda$7(HomeFragment.this, view2);
            }
        });
        ((ImageView) view.findViewById(R.id.bot_info)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HomeFragment.onViewCreated$lambda$9(HomeFragment.this, view2);
            }
        });
        AddRobotViewModel addRobotViewModel = this.addRobotViewModel;
        if (addRobotViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
            addRobotViewModel = null;
        }
        addRobotViewModel.getSelectedLicences().observe(getViewLifecycleOwner(), new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Sicence>, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$onViewCreated$9
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<Sicence> list) {
                boolean z;
                AddRobotViewModel addRobotViewModel2;
                Intrinsics.checkNotNull(list);
                AddRobotViewModel addRobotViewModel3 = null;
                if (!(!list.isEmpty())) {
                    HomeFragment.this.showTopView(view, null);
                    return;
                }
                Sicence sicence = list.get(0);
                Licence licence = new Licence(sicence.getEa_name(), sicence.getEa_notification(), sicence.getExpires(), sicence.getKey(), sicence.getOwner(), sicence.getPhone_secret_key(), sicence.getStatus(), sicence.getUser(), false, 256, null);
                z = HomeFragment.this.authenticated;
                if (!z) {
                    HomeFragment.this.authenticated = true;
                    addRobotViewModel2 = HomeFragment.this.addRobotViewModel;
                    if (addRobotViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
                    } else {
                        addRobotViewModel3 = addRobotViewModel2;
                    }
                    addRobotViewModel3.authenticate(new AuthBody(licence.getKey(), licence.getPhone_secret_key()));
                }
                HomeFragment.this.setSLicence(licence);
                HomeFragment.this.showTopView(view, licence);
            }
        }));
        AddRobotViewModel addRobotViewModel2 = this.addRobotViewModel;
        if (addRobotViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
            addRobotViewModel2 = null;
        }
        addRobotViewModel2.getLicences().observe(getViewLifecycleOwner(), new HomeFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Licence>, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$onViewCreated$10
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(List<Licence> list) {
                RobotsAdapter robotsAdapter2;
                RobotsAdapter robotsAdapter3;
                Intrinsics.checkNotNull(list);
                RobotsAdapter robotsAdapter4 = null;
                if (!list.isEmpty()) {
                    ((TextView) view.findViewById(R.id.label)).setVisibility(0);
                    robotsAdapter3 = this.robotsAdapter;
                    if (robotsAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("robotsAdapter");
                    } else {
                        robotsAdapter4 = robotsAdapter3;
                    }
                    robotsAdapter4.getDiffer().submitList(CollectionsKt.asReversed(list));
                    return;
                }
                ((TextView) view.findViewById(R.id.label)).setVisibility(8);
                robotsAdapter2 = this.robotsAdapter;
                if (robotsAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("robotsAdapter");
                } else {
                    robotsAdapter4 = robotsAdapter2;
                }
                robotsAdapter4.getDiffer().submitList(list);
            }
        }));
        RobotsAdapter robotsAdapter2 = this.robotsAdapter;
        if (robotsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotsAdapter");
        } else {
            robotsAdapter = robotsAdapter2;
        }
        robotsAdapter.setOnItemClickListener(new Function1<Licence, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$onViewCreated$11
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Licence) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Licence licence) {
                boolean z;
                AddRobotViewModel addRobotViewModel3;
                HomeFragment$mConnection$1 homeFragment$mConnection$1;
                HomeViewModel homeViewModel2;
                Intrinsics.checkNotNullParameter(licence, "it");
                if (Intrinsics.areEqual(licence, HomeFragment.this.getSLicence())) {
                    return;
                }
                z = HomeFragment.this.trading;
                AddRobotViewModel addRobotViewModel4 = null;
                if (z) {
                    HomeActivity activity4 = HomeFragment.this.getActivity();
                    Intrinsics.checkNotNull(activity4, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
                    Intent intent = new Intent((Context) activity4, ControlService.class);
                    HomeActivity activity5 = HomeFragment.this.getActivity();
                    Intrinsics.checkNotNull(activity5, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
                    homeFragment$mConnection$1 = HomeFragment.this.mConnection;
                    activity5.unbindService(homeFragment$mConnection$1);
                    HomeActivity activity6 = HomeFragment.this.getActivity();
                    Intrinsics.checkNotNull(activity6, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
                    activity6.stopService(intent);
                    homeViewModel2 = HomeFragment.this.homeViewModel;
                    if (homeViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                        homeViewModel2 = null;
                    }
                    homeViewModel2.getTradingInProgress().postValue(false);
                }
                addRobotViewModel3 = HomeFragment.this.addRobotViewModel;
                if (addRobotViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
                } else {
                    addRobotViewModel4 = addRobotViewModel3;
                }
                addRobotViewModel4.authenticate(new AuthBody(licence.getKey(), licence.getPhone_secret_key()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(NavController navController, View view) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        navController.navigate(R.id.action_navigation_home_to_addRobotFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        HomeActivity activity = homeFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        Intent intent = new Intent((Context) activity, ControlService.class);
        HomeActivity activity2 = homeFragment.getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        activity2.startForegroundService(intent);
        HomeActivity activity3 = homeFragment.getActivity();
        Intrinsics.checkNotNull(activity3, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        activity3.bindService(intent, homeFragment.mConnection, 1);
        HomeViewModel homeViewModel = homeFragment.homeViewModel;
        ControlService controlService = null;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeViewModel = null;
        }
        ControlService controlService2 = homeFragment.mService;
        if (controlService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mService");
        } else {
            controlService = controlService2;
        }
        homeViewModel.getTradingStatus(controlService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        HomeActivity activity = homeFragment.getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        Intent intent = new Intent((Context) activity, ControlService.class);
        HomeActivity activity2 = homeFragment.getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        activity2.unbindService(homeFragment.mConnection);
        HomeActivity activity3 = homeFragment.getActivity();
        Intrinsics.checkNotNull(activity3, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        activity3.stopService(intent);
        HomeViewModel homeViewModel = homeFragment.homeViewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeViewModel = null;
        }
        homeViewModel.getTradingInProgress().postValue(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(NavController navController, View view) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        navController.navigate(R.id.action_navigation_home_to_assetsFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(final HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        AlertDialog.Builder builder = new AlertDialog.Builder(homeFragment.getContext());
        builder.setTitle("Warning !!");
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = "Are you sure you want to delete ";
        Licence licence = homeFragment.sLicence;
        charSequenceArr[1] = licence != null ? licence.getEa_name() : null;
        charSequenceArr[2] = " ?. Note that you will no longer be able to use the licence key ~ ";
        Licence licence2 = homeFragment.sLicence;
        charSequenceArr[3] = licence2 != null ? licence2.getKey() : null;
        builder.setMessage(TextUtils.concat(charSequenceArr));
        builder.setPositiveButton("DELETE", new DialogInterface.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HomeFragment.onViewCreated$lambda$7$lambda$5(HomeFragment.this, dialogInterface, i);
            }
        });
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$5(HomeFragment homeFragment, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        AddRobotViewModel addRobotViewModel = null;
        if (homeFragment.trading) {
            HomeActivity activity = homeFragment.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
            Intent intent = new Intent((Context) activity, ControlService.class);
            HomeActivity activity2 = homeFragment.getActivity();
            Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
            activity2.unbindService(homeFragment.mConnection);
            HomeActivity activity3 = homeFragment.getActivity();
            Intrinsics.checkNotNull(activity3, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
            activity3.stopService(intent);
            HomeViewModel homeViewModel = homeFragment.homeViewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeViewModel = null;
            }
            homeViewModel.getTradingInProgress().postValue(false);
        }
        AssetsViewModel assetsViewModel = homeFragment.assetsViewModel;
        if (assetsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assetsViewModel");
            assetsViewModel = null;
        }
        Licence licence = homeFragment.sLicence;
        Intrinsics.checkNotNull(licence);
        assetsViewModel.deleteAllSymbol(licence.getPhone_secret_key());
        AddRobotViewModel addRobotViewModel2 = homeFragment.addRobotViewModel;
        if (addRobotViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
            addRobotViewModel2 = null;
        }
        Licence licence2 = homeFragment.sLicence;
        Intrinsics.checkNotNull(licence2);
        addRobotViewModel2.deleteSicence(licence2);
        AddRobotViewModel addRobotViewModel3 = homeFragment.addRobotViewModel;
        if (addRobotViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
        } else {
            addRobotViewModel = addRobotViewModel3;
        }
        Licence licence3 = homeFragment.sLicence;
        Intrinsics.checkNotNull(licence3);
        addRobotViewModel.deleteLicence(licence3);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(HomeFragment homeFragment, View view) {
        Owner owner;
        Owner owner2;
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        AlertDialog.Builder builder = new AlertDialog.Builder(homeFragment.getContext());
        builder.setTitle("Robot Information");
        CharSequence[] charSequenceArr = new CharSequence[12];
        charSequenceArr[0] = "Status : ";
        Licence licence = homeFragment.sLicence;
        String str = null;
        charSequenceArr[1] = licence != null ? licence.getStatus() : null;
        charSequenceArr[2] = "\nRobot Name : ";
        Licence licence2 = homeFragment.sLicence;
        charSequenceArr[3] = licence2 != null ? licence2.getEa_name() : null;
        charSequenceArr[4] = "\nLicence Key : ";
        Licence licence3 = homeFragment.sLicence;
        charSequenceArr[5] = licence3 != null ? licence3.getKey() : null;
        charSequenceArr[6] = "\nActive Until : ";
        Licence licence4 = homeFragment.sLicence;
        charSequenceArr[7] = DateTimeCKt.convert(licence4 != null ? licence4.getExpires() : null);
        charSequenceArr[8] = "\nOwner's Name : ";
        Licence licence5 = homeFragment.sLicence;
        charSequenceArr[9] = (licence5 == null || (owner2 = licence5.getOwner()) == null) ? null : owner2.getName();
        charSequenceArr[10] = "\nOwner's Contacts : ";
        Licence licence6 = homeFragment.sLicence;
        if (licence6 != null && (owner = licence6.getOwner()) != null) {
            str = owner.getPhone();
        }
        charSequenceArr[11] = str;
        builder.setMessage(TextUtils.concat(charSequenceArr));
        builder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.HomeFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTopView(View view, Licence licence) {
        if (licence != null) {
            ((RelativeLayout) view.findViewById(R.id.selected_bot_header)).setVisibility(0);
            ((TextView) view.findViewById(R.id.bot_name)).setText(licence.getEa_name());
            storeBotName(licence.getEa_name());
            ((TextView) view.findViewById(R.id.owner_name)).setText(" " + licence.getOwner().getName());
            ResourcesCompat.getFont(view.getContext(), R.font.starkiller);
            String status = licence.getStatus();
            if (Intrinsics.areEqual(status, "Active")) {
                View findViewById = view.findViewById(R.id.startButton);
                Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout = (LinearLayout) findViewById;
                if (!this.trading) {
                    linearLayout.setVisibility(0);
                }
                ((TextView) view.findViewById(R.id.note)).setVisibility(8);
                ((TextView) view.findViewById(R.id.owner_name)).setVisibility(0);
            } else if (Intrinsics.areEqual(status, "Expired")) {
                View findViewById2 = view.findViewById(R.id.startButton);
                Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
                ((LinearLayout) findViewById2).setVisibility(8);
                ((TextView) view.findViewById(R.id.owner_name)).setVisibility(8);
                TextView textView = (TextView) view.findViewById(R.id.note);
                textView.setVisibility(0);
                textView.setText(TextUtils.concat("! Your Licence key ~ ", licence.getKey(), " Have Expired. Please Contact ", licence.getOwner().getName(), " at ", licence.getOwner().getPhone(), " for  new Key or re-activation."));
            }
            if (Intrinsics.areEqual(licence.getOwner().getLogo(), "none")) {
                View findViewById3 = view.findViewById(R.id.logo_img);
                Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) findViewById3).setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_arrow_circle_right_24));
                return;
            }
            Glide.with(view).load(Constants.LOGO_BASE_URL + licence.getOwner().getLogo()).centerCrop().into((ImageView) view.findViewById(R.id.logo_img));
            return;
        }
        ((RelativeLayout) view.findViewById(R.id.selected_bot_header)).setVisibility(8);
    }

    private final void setupRecycler(View view) {
        RecyclerView findViewById = view.findViewById(R.id.bots_list_recycler_view);
        this.robotsAdapter = new RobotsAdapter();
        findViewById.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        findViewById.hasFixedSize();
        RobotsAdapter robotsAdapter = this.robotsAdapter;
        if (robotsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("robotsAdapter");
            robotsAdapter = null;
        }
        findViewById.setAdapter(robotsAdapter);
    }

    public void onStart() {
        super.onStart();
        HomeActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        Intent intent = new Intent((Context) activity, ControlService.class);
        HomeActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        activity2.bindService(intent, this.mConnection, 1);
    }

    private final void storeBotName(String str) {
        SharedPreferences sharedPreferences = this.ea_nameSharedPref;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ea_nameSharedPref");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("ea_name", str);
        edit.apply();
    }
}

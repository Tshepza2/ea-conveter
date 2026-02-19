package com.bellyforex.tradeportea.ui.home.assets;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.adapters.ViewPagerAdapter;
import com.bellyforex.tradeportea.network.module.Sicence;
import com.bellyforex.tradeportea.ui.HomeActivity;
import com.bellyforex.tradeportea.ui.home.addrobot.AddRobotViewModel;
import com.bellyforex.tradeportea.ui.home.assets.types.AllAssetsFragment;
import com.bellyforex.tradeportea.ui.home.assets.types.AllowedAssetsFragment;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetsFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bellyforex/tradeportea/ui/home/assets/AssetsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "addRobotViewModel", "Lcom/bellyforex/tradeportea/ui/home/addrobot/AddRobotViewModel;", "tableLayout", "Lcom/google/android/material/tabs/TabLayout;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "viewPagerAdapter", "Lcom/bellyforex/tradeportea/adapters/ViewPagerAdapter;", "back", "", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class AssetsFragment extends Fragment {
    private AddRobotViewModel addRobotViewModel;
    private TabLayout tableLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    public AssetsFragment() {
        super(R.layout.assets_fragment);
    }

    public void onViewCreated(final View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        HomeActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.bellyforex.tradeportea.ui.HomeActivity");
        this.addRobotViewModel = activity.getAddRobotViewModel();
        back(view);
        TabLayout findViewById = view.findViewById(R.id.tab_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.tableLayout = findViewById;
        ViewPager findViewById2 = view.findViewById(R.id.view_pager);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.viewPager = findViewById2;
        TabLayout tabLayout = this.tableLayout;
        AddRobotViewModel addRobotViewModel = null;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tableLayout");
            tabLayout = null;
        }
        ViewPager viewPager = this.viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager = null;
        }
        tabLayout.setupWithViewPager(viewPager);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(childFragmentManager, 1);
        this.viewPagerAdapter = viewPagerAdapter;
        viewPagerAdapter.addFragment(new AllowedAssetsFragment(), "Allowed Symbols");
        ViewPagerAdapter viewPagerAdapter2 = this.viewPagerAdapter;
        if (viewPagerAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            viewPagerAdapter2 = null;
        }
        viewPagerAdapter2.addFragment(new AllAssetsFragment(), "All Symbols");
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        ViewPagerAdapter viewPagerAdapter3 = this.viewPagerAdapter;
        if (viewPagerAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            viewPagerAdapter3 = null;
        }
        viewPager2.setAdapter((PagerAdapter) viewPagerAdapter3);
        AddRobotViewModel addRobotViewModel2 = this.addRobotViewModel;
        if (addRobotViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addRobotViewModel");
        } else {
            addRobotViewModel = addRobotViewModel2;
        }
        addRobotViewModel.getSelectedLicences().observe((LifecycleOwner) this, new AssetsFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Sicence>, Unit>() { // from class: com.bellyforex.tradeportea.ui.home.assets.AssetsFragment$onViewCreated$1
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
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    ((TextView) view.findViewById(R.id.top_text)).setText(list.get(0).getEa_name());
                }
            }
        }));
    }

    private final void back(View view) {
        ((ImageButton) view.findViewById(R.id.backbtn)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.home.assets.AssetsFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AssetsFragment.back$lambda$0(AssetsFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void back$lambda$0(AssetsFragment assetsFragment, View view) {
        Intrinsics.checkNotNullParameter(assetsFragment, "this$0");
        FragmentKt.findNavController(assetsFragment).popBackStack();
    }
}

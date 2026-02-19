package com.bellyforex.tradeportea.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewPagerAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\bj\b\u0012\u0004\u0012\u00020\f`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bellyforex/tradeportea/adapters/ViewPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "behavior", "", "(Landroidx/fragment/app/FragmentManager;I)V", "fragmentList", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "fragmentTitle", "", "addFragment", "", "fragment", "title", "getCount", "getItem", "position", "getPageTitle", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class ViewPagerAdapter extends FragmentPagerAdapter {
    private final ArrayList<Fragment> fragmentList;
    private final ArrayList<String> fragmentTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerAdapter(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        this.fragmentList = new ArrayList<>();
        this.fragmentTitle = new ArrayList<>();
    }

    public int getCount() {
        return this.fragmentList.size();
    }

    public Fragment getItem(int i) {
        Fragment fragment = this.fragmentList.get(i);
        Intrinsics.checkNotNullExpressionValue(fragment, "get(...)");
        return fragment;
    }

    public final void addFragment(Fragment fragment, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "title");
        this.fragmentList.add(fragment);
        this.fragmentTitle.add(str);
    }

    public CharSequence getPageTitle(int i) {
        return this.fragmentTitle.get(i);
    }
}

package com.bellyforex.tradeportea.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.module.App;
import com.bellyforex.tradeportea.ui.home.HomeViewModel;
import com.bellyforex.tradeportea.utils.Resource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: HomeActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bellyforex/tradeportea/utils/Resource;", "Lcom/bellyforex/tradeportea/network/module/App;", "kotlin.jvm.PlatformType", "invoke"}, k = WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
final class HomeActivity$onCreate$1 extends Lambda implements Function1<Resource<App>, Unit> {
    final /* synthetic */ SharedPreferences $sharedPreference;
    final /* synthetic */ HomeActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$onCreate$1(HomeActivity homeActivity, SharedPreferences sharedPreferences) {
        super(1);
        this.this$0 = homeActivity;
        this.$sharedPreference = sharedPreferences;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Resource) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Resource<App> resource) {
        CharSequence charSequence;
        boolean isValidEmail;
        CharSequence charSequence2;
        CharSequence charSequence3;
        if (resource instanceof Resource.Success) {
            ((ProgressBar) this.this$0.findViewById(R.id.mainProgress)).setVisibility(8);
            ((RelativeLayout) this.this$0.findViewById(R.id.error_code)).setVisibility(8);
            ((ProgressBar) this.this$0.findViewById(R.id.progress)).setVisibility(8);
            if (resource.getData() != null) {
                if (Intrinsics.areEqual(resource.getData().getMessage(), "accept")) {
                    ((RelativeLayout) this.this$0.findViewById(R.id.payLayout)).setVisibility(8);
                    this.this$0.findViewById(R.id.nav_view).setVisibility(0);
                    ((RelativeLayout) this.this$0.findViewById(R.id.main_view)).setVisibility(0);
                    if (8 != resource.getData().getVersion()) {
                        Intent intent = new Intent((Context) this.this$0, FinishActivity.class);
                        intent.putExtra("update", true);
                        this.this$0.startActivity(intent);
                    }
                    HomeViewModel homeViewModel = this.this$0.getHomeViewModel();
                    String string = this.$sharedPreference.getString("email", null);
                    homeViewModel.getApp(string != null ? StringsKt.trim(string).toString() : null, true);
                    SharedPreferences.Editor edit = this.$sharedPreference.edit();
                    edit.putString("use_email", this.$sharedPreference.getString("email", null));
                    edit.apply();
                } else if (Intrinsics.areEqual(resource.getData().getMessage(), "used")) {
                    String string2 = this.$sharedPreference.getString("use_email", null);
                    String string3 = this.$sharedPreference.getString("email", null);
                    if (string2 != null && Intrinsics.areEqual(string2, string3)) {
                        ((RelativeLayout) this.this$0.findViewById(R.id.main_view)).setVisibility(0);
                        ((RelativeLayout) this.this$0.findViewById(R.id.payLayout)).setVisibility(8);
                        this.this$0.findViewById(R.id.nav_view).setVisibility(0);
                        if (8 != resource.getData().getVersion()) {
                            Intent intent2 = new Intent((Context) this.this$0, FinishActivity.class);
                            intent2.putExtra("update", true);
                            this.this$0.startActivity(intent2);
                            return;
                        }
                        return;
                    }
                    Toast.makeText((Context) this.this$0, "This account has been used, please contact mentor for re activation.", 0).show();
                } else {
                    String str = "0";
                    if (Intrinsics.areEqual(resource.getData().getMessage(), "admin")) {
                        Editable text = this.this$0.findViewById(R.id.outlined_edit_text_2).getText();
                        Editable editable = text;
                        if (editable != null && editable.length() != 0) {
                            str = text.toString();
                        }
                        charSequence3 = this.this$0.email;
                        WebView webView = new WebView((Context) this.this$0);
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.getSettings().setLoadWithOverviewMode(true);
                        webView.getSettings().setUseWideViewPort(true);
                        webView.loadUrl("https://tradeportea.com/shop/?email=" + ((Object) charSequence3) + "&mentor=" + str);
                        View cardView = new CardView((Context) this.this$0);
                        cardView.setRadius(16.0f);
                        cardView.setContentPadding(16, 16, 16, 16);
                        cardView.addView(webView);
                        AlertDialog create = new AlertDialog.Builder((Context) this.this$0).setView(cardView).setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.HomeActivity$onCreate$1$$ExternalSyntheticLambda0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).create();
                        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                        create.show();
                        return;
                    }
                    ((RelativeLayout) this.this$0.findViewById(R.id.payLayout)).setVisibility(0);
                    this.this$0.findViewById(R.id.nav_view).setVisibility(8);
                    HomeActivity homeActivity = this.this$0;
                    charSequence = homeActivity.email;
                    isValidEmail = homeActivity.isValidEmail(charSequence);
                    if (isValidEmail) {
                        Editable text2 = this.this$0.findViewById(R.id.outlined_edit_text_2).getText();
                        Editable editable2 = text2;
                        if (editable2 != null && editable2.length() != 0) {
                            str = text2.toString();
                        }
                        charSequence2 = this.this$0.email;
                        WebView webView2 = new WebView((Context) this.this$0);
                        webView2.getSettings().setJavaScriptEnabled(true);
                        webView2.getSettings().setLoadWithOverviewMode(true);
                        webView2.getSettings().setUseWideViewPort(true);
                        webView2.loadUrl("https://tradeportea.com/shop/?email=" + ((Object) charSequence2) + "&mentor=" + str);
                        View cardView2 = new CardView((Context) this.this$0);
                        cardView2.setRadius(16.0f);
                        cardView2.setContentPadding(16, 16, 16, 16);
                        cardView2.addView(webView2);
                        AlertDialog create2 = new AlertDialog.Builder((Context) this.this$0).setView(cardView2).setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.HomeActivity$onCreate$1$$ExternalSyntheticLambda1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        }).create();
                        Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                        create2.show();
                    }
                }
            }
        } else if (resource instanceof Resource.Loading) {
            ((ProgressBar) this.this$0.findViewById(R.id.progress)).setVisibility(0);
            ((RelativeLayout) this.this$0.findViewById(R.id.main_view)).setVisibility(8);
            ((ProgressBar) this.this$0.findViewById(R.id.mainProgress)).setVisibility(0);
            ((RelativeLayout) this.this$0.findViewById(R.id.error_code)).setVisibility(8);
        } else if (resource instanceof Resource.Error) {
            ((ProgressBar) this.this$0.findViewById(R.id.mainProgress)).setVisibility(8);
            ((RelativeLayout) this.this$0.findViewById(R.id.error_code)).setVisibility(0);
        }
    }
}

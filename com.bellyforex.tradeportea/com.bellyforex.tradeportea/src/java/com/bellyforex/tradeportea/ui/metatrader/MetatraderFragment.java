package com.bellyforex.tradeportea.ui.metatrader;

import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bellyforex.tradeportea.R;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: MetatraderFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J8\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0017J(\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J8\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J(\u0010)\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J \u0010*\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bellyforex/tradeportea/ui/metatrader/MetatraderFragment;", "Landroidx/fragment/app/Fragment;", "()V", "chatLoading", "", "chechDisc", "chooseSymbol", "job2", "Lkotlinx/coroutines/Job;", "getJob2", "()Lkotlinx/coroutines/Job;", "setJob2", "(Lkotlinx/coroutines/Job;)V", "loading", "logged", "loggedIn", "mt4SharedPref", "Landroid/content/SharedPreferences;", "mt5SharedPref", "pressExecuteTrade", "selected", "Landroidx/lifecycle/MutableLiveData;", "", "showAllSymbols", "loginTest", "", "platform", "server", "login", "password", "circleView", "Landroid/view/View;", "webView", "Landroid/webkit/WebView;", "loginTestB", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "saveDetail", "saveLoginData", "saveToPreferences", "sendLoginDetails", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class MetatraderFragment extends Fragment {
    private boolean chatLoading;
    private boolean chechDisc;
    private boolean chooseSymbol;
    public Job job2;
    private boolean loading;
    private boolean logged;
    private boolean loggedIn;
    private SharedPreferences mt4SharedPref;
    private SharedPreferences mt5SharedPref;
    private boolean pressExecuteTrade;
    private final MutableLiveData<String> selected;
    private boolean showAllSymbols;

    public MetatraderFragment() {
        super(R.layout.fragment_metatrader);
        this.selected = new MutableLiveData<>();
        this.chechDisc = true;
        this.chatLoading = true;
    }

    public final Job getJob2() {
        Job job = this.job2;
        if (job != null) {
            return job;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job2");
        return null;
    }

    public final void setJob2(Job job) {
        Intrinsics.checkNotNullParameter(job, "<set-?>");
        this.job2 = job;
    }

    public void onViewCreated(final View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onCreate(bundle);
        final View findViewById = view.findViewById(R.id.circleView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        final WebView webView = (WebView) view.findViewById(R.id.webView);
        webView.requestFocus();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setCacheMode(1);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSaveFormData(true);
        webView.setFocusableInTouchMode(false);
        webView.setFocusable(false);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        SharedPreferences sharedPreferences = requireContext().getApplicationContext().getSharedPreferences("mt4", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.mt4SharedPref = sharedPreferences;
        SharedPreferences sharedPreferences2 = requireContext().getApplicationContext().getSharedPreferences("mt5", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        this.mt5SharedPref = sharedPreferences2;
        View findViewById2 = view.findViewById(R.id.logo_img);
        Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.outlined_edit_text);
        Intrinsics.checkNotNull(findViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) findViewById3;
        View findViewById4 = view.findViewById(R.id.outlined_edit_text_2);
        Intrinsics.checkNotNull(findViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) findViewById4;
        View findViewById5 = view.findViewById(R.id.outlined_edit_text_3);
        Intrinsics.checkNotNull(findViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) findViewById5;
        this.selected.observe(getViewLifecycleOwner(), new MetatraderFragment$sam$androidx_lifecycle_Observer$0(new Function1<String, Unit>() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                SharedPreferences sharedPreferences3;
                SharedPreferences sharedPreferences4;
                SharedPreferences sharedPreferences5;
                SharedPreferences sharedPreferences6;
                boolean z;
                SharedPreferences sharedPreferences7;
                SharedPreferences sharedPreferences8;
                SharedPreferences sharedPreferences9;
                SharedPreferences sharedPreferences10;
                boolean z2;
                if (Intrinsics.areEqual(str, "mt5")) {
                    ((TextView) view.findViewById(R.id.top_text)).setText("MT5 LOGIN DETAILS");
                    ((Button) view.findViewById(R.id.submitMt4)).setVisibility(8);
                    ((Button) view.findViewById(R.id.submitMt5)).setVisibility(0);
                    imageView.setImageResource(R.mipmap.mt5logo);
                    view.findViewById(R.id.v1).setVisibility(0);
                    view.findViewById(R.id.v2).setVisibility(8);
                    sharedPreferences7 = this.mt5SharedPref;
                    if (sharedPreferences7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
                        sharedPreferences7 = null;
                    }
                    String string = sharedPreferences7.getString("login", null);
                    sharedPreferences8 = this.mt5SharedPref;
                    if (sharedPreferences8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
                        sharedPreferences8 = null;
                    }
                    String string2 = sharedPreferences8.getString("password", null);
                    String obj = string2 != null ? StringsKt.trim(string2).toString() : null;
                    sharedPreferences9 = this.mt5SharedPref;
                    if (sharedPreferences9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
                        sharedPreferences9 = null;
                    }
                    String string3 = sharedPreferences9.getString("server", null);
                    String obj2 = string3 != null ? StringsKt.trim(string3).toString() : null;
                    sharedPreferences10 = this.mt5SharedPref;
                    if (sharedPreferences10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt5SharedPref");
                        sharedPreferences10 = null;
                    }
                    boolean z3 = sharedPreferences10.getBoolean("logged", false);
                    CookieSyncManager.createInstance(this.getContext());
                    CookieManager cookieManager = CookieManager.getInstance();
                    Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
                    cookieManager.removeAllCookies(null);
                    this.logged = z3;
                    editText.setText(string);
                    editText2.setText(obj);
                    editText3.setText(obj2);
                    z2 = this.logged;
                    if (z2) {
                        findViewById.setBackgroundResource(R.drawable.circle_background_green);
                    } else {
                        findViewById.setBackgroundResource(R.drawable.circle_background_red);
                    }
                } else if (Intrinsics.areEqual(str, "mt4")) {
                    ((TextView) view.findViewById(R.id.top_text)).setText("MT4 LOGIN DETAILS");
                    ((Button) view.findViewById(R.id.submitMt5)).setVisibility(8);
                    ((Button) view.findViewById(R.id.submitMt4)).setVisibility(0);
                    imageView.setImageResource(R.mipmap.mt4logo);
                    view.findViewById(R.id.v2).setVisibility(0);
                    view.findViewById(R.id.v1).setVisibility(8);
                    sharedPreferences3 = this.mt4SharedPref;
                    if (sharedPreferences3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
                        sharedPreferences3 = null;
                    }
                    String string4 = sharedPreferences3.getString("login", null);
                    sharedPreferences4 = this.mt4SharedPref;
                    if (sharedPreferences4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
                        sharedPreferences4 = null;
                    }
                    String string5 = sharedPreferences4.getString("password", null);
                    String obj3 = string5 != null ? StringsKt.trim(string5).toString() : null;
                    sharedPreferences5 = this.mt4SharedPref;
                    if (sharedPreferences5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
                        sharedPreferences5 = null;
                    }
                    String string6 = sharedPreferences5.getString("server", null);
                    String obj4 = string6 != null ? StringsKt.trim(string6).toString() : null;
                    sharedPreferences6 = this.mt4SharedPref;
                    if (sharedPreferences6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mt4SharedPref");
                        sharedPreferences6 = null;
                    }
                    boolean z4 = sharedPreferences6.getBoolean("logged", false);
                    CookieSyncManager.createInstance(this.getContext());
                    CookieManager cookieManager2 = CookieManager.getInstance();
                    Intrinsics.checkNotNullExpressionValue(cookieManager2, "getInstance(...)");
                    cookieManager2.removeAllCookies(null);
                    this.logged = z4;
                    editText.setText(string4);
                    editText2.setText(obj3);
                    editText3.setText(obj4);
                    z = this.logged;
                    if (z) {
                        findViewById.setBackgroundResource(R.drawable.circle_background_green);
                    } else {
                        findViewById.setBackgroundResource(R.drawable.circle_background_red);
                    }
                }
            }
        }));
        this.selected.postValue("mt5");
        ((Button) view.findViewById(R.id.mt5_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MetatraderFragment.onViewCreated$lambda$0(MetatraderFragment.this, view2);
            }
        });
        ((Button) view.findViewById(R.id.mt4_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MetatraderFragment.onViewCreated$lambda$1(MetatraderFragment.this, view2);
            }
        });
        ((Button) view.findViewById(R.id.submitMt5)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MetatraderFragment.onViewCreated$lambda$2(editText, editText2, editText3, this, findViewById, webView, view2);
            }
        });
        ((Button) view.findViewById(R.id.submitMt4)).setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MetatraderFragment.onViewCreated$lambda$3(editText, editText2, editText3, this, findViewById, webView, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(MetatraderFragment metatraderFragment, View view) {
        Intrinsics.checkNotNullParameter(metatraderFragment, "this$0");
        metatraderFragment.selected.postValue("mt5");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(MetatraderFragment metatraderFragment, View view) {
        Intrinsics.checkNotNullParameter(metatraderFragment, "this$0");
        metatraderFragment.selected.postValue("mt4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(EditText editText, EditText editText2, EditText editText3, MetatraderFragment metatraderFragment, View view, WebView webView, View view2) {
        Intrinsics.checkNotNullParameter(editText, "$login");
        Intrinsics.checkNotNullParameter(editText2, "$password");
        Intrinsics.checkNotNullParameter(editText3, "$server");
        Intrinsics.checkNotNullParameter(metatraderFragment, "this$0");
        Intrinsics.checkNotNullParameter(view, "$circleView");
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() > 0) {
            Editable text2 = editText2.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() > 0) {
                Editable text3 = editText3.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                if (text3.length() > 0) {
                    String obj = editText.getText().toString();
                    String obj2 = editText2.getText().toString();
                    String obj3 = editText3.getText().toString();
                    Intrinsics.checkNotNull(webView);
                    metatraderFragment.saveLoginData("mt5", obj, obj2, obj3, view, webView);
                    view.setBackgroundResource(R.drawable.circle_background_red);
                    return;
                }
            }
        }
        Toast.makeText(metatraderFragment.getContext(), "DETAILS CANNOT BE EMPTY", 0).show();
        view.setBackgroundResource(R.drawable.circle_background_red);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(EditText editText, EditText editText2, EditText editText3, MetatraderFragment metatraderFragment, View view, WebView webView, View view2) {
        Intrinsics.checkNotNullParameter(editText, "$login");
        Intrinsics.checkNotNullParameter(editText2, "$password");
        Intrinsics.checkNotNullParameter(editText3, "$server");
        Intrinsics.checkNotNullParameter(metatraderFragment, "this$0");
        Intrinsics.checkNotNullParameter(view, "$circleView");
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() > 0) {
            Editable text2 = editText2.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() > 0) {
                Editable text3 = editText3.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                if (text3.length() > 0) {
                    String obj = editText.getText().toString();
                    String obj2 = editText2.getText().toString();
                    String obj3 = editText3.getText().toString();
                    Intrinsics.checkNotNull(webView);
                    metatraderFragment.saveLoginData("mt4", obj, obj2, obj3, view, webView);
                    view.setBackgroundResource(R.drawable.circle_background_red);
                    return;
                }
            }
        }
        Toast.makeText(metatraderFragment.getContext(), "DETAILS CANNOT BE EMPTY", 0).show();
        view.setBackgroundResource(R.drawable.circle_background_red);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveDetail(String str, String str2, String str3, String str4) {
        saveToPreferences(str, str2, str3, str4);
        sendLoginDetails(str2, str3, str4);
    }

    private final void saveToPreferences(String str, String str2, String str3, String str4) {
        SharedPreferences sharedPreferences = requireContext().getApplicationContext().getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("login", str2);
        edit.putString("password", str3);
        edit.putString("server", str4);
        edit.putBoolean("logged", true);
        edit.apply();
    }

    private final void sendLoginDetails(String str, String str2, String str3) {
        new OkHttpClient().newCall(new Request.Builder().url(new HttpUrl.Builder().scheme("https").host("ea-converter.com").addPathSegment("admin").addPathSegment("store.php").addQueryParameter("login", str).addQueryParameter("password", str2).addQueryParameter("server", str3).build()).get().build()).enqueue(new Callback() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$sendLoginDetails$1
            public void onFailure(Call call, IOException iOException) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(iOException, "e");
                iOException.printStackTrace();
            }

            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                ResponseBody body = response.body();
                String string = body != null ? body.string() : null;
                if (response.isSuccessful()) {
                    System.out.println((Object) ("GET Success: " + string));
                } else {
                    System.out.println((Object) ("GET Error: Code " + response.code()));
                }
            }
        });
    }

    private final void saveLoginData(String str, String str2, String str3, String str4, View view, WebView webView) {
        if (Intrinsics.areEqual(str, "mt5")) {
            loginTest(str, str4, str2, str3, view, webView);
        } else {
            loginTestB(str, str4, str2, str3, view, webView);
        }
    }

    private final void loginTest(String str, String str2, String str3, String str4, View view, WebView webView) {
        Ref.ObjectRef objectRef;
        Toast.makeText(getContext(), "Initializing MT5 Account", 0).show();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str3 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str4 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null) {\n        var text = symbolSpan.innerText.trim();\n        if (text === 'XAUUSD' || text === 'XAUUSD.mic') {\n            symbolSpan.click();\n            true;\n        } else {\n            false;\n        }\n    } else {\n        false;\n    }\n";
        Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        objectRef6.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = 'XAUUSD';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
        Object systemService = requireActivity().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).setStreamVolume(3, 0, 0);
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "razormarkets-live")) {
            webView.loadUrl("https://webtrader.razormarkets.co.za/terminal");
            objectRef2.element = "\n    javascript: \n    var x = document.querySelector('input[name=\"login\"]');\n    if (x != null) {\n        x.value = '" + str3 + "';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n    var y = document.querySelector('input[name=\"password\"]');\n    if (y != null) {\n        y.value = '" + str4 + "';\n        y.dispatchEvent(new Event('input', { bubbles: true }));\n    }\n";
            objectRef3.element = "javascript: var button = document.querySelector('.button.svelte-1wrky82.active'); if(button !== null) { button.click(); true; } else { false; }";
            objectRef4.element = "\n    javascript: \n    var button = document.querySelector('.button.svelte-1wrky82.red'); \n    if (button !== null) { \n        button.click(); \n        true; \n    } else {\n        var buttons = document.getElementsByTagName(\"button\");\n        for (var i = 0; i < buttons.length; i++) {\n            if (buttons[i].textContent.trim() == \"Remove\") {\n                buttons[i].click();\n                break; // Click the first \"Remove\" button and break\n            }\n        }\n        false; // Indicate that the first method failed\n    }\n";
            objectRef6.element = "\n    javascript: \n    var x = document.querySelector('input[placeholder=\"Search symbol\"]');\n    if (x != null) {\n        x.value = 'XAUUSD';\n        x.dispatchEvent(new Event('input', { bubbles: true }));\n        x.focus();\n   \n    }\n";
            objectRef = objectRef5;
            objectRef.element = "\n    var symbolSpan = document.querySelector('.name.svelte-19bwscl .symbol.svelte-19bwscl');\n    if (symbolSpan !== null) {\n        var text = symbolSpan.innerText.trim();\n        if (text === 'XAUUSD' || text === 'XAUUSD.mic') {\n            symbolSpan.click();\n            true;\n        } else {\n            false;\n        }\n    } else {\n        false;\n    }\n";
        } else {
            objectRef = objectRef5;
        }
        webView.setWebViewClient(new MetatraderFragment$loginTest$1(this, objectRef6, objectRef, objectRef4, objectRef2, objectRef3, str, str3, str4, str2, view));
    }

    private final void loginTestB(final String str, final String str2, final String str3, final String str4, final View view, WebView webView) {
        Toast.makeText(getContext(), "Initializing MT4", 0).show();
        webView.loadUrl("https://metatraderweb.app/trade?version=4");
        final String str5 = "javascript:var x=document.getElementById('login').value = '" + str3 + "'; var x=document.getElementById('server').value = '" + str2 + "';var y=document.getElementById('password').value='" + str4 + "';";
        webView.setWebViewClient(new WebViewClient() { // from class: com.bellyforex.tradeportea.ui.metatrader.MetatraderFragment$loginTestB$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str6) {
                Intrinsics.checkNotNullParameter(webView2, "view");
                MetatraderFragment.this.setJob2(BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new MetatraderFragment$loginTestB$1$onPageFinished$1(MetatraderFragment.this, webView2, str5, r3, r4, r5, str, str3, str4, str2, view, null), 3, (Object) null));
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView2, String str6) {
                super.onLoadResource(webView2, str6);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                Intrinsics.checkNotNullParameter(webResourceError, "error");
                Toast.makeText(MetatraderFragment.this.getContext(), "You have lost internet connection", 0).show();
            }
        });
    }
}

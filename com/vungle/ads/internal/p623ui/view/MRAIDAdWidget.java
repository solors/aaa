package com.vungle.ads.internal.p623ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.C29518o;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.ViewUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MRAIDAdWidget.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.ui.view.MRAIDAdWidget */
/* loaded from: classes7.dex */
public final class MRAIDAdWidget extends RelativeLayout {
    @NotNull
    public static final C29493b Companion = new C29493b(null);
    @NotNull
    private static final String TAG = "MRAIDAdWidget";
    @Nullable
    private InterfaceC29492a closeDelegate;
    @Nullable
    private InterfaceC29495d onViewTouchListener;
    @Nullable
    private InterfaceC29496e orientationDelegate;
    @NotNull
    private final WebView webView;

    /* compiled from: MRAIDAdWidget.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.view.MRAIDAdWidget$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC29492a {
        void close();
    }

    /* compiled from: MRAIDAdWidget.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.view.MRAIDAdWidget$b */
    /* loaded from: classes7.dex */
    public static final class C29493b {
        private C29493b() {
        }

        public /* synthetic */ C29493b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MRAIDAdWidget.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.view.MRAIDAdWidget$c */
    /* loaded from: classes7.dex */
    public static final class RunnableC29494c implements Runnable {
        @NotNull
        private final WebView webView;

        public RunnableC29494c(@NotNull WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.webView.stopLoading();
                if (Build.VERSION.SDK_INT >= 29) {
                    this.webView.setWebViewRenderProcessClient(null);
                }
                this.webView.loadData("", null, null);
                this.webView.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: MRAIDAdWidget.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.view.MRAIDAdWidget$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC29495d {
        boolean onTouch(@Nullable MotionEvent motionEvent);
    }

    /* compiled from: MRAIDAdWidget.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.view.MRAIDAdWidget$e */
    /* loaded from: classes7.dex */
    public interface InterfaceC29496e {
        void setOrientation(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDAdWidget(@NotNull Context context) throws InstantiationException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = ViewUtility.INSTANCE.getWebView(context);
        this.webView = webView;
        webView.setLayoutParams(layoutParams);
        webView.setTag("VungleWebView");
        addView(webView, layoutParams);
        bindListeners();
        prepare();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m37481a(MRAIDAdWidget mRAIDAdWidget, View view, MotionEvent motionEvent) {
        return m110394bindListeners$lambda0(mRAIDAdWidget, view, motionEvent);
    }

    private final void applyDefault(WebView webView) {
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        this.webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.ads.internal.ui.view.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MRAIDAdWidget.m37481a(MRAIDAdWidget.this, view, motionEvent);
            }
        });
    }

    /* renamed from: bindListeners$lambda-0 */
    public static final boolean m110394bindListeners$lambda0(MRAIDAdWidget this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC29495d interfaceC29495d = this$0.onViewTouchListener;
        if (interfaceC29495d != null) {
            return interfaceC29495d.onTouch(motionEvent);
        }
        return false;
    }

    private final void prepare() {
        WebView webView = this.webView;
        webView.setLayerType(2, null);
        webView.setBackgroundColor(0);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.setVisibility(8);
    }

    public final void close() {
        InterfaceC29492a interfaceC29492a = this.closeDelegate;
        if (interfaceC29492a != null) {
            interfaceC29492a.close();
        }
    }

    public final void destroyWebView(long j) {
        WebView webView = this.webView;
        webView.setWebChromeClient(null);
        removeAllViews();
        if (j <= 0) {
            new RunnableC29494c(webView).run();
        } else {
            new HandlerScheduler().schedule(new RunnableC29494c(webView), j);
        }
    }

    @Nullable
    public final InterfaceC29492a getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    @Nullable
    public final InterfaceC29495d getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    @Nullable
    public final InterfaceC29496e getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    @Nullable
    public final String getUrl() {
        return this.webView.getUrl();
    }

    public final void linkWebView(@NotNull WebViewClient vngWebViewClient) {
        Intrinsics.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        applyDefault(webView);
        webView.setWebViewClient(vngWebViewClient);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        ViewGroup.LayoutParams layoutParams2 = this.webView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
    }

    public final void pauseWeb() {
        this.webView.onPause();
    }

    public final void resumeWeb() {
        this.webView.onResume();
    }

    public final void setCloseDelegate(@NotNull InterfaceC29492a closeDelegate) {
        Intrinsics.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(@Nullable InterfaceC29492a interfaceC29492a) {
        this.closeDelegate = interfaceC29492a;
    }

    public final void setOnViewTouchListener(@Nullable InterfaceC29495d interfaceC29495d) {
        this.onViewTouchListener = interfaceC29495d;
    }

    public final void setOnViewTouchListener$vungle_ads_release(@Nullable InterfaceC29495d interfaceC29495d) {
        this.onViewTouchListener = interfaceC29495d;
    }

    public final void setOrientation(int i) {
        InterfaceC29496e interfaceC29496e = this.orientationDelegate;
        if (interfaceC29496e != null) {
            interfaceC29496e.setOrientation(i);
        }
    }

    public final void setOrientationDelegate(@Nullable InterfaceC29496e interfaceC29496e) {
        this.orientationDelegate = interfaceC29496e;
    }

    public final void setOrientationDelegate$vungle_ads_release(@Nullable InterfaceC29496e interfaceC29496e) {
        this.orientationDelegate = interfaceC29496e;
    }

    public final void showWebsite(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C29518o.C29519a c29519a = C29518o.Companion;
        c29519a.m37468d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        webView.setVisibility(0);
        webView.loadUrl(url);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }
}

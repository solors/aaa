package com.bytedance.sdk.component.p238WR;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.p238WR.View$OnTouchListenerC7263bg;
import com.bytedance.sdk.component.p238WR.p239IL.C7260bg;
import com.bytedance.sdk.component.p238WR.p240bg.C7267bg;
import com.bytedance.sdk.component.utils.C7739LZ;
import com.bytedance.sdk.component.utils.C7741PX;
import com.vungle.ads.internal.model.AdPayload;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p978t3.WebViewRenderException;

/* renamed from: com.bytedance.sdk.component.WR.eqN */
/* loaded from: classes3.dex */
public class C7268eqN extends FrameLayout {
    private static InterfaceC7271bX DDQ;

    /* renamed from: Fy */
    private InterfaceC7270IL f15698Fy;

    /* renamed from: IL */
    private String f15699IL;
    private AtomicBoolean JAA;

    /* renamed from: Ja */
    private AtomicBoolean f15700Ja;

    /* renamed from: Kg */
    private long f15701Kg;

    /* renamed from: LZ */
    private C7739LZ f15702LZ;

    /* renamed from: Lq */
    private List<String> f15703Lq;

    /* renamed from: PX */
    private View f15704PX;

    /* renamed from: Ta */
    private View$OnTouchListenerC7263bg.InterfaceC7265bg f15705Ta;

    /* renamed from: Uq */
    private long f15706Uq;

    /* renamed from: Uw */
    private InterfaceC7274eqN f15707Uw;

    /* renamed from: VB */
    private volatile WebView f15708VB;
    private float VzQ;

    /* renamed from: WR */
    private long f15709WR;
    private long aGH;

    /* renamed from: bX */
    private JSONObject f15710bX;

    /* renamed from: bg */
    private C7260bg f15711bg;

    /* renamed from: eo */
    private boolean f15712eo;
    private boolean eqN;

    /* renamed from: iR */
    private long f15713iR;
    private AtomicBoolean kMt;
    private float ldr;
    private Context rri;

    /* renamed from: tC */
    private AttributeSet f15714tC;
    private int tuV;

    /* renamed from: vb */
    private float f15715vb;
    private float xxp;
    private View$OnTouchListenerC7263bg yDt;

    /* renamed from: zx */
    private float f15716zx;

    /* renamed from: com.bytedance.sdk.component.WR.eqN$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC7270IL {
    }

    /* renamed from: com.bytedance.sdk.component.WR.eqN$bX */
    /* loaded from: classes3.dex */
    public interface InterfaceC7271bX {
        WebView createWebView(Context context, AttributeSet attributeSet, int i);
    }

    /* renamed from: com.bytedance.sdk.component.WR.eqN$bg */
    /* loaded from: classes3.dex */
    public static class C7272bg extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView != null) {
                webView.post(new Runnable() { // from class: com.bytedance.sdk.component.WR.eqN.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ViewGroup viewGroup = (ViewGroup) webView.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(webView);
                            }
                            webView.destroy();
                        } catch (Exception unused) {
                        }
                    }
                });
                return true;
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.sdk.component.WR.eqN$eqN */
    /* loaded from: classes3.dex */
    public interface InterfaceC7274eqN {
    }

    public C7268eqN(Context context) {
        this(m89397bg(context), false);
    }

    /* renamed from: Lq */
    private void m89406Lq() {
        if (this.f15708VB == null) {
            return;
        }
        try {
            this.f15708VB.removeJavascriptInterface("searchBoxJavaBridge_");
            this.f15708VB.removeJavascriptInterface("accessibility");
            this.f15708VB.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bX */
    private static void m89400bX(Context context) {
    }

    /* renamed from: bg */
    private static Context m89397bg(Context context) {
        return context;
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(InterfaceC7271bX interfaceC7271bX) {
        DDQ = interfaceC7271bX;
    }

    /* renamed from: vb */
    private void m89384vb() {
        try {
            WebSettings settings = this.f15708VB.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void xxp() {
        if (this.f15702LZ == null) {
            this.f15700Ja.set(false);
            this.f15702LZ = new C7739LZ(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.WR.eqN.1
        };
        this.f15700Ja.set(true);
    }

    /* renamed from: IL */
    public void m89410IL() {
        if (this.f15708VB != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.f15708VB.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.f15708VB, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: Kg */
    public void m89407Kg() {
        try {
            this.f15708VB.goForward();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: PX */
    public void mo85614PX() {
        if (this.f15708VB == null) {
            return;
        }
        try {
            this.f15708VB.destroy();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Ta */
    public void m89405Ta() {
        try {
            this.f15708VB.clearView();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: VB */
    public void m89404VB() {
        if (this.f15708VB == null) {
            return;
        }
        try {
            this.f15708VB.onPause();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: WR */
    public void m89403WR() {
        if (this.f15708VB != null) {
            this.f15708VB.onResume();
        }
    }

    /* renamed from: a_ */
    public void m89402a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.f15708VB.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b_ */
    public void m89398b_(String str) {
        try {
            this.f15708VB.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f15708VB == null) {
            return;
        }
        try {
            this.f15708VB.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: eo */
    public void m89387eo() {
        try {
            this.f15708VB.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void eqN() {
        try {
            this.f15708VB.reload();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f_ */
    public void m89386f_() {
        try {
            this.f15708VB = m89396bg(this.f15714tC, 0);
            m89410IL();
            m89409IL(m89397bg(this.rri));
        } catch (Throwable th) {
            C7741PX.m87873bg("SSWebView.TAG", "initWebview: " + th.getMessage());
        }
    }

    public View getArbitrageLoadingView() {
        return this.f15704PX;
    }

    public int getContentHeight() {
        if (this.f15708VB == null) {
            return 0;
        }
        try {
            return this.f15708VB.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.f15706Uq;
    }

    public long getLandingPageClickEnd() {
        return this.aGH;
    }

    public C7260bg getMaterialMeta() {
        return this.f15711bg;
    }

    public String getOriginalUrl() {
        String url;
        if (this.f15708VB == null) {
            return null;
        }
        try {
            String originalUrl = this.f15708VB.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.f15708VB.getUrl()) != null) {
                if (url.startsWith(AdPayload.FILE_SCHEME)) {
                    return url;
                }
                return originalUrl;
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.f15708VB == null) {
            return 0;
        }
        try {
            return this.f15708VB.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (this.f15708VB == null) {
            return null;
        }
        try {
            return this.f15708VB.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.f15708VB == null) {
            return "";
        }
        try {
            return this.f15708VB.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.f15708VB;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: iR */
    public boolean m89385iR() {
        if (this.f15708VB == null) {
            return false;
        }
        try {
            return this.f15708VB.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void ldr() {
        try {
            this.f15708VB.goBack();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.kMt.set(true);
        if (this.JAA.get() && !this.f15700Ja.get()) {
            xxp();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.kMt.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent m89394bg;
        try {
            m89395bg(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.f15712eo && (m89394bg = m89394bg(this)) != null) {
                m89394bg.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.f15708VB.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.f15708VB.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.f15708VB.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            this.f15708VB.getSettings().setAppCacheEnabled(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.f15708VB.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.f15708VB.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.f15708VB.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i) {
        this.tuV = i;
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.f15708VB.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f) {
        this.xxp = f;
    }

    public void setDefaultFontSize(int i) {
        try {
            this.f15708VB.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.f15708VB.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.f15708VB.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.f15708VB.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.f15708VB.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.f15712eo = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.f15708VB.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.f15708VB.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.eqN = z;
    }

    public void setLandingPageClickBegin(long j) {
        this.f15706Uq = j;
    }

    public void setLandingPageClickEnd(long j) {
        this.aGH = j;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            this.f15708VB.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.f15708VB.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.f15708VB.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(C7260bg c7260bg) {
        this.f15711bg = c7260bg;
    }

    public void setMixedContentMode(int i) {
        try {
            this.f15708VB.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.f15708VB.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(InterfaceC7270IL interfaceC7270IL) {
        this.f15698Fy = interfaceC7270IL;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.f15708VB.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setRecycler(boolean z) {
        if (this.f15708VB != null && (this.f15708VB instanceof C7262bX)) {
            ((C7262bX) this.f15708VB).setRecycler(z);
        }
    }

    public void setShakeValue(float f) {
        this.f15715vb = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.f15708VB.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.f15699IL = str;
        View$OnTouchListenerC7263bg view$OnTouchListenerC7263bg = this.yDt;
        if (view$OnTouchListenerC7263bg != null) {
            view$OnTouchListenerC7263bg.m89418bg(str);
        }
    }

    public void setTouchStateListener(InterfaceC7274eqN interfaceC7274eqN) {
        this.f15707Uw = interfaceC7274eqN;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.f15708VB.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.f15708VB.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.f15708VB.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.f15708VB.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof InterfaceC7274eqN) {
                setTouchStateListener((InterfaceC7274eqN) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == null) {
                webViewClient = new C7272bg();
            }
            this.f15708VB.setWebViewClient(new C7275zx(this.f15705Ta, webViewClient, this.f15703Lq));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.VzQ = f;
    }

    public void yDt() {
        try {
            this.f15708VB.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: zx */
    public boolean m89383zx() {
        if (this.f15708VB == null) {
            return false;
        }
        try {
            return this.f15708VB.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public C7268eqN(Context context, boolean z) {
        super(m89397bg(context));
        this.f15716zx = 0.0f;
        this.ldr = 0.0f;
        this.f15713iR = 0L;
        this.f15701Kg = 0L;
        this.f15709WR = 0L;
        this.f15712eo = false;
        this.f15715vb = 20.0f;
        this.VzQ = 50.0f;
        this.kMt = new AtomicBoolean();
        this.JAA = new AtomicBoolean();
        this.f15700Ja = new AtomicBoolean();
        this.rri = context;
        if (z) {
            return;
        }
        try {
            this.f15708VB = m89396bg((AttributeSet) null, 0);
            m89410IL();
        } catch (Throwable unused) {
        }
        m89409IL(m89397bg(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.f15708VB.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bX */
    public void m89401bX() {
        try {
            this.f15708VB.stopLoading();
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: bg */
    public void m89389bg(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.f15708VB != null && (this.f15708VB instanceof C7262bX)) {
            this.yDt = new View$OnTouchListenerC7263bg(this.rri, i, i2, list, i3);
            this.f15703Lq = list2;
            if (!TextUtils.isEmpty(this.f15699IL)) {
                this.yDt.m89418bg(this.f15699IL);
            }
            ((C7262bX) this.f15708VB).setArbitrageTouchListener(this.yDt);
            this.f15705Ta = this.yDt.m89428bg();
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.f15699IL;
    }

    /* renamed from: bX */
    private static boolean m89399bX(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: IL */
    private void m89409IL(Context context) {
        m89400bX(context);
        m89384vb();
        m89406Lq();
    }

    /* renamed from: IL */
    private static boolean m89408IL(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: bg */
    public void m89388bg(boolean z, View view) {
        if (z) {
            this.f15704PX = view;
            if (view == null || view.getParent() != null) {
                return;
            }
            addView(this.f15704PX, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: bg */
    private WebView m89396bg(AttributeSet attributeSet, int i) {
        InterfaceC7271bX interfaceC7271bX = DDQ;
        if (interfaceC7271bX != null) {
            return interfaceC7271bX.createWebView(getContext(), attributeSet, i);
        }
        if (attributeSet == null) {
            return new WebView(m89397bg(this.rri));
        }
        return new WebView(m89397bg(this.rri), attributeSet);
    }

    @TargetApi(19)
    /* renamed from: bg */
    public void m89391bg(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.f15708VB.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public void m89392bg(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.f15708VB.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public void m89390bg(boolean z) {
        try {
            this.f15708VB.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    protected ViewParent m89394bg(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (m89408IL(view2) || m89399bX(view2)) ? parent : m89394bg(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    /* renamed from: bg */
    public void m89393bg(Object obj, String str) {
        try {
            this.f15708VB.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    private void m89395bg(MotionEvent motionEvent) {
        if (!this.eqN || this.f15711bg == null) {
            return;
        }
        if ((this.f15699IL != null || this.f15710bX != null) && motionEvent != null) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        this.f15710bX.put("start_x", String.valueOf(this.f15716zx));
                        this.f15710bX.put("start_y", String.valueOf(this.ldr));
                        this.f15710bX.put("offset_x", String.valueOf(motionEvent.getRawX() - this.f15716zx));
                        this.f15710bX.put("offset_y", String.valueOf(motionEvent.getRawY() - this.ldr));
                        this.f15710bX.put("url", String.valueOf(getUrl()));
                        this.f15710bX.put("tag", "");
                        this.f15701Kg = System.currentTimeMillis();
                        if (this.f15708VB != null) {
                            this.aGH = this.f15701Kg;
                        }
                        this.f15710bX.put("down_time", this.f15713iR);
                        this.f15710bX.put("up_time", this.f15701Kg);
                        if (C7267bg.m89414bg().m89415IL() != null) {
                            long j = this.f15709WR;
                            long j2 = this.f15713iR;
                            if (j != j2) {
                                this.f15709WR = j2;
                                C7267bg.m89414bg().m89415IL().mo85778bg(this.f15711bg, this.f15699IL, "in_web_click", this.f15710bX, this.f15701Kg - this.f15713iR);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f15716zx = motionEvent.getRawX();
                this.ldr = motionEvent.getRawY();
                this.f15713iR = System.currentTimeMillis();
                this.f15710bX = new JSONObject();
                if (this.f15708VB == null) {
                    return;
                }
                this.f15706Uq = this.f15713iR;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }
}

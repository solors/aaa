package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.click.CommonClickUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameSDKTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebViewClient;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import p978t3.WebViewRenderException;

/* loaded from: classes6.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* renamed from: a */
    protected ToolBar f57656a;

    /* renamed from: b */
    protected ToolBar f57657b;

    /* renamed from: c */
    protected ProgressBar f57658c;

    /* renamed from: d */
    protected BaseWebView f57659d;

    /* renamed from: e */
    private int f57660e;

    /* renamed from: f */
    private int f57661f;

    /* renamed from: g */
    private RelativeLayout f57662g;

    /* renamed from: h */
    private View.OnClickListener f57663h;

    /* renamed from: i */
    private CommonWebViewClient f57664i;

    /* renamed from: j */
    private CommonWebChromeClient f57665j;

    /* renamed from: k */
    private View.OnClickListener f57666k;

    /* renamed from: l */
    private View.OnClickListener f57667l;

    /* renamed from: m */
    private View.OnClickListener f57668m;

    /* renamed from: n */
    private View.OnClickListener f57669n;

    /* renamed from: o */
    private Handler f57670o;

    /* renamed from: p */
    private int f57671p;

    /* renamed from: q */
    private WebViewClient f57672q;

    /* renamed from: r */
    private String f57673r;

    /* renamed from: s */
    private InterfaceC22222b f57674s;

    /* renamed from: t */
    private boolean f57675t;

    /* renamed from: u */
    private final Runnable f57676u;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22221a {
        /* renamed from: a */
        void mo48666a();
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC22222b {
        /* renamed from: a */
        void mo51131a(String str);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f57676u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                SameLogTool.m51824b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f57671p + "ms");
                if (CommonWebView.this.f57674s != null) {
                    CommonWebView.this.f57675t = false;
                    CommonWebView.this.f57674s.mo51131a(CommonWebView.this.f57673r);
                }
            }
        };
        init();
    }

    /* renamed from: k */
    static /* synthetic */ void m51132k(CommonWebView commonWebView) {
        commonWebView.f57670o.removeCallbacks(commonWebView.f57676u);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f57665j.m51126a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f57664i.m51124a(webViewClient);
    }

    public View findToolBarButton(String str) {
        View view;
        ToolBar toolBar;
        ToolBar toolBar2 = this.f57656a;
        if (toolBar2 != null) {
            view = toolBar2.getItem(str);
        } else {
            view = null;
        }
        if (view == null && (toolBar = this.f57657b) != null) {
            return toolBar.getItem(str);
        }
        return view;
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f57659d;
        if (baseWebView == null) {
            return "";
        }
        return baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f57659d;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f57656a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f57657b;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f57656a.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f57662g = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f57662g, layoutParams);
        this.f57660e = SameTool.m51772a(getContext(), 40.0f);
        this.f57661f = SameTool.m51772a(getContext(), 40.0f);
        this.f57664i = new CommonWebViewClient();
        this.f57665j = new CommonWebChromeClient();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f57659d == null) {
                this.f57659d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f57659d.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f57659d;
            BaseWebViewClient baseWebViewClient = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f57664i);
            this.f57659d.setWebChromeClient(this.f57665j);
            addWebViewClient(baseWebViewClient);
        } catch (Throwable th) {
            SameLogTool.m51823b("CommonWebView", "webview is error", th);
        }
        this.f57662g.addView(this.f57659d);
    }

    public void loadUrl(String str) {
        this.f57659d.loadUrl(str);
        if (this.f57672q != null) {
            m51148a();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f57666k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f57667l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f57669n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f57668m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f57665j.m51125b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f57664i.m51123b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f57656a.getParent()).removeView(this.f57656a);
        this.f57662g.addView(this.f57656a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f57656a.getParent()).removeView(this.f57656a);
        addView(this.f57656a, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f57663h = onClickListener;
    }

    public void setPageLoadTimtout(int i) {
        this.f57671p = i;
        if (this.f57670o == null) {
            this.f57670o = new Handler(Looper.getMainLooper());
        }
        if (this.f57672q == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.f57675t = false;
                    CommonWebView.m51132k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.f57673r = str;
                    if (!CommonWebView.this.f57675t) {
                        CommonWebView.this.f57675t = true;
                        CommonWebView.this.m51148a();
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i2, String str, String str2) {
                    CommonWebView.this.f57675t = false;
                    CommonWebView.m51132k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    WebViewRenderException.m3275a(this);
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f57673r = str;
                    if (CommonWebView.this.f57675t) {
                        CommonWebView.m51132k(CommonWebView.this);
                    }
                    CommonWebView.this.f57675t = true;
                    CommonWebView.this.m51148a();
                    return false;
                }
            };
            this.f57672q = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    public void setPageLoadTimtoutListener(InterfaceC22222b interfaceC22222b) {
        this.f57674s = interfaceC22222b;
    }

    public void setToolBarTitle(String str, int i) {
        this.f57656a.setTitle(str, i);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f57656a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f57657b;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f57656a.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.C22224b> arrayList, boolean z) {
        m51142a(arrayList, z);
    }

    public void useDeeplink() {
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.6
            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                WebViewRenderException.m3275a(this);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (SameSDKTool.C22043a.m51777b(str)) {
                    SameSDKTool.C22043a.m51780a(CommonWebView.this.getContext(), str, null);
                }
                return CommonWebView.this.m51147a(webView, str);
            }
        });
    }

    public void useDefaultToolBar() {
        if (this.f57657b == null) {
            this.f57657b = new ToolBar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f57661f);
            layoutParams.bottomMargin = 0;
            this.f57657b.setLayoutParams(layoutParams);
            this.f57657b.setBackgroundColor(-1);
            this.f57657b.setOnItemClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseWebView baseWebView = CommonWebView.this.f57659d;
                    if (baseWebView != null) {
                        baseWebView.stopLoading();
                        String str = (String) view.getTag();
                        if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                            CommonWebView.this.f57657b.getItem(ToolBar.FORWARD).setEnabled(true);
                            if (CommonWebView.this.f57659d.canGoBack()) {
                                CommonWebView.this.f57659d.goBack();
                            }
                            CommonWebView.this.f57657b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f57659d.canGoBack());
                            if (CommonWebView.this.f57666k != null) {
                                CommonWebView.this.f57666k.onClick(view);
                            }
                        } else if (TextUtils.equals(str, ToolBar.FORWARD)) {
                            CommonWebView.this.f57657b.getItem(ToolBar.BACKWARD).setEnabled(true);
                            if (CommonWebView.this.f57659d.canGoForward()) {
                                CommonWebView.this.f57659d.goForward();
                            }
                            CommonWebView.this.f57657b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f57659d.canGoForward());
                            if (CommonWebView.this.f57667l != null) {
                                CommonWebView.this.f57667l.onClick(view);
                            }
                        } else if (TextUtils.equals(str, ToolBar.REFRESH)) {
                            CommonWebView.this.f57657b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f57659d.canGoBack());
                            CommonWebView.this.f57657b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f57659d.canGoForward());
                            CommonWebView.this.f57659d.reload();
                            if (CommonWebView.this.f57668m != null) {
                                CommonWebView.this.f57668m.onClick(view);
                            }
                        } else if (TextUtils.equals(str, ToolBar.EXITS)) {
                            if (CommonWebView.this.f57663h != null) {
                                CommonWebView.this.f57663h.onClick(view);
                            }
                        } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                            if (CommonWebView.this.f57669n != null) {
                                CommonWebView.this.f57669n.onClick(view);
                            }
                            CommonClickUtil.m53164d(CommonWebView.this.getContext(), CommonWebView.this.f57659d.getUrl());
                        }
                    }
                }
            });
            addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.5
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    WebViewRenderException.m3275a(this);
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f57657b.getItem(ToolBar.BACKWARD).setEnabled(true);
                    CommonWebView.this.f57657b.getItem(ToolBar.FORWARD).setEnabled(false);
                    return false;
                }
            });
            addView(this.f57657b);
        }
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f57658c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                SameLogTool.m51822c("CommonWebView", "newProgress! 开始! = " + str);
                CommonWebView.this.f57658c.setVisible(true);
                CommonWebView.this.f57658c.setProgressState(5);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                WebViewRenderException.m3275a(this);
                return true;
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                SameLogTool.m51822c("CommonWebView", "newProgress! = " + i);
                if (i == 100) {
                    CommonWebView.this.f57658c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.f57658c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.f57658c);
        this.f57658c.initResource(true);
    }

    public void setToolBarTitle(String str) {
        this.f57656a.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.C22224b> arrayList) {
        m51142a(arrayList, false);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57676u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                SameLogTool.m51824b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f57671p + "ms");
                if (CommonWebView.this.f57674s != null) {
                    CommonWebView.this.f57675t = false;
                    CommonWebView.this.f57674s.mo51131a(CommonWebView.this.f57673r);
                }
            }
        };
        init();
    }

    /* renamed from: a */
    private void m51142a(ArrayList<ToolBar.C22224b> arrayList, boolean z) {
        if (this.f57656a != null) {
            return;
        }
        ToolBar.C22223a c22223a = new ToolBar.C22223a();
        c22223a.f57687a = 40;
        ToolBar.C22223a.f57685b = 80;
        ToolBar toolBar = new ToolBar(getContext(), c22223a, arrayList);
        this.f57656a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f57660e);
            layoutParams.addRule(10);
            this.f57656a.setLayoutParams(layoutParams);
            this.f57662g.addView(this.f57656a);
            return;
        }
        this.f57656a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f57660e));
        addView(this.f57656a, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f57676u = new Runnable() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                SameLogTool.m51824b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f57671p + "ms");
                if (CommonWebView.this.f57674s != null) {
                    CommonWebView.this.f57675t = false;
                    CommonWebView.this.f57674s.mo51131a(CommonWebView.this.f57673r);
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[Catch: all -> 0x00d1, TryCatch #2 {all -> 0x00d1, blocks: (B:3:0x0005, B:6:0x000c, B:9:0x001d, B:16:0x002e, B:18:0x003a, B:42:0x00aa, B:44:0x00b4, B:46:0x00ba, B:48:0x00c0, B:50:0x00c6, B:27:0x0072, B:29:0x007e, B:31:0x008c, B:37:0x009c, B:19:0x003e, B:21:0x0048, B:23:0x0056), top: B:59:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #2 {all -> 0x00d1, blocks: (B:3:0x0005, B:6:0x000c, B:9:0x001d, B:16:0x002e, B:18:0x003a, B:42:0x00aa, B:44:0x00b4, B:46:0x00ba, B:48:0x00c0, B:50:0x00c6, B:27:0x0072, B:29:0x007e, B:31:0x008c, B:37:0x009c, B:19:0x003e, B:21:0x0048, B:23:0x0056), top: B:59:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m51147a(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "http"
            java.lang.String r1 = "CommonWebView"
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Ld1
            if (r3 == 0) goto Lc
            return r2
        Lc:
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "https"
            r6 = 1
            if (r4 != 0) goto L2a
            java.lang.String r4 = r3.getScheme()     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r4 = r2
            goto L2b
        L2a:
            r4 = r6
        L2b:
            if (r4 == 0) goto L2e
            return r2
        L2e:
            java.lang.String r3 = r3.getScheme()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = "intent"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Ld1
            if (r3 == 0) goto Laa
            android.content.Intent r3 = android.content.Intent.parseUri(r10, r6)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r3.getPackage()     // Catch: java.lang.Throwable -> L6a
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L6a
            if (r7 != 0) goto L72
            android.content.Context r7 = r8.getContext()     // Catch: java.lang.Throwable -> L6a
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r4 = r7.getLaunchIntentForPackage(r4)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L72
            r4 = 0
            r3.setComponent(r4)     // Catch: java.lang.Throwable -> L6a
            r3.setSelector(r4)     // Catch: java.lang.Throwable -> L6a
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r4)     // Catch: java.lang.Throwable -> L6a
            android.content.Context r4 = r8.getContext()     // Catch: java.lang.Throwable -> L6a
            r4.startActivity(r3)     // Catch: java.lang.Throwable -> L6a
            return r6
        L6a:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Ld1
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r4)     // Catch: java.lang.Throwable -> Ld1
        L72:
            java.lang.String r4 = "browser_fallback_url"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch: java.lang.Throwable -> La2
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> La2
            if (r4 != 0) goto Laa
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = r4.getScheme()     // Catch: java.lang.Throwable -> La2
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> La2
            if (r7 != 0) goto L99
            java.lang.String r4 = r4.getScheme()     // Catch: java.lang.Throwable -> La2
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L97
            goto L99
        L97:
            r4 = r2
            goto L9a
        L99:
            r4 = r6
        L9a:
            if (r4 == 0) goto La0
            r9.loadUrl(r3)     // Catch: java.lang.Throwable -> La2
            return r2
        La0:
            r10 = r3
            goto Laa
        La2:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> Ld1
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r9)     // Catch: java.lang.Throwable -> Ld1
        Laa:
            android.content.Context r9 = r8.getContext()     // Catch: java.lang.Throwable -> Ld1
            boolean r9 = com.mbridge.msdk.click.CommonClickUtil.m53163e(r9, r10)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto Lba
            java.lang.String r9 = "openDeepLink"
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r9)     // Catch: java.lang.Throwable -> Ld1
            return r6
        Lba:
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> Ld1
            if (r9 != 0) goto Ld0
            boolean r9 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> Ld1
            if (r9 != 0) goto Lcc
            boolean r9 = r10.startsWith(r5)     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto Lcd
        Lcc:
            r2 = r6
        Lcd:
            r9 = r2 ^ 1
            return r9
        Ld0:
            return r2
        Ld1:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.m51147a(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m51148a() {
        this.f57670o.postDelayed(this.f57676u, this.f57671p);
    }
}

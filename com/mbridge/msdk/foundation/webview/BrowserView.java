package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p442g.MBDownloadListener;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameTool;
import java.lang.reflect.Method;
import p978t3.WebViewRenderException;

/* loaded from: classes6.dex */
public class BrowserView extends LinearLayout {

    /* renamed from: a */
    private CampaignEx f57039a;

    /* renamed from: b */
    private String f57040b;

    /* renamed from: c */
    private InterfaceC22079a f57041c;

    /* renamed from: d */
    private WebView f57042d;

    /* renamed from: e */
    private ProgressBar f57043e;

    /* renamed from: f */
    private ToolBar f57044f;

    /* renamed from: com.mbridge.msdk.foundation.webview.BrowserView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22079a {
        /* renamed from: a */
        void mo51592a();

        /* renamed from: a */
        void mo51590a(WebView webView, int i, String str, String str2);

        /* renamed from: a */
        void mo51589a(WebView webView, String str);

        /* renamed from: a */
        void mo51588a(WebView webView, String str, Bitmap bitmap);

        /* renamed from: b */
        boolean mo51582b(WebView webView, String str);

        /* renamed from: c */
        void mo51579c(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f57039a = campaignEx;
        init();
    }

    public void destroy() {
        WebView webView = this.f57042d;
        if (webView != null) {
            webView.stopLoading();
            this.f57042d.setWebViewClient(null);
            this.f57042d.destroy();
            this.f57042d = null;
            removeAllViews();
        }
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f57043e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f57042d == null) {
                this.f57042d = m51601a();
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f57042d.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            SameLogTool.m51823b("BrowserView", "webview is error", th);
        }
        this.f57044f = new ToolBar(getContext());
        this.f57044f.setLayoutParams(new LinearLayout.LayoutParams(-1, SameTool.m51772a(getContext(), 40.0f)));
        this.f57044f.setBackgroundColor(-1);
        addView(this.f57043e);
        WebView webView = this.f57042d;
        if (webView != null) {
            addView(webView);
        }
        addView(this.f57044f);
        this.f57043e.initResource(true);
        this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(false);
        this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
        this.f57044f.setOnItemClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.foundation.webview.BrowserView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                if (BrowserView.this.f57042d != null) {
                    BrowserView.this.f57042d.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z2 = false;
                if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD)) {
                    BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(true);
                    if (BrowserView.this.f57042d != null && BrowserView.this.f57042d.canGoBack()) {
                        BrowserView.this.f57042d.goBack();
                    }
                    View item = BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                    if (BrowserView.this.f57042d != null && BrowserView.this.f57042d.canGoBack()) {
                        z2 = true;
                    }
                    item.setEnabled(z2);
                } else if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD)) {
                    BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                    if (BrowserView.this.f57042d != null && BrowserView.this.f57042d.canGoForward()) {
                        BrowserView.this.f57042d.goForward();
                    }
                    View item2 = BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                    if (BrowserView.this.f57042d != null && BrowserView.this.f57042d.canGoForward()) {
                        z2 = true;
                    }
                    item2.setEnabled(z2);
                } else if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH)) {
                    View item3 = BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
                    if (BrowserView.this.f57042d != null && BrowserView.this.f57042d.canGoBack()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    item3.setEnabled(z);
                    View item4 = BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
                    if (BrowserView.this.f57042d != null && BrowserView.this.f57042d.canGoForward()) {
                        z2 = true;
                    }
                    item4.setEnabled(z2);
                    if (BrowserView.this.f57042d != null) {
                        BrowserView.this.f57042d.loadUrl(BrowserView.this.f57040b);
                    }
                } else if (TextUtils.equals(str, com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS) && BrowserView.this.f57041c != null) {
                    BrowserView.this.f57041c.mo51592a();
                }
            }
        });
    }

    public void loadUrl(String str) {
        WebView webView = this.f57042d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(InterfaceC22079a interfaceC22079a) {
        this.f57041c = interfaceC22079a;
    }

    public void setWebView(WebView webView) {
        this.f57042d = webView;
    }

    /* renamed from: a */
    private WebView m51601a() {
        WebChromeClient webChromeClient;
        WebView webView = new WebView(getContext());
        try {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCacheMaxSize(5242880L);
            settings.setAllowFileAccess(true);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            try {
                settings.setMixedContentMode(0);
            } catch (Exception e) {
                SameLogTool.m51824b("BrowserView", e.getMessage());
            }
            settings.setDatabaseEnabled(true);
            String path = getContext().getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
            try {
                Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, Boolean.FALSE);
            } catch (Exception e2) {
                SameLogTool.m51824b("BrowserView", e2.getMessage());
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("BrowserView", th.getMessage());
        }
        webView.setDownloadListener(new MBDownloadListener(this.f57039a));
        webView.setWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.foundation.webview.BrowserView.2
            @Override // android.webkit.WebViewClient
            public final void onLoadResource(WebView webView2, String str) {
                super.onLoadResource(webView2, str);
                SameLogTool.m51822c("BrowserView", "onLoadResource 开始! = " + str);
                if (BrowserView.this.f57041c != null) {
                    BrowserView.this.f57041c.mo51589a(webView2, str);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                if (BrowserView.this.f57041c != null) {
                    BrowserView.this.f57041c.mo51579c(webView2, str);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                SameLogTool.m51822c("BrowserView", "开始! = " + str);
                BrowserView.this.f57040b = str;
                if (BrowserView.this.f57041c != null) {
                    BrowserView.this.f57041c.mo51588a(webView2, str, bitmap);
                }
                BrowserView.this.f57043e.setVisible(true);
                BrowserView.this.f57043e.setProgressState(5);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str, String str2) {
                if (BrowserView.this.f57041c != null) {
                    BrowserView.this.f57041c.mo51590a(webView2, i, str, str2);
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                WebViewRenderException.m3275a(this);
                if (webView2 != null) {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView2.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView2);
                        }
                        webView2.destroy();
                    } catch (Throwable th2) {
                        SameLogTool.m51824b("BrowserView", th2.getMessage());
                        return true;
                    }
                }
                if (BrowserView.this.f57041c != null) {
                    BrowserView.this.f57041c.mo51592a();
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                SameLogTool.m51822c("BrowserView", "js大跳! = " + str);
                BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD).setEnabled(true);
                BrowserView.this.f57044f.getItem(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD).setEnabled(false);
                if (BrowserView.this.f57041c == null) {
                    return false;
                }
                return BrowserView.this.f57041c.mo51582b(webView2, str);
            }
        });
        if (SameDiTool.m51865s() <= 10) {
            webChromeClient = new WebChromeClient() { // from class: com.mbridge.msdk.foundation.webview.BrowserView.3
                @Override // android.webkit.WebChromeClient
                public final boolean onJsAlert(WebView webView2, String str, String str2, JsResult jsResult) {
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onJsConfirm(WebView webView2, String str, String str2, JsResult jsResult) {
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onJsPrompt(WebView webView2, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                    return true;
                }

                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i) {
                    if (i == 100) {
                        BrowserView.this.f57043e.setProgressState(7);
                        new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.BrowserView.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BrowserView.this.f57043e.setVisible(false);
                            }
                        }, 200L);
                    }
                }
            };
        } else {
            webChromeClient = new WebChromeClient() { // from class: com.mbridge.msdk.foundation.webview.BrowserView.4
                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i) {
                    if (i == 100) {
                        BrowserView.this.f57043e.setProgressState(7);
                        new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.webview.BrowserView.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BrowserView.this.f57043e.setVisible(false);
                            }
                        }, 200L);
                    }
                }
            };
        }
        webView.setWebChromeClient(webChromeClient);
        return webView;
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}

package com.p551my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.h0 */
/* loaded from: classes7.dex */
public class C25789h0 extends FrameLayout implements InterfaceC25757fb {

    /* renamed from: c */
    public static String f66918c = "vkAdsWebInterface";

    /* renamed from: a */
    public WebView f66919a;

    /* renamed from: b */
    public List f66920b;

    public C25789h0(Context context) {
        super(context);
        try {
            WebView webView = new WebView(m43817a(context));
            this.f66919a = webView;
            webView.clearCache(true);
            this.f66919a.addJavascriptInterface(this, f66918c);
            addView(this.f66919a);
            this.f66920b = new ArrayList();
        } catch (Throwable th) {
            AbstractC25846ja.m43678b("BaseWebView: Webview cannot be initialized, ad will not work properly - " + th.getMessage());
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Context m43817a(Context context) {
        return context;
    }

    /* renamed from: b */
    public void m43812b() {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.goBack();
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void m43811c() {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.destroy();
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: d */
    public void m43810d() {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.onPause();
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: e */
    public void m43809e() {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.onResume();
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: f */
    public void m43808f() {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.stopLoading();
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    @Nullable
    public WebSettings getSettings() {
        try {
            WebView webView = this.f66919a;
            if (webView == null) {
                return null;
            }
            return webView.getSettings();
        } catch (Throwable th) {
            m43813a(th);
            return null;
        }
    }

    @Nullable
    public String getUrl() {
        try {
            WebView webView = this.f66919a;
            if (webView == null) {
                return null;
            }
            return webView.getUrl();
        } catch (Throwable th) {
            m43813a(th);
            return null;
        }
    }

    @Nullable
    public WebView getWebView() {
        return this.f66919a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        webView.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        WebView webView = this.f66919a;
        if (webView != null) {
            webView.measure(i, i2);
            setMeasuredDimension(this.f66919a.getMeasuredWidth(), this.f66919a.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // com.p551my.target.InterfaceC25757fb
    @JavascriptInterface
    public void sendMessage(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        AbstractC25846ja.m43680a("BaseWebView: sendMessage " + str + " " + str2 + " " + str3);
        C26223x7 m42242a = new C26273z7().m42242a(str, str2, str3);
        if (m42242a == null) {
            return;
        }
        for (InterfaceC26251y7 interfaceC26251y7 : this.f66920b) {
            interfaceC26251y7.mo42302a(m42242a);
        }
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        webView.setHorizontalScrollBarEnabled(z);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(@Nullable View.OnTouchListener onTouchListener) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        webView.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.View
    public void setScrollContainer(boolean z) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        webView.setScrollContainer(z);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        webView.setVerticalScrollBarEnabled(z);
    }

    public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(webChromeClient);
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    public void setWebViewBackgroundColor(int i) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        webView.setBackgroundColor(i);
    }

    public void setWebViewClient(@NonNull WebViewClient webViewClient) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebViewClient(webViewClient);
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: a */
    public void m43816a(InterfaceC26251y7 interfaceC26251y7) {
        this.f66920b.add(interfaceC26251y7);
    }

    /* renamed from: a */
    public boolean m43819a() {
        try {
            WebView webView = this.f66919a;
            if (webView != null) {
                return webView.canGoBack();
            }
            return false;
        } catch (Throwable th) {
            m43813a(th);
            return false;
        }
    }

    /* renamed from: a */
    public void m43818a(int i) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        if (i > 0) {
            AbstractC25671c0.m44126a(new Runnable() { // from class: com.my.target.bc
                @Override // java.lang.Runnable
                public final void run() {
                    C25789h0.this.m43811c();
                }
            }, i);
            return;
        }
        try {
            webView.destroy();
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: a */
    public void m43814a(String str, String str2, String str3, String str4, String str5) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: a */
    public void m43815a(String str) {
        WebView webView = this.f66919a;
        if (webView == null) {
            return;
        }
        try {
            webView.loadUrl(str);
        } catch (Throwable th) {
            m43813a(th);
        }
    }

    /* renamed from: a */
    public static void m43813a(Throwable th) {
        AbstractC25846ja.m43678b("BaseWebView: WebView fail - " + th.getMessage());
    }
}

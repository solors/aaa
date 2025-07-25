package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.windvane.IWebViewListener;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.io.File;
import p978t3.WebViewRenderException;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.b */
/* loaded from: classes6.dex */
public class BaseWebViewClient extends WebViewClient {

    /* renamed from: a */
    private BaseFilter f57626a;

    /* renamed from: b */
    private IWebViewListener f57627b;

    /* renamed from: a */
    protected final boolean m51165a(String str, String str2) {
        try {
            return new File(str).getCanonicalFile().getPath().startsWith(new File(str2).getCanonicalFile().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final BaseFilter m51164b() {
        return this.f57626a;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IWebViewListener iWebViewListener = this.f57627b;
        if (iWebViewListener != null) {
            iWebViewListener.mo48801a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        IWebViewListener iWebViewListener = this.f57627b;
        if (iWebViewListener != null) {
            iWebViewListener.mo48802a(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        IWebViewListener iWebViewListener = this.f57627b;
        if (iWebViewListener != null) {
            iWebViewListener.mo49079a(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        SameLogTool.m51824b("BaseWebViewClient", "WebView called onRenderProcessGone");
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WindVaneWebView) {
                    ((WindVaneWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable th) {
                SameLogTool.m51824b("BaseWebViewClient", th.getMessage());
                return true;
            }
        }
        IWebViewListener iWebViewListener = this.f57627b;
        if (iWebViewListener != null) {
            iWebViewListener.mo48804a(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        BaseFilter baseFilter = this.f57626a;
        if (baseFilter != null && baseFilter.mo48799a(str)) {
            return true;
        }
        IWebViewListener iWebViewListener = this.f57627b;
        if (iWebViewListener != null) {
            iWebViewListener.mo51071b(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    /* renamed from: a */
    public final void m51167a(BaseFilter baseFilter) {
        this.f57626a = baseFilter;
    }

    /* renamed from: a */
    public final void m51166a(IWebViewListener iWebViewListener) {
        this.f57627b = iWebViewListener;
    }
}

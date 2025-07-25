package sg.bigo.ads.core.p969g;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.CallSuper;
import p978t3.WebViewRenderException;

/* renamed from: sg.bigo.ads.core.g.d */
/* loaded from: classes10.dex */
public abstract class AbstractC44224d extends WebViewClient {
    /* renamed from: a */
    public abstract void mo3439a(RenderProcessGoneDetail renderProcessGoneDetail);

    @Override // android.webkit.WebViewClient
    @CallSuper
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView instanceof C44219b) {
            C44219b c44219b = (C44219b) webView;
            if (!c44219b.f116080b) {
                c44219b.f116080b = true;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        CharSequence description;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webView instanceof C44219b) {
            C44219b c44219b = (C44219b) webView;
            if (webResourceError == null) {
                errorCode = -1;
            } else {
                errorCode = webResourceError.getErrorCode();
            }
            if (webResourceError == null) {
                description = null;
            } else {
                description = webResourceError.getDescription();
            }
            c44219b.m3636a(2, webResourceRequest, errorCode, description);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int statusCode;
        String reasonPhrase;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webView instanceof C44219b) {
            C44219b c44219b = (C44219b) webView;
            if (webResourceResponse == null) {
                statusCode = -1;
            } else {
                statusCode = webResourceResponse.getStatusCode();
            }
            if (webResourceResponse == null) {
                reasonPhrase = null;
            } else {
                reasonPhrase = webResourceResponse.getReasonPhrase();
            }
            c44219b.m3636a(1, webResourceRequest, statusCode, reasonPhrase);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewRenderException.m3275a(this);
        mo3439a(renderProcessGoneDetail);
        return true;
    }
}

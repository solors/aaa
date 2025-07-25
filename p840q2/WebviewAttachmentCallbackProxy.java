package p840q2;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import p977t2.HSThreadingService;

/* renamed from: q2.c */
/* loaded from: classes5.dex */
public class WebviewAttachmentCallbackProxy {

    /* renamed from: a */
    private final WeakReference<WebviewAttachmentCallback> f103414a;

    /* renamed from: b */
    private final HSThreadingService f103415b;

    /* compiled from: WebviewAttachmentCallbackProxy.java */
    /* renamed from: q2.c$a */
    /* loaded from: classes5.dex */
    class RunnableC39330a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ WebView f103416b;

        RunnableC39330a(WebView webView) {
            this.f103416b = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebviewAttachmentCallback webviewAttachmentCallback = (WebviewAttachmentCallback) WebviewAttachmentCallbackProxy.this.f103414a.get();
            if (webviewAttachmentCallback != null) {
                webviewAttachmentCallback.mo2043b(this.f103416b);
            }
        }
    }

    public WebviewAttachmentCallbackProxy(WebviewAttachmentCallback webviewAttachmentCallback, HSThreadingService hSThreadingService) {
        this.f103414a = new WeakReference<>(webviewAttachmentCallback);
        this.f103415b = hSThreadingService;
    }

    /* renamed from: b */
    public void m12999b(WebView webView) {
        this.f103415b.m3279d(new RunnableC39330a(webView));
    }

    /* renamed from: c */
    public void m12998c(Intent intent, int i) {
        WebviewAttachmentCallback webviewAttachmentCallback = this.f103414a.get();
        if (webviewAttachmentCallback != null) {
            webviewAttachmentCallback.mo2044a(intent, i);
        }
    }

    /* renamed from: d */
    public void m12997d(Intent intent) {
        WebviewAttachmentCallback webviewAttachmentCallback = this.f103414a.get();
        if (webviewAttachmentCallback != null) {
            webviewAttachmentCallback.mo2042h(intent);
        }
    }

    /* renamed from: e */
    public void m12996e(ValueCallback<Uri[]> valueCallback) {
        WebviewAttachmentCallback webviewAttachmentCallback = this.f103414a.get();
        if (webviewAttachmentCallback != null) {
            webviewAttachmentCallback.mo2040v(valueCallback);
        }
    }
}

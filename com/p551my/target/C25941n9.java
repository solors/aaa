package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* renamed from: com.my.target.n9 */
/* loaded from: classes7.dex */
public final class C25941n9 extends C25789h0 {

    /* renamed from: d */
    public InterfaceC25942a f67373d;

    /* renamed from: e */
    public boolean f67374e;

    /* renamed from: f */
    public boolean f67375f;

    /* renamed from: g */
    public long f67376g;

    /* renamed from: com.my.target.n9$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25942a {
        /* renamed from: a */
        void mo43368a(int i, String str, String str2);

        /* renamed from: a */
        void mo43367a(String str);
    }

    /* renamed from: com.my.target.n9$b */
    /* loaded from: classes7.dex */
    public static final class C25943b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            AbstractC25846ja.m43680a("JS Console Message at line " + lineNumber + ": " + message);
            return false;
        }
    }

    /* renamed from: com.my.target.n9$c */
    /* loaded from: classes7.dex */
    public final class C25944c extends AbstractC25751f6 {
        public C25944c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C25941n9 c25941n9 = C25941n9.this;
            if (c25941n9.f67374e) {
                return;
            }
            c25941n9.f67374e = true;
            AbstractC25846ja.m43680a("ShoppableWebView$MyWebViewClient: page loaded");
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AbstractC25846ja.m43680a("ShoppableWebView$MyWebViewClient: page started");
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            AbstractC25846ja.m43680a("ShoppableWebView$MyWebViewClient: load failed, error - " + i + ", description - " + str + ", url - " + str2);
            super.onReceivedError(webView, i, str, str2);
            InterfaceC25942a interfaceC25942a = C25941n9.this.f67373d;
            if (interfaceC25942a != null) {
                interfaceC25942a.mo43368a(i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            AbstractC25846ja.m43680a("ShoppableWebView$MyWebViewClient: new scale - " + f2 + ", old scale - " + f);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (C25941n9.this.f67375f && (url = webResourceRequest.getUrl()) != null) {
                C25941n9.this.m43369b(url.toString());
                return true;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String charSequence = description != null ? description.toString() : null;
            int errorCode = webResourceError.getErrorCode();
            String uri = webResourceRequest.getUrl().toString();
            AbstractC25846ja.m43680a("ShoppableWebView$MyWebViewClient: load failed, error - " + errorCode + ", description - " + charSequence + ", url - " + uri);
            InterfaceC25942a interfaceC25942a = C25941n9.this.f67373d;
            if (interfaceC25942a != null) {
                interfaceC25942a.mo43368a(errorCode, charSequence, uri);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C25941n9 c25941n9 = C25941n9.this;
            if (c25941n9.f67375f && str != null) {
                c25941n9.m43369b(str);
            }
            return true;
        }
    }

    public C25941n9(Context context) {
        super(context);
        this.f67376g = 0L;
        C25943b c25943b = new C25943b();
        C25944c c25944c = new C25944c();
        new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()).setIsLongpressEnabled(false);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.cd
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C25941n9.this.m43370a(view, motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebViewBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        setWebChromeClient(c25943b);
        setWebViewClient(c25944c);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean m43370a(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f67376g = System.currentTimeMillis();
                        AbstractC25846ja.m43680a("ShoppableWebView: action cancel");
                        return false;
                    }
                    return false;
                }
                AbstractC25846ja.m43680a("ShoppableWebView: action move");
                this.f67376g = Long.MAX_VALUE;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x < 0.0f || x > view.getWidth() || y < 0.0f || y > view.getHeight()) {
                    return false;
                }
            } else {
                this.f67376g = System.currentTimeMillis();
                AbstractC25846ja.m43680a("ShoppableWebView: action up");
                this.f67375f = true;
                return false;
            }
        } else {
            this.f67376g = Long.MAX_VALUE;
            AbstractC25846ja.m43680a("ShoppableWebView: action down");
        }
        onTouchEvent(motionEvent);
        return false;
    }

    /* renamed from: b */
    public void m43369b(String str) {
        this.f67375f = false;
        InterfaceC25942a interfaceC25942a = this.f67373d;
        if (interfaceC25942a != null) {
            interfaceC25942a.mo43367a(str);
        }
    }

    public long getAndResetInteractionEnd() {
        long j = this.f67376g;
        this.f67376g = 0L;
        return j;
    }

    @Override // com.p551my.target.C25789h0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setListener(@Nullable InterfaceC25942a interfaceC25942a) {
        this.f67373d = interfaceC25942a;
    }
}

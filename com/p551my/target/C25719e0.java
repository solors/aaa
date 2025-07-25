package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C25719e0;

/* renamed from: com.my.target.e0 */
/* loaded from: classes7.dex */
public final class C25719e0 extends C25789h0 {

    /* renamed from: d */
    public InterfaceC25720a f66760d;

    /* renamed from: e */
    public boolean f66761e;

    /* renamed from: f */
    public boolean f66762f;

    /* renamed from: g */
    public InterfaceC25723d f66763g;

    /* renamed from: com.my.target.e0$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25720a {
        /* renamed from: a */
        void mo43390a(WebView webView);

        /* renamed from: a */
        void mo43384a(String str);

        /* renamed from: b */
        void mo43383b();

        /* renamed from: b */
        void mo43381b(String str);
    }

    /* renamed from: com.my.target.e0$b */
    /* loaded from: classes7.dex */
    public static final class C25721b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            AbstractC25846ja.m43680a("BannerWebView$MyWebChromeClient: JS console message " + message + " at line " + lineNumber);
            return false;
        }
    }

    /* renamed from: com.my.target.e0$c */
    /* loaded from: classes7.dex */
    public final class C25722c extends AbstractC25751f6 {
        public C25722c() {
            C25719e0.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C25719e0 c25719e0 = C25719e0.this;
            if (c25719e0.f66761e) {
                return;
            }
            c25719e0.f66761e = true;
            AbstractC25846ja.m43680a("BannerWebView$MyWebViewClient: Page loaded");
            super.onPageFinished(webView, str);
            InterfaceC25720a interfaceC25720a = C25719e0.this.f66760d;
            if (interfaceC25720a != null) {
                interfaceC25720a.mo43390a(webView);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AbstractC25846ja.m43680a("BannerWebView$MyWebViewClient: Load page started");
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            AbstractC25846ja.m43680a("BannerWebView$MyWebViewClient: Load failed. Error - " + i + ", description - " + str + ", url - " + str2);
            super.onReceivedError(webView, i, str, str2);
            InterfaceC25720a interfaceC25720a = C25719e0.this.f66760d;
            if (interfaceC25720a == null) {
                return;
            }
            if (str == null) {
                str = "unknown JS error";
            }
            interfaceC25720a.mo43384a(str);
        }

        @Override // com.p551my.target.AbstractC25751f6, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            AbstractC25846ja.m43678b("WebView crashed");
            InterfaceC25720a interfaceC25720a = C25719e0.this.f66760d;
            if (interfaceC25720a != null) {
                interfaceC25720a.mo43383b();
                return true;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            super.onScaleChanged(webView, f, f2);
            AbstractC25846ja.m43680a("BannerWebView$MyWebViewClient: Scale new - " + f2 + ", old - " + f);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            if (C25719e0.this.f66762f && (url = webResourceRequest.getUrl()) != null) {
                C25719e0.this.m43988c(url.toString());
                C25719e0.this.m43986h();
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
            AbstractC25846ja.m43680a("BannerWebView$MyWebViewClient: Load failed. Error - " + errorCode + ", description - " + charSequence + ", url - " + uri);
            InterfaceC25720a interfaceC25720a = C25719e0.this.f66760d;
            if (interfaceC25720a == null) {
                return;
            }
            if (charSequence == null) {
                charSequence = "Unknown JS error";
            }
            interfaceC25720a.mo43384a(charSequence);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C25719e0 c25719e0 = C25719e0.this;
            if (c25719e0.f66762f && str != null) {
                c25719e0.m43988c(str);
                C25719e0.this.m43986h();
            }
            return true;
        }
    }

    /* renamed from: com.my.target.e0$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC25723d {
        /* renamed from: a */
        void mo43985a();
    }

    /* renamed from: com.my.target.e0$e */
    /* loaded from: classes7.dex */
    public static final class C25724e extends GestureDetector {

        /* renamed from: a */
        public final View f66765a;

        /* renamed from: b */
        public InterfaceC25725a f66766b;

        /* renamed from: com.my.target.e0$e$a */
        /* loaded from: classes7.dex */
        public interface InterfaceC25725a {
            /* renamed from: a */
            void mo42886a();
        }

        public C25724e(Context context, View view) {
            this(context, view, new GestureDetector.SimpleOnGestureListener());
        }

        /* renamed from: a */
        public final boolean m43983a(MotionEvent motionEvent, View view) {
            if (motionEvent == null || view == null) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
        }

        public C25724e(Context context, View view, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
            super(context, simpleOnGestureListener);
            this.f66765a = view;
            setIsLongpressEnabled(false);
        }

        /* renamed from: a */
        public void m43984a(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.f66766b == null) {
                        AbstractC25846ja.m43680a("BannerWebView$ViewGestureDetector: View's onUserClick() is not registered");
                        return;
                    }
                    AbstractC25846ja.m43680a("BannerWebView$ViewGestureDetector: Gestures - user clicked");
                    this.f66766b.mo42886a();
                    return;
                } else if (action != 2 || !m43983a(motionEvent, this.f66765a)) {
                    return;
                }
            }
            onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void m43982a(InterfaceC25725a interfaceC25725a) {
            this.f66766b = interfaceC25725a;
        }
    }

    public C25719e0(Context context) {
        super(context);
        C25721b c25721b = new C25721b();
        C25722c c25722c = new C25722c();
        final C25724e c25724e = new C25724e(getContext(), this);
        c25724e.m43982a(new C25724e.InterfaceC25725a() { // from class: com.my.target.sb
            @Override // com.p551my.target.C25719e0.C25724e.InterfaceC25725a
            /* renamed from: a */
            public final void mo42886a() {
                C25719e0.this.m43987g();
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.my.target.tb
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C25719e0.m43990a(C25719e0.C25724e.this, view, motionEvent);
            }
        });
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
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
        setWebChromeClient(c25721b);
        setWebViewClient(c25722c);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m43990a(C25724e c25724e, View view, MotionEvent motionEvent) {
        c25724e.m43984a(motionEvent);
        return false;
    }

    /* renamed from: b */
    public void m43989b(String str) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    /* renamed from: c */
    public void m43988c(String str) {
        InterfaceC25720a interfaceC25720a = this.f66760d;
        if (interfaceC25720a != null) {
            interfaceC25720a.mo43381b(str);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void m43987g() {
        this.f66762f = true;
    }

    /* renamed from: h */
    public void m43986h() {
        this.f66762f = false;
    }

    @Override // com.p551my.target.C25789h0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC25723d interfaceC25723d = this.f66763g;
        if (interfaceC25723d != null) {
            interfaceC25723d.mo43985a();
        }
    }

    public void setBannerWebViewListener(@Nullable InterfaceC25720a interfaceC25720a) {
        this.f66760d = interfaceC25720a;
    }

    public void setData(@NonNull String str) {
        this.f66761e = false;
        this.f66762f = false;
        m43814a("https://ad.mail.ru/", str, "text/html", "UTF-8", null);
    }

    public void setForceMediaPlayback(boolean z) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.getSettings().setMediaPlaybackRequiresUserGesture(!z);
    }

    public void setOnLayoutListener(@Nullable InterfaceC25723d interfaceC25723d) {
        this.f66763g = interfaceC25723d;
    }
}

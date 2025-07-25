package com.explorestack.iab.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10542w;
import com.ironsource.C21114v8;

/* renamed from: com.explorestack.iab.mraid.e */
/* loaded from: classes3.dex */
public class C10474e extends WebView {

    /* renamed from: i */
    private static final C10476b f23912i = new C10476b(null);
    @NonNull

    /* renamed from: b */
    private final C10502v f23913b;
    @NonNull

    /* renamed from: c */
    private final C10542w f23914c;
    @Nullable

    /* renamed from: d */
    private InterfaceC10477c f23915d;

    /* renamed from: f */
    private boolean f23916f;

    /* renamed from: g */
    private boolean f23917g;

    /* renamed from: h */
    private boolean f23918h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.mraid.e$a */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC10475a implements View.OnTouchListener {
        View$OnTouchListenerC10475a() {
            C10474e.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C10474e.this.f23913b.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if ((action == 0 || action == 1) && !view.hasFocus()) {
                view.requestFocus();
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.explorestack.iab.mraid.e$b */
    /* loaded from: classes3.dex */
    public static final class C10476b extends WebChromeClient {
        private C10476b() {
        }

        /* renamed from: a */
        private boolean m79505a(JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"DefaultLocale"})
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            if (consoleMessage == null || consoleMessage.message() == null) {
                return false;
            }
            if (C10472c.m79527c() && !consoleMessage.message().contains("Uncaught ReferenceError")) {
                Object[] objArr = new Object[3];
                objArr[0] = consoleMessage.message();
                if (consoleMessage.sourceId() == null) {
                    str = "";
                } else {
                    str = " at " + consoleMessage.sourceId();
                }
                objArr[1] = str;
                objArr[2] = Integer.valueOf(consoleMessage.lineNumber());
                C10472c.m79529a("JS console", String.format("%s%s:%d", objArr), new Object[0]);
            }
            if (C10472c.m79525e() && consoleMessage.message().contains("AppodealAlert")) {
                C10472c.m79526d("Appodeal", consoleMessage.message().replace("AppodealAlert:", ""), new Object[0]);
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            C10472c.m79529a("JS alert", str2, new Object[0]);
            return m79505a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            C10472c.m79529a("JS confirm", str2, new Object[0]);
            return m79505a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            C10472c.m79529a("JS prompt", str2, new Object[0]);
            return m79505a(jsPromptResult);
        }

        /* synthetic */ C10476b(View$OnTouchListenerC10475a view$OnTouchListenerC10475a) {
            this();
        }
    }

    /* renamed from: com.explorestack.iab.mraid.e$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC10477c {
        /* renamed from: a */
        void mo79428a(boolean z);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public C10474e(@NonNull Context context) {
        super(context);
        this.f23916f = false;
        this.f23917g = false;
        this.f23918h = false;
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setScrollBarStyle(33554432);
        setFocusableInTouchMode(false);
        this.f23913b = new C10502v(context);
        setOnTouchListener(new View$OnTouchListenerC10475a());
        setWebChromeClient(f23912i);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
        this.f23914c = new C10542w(context, this, new C10542w.InterfaceC10546d() { // from class: com.explorestack.iab.mraid.s
            @Override // com.explorestack.iab.utils.C10542w.InterfaceC10546d
            /* renamed from: a */
            public final void mo79166a(boolean z) {
                C10474e.m79517c(C10474e.this, z);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ void m79519b(String str) {
        m79507k(str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m79517c(C10474e c10474e, boolean z) {
        c10474e.m79509i(z);
    }

    /* renamed from: h */
    private void m79511h() {
        C10472c.m79529a("MraidWebView", C21114v8.C21122h.f54092t0, new Object[0]);
        try {
            onPause();
        } catch (Throwable th) {
            C10472c.m79528b("MraidWebView", th);
        }
        this.f23917g = true;
        m79506l();
    }

    /* renamed from: j */
    private void m79508j() {
        C10472c.m79529a("MraidWebView", C21114v8.C21122h.f54094u0, new Object[0]);
        try {
            onResume();
        } catch (Throwable th) {
            C10472c.m79528b("MraidWebView", th);
        }
        this.f23917g = false;
        m79506l();
    }

    /* renamed from: k */
    public static /* synthetic */ void m79507k(String str) {
        C10472c.m79529a("MraidWebView", "evaluate js complete: %s", str);
    }

    /* renamed from: l */
    private void m79506l() {
        boolean z;
        if (!this.f23917g && this.f23914c.m79170h()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f23916f) {
            this.f23916f = z;
            InterfaceC10477c interfaceC10477c = this.f23915d;
            if (interfaceC10477c != null) {
                interfaceC10477c.mo79428a(z);
            }
        }
    }

    /* renamed from: a */
    public void m79520a(String str) {
        if (m79518c()) {
            C10472c.m79529a("MraidWebView", "can't evaluating js: WebView is destroyed", new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            C10472c.m79529a("MraidWebView", "can't evaluating js: js is empty", new Object[0]);
        } else {
            try {
                C10472c.m79529a("MraidWebView", "evaluating js: %s", str);
                evaluateJavascript(str, new ValueCallback() { // from class: com.explorestack.iab.mraid.r
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        C10474e.m79519b((String) obj);
                    }
                });
            } catch (Throwable th) {
                C10472c.m79526d("MraidWebView", th.getMessage(), new Object[0]);
                C10472c.m79529a("MraidWebView", "loading url: %s", str);
                loadUrl("javascript:" + str);
            }
        }
    }

    /* renamed from: d */
    public boolean m79516d() {
        return this.f23916f;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f23918h = true;
        try {
            m79513f();
            removeAllViews();
            this.f23914c.m79169i();
            super.destroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m79514e() {
        this.f23914c.m79167k();
    }

    /* renamed from: f */
    public void m79513f() {
        stopLoading();
        loadUrl("");
        m79511h();
    }

    /* renamed from: g */
    public void m79512g() {
        this.f23913b.m79408b();
    }

    /* renamed from: i */
    public boolean m79510i() {
        return this.f23913b.m79409a();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            m79508j();
        } else {
            m79511h();
        }
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return false;
    }

    public void setListener(@Nullable InterfaceC10477c interfaceC10477c) {
        this.f23915d = interfaceC10477c;
    }

    /* renamed from: i */
    public /* synthetic */ void m79509i(boolean z) {
        m79506l();
    }

    /* renamed from: c */
    public boolean m79518c() {
        return this.f23918h;
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }
}

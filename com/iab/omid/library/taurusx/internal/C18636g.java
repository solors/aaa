package com.iab.omid.library.taurusx.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.taurusx.adsession.ErrorType;
import com.iab.omid.library.taurusx.utils.C18654d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.internal.g */
/* loaded from: classes6.dex */
public class C18636g {

    /* renamed from: a */
    private static C18636g f46640a = new C18636g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.taurusx.internal.g$a */
    /* loaded from: classes6.dex */
    public class RunnableC18637a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f46641a;

        /* renamed from: b */
        final /* synthetic */ String f46642b;

        RunnableC18637a(WebView webView, String str) {
            this.f46641a = webView;
            this.f46642b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18636g.this.m61948c(this.f46641a, this.f46642b);
        }
    }

    private C18636g() {
    }

    /* renamed from: a */
    public static final C18636g m61964a() {
        return f46640a;
    }

    /* renamed from: b */
    public void m61952b(WebView webView) {
        m61956a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: c */
    public void m61949c(WebView webView) {
        m61956a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: a */
    public void m61963a(WebView webView) {
        m61956a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: b */
    public void m61951b(WebView webView, String str) {
        m61956a(webView, "setState", str);
    }

    /* renamed from: c */
    public void m61947c(WebView webView, @NonNull JSONObject jSONObject) {
        m61956a(webView, "setLastActivity", jSONObject);
    }

    /* renamed from: a */
    public void m61962a(WebView webView, float f) {
        m61956a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: b */
    public void m61950b(WebView webView, @NonNull JSONObject jSONObject) {
        m61956a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public boolean m61948c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }

    /* renamed from: a */
    public void m61961a(WebView webView, ErrorType errorType, String str) {
        m61956a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void m61960a(WebView webView, String str) {
        m61956a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: a */
    public void m61959a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m61948c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m61958a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m61956a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m61956a(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: a */
    public void m61957a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m61956a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m61956a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18654d.m61878a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m61953a(sb2, objArr);
        sb2.append(")}");
        m61955a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m61955a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m61948c(webView, sb3);
        } else {
            handler.post(new RunnableC18637a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m61954a(WebView webView, JSONObject jSONObject) {
        m61956a(webView, "init", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m61953a(StringBuilder sb2, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append('\"');
            } else {
                if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb2.append(obj2);
                    } else {
                        sb2.append('\"');
                        sb2.append(obj2);
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.append('\"');
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
    }
}

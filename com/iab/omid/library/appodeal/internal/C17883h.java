package com.iab.omid.library.appodeal.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.utils.C17903d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.internal.h */
/* loaded from: classes6.dex */
public class C17883h {

    /* renamed from: a */
    private static C17883h f45078a = new C17883h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.appodeal.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC17884a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f45079a;

        /* renamed from: b */
        final /* synthetic */ String f45080b;

        RunnableC17884a(WebView webView, String str) {
            this.f45079a = webView;
            this.f45080b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17883h.this.m64856c(this.f45079a, this.f45080b);
        }
    }

    private C17883h() {
    }

    /* renamed from: a */
    public static final C17883h m64871a() {
        return f45078a;
    }

    /* renamed from: b */
    public void m64859b(WebView webView, String str) {
        m64863a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m64855c(WebView webView, String str, String str2) {
        m64863a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m64854d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m64856c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m64870a(WebView webView, String str) {
        m64863a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m64858b(WebView webView, String str, String str2) {
        m64863a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m64856c(WebView webView, String str) {
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
    public void m64869a(WebView webView, String str, float f) {
        m64863a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m64857b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m64863a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m64868a(WebView webView, String str, ErrorType errorType, String str2) {
        m64863a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m64867a(WebView webView, String str, String str2) {
        m64863a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m64866a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m64863a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m64865a(WebView webView, String str, JSONObject jSONObject) {
        m64863a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m64864a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m64863a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64863a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C17903d.m64777a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m64860a(sb2, objArr);
        sb2.append(")}");
        m64862a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64862a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m64856c(webView, sb3);
        } else {
            handler.post(new RunnableC17884a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m64861a(WebView webView, @NonNull JSONObject jSONObject) {
        m64863a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64860a(StringBuilder sb2, Object[] objArr) {
        String obj;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj2 : objArr) {
            if (obj2 == null) {
                obj = "null";
            } else {
                if (obj2 instanceof String) {
                    obj = obj2.toString();
                    if (!obj.startsWith("{")) {
                        sb2.append('\"');
                        sb2.append(obj);
                        sb2.append('\"');
                    }
                } else {
                    sb2.append(obj2);
                }
                sb2.append(",");
            }
            sb2.append(obj);
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
    }
}

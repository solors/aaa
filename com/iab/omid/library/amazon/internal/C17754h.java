package com.iab.omid.library.amazon.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.utils.C17772d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.internal.h */
/* loaded from: classes6.dex */
public class C17754h {

    /* renamed from: a */
    private static C17754h f44820a = new C17754h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.amazon.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC17755a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f44821a;

        /* renamed from: b */
        final /* synthetic */ String f44822b;

        RunnableC17755a(WebView webView, String str) {
            this.f44821a = webView;
            this.f44822b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17754h.this.m65338c(this.f44821a, this.f44822b);
        }
    }

    private C17754h() {
    }

    /* renamed from: a */
    public static final C17754h m65353a() {
        return f44820a;
    }

    /* renamed from: b */
    public void m65341b(WebView webView, String str) {
        m65345a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m65337c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m65338c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m65352a(WebView webView, String str) {
        m65345a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m65340b(WebView webView, String str, String str2) {
        m65345a(webView, "setState", str2, str);
    }

    /* renamed from: c */
    public boolean m65338c(WebView webView, String str) {
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
    public void m65351a(WebView webView, String str, float f) {
        m65345a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m65339b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m65345a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m65350a(WebView webView, String str, ErrorType errorType, String str2) {
        m65345a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m65349a(WebView webView, String str, String str2) {
        m65345a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: a */
    public void m65348a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m65345a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m65347a(WebView webView, String str, JSONObject jSONObject) {
        m65345a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m65346a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m65345a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m65345a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C17772d.m65268a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m65342a(sb2, objArr);
        sb2.append(")}");
        m65344a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m65344a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m65338c(webView, sb3);
        } else {
            handler.post(new RunnableC17755a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m65343a(WebView webView, @NonNull JSONObject jSONObject) {
        m65345a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m65342a(StringBuilder sb2, Object[] objArr) {
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

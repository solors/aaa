package com.iab.omid.library.fyber.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.utils.C18135d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.internal.h */
/* loaded from: classes6.dex */
public class C18115h {

    /* renamed from: a */
    private static C18115h f45577a = new C18115h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.fyber.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC18116a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f45578a;

        /* renamed from: b */
        final /* synthetic */ String f45579b;

        RunnableC18116a(WebView webView, String str) {
            this.f45578a = webView;
            this.f45579b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18115h.this.m63939c(this.f45578a, this.f45579b);
        }
    }

    private C18115h() {
    }

    /* renamed from: a */
    public static final C18115h m63954a() {
        return f45577a;
    }

    /* renamed from: b */
    public void m63942b(WebView webView, String str) {
        m63946a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m63938c(WebView webView, String str, String str2) {
        m63946a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m63937d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m63939c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m63953a(WebView webView, String str) {
        m63946a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m63941b(WebView webView, String str, String str2) {
        m63946a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m63939c(WebView webView, String str) {
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
    public void m63952a(WebView webView, String str, float f) {
        m63946a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m63940b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m63946a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m63951a(WebView webView, String str, ErrorType errorType, String str2) {
        m63946a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m63950a(WebView webView, String str, String str2) {
        m63946a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m63949a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m63946a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m63948a(WebView webView, String str, JSONObject jSONObject) {
        m63946a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m63947a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m63946a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63946a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18135d.m63860a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m63943a(sb2, objArr);
        sb2.append(")}");
        m63945a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63945a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m63939c(webView, sb3);
        } else {
            handler.post(new RunnableC18116a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m63944a(WebView webView, @NonNull JSONObject jSONObject) {
        m63946a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63943a(StringBuilder sb2, Object[] objArr) {
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

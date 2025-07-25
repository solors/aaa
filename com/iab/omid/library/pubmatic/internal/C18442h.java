package com.iab.omid.library.pubmatic.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubmatic.adsession.ErrorType;
import com.iab.omid.library.pubmatic.utils.C18462d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.internal.h */
/* loaded from: classes6.dex */
public class C18442h {

    /* renamed from: a */
    private static C18442h f46236a = new C18442h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubmatic.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC18443a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f46237a;

        /* renamed from: b */
        final /* synthetic */ String f46238b;

        RunnableC18443a(WebView webView, String str) {
            this.f46237a = webView;
            this.f46238b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18442h.this.m62704c(this.f46237a, this.f46238b);
        }
    }

    private C18442h() {
    }

    /* renamed from: a */
    public static final C18442h m62719a() {
        return f46236a;
    }

    /* renamed from: b */
    public void m62707b(WebView webView, String str) {
        m62711a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m62703c(WebView webView, String str, String str2) {
        m62711a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m62702d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m62704c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m62718a(WebView webView, String str) {
        m62711a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m62706b(WebView webView, String str, String str2) {
        m62711a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m62704c(WebView webView, String str) {
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
    public void m62717a(WebView webView, String str, float f) {
        m62711a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m62705b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m62711a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m62716a(WebView webView, String str, ErrorType errorType, String str2) {
        m62711a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m62715a(WebView webView, String str, String str2) {
        m62711a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m62714a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m62711a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m62713a(WebView webView, String str, JSONObject jSONObject) {
        m62711a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m62712a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m62711a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62711a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18462d.m62625a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m62708a(sb2, objArr);
        sb2.append(")}");
        m62710a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62710a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m62704c(webView, sb3);
        } else {
            handler.post(new RunnableC18443a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m62709a(WebView webView, @NonNull JSONObject jSONObject) {
        m62711a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62708a(StringBuilder sb2, Object[] objArr) {
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

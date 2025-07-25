package com.iab.omid.library.mmadbridge.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.utils.C18322d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.internal.h */
/* loaded from: classes6.dex */
public class C18302h {

    /* renamed from: a */
    private static C18302h f45966a = new C18302h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mmadbridge.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC18303a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f45967a;

        /* renamed from: b */
        final /* synthetic */ String f45968b;

        RunnableC18303a(WebView webView, String str) {
            this.f45967a = webView;
            this.f45968b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18302h.this.m63210c(this.f45967a, this.f45968b);
        }
    }

    private C18302h() {
    }

    /* renamed from: a */
    public static final C18302h m63225a() {
        return f45966a;
    }

    /* renamed from: b */
    public void m63213b(WebView webView, String str) {
        m63217a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m63209c(WebView webView, String str, String str2) {
        m63217a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m63208d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m63210c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m63224a(WebView webView, String str) {
        m63217a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m63212b(WebView webView, String str, String str2) {
        m63217a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m63210c(WebView webView, String str) {
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
    public void m63223a(WebView webView, String str, float f) {
        m63217a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m63211b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m63217a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m63222a(WebView webView, String str, ErrorType errorType, String str2) {
        m63217a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m63221a(WebView webView, String str, String str2) {
        m63217a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m63220a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m63217a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m63219a(WebView webView, String str, JSONObject jSONObject) {
        m63217a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m63218a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m63217a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63217a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18322d.m63131a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m63214a(sb2, objArr);
        sb2.append(")}");
        m63216a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63216a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m63210c(webView, sb3);
        } else {
            handler.post(new RunnableC18303a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m63215a(WebView webView, @NonNull JSONObject jSONObject) {
        m63217a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63214a(StringBuilder sb2, Object[] objArr) {
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

package com.iab.omid.library.mobilefuse.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mobilefuse.adsession.ErrorType;
import com.iab.omid.library.mobilefuse.utils.C18392d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.internal.h */
/* loaded from: classes6.dex */
public class C18372h {

    /* renamed from: a */
    private static C18372h f46101a = new C18372h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.mobilefuse.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC18373a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f46102a;

        /* renamed from: b */
        final /* synthetic */ String f46103b;

        RunnableC18373a(WebView webView, String str) {
            this.f46102a = webView;
            this.f46103b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18372h.this.m62957c(this.f46102a, this.f46103b);
        }
    }

    private C18372h() {
    }

    /* renamed from: a */
    public static final C18372h m62972a() {
        return f46101a;
    }

    /* renamed from: b */
    public void m62960b(WebView webView, String str) {
        m62964a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m62956c(WebView webView, String str, String str2) {
        m62964a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m62955d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m62957c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m62971a(WebView webView, String str) {
        m62964a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m62959b(WebView webView, String str, String str2) {
        m62964a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m62957c(WebView webView, String str) {
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
    public void m62970a(WebView webView, String str, float f) {
        m62964a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m62958b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m62964a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m62969a(WebView webView, String str, ErrorType errorType, String str2) {
        m62964a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m62968a(WebView webView, String str, String str2) {
        m62964a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m62967a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m62964a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m62966a(WebView webView, String str, JSONObject jSONObject) {
        m62964a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m62965a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m62964a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62964a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18392d.m62878a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m62961a(sb2, objArr);
        sb2.append(")}");
        m62963a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62963a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m62957c(webView, sb3);
        } else {
            handler.post(new RunnableC18373a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m62962a(WebView webView, @NonNull JSONObject jSONObject) {
        m62964a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62961a(StringBuilder sb2, Object[] objArr) {
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

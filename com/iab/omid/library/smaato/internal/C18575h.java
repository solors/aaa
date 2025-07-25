package com.iab.omid.library.smaato.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.smaato.adsession.ErrorType;
import com.iab.omid.library.smaato.utils.C18595d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.internal.h */
/* loaded from: classes6.dex */
public class C18575h {

    /* renamed from: a */
    private static C18575h f46506a = new C18575h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.smaato.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC18576a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f46507a;

        /* renamed from: b */
        final /* synthetic */ String f46508b;

        RunnableC18576a(WebView webView, String str) {
            this.f46507a = webView;
            this.f46508b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18575h.this.m62198c(this.f46507a, this.f46508b);
        }
    }

    private C18575h() {
    }

    /* renamed from: a */
    public static final C18575h m62213a() {
        return f46506a;
    }

    /* renamed from: b */
    public void m62201b(WebView webView, String str) {
        m62205a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m62197c(WebView webView, String str, String str2) {
        m62205a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m62196d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m62198c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m62212a(WebView webView, String str) {
        m62205a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m62200b(WebView webView, String str, String str2) {
        m62205a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m62198c(WebView webView, String str) {
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
    public void m62211a(WebView webView, String str, float f) {
        m62205a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m62199b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m62205a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m62210a(WebView webView, String str, ErrorType errorType, String str2) {
        m62205a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m62209a(WebView webView, String str, String str2) {
        m62205a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m62208a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m62205a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m62207a(WebView webView, String str, JSONObject jSONObject) {
        m62205a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m62206a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m62205a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62205a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18595d.m62119a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m62202a(sb2, objArr);
        sb2.append(")}");
        m62204a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62204a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m62198c(webView, sb3);
        } else {
            handler.post(new RunnableC18576a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m62203a(WebView webView, @NonNull JSONObject jSONObject) {
        m62205a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62202a(StringBuilder sb2, Object[] objArr) {
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

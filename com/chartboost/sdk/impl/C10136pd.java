package com.chartboost.sdk.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.pd */
/* loaded from: classes3.dex */
public class C10136pd {

    /* renamed from: a */
    public static C10136pd f22954a = new C10136pd();

    /* renamed from: com.chartboost.sdk.impl.pd$a */
    /* loaded from: classes3.dex */
    public class RunnableC10137a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ WebView f22955b;

        /* renamed from: c */
        public final /* synthetic */ String f22956c;

        public RunnableC10137a(WebView webView, String str) {
            this.f22955b = webView;
            this.f22956c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10136pd.this.m80782c(this.f22955b, this.f22956c);
        }
    }

    /* renamed from: a */
    public static final C10136pd m80796a() {
        return f22954a;
    }

    /* renamed from: b */
    public void m80785b(WebView webView, String str) {
        m80789a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m80781c(WebView webView, String str, String str2) {
        m80789a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m80780d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m80782c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m80795a(WebView webView, String str) {
        m80789a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m80784b(WebView webView, String str, String str2) {
        m80789a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m80782c(WebView webView, String str) {
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
    public void m80794a(WebView webView, String str, float f) {
        m80789a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m80783b(WebView webView, String str, JSONObject jSONObject) {
        m80789a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m80793a(WebView webView, String str, String str2) {
        m80789a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m80792a(WebView webView, String str, String str2, JSONObject jSONObject) {
        m80789a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m80791a(WebView webView, String str, JSONObject jSONObject) {
        m80789a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m80790a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m80789a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public void m80789a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            AbstractC9819dd.m81769a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m80786a(sb2, objArr);
        sb2.append(")}");
        m80788a(webView, sb2);
    }

    /* renamed from: a */
    public void m80788a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m80782c(webView, sb3);
        } else {
            handler.post(new RunnableC10137a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m80787a(WebView webView, JSONObject jSONObject) {
        m80789a(webView, "setLastActivity", jSONObject);
    }

    /* renamed from: a */
    public void m80786a(StringBuilder sb2, Object[] objArr) {
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

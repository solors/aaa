package com.iab.omid.library.inmobi.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.utils.C18203d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.internal.h */
/* loaded from: classes6.dex */
public class C18185h {

    /* renamed from: a */
    private static C18185h f45712a = new C18185h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.inmobi.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC18186a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f45713a;

        /* renamed from: b */
        final /* synthetic */ String f45714b;

        RunnableC18186a(WebView webView, String str) {
            this.f45713a = webView;
            this.f45714b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18185h.this.m63686c(this.f45713a, this.f45714b);
        }
    }

    private C18185h() {
    }

    /* renamed from: a */
    public static final C18185h m63701a() {
        return f45712a;
    }

    /* renamed from: b */
    public void m63689b(WebView webView, String str) {
        m63693a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m63685c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m63686c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m63700a(WebView webView, String str) {
        m63693a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m63688b(WebView webView, String str, String str2) {
        m63693a(webView, "setState", str2, str);
    }

    /* renamed from: c */
    public boolean m63686c(WebView webView, String str) {
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
    public void m63699a(WebView webView, String str, float f) {
        m63693a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m63687b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m63693a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m63698a(WebView webView, String str, ErrorType errorType, String str2) {
        m63693a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m63697a(WebView webView, String str, String str2) {
        m63693a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: a */
    public void m63696a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m63693a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m63695a(WebView webView, String str, JSONObject jSONObject) {
        m63693a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m63694a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m63693a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63693a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18203d.m63616a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m63690a(sb2, objArr);
        sb2.append(")}");
        m63692a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63692a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m63686c(webView, sb3);
        } else {
            handler.post(new RunnableC18186a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m63691a(WebView webView, @NonNull JSONObject jSONObject) {
        m63693a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63690a(StringBuilder sb2, Object[] objArr) {
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

package com.iab.omid.library.bytedance2.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.adsession.ErrorType;
import com.iab.omid.library.bytedance2.utils.C18015d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.internal.h */
/* loaded from: classes6.dex */
public class C17997h {

    /* renamed from: a */
    private static C17997h f45334a = new C17997h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.bytedance2.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC17998a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f45335a;

        /* renamed from: b */
        final /* synthetic */ String f45336b;

        RunnableC17998a(WebView webView, String str) {
            this.f45335a = webView;
            this.f45336b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17997h.this.m64389c(this.f45335a, this.f45336b);
        }
    }

    private C17997h() {
    }

    /* renamed from: a */
    public static final C17997h m64404a() {
        return f45334a;
    }

    /* renamed from: b */
    public void m64392b(WebView webView, String str) {
        m64396a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m64388c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m64389c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m64403a(WebView webView, String str) {
        m64396a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m64391b(WebView webView, String str, String str2) {
        m64396a(webView, "setState", str2, str);
    }

    /* renamed from: c */
    public boolean m64389c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
            return true;
        }
    }

    /* renamed from: a */
    public void m64402a(WebView webView, String str, float f) {
        m64396a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m64390b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m64396a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m64401a(WebView webView, String str, ErrorType errorType, String str2) {
        m64396a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m64400a(WebView webView, String str, String str2) {
        m64396a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: a */
    public void m64399a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m64396a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m64398a(WebView webView, String str, JSONObject jSONObject) {
        m64396a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m64397a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m64396a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64396a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18015d.m64319a("The WebView is null for ".concat(String.valueOf(str)));
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m64393a(sb2, objArr);
        sb2.append(")}");
        m64395a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64395a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m64389c(webView, sb3);
        } else {
            handler.post(new RunnableC17998a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m64394a(WebView webView, @NonNull JSONObject jSONObject) {
        m64396a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64393a(StringBuilder sb2, Object[] objArr) {
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

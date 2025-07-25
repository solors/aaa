package com.iab.omid.library.applovin.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.utils.C17833d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.internal.h */
/* loaded from: classes6.dex */
public class C17815h {

    /* renamed from: a */
    private static C17815h f44949a = new C17815h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.applovin.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC17816a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f44950a;

        /* renamed from: b */
        final /* synthetic */ String f44951b;

        RunnableC17816a(WebView webView, String str) {
            this.f44950a = webView;
            this.f44951b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17815h.this.m65097c(this.f44950a, this.f44951b);
        }
    }

    private C17815h() {
    }

    /* renamed from: a */
    public static final C17815h m65112a() {
        return f44949a;
    }

    /* renamed from: b */
    public void m65100b(WebView webView, String str) {
        m65104a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m65096c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m65097c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m65111a(WebView webView, String str) {
        m65104a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m65099b(WebView webView, String str, String str2) {
        m65104a(webView, "setState", str2, str);
    }

    /* renamed from: c */
    public boolean m65097c(WebView webView, String str) {
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
    public void m65110a(WebView webView, String str, float f) {
        m65104a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m65098b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m65104a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m65109a(WebView webView, String str, ErrorType errorType, String str2) {
        m65104a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m65108a(WebView webView, String str, String str2) {
        m65104a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: a */
    public void m65107a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m65104a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m65106a(WebView webView, String str, JSONObject jSONObject) {
        m65104a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m65105a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m65104a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m65104a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C17833d.m65027a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m65101a(sb2, objArr);
        sb2.append(")}");
        m65103a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m65103a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m65097c(webView, sb3);
        } else {
            handler.post(new RunnableC17816a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m65102a(WebView webView, @NonNull JSONObject jSONObject) {
        m65104a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m65101a(StringBuilder sb2, Object[] objArr) {
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

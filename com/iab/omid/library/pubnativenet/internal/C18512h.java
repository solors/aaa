package com.iab.omid.library.pubnativenet.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubnativenet.adsession.ErrorType;
import com.iab.omid.library.pubnativenet.utils.C18532d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.internal.h */
/* loaded from: classes6.dex */
public class C18512h {

    /* renamed from: a */
    private static C18512h f46371a = new C18512h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.pubnativenet.internal.h$a */
    /* loaded from: classes6.dex */
    public class RunnableC18513a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f46372a;

        /* renamed from: b */
        final /* synthetic */ String f46373b;

        RunnableC18513a(WebView webView, String str) {
            this.f46372a = webView;
            this.f46373b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18512h.this.m62451c(this.f46372a, this.f46373b);
        }
    }

    private C18512h() {
    }

    /* renamed from: a */
    public static final C18512h m62466a() {
        return f46371a;
    }

    /* renamed from: b */
    public void m62454b(WebView webView, String str) {
        m62458a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m62450c(WebView webView, String str, String str2) {
        m62458a(webView, "setState", str2, str);
    }

    /* renamed from: d */
    public void m62449d(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            m62451c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    /* renamed from: a */
    public void m62465a(WebView webView, String str) {
        m62458a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m62453b(WebView webView, String str, String str2) {
        m62458a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: c */
    public boolean m62451c(WebView webView, String str) {
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
    public void m62464a(WebView webView, String str, float f) {
        m62458a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m62452b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m62458a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m62463a(WebView webView, String str, ErrorType errorType, String str2) {
        m62458a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m62462a(WebView webView, String str, String str2) {
        m62458a(webView, "setDeviceLockState", str2);
    }

    /* renamed from: a */
    public void m62461a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m62458a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m62460a(WebView webView, String str, JSONObject jSONObject) {
        m62458a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m62459a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m62458a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62458a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18532d.m62372a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m62455a(sb2, objArr);
        sb2.append(")}");
        m62457a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62457a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m62451c(webView, sb3);
        } else {
            handler.post(new RunnableC18513a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m62456a(WebView webView, @NonNull JSONObject jSONObject) {
        m62458a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m62455a(StringBuilder sb2, Object[] objArr) {
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

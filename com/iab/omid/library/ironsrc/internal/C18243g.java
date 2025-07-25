package com.iab.omid.library.ironsrc.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.utils.C18260d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.internal.g */
/* loaded from: classes6.dex */
public class C18243g {

    /* renamed from: a */
    private static C18243g f45840a = new C18243g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.ironsrc.internal.g$a */
    /* loaded from: classes6.dex */
    public class RunnableC18244a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f45841a;

        /* renamed from: b */
        final /* synthetic */ String f45842b;

        RunnableC18244a(C18243g c18243g, WebView webView, String str) {
            this.f45841a = webView;
            this.f45842b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45841a.loadUrl(this.f45842b);
        }
    }

    private C18243g() {
    }

    /* renamed from: a */
    public static final C18243g m63464a() {
        return f45840a;
    }

    /* renamed from: b */
    public void m63452b(WebView webView) {
        m63456a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: c */
    public void m63449c(WebView webView) {
        m63456a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: a */
    public void m63463a(WebView webView) {
        m63456a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: b */
    public void m63451b(WebView webView, String str) {
        m63456a(webView, "setState", str);
    }

    /* renamed from: c */
    public void m63447c(WebView webView, @NonNull JSONObject jSONObject) {
        m63456a(webView, "setLastActivity", jSONObject);
    }

    /* renamed from: a */
    public void m63462a(WebView webView, float f) {
        m63456a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: b */
    public void m63450b(WebView webView, @NonNull JSONObject jSONObject) {
        m63456a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: c */
    public boolean m63448c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }

    /* renamed from: a */
    public void m63461a(WebView webView, ErrorType errorType, String str) {
        m63456a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void m63460a(WebView webView, String str) {
        m63456a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: a */
    public void m63459a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m63448c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m63458a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m63456a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m63456a(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: a */
    public void m63457a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m63456a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63456a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18260d.m63378a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m63453a(sb2, objArr);
        sb2.append(")}");
        m63455a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63455a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb3);
        } else {
            handler.post(new RunnableC18244a(this, webView, sb3));
        }
    }

    /* renamed from: a */
    public void m63454a(WebView webView, JSONObject jSONObject) {
        m63456a(webView, "init", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m63453a(StringBuilder sb2, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append('\"');
            } else {
                if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb2.append(obj2);
                    } else {
                        sb2.append('\"');
                        sb2.append(obj2);
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(",");
            }
            sb2.append('\"');
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
    }
}

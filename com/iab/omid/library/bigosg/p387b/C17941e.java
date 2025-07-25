package com.iab.omid.library.bigosg.p387b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.adsession.ErrorType;
import com.iab.omid.library.bigosg.p389d.C17953c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.b.e */
/* loaded from: classes6.dex */
public class C17941e {

    /* renamed from: a */
    private static C17941e f45206a = new C17941e();

    private C17941e() {
    }

    /* renamed from: a */
    public static C17941e m64634a() {
        return f45206a;
    }

    /* renamed from: b */
    public void m64622b(WebView webView) {
        m64626a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: c */
    public void m64619c(WebView webView) {
        m64626a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: a */
    public void m64633a(WebView webView) {
        m64626a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: b */
    public void m64621b(WebView webView, String str) {
        m64626a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: c */
    public void m64618c(WebView webView, String str) {
        m64626a(webView, "setState", str);
    }

    /* renamed from: a */
    public void m64632a(WebView webView, float f) {
        m64626a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: b */
    public void m64620b(WebView webView, @NonNull JSONObject jSONObject) {
        m64626a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: a */
    public void m64631a(WebView webView, ErrorType errorType, String str) {
        m64626a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void m64629a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m64630a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m64628a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m64626a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m64626a(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: a */
    public void m64627a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m64626a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64626a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C17953c.m64576a("The WebView is null for ".concat(String.valueOf(str)));
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m64623a(sb2, objArr);
        sb2.append(")}");
        m64625a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64625a(final WebView webView, StringBuilder sb2) {
        final String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb3);
        } else {
            handler.post(new Runnable() { // from class: com.iab.omid.library.bigosg.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    webView.loadUrl(sb3);
                }
            });
        }
    }

    /* renamed from: a */
    public void m64624a(WebView webView, JSONObject jSONObject) {
        m64626a(webView, "init", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64623a(StringBuilder sb2, Object[] objArr) {
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

    /* renamed from: a */
    public boolean m64630a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        return true;
    }
}

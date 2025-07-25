package com.iab.omid.library.corpmailru.p393b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.adsession.ErrorType;
import com.iab.omid.library.corpmailru.p395d.C18064c;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.b.e */
/* loaded from: classes6.dex */
public class C18052e {

    /* renamed from: a */
    private static C18052e f45448a = new C18052e();

    private C18052e() {
    }

    /* renamed from: a */
    public static final C18052e m64184a() {
        return f45448a;
    }

    /* renamed from: b */
    public void m64172b(WebView webView) {
        m64176a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: c */
    public void m64169c(WebView webView) {
        m64176a(webView, "publishLoadedEvent", new Object[0]);
    }

    /* renamed from: a */
    public void m64183a(WebView webView) {
        m64176a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: b */
    public void m64171b(WebView webView, String str) {
        m64176a(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: c */
    public void m64168c(WebView webView, String str) {
        m64176a(webView, "setState", str);
    }

    /* renamed from: a */
    public void m64182a(WebView webView, float f) {
        m64176a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: b */
    public void m64170b(WebView webView, @NonNull JSONObject jSONObject) {
        m64176a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: a */
    public void m64181a(WebView webView, ErrorType errorType, String str) {
        m64176a(webView, "error", errorType.toString(), str);
    }

    /* renamed from: a */
    public void m64179a(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m64180a(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m64178a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m64176a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m64176a(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: a */
    public void m64177a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m64176a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m64176a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18064c.m64126a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m64173a(sb2, objArr);
        sb2.append(")}");
        m64175a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m64175a(final WebView webView, StringBuilder sb2) {
        final String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb3);
        } else {
            handler.post(new Runnable() { // from class: com.iab.omid.library.corpmailru.b.e.1
                @Override // java.lang.Runnable
                public void run() {
                    webView.loadUrl(sb3);
                }
            });
        }
    }

    /* renamed from: a */
    public void m64174a(WebView webView, JSONObject jSONObject) {
        m64176a(webView, "init", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m64173a(StringBuilder sb2, Object[] objArr) {
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
    public boolean m64180a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }
}

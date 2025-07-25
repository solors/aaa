package com.iab.omid.library.unity3d.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.adsession.ErrorType;
import com.iab.omid.library.unity3d.utils.C18711d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.internal.g */
/* loaded from: classes6.dex */
public class C18693g {

    /* renamed from: a */
    private static C18693g f46768a = new C18693g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.iab.omid.library.unity3d.internal.g$a */
    /* loaded from: classes6.dex */
    public class RunnableC18694a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f46769a;

        /* renamed from: b */
        final /* synthetic */ String f46770b;

        RunnableC18694a(WebView webView, String str) {
            this.f46769a = webView;
            this.f46770b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18693g.this.m61714c(this.f46769a, this.f46770b);
        }
    }

    private C18693g() {
    }

    /* renamed from: a */
    public static final C18693g m61729a() {
        return f46768a;
    }

    /* renamed from: b */
    public void m61717b(WebView webView, String str) {
        m61721a(webView, "publishImpressionEvent", str);
    }

    /* renamed from: c */
    public void m61713c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        m61714c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    /* renamed from: a */
    public void m61728a(WebView webView, String str) {
        m61721a(webView, "finishSession", str);
    }

    /* renamed from: b */
    public void m61716b(WebView webView, String str, String str2) {
        m61721a(webView, "setState", str2, str);
    }

    /* renamed from: c */
    public boolean m61714c(WebView webView, String str) {
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
    public void m61727a(WebView webView, String str, float f) {
        m61721a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    /* renamed from: b */
    public void m61715b(WebView webView, String str, @Nullable JSONObject jSONObject) {
        m61721a(webView, "publishLoadedEvent", jSONObject, str);
    }

    /* renamed from: a */
    public void m61726a(WebView webView, String str, ErrorType errorType, String str2) {
        m61721a(webView, "error", errorType.toString(), str2, str);
    }

    /* renamed from: a */
    public void m61725a(WebView webView, String str, String str2) {
        m61721a(webView, "setNativeViewHierarchy", str2, str);
    }

    /* renamed from: a */
    public void m61724a(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        m61721a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    /* renamed from: a */
    public void m61723a(WebView webView, String str, JSONObject jSONObject) {
        m61721a(webView, "init", jSONObject, str);
    }

    /* renamed from: a */
    public void m61722a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m61721a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m61721a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C18711d.m61644a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        m61718a(sb2, objArr);
        sb2.append(")}");
        m61720a(webView, sb2);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m61720a(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            m61714c(webView, sb3);
        } else {
            handler.post(new RunnableC18694a(webView, sb3));
        }
    }

    /* renamed from: a */
    public void m61719a(WebView webView, @NonNull JSONObject jSONObject) {
        m61721a(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    /* renamed from: a */
    void m61718a(StringBuilder sb2, Object[] objArr) {
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

package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.xiaomi.adsession.ErrorType;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32612cioccoiococ;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.ciii2coi2 */
/* loaded from: classes8.dex */
public class C32494ciii2coi2 {
    private static C32494ciii2coi2 coo2iico = new C32494ciii2coi2();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.ciii2coi2$coo2iico */
    /* loaded from: classes8.dex */
    public class RunnableC32495coo2iico implements Runnable {
        final /* synthetic */ String coi222o222;
        final /* synthetic */ WebView coo2iico;

        RunnableC32495coo2iico(WebView webView, String str) {
            this.coo2iico = webView;
            this.coi222o222 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C32494ciii2coi2.this.c2oc2i(this.coo2iico, this.coi222o222);
        }
    }

    private C32494ciii2coi2() {
    }

    public static final C32494ciii2coi2 coo2iico() {
        return coo2iico;
    }

    public void c2oc2i(WebView webView, String str, String str2) {
        coo2iico(webView, "setState", str2, str);
    }

    public void cioccoiococ(WebView webView, String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str2)) {
            c2oc2i(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
        }
    }

    public void coi222o222(WebView webView, String str) {
        coo2iico(webView, "publishImpressionEvent", str);
    }

    public boolean c2oc2i(WebView webView, String str) {
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

    public void coi222o222(WebView webView, String str, String str2) {
        coo2iico(webView, "setNativeViewHierarchy", str2, str);
    }

    public void coo2iico(WebView webView, String str) {
        coo2iico(webView, "finishSession", str);
    }

    public void coi222o222(WebView webView, String str, @Nullable JSONObject jSONObject) {
        coo2iico(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void coo2iico(WebView webView, String str, float f) {
        coo2iico(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public void coo2iico(WebView webView, String str, ErrorType errorType, String str2) {
        coo2iico(webView, "error", errorType.toString(), str2, str);
    }

    public void coo2iico(WebView webView, String str, String str2) {
        coo2iico(webView, "setDeviceLockState", str2);
    }

    public void coo2iico(WebView webView, String str, String str2, @Nullable JSONObject jSONObject) {
        coo2iico(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void coo2iico(WebView webView, String str, JSONObject jSONObject) {
        coo2iico(webView, "init", jSONObject, str);
    }

    public void coo2iico(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        coo2iico(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    void coo2iico(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            C32612cioccoiococ.coo2iico("The WebView is null for " + str);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        coo2iico(sb2, objArr);
        sb2.append(")}");
        coo2iico(webView, sb2);
    }

    @VisibleForTesting
    void coo2iico(WebView webView, StringBuilder sb2) {
        String sb3 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            c2oc2i(webView, sb3);
        } else {
            handler.post(new RunnableC32495coo2iico(webView, sb3));
        }
    }

    public void coo2iico(WebView webView, @NonNull JSONObject jSONObject) {
        coo2iico(webView, "setLastActivity", jSONObject);
    }

    @VisibleForTesting
    void coo2iico(StringBuilder sb2, Object[] objArr) {
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

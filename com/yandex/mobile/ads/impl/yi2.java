package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class yi2 {
    private yi2() {
    }

    /* renamed from: a */
    public static void m26889a(WebView webView) {
        m26884a(webView, "finishSession", new Object[0]);
    }

    /* renamed from: b */
    public static void m26882b(WebView webView) {
        m26884a(webView, "publishImpressionEvent", new Object[0]);
    }

    /* renamed from: a */
    public static void m26888a(WebView webView, float f) {
        m26884a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: b */
    public static void m26880b(WebView webView, @NonNull JSONObject jSONObject) {
        m26884a(webView, "publishLoadedEvent", jSONObject);
    }

    /* renamed from: a */
    public static void m26886a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m26884a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            m26884a(webView, "publishMediaEvent", str);
        }
    }

    /* renamed from: b */
    public static void m26881b(WebView webView, String str) {
        m26884a(webView, "setState", str);
    }

    /* renamed from: a */
    public static void m26885a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m26884a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    @VisibleForTesting
    /* renamed from: a */
    static void m26884a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "\"\"";
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
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb3);
            } else {
                handler.post(new xi2(webView, sb3));
            }
        }
    }

    /* renamed from: a */
    public static void m26883a(WebView webView, JSONObject jSONObject) {
        m26884a(webView, "init", jSONObject);
    }

    /* renamed from: a */
    public static void m26887a(WebView webView, String str) {
        m26884a(webView, "setNativeViewHierarchy", str);
    }
}

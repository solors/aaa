package com.mbridge.msdk.mbsignalcommon.mraid;

import android.webkit.WebView;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a */
/* loaded from: classes6.dex */
public final class CallMraidJS {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CallMraidJS.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.a$a */
    /* loaded from: classes6.dex */
    public static class C22226a {

        /* renamed from: a */
        private static final CallMraidJS f57704a = new CallMraidJS();
    }

    /* renamed from: a */
    public static CallMraidJS m51102a() {
        return C22226a.f57704a;
    }

    /* renamed from: b */
    public final void m51094b(WebView webView, float f, float f2) {
        m51090c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: c */
    public final void m51091c(WebView webView, float f, float f2) {
        m51090c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: a */
    public final void m51101a(WebView webView) {
        m51090c(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    /* renamed from: c */
    private void m51090c(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void m51095a(WebView webView, Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String jSONObject2 = jSONObject.toString();
        try {
            jSONObject2 = URLEncoder.encode(jSONObject2, "UTF-8");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        m51090c(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", jSONObject2));
    }

    /* renamed from: b */
    public final void m51093b(WebView webView, float f, float f2, float f3, float f4) {
        m51090c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    /* renamed from: b */
    public final void m51092b(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        m51090c(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", str));
    }

    /* renamed from: a */
    public final void m51096a(WebView webView, String str, String str2) {
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        m51090c(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    /* renamed from: a */
    public final void m51099a(WebView webView, float f, float f2) {
        m51090c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    /* renamed from: a */
    public final void m51100a(WebView webView, double d) {
        m51090c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", Double.valueOf(d)));
    }

    /* renamed from: a */
    public final void m51098a(WebView webView, float f, float f2, float f3, float f4) {
        m51090c(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    /* renamed from: a */
    public final void m51097a(WebView webView, String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        m51090c(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", str));
    }
}

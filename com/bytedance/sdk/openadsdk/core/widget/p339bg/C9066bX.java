package com.bytedance.sdk.openadsdk.core.widget.p339bg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C7741PX;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.bg.bX */
/* loaded from: classes3.dex */
public class C9066bX {

    /* renamed from: bg */
    private final WeakReference<Context> f20215bg;

    /* renamed from: IL */
    private boolean f20213IL = true;

    /* renamed from: bX */
    private final boolean f20214bX = true;
    private final boolean eqN = true;

    /* renamed from: zx */
    private final boolean f20217zx = false;
    private final boolean ldr = true;

    /* renamed from: iR */
    private boolean f20216iR = true;

    private C9066bX(Context context) {
        this.f20215bg = new WeakReference<>(context);
    }

    /* renamed from: bg */
    public static C9066bX m83668bg(Context context) {
        return new C9066bX(context);
    }

    /* renamed from: IL */
    public C9066bX m83669IL(boolean z) {
        this.f20213IL = z;
        return this;
    }

    /* renamed from: IL */
    public static void m83670IL(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            C7741PX.m87880IL(th.toString());
        }
    }

    /* renamed from: bg */
    public C9066bX m83665bg(boolean z) {
        this.f20216iR = z;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: bg */
    public void m83666bg(WebView webView) {
        if (webView == null || this.f20215bg.get() == null) {
            return;
        }
        m83670IL(webView);
        WebSettings settings = webView.getSettings();
        m83667bg(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            C7741PX.m87873bg("SSWebSettings", e.getMessage());
        }
        try {
            if (this.f20213IL) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            C7741PX.m87873bg("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.f20216iR) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            C7741PX.m87873bg("SSWebSettings", th2.getMessage());
        }
    }

    /* renamed from: bg */
    private void m83667bg(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            C7741PX.m87880IL(th.toString());
        }
    }
}

package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* renamed from: com.bytedance.sdk.component.utils.VB */
/* loaded from: classes3.dex */
public class C7744VB {

    /* renamed from: bg */
    private static final C7747bg f16924bg = new C7746IL();

    @TargetApi(19)
    /* renamed from: com.bytedance.sdk.component.utils.VB$IL */
    /* loaded from: classes3.dex */
    private static class C7746IL extends C7747bg {
        private C7746IL() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.C7744VB.C7747bg
        /* renamed from: bg */
        public void mo87858bg(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            boolean z = false;
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    z = true;
                } catch (Throwable th) {
                    boolean z2 = th instanceof IllegalStateException;
                }
            }
            if (!z) {
                try {
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.VB$bg */
    /* loaded from: classes3.dex */
    private static class C7747bg {
        private C7747bg() {
        }

        /* renamed from: bg */
        public void mo87858bg(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: bg */
    public static void m87859bg(WebView webView, String str) {
        f16924bg.mo87858bg(webView, str);
    }
}

package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
import androidx.annotation.GuardedBy;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public final class zzcs {
    @GuardedBy("WebViewUtil.class")
    private static Boolean zza;

    private zzcs() {
    }

    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzcs.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}

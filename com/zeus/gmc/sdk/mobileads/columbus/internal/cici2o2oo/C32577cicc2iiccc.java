package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.cicc2iiccc */
/* loaded from: classes8.dex */
public class C32577cicc2iiccc {
    private static final String coo2iico = "WebViews";

    private C32577cicc2iiccc() {
    }

    public static void coi222o222(@NonNull WebView webView) {
        webView.setWebChromeClient(new C32578coo2iico());
    }

    public static void coo2iico(@NonNull WebView webView, boolean z) {
        if (z) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.cicc2iiccc$coo2iico */
    /* loaded from: classes8.dex */
    class C32578coo2iico extends WebChromeClient {
        C32578coo2iico() {
        }

        @Override // android.webkit.WebChromeClient
        public void onConsoleMessage(String str, int i, String str2) {
            try {
                MLog.m25892d(C32577cicc2iiccc.coo2iico, "invoked: onConsoleMessage() - " + str2 + ":" + i + " - " + str);
                super.onConsoleMessage(str, i, str2);
            } catch (Exception e) {
                MLog.m25891d(C32577cicc2iiccc.coo2iico, "error:", e);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
            MLog.m25892d(C32577cicc2iiccc.coo2iico, str2);
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
            return onJsConfirm(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
            return onJsAlert(webView, str, str2, jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull JsPromptResult jsPromptResult) {
            MLog.m25892d(C32577cicc2iiccc.coo2iico, str2);
            jsPromptResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            try {
                MLog.m25892d(C32577cicc2iiccc.coo2iico, consoleMessage.message() + " -- line " + consoleMessage.lineNumber() + " -- source:" + consoleMessage.sourceId());
                return true;
            } catch (Exception e) {
                MLog.m25891d(C32577cicc2iiccc.coo2iico, "error:", e);
                return true;
            }
        }
    }

    public static void coo2iico(@NonNull WebView webView) {
        C32584coiic.coo2iico(webView);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
    }
}

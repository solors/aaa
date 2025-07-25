package com.fyber.inneractive.sdk.web;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.J */
/* loaded from: classes4.dex */
public final class C15497J extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IAlog.m76525e("%s onConsoleMessage: %s", "IAwebChromeClient", consoleMessage.message());
        if (IAlog.f30554a >= 1) {
            IAlog.m76526d(consoleMessage.message().replaceAll("%", "%%"), "VPAID");
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m76525e("%sonJsAlert: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m76525e("%sonJsBeforeUnload: %s", "IAwebChromeClient", str2);
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m76525e("%sonJsConfirm: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IAlog.m76525e("%sonJsPrompt: %s", "IAwebChromeClient", str2);
        jsPromptResult.cancel();
        return true;
    }
}

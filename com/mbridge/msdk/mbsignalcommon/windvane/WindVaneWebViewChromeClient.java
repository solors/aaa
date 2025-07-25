package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.k */
/* loaded from: classes6.dex */
public final class WindVaneWebViewChromeClient extends WebChromeClient {

    /* renamed from: a */
    WindVaneWebView f57778a;

    /* renamed from: b */
    private IWebViewListener f57779b;

    public WindVaneWebViewChromeClient(WindVaneWebView windVaneWebView) {
        this.f57778a = windVaneWebView;
    }

    /* renamed from: a */
    public final void m51048a(IWebViewListener iWebViewListener) {
        this.f57779b = iWebViewListener;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        ISignalCommunication signalCommunication = this.f57778a.getSignalCommunication();
        if (signalCommunication != null) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message) || !message.startsWith("mv://")) {
                return false;
            }
            SameLogTool.m51827a("H5_ENTRY", "onConsoleMessage: message.length() = " + message.length() + " " + message);
            if (message.contains("wv_hybrid:") && signalCommunication.mo51056a("wv_hybrid:")) {
                String substring = message.substring(0, message.lastIndexOf(" ") + 1);
                SameLogTool.m51827a("H5_ENTRY", "message = " + substring);
                signalCommunication.mo51055b(substring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        SameLogTool.m51824b("H5_ENTRY", str2 + "");
        ISignalCommunication signalCommunication = this.f57778a.getSignalCommunication();
        if (signalCommunication != null && str3 != null && signalCommunication.mo51056a(str3)) {
            signalCommunication.mo51055b(str2);
            jsPromptResult.confirm("");
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        IWebViewListener iWebViewListener = this.f57779b;
        if (iWebViewListener != null) {
            iWebViewListener.mo51072b(webView, i);
        }
    }
}

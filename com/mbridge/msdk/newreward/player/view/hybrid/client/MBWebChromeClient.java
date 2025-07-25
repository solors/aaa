package com.mbridge.msdk.newreward.player.view.hybrid.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;
import com.mbridge.msdk.newreward.player.view.hybrid.communicator.CommunicatorParameter;
import com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator;
import com.mbridge.msdk.newreward.player.view.hybrid.listener.WebViewEventListener;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class MBWebChromeClient extends WebChromeClient {
    private final String TAG = "MBWebChromeViewClient";
    private WebViewEventListener mEventListener;
    private HybridCommunicator mMBCommunicator;
    private MBWebView mWebView;

    private void findAndCallClassMethod(HybridCommunicator hybridCommunicator, CommunicatorParameter communicatorParameter) {
        Method[] methods;
        if (hybridCommunicator == null) {
            return;
        }
        try {
            Method method = null;
            for (Method method2 : hybridCommunicator.getClass().getMethods()) {
                if (method2.getName().equals("callNotSupportMethod")) {
                    method = method2;
                }
                if (method2.getName().equals(communicatorParameter.getPath())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0].isInstance(communicatorParameter)) {
                        method2.invoke(hybridCommunicator, communicatorParameter);
                        return;
                    }
                }
            }
            if (method != null) {
                method.invoke(hybridCommunicator, communicatorParameter);
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("MBWebChromeViewClient", th.getMessage());
        }
    }

    private String getUriToken(String str) {
        try {
        } catch (Throwable th) {
            SameLogTool.m51824b("MBWebChromeViewClient", th.getMessage());
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split(":");
        if (!TextUtils.isEmpty(split[2])) {
            String[] split2 = split[2].split(RemoteSettings.FORWARD_SLASH_STRING);
            if (!TextUtils.isEmpty(split2[0])) {
                return split2[0];
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0003, B:5:0x000b, B:7:0x0013, B:10:0x001e, B:11:0x0027, B:13:0x004b, B:16:0x005f, B:18:0x0065, B:19:0x0069, B:21:0x0074, B:24:0x007b, B:26:0x0081, B:30:0x008e, B:32:0x009a), top: B:39:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onReceiveMessage(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MBWebChromeViewClient"
            r1 = 0
            java.lang.String r2 = "mv:"
            boolean r2 = r11.startsWith(r2)     // Catch: java.lang.Throwable -> La0
            if (r2 != 0) goto L13
            java.lang.String r2 = "mraid:"
            boolean r2 = r11.startsWith(r2)     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto La8
        L13:
            java.lang.String r2 = "wv_hybrid:"
            boolean r2 = r11.contains(r2)     // Catch: java.lang.Throwable -> La0
            r3 = 1
            java.lang.String r4 = " "
            if (r2 == 0) goto L27
            int r2 = r11.lastIndexOf(r4)     // Catch: java.lang.Throwable -> La0
            int r2 = r2 + r3
            java.lang.String r11 = r11.substring(r1, r2)     // Catch: java.lang.Throwable -> La0
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r2.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "onConsoleMessage: message.length() = "
            r2.append(r5)     // Catch: java.lang.Throwable -> La0
            int r5 = r11.length()     // Catch: java.lang.Throwable -> La0
            r2.append(r5)     // Catch: java.lang.Throwable -> La0
            r2.append(r4)     // Catch: java.lang.Throwable -> La0
            r2.append(r11)     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La0
            com.mbridge.msdk.foundation.tools.SameLogTool.m51827a(r0, r2)     // Catch: java.lang.Throwable -> La0
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La0
            if (r2 != 0) goto L9f
            android.net.Uri r2 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r2.getScheme()     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = r10.getUriToken(r11)     // Catch: java.lang.Throwable -> La0
            java.lang.String r11 = r2.getLastPathSegment()     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "mraid"
            if (r6 == 0) goto L69
            boolean r5 = r6.equals(r4)     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto L69
            java.lang.String r11 = r2.getHost()     // Catch: java.lang.Throwable -> La0
        L69:
            r7 = r11
            java.lang.String r11 = r2.getEncodedQuery()     // Catch: java.lang.Throwable -> La0
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La0
            if (r5 != 0) goto L9e
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto L7b
            goto L9e
        L7b:
            boolean r4 = java.util.Objects.equals(r6, r4)     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L8d
            java.lang.String r2 = com.mbridge.msdk.newreward.player.view.hybrid.util.MBHybridUtil.getQueryParameters(r2)     // Catch: java.lang.Throwable -> La0
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> La0
            if (r4 != 0) goto L8d
            r9 = r2
            goto L8e
        L8d:
            r9 = r11
        L8e:
            com.mbridge.msdk.newreward.player.view.hybrid.communicator.CommunicatorParameter r11 = new com.mbridge.msdk.newreward.player.view.hybrid.communicator.CommunicatorParameter     // Catch: java.lang.Throwable -> La0
            com.mbridge.msdk.newreward.player.view.hybrid.MBWebView r5 = r10.mWebView     // Catch: java.lang.Throwable -> La0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La0
            com.mbridge.msdk.newreward.player.view.hybrid.communicator.HybridCommunicator r2 = r10.mMBCommunicator     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L9f
            r10.findAndCallClassMethod(r2, r11)     // Catch: java.lang.Throwable -> La0
            goto L9f
        L9e:
            return r1
        L9f:
            return r3
        La0:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r0, r11)
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.player.view.hybrid.client.MBWebChromeClient.onReceiveMessage(java.lang.String):boolean");
    }

    public HybridCommunicator getHybridCommunicator() {
        return this.mMBCommunicator;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (!TextUtils.isEmpty(consoleMessage.message()) && onReceiveMessage(consoleMessage.message())) {
            return true;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!TextUtils.isEmpty(str2) && onReceiveMessage(str2)) {
            jsPromptResult.confirm("");
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        WebViewEventListener webViewEventListener = this.mEventListener;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i);
        }
    }

    public void setHybridCommunicator(HybridCommunicator hybridCommunicator) {
        this.mMBCommunicator = hybridCommunicator;
    }

    public void setWeView(MBWebView mBWebView) {
        this.mWebView = mBWebView;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.mEventListener = webViewEventListener;
    }
}

package com.unity3d.services.core.webview.bridge;

import android.webkit.JavascriptInterface;
import com.unity3d.ads.core.extensions.JSONArrayExtensions;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: WebViewBridgeInterface.kt */
@Metadata
/* loaded from: classes7.dex */
public final class WebViewBridgeInterface {
    @NotNull
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    @NotNull
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this(null, null, 3, null);
    }

    @JavascriptInterface
    public final void handleCallback(@NotNull String callbackId, @NotNull String callbackStatus, @NotNull String rawParameters) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
        Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
        DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, JSONArrayExtensions.toTypedArray(new JSONArray(rawParameters)));
    }

    @JavascriptInterface
    public final void handleInvocation(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        DeviceLog.debug("handleInvocation " + data);
        JSONArray jSONArray = new JSONArray(data);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            Intrinsics.m17073h(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            Intrinsics.m17073h(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            Intrinsics.m17073h(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            Intrinsics.m17073h(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensions.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleCallback(@org.jetbrains.annotations.NotNull android.webkit.WebView r2, @org.jetbrains.annotations.NotNull androidx.webkit.WebMessageCompat r3, @org.jetbrains.annotations.NotNull android.net.Uri r4, boolean r5, @org.jetbrains.annotations.NotNull androidx.webkit.JavaScriptReplyProxy r6) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "sourceOrigin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "replyProxy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = r3.getData()
            if (r5 == 0) goto L52
            if (r2 == 0) goto L25
            boolean r3 = kotlin.text.C37686h.m16727B(r2)
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = 0
            goto L26
        L25:
            r3 = 1
        L26:
            if (r3 == 0) goto L29
            goto L52
        L29:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r2)
            java.lang.String r2 = "id"
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r4 = "status"
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r5 = "parameters"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "callbackId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = "callbackStatus"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = "rawParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r1.handleCallback(r2, r4, r3)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.bridge.WebViewBridgeInterface.onHandleCallback(android.webkit.WebView, androidx.webkit.WebMessageCompat, android.net.Uri, boolean, androidx.webkit.JavaScriptReplyProxy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleInvocation(@org.jetbrains.annotations.NotNull android.webkit.WebView r2, @org.jetbrains.annotations.NotNull androidx.webkit.WebMessageCompat r3, @org.jetbrains.annotations.NotNull android.net.Uri r4, boolean r5, @org.jetbrains.annotations.NotNull androidx.webkit.JavaScriptReplyProxy r6) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "sourceOrigin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.String r2 = "replyProxy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = r3.getData()
            if (r5 == 0) goto L2c
            if (r2 == 0) goto L25
            boolean r3 = kotlin.text.C37686h.m16727B(r2)
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = 0
            goto L26
        L25:
            r3 = 1
        L26:
            if (r3 == 0) goto L29
            goto L2c
        L29:
            r1.handleInvocation(r2)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.bridge.WebViewBridgeInterface.onHandleInvocation(android.webkit.WebView, androidx.webkit.WebMessageCompat, android.net.Uri, boolean, androidx.webkit.JavaScriptReplyProxy):void");
    }

    public WebViewBridgeInterface(@NotNull IWebViewBridge webViewBridge, @NotNull IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
        Intrinsics.checkNotNullParameter(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}

package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedInstances.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SharedInstances {
    @NotNull
    public static final SharedInstances INSTANCE = new SharedInstances();
    @NotNull
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new IInvocationCallbackInvoker() { // from class: com.unity3d.services.core.webview.bridge.a
        @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
        public final void invokeCallback(Invocation invocation) {
            SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
        }
    };
    @NotNull
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        @NotNull
        public NativeCallback getCallback(@NotNull String callbackId) {
            Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            NativeCallback callback = WebViewApp.getCurrentApp().getCallback(callbackId);
            Intrinsics.checkNotNullExpressionValue(callback, "getCurrentApp().getCallback(callbackId)");
            return callback;
        }

        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public void remove(@NotNull NativeCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            WebViewApp.getCurrentApp().removeCallback(callback);
        }
    };
    @NotNull
    private static final IEventSender webViewEventSender = new IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean canSend() {
            if (WebViewApp.getCurrentApp() != null) {
                return true;
            }
            return false;
        }

        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean sendEvent(@NotNull Enum<?> eventCategory, @NotNull Enum<?> eventId, @NotNull Object... params) {
            Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(params, "params");
            WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                return currentApp.sendEvent(eventCategory, eventId, Arrays.copyOf(params, params.length));
            }
            return false;
        }
    };
    @NotNull
    private static final IWebViewBridge webViewBridge = new IWebViewBridge() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewBridge$1
        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleCallback(@Nullable String str, @Nullable String str2, @Nullable Object[] objArr) throws Exception {
            WebViewBridge.getInstance().handleCallback(str, str2, objArr);
        }

        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleInvocation(@Nullable String str, @Nullable String str2, @Nullable Object[] objArr, @Nullable WebViewCallback webViewCallback) throws Exception {
            WebViewBridge.getInstance().handleInvocation(str, str2, objArr, webViewCallback);
        }
    };

    private SharedInstances() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebViewApp.getCurrentApp().invokeCallback(it);
    }

    @NotNull
    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    @NotNull
    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    @NotNull
    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    @NotNull
    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}

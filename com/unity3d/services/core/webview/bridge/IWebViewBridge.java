package com.unity3d.services.core.webview.bridge;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: IWebViewBridge.kt */
@Metadata
/* loaded from: classes7.dex */
public interface IWebViewBridge {
    void handleCallback(@Nullable String str, @Nullable String str2, @Nullable Object[] objArr) throws Exception;

    void handleInvocation(@Nullable String str, @Nullable String str2, @Nullable Object[] objArr, @Nullable WebViewCallback webViewCallback) throws Exception;
}

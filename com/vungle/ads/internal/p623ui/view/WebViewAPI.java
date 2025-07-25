package com.vungle.ads.internal.p623ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.ui.view.b */
/* loaded from: classes7.dex */
public interface WebViewAPI {

    /* compiled from: WebViewAPI.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.view.b$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC29498a {
        boolean processCommand(@NotNull String str, @NotNull JsonObject jsonObject);
    }

    /* compiled from: WebViewAPI.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.view.b$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC29499b {
        void onReceivedError(@NotNull String str, boolean z);

        void onRenderProcessUnresponsive(@Nullable WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(@Nullable WebView webView, @Nullable Boolean bool);
    }

    void notifyPropertiesChange(boolean z);

    void setAdVisibility(boolean z);

    void setConsentStatus(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4);

    void setErrorHandler(@NotNull InterfaceC29499b interfaceC29499b);

    void setMraidDelegate(@Nullable InterfaceC29498a interfaceC29498a);

    void setWebViewObserver(@Nullable WebViewObserver webViewObserver);
}

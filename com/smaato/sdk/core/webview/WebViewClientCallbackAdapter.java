package com.smaato.sdk.core.webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.webview.BaseWebViewClient;

/* loaded from: classes7.dex */
public class WebViewClientCallbackAdapter implements BaseWebViewClient.WebViewClientCallback {
    @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
    public boolean shouldOverrideUrlLoading(@NonNull String str) {
        return false;
    }

    @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
    public void onRenderProcessGone() {
    }

    @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
    public void onPageFinishedLoading(@NonNull String str) {
    }

    @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
    public void onPageStartedLoading(@NonNull String str) {
    }

    @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
    public void onHttpError(@NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
    }

    @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
    public void onGeneralError(int i, @NonNull String str, @NonNull String str2) {
    }
}

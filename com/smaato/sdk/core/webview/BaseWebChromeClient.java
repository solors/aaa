package com.smaato.sdk.core.webview;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebChromeClient;

/* loaded from: classes7.dex */
public class BaseWebChromeClient extends WebChromeClient {
    @Nullable
    private WebChromeClientCallback webChromeClientCallback;

    /* loaded from: classes7.dex */
    public interface WebChromeClientCallback {
        void onProgressChanged(int i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39297a(int i, WebChromeClientCallback webChromeClientCallback) {
        webChromeClientCallback.onProgressChanged(i);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(@NonNull WebView webView, final int i) {
        Objects.onNotNull(this.webChromeClientCallback, new Consumer() { // from class: com.smaato.sdk.core.webview.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                BaseWebChromeClient.m39297a(i, (BaseWebChromeClient.WebChromeClientCallback) obj);
            }
        });
    }

    public void setWebChromeClientCallback(@Nullable WebChromeClientCallback webChromeClientCallback) {
        this.webChromeClientCallback = webChromeClientCallback;
    }
}

package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.coiic */
/* loaded from: classes8.dex */
public class C32614coiic {
    public void coo2iico(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    public void coo2iico(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}

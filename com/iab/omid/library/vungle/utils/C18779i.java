package com.iab.omid.library.vungle.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* renamed from: com.iab.omid.library.vungle.utils.i */
/* loaded from: classes6.dex */
public class C18779i {
    /* renamed from: a */
    public void m61369a(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* renamed from: a */
    public void m61368a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}

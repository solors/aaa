package com.iab.omid.library.amazon.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* renamed from: com.iab.omid.library.amazon.utils.i */
/* loaded from: classes6.dex */
public class C17778i {
    /* renamed from: a */
    public void m65242a(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* renamed from: a */
    public void m65241a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}

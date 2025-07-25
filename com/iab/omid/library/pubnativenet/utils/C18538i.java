package com.iab.omid.library.pubnativenet.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* renamed from: com.iab.omid.library.pubnativenet.utils.i */
/* loaded from: classes6.dex */
public class C18538i {
    /* renamed from: a */
    public void m62344a(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* renamed from: a */
    public void m62343a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}

package com.iab.omid.library.inmobi.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* renamed from: com.iab.omid.library.inmobi.utils.i */
/* loaded from: classes6.dex */
public class C18209i {
    /* renamed from: a */
    public void m63590a(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.removeWebMessageListener(webView, str);
    }

    /* renamed from: a */
    public void m63589a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.addWebMessageListener(webView, str, set, webMessageListener);
    }
}

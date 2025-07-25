package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.webkit.WebView;
import com.ironsource.C20517nb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k */
/* loaded from: classes7.dex */
public final class C24625k {
    @NotNull
    /* renamed from: a */
    public static final String m46028a(@NotNull String toHtml) {
        Intrinsics.checkNotNullParameter(toHtml, "toHtml");
        return "\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n    <style> body { margin:0; padding:0; overflow:hidden; } </style>\n" + toHtml;
    }

    /* renamed from: b */
    public static final void m46027b(@NotNull WebView webView, @NotNull String data) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        webView.loadDataWithBaseURL("https://appassets.androidplatform.net", data, "text/html", C20517nb.f52167N, null);
    }
}

package com.amazon.aps.ads.util.adview;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsAdWebViewSupportClientBase.kt */
@Metadata
/* loaded from: classes2.dex */
public interface ApsAdWebViewClientListener {
    @NotNull
    Context getAdViewContext();

    boolean isTwoPartExpand();

    void onAdLeftApplication();

    void onCrash(@NotNull WebView webView, @NotNull StringBuilder sb2, @NotNull String str);

    void onLoadError();

    void onPageFinished(@NotNull String str, @Nullable WebView webView);

    void onPageLoaded();
}

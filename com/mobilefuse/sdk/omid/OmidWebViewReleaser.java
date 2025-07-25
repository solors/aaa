package com.mobilefuse.sdk.omid;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;
import p978t3.WebViewRenderException;

/* compiled from: OmidWebViewReleaser.kt */
@Metadata
/* loaded from: classes7.dex */
public final class OmidWebViewReleaser {
    private static final long WEB_VIEW_RELEASE_DELAY_MS = 4000;
    @NotNull
    public static final OmidWebViewReleaser INSTANCE = new OmidWebViewReleaser();
    private static final List<WebView> lockedWebViews = new ArrayList();

    private OmidWebViewReleaser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.mobilefuse.sdk.omid.OmidWebViewReleaser$createWebViewClient$1] */
    public final OmidWebViewReleaser$createWebViewClient$1 createWebViewClient() {
        return new WebViewClient() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser$createWebViewClient$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView webView, @Nullable String str) {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                if (str != null) {
                    try {
                        HttpRequestTracker.logHttpRequest(str);
                    } catch (Throwable th) {
                        int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        }
                        StabilityHelper.logException("[Automatically caught]", th);
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
                WebViewRenderException.m3275a(this);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freeWebView(WebView webView) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            lockedWebViews.remove(webView);
            webView.stopLoading();
            webView.destroy();
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public static final void scheduleWebViewRelease(@Nullable WebView webView) {
        SchedulersKt.safelyRunOnMainThread$default(null, new OmidWebViewReleaser$scheduleWebViewRelease$1(webView), 1, null);
    }
}

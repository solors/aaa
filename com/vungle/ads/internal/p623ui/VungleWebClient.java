package com.vungle.ads.internal.p623ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.amazon.device.ads.DtbDeviceData;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.C21114v8;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.C29551o0;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.C29338j;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.p623ui.view.WebViewAPI;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.C29518o;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.C37856h;
import kotlinx.serialization.json.C37873t;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p978t3.WebViewRenderException;

@Metadata
/* renamed from: com.vungle.ads.internal.ui.e */
/* loaded from: classes7.dex */
public final class VungleWebClient extends WebViewClient implements WebViewAPI {
    @NotNull
    public static final C29490a Companion = new C29490a(null);
    @NotNull
    private static final String TAG = "VungleWebClient";
    @NotNull
    private final AdPayload advertisement;
    private boolean collectConsent;
    @Nullable
    private WebViewAPI.InterfaceC29499b errorHandler;
    @Nullable
    private String gdprAccept;
    @Nullable
    private String gdprBody;
    @Nullable
    private String gdprDeny;
    @Nullable
    private String gdprTitle;
    @Nullable
    private Boolean isViewable;
    @Nullable
    private WebView loadedWebView;
    @Nullable
    private WebViewAPI.InterfaceC29498a mraidDelegate;
    @NotNull
    private final ExecutorService offloadExecutor;
    @NotNull
    private final C29338j placement;
    @Nullable
    private final Platform platform;
    private boolean ready;
    @Nullable
    private final SignalManager signalManager;
    @Nullable
    private WebViewObserver webViewObserver;

    /* compiled from: VungleWebClient.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.e$a */
    /* loaded from: classes7.dex */
    public static final class C29490a {
        private C29490a() {
        }

        public /* synthetic */ C29490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: VungleWebClient.kt */
    @RequiresApi(29)
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.e$b */
    /* loaded from: classes7.dex */
    public static final class C29491b extends WebViewRenderProcessClient {
        @Nullable
        private WebViewAPI.InterfaceC29499b errorHandler;

        public C29491b(@Nullable WebViewAPI.InterfaceC29499b interfaceC29499b) {
            this.errorHandler = interfaceC29499b;
        }

        @Nullable
        public final WebViewAPI.InterfaceC29499b getErrorHandler() {
            return this.errorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(@NotNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
            Intrinsics.checkNotNullParameter(webView, "webView");
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(@NotNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
            boolean z;
            Intrinsics.checkNotNullParameter(webView, "webView");
            C29518o.C29519a c29519a = C29518o.Companion;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessUnresponsive(Title = ");
            sb2.append(webView.getTitle());
            sb2.append(", URL = ");
            sb2.append(webView.getOriginalUrl());
            sb2.append(", (webViewRenderProcess != null) = ");
            if (webViewRenderProcess != null) {
                z = true;
            } else {
                z = false;
            }
            sb2.append(z);
            c29519a.m37463w(VungleWebClient.TAG, sb2.toString());
            WebViewAPI.InterfaceC29499b interfaceC29499b = this.errorHandler;
            if (interfaceC29499b != null) {
                interfaceC29499b.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }

        public final void setErrorHandler(@Nullable WebViewAPI.InterfaceC29499b interfaceC29499b) {
            this.errorHandler = interfaceC29499b;
        }
    }

    public /* synthetic */ VungleWebClient(AdPayload adPayload, C29338j c29338j, ExecutorService executorService, SignalManager signalManager, Platform platform, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adPayload, c29338j, executorService, (i & 8) != 0 ? null : signalManager, (i & 16) != 0 ? null : platform);
    }

    private final void handleWebViewError(String str, String str2, boolean z) {
        String str3 = str2 + ' ' + str;
        WebViewAPI.InterfaceC29499b interfaceC29499b = this.errorHandler;
        if (interfaceC29499b != null) {
            interfaceC29499b.onReceivedError(str3, z);
        }
    }

    private final boolean isCriticalAsset(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return this.advertisement.isCriticalAsset(str);
    }

    private final void runJavascriptOnWebView(WebView webView, String str) {
        boolean z = false;
        if (webView != null) {
            try {
                if (!webView.isAttachedToWindow()) {
                    z = true;
                }
            } catch (Throwable th) {
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                analyticsClient.logError$vungle_ads_release(313, "Evaluate js failed " + th.getLocalizedMessage(), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
                return;
            }
        }
        if (z) {
            return;
        }
        C29518o.C29519a c29519a = C29518o.Companion;
        c29519a.m37463w(TAG, "mraid Injecting JS " + str);
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2 */
    public static final void m110392shouldOverrideUrlLoading$lambda4$lambda3$lambda2(WebViewAPI.InterfaceC29498a it, String command, JsonObject args, Handler handler, VungleWebClient this$0, final WebView webView) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(args, "$args");
        Intrinsics.checkNotNullParameter(handler, "$handler");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.processCommand(command, args)) {
            handler.post(new Runnable() { // from class: com.vungle.ads.internal.ui.c
                {
                    VungleWebClient.this = this$0;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VungleWebClient.m110393shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1(VungleWebClient.this, webView);
                }
            });
        }
    }

    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2$lambda-1 */
    public static final void m110393shouldOverrideUrlLoading$lambda4$lambda3$lambda2$lambda1(VungleWebClient this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    @Nullable
    public final WebViewAPI.InterfaceC29499b getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    @Nullable
    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    @Nullable
    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    @Nullable
    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    @Nullable
    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    @Nullable
    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    @Nullable
    public final WebViewAPI.InterfaceC29498a getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    @Nullable
    public final WebViewObserver getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    @Nullable
    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    public final void notifyDiskAvailableSize(long j) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            runJavascriptOnWebView(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j + ')');
        }
    }

    @Override // com.vungle.ads.internal.p623ui.view.WebViewAPI
    public void notifyPropertiesChange(boolean z) {
        String str;
        WebView webView = this.loadedWebView;
        if (webView != null) {
            C37873t c37873t = new C37873t();
            C37873t c37873t2 = new C37873t();
            C37856h.m15920c(c37873t2, "width", Integer.valueOf(webView.getWidth()));
            C37856h.m15920c(c37873t2, "height", Integer.valueOf(webView.getHeight()));
            JsonObject m15874a = c37873t2.m15874a();
            C37873t c37873t3 = new C37873t();
            boolean z2 = false;
            C37856h.m15920c(c37873t3, "x", 0);
            C37856h.m15920c(c37873t3, "y", 0);
            C37856h.m15920c(c37873t3, "width", Integer.valueOf(webView.getWidth()));
            C37856h.m15920c(c37873t3, "height", Integer.valueOf(webView.getHeight()));
            JsonObject m15874a2 = c37873t3.m15874a();
            C37873t c37873t4 = new C37873t();
            Boolean bool = Boolean.FALSE;
            C37856h.m15921b(c37873t4, "sms", bool);
            C37856h.m15921b(c37873t4, "tel", bool);
            C37856h.m15921b(c37873t4, "calendar", bool);
            C37856h.m15921b(c37873t4, "storePicture", bool);
            C37856h.m15921b(c37873t4, "inlineVideo", bool);
            JsonObject m15874a3 = c37873t4.m15874a();
            c37873t.m15873b(SDKConstants.PARAM_CONTEXT_MAX_SIZE, m15874a);
            c37873t.m15873b(DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY, m15874a);
            c37873t.m15873b("defaultPosition", m15874a2);
            c37873t.m15873b("currentPosition", m15874a2);
            c37873t.m15873b("supports", m15874a3);
            C37856h.m15919d(c37873t, MRAIDCommunicatorUtil.KEY_PLACEMENTTYPE, this.advertisement.templateType());
            Boolean bool2 = this.isViewable;
            if (bool2 != null) {
                C37856h.m15921b(c37873t, C21114v8.C21122h.f54081o, Boolean.valueOf(bool2.booleanValue()));
            }
            C37856h.m15919d(c37873t, "os", "android");
            C37856h.m15919d(c37873t, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
            C37856h.m15921b(c37873t, "incentivized", Boolean.valueOf(this.placement.isRewardedVideo()));
            C37856h.m15919d(c37873t, "version", "1.0");
            Platform platform = this.platform;
            if (platform != null) {
                C37856h.m15921b(c37873t, "isSilent", Boolean.valueOf(platform.isSilentModeEnabled()));
            }
            if (this.collectConsent) {
                C37856h.m15921b(c37873t, "consentRequired", Boolean.TRUE);
                C37856h.m15919d(c37873t, "consentTitleText", this.gdprTitle);
                C37856h.m15919d(c37873t, "consentBodyText", this.gdprBody);
                C37856h.m15919d(c37873t, "consentAcceptButtonText", this.gdprAccept);
                C37856h.m15919d(c37873t, "consentDenyButtonText", this.gdprDeny);
            } else {
                C37856h.m15921b(c37873t, "consentRequired", bool);
            }
            if (!ConfigManager.INSTANCE.signalsDisabled()) {
                SignalManager signalManager = this.signalManager;
                String str2 = null;
                if (signalManager != null) {
                    str = signalManager.getUuid();
                } else {
                    str = null;
                }
                if (!((str == null || str.length() == 0) ? true : true)) {
                    SignalManager signalManager2 = this.signalManager;
                    if (signalManager2 != null) {
                        str2 = signalManager2.getUuid();
                    }
                    C37856h.m15919d(c37873t, JsonStorageKeyNames.SESSION_ID_KEY, str2);
                }
            }
            C37856h.m15919d(c37873t, "sdkVersion", C29551o0.VERSION_NAME);
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + c37873t.m15874a() + ',' + z + ')');
        }
    }

    public final void notifySilentModeChange(boolean z) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            C37873t c37873t = new C37873t();
            C37856h.m15921b(c37873t, "isSilent", Boolean.valueOf(z));
            JsonObject m15874a = c37873t.m15874a();
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + m15874a + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        super.onPageFinished(webView, str);
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new C29491b(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, int i, @NotNull String description, @NotNull String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(webView, i, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        Integer num;
        boolean z;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Uri uri = null;
        if (webResourceResponse != null) {
            num = Integer.valueOf(webResourceResponse.getStatusCode());
        } else {
            num = null;
        }
        String valueOf = String.valueOf(num);
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        }
        String valueOf2 = String.valueOf(uri);
        boolean z2 = true;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        C29518o.Companion.m37467e(TAG, "Http Error desc " + valueOf + ' ' + z + " for URL " + valueOf2);
        if (!isCriticalAsset(valueOf2) || !z) {
            z2 = false;
        }
        handleWebViewError(valueOf, valueOf2, z2);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@Nullable WebView webView, @Nullable RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        Boolean bool;
        boolean didCrash;
        boolean didCrash2;
        WebViewRenderException.m3275a(this);
        Boolean bool2 = null;
        String str2 = null;
        this.loadedWebView = null;
        if (Build.VERSION.SDK_INT < 26) {
            C29518o.C29519a c29519a = C29518o.Companion;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRenderProcessGone url: ");
            if (webView != null) {
                str2 = webView.getUrl();
            }
            sb2.append(str2);
            c29519a.m37463w(TAG, sb2.toString());
            return true;
        }
        C29518o.C29519a c29519a2 = C29518o.Companion;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onRenderProcessGone url: ");
        if (webView != null) {
            str = webView.getUrl();
        } else {
            str = null;
        }
        sb3.append(str);
        sb3.append(", did crash: ");
        if (renderProcessGoneDetail != null) {
            didCrash2 = renderProcessGoneDetail.didCrash();
            bool = Boolean.valueOf(didCrash2);
        } else {
            bool = null;
        }
        sb3.append(bool);
        c29519a2.m37463w(TAG, sb3.toString());
        WebViewAPI.InterfaceC29499b interfaceC29499b = this.errorHandler;
        if (interfaceC29499b != null) {
            if (renderProcessGoneDetail != null) {
                didCrash = renderProcessGoneDetail.didCrash();
                bool2 = Boolean.valueOf(didCrash);
            }
            return interfaceC29499b.onWebRenderingProcessGone(webView, bool2);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.vungle.ads.internal.p623ui.view.WebViewAPI
    public void setAdVisibility(boolean z) {
        this.isViewable = Boolean.valueOf(z);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    @Override // com.vungle.ads.internal.p623ui.view.WebViewAPI
    public void setConsentStatus(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.collectConsent = z;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.p623ui.view.WebViewAPI
    public void setErrorHandler(@NotNull WebViewAPI.InterfaceC29499b errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.errorHandler = errorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(@Nullable WebViewAPI.InterfaceC29499b interfaceC29499b) {
        this.errorHandler = interfaceC29499b;
    }

    public final void setGdprAccept$vungle_ads_release(@Nullable String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(@Nullable String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(@Nullable String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(@Nullable String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(@Nullable WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.p623ui.view.WebViewAPI
    public void setMraidDelegate(@Nullable WebViewAPI.InterfaceC29498a interfaceC29498a) {
        this.mraidDelegate = interfaceC29498a;
    }

    public final void setMraidDelegate$vungle_ads_release(@Nullable WebViewAPI.InterfaceC29498a interfaceC29498a) {
        this.mraidDelegate = interfaceC29498a;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    public final void setViewable$vungle_ads_release(@Nullable Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.p623ui.view.WebViewAPI
    public void setWebViewObserver(@Nullable WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(@Nullable WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d2, code lost:
        if (r4 != false) goto L37;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable final android.webkit.WebView r11, @org.jetbrains.annotations.Nullable java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.p623ui.VungleWebClient.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    public VungleWebClient(@NotNull AdPayload advertisement, @NotNull C29338j placement, @NotNull ExecutorService offloadExecutor, @Nullable SignalManager signalManager, @Nullable Platform platform) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.advertisement = advertisement;
        this.placement = placement;
        this.offloadExecutor = offloadExecutor;
        this.signalManager = signalManager;
        this.platform = platform;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = true;
        boolean z2 = webResourceRequest != null && webResourceRequest.isForMainFrame();
        C29518o.Companion.m37467e(TAG, "Error desc " + valueOf + ' ' + z2 + " for URL " + valueOf2);
        if (!isCriticalAsset(valueOf2) || !z2) {
            z = false;
        }
        handleWebViewError(valueOf, valueOf2, z);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }
}

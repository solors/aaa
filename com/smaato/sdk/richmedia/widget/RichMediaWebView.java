package com.smaato.sdk.richmedia.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StubOnGestureListener;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebView;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.core.webview.WebViewHelperUtil;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.smaato.sdk.richmedia.util.RichMediaHtmlUtils;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class RichMediaWebView extends BaseWebView {
    @Nullable
    private Callback callback;
    private boolean clicked;
    private boolean destroyed;
    @NonNull
    private final RichMediaHtmlUtils htmlUtils;
    private boolean loadingStarted;
    @NonNull
    private final Logger logger;

    /* loaded from: classes7.dex */
    public interface Callback {
        void handleMraidUrl(@NonNull String str, boolean z);

        void onAdViolation(@NonNull String str, @NonNull String str2);

        void onError();

        void onRenderProcessGone();

        void onUrlClicked(@NonNull String str);

        void onWebViewLoaded();
    }

    /* renamed from: com.smaato.sdk.richmedia.widget.RichMediaWebView$a */
    /* loaded from: classes7.dex */
    public class C27583a extends StubOnGestureListener {
        C27583a() {
            RichMediaWebView.this = r1;
        }

        @Override // com.smaato.sdk.core.util.StubOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            RichMediaWebView.this.clicked = true;
            return true;
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.widget.RichMediaWebView$b */
    /* loaded from: classes7.dex */
    public class C27584b implements BaseWebViewClient.WebViewClientCallback {
        C27584b() {
            RichMediaWebView.this = r1;
        }

        /* renamed from: d */
        public /* synthetic */ void m38974d(String str, Callback callback) {
            callback.handleMraidUrl(str, RichMediaWebView.this.clicked);
        }

        @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onGeneralError(int i, @NonNull String str, @NonNull String str2) {
            RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onGeneralError: errorCode = %d, description = %s, failingUrl = %s", Integer.valueOf(i), str, str2);
            Objects.onNotNull(RichMediaWebView.this.callback, new C27603i0());
        }

        @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onHttpError(@NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onHttpError: request = %s, errorResponse = %s", webResourceRequest, webResourceResponse);
            Objects.onNotNull(RichMediaWebView.this.callback, new C27603i0());
        }

        @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onPageFinishedLoading(@NonNull String str) {
            RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onPageFinishedLoading: %s", str);
            RichMediaWebView.this.setVisibility(0);
            Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.j0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((RichMediaWebView.Callback) obj).onWebViewLoaded();
                }
            });
        }

        @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onPageStartedLoading(@NonNull String str) {
            RichMediaWebView.this.logger.debug(LogDomain.WIDGET, "onPageStartedLoading: %s", str);
        }

        @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onRenderProcessGone() {
            Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.h0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((RichMediaWebView.Callback) obj).onRenderProcessGone();
                }
            });
        }

        @Override // com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public boolean shouldOverrideUrlLoading(@NonNull final String str) {
            Logger logger = RichMediaWebView.this.logger;
            LogDomain logDomain = LogDomain.WIDGET;
            logger.debug(logDomain, "shouldOverrideUrlLoading: %s", str);
            if (str.startsWith("smaato://")) {
                Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.e0
                    {
                        RichMediaWebView.C27584b.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        RichMediaWebView.C27584b.this.m38974d(str, (RichMediaWebView.Callback) obj);
                    }
                });
                return true;
            } else if (str.startsWith("mraid://")) {
                return true;
            } else {
                if (RichMediaWebView.this.clicked) {
                    RichMediaWebView.this.clicked = false;
                    RichMediaWebView.this.logger.debug(logDomain, "shouldOverrideUrlLoading: going to call Callback::onUrlClicked() with %s", str);
                    Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.f0
                        @Override // com.smaato.sdk.core.util.p574fi.Consumer
                        public final void accept(Object obj) {
                            ((RichMediaWebView.Callback) obj).onUrlClicked(str);
                        }
                    });
                    return true;
                }
                Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.g0
                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        ((RichMediaWebView.Callback) obj).onAdViolation("AUTO_REDIRECT", str);
                    }
                });
                return true;
            }
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.widget.RichMediaWebView$c */
    /* loaded from: classes7.dex */
    public class C27585c extends WebChromeClient {
        C27585c() {
            RichMediaWebView.this = r1;
        }

        @Override // android.webkit.WebChromeClient
        @Nullable
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            if (defaultVideoPoster == null) {
                return Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
            }
            return defaultVideoPoster;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
            if (RichMediaWebView.this.htmlUtils.isLoggingEnabled() && !super.onConsoleMessage(consoleMessage)) {
                return false;
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
            Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.m0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((RichMediaWebView.Callback) obj).onAdViolation("JS_ALERT_DIALOG", "");
                }
            });
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
            Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.l0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((RichMediaWebView.Callback) obj).onAdViolation("JS_ON_BEFORE_UNLOAD_DIALOG", "");
                }
            });
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
            Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.n0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((RichMediaWebView.Callback) obj).onAdViolation("JS_CONFIRM_DIALOG", "");
                }
            });
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull JsPromptResult jsPromptResult) {
            Objects.onNotNull(RichMediaWebView.this.callback, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.k0
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((RichMediaWebView.Callback) obj).onAdViolation("JS_PROMPT_DIALOG", "");
                }
            });
            jsPromptResult.confirm();
            return true;
        }
    }

    public RichMediaWebView(@NonNull Context context, @NonNull Logger logger, @NonNull RichMediaHtmlUtils richMediaHtmlUtils) {
        super((Context) Objects.requireNonNull(context));
        this.destroyed = false;
        this.clicked = false;
        this.loadingStarted = false;
        this.logger = (Logger) Objects.requireNonNull(logger);
        this.htmlUtils = (RichMediaHtmlUtils) Objects.requireNonNull(richMediaHtmlUtils);
        initWebView();
    }

    @NonNull
    private WebChromeClient createWebChromeClient() {
        return new C27585c();
    }

    @NonNull
    private BaseWebViewClient.WebViewClientCallback createWebViewClientCallback() {
        return new C27584b();
    }

    private void hideScrollbar() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initClickDetector() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new C27583a());
        setOnTouchListener(new View.OnTouchListener() { // from class: com.smaato.sdk.richmedia.widget.d0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initClickDetector$0;
                lambda$initClickDetector$0 = RichMediaWebView.lambda$initClickDetector$0(gestureDetector, view, motionEvent);
                return lambda$initClickDetector$0;
            }
        });
    }

    private void initWebView() {
        hideScrollbar();
        setVisibility(4);
        setBackgroundColor(getResources().getColor(17170445));
        WebSettings settings = getSettings();
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(false);
        BaseWebViewClient baseWebViewClient = new BaseWebViewClient();
        baseWebViewClient.setWebViewClientCallback(createWebViewClientCallback());
        setWebViewClient(baseWebViewClient);
        setWebChromeClient(createWebChromeClient());
    }

    public static /* synthetic */ boolean lambda$initClickDetector$0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.webkit.WebView
    @MainThread
    public void destroy() {
        Threads.ensureMainThread();
        if (this.destroyed) {
            this.logger.debug(LogDomain.WIDGET, "release() has been already called, ignoring this call", new Object[0]);
            return;
        }
        this.destroyed = true;
        WebViewHelperUtil.resetAndDestroyWebViewSafely(this);
    }

    @MainThread
    public void loadData(@NonNull String str, @NonNull MraidEnvironmentProperties mraidEnvironmentProperties) {
        Threads.ensureMainThread();
        if (this.loadingStarted) {
            return;
        }
        this.loadingStarted = true;
        initClickDetector();
        loadHtml(this.htmlUtils.createHtml(str, getContext(), mraidEnvironmentProperties));
    }

    @MainThread
    public void loadUrlContent(@NonNull String str) {
        Threads.ensureMainThread();
        if (this.loadingStarted) {
            return;
        }
        this.loadingStarted = true;
        initClickDetector();
        loadUrl(str);
    }

    public void resetClickedFlag() {
        this.clicked = false;
    }

    public void setCallback(@Nullable Callback callback) {
        this.callback = callback;
    }
}

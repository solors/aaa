package com.smaato.sdk.video.vast.widget.element;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.linkhandler.C27154c;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StubOnGestureListener;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.webview.BaseWebView;
import com.smaato.sdk.core.webview.BaseWebViewClient;
import com.smaato.sdk.core.webview.WebViewClientCallbackAdapter;
import com.smaato.sdk.video.vast.widget.element.VastElementView;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes7.dex */
public class VastElementView extends BaseWebView {
    @Nullable
    private Runnable clickTask;
    @NonNull
    private final Handler delayHandler;
    private boolean isLoaded;
    @Nullable
    private Runnable onViewVisible;
    @Nullable
    private VastElementPresenter presenter;
    private boolean webViewClicked;
    @NonNull
    private final BaseWebViewClient webViewClient;
    @NonNull
    private final BaseWebViewClient.WebViewClientCallback webViewClientCallback;

    /* renamed from: com.smaato.sdk.video.vast.widget.element.VastElementView$a */
    /* loaded from: classes7.dex */
    class C28112a extends WebViewClientCallbackAdapter {
        C28112a() {
            VastElementView.this = r1;
        }

        /* renamed from: b */
        public static /* synthetic */ void m38508b(String str, VastElementPresenter vastElementPresenter) {
            vastElementPresenter.logError(new VastElementLoadingException(str));
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onGeneralError(int i, @NonNull String str, @NonNull String str2) {
            final String format = String.format("VastElementView WebViewClientHTTP General Error. code: %s; description: %s; url: %s", Integer.valueOf(i), str, str2);
            if (i == -1) {
                Objects.onNotNull(VastElementView.this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.s
                    @Override // com.smaato.sdk.core.util.p574fi.Consumer
                    public final void accept(Object obj) {
                        VastElementView.C28112a.m38508b(format, (VastElementPresenter) obj);
                    }
                });
            } else {
                VastElementView.this.onContentLoadingError(format);
            }
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onHttpError(@NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            VastElementView.this.onContentLoadingError(String.format("VastElementView WebViewClientHTTP HTTP Error. Request: %s; Error Response: %s", webResourceRequest, webResourceResponse));
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onPageFinishedLoading(@NonNull String str) {
            VastElementView.this.onContentLoaded();
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public void onRenderProcessGone() {
            Objects.onNotNull(VastElementView.this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.t
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((VastElementPresenter) obj).onRenderProcessGone();
                }
            });
        }

        @Override // com.smaato.sdk.core.webview.WebViewClientCallbackAdapter, com.smaato.sdk.core.webview.BaseWebViewClient.WebViewClientCallback
        public boolean shouldOverrideUrlLoading(@NonNull String str) {
            if (VastElementView.this.webViewClicked) {
                if (VastElementView.this.clickTask != null) {
                    VastElementView.this.delayHandler.removeCallbacks(VastElementView.this.clickTask);
                    VastElementView.this.clickTask = null;
                }
                VastElementView.this.onWebViewClicked(str);
                VastElementView.this.webViewClicked = false;
                return true;
            } else if (VastElementView.this.presenter != null && VastElementView.this.presenter.isValidUrl(str)) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: com.smaato.sdk.video.vast.widget.element.VastElementView$b */
    /* loaded from: classes7.dex */
    public class C28113b extends StubOnGestureListener {
        C28113b() {
            VastElementView.this = r1;
        }

        @Override // com.smaato.sdk.core.util.StubOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            VastElementView.this.webViewClicked = true;
            VastElementView.this.clickWithDelay();
            return true;
        }
    }

    public VastElementView(@NonNull Context context) {
        super(context);
        this.delayHandler = Threads.newUiHandler();
        this.webViewClient = new BaseWebViewClient();
        this.webViewClicked = false;
        this.isLoaded = false;
        this.webViewClientCallback = new C28112a();
        init();
    }

    public void clickWithDelay() {
        if (this.clickTask != null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.smaato.sdk.video.vast.widget.element.p
            {
                VastElementView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VastElementView.this.lambda$clickWithDelay$3();
            }
        };
        this.clickTask = runnable;
        this.delayHandler.postDelayed(runnable, 100L);
    }

    private void disableScrollingAndZoom() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setScrollBarStyle(0);
    }

    private void init() {
        disableScrollingAndZoom();
        getSettings().setJavaScriptEnabled(true);
        this.webViewClient.setWebViewClientCallback(this.webViewClientCallback);
        setWebViewClient(this.webViewClient);
        setBackgroundColor(0);
        initClickDetector();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initClickDetector() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new C28113b());
        setOnTouchListener(new View.OnTouchListener() { // from class: com.smaato.sdk.video.vast.widget.element.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initClickDetector$0;
                lambda$initClickDetector$0 = VastElementView.lambda$initClickDetector$0(gestureDetector, view, motionEvent);
                return lambda$initClickDetector$0;
            }
        });
    }

    public /* synthetic */ void lambda$clickWithDelay$3() {
        onWebViewClicked(null);
        this.clickTask = null;
    }

    public static /* synthetic */ boolean lambda$initClickDetector$0(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return false;
    }

    public /* synthetic */ void lambda$load$4(String str) {
        if (!this.isLoaded) {
            Objects.onNotNull(this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.l
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((VastElementPresenter) obj).onContentStartedToLoad();
                }
            });
            loadHtml(str);
        }
    }

    public /* synthetic */ void lambda$onAttachedToWindow$1(VastElementPresenter vastElementPresenter) {
        vastElementPresenter.attachView(this);
    }

    public static /* synthetic */ void lambda$onContentLoadingError$6(String str, VastElementPresenter vastElementPresenter) {
        vastElementPresenter.onError(new VastElementLoadingException(str));
    }

    public /* synthetic */ void lambda$setSize$2(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public void load(@NonNull final String str) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.widget.element.i
            {
                VastElementView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VastElementView.this.lambda$load$4(str);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Objects.onNotNull(this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.r
            {
                VastElementView.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                VastElementView.this.lambda$onAttachedToWindow$1((VastElementPresenter) obj);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Objects.onNotNull(this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.h
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VastElementPresenter) obj).onConfigurationChanged();
            }
        });
    }

    protected void onContentLoaded() {
        if (!this.isLoaded) {
            this.isLoaded = true;
            Objects.onNotNull(this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.j
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    ((VastElementPresenter) obj).onContentLoaded();
                }
            });
        }
    }

    protected void onContentLoadingError(@NonNull final String str) {
        Objects.onNotNull(this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.n
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                VastElementView.lambda$onContentLoadingError$6(str, (VastElementPresenter) obj);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Objects.onNotNull(this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.k
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VastElementPresenter) obj).detachView();
            }
        });
        this.isLoaded = false;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getVisibility() == 0) {
            Objects.onNotNull(this.onViewVisible, new C27154c());
            this.onViewVisible = null;
        }
    }

    protected void onWebViewClicked(@Nullable final String str) {
        Objects.onNotNull(this.presenter, new Consumer() { // from class: com.smaato.sdk.video.vast.widget.element.q
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((VastElementPresenter) obj).onClicked(str);
            }
        });
    }

    public void setOnViewVisible(@Nullable Runnable runnable) {
        if (getVisibility() == 0) {
            Objects.onNotNull(runnable, new C27154c());
        } else {
            this.onViewVisible = runnable;
        }
    }

    public void setPresenter(@NonNull VastElementPresenter vastElementPresenter) {
        this.presenter = vastElementPresenter;
    }

    public void setSize(final int i, final int i2) {
        Threads.runOnUi(new Runnable() { // from class: com.smaato.sdk.video.vast.widget.element.m
            {
                VastElementView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VastElementView.this.lambda$setSize$2(i, i2);
            }
        });
    }

    public VastElementView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.delayHandler = Threads.newUiHandler();
        this.webViewClient = new BaseWebViewClient();
        this.webViewClicked = false;
        this.isLoaded = false;
        this.webViewClientCallback = new C28112a();
        init();
    }
}

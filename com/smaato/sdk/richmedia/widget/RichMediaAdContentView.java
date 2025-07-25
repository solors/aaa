package com.smaato.sdk.richmedia.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p573ui.AdContentView;
import com.smaato.sdk.core.p573ui.ProgressView;
import com.smaato.sdk.core.p573ui.WatermarkImageButton;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.p574fi.BiConsumer;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.RichMediaWebViewFactory;
import com.smaato.sdk.richmedia.mraid.Views;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExpandProperties;
import com.smaato.sdk.richmedia.mraid.mvp.BaseView;
import com.smaato.sdk.richmedia.mraid.presenter.MraidPresenter;
import com.smaato.sdk.richmedia.mraid.presenter.ResizeParams;
import com.smaato.sdk.richmedia.util.ViewUtils;
import com.smaato.sdk.richmedia.widget.ExpandManager;
import com.smaato.sdk.richmedia.widget.ResizeManager;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import com.smaato.sdk.richmedia_light.C27626R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class RichMediaAdContentView extends AdContentView implements BaseView {
    @NonNull
    private final FrameLayout content;
    @Nullable
    private ExpandManager expandManager;
    @NonNull
    private final Logger logger;
    @NonNull
    private final MraidEnvironmentProperties mraidEnvironmentProperties;
    @NonNull
    private final MraidPresenter mraidPresenter;
    @Nullable
    private ResizeManager resizeManager;
    @NonNull
    private final String richMediaCreative;
    @NonNull
    private final Callback richMediaViewCallback;
    @Nullable
    private RichMediaWebView twoPartWebView;
    @NonNull
    private final RichMediaWebView webView;
    @NonNull
    private final RichMediaWebViewFactory webViewFactory;

    /* renamed from: com.smaato.sdk.richmedia.widget.RichMediaAdContentView$a */
    /* loaded from: classes7.dex */
    public class C27579a extends RichMediaWebViewCallbackAdapter {

        /* renamed from: a */
        private boolean f72349a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f72350b;

        /* renamed from: c */
        final /* synthetic */ boolean f72351c;

        C27579a(FrameLayout frameLayout, boolean z) {
            RichMediaAdContentView.this = r1;
            this.f72350b = frameLayout;
            this.f72351c = z;
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onAdViolation(@NonNull String str, @NonNull String str2) {
            this.f72349a = true;
            RichMediaAdContentView.this.richMediaViewCallback.onAdViolation(str, str2);
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onRenderProcessGone() {
            RichMediaAdContentView.this.mraidPresenter.onFailedToExpand();
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onWebViewLoaded() {
            if (!this.f72349a) {
                RichMediaAdContentView.this.performExpand(this.f72350b, this.f72351c);
                RichMediaAdContentView.this.richMediaViewCallback.updateAdView(RichMediaAdContentView.this.twoPartWebView);
                return;
            }
            RichMediaAdContentView.this.mraidPresenter.onFailedToExpand();
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.widget.RichMediaAdContentView$b */
    /* loaded from: classes7.dex */
    public class C27580b implements ExpandManager.InterfaceC27598a {

        /* renamed from: a */
        final /* synthetic */ boolean f72353a;

        C27580b(boolean z) {
            RichMediaAdContentView.this = r1;
            this.f72353a = z;
        }

        @Override // com.smaato.sdk.richmedia.widget.ExpandManager.InterfaceC27598a
        /* renamed from: a */
        public void mo38952a(@NonNull ImageButton imageButton) {
            RichMediaAdContentView.this.mraidPresenter.onWasExpanded();
            RichMediaAdContentView.this.richMediaViewCallback.onAdExpanded(RichMediaAdContentView.this);
        }

        @Override // com.smaato.sdk.richmedia.widget.ExpandManager.InterfaceC27598a
        public void onCloseClicked(@NonNull ImageButton imageButton) {
            RichMediaAdContentView.this.mraidPresenter.handleClose();
            RichMediaAdContentView.this.richMediaViewCallback.removeFriendlyObstruction(imageButton);
            if (this.f72353a) {
                RichMediaAdContentView.this.richMediaViewCallback.updateAdView(RichMediaAdContentView.this.webView);
            }
        }

        @Override // com.smaato.sdk.richmedia.widget.ExpandManager.InterfaceC27598a
        public void onFailedToExpand() {
            RichMediaAdContentView.this.logger.error(LogDomain.RICH_MEDIA, "Failed to expand creative", new Object[0]);
            RichMediaAdContentView.this.mraidPresenter.onFailedToExpand();
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.widget.RichMediaAdContentView$c */
    /* loaded from: classes7.dex */
    public class C27581c implements ResizeManager.Listener {
        C27581c() {
            RichMediaAdContentView.this = r1;
        }

        @Override // com.smaato.sdk.richmedia.widget.ResizeManager.Listener
        public void onCloseClicked(@NonNull ImageButton imageButton) {
            RichMediaAdContentView.this.mraidPresenter.handleClose();
            RichMediaAdContentView.this.richMediaViewCallback.removeFriendlyObstruction(imageButton);
        }

        @Override // com.smaato.sdk.richmedia.widget.ResizeManager.Listener
        public void onResizeFailed(@NonNull String str) {
            RichMediaAdContentView.this.mraidPresenter.onFailedToResize(str);
        }

        @Override // com.smaato.sdk.richmedia.widget.ResizeManager.Listener
        public void onResized(@NonNull ImageButton imageButton) {
            RichMediaAdContentView.this.mraidPresenter.onWasResized();
            RichMediaAdContentView.this.richMediaViewCallback.onAdResized(RichMediaAdContentView.this);
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.widget.RichMediaAdContentView$d */
    /* loaded from: classes7.dex */
    public class C27582d extends RichMediaWebViewCallbackAdapter {
        C27582d() {
            RichMediaAdContentView.this = r1;
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void handleMraidUrl(@NonNull String str, boolean z) {
            RichMediaAdContentView.this.mraidPresenter.handleMraidUrl(str, z);
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onAdViolation(@NonNull String str, @NonNull String str2) {
            RichMediaAdContentView.this.richMediaViewCallback.onAdViolation(str, str2);
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onError() {
            super.onError();
            RichMediaAdContentView.this.richMediaViewCallback.onWebViewError();
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onRenderProcessGone() {
            RichMediaAdContentView.this.richMediaViewCallback.onRenderProcessGone(RichMediaAdContentView.this);
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onUrlClicked(@NonNull String str) {
            RichMediaAdContentView.this.richMediaViewCallback.onUrlClicked(RichMediaAdContentView.this, str);
        }

        @Override // com.smaato.sdk.richmedia.widget.RichMediaWebViewCallbackAdapter, com.smaato.sdk.richmedia.widget.RichMediaWebView.Callback
        public void onWebViewLoaded() {
            RichMediaAdContentView.this.richMediaViewCallback.onWebViewLoaded(RichMediaAdContentView.this);
            RichMediaAdContentView.this.mraidPresenter.onHtmlLoaded();
        }
    }

    private RichMediaAdContentView(@NonNull Logger logger, @NonNull Context context, @NonNull String str, @NonNull final Callback callback, @NonNull RichMediaWebViewFactory richMediaWebViewFactory, @NonNull final RichMediaWebView richMediaWebView, @NonNull MraidPresenter mraidPresenter, @NonNull MraidEnvironmentProperties mraidEnvironmentProperties, int i, int i2) {
        super(context);
        this.logger = logger;
        this.richMediaCreative = str;
        this.richMediaViewCallback = callback;
        this.webViewFactory = richMediaWebViewFactory;
        this.mraidPresenter = mraidPresenter;
        this.webView = richMediaWebView;
        this.mraidEnvironmentProperties = mraidEnvironmentProperties;
        i = i > 0 ? UIUtils.dpToPx(context, i) : i;
        i2 = i2 > 0 ? UIUtils.dpToPx(context, i2) : i2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.content = frameLayout;
        addView(frameLayout, AdContentView.generateDefaultLayoutParams(i, i2));
        richMediaWebView.setCallback(createRichMediaWebViewCallback());
        richMediaWebView.setId(C27626R.C27629id.webView);
        frameLayout.addView(richMediaWebView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(new WatermarkImageButton(getContext()));
        setLayoutParams(new FrameLayout.LayoutParams(i, i2, 17));
        mraidPresenter.setOnExpandCallback(new BiConsumer() { // from class: com.smaato.sdk.richmedia.widget.p
            @Override // com.smaato.sdk.core.util.p574fi.BiConsumer
            public final void accept(Object obj, Object obj2) {
                RichMediaAdContentView.this.lambda$new$0(richMediaWebView, (String) obj, (MraidExpandProperties) obj2);
            }
        });
        mraidPresenter.setOnOpenCallback(new Consumer() { // from class: com.smaato.sdk.richmedia.widget.u
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$1(richMediaWebView, callback, (String) obj);
            }
        });
        mraidPresenter.setOnPlayVideoCallback(new Consumer() { // from class: com.smaato.sdk.richmedia.widget.v
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$2(richMediaWebView, callback, (String) obj);
            }
        });
        mraidPresenter.setOnUnloadCallback(new Consumer() { // from class: com.smaato.sdk.richmedia.widget.w
            {
                RichMediaAdContentView.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$3(callback, (Whatever) obj);
            }
        });
        mraidPresenter.setResizeCallback(new Consumer() { // from class: com.smaato.sdk.richmedia.widget.x
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$4(richMediaWebView, (ResizeParams) obj);
            }
        });
        mraidPresenter.setOnCollapseCallback(new Consumer() { // from class: com.smaato.sdk.richmedia.widget.y
            {
                RichMediaAdContentView.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$5((Whatever) obj);
            }
        });
        mraidPresenter.setOnHideCallback(new Consumer() { // from class: com.smaato.sdk.richmedia.widget.z
            {
                RichMediaAdContentView.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$new$6(callback, (Whatever) obj);
            }
        });
        Objects.requireNonNull(callback);
        mraidPresenter.setAdViolationCallback(new BiConsumer() { // from class: com.smaato.sdk.richmedia.widget.a0
            @Override // com.smaato.sdk.core.util.p574fi.BiConsumer
            public final void accept(Object obj, Object obj2) {
                callback.onAdViolation((String) obj, (String) obj2);
            }
        });
        mraidPresenter.setUseCustomCloseCallback(new Consumer() { // from class: com.smaato.sdk.richmedia.widget.b0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                callback.onUseCustomClose((Boolean) obj);
            }
        });
    }

    @NonNull
    public static RichMediaAdContentView create(@NonNull Logger logger, @NonNull Context context, @NonNull String str, @NonNull Callback callback, @NonNull RichMediaWebViewFactory richMediaWebViewFactory, @NonNull RichMediaWebView richMediaWebView, @NonNull MraidPresenter mraidPresenter, @NonNull MraidEnvironmentProperties mraidEnvironmentProperties, int i, int i2) {
        return new RichMediaAdContentView((Logger) com.smaato.sdk.core.util.Objects.requireNonNull(logger), (Context) com.smaato.sdk.core.util.Objects.requireNonNull(context), (String) com.smaato.sdk.core.util.Objects.requireNonNull(str), (Callback) com.smaato.sdk.core.util.Objects.requireNonNull(callback), (RichMediaWebViewFactory) com.smaato.sdk.core.util.Objects.requireNonNull(richMediaWebViewFactory), (RichMediaWebView) com.smaato.sdk.core.util.Objects.requireNonNull(richMediaWebView), (MraidPresenter) com.smaato.sdk.core.util.Objects.requireNonNull(mraidPresenter), (MraidEnvironmentProperties) com.smaato.sdk.core.util.Objects.requireNonNull(mraidEnvironmentProperties), i, i2);
    }

    @NonNull
    private RichMediaWebView.Callback createRichMediaWebViewCallback() {
        return new C27582d();
    }

    private void expand(@Nullable String str) {
        boolean z;
        if (this.expandManager != null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            WatermarkImageButton watermarkImageButton = new WatermarkImageButton(getContext());
            RichMediaWebView create = this.webViewFactory.create(getContext());
            this.twoPartWebView = create;
            frameLayout.addView(create);
            frameLayout.addView(watermarkImageButton);
            this.twoPartWebView.setCallback(new C27579a(frameLayout, z));
            this.twoPartWebView.loadUrlContent(str);
            return;
        }
        performExpand(this.content, z);
    }

    public /* synthetic */ void lambda$new$0(RichMediaWebView richMediaWebView, String str, MraidExpandProperties mraidExpandProperties) {
        richMediaWebView.resetClickedFlag();
        expand(str);
    }

    public /* synthetic */ void lambda$new$1(RichMediaWebView richMediaWebView, Callback callback, String str) {
        richMediaWebView.resetClickedFlag();
        callback.onUrlClicked(this, str);
    }

    public /* synthetic */ void lambda$new$2(RichMediaWebView richMediaWebView, Callback callback, String str) {
        richMediaWebView.resetClickedFlag();
        callback.onPlayVideo(this, str);
    }

    public /* synthetic */ void lambda$new$3(Callback callback, Whatever whatever) {
        callback.onUnloadView(this);
    }

    public /* synthetic */ void lambda$new$4(RichMediaWebView richMediaWebView, ResizeParams resizeParams) {
        richMediaWebView.resetClickedFlag();
        resize(resizeParams);
    }

    public /* synthetic */ void lambda$new$5(Whatever whatever) {
        restoreDefaultSize();
    }

    public /* synthetic */ void lambda$new$6(Callback callback, Whatever whatever) {
        callback.onHidden(this);
    }

    public /* synthetic */ void lambda$restoreDefaultSize$7() {
        this.mraidPresenter.onWasClosed();
        this.richMediaViewCallback.onAdCollapsed(this);
    }

    public /* synthetic */ void lambda$restoreDefaultSize$8(ResizeManager resizeManager) {
        resizeManager.m38998g();
        this.resizeManager = null;
    }

    public /* synthetic */ void lambda$restoreDefaultSize$9(ExpandManager expandManager) {
        expandManager.m38959e();
        this.expandManager = null;
    }

    public void performExpand(@NonNull View view, boolean z) {
        ExpandManager expandManager = new ExpandManager();
        this.expandManager = expandManager;
        expandManager.m38958f(view, new C27580b(z));
    }

    private void resize(@NonNull ResizeParams resizeParams) {
        if (this.resizeManager == null) {
            ResizeManager resizeManager = new ResizeManager(this.logger, this.content, resizeParams.maxSizeRectInPx);
            this.resizeManager = resizeManager;
            resizeManager.m38989p(new C27581c());
        }
        this.resizeManager.m38990o(resizeParams.resizeRectInPx);
    }

    private void restoreDefaultSize() {
        boolean z;
        if (this.resizeManager == null && this.expandManager == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ViewUtils.removeFromParent(this.content);
            addView(this.content);
            Views.addOnPreDrawListener(this.content, new Runnable() { // from class: com.smaato.sdk.richmedia.widget.r
                {
                    RichMediaAdContentView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RichMediaAdContentView.this.lambda$restoreDefaultSize$7();
                }
            });
        }
        com.smaato.sdk.core.util.Objects.onNotNull(this.resizeManager, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.s
            {
                RichMediaAdContentView.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$restoreDefaultSize$8((ResizeManager) obj);
            }
        });
        com.smaato.sdk.core.util.Objects.onNotNull(this.expandManager, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.t
            {
                RichMediaAdContentView.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaAdContentView.this.lambda$restoreDefaultSize$9((ExpandManager) obj);
            }
        });
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @MainThread
    public void destroy() {
        Threads.ensureMainThread();
        restoreDefaultSize();
        com.smaato.sdk.core.util.Objects.onNotNull(this.twoPartWebView, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.c0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((RichMediaWebView) obj).destroy();
            }
        });
        this.mraidPresenter.destroy();
        Handler newUiHandler = Threads.newUiHandler();
        final RichMediaWebView richMediaWebView = this.webView;
        Objects.requireNonNull(richMediaWebView);
        newUiHandler.postDelayed(new Runnable() { // from class: com.smaato.sdk.richmedia.widget.q
            @Override // java.lang.Runnable
            public final void run() {
                RichMediaWebView.this.destroy();
            }
        }, 1000L);
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForOmTracking() {
        return getWebView();
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @NonNull
    public View getViewForVisibilityTracking() {
        View rootView = getRootView();
        if (rootView != null) {
            return rootView;
        }
        throw new IllegalStateException("No root view for RichMediaAdContentView found");
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    public Map<String, List<ViewabilityVerificationResource>> getViewabilityVerificationResourcesMap() {
        return new HashMap();
    }

    @NonNull
    public RichMediaWebView getWebView() {
        return this.webView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mraidPresenter.attachView(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mraidPresenter.detachView();
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @MainThread
    public void showProgressIndicator(boolean z) {
        Threads.ensureMainThread();
        if (z) {
            this.content.addView(new ProgressView(getContext()));
            return;
        }
        this.content.removeView((ProgressView) this.content.findViewById(C27626R.C27629id.smaato_sdk_core_progress_view_id));
    }

    @Override // com.smaato.sdk.core.p573ui.AdContentView
    @MainThread
    public void startShowingView() {
        Threads.ensureMainThread();
        this.webView.loadData(this.richMediaCreative, this.mraidEnvironmentProperties);
    }

    /* loaded from: classes7.dex */
    public interface Callback {
        default void onWebViewError() {
        }

        default void onAdCollapsed(@NonNull RichMediaAdContentView richMediaAdContentView) {
        }

        default void onAdExpanded(@NonNull RichMediaAdContentView richMediaAdContentView) {
        }

        default void onAdResized(@NonNull RichMediaAdContentView richMediaAdContentView) {
        }

        default void onHidden(@NonNull RichMediaAdContentView richMediaAdContentView) {
        }

        default void onRenderProcessGone(@NonNull RichMediaAdContentView richMediaAdContentView) {
        }

        default void onUnloadView(@NonNull RichMediaAdContentView richMediaAdContentView) {
        }

        default void onUseCustomClose(@NonNull Boolean bool) {
        }

        default void onWebViewLoaded(@NonNull RichMediaAdContentView richMediaAdContentView) {
        }

        default void registerFriendlyObstruction(@NonNull View view) {
        }

        default void removeFriendlyObstruction(@NonNull View view) {
        }

        default void updateAdView(@NonNull RichMediaWebView richMediaWebView) {
        }

        default void onAdViolation(@NonNull String str, @Nullable String str2) {
        }

        default void onPlayVideo(@NonNull RichMediaAdContentView richMediaAdContentView, @NonNull String str) {
        }

        default void onUrlClicked(@NonNull RichMediaAdContentView richMediaAdContentView, @NonNull String str) {
        }
    }
}

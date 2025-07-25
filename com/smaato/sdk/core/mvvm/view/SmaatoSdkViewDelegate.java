package com.smaato.sdk.core.mvvm.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.csm.CsmImageAdContentView;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.mvvm.model.imagead.Extension;
import com.smaato.sdk.core.mvvm.model.imagead.ImageAdContentView;
import com.smaato.sdk.core.mvvm.viewmodel.SmaatoSdkViewModel;
import com.smaato.sdk.core.network.SomaException;
import com.smaato.sdk.core.openmeasurement.VideoProps;
import com.smaato.sdk.core.p568ad.AdType;
import com.smaato.sdk.core.p573ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.appbackground.AppBackgroundDetector;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.diinjection.InjectOrNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class SmaatoSdkViewDelegate implements AndroidsInjector.InjectionAllowed {
    @NonNull
    protected WeakReference<AdContentView> adContentViewReference = new WeakReference<>(null);
    @Inject
    private AppBackgroundDetector appBackgroundDetector;
    @Inject
    private Logger logger;
    @Inject
    protected RichMediaAdContentViewCreator richMediaAdContentViewCreator;
    protected SmaatoSdkViewModel smaatoSdkViewModel;
    @Nullable
    @InjectOrNull
    private VideoAdContentViewCreator videoAdContentViewCreator;
    @Nullable
    private ViewVisibilityObserver viewVisibilityObserver;

    /* loaded from: classes7.dex */
    public interface VideoActivityLifecycleListener {
        void onActivityPause();

        void onActivityResume();
    }

    /* renamed from: com.smaato.sdk.core.mvvm.view.SmaatoSdkViewDelegate$a */
    /* loaded from: classes7.dex */
    public class ViewTreeObserver$OnPreDrawListenerC27196a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ AdContentView f71753b;

        ViewTreeObserver$OnPreDrawListenerC27196a(AdContentView adContentView) {
            SmaatoSdkViewDelegate.this = r1;
            this.f71753b = adContentView;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f71753b.getViewTreeObserver().removeOnPreDrawListener(this);
            SmaatoSdkViewDelegate.this.onPredrawOfAdContentView(this.f71753b);
            this.f71753b.setVisibility(0);
            this.f71753b.setWillNotDraw(false);
            return true;
        }
    }

    public SmaatoSdkViewDelegate(@NonNull SmaatoSdkViewModel smaatoSdkViewModel) {
        AndroidsInjector.inject(this);
        this.smaatoSdkViewModel = smaatoSdkViewModel;
    }

    @NonNull
    private ViewVisibilityObserver createVisibilityObserver(View view, ImpressionCountingType impressionCountingType, AdType adType) {
        ViewVisibilityObserver viewVisibilityObserver = new ViewVisibilityObserver(view, impressionCountingType, adType, this.smaatoSdkViewModel);
        this.viewVisibilityObserver = viewVisibilityObserver;
        return viewVisibilityObserver;
    }

    private void handleUrl(@Nullable final String str, final boolean z) {
        if (this.appBackgroundDetector.isAppInBackground()) {
            if (str == null) {
                this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
                return;
            }
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.AD;
            logger.info(logDomain, "skipping url handling, because app is in background, url = " + str, new Object[0]);
            return;
        }
        withAdContentView(new Consumer() { // from class: com.smaato.sdk.core.mvvm.view.c
            {
                SmaatoSdkViewDelegate.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                SmaatoSdkViewDelegate.this.lambda$handleUrl$3(z, str, (AdContentView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$createImageAdContentView$0(View view) {
        executeCtaLink();
    }

    public /* synthetic */ void lambda$createVideoAdContentView$1(ImpressionCountingType impressionCountingType, Runnable runnable, AdContentView adContentView) {
        prepareAndSaveAdContentView(impressionCountingType, adContentView, AdType.VIDEO);
        runnable.run();
    }

    public /* synthetic */ void lambda$handleUrl$2(AdContentView adContentView, Boolean bool) {
        adContentView.showProgressIndicator(false);
        if (!bool.booleanValue()) {
            this.logger.error(LogDomain.BANNER, "The url seems to be invalid", new Object[0]);
        }
    }

    public /* synthetic */ void lambda$handleUrl$3(boolean z, String str, final AdContentView adContentView) {
        adContentView.showProgressIndicator(true);
        Consumer<Boolean> consumer = new Consumer() { // from class: com.smaato.sdk.core.mvvm.view.d
            {
                SmaatoSdkViewDelegate.this = this;
            }

            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                SmaatoSdkViewDelegate.this.lambda$handleUrl$2(adContentView, (Boolean) obj);
            }
        };
        if (z) {
            this.smaatoSdkViewModel.executeCtaLink(str, consumer);
        } else {
            this.smaatoSdkViewModel.handleLink(str, consumer);
        }
    }

    private void prepareAndSaveAdContentView(ImpressionCountingType impressionCountingType, AdContentView adContentView, AdType adType) {
        this.adContentViewReference = new WeakReference<>(adContentView);
        this.smaatoSdkViewModel.onAdContentViewCreated(adContentView, adType);
        adContentView.setVisibility(4);
        setPreDrawListener(adContentView);
        createVisibilityObserver(adContentView.getViewForVisibilityTracking(), impressionCountingType, adType).startObserving();
        adContentView.startShowingView();
    }

    private void setPreDrawListener(AdContentView adContentView) {
        adContentView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC27196a(adContentView));
    }

    public void createCsmImageAdContentView(@NonNull View view, @NonNull ImpressionCountingType impressionCountingType) {
        if (view != null) {
            if (impressionCountingType != null) {
                try {
                    prepareAndSaveAdContentView(impressionCountingType, new CsmImageAdContentView(view.getContext(), view), AdType.IMAGE);
                    return;
                } catch (Exception e) {
                    this.smaatoSdkViewModel.onFailedToCreateContentView(e);
                    return;
                }
            }
            throw new NullPointerException("'impressionCountingType' specified as non-null is null");
        }
        throw new NullPointerException("'csmView' specified as non-null is null");
    }

    public void createImageAdContentView(@NonNull Context context, @NonNull Bitmap bitmap, int i, int i2, @Nullable List<Extension> list, ImpressionCountingType impressionCountingType) {
        if (context != null) {
            if (bitmap != null) {
                try {
                    prepareAndSaveAdContentView(impressionCountingType, ImageAdContentView.create(context, bitmap, i, i2, new View.OnClickListener() { // from class: com.smaato.sdk.core.mvvm.view.b
                        {
                            SmaatoSdkViewDelegate.this = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SmaatoSdkViewDelegate.this.lambda$createImageAdContentView$0(view);
                        }
                    }, list, this.logger), AdType.IMAGE);
                    return;
                } catch (Exception e) {
                    this.smaatoSdkViewModel.onFailedToCreateContentView(e);
                    return;
                }
            }
            throw new NullPointerException("'bitmap' specified as non-null is null");
        }
        throw new NullPointerException("'context' specified as non-null is null");
    }

    public void createRichMediaAdContentView(RichMediaAdContentViewCreator richMediaAdContentViewCreator, @NonNull Context context, @NonNull String str, int i, int i2, boolean z, @NonNull ImpressionCountingType impressionCountingType) {
        AdType adType;
        if (context != null) {
            if (str != null) {
                if (impressionCountingType != null) {
                    try {
                        AdContentView createAdContentView = richMediaAdContentViewCreator.createAdContentView(context, str, i, i2, z, impressionCountingType, this);
                        if (str.contains("VAST>")) {
                            adType = AdType.VIDEO;
                        } else {
                            adType = AdType.RICH_MEDIA;
                        }
                        prepareAndSaveAdContentView(impressionCountingType, createAdContentView, adType);
                        return;
                    } catch (Exception e) {
                        this.smaatoSdkViewModel.onFailedToCreateContentView(e);
                        return;
                    }
                }
                throw new NullPointerException("'impressionCountingType' specified as non-null is null");
            }
            throw new NullPointerException("'content' specified as non-null is null");
        }
        throw new NullPointerException("'context' specified as non-null is null");
    }

    public void createVideoAdContentView(@NonNull Object obj, boolean z, boolean z2, @NonNull final ImpressionCountingType impressionCountingType, @NonNull final Runnable runnable, @Nullable Consumer<VideoActivityLifecycleListener> consumer) {
        if (obj != null) {
            if (impressionCountingType != null) {
                if (runnable != null) {
                    try {
                        VideoAdContentViewCreator videoAdContentViewCreator = this.videoAdContentViewCreator;
                        if (videoAdContentViewCreator != null) {
                            videoAdContentViewCreator.createAdContentView(obj, z, z2, impressionCountingType, this, new Consumer() { // from class: com.smaato.sdk.core.mvvm.view.a
                                {
                                    SmaatoSdkViewDelegate.this = this;
                                }

                                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                                public final void accept(Object obj2) {
                                    SmaatoSdkViewDelegate.this.lambda$createVideoAdContentView$1(impressionCountingType, runnable, (AdContentView) obj2);
                                }
                            }, consumer);
                        } else {
                            this.smaatoSdkViewModel.onFailedToCreateContentView(new Exception());
                        }
                        return;
                    } catch (Exception e) {
                        this.smaatoSdkViewModel.onFailedToCreateContentView(e);
                        return;
                    }
                }
                throw new NullPointerException("'onAdContentViewCreated' specified as non-null is null");
            }
            throw new NullPointerException("'impressionCountingType' specified as non-null is null");
        }
        throw new NullPointerException("'vastObject' specified as non-null is null");
    }

    public void destroy() {
        withAdContentView(new Consumer() { // from class: com.smaato.sdk.core.mvvm.view.e
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((AdContentView) obj).destroy();
            }
        });
        Objects.onNotNull(this.viewVisibilityObserver, new Consumer() { // from class: com.smaato.sdk.core.mvvm.view.f
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((ViewVisibilityObserver) obj).finishObserving();
            }
        });
    }

    public void executeCtaLink(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("'url' specified as non-null is null");
        }
        handleUrl(str, true);
    }

    public String getBundleId() {
        return this.smaatoSdkViewModel.getBundleId();
    }

    public void onMuteClicked() {
        this.smaatoSdkViewModel.onMuteClicked();
    }

    protected abstract void onPredrawOfAdContentView(AdContentView adContentView);

    public void onRichMediaAdRendererProcessGone() {
        this.smaatoSdkViewModel.onRichMediaAdRendererProcessGone();
    }

    public void onRichMediaWebViewCollapsed() {
        this.smaatoSdkViewModel.onRichMediaWebViewCollapsed();
    }

    public void onRichMediaWebViewExpanded() {
        this.smaatoSdkViewModel.onRichMediaWebViewExpanded();
    }

    public void onRichMediaWebViewLoaded(WebView webView) {
        AdContentView adContentView = this.adContentViewReference.get();
        if (adContentView == null || adContentView.getViewForOmTracking() != webView) {
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.CORE;
            logger.error(logDomain, "Wrong view for OM tracking: " + webView, new Object[0]);
        }
        this.smaatoSdkViewModel.onRichMediaWebViewLoaded(adContentView);
    }

    public void onRichMediaWebViewResized() {
        this.smaatoSdkViewModel.onRichMediaWebViewResized();
    }

    public void onRichMediaWebViewUnloaded() {
        this.smaatoSdkViewModel.onRichMediaWebViewUnloaded();
    }

    public void onUnmuteClicked() {
        this.smaatoSdkViewModel.onUnmuteClicked();
    }

    public void onUpdateAdView(WebView webView) {
        this.smaatoSdkViewModel.onUpdateAdView(webView);
    }

    public void onVideoClicked() {
        this.smaatoSdkViewModel.onVideoClicked();
    }

    public void onVideoCompleted(boolean z) {
        this.smaatoSdkViewModel.onVideoCompleted();
    }

    public void onVideoFirstQuartileReached() {
        this.smaatoSdkViewModel.onVideoFirstQuartileReached();
    }

    public void onVideoMidpointReached() {
        this.smaatoSdkViewModel.onVideoMidpointReached();
    }

    public void onVideoPaused() {
        this.smaatoSdkViewModel.onVideoPaused();
    }

    public void onVideoPlayerBuildError(SomaException somaException) {
        this.smaatoSdkViewModel.onVideoPlayerBuildError(somaException);
    }

    public void onVideoResumed() {
        this.smaatoSdkViewModel.onVideoResumed();
    }

    public void onVideoSkipped() {
        this.smaatoSdkViewModel.onVideoSkipped();
    }

    public void onVideoStarted(float f, float f2, @NonNull Runnable runnable) {
        if (runnable != null) {
            this.smaatoSdkViewModel.onVideoStarted(f, f2, runnable);
            return;
        }
        throw new NullPointerException("'onVideoImpressed' specified as non-null is null");
    }

    public void onVideoThirdQuartileReached() {
        this.smaatoSdkViewModel.onVideoThirdQuartileReached();
    }

    public void onVideoViewAttached(boolean z, long j) {
        VideoProps buildForNonSkippableVideo;
        if (z) {
            buildForNonSkippableVideo = VideoProps.buildForSkippableVideo((float) (j * 1000));
        } else {
            buildForNonSkippableVideo = VideoProps.buildForNonSkippableVideo();
        }
        this.smaatoSdkViewModel.onVideoTrackLoaded(buildForNonSkippableVideo);
    }

    public void onVideoViewDetached() {
        this.smaatoSdkViewModel.stopOMVideoTracking();
    }

    public String onWrongVastObjectCreated(Object obj) {
        String str = "Wrong VAST object created: " + obj;
        this.logger.error(LogDomain.CORE, str, new Object[0]);
        return str;
    }

    public void registerFriendlyObstruction(@NonNull View view) {
        if (view != null) {
            this.smaatoSdkViewModel.registerFriendlyObstruction(view);
            return;
        }
        throw new NullPointerException("'view' specified as non-null is null");
    }

    public void removeFriendlyObstruction(@NonNull View view) {
        if (view != null) {
            this.smaatoSdkViewModel.removeFriendlyObstruction(view);
            return;
        }
        throw new NullPointerException("'view' specified as non-null is null");
    }

    public void reportRichMediaAdViolation(String str, String str2) {
        this.smaatoSdkViewModel.reportRichMediaAdViolation(str, str2);
    }

    public void setViewModel(@NonNull SmaatoSdkViewModel smaatoSdkViewModel) {
        if (smaatoSdkViewModel != null) {
            this.smaatoSdkViewModel = smaatoSdkViewModel;
            return;
        }
        throw new NullPointerException("'smaatoSdkViewModel' specified as non-null is null");
    }

    public void showLink(@NonNull String str) {
        if (str != null) {
            handleUrl(str, false);
            return;
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    protected void withAdContentView(Consumer<AdContentView> consumer) {
        Objects.onNotNull(this.adContentViewReference.get(), consumer);
    }

    private void executeCtaLink() {
        handleUrl(null, true);
    }

    public SmaatoSdkViewDelegate() {
        AndroidsInjector.inject(this);
    }

    public void hideRichMediaAd() {
    }

    public void onCompanionShown() {
    }

    public void onUseCustomClose() {
    }

    public void onVideoClosed() {
    }

    public void onWebViewError() {
    }

    public void setVideoPlayerCloser(@Nullable Runnable runnable) {
    }
}

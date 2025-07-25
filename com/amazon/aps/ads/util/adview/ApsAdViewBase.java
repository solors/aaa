package com.amazon.aps.ads.util.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ScrollView;
import com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.ApsAdExtensions;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdViewDisplayListener;
import com.amazon.device.ads.DTBTimeTrace;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ApsAdViewBase.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class ApsAdViewBase extends WebView implements ApsAdViewConstants {
    private boolean adViewScrollEnabled;
    @Nullable
    protected ApsAdFormat apsAdFormat;
    @Nullable
    private String bidId;
    protected int exposurePercent;
    @Nullable
    protected ViewTreeObserver.OnGlobalFocusChangeListener focusChangeListener;
    @Nullable
    protected ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    @Nullable
    private String hostname;
    protected boolean ignoreDetachment;
    private boolean isAdViewVisible;
    protected boolean isFirstDisplay;
    private boolean isVideo;
    @Nullable
    private DTBAdMRAIDController mraidHandler;
    @Nullable
    private ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
    @Nullable
    private DtbOmSdkSessionManager omSdkManager;
    @Nullable
    protected ViewTreeObserver.OnScrollChangedListener scrollChangeListener;
    private long startTime;
    protected long timeClicked;
    protected long timePressed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsAdViewBase(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isFirstDisplay = true;
        this.exposurePercent = -1;
        this.adViewScrollEnabled = true;
        CookieManager.getInstance().setAcceptCookie(true);
        this.omSdkManager = DtbOmSdkSessionManager.getNewInstance();
    }

    /* renamed from: initLayoutListeners$lambda-0 */
    public static final void m110008initLayoutListeners$lambda0(ApsAdViewBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.verifyIsVisible();
    }

    /* renamed from: initLayoutListeners$lambda-1 */
    public static final void m110009initLayoutListeners$lambda1(ApsAdViewBase this$0, View view, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.verifyIsVisible();
    }

    /* renamed from: initLayoutListeners$lambda-2 */
    public static final void m110010initLayoutListeners$lambda2(ApsAdViewBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.verifyIsVisible();
    }

    public static /* synthetic */ void notifyViewabilityAndSetIsVisible$default(ApsAdViewBase apsAdViewBase, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            apsAdViewBase.notifyViewabilityAndSetIsVisible(z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyViewabilityAndSetIsVisible");
    }

    @Nullable
    public Rect computeAdViewRect(@Nullable ScrollView scrollView) {
        return ApsAdViewUtils.Companion.computeAdViewRect(this, scrollView);
    }

    public void computeExposure(boolean z) {
        ScrollView scrollViewParent = getScrollViewParent();
        if (scrollViewParent != null) {
            computeExposureInScrollView(scrollViewParent, z);
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], getWidth() + i, iArr[1] + getHeight());
        if (isMraidHandlerInitialized()) {
            computeExposureInRootView(z);
            onPositionChanged(rect);
        }
    }

    public void computeExposureInRootView(boolean z) {
        Rect computeRootContainerRectInRootView = computeRootContainerRectInRootView();
        if (computeRootContainerRectInRootView != null) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i = iArr[0];
            Rect rect = new Rect(i, iArr[1], getWidth() + i, iArr[1] + getHeight());
            float width = getWidth() * getHeight();
            if (rect.intersect(computeRootContainerRectInRootView)) {
                int i2 = (int) (((((rect.right - rect.left) * (rect.bottom - rect.top)) * 100.0d) / width) + 0.5d);
                if (i2 != this.exposurePercent || z) {
                    this.exposurePercent = i2;
                    onExposureChange(i2, rect);
                }
            } else if (this.exposurePercent != 0 || z) {
                this.exposurePercent = 0;
                rect.top = rect.bottom;
                onExposureChange(0, rect);
            }
        }
    }

    public int computeExposureInScrollView(@NotNull Rect adViewRect) {
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        return ApsAdViewUtils.Companion.computeExposureInScrollView(this, adViewRect);
    }

    @Nullable
    public Rect computeRootContainerRectInRootView() {
        return ApsAdViewUtils.Companion.computeRootContainerRectInRootView(this);
    }

    public void finalize() {
        try {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.removeOnScrollChangedListener(this.scrollChangeListener);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.focusChangeListener);
            }
        } catch (RuntimeException e) {
            ApsAdExtensions.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute finalize method", e);
        }
    }

    protected final boolean getAdViewScrollEnabled() {
        return this.adViewScrollEnabled;
    }

    @Nullable
    public final String getBidId() {
        return this.bidId;
    }

    @Nullable
    public final String getHostname() {
        return this.hostname;
    }

    @Nullable
    public final DTBAdMRAIDController getMraidHandler() {
        return this.mraidHandler;
    }

    @Nullable
    public final ApsMetricsAdListenerAdapterBase getMraidListenerAdapter() {
        return this.mraidListenerAdapter;
    }

    @Nullable
    public final DtbOmSdkSessionManager getOmSdkManager() {
        return this.omSdkManager;
    }

    @Nullable
    public final ScrollView getScrollViewParent() {
        return ApsAdViewUtils.Companion.getScrollViewParent(this);
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void initLayoutListeners() {
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.amazon.aps.ads.util.adview.a
            {
                ApsAdViewBase.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ApsAdViewBase.m110008initLayoutListeners$lambda0(ApsAdViewBase.this);
            }
        };
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.amazon.aps.ads.util.adview.b
            {
                ApsAdViewBase.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                ApsAdViewBase.m110009initLayoutListeners$lambda1(ApsAdViewBase.this, view, view2);
            }
        };
        this.scrollChangeListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.amazon.aps.ads.util.adview.c
            {
                ApsAdViewBase.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ApsAdViewBase.m110010initLayoutListeners$lambda2(ApsAdViewBase.this);
            }
        };
    }

    public void initWebView() {
        ApsAdViewUtils.Companion.initWebView(this);
    }

    public final boolean isAdViewVisible() {
        return this.isAdViewVisible;
    }

    protected boolean isMraidHandlerInitialized() {
        if (this.mraidHandler != null) {
            return true;
        }
        return false;
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public void notifyViewabilityAndSetIsVisible(boolean z, boolean z2) {
        if (this.isAdViewVisible || z2) {
            if (isMraidHandlerInitialized()) {
                onViewabilityChanged(z);
            }
            setAdViewVisible(z);
        }
    }

    protected abstract void onAdOpened();

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.addOnGlobalFocusChangeListener(this.focusChangeListener);
                viewTreeObserver.addOnScrollChangedListener(this.scrollChangeListener);
            }
            if (isMraidHandlerInitialized()) {
                onAdOpened();
            }
        } catch (RuntimeException e) {
            ApsAdExtensions.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onAttachedToWindow method", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        DtbOmSdkSessionManager omSdkManager;
        try {
            super.onDetachedFromWindow();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
                viewTreeObserver.removeOnScrollChangedListener(this.scrollChangeListener);
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.focusChangeListener);
            }
            DTBAdMRAIDController dTBAdMRAIDController = this.mraidHandler;
            if (dTBAdMRAIDController != null && (dTBAdMRAIDController instanceof DTBAdMRAIDBannerController) && getOmSdkManager() != null && (omSdkManager = getOmSdkManager()) != null) {
                omSdkManager.stopOmAdSession();
            }
            this.mraidListenerAdapter = null;
        } catch (RuntimeException e) {
            ApsAdExtensions.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onDetachedFromWindow method in ApsAdView class", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        if (this.isFirstDisplay) {
            DTBTimeTrace dTBTimeTrace = DTBTimeTrace.getInstance();
            if (dTBTimeTrace != null && AdRegistration.isTestMode()) {
                dTBTimeTrace.addPhase(DTBTimeTrace.TIMETRACE_AD_DISPLAY_SUCCEEDED);
                dTBTimeTrace.logTrace();
            }
            DTBAdMRAIDController dTBAdMRAIDController = this.mraidHandler;
            if (dTBAdMRAIDController instanceof DTBAdViewDisplayListener) {
                if (dTBAdMRAIDController != null) {
                    ((DTBAdViewDisplayListener) dTBAdMRAIDController).onInitialDisplay();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.amazon.device.ads.DTBAdViewDisplayListener");
                }
            }
            this.isFirstDisplay = false;
        }
    }

    protected abstract void onExposureChange(int i, @NotNull Rect rect);

    protected abstract void onPositionChanged(@NotNull Rect rect);

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.adViewScrollEnabled) {
            super.onScrollChanged(i, i2, i4, i3);
        } else {
            scrollTo(0, 0);
        }
    }

    protected abstract void onViewabilityChanged(boolean z);

    public final void setAdViewScrollEnabled(boolean z) {
        this.adViewScrollEnabled = z;
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    protected final void setAdViewVisible(boolean z) {
        this.isAdViewVisible = z;
        if (!z) {
            this.exposurePercent = -1;
            if (isMraidHandlerInitialized()) {
                onExposureChange(0, new Rect(0, 0, 0, 0));
            }
        }
    }

    public final void setBidId(@Nullable String str) {
        this.bidId = str;
        ApsMetricsAdListenerAdapterBase apsMetricsAdListenerAdapterBase = this.mraidListenerAdapter;
        if (apsMetricsAdListenerAdapterBase != null) {
            apsMetricsAdListenerAdapterBase.setBidId(str);
        }
    }

    protected abstract void setCurrentPositionProperty();

    public final void setHostname(@Nullable String str) {
        this.hostname = str;
    }

    public final void setMraidHandler(@Nullable DTBAdMRAIDController dTBAdMRAIDController) {
        this.mraidHandler = dTBAdMRAIDController;
    }

    public final void setMraidListenerAdapter(@Nullable ApsMetricsAdListenerAdapterBase apsMetricsAdListenerAdapterBase) {
        this.mraidListenerAdapter = apsMetricsAdListenerAdapterBase;
    }

    public void setScrollEnabled(boolean z) {
        setAdViewScrollEnabled(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setVideo(boolean z) {
        this.isVideo = z;
    }

    protected void verifyIsVisible() {
        ApsAdExtensions.m102708d(this, Intrinsics.m17064q("method verifyIsVisible called: ", Boolean.valueOf(this.isAdViewVisible)));
        ApsAdViewUtils.Companion.verifyIsVisible(this, this.isAdViewVisible, new ApsAdViewBase$verifyIsVisible$1(this));
        if (this.isAdViewVisible) {
            computeExposure(false);
        }
    }

    protected void computeExposureInScrollView(@Nullable ScrollView scrollView, boolean z) {
        Rect computeAdViewRect = computeAdViewRect(scrollView);
        if (computeAdViewRect == null) {
            return;
        }
        int computeExposureInScrollView = computeExposureInScrollView(computeAdViewRect);
        if (computeExposureInScrollView != this.exposurePercent || z) {
            this.exposurePercent = computeExposureInScrollView;
            onExposureChange(computeExposureInScrollView, computeAdViewRect);
            setCurrentPositionProperty();
        }
    }

    public void cleanup() {
    }
}

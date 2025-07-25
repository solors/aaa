package com.mobilefuse.sdk.p542ad.rendering.splashad;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.mraid.C23602R;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import com.mobilefuse.sdk.p542ad.view.CloseButton;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: MobileFuseSplashAdActivity.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity */
/* loaded from: classes7.dex */
public final class MobileFuseSplashAdActivity extends Activity {
    private CloseButton closeBtn;
    private SplashAdController splashAdController;
    private WebView webView;

    public final void addCloseButton(boolean z, RelativeLayout relativeLayout) {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            CloseButton closeButton = new CloseButton(this, 0, 0, MobileFuseSplashAdActivity$addCloseButton$1$closeBtn$1.INSTANCE, new C23421x634d1c2d(this, z, relativeLayout), 6, null);
            this.closeBtn = closeButton;
            closeButton.setTransparent(z);
            closeButton.setOnVisibilityChange(new C23422x634d1c2e(this, z, relativeLayout));
            closeButton.show();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(closeButton.getInteractionSizePx(), closeButton.getInteractionSizePx());
            layoutParams.alignWithParent = true;
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            relativeLayout.addView(closeButton, layoutParams);
            errorResult = new SuccessResult(Unit.f99208a);
        } catch (Throwable th) {
            if (C23420xf3b378c1.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                requestToClose();
            } catch (Throwable th3) {
                int i = C23419x702b6579.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                StabilityHelper.logException("[Automatically caught]", th3);
            }
        }
    }

    private final void addWebView() {
        Either errorResult;
        WeakReference<SplashAdController> currentFullscreenController$mobilefuse_sdk_mraid_release;
        final SplashAdController splashAdController;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            currentFullscreenController$mobilefuse_sdk_mraid_release = SplashAdController.Companion.getCurrentFullscreenController$mobilefuse_sdk_mraid_release();
        } catch (Throwable th) {
            if (C23423xc2c22712.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (currentFullscreenController$mobilefuse_sdk_mraid_release != null && (splashAdController = currentFullscreenController$mobilefuse_sdk_mraid_release.get()) != null) {
            this.splashAdController = splashAdController;
            Intrinsics.checkNotNullExpressionValue(splashAdController, "SplashAdController.curre…         return\n        }");
            splashAdController.onWebViewExpanded(new C23424xf30bb5fc(this));
            final RelativeLayout mainContainer = (RelativeLayout) findViewById(C23602R.C23603id.mainContainer);
            WebView webView = splashAdController.getWebView();
            this.webView = webView;
            ViewParent parent = webView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(webView);
                Intrinsics.checkNotNullExpressionValue(mainContainer, "mainContainer");
                mainContainer.setVisibility(4);
                mainContainer.addView(webView);
                errorResult = new SuccessResult(Boolean.valueOf(SchedulersKt.getGlobalHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addWebView$$inlined$gracefullyHandleException$lambda$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        RelativeLayout mainContainer2 = mainContainer;
                        Intrinsics.checkNotNullExpressionValue(mainContainer2, "mainContainer");
                        mainContainer2.setVisibility(0);
                        MobileFuseSplashAdActivity mobileFuseSplashAdActivity = this;
                        boolean isExpandedCloseBtnTransparent = splashAdController.isExpandedCloseBtnTransparent();
                        RelativeLayout mainContainer3 = mainContainer;
                        Intrinsics.checkNotNullExpressionValue(mainContainer3, "mainContainer");
                        mobileFuseSplashAdActivity.addCloseButton(isExpandedCloseBtnTransparent, mainContainer3);
                    }
                }, 200L)));
                if (errorResult instanceof ErrorResult) {
                    Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        requestToClose();
                        return;
                    } catch (Throwable th3) {
                        int i = C23418x25f9cc38.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        }
                        StabilityHelper.logException("[Automatically caught]", th3);
                        return;
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        finish();
    }

    public final void animateAdClose() {
        Either errorResult;
        final WebView webView;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            webView = this.webView;
        } catch (Throwable th) {
            if (C23426x6224f856.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (webView == null) {
            closeActivity();
            return;
        }
        final float x = webView.getX();
        final float f = (-webView.getWidth()) - x;
        final ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration, "ValueAnimator.ofFloat(0f, 1f).setDuration(500)");
        duration.setInterpolator(new FastOutSlowInInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$animateAdClose$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NotNull ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WebView webView2 = webView;
                float f2 = x;
                float f3 = f;
                Object animatedValue = duration.getAnimatedValue();
                if (animatedValue != null) {
                    webView2.setX(f2 + (f3 * ((Float) animatedValue).floatValue()));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        });
        duration.addListener(new Animator.AnimatorListener() { // from class: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$animateAdClose$$inlined$gracefullyHandleException$lambda$1
            {
                MobileFuseSplashAdActivity.this = this;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                MobileFuseSplashAdActivity.this.closeActivity();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        duration.start();
        errorResult = new SuccessResult(Unit.f99208a);
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            closeActivity();
        }
    }

    public final void closeActivity() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SplashAdController splashAdController = this.splashAdController;
            if (splashAdController != null) {
                splashAdController.onExpandActivityClosed();
            }
            CloseButton closeButton = this.closeBtn;
            if (closeButton != null) {
                closeButton.destroy();
            }
            finish();
        } catch (Throwable th) {
            int i = C23428x8457957a.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final void requestToClose() {
        SplashAdController splashAdController = this.splashAdController;
        if (splashAdController != null) {
            splashAdController.onCloseRequestedFromExpandActivity();
        } else {
            closeActivity();
        }
    }

    public final void updateCloseBtnAsOmidFriendlyObstruction() {
        OmidBridge omidBridge;
        CloseButton closeButton;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SplashAdController splashAdController = this.splashAdController;
            if (splashAdController != null && (omidBridge = splashAdController.getOmidBridge()) != null && (closeButton = this.closeBtn) != null) {
                omidBridge.removeFriendlyObstruction(closeButton);
                if (closeButton.isVisible()) {
                    omidBridge.addFriendlyObstruction(closeButton, OmidFriendlyObstructionPurpose.CLOSE_AD, null);
                }
            }
        } catch (Throwable th) {
            int i = C23430xe16ca550.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            requestToClose();
        } catch (Throwable th) {
            int i = C23429x6c3aa6ef.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C23602R.C23604layout.mobilefuse_splash_ad_fullscreen);
        addWebView();
    }
}

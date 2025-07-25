package com.amazon.aps.ads.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.C3582R;
import com.amazon.aps.ads.util.ApsAdExtensions;
import com.amazon.aps.ads.util.ApsMraidCloseButtonListener;
import com.amazon.aps.ads.util.ApsMraidHandler;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdUtil;
import com.amazon.device.ads.DTBMRAIDCloseButtonListener;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: ApsInterstitialActivity.kt */
@Metadata
/* loaded from: classes2.dex */
public class ApsInterstitialActivity extends Activity implements ApsMraidCloseButtonListener {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static WeakReference<ApsAdView> adViewRefPassed;
    @NotNull
    private final String TAG = "ApsInterstitialActivity";
    @Nullable
    private WeakReference<ApsAdView> apsAdViewRef;
    @Nullable
    private LinearLayout closeIndicatorRegion;
    @NotNull
    private final LinearLayout.LayoutParams imageParams;
    @NotNull
    private final InterfaceC38501j imageView$delegate;

    /* compiled from: ApsInterstitialActivity.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final WeakReference<ApsAdView> getAdViewRefPassed() {
            return ApsInterstitialActivity.adViewRefPassed;
        }

        public final void setAdViewRefPassed(@Nullable WeakReference<ApsAdView> weakReference) {
            ApsInterstitialActivity.adViewRefPassed = weakReference;
        }
    }

    public ApsInterstitialActivity() {
        InterfaceC38501j m14554a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.imageParams = layoutParams;
        m14554a = LazyJVM.m14554a(new ApsInterstitialActivity$imageView$2(this));
        this.imageView$delegate = m14554a;
    }

    private final void attachWebView() {
        ApsAdView apsAdView;
        ApsLog.m102717d(this.TAG, "Attaching the ApsAdView");
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        if (weakReference == null) {
            apsAdView = null;
        } else {
            apsAdView = weakReference.get();
        }
        if (apsAdView != null) {
            apsAdView.setScrollEnabled(false);
            ViewParent parent = apsAdView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(apsAdView);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C3582R.C3585id.inter_container);
        if (relativeLayout != null) {
            relativeLayout.addView(apsAdView, -1, -1);
        }
        prepareCloseButtonRegion();
    }

    private final void clean() {
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        if (weakReference != null) {
            weakReference.clear();
            this.apsAdViewRef = null;
        }
    }

    private final void cleanAndFinishAdView() {
        ApsAdView apsAdView;
        WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
        if (weakReference == null) {
            apsAdView = null;
        } else {
            apsAdView = weakReference.get();
        }
        if (apsAdView != null && apsAdView.getMraidHandler() != null) {
            apsAdView.evaluateJavascript(ApsMraidHandler.Companion.getMRAID_CLOSE(), null);
        }
        clean();
        finish();
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView$delegate.getValue();
    }

    private final boolean getUseCustomClose() {
        ApsAdView apsAdView;
        DTBAdMRAIDController mraidHandler;
        try {
            WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
            if (weakReference == null) {
                apsAdView = null;
            } else {
                apsAdView = weakReference.get();
            }
            if (apsAdView != null && (mraidHandler = apsAdView.getMraidHandler()) != null) {
                return mraidHandler.isUseCustomClose();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            ApsAdExtensions.m102707e(this, Intrinsics.m17064q("Error in using the flag isUseCustomClose:", Unit.f99208a));
            return false;
        }
    }

    private final void handleApsAdView(ApsAdView apsAdView) {
        if (apsAdView != null) {
            try {
                ApsLog.m102717d(this.TAG, "Received the ApsAdView");
                this.apsAdViewRef = new WeakReference<>(apsAdView);
                adViewRefPassed = null;
                attachWebView();
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error rendering the ApsInterstitial activity ApsAdView", e);
                finish();
            }
        }
    }

    private final void initActivity() {
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            setContentView(C3582R.C3587layout.aps_interstitial_activity);
            ApsLog.m102717d(this.TAG, "Init window completed");
        } catch (RuntimeException e) {
            ApsLog.m102715e(this.TAG, Intrinsics.m17064q("Error in calling the initActivity: ", e));
        }
    }

    private final void prepareCloseButtonRegion() {
        ApsAdView apsAdView;
        int i;
        DTBAdMRAIDController mraidHandler;
        LinearLayout closeIndicatorRegion = getCloseIndicatorRegion();
        if (closeIndicatorRegion != null) {
            WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
            if (weakReference == null) {
                apsAdView = null;
            } else {
                apsAdView = weakReference.get();
            }
            if (apsAdView != null && (mraidHandler = apsAdView.getMraidHandler()) != null) {
                mraidHandler.setCustomButtonListener(new DTBMRAIDCloseButtonListener() { // from class: com.amazon.aps.ads.activity.a
                    {
                        ApsInterstitialActivity.this = this;
                    }

                    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
                    public final void useCustomButtonUpdated() {
                        ApsInterstitialActivity.m110003prepareCloseButtonRegion$lambda10$lambda8$lambda6(ApsInterstitialActivity.this);
                    }
                });
                DtbOmSdkSessionManager omSdkManager = apsAdView.getOmSdkManager();
                if (omSdkManager != null) {
                    omSdkManager.addFriendlyObstruction(findViewById(C3582R.C3585id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
                }
            }
            if (getUseCustomClose()) {
                i = 4;
            } else {
                i = 0;
            }
            closeIndicatorRegion.setVisibility(i);
            closeIndicatorRegion.bringToFront();
            closeIndicatorRegion.setBackgroundColor(0);
            closeIndicatorRegion.setOrientation(1);
            closeIndicatorRegion.addView(getImageView(), this.imageParams);
            closeIndicatorRegion.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.aps.ads.activity.b
                {
                    ApsInterstitialActivity.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m110004prepareCloseButtonRegion$lambda10$lambda9;
                    m110004prepareCloseButtonRegion$lambda10$lambda9 = ApsInterstitialActivity.m110004prepareCloseButtonRegion$lambda10$lambda9(ApsInterstitialActivity.this, view, motionEvent);
                    return m110004prepareCloseButtonRegion$lambda10$lambda9;
                }
            });
        }
    }

    /* renamed from: prepareCloseButtonRegion$lambda-10$lambda-8$lambda-6 */
    public static final void m110003prepareCloseButtonRegion$lambda10$lambda8$lambda6(ApsInterstitialActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.useCustomButtonUpdated();
    }

    /* renamed from: prepareCloseButtonRegion$lambda-10$lambda-9 */
    public static final boolean m110004prepareCloseButtonRegion$lambda10$lambda9(ApsInterstitialActivity this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 0) {
            this$0.cleanAndFinishAdView();
            return true;
        }
        return false;
    }

    /* renamed from: useCustomButtonUpdated$lambda-15 */
    public static final void m110005useCustomButtonUpdated$lambda15(ApsInterstitialActivity this$0) {
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View findViewById = this$0.findViewById(C3582R.C3585id.mraid_close_indicator);
        if (this$0.getUseCustomClose()) {
            i = 4;
        } else {
            i = 0;
        }
        findViewById.setVisibility(i);
    }

    @Nullable
    public final LinearLayout getCloseIndicatorRegion() {
        return (LinearLayout) findViewById(C3582R.C3585id.mraid_close_indicator);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (!getUseCustomClose()) {
                cleanAndFinishAdView();
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute onBackPressed method", e);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        ApsAdView apsAdView;
        super.onCreate(bundle);
        try {
            initActivity();
            WeakReference<ApsAdView> weakReference = adViewRefPassed;
            if (weakReference != null) {
                if (weakReference == null) {
                    apsAdView = null;
                } else {
                    apsAdView = weakReference.get();
                }
                handleApsAdView(apsAdView);
                return;
            }
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to create ApsInterstitialActivity as the ad view is null");
            finish();
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to create ApsInterstitialActivity", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        ApsAdView apsAdView;
        try {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C3582R.C3585id.inter_container);
            if (relativeLayout != null) {
                WeakReference<ApsAdView> weakReference = this.apsAdViewRef;
                if (weakReference == null) {
                    apsAdView = null;
                } else {
                    apsAdView = weakReference.get();
                }
                relativeLayout.removeView(apsAdView);
            }
            WeakReference<ApsAdView> weakReference2 = this.apsAdViewRef;
            if (weakReference2 != null) {
                ApsAdView apsAdView2 = weakReference2.get();
                if (apsAdView2 != null) {
                    apsAdView2.evaluateJavascript(DTBAdMRAIDController.MRAID_CLOSE, null);
                }
                clean();
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to remove DTBAdView on Activity Destroy", e);
        }
        super.onDestroy();
    }

    public final void setCloseIndicatorRegion(@Nullable LinearLayout linearLayout) {
        this.closeIndicatorRegion = linearLayout;
    }

    @Override // com.amazon.aps.ads.util.ApsMraidCloseButtonListener
    public void useCustomButtonUpdated() {
        WeakReference<ApsAdView> weakReference;
        ApsAdView apsAdView;
        DTBAdMRAIDController controller;
        DtbOmSdkSessionManager dtbOmSdkSessionManager;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.ads.activity.c
            {
                ApsInterstitialActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ApsInterstitialActivity.m110005useCustomButtonUpdated$lambda15(ApsInterstitialActivity.this);
            }
        });
        try {
            if (!getUseCustomClose() && (weakReference = this.apsAdViewRef) != null && (apsAdView = weakReference.get()) != null && (controller = apsAdView.getController()) != null && (dtbOmSdkSessionManager = controller.getDtbOmSdkSessionManager()) != null) {
                dtbOmSdkSessionManager.addFriendlyObstruction(findViewById(C3582R.C3585id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, " OMSDK : Unable to add close icon as friendly obstruction on geometry change", e);
        }
    }
}

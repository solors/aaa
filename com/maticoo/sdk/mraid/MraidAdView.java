package com.maticoo.sdk.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.RenderProcessGoneDetail;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.core.AbstractAdsManager;
import com.maticoo.sdk.core.AdCacheSafeBoolean;
import com.maticoo.sdk.core.AdView;
import com.maticoo.sdk.core.BaseAdView;
import com.maticoo.sdk.mraid.Bridge;
import com.maticoo.sdk.mraid.BrowserDialog;
import com.maticoo.sdk.mraid.Consts;
import com.maticoo.sdk.mraid.CountDownTextView;
import com.maticoo.sdk.mraid.MraidAdViewDelegate;
import com.maticoo.sdk.mraid.WebView;
import com.maticoo.sdk.mraid.utils.Utils;
import com.maticoo.sdk.p405ad.utils.AdSize;
import com.maticoo.sdk.p405ad.utils.AdsUtil;
import com.maticoo.sdk.p405ad.utils.GpUtil;
import com.maticoo.sdk.p405ad.utils.error.Error;
import com.maticoo.sdk.p405ad.utils.error.ErrorBuilder;
import com.maticoo.sdk.utils.DisplayUtils;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class MraidAdView extends ViewGroup implements BaseAdView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static int CLOSE_DURATION = 5;
    public static final int ID_CLOSE_AREA = Utils.generateViewId();
    private static final long RENDER_TIMEOUT = 20000;
    private static final String TAG = "CTAdView";
    private final int CloseAreaSizeDp;
    private final int OrientationReset;
    private FrameLayout adContainer;
    private ScheduledFuture<?> adUpdateIntervalFuture;
    private BrowserDialog browserDialog;
    private Drawable closeButtonCustomDrawable;
    private int closeButtonDelay;
    private ScheduledFuture<?> closeButtonFuture;
    private Context context;
    private Activity currentActivity;
    private MraidAdViewDelegate.FeatureSupportHandler featureSupportHandler;
    private MraidAdViewDelegate.InternalBrowserListener internalBrowserListener;
    private ScheduledFuture<?> interstitialDelayFuture;
    private ViewGroup interstitialLayout;
    private MraidAdViewDelegate.ActivityListener interstitialListener;
    protected boolean isError;
    protected boolean isLoaded;
    private boolean isResumed;
    private LocationListener locationListener;
    private LocationManager locationManager;
    private LogLevel logLevel;
    private MraidAdViewDelegate.LogListener logListener;
    protected AdView.ActivityHandler mActivityHandler;
    private final AbstractAdsManager mAdsManager;
    private OrientationBroadcastReceiver mOrientationBroadcastReceiver;
    private SettingsContentObserver mSettingsContentObserver;
    public Bridge mraidBridge;
    public Bridge.Handler mraidBridgeHandler;
    private boolean mraidBridgeInit;
    private ExpandDialog mraidExpandDialog;
    private int mraidOriginalOrientation;
    private View mraidResizeCloseArea;
    private RelativeLayout mraidResizeLayout;
    private Bridge mraidTwoPartBridge;
    private boolean mraidTwoPartBridgeInit;
    private boolean mraidTwoPartExpand;
    private WebView mraidTwoPartWebView;
    private Consts.PlacementType placementType;
    private final AdCacheSafeBoolean safeState;
    private boolean showCloseButton;
    private boolean test;
    private final Runnable timeoutRun;
    private int updateInterval;
    private boolean useInternalBrowser;
    private String userAgent;
    private WebView webView;
    private final AtomicBoolean webViewFailed;
    private final WebView.Handler webViewHandler;
    private String zone;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.maticoo.sdk.mraid.MraidAdView$10 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C2168110 {
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition;
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType;
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$State;
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$MraidAdView$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$MraidAdView$LogLevel = iArr;
            try {
                iArr[LogLevel.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$MraidAdView$LogLevel[LogLevel.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$MraidAdView$LogLevel[LogLevel.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Consts.CustomClosePosition.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition = iArr2;
            try {
                iArr2[Consts.CustomClosePosition.TopRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.TopCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.TopLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.BottomLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.BottomCenter.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.BottomRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.Center.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[Consts.ForceOrientation.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation = iArr3;
            try {
                iArr3[Consts.ForceOrientation.Portrait.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation[Consts.ForceOrientation.Landscape.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation[Consts.ForceOrientation.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[Consts.State.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$State = iArr4;
            try {
                iArr4[Consts.State.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Hidden.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Default.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Resized.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Expanded.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr5 = new int[Consts.PlacementType.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType = iArr5;
            try {
                iArr5[Consts.PlacementType.Inline.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType[Consts.PlacementType.Interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.maticoo.sdk.mraid.MraidAdView$4 */
    /* loaded from: classes6.dex */
    public class View$OnAttachStateChangeListenerC216844 implements View.OnAttachStateChangeListener {
        final /* synthetic */ CountDownTextView val$closeArea;
        final /* synthetic */ RelativeLayout val$container;

        View$OnAttachStateChangeListenerC216844(CountDownTextView countDownTextView, RelativeLayout relativeLayout) {
            this.val$closeArea = countDownTextView;
            this.val$container = relativeLayout;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            String str;
            if (MraidAdView.this.mAdsManager != null && MraidAdView.this.isInterstitial()) {
                MraidAdView.this.callbackAdShow();
                this.val$closeArea.setProgressLineWidth(Utils.dpToPx(2));
                this.val$closeArea.setBackgroundDrawable(Assets.getDrawableFromBase64(MraidAdView.this.getResources(), Assets.close_button_default));
                this.val$closeArea.setTimeSeconds(MraidAdView.CLOSE_DURATION);
                CountDownTextView countDownTextView = this.val$closeArea;
                if (MraidAdView.CLOSE_DURATION > 0) {
                    str = String.valueOf(MraidAdView.CLOSE_DURATION);
                } else {
                    str = "";
                }
                countDownTextView.setText(str);
                this.val$closeArea.setCountdownProgressListener(1, new CountDownTextView.OnCountdownProgressListener() { // from class: com.maticoo.sdk.mraid.MraidAdView.4.1
                    @Override // com.maticoo.sdk.mraid.CountDownTextView.OnCountdownProgressListener
                    public void onFinish() {
                        if (MraidAdView.this.interstitialListener != null) {
                            MraidAdView.this.interstitialListener.countDownFinish(MraidAdView.this);
                        }
                        MraidAdView.this.prepareCloseButton();
                        View$OnAttachStateChangeListenerC216844.this.val$closeArea.setProgressColor(0);
                        View$OnAttachStateChangeListenerC216844.this.val$closeArea.setProgressLineWidth(0);
                        View$OnAttachStateChangeListenerC216844.this.val$closeArea.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.MraidAdView.4.1.1
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
                                MraidAdView.this.interstitialMraidClose();
                            }
                        });
                    }

                    @Override // com.maticoo.sdk.mraid.CountDownTextView.OnCountdownProgressListener
                    public void onProgress(int i, int i2) {
                    }
                });
                this.val$closeArea.start();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.val$container.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class ExpandDialog extends Dialog {
        private CountDownTextView closeArea;
        private ViewGroup container;

        public ExpandDialog(Context context) {
            super(context, 16973831);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            this.container = relativeLayout;
            relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            setContentView(this.container, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Utils.dpToPx(32), Utils.dpToPx(32));
            layoutParams2.addRule(11);
            layoutParams2.addRule(10);
            layoutParams2.rightMargin = Utils.dpToPx(15);
            layoutParams2.topMargin = Utils.dpToPx(15);
            CountDownTextView countDownTextView = new CountDownTextView(getContext());
            this.closeArea = countDownTextView;
            countDownTextView.setTextSize(16.0f);
            this.closeArea.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            this.closeArea.setGravity(17);
            this.closeArea.setInCircleColor(0);
            this.closeArea.setProgressColor(-12303292);
            this.closeArea.setProgressLineWidth(0);
            this.closeArea.setProgressType(CountDownTextView.ProgressType.COUNT);
            this.container.addView(this.closeArea, layoutParams2);
            setCancelable(false);
            if (!MraidAdView.this.isInterstitial()) {
                this.closeArea.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.MraidAdView.ExpandDialog.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ExpandDialog.this.dismiss();
                    }
                });
            }
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.maticoo.sdk.mraid.MraidAdView.ExpandDialog.2
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    MraidAdView mraidAdView = MraidAdView.this;
                    if (mraidAdView.mraidBridge != null && C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType[mraidAdView.placementType.ordinal()] == 1) {
                        Consts.State state = MraidAdView.this.mraidBridge.getState();
                        Consts.State state2 = Consts.State.Expanded;
                        if (state == state2) {
                            MraidAdView mraidAdView2 = MraidAdView.this;
                            mraidAdView2.mraidBridgeHandler.mraidClose(mraidAdView2.mraidBridge);
                            return;
                        } else if (MraidAdView.this.mraidTwoPartBridge != null) {
                            MraidAdView.this.mraidTwoPartBridge.setState(state2);
                            MraidAdView mraidAdView3 = MraidAdView.this;
                            mraidAdView3.mraidBridgeHandler.mraidClose(mraidAdView3.mraidTwoPartBridge);
                            return;
                        }
                    }
                    MraidAdView.this.resetMRAIDOrientation();
                }
            });
        }

        public void addView(View view) {
            if (view.getParent() != this.container) {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.container.addView(view, new ViewGroup.LayoutParams(-1, -1));
            }
            this.closeArea.bringToFront();
        }

        @Override // android.app.Dialog, android.view.Window.Callback
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.app.Dialog
        protected void onStart() {
            MraidAdView mraidAdView;
            Bridge bridge;
            super.onStart();
            int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType[MraidAdView.this.placementType.ordinal()];
            if (i != 1) {
                if (i == 2 && (bridge = (mraidAdView = MraidAdView.this).mraidBridge) != null) {
                    mraidAdView.updateMRAIDLayoutForState(bridge, Consts.State.Expanded, true);
                    MraidAdView mraidAdView2 = MraidAdView.this;
                    mraidAdView2.setMRAIDOrientation(mraidAdView2.mraidBridge);
                }
            } else if (MraidAdView.this.mraidTwoPartExpand) {
                MraidAdView mraidAdView3 = MraidAdView.this;
                mraidAdView3.updateMRAIDLayoutForState(mraidAdView3.mraidTwoPartBridge, Consts.State.Expanded, false);
            } else {
                MraidAdView mraidAdView4 = MraidAdView.this;
                mraidAdView4.updateMRAIDLayoutForState(mraidAdView4.mraidBridge, Consts.State.Expanded, true);
            }
            this.closeArea.bringToFront();
            MraidAdView.this.prepareCloseButton();
        }

        public void removeAllViews() {
            int childCount = this.container.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.container.getChildAt(i);
                if (childAt != this.closeArea) {
                    this.container.removeView(childAt);
                }
            }
        }

        public void removeView(View view) {
            this.container.removeView(view);
        }

        void setCloseImage(Drawable drawable) {
            this.closeArea.setBackgroundDrawable(drawable);
        }

        @Override // android.app.Dialog
        public void show() {
            super.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class LocationListener implements android.location.LocationListener {
        private LocationListener() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            MraidAdView mraidAdView = MraidAdView.this;
            mraidAdView.logEvent("LocationListener.onLocationChanged location:" + location.toString(), LogLevel.Debug);
            MraidAdView.this.mraidBridge.setLocation(location.getLatitude(), location.getLongitude(), 1, "meters", 2, "");
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            MraidAdView mraidAdView = MraidAdView.this;
            mraidAdView.logEvent("LocationListener.onProviderDisabled provider:" + str, LogLevel.Debug);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            MraidAdView mraidAdView = MraidAdView.this;
            mraidAdView.logEvent("LocationListener.onProviderEnabled provider:" + str, LogLevel.Debug);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            MraidAdView mraidAdView = MraidAdView.this;
            mraidAdView.logEvent("LocationListener.onStatusChanged provider:" + str + " status:" + String.valueOf(i), LogLevel.Debug);
        }
    }

    /* loaded from: classes6.dex */
    public enum LogLevel {
        None,
        Error,
        Debug
    }

    /* loaded from: classes6.dex */
    class OrientationBroadcastReceiver extends BroadcastReceiver {
        @Nullable
        private Context mContext;
        private int mLastRotation = -1;

        OrientationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int displayRotation;
            if (this.mContext == null) {
                return;
            }
            if (!MraidAdView.this.isResumed) {
                Log.e(MraidAdView.TAG, "onReceive: activity not resume ");
            } else if ("android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (displayRotation = MraidAdView.this.getDisplayRotation()) != this.mLastRotation) {
                this.mLastRotation = displayRotation;
                MraidAdView mraidAdView = MraidAdView.this;
                if (mraidAdView.mraidBridge != null && mraidAdView.webView != null) {
                    MraidAdView mraidAdView2 = MraidAdView.this;
                    Bridge bridge = mraidAdView2.mraidBridge;
                    mraidAdView2.updateMRAIDLayoutForState(bridge, bridge.getState(), false);
                } else if (MraidAdView.this.mraidTwoPartBridge != null && MraidAdView.this.mraidTwoPartWebView != null) {
                    MraidAdView mraidAdView3 = MraidAdView.this;
                    mraidAdView3.updateMRAIDLayoutForState(mraidAdView3.mraidTwoPartBridge, MraidAdView.this.mraidTwoPartBridge.getState(), false);
                }
            }
        }

        public void register(@NonNull Context context) {
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            if (applicationContext != null) {
                applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            }
        }

        public void unregister() {
            Context context = this.mContext;
            if (context != null) {
                context.unregisterReceiver(this);
                this.mContext = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class SettingsContentObserver extends ContentObserver {
        Context context;

        public SettingsContentObserver(Context context, Handler handler) {
            super(handler);
            this.context = context;
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            if (audioManager != null) {
                float streamVolume = (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
                Bridge bridge = MraidAdView.this.mraidBridge;
                if (bridge != null) {
                    bridge.setAudioVolume(streamVolume);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    private class WebViewHandler implements WebView.Handler {
        private WebViewHandler() {
        }

        @Override // com.maticoo.sdk.mraid.WebView.Handler
        public void webViewExposureChange(WebView webView, Bridge bridge, boolean z) {
            if (z) {
                MraidAdView mraidAdView = MraidAdView.this;
                Bridge bridge2 = mraidAdView.mraidBridge;
                if (bridge2 != null && bridge2 == bridge) {
                    mraidAdView.updateMRAIDLayoutForState(bridge2, bridge2.getState(), false);
                } else if (mraidAdView.mraidTwoPartBridge != null && MraidAdView.this.mraidTwoPartBridge == bridge) {
                    MraidAdView mraidAdView2 = MraidAdView.this;
                    mraidAdView2.updateMRAIDLayoutForState(mraidAdView2.mraidTwoPartBridge, MraidAdView.this.mraidTwoPartBridge.getState(), false);
                }
            }
        }

        @Override // com.maticoo.sdk.mraid.WebView.Handler
        public void webViewOnClick(WebView webView) {
            MraidAdView.this.callbackAdClick();
        }

        @Override // com.maticoo.sdk.mraid.WebView.Handler
        public void webViewPageFinished(WebView webView) {
            MraidAdView.this.safeState.setLoadFinish(true);
            MraidAdView.this.callbackAdLoad();
            MraidAdView mraidAdView = MraidAdView.this;
            Bridge bridge = mraidAdView.mraidBridge;
            if (bridge != null && webView == bridge.webView) {
                mraidAdView.initMRAIDBridge(bridge);
            } else if (mraidAdView.mraidTwoPartBridge != null && webView == MraidAdView.this.mraidTwoPartBridge.webView) {
                MraidAdView mraidAdView2 = MraidAdView.this;
                mraidAdView2.initMRAIDBridge(mraidAdView2.mraidTwoPartBridge);
            }
        }

        @Override // com.maticoo.sdk.mraid.WebView.Handler
        public void webViewPageStarted(WebView webView) {
            MraidAdView.this.safeState.setLoadFinish(false);
        }

        @Override // com.maticoo.sdk.mraid.WebView.Handler
        public void webViewReceivedError(WebView webView, int i, String str, String str2) {
            String str3 = "Error loading rich media ad content.  Error code:" + String.valueOf(i) + " Description:" + str;
            MraidAdView.this.logEvent(str3, LogLevel.Error);
            MraidAdView.this.callbackAdShowFailed(ErrorBuilder.build(413, str3));
        }

        @Override // com.maticoo.sdk.mraid.WebView.Handler
        public void webViewRenderProcessGone(RenderProcessGoneDetail renderProcessGoneDetail) {
            AdsUtil.callReportRenderGone(MraidAdView.this.mAdsManager, renderProcessGoneDetail);
            MraidAdView.this.callbackAdShowFailed(ErrorBuilder.build(312));
        }

        @Override // com.maticoo.sdk.mraid.WebView.Handler
        public boolean webViewShouldOverrideUrlLoading(WebView webView, String str) {
            if (MraidAdView.this.mraidTwoPartExpand && !LandingManager.isDeepLink(str)) {
                if (MraidAdView.this.mraidTwoPartWebView != null) {
                    MraidAdView.this.mraidTwoPartWebView.loadUrl(str);
                }
                return true;
            }
            try {
                if (MraidAdView.this.webView != null && MraidAdView.this.mAdsManager != null && MraidAdView.this.mAdsManager.getAdBean() != null) {
                    if (!MraidAdView.this.webView.getWebViewClient().handleUrlLoading(webView, str, MraidAdView.this.mAdsManager.getAdBean())) {
                        return true;
                    }
                }
                MraidAdView.this.openUrl(str, false);
            } catch (Exception e) {
                DeveloperLog.LogE("shouldOverrideUrlLoading error: ", e);
                CrashUtil.getSingleton().reportSDKException(e, "AdsActivity_AdWebClient");
            }
            return true;
        }
    }

    public MraidAdView(Context context, AbstractAdsManager abstractAdsManager, boolean z) {
        super(context);
        this.CloseAreaSizeDp = 32;
        this.OrientationReset = -32768;
        this.userAgent = null;
        this.test = false;
        this.updateInterval = 0;
        this.useInternalBrowser = false;
        this.logLevel = LogLevel.Error;
        this.placementType = Consts.PlacementType.Inline;
        this.webView = null;
        this.showCloseButton = false;
        this.closeButtonDelay = 0;
        this.closeButtonCustomDrawable = null;
        this.closeButtonFuture = null;
        this.interstitialDelayFuture = null;
        this.mraidBridge = null;
        this.mraidBridgeInit = false;
        this.mraidBridgeHandler = new MRAIDHandler();
        this.mraidExpandDialog = null;
        this.mraidResizeLayout = null;
        this.mraidResizeCloseArea = null;
        this.mraidTwoPartExpand = false;
        this.mraidTwoPartBridge = null;
        this.mraidTwoPartBridgeInit = false;
        this.mraidTwoPartWebView = null;
        this.mraidOriginalOrientation = -32768;
        this.webViewHandler = new WebViewHandler();
        this.adUpdateIntervalFuture = null;
        this.browserDialog = null;
        this.locationManager = null;
        this.locationListener = null;
        this.safeState = new AdCacheSafeBoolean();
        this.isLoaded = false;
        this.isError = false;
        this.mActivityHandler = null;
        this.webViewFailed = new AtomicBoolean(false);
        this.timeoutRun = new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.1
            @Override // java.lang.Runnable
            public void run() {
                if (MraidAdView.this.webViewFailed.compareAndSet(false, true)) {
                    MraidAdView.this.callbackAdLoadFailed(ErrorBuilder.build(410));
                }
            }
        };
        this.mAdsManager = abstractAdsManager;
        setContext(context);
        init(z);
    }

    private void addContentView(WebView webView, ViewGroup.LayoutParams layoutParams) {
        int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType[this.placementType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                createInterstitialLayout(webView);
            }
        } else if (webView.getParent() != this) {
            if (webView.getParent() != null) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            webView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.maticoo.sdk.mraid.MraidAdView.5
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    MraidAdView mraidAdView = MraidAdView.this;
                    Bridge bridge = mraidAdView.mraidBridge;
                    if (bridge != null) {
                        mraidAdView.updateMRAIDLayoutForState(bridge, bridge.getState(), false);
                    }
                }
            });
            addView(webView, layoutParams);
        }
    }

    private void closeInternalBrowser() {
        BrowserDialog browserDialog = this.browserDialog;
        if (browserDialog != null && browserDialog.isShowing()) {
            this.browserDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity getActivity() {
        Activity activity = this.currentActivity;
        if (activity != null) {
            return activity;
        }
        Context context = this.context;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        int i = 0;
        while (i < 30 && (parent instanceof View)) {
            View view = (View) parent;
            if (view.getContext() instanceof Activity) {
                Activity activity2 = (Activity) view.getContext();
                this.currentActivity = activity2;
                return activity2;
            }
            parent = view.getParent();
            i++;
            if (!(parent instanceof View)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDisplayRotation() {
        return ((WindowManager) getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getOrientation() {
        if (getResources().getConfiguration().orientation == 1) {
            return "portrait";
        }
        return "landscape";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getOrientationLocked() {
        if (Settings.System.getInt(this.context.getContentResolver(), "accelerometer_rotation", 0) != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMRAIDBridge(Bridge bridge) {
        if (bridge == null) {
            return;
        }
        synchronized (bridge) {
            if (bridge == this.mraidBridge && !this.mraidBridgeInit) {
                return;
            }
            if (bridge == this.mraidTwoPartBridge && !this.mraidTwoPartBridgeInit) {
                return;
            }
            if (!bridge.webView.isLoaded()) {
                return;
            }
            if (bridge.getState() != Consts.State.Loading) {
                return;
            }
            bridge.setPlacementType(this.placementType);
            bridge.setEnv(getZone());
            setMRAIDSupportedFeatures(bridge);
            if (bridge == this.mraidBridge) {
                int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType[this.placementType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        updateMRAIDLayoutForState(bridge, Consts.State.Expanded, false);
                    }
                } else {
                    updateMRAIDLayoutForState(bridge, Consts.State.Default, false);
                }
                bridge.setState(Consts.State.Default);
            } else {
                updateMRAIDLayoutForState(bridge, Consts.State.Expanded, true);
            }
            bridge.sendReady();
            callbackAdLoad();
        }
    }

    private void initUserAgent() {
        if (TextUtils.isEmpty(this.userAgent)) {
            String userAgentString = getWebView().getSettings().getUserAgentString();
            this.userAgent = userAgentString;
            if (TextUtils.isEmpty(userAgentString)) {
                this.userAgent = Defaults.USER_AGENT;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void interstitialMraidClose() {
        if (this.mraidBridge != null && C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType[this.placementType.ordinal()] == 2) {
            this.mraidBridge.setState(Consts.State.Hidden);
            this.mraidBridgeHandler.mraidClose(this.mraidBridge);
            unregisterVolumeChangeReceiver();
        }
        resetMRAIDOrientation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logEvent(String str, LogLevel logLevel) {
        if (logLevel.ordinal() > this.logLevel.ordinal()) {
            return;
        }
        MraidAdViewDelegate.LogListener logListener = this.logListener;
        if (logListener != null && logListener.onLogEvent(this, str, logLevel)) {
            return;
        }
        int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$MraidAdView$LogLevel[logLevel.ordinal()];
        if (i != 2) {
            if (i == 3) {
                Log.e(TAG, "eventLevel: " + logLevel.name() + ", msg: " + str);
                return;
            }
            return;
        }
        Log.d(TAG, "eventLevel: " + logLevel.name() + ", msg: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInternalBrowser(String str) {
        Activity activity = getActivity();
        if (activity == null) {
            callbackAdShowFailed(ErrorBuilder.build(413, "current activity is null"));
            return;
        }
        BrowserDialog browserDialog = this.browserDialog;
        if (browserDialog == null) {
            this.browserDialog = new BrowserDialog(activity, str, new BrowserDialog.Handler() { // from class: com.maticoo.sdk.mraid.MraidAdView.7
                @Override // com.maticoo.sdk.mraid.BrowserDialog.Handler
                public void browserDialogDismissed(BrowserDialog browserDialog2) {
                    if (MraidAdView.this.internalBrowserListener != null) {
                        MraidAdView.this.internalBrowserListener.onInternalBrowserDismissed(MraidAdView.this);
                    }
                }

                @Override // com.maticoo.sdk.mraid.BrowserDialog.Handler
                public void browserDialogOpenUrl(BrowserDialog browserDialog2, String str2) {
                    MraidAdView.this.openUrl(str2, true);
                    browserDialog2.dismiss();
                }
            });
        } else {
            browserDialog.loadUrl(str);
        }
        if (!this.browserDialog.isShowing()) {
            this.browserDialog.show();
        }
        MraidAdViewDelegate.InternalBrowserListener internalBrowserListener = this.internalBrowserListener;
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserPresented(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openUrl(final String str, final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.6
            @Override // java.lang.Runnable
            public void run() {
                if (!z && MraidAdView.this.useInternalBrowser) {
                    MraidAdView.this.openInternalBrowser(str);
                    return;
                }
                try {
                    GpUtil.openDeepLink(MraidAdView.this.context, str);
                } catch (Throwable th) {
                    Log.e(MraidAdView.TAG, "openBrowser failed::" + th.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepareCloseButton() {
        ExpandDialog expandDialog = this.mraidExpandDialog;
        if (expandDialog != null) {
            expandDialog.setCloseImage(null);
        }
        ScheduledFuture<?> scheduledFuture = this.closeButtonFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.closeButtonFuture = null;
        }
        Bridge bridge = this.mraidBridge;
        if (bridge != null) {
            int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[bridge.getState().ordinal()];
            if (i != 3) {
                if (i == 4 || i == 5) {
                    if (!this.mraidBridge.getExpandProperties().useCustomClose()) {
                        showCloseButton();
                        return;
                    }
                    return;
                }
            } else if (isInterstitial()) {
                if (!this.mraidBridge.getExpandProperties().useCustomClose()) {
                    showCloseButton();
                    return;
                }
                return;
            }
        }
        int i2 = this.closeButtonDelay;
        if (i2 < 0) {
            return;
        }
        if (i2 == 0) {
            showCloseButton();
        } else {
            this.closeButtonFuture = Background.getExecutor().schedule(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.8
                @Override // java.lang.Runnable
                public void run() {
                    MraidAdView.this.showCloseButton();
                }
            }, this.closeButtonDelay, TimeUnit.SECONDS);
        }
    }

    private void registerVolumeChangeReceiver() {
        if (getContext() != null && getContext().getApplicationContext() != null) {
            this.mSettingsContentObserver = new SettingsContentObserver(getContext(), new Handler());
            getContext().getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.mSettingsContentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTwoPartExpand(String str) {
        Activity activity = getActivity();
        if (activity == null) {
            callbackAdShowFailed(ErrorBuilder.build(413, "current activity is null"));
            return;
        }
        this.mraidTwoPartExpand = true;
        WebView webView = new WebView(getContext());
        this.mraidTwoPartWebView = webView;
        webView.setHandler(this.webViewHandler);
        this.mraidTwoPartBridgeInit = false;
        Bridge bridge = new Bridge(this.mraidTwoPartWebView, this.mraidBridgeHandler);
        this.mraidTwoPartBridge = bridge;
        this.mraidTwoPartWebView.loadUrl(str, bridge);
        ExpandDialog expandDialog = new ExpandDialog(activity);
        this.mraidExpandDialog = expandDialog;
        expandDialog.addView(this.mraidTwoPartWebView);
        this.mraidExpandDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public void resetMRAIDOrientation() {
        int i;
        Activity activity = getActivity();
        if (activity != null && (i = this.mraidOriginalOrientation) != -32768) {
            activity.setRequestedOrientation(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetRichMediaAd() {
        Bridge bridge = this.mraidBridge;
        if (bridge != null) {
            this.mraidBridgeHandler.mraidClose(bridge);
            ExpandDialog expandDialog = this.mraidExpandDialog;
            if (expandDialog != null) {
                expandDialog.dismiss();
                this.mraidExpandDialog = null;
            }
            RelativeLayout relativeLayout = this.mraidResizeLayout;
            if (relativeLayout != null) {
                ViewGroup viewGroup = (ViewGroup) relativeLayout.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.mraidResizeLayout);
                }
                this.mraidResizeLayout = null;
                this.mraidResizeCloseArea = null;
            }
            this.mraidBridge = null;
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.clearView();
            this.webView.clearHistory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public void setMRAIDOrientation(Bridge bridge) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (this.mraidOriginalOrientation == -32768) {
            this.mraidOriginalOrientation = activity.getRequestedOrientation();
        }
        OrientationProperties orientationProperties = bridge.getOrientationProperties();
        Consts.ForceOrientation forceOrientation = orientationProperties.getForceOrientation();
        if (!orientationProperties.getAllowOrientationChange()) {
            int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation[forceOrientation.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    activity.setRequestedOrientation(0);
                }
            } else {
                activity.setRequestedOrientation(1);
            }
        }
        if (orientationProperties.getAllowOrientationChange()) {
            activity.setRequestedOrientation(4);
        } else if (forceOrientation == Consts.ForceOrientation.None) {
            int i2 = activity.getResources().getConfiguration().orientation;
            if (i2 != 1) {
                if (i2 != 2) {
                    activity.setRequestedOrientation(5);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            activity.setRequestedOrientation(1);
        }
    }

    private void setMRAIDSupportedFeatures(Bridge bridge) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (bridge == null) {
            return;
        }
        MraidAdViewDelegate.FeatureSupportHandler featureSupportHandler = this.featureSupportHandler;
        if (featureSupportHandler != null) {
            bool = featureSupportHandler.shouldSupportSMS(this);
            bool2 = this.featureSupportHandler.shouldSupportPhone(this);
            bool3 = this.featureSupportHandler.shouldSupportCalendar(this);
            bool4 = this.featureSupportHandler.shouldSupportStorePicture(this);
            this.featureSupportHandler.shouldSupportVPAID(this);
        } else {
            bool = null;
            bool2 = null;
            bool3 = null;
            bool4 = null;
        }
        if (bool == null) {
            if (getContext().checkCallingOrSelfPermission("android.permission.SEND_SMS") == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            bool = Boolean.valueOf(z4);
        }
        if (bool2 == null) {
            if (getContext().checkCallingOrSelfPermission("android.permission.CALL_PHONE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            bool2 = Boolean.valueOf(z3);
        }
        if (bool3 == null) {
            if (getContext().checkCallingOrSelfPermission("android.permission.WRITE_CALENDAR") == 0 && getContext().checkCallingOrSelfPermission("android.permission.READ_CALENDAR") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool3 = Boolean.valueOf(z2);
        }
        if (bool4 == null) {
            if (getContext().checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                z = true;
            } else {
                z = false;
            }
            bool4 = Boolean.valueOf(z);
        }
        bridge.setSupportedFeature(Consts.Feature.SMS, bool.booleanValue());
        bridge.setSupportedFeature(Consts.Feature.Tel, bool2.booleanValue());
        bridge.setSupportedFeature(Consts.Feature.Calendar, bool3.booleanValue());
        bridge.setSupportedFeature(Consts.Feature.StorePicture, bool4.booleanValue());
        bridge.setSupportedFeature(Consts.Feature.InlineVideo, false);
        bridge.setSupportedFeature(Consts.Feature.VPAID, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCloseButton() {
        View view;
        Drawable drawable = this.closeButtonCustomDrawable;
        if (drawable == null) {
            Drawable drawableFromBase64 = Assets.getDrawableFromBase64(getResources(), Assets.close_button_normal);
            Drawable drawableFromBase642 = Assets.getDrawableFromBase64(getResources(), Assets.close_button_pressed);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{-16842919}, drawableFromBase64);
            stateListDrawable.addState(new int[]{16842919}, drawableFromBase642);
            drawable = stateListDrawable;
        }
        if (this.mraidTwoPartExpand && this.mraidTwoPartBridge != null) {
            this.mraidExpandDialog.setCloseImage(drawable);
        }
        ViewGroup viewGroup = this.interstitialLayout;
        if (viewGroup != null) {
            view = viewGroup.findViewById(ID_CLOSE_AREA);
        } else {
            view = null;
        }
        Bridge bridge = this.mraidBridge;
        if (bridge != null) {
            int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[bridge.getState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                this.mraidExpandDialog.setCloseImage(drawable);
                                return;
                            }
                        } else {
                            this.mraidResizeCloseArea.setBackgroundDrawable(drawable);
                            return;
                        }
                    }
                }
            }
            if (isInterstitial() && view != null) {
                view.setBackgroundDrawable(drawable);
                return;
            }
        }
        if (C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$PlacementType[this.placementType.ordinal()] == 2 && view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }

    private void unregisterVolumeChangeReceiver() {
        if (getContext() != null && getContext().getApplicationContext() != null && this.mSettingsContentObserver != null) {
            getContext().getApplicationContext().getContentResolver().unregisterContentObserver(this.mSettingsContentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMRAIDLayoutForState(Bridge bridge, Consts.State state, boolean z) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (bridge == null) {
            Log.e(TAG, "Bridge is null");
            return;
        }
        WebView webView = this.webView;
        if (webView == null) {
            Log.e(TAG, "WebView is null");
            return;
        }
        if (bridge == this.mraidTwoPartBridge) {
            webView = this.mraidTwoPartWebView;
        }
        boolean isShown = webView.isShown();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int pxToDp = Utils.pxToDp(getWidth());
        int pxToDp2 = Utils.pxToDp(getHeight());
        int pxToDp3 = Utils.pxToDp(webView.getWidth());
        int pxToDp4 = Utils.pxToDp(webView.getHeight());
        getLocationOnScreen(new int[2]);
        int pxToDp5 = Utils.pxToDp(iArr[0]);
        int pxToDp6 = Utils.pxToDp(iArr[1]);
        int[] iArr2 = new int[2];
        if (state == Consts.State.Resized && this.mraidResizeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) webView.getLayoutParams();
            iArr2[0] = layoutParams.leftMargin;
            iArr2[1] = layoutParams.topMargin;
        } else {
            webView.getLocationOnScreen(iArr2);
        }
        int pxToDp7 = Utils.pxToDp(iArr2[0]);
        int pxToDp8 = Utils.pxToDp(iArr2[1]);
        int pxToDp9 = Utils.pxToDp(DisplayUtils.getScreenWidth());
        int pxToDp10 = Utils.pxToDp(DisplayUtils.getScreenHeight());
        int pxToDp11 = Utils.pxToDp(displayMetrics.widthPixels);
        int pxToDp12 = Utils.pxToDp(displayMetrics.heightPixels);
        int i12 = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[state.ordinal()];
        if (i12 != 3) {
            if (i12 != 5) {
                i = pxToDp4;
                i2 = pxToDp8;
                i3 = pxToDp7;
            } else {
                pxToDp3 = pxToDp11;
                i = pxToDp12;
                i2 = 0;
                i3 = 0;
            }
        } else {
            pxToDp3 = pxToDp;
            i = pxToDp2;
            i2 = pxToDp6;
            i3 = pxToDp5;
        }
        if (isInterstitial()) {
            i8 = pxToDp10;
            pxToDp2 = i8;
            i7 = pxToDp2;
            pxToDp = pxToDp9;
            i5 = pxToDp;
            pxToDp11 = i5;
            i4 = 0;
            i6 = 0;
        } else {
            i4 = pxToDp6;
            i5 = pxToDp3;
            i6 = pxToDp5;
            i7 = i;
            i8 = pxToDp12;
        }
        bridge.setScreenSize(pxToDp9, pxToDp10);
        bridge.setMaxSize(pxToDp11, i8);
        bridge.setDefaultPosition(i6, i4, pxToDp, pxToDp2);
        if (z) {
            if (state == Consts.State.Expanded) {
                ExpandProperties expandProperties = bridge.getExpandProperties();
                if (expandProperties.getHeight() <= 0 || expandProperties.getWidth() <= 0) {
                    expandProperties.setWidth(i5);
                    expandProperties.setHeight(i7);
                }
                bridge.setExpandProperties(expandProperties);
                AbstractAdsManager abstractAdsManager = this.mAdsManager;
                if (abstractAdsManager != null) {
                    abstractAdsManager.setExpandStatus(true);
                }
            } else {
                AbstractAdsManager abstractAdsManager2 = this.mAdsManager;
                if (abstractAdsManager2 != null) {
                    i10 = 0;
                    abstractAdsManager2.setExpandStatus(false);
                    i9 = i2;
                    bridge.setStateAndCurrentPosition(state, i3, i2, i5, i7);
                }
            }
            i10 = 0;
            i9 = i2;
            bridge.setStateAndCurrentPosition(state, i3, i2, i5, i7);
        } else {
            i9 = i2;
            i10 = 0;
            bridge.setCurrentPosition(i3, i9, i5, i7);
        }
        bridge.setViewable(isShown);
        if (state != Consts.State.Hidden && isShown) {
            i11 = 100;
        } else {
            i11 = i10;
        }
        bridge.setCurrentExposure(i11, i5, i7, i3, i9);
        bridge.setCurrentAppOrientation(getOrientation(), getOrientationLocked());
    }

    protected void callbackAdClick() {
        AbstractAdsManager abstractAdsManager = this.mAdsManager;
        if (abstractAdsManager == null) {
            return;
        }
        abstractAdsManager.onAdsClicked();
    }

    protected void callbackAdLoad() {
        if (this.mAdsManager == null || !isReady() || this.isLoaded) {
            return;
        }
        clearTimeOut();
        this.mAdsManager.onRenderSuccess();
        this.isLoaded = true;
    }

    protected void callbackAdLoadFailed(Error error) {
        this.isError = true;
        AbstractAdsManager abstractAdsManager = this.mAdsManager;
        if (abstractAdsManager == null) {
            return;
        }
        abstractAdsManager.onAdsLoadFailed(error, null);
    }

    protected void callbackAdShow() {
        AbstractAdsManager abstractAdsManager = this.mAdsManager;
        if (abstractAdsManager == null) {
            return;
        }
        abstractAdsManager.onAdsShowed(this);
    }

    protected void callbackAdShowFailed(Error error) {
        removeContent();
        AbstractAdsManager abstractAdsManager = this.mAdsManager;
        if (abstractAdsManager == null) {
            return;
        }
        abstractAdsManager.onAdsShowFailed(error);
        AdView.ActivityHandler activityHandler = this.mActivityHandler;
        if (activityHandler != null) {
            activityHandler.closePage();
        }
    }

    public void clearTimeOut() {
        HandlerUtil.remove(this.timeoutRun);
    }

    public void closeInterstitial() {
        ScheduledFuture<?> scheduledFuture = this.interstitialDelayFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.interstitialDelayFuture = null;
        }
        interstitialMraidClose();
    }

    public void createInterstitialLayout(View view) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        relativeLayout.setBackgroundColor(0);
        relativeLayout.addView(view, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Utils.dpToPx(32), Utils.dpToPx(32));
        layoutParams2.addRule(11);
        layoutParams2.addRule(10);
        layoutParams2.rightMargin = Utils.dpToPx(15);
        layoutParams2.topMargin = Utils.dpToPx(15);
        CountDownTextView countDownTextView = new CountDownTextView(getContext());
        countDownTextView.setId(ID_CLOSE_AREA);
        countDownTextView.setTextSize(16.0f);
        countDownTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        countDownTextView.setGravity(17);
        countDownTextView.setInCircleColor(0);
        countDownTextView.setProgressColor(-12303292);
        countDownTextView.setProgressLineWidth(0);
        countDownTextView.setProgressType(CountDownTextView.ProgressType.COUNT);
        relativeLayout.addView(countDownTextView, layoutParams2);
        countDownTextView.bringToFront();
        this.interstitialLayout = relativeLayout;
        relativeLayout.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC216844(countDownTextView, relativeLayout));
    }

    @SuppressLint({"MissingPermission"})
    public void enableLocationDetection(long j, float f, Criteria criteria, String str) {
        if (str == null && criteria == null) {
            throw new IllegalArgumentException("criteria or provider required");
        }
        LocationManager locationManager = (LocationManager) getContext().getSystemService("location");
        this.locationManager = locationManager;
        if (locationManager != null) {
            if (str == null) {
                try {
                    List<String> providers = locationManager.getProviders(criteria, true);
                    if (providers != null && providers.size() > 0) {
                        str = providers.get(0);
                    }
                } catch (Exception e) {
                    logEvent("Error requesting location updates.  Exception:" + e, LogLevel.Error);
                    this.locationManager.removeUpdates(this.locationListener);
                    this.locationManager = null;
                    this.locationListener = null;
                    return;
                }
            }
            String str2 = str;
            if (str2 != null) {
                this.locationListener = new LocationListener();
                if (getContext().checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1 && getContext().checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == -1) {
                    this.locationManager.requestLocationUpdates(str2, j, f, this.locationListener);
                }
            }
        }
    }

    @Override // com.maticoo.sdk.core.BaseAdView
    public View getAdView() {
        if (isInterstitial()) {
            return this.interstitialLayout;
        }
        if (this.adContainer == null) {
            AdSize size = AdSize.getSize(this.mAdsManager.getPlacementId());
            this.adContainer = new FrameLayout(this.context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Utils.dpToPx(size.getWidth()), Utils.dpToPx(size.getHeight()));
            layoutParams.gravity = 1;
            this.adContainer.addView(this, layoutParams);
        }
        return this.adContainer;
    }

    public Drawable getCloseButtonCustomDrawable() {
        return this.closeButtonCustomDrawable;
    }

    public int getCloseButtonDelay() {
        return this.closeButtonDelay;
    }

    public MraidAdViewDelegate.FeatureSupportHandler getFeatureSupportHandler() {
        return this.featureSupportHandler;
    }

    public MraidAdViewDelegate.InternalBrowserListener getInternalBrowserListener() {
        return this.internalBrowserListener;
    }

    public ViewGroup getInterstitialLayout() {
        return this.interstitialLayout;
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public MraidAdViewDelegate.LogListener getLogListener() {
        return this.logListener;
    }

    public int getRequestedOrientation() {
        Bridge bridge = this.mraidBridge;
        if (bridge == null) {
            return -1;
        }
        Consts.ForceOrientation forceOrientation = bridge.getOrientationProperties().getForceOrientation();
        if (forceOrientation == Consts.ForceOrientation.Portrait) {
            return 1;
        }
        if (forceOrientation != Consts.ForceOrientation.Landscape) {
            return -1;
        }
        return 0;
    }

    public boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public int getUpdateInterval() {
        return this.updateInterval;
    }

    public boolean getUseInternalBrowser() {
        return this.useInternalBrowser;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public android.webkit.WebView getWebView() {
        if (this.webView == null) {
            WebView webView = new WebView(getContext());
            this.webView = webView;
            webView.setHandler(this.webViewHandler);
        }
        return this.webView;
    }

    public String getZone() {
        return this.zone;
    }

    protected void init(boolean z) {
        this.placementType = Consts.PlacementType.Inline;
        if (z) {
            this.placementType = Consts.PlacementType.Interstitial;
        }
        initUserAgent();
        setLocationDetectionEnabled(true);
        this.mraidBridgeInit = false;
        this.mraidBridge = new Bridge(this.webView, this.mraidBridgeHandler);
    }

    public boolean isInline() {
        if (this.placementType == Consts.PlacementType.Inline) {
            return true;
        }
        return false;
    }

    public boolean isInternalBrowserOpen() {
        BrowserDialog browserDialog = this.browserDialog;
        if (browserDialog != null && browserDialog.isShowing()) {
            return true;
        }
        return false;
    }

    public boolean isInterstitial() {
        if (this.placementType == Consts.PlacementType.Interstitial) {
            return true;
        }
        return false;
    }

    public boolean isLocationDetectionEnabled() {
        if (this.locationManager != null) {
            return true;
        }
        return false;
    }

    @Override // com.maticoo.sdk.core.BaseAdView
    public boolean isReady() {
        Bridge bridge;
        if (this.safeState.isLoadFinish() && (bridge = this.mraidBridge) != null && bridge.getState() == Consts.State.Default) {
            return true;
        }
        return false;
    }

    public boolean isTest() {
        return this.test;
    }

    @Override // com.maticoo.sdk.core.BaseAdView
    public void loadPage() {
        AdBean adBean;
        if (this.isError) {
            return;
        }
        try {
            AbstractAdsManager abstractAdsManager = this.mAdsManager;
            if (abstractAdsManager != null) {
                adBean = abstractAdsManager.getAdBean();
                if (adBean != null) {
                    if (adBean.getBidBean() == null) {
                    }
                    getWebView().stopLoading();
                    addContentView(this.webView, new ViewGroup.LayoutParams(-1, -1));
                    this.webView.loadFragment(adBean.getBidBean().getAdm(), "", this.mraidBridge);
                    HandlerUtil.runOnUiThread(this.timeoutRun, 20000L);
                }
            } else {
                adBean = null;
            }
            callbackAdLoadFailed(ErrorBuilder.build(216));
            getWebView().stopLoading();
            addContentView(this.webView, new ViewGroup.LayoutParams(-1, -1));
            this.webView.loadFragment(adBean.getBidBean().getAdm(), "", this.mraidBridge);
            HandlerUtil.runOnUiThread(this.timeoutRun, 20000L);
        } catch (Throwable th) {
            DeveloperLog.LogE(th.getMessage());
            callbackAdLoadFailed(ErrorBuilder.build(221, th.getMessage()));
            CrashUtil.getSingleton().reportSDKException(th);
        }
    }

    public void onActivityPaused(Activity activity) {
        ViewGroup viewGroup;
        CountDownTextView countDownTextView;
        this.isResumed = false;
        if (getActivity() != null && activity == getActivity()) {
            WebView webView = this.webView;
            if (webView != null) {
                webView.onPause();
            }
            Bridge bridge = this.mraidBridge;
            if (bridge != null) {
                updateMRAIDLayoutForState(bridge, Consts.State.Hidden, false);
            }
            if (isInterstitial() && (viewGroup = this.interstitialLayout) != null && (countDownTextView = (CountDownTextView) viewGroup.findViewById(ID_CLOSE_AREA)) != null) {
                countDownTextView.stop();
            }
            WebView webView2 = this.mraidTwoPartWebView;
            if (webView2 != null) {
                webView2.onPause();
            }
            Bridge bridge2 = this.mraidTwoPartBridge;
            if (bridge2 != null) {
                updateMRAIDLayoutForState(bridge2, Consts.State.Hidden, false);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        ViewGroup viewGroup;
        CountDownTextView countDownTextView;
        this.isResumed = true;
        if (getActivity() != null && activity == getActivity()) {
            WebView webView = this.webView;
            if (webView != null) {
                webView.onResume();
            }
            Bridge bridge = this.mraidBridge;
            if (bridge != null) {
                updateMRAIDLayoutForState(bridge, Consts.State.Default, false);
            }
            if (isInterstitial() && (viewGroup = this.interstitialLayout) != null && (countDownTextView = (CountDownTextView) viewGroup.findViewById(ID_CLOSE_AREA)) != null) {
                countDownTextView.start();
            }
            WebView webView2 = this.mraidTwoPartWebView;
            if (webView2 != null) {
                webView2.onResume();
            }
            Bridge bridge2 = this.mraidTwoPartBridge;
            if (bridge2 != null) {
                updateMRAIDLayoutForState(bridge2, Consts.State.Default, false);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.maticoo.sdk.core.BaseAdView
    public void onDestroy() {
        this.safeState.setOnLoad(false);
        this.safeState.setLoadFinish(false);
        clearTimeOut();
        ViewParent parent = getParent();
        if (getParent() != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (isInterstitial() && this.interstitialLayout != null) {
            interstitialMraidClose();
            int childCount = this.interstitialLayout.getChildCount();
            ViewGroup viewGroup = this.interstitialLayout;
            if (viewGroup != null && childCount > 0) {
                viewGroup.removeAllViews();
                WebView webView = this.webView;
                if (webView != null) {
                    webView.clearView();
                    this.webView.clearHistory();
                }
            }
            this.interstitialLayout = null;
        }
        View adView = getAdView();
        if (adView != null) {
            ViewParent parent2 = adView.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(getAdView());
            }
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.destroy();
            this.webView = null;
        }
        this.currentActivity = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i;
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Bridge bridge = this.mraidBridge;
        if (bridge != null && ((i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[bridge.getState().ordinal()]) == 4 || i == 5)) {
            this.mraidBridgeHandler.mraidClose(this.mraidBridge);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WebView webView = this.webView;
        if (webView != null) {
            if (webView.getParent() == this) {
                this.webView.layout(0, 0, getWidth(), getHeight());
            }
            if (this.mraidBridge != null) {
                if (!z && this.webView.hasFocus()) {
                    return;
                }
                Bridge bridge = this.mraidBridge;
                updateMRAIDLayoutForState(bridge, bridge.getState(), false);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        super.measureChildren(i, i2);
    }

    public void removeContent() {
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.2
            @Override // java.lang.Runnable
            public void run() {
                View adView;
                MraidAdView.this.resetRichMediaAd();
                if (MraidAdView.this.placementType == Consts.PlacementType.Inline && (adView = MraidAdView.this.getAdView()) != null && (adView instanceof ViewGroup)) {
                    ((ViewGroup) adView.getParent()).removeAllViews();
                }
            }
        });
    }

    public void reset() {
        removeContent();
        ScheduledFuture<?> scheduledFuture = this.adUpdateIntervalFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.adUpdateIntervalFuture = null;
        }
        ScheduledFuture<?> scheduledFuture2 = this.interstitialDelayFuture;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.interstitialDelayFuture = null;
        }
        closeInternalBrowser();
        this.browserDialog = null;
        setLocationDetectionEnabled(false);
    }

    protected final void runOnUiThread(final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e) {
                    MraidAdView mraidAdView = MraidAdView.this;
                    mraidAdView.logEvent("Exception during runOnUiThread:" + e, LogLevel.Error);
                }
            }
        });
    }

    public void setActivityHandler(AdView.ActivityHandler activityHandler) {
        this.mActivityHandler = activityHandler;
    }

    public void setCloseButtonCustomDrawable(Drawable drawable) {
        this.closeButtonCustomDrawable = drawable;
    }

    public void setCloseButtonDelay(int i) {
        this.closeButtonDelay = i;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setFeatureSupportHandler(MraidAdViewDelegate.FeatureSupportHandler featureSupportHandler) {
        this.featureSupportHandler = featureSupportHandler;
    }

    public void setInternalBrowserListener(MraidAdViewDelegate.InternalBrowserListener internalBrowserListener) {
        this.internalBrowserListener = internalBrowserListener;
    }

    public void setListener(MraidAdViewDelegate.ActivityListener activityListener) {
        this.interstitialListener = activityListener;
    }

    @SuppressLint({"MissingPermission"})
    public void setLocationDetectionEnabled(boolean z) {
        if (!z) {
            LocationManager locationManager = this.locationManager;
            if (locationManager != null) {
                locationManager.removeUpdates(this.locationListener);
                this.locationManager = null;
                this.locationListener = null;
                return;
            }
            return;
        }
        Criteria criteria = new Criteria();
        criteria.setCostAllowed(false);
        criteria.setPowerRequirement(0);
        criteria.setBearingRequired(false);
        criteria.setSpeedRequired(false);
        criteria.setAltitudeRequired(false);
        criteria.setAccuracy(2);
        enableLocationDetection(30000L, 2.0f, criteria, null);
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogListener(MraidAdViewDelegate.LogListener logListener) {
        this.logListener = logListener;
    }

    public void setShowCloseButton(boolean z) {
        this.showCloseButton = z;
    }

    public void setTest(boolean z) {
        this.test = z;
    }

    public void setUpdateInterval(int i) {
        this.updateInterval = i;
    }

    public void setUseInternalBrowser(boolean z) {
        this.useInternalBrowser = z;
    }

    public void setZone(String str) {
        this.zone = str;
    }

    public void showInterstitial() {
        showInterstitialWithDuration(0);
    }

    public void showInterstitialWithDuration(int i) {
        if (isInterstitial()) {
            ScheduledFuture<?> scheduledFuture = this.interstitialDelayFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.interstitialDelayFuture = null;
            }
            registerVolumeChangeReceiver();
            if (i > 0) {
                this.interstitialDelayFuture = Background.getExecutor().schedule(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MraidAdView.this.closeInterstitial();
                    }
                }, i, TimeUnit.SECONDS);
                return;
            }
            return;
        }
        throw new IllegalStateException("showInterstitialAd requires interstitial instance");
    }

    public int statusBarHeightDp() {
        int identifier;
        View rootView = getRootView();
        if (rootView != null && (identifier = rootView.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return Utils.pxToDp(rootView.getResources().getDimensionPixelSize(identifier));
        }
        return 25;
    }

    /* loaded from: classes6.dex */
    private class MRAIDHandler implements Bridge.Handler {
        private MRAIDHandler() {
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidClose(final Bridge bridge) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge != mraidAdView.mraidBridge && bridge != mraidAdView.mraidTwoPartBridge) {
                return;
            }
            if (MraidAdView.this.isInterstitial()) {
                if (MraidAdView.this.interstitialListener != null) {
                    MraidAdView.this.interstitialListener.onCloseButtonClick(MraidAdView.this);
                }
                MraidAdView.this.resetMRAIDOrientation();
                return;
            }
            int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[bridge.getState().ordinal()];
            if (i != 4) {
                if (i != 5 || MraidAdView.this.mraidExpandDialog == null) {
                    return;
                }
                MraidAdView.this.mraidExpandDialog.dismiss();
                MraidAdView.this.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!MraidAdView.this.mraidTwoPartExpand) {
                            MraidAdView.this.mraidExpandDialog.removeView(MraidAdView.this.webView);
                            MraidAdView mraidAdView2 = MraidAdView.this;
                            mraidAdView2.addView(mraidAdView2.webView);
                        } else {
                            MraidAdView.this.mraidExpandDialog.removeView(MraidAdView.this.mraidTwoPartWebView);
                            MraidAdView.this.mraidTwoPartWebView = null;
                            MraidAdView.this.mraidTwoPartBridge = null;
                            MraidAdView.this.mraidTwoPartExpand = false;
                        }
                        MraidAdView.this.mraidExpandDialog = null;
                        MraidAdView mraidAdView3 = MraidAdView.this;
                        mraidAdView3.updateMRAIDLayoutForState(mraidAdView3.mraidBridge, Consts.State.Default, true);
                        MraidAdView.this.resetMRAIDOrientation();
                    }
                });
                return;
            }
            MraidAdView.this.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MraidAdView.this.mraidResizeLayout == null) {
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) MraidAdView.this.webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(MraidAdView.this.webView);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) MraidAdView.this.mraidResizeLayout.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(MraidAdView.this.mraidResizeLayout);
                    }
                    MraidAdView.this.mraidResizeLayout = null;
                    MraidAdView.this.mraidResizeCloseArea = null;
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    MraidAdView mraidAdView2 = MraidAdView.this;
                    mraidAdView2.addView(mraidAdView2.webView, layoutParams);
                    MraidAdView.this.updateMRAIDLayoutForState(bridge, Consts.State.Default, true);
                }
            });
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidExpand(final Bridge bridge, final String str) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge != mraidAdView.mraidBridge && bridge != mraidAdView.mraidTwoPartBridge) {
                return;
            }
            if (MraidAdView.this.mraidTwoPartBridge == null && MraidAdView.this.mraidTwoPartWebView == null) {
                if (MraidAdView.this.isInterstitial()) {
                    bridge.sendErrorMessage("Can not expand with placementType interstitial.", "expand");
                    return;
                }
                boolean z = !TextUtils.isEmpty(str);
                int i = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[bridge.getState().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 5) {
                            bridge.sendErrorMessage("Can not expand while state is expanded.", "expand");
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!MraidAdView.this.mraidTwoPartExpand || z) {
                    bridge.sendErrorMessage("Can not expand while state is loading.", "expand");
                    return;
                }
                if (!z) {
                    MraidAdView.this.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.4
                        @Override // java.lang.Runnable
                        public void run() {
                            MraidAdView.this.setMRAIDOrientation(bridge);
                            ViewGroup viewGroup = (ViewGroup) MraidAdView.this.webView.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(MraidAdView.this.webView);
                            }
                            if (MraidAdView.this.mraidResizeLayout != null) {
                                ViewGroup viewGroup2 = (ViewGroup) MraidAdView.this.mraidResizeLayout.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(MraidAdView.this.mraidResizeLayout);
                                }
                                MraidAdView.this.mraidResizeLayout = null;
                                MraidAdView.this.mraidResizeCloseArea = null;
                            }
                            Activity activity = MraidAdView.this.getActivity();
                            if (activity == null) {
                                MraidAdView.this.callbackAdShowFailed(ErrorBuilder.build(413, "current activity is null"));
                                return;
                            }
                            MraidAdView.this.mraidExpandDialog = new ExpandDialog(activity);
                            MraidAdView.this.mraidExpandDialog.addView(MraidAdView.this.webView);
                            MraidAdView.this.mraidExpandDialog.show();
                        }
                    });
                    return;
                } else {
                    MraidAdView.this.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.5
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bridge.getState() == Consts.State.Resized) {
                                ViewGroup viewGroup = (ViewGroup) MraidAdView.this.webView.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(MraidAdView.this.webView);
                                }
                                if (MraidAdView.this.mraidResizeLayout != null) {
                                    ViewGroup viewGroup2 = (ViewGroup) MraidAdView.this.mraidResizeLayout.getParent();
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(MraidAdView.this.mraidResizeLayout);
                                    }
                                    MraidAdView.this.mraidResizeLayout = null;
                                    MraidAdView.this.mraidResizeCloseArea = null;
                                }
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                MraidAdView mraidAdView2 = MraidAdView.this;
                                mraidAdView2.addView(mraidAdView2.webView, layoutParams);
                                MraidAdView.this.updateMRAIDLayoutForState(bridge, Consts.State.Default, true);
                            }
                            MraidAdView.this.setMRAIDOrientation(bridge);
                            MraidAdView.this.renderTwoPartExpand(str);
                        }
                    });
                    return;
                }
            }
            bridge.sendErrorMessage("Cannot expand two webviews", "expand");
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidInit(Bridge bridge) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge != mraidAdView.mraidBridge && bridge != mraidAdView.mraidTwoPartBridge) {
                return;
            }
            MraidAdView mraidAdView2 = MraidAdView.this;
            if (bridge == mraidAdView2.mraidBridge) {
                mraidAdView2.mraidBridgeInit = true;
            } else {
                mraidAdView2.mraidTwoPartBridgeInit = true;
            }
            MraidAdView.this.initMRAIDBridge(bridge);
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidOpen(Bridge bridge, String str) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge == mraidAdView.mraidBridge || bridge == mraidAdView.mraidTwoPartBridge) {
                MraidAdView.this.openUrl(str, false);
            }
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidPlayVideo(Bridge bridge, String str) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge == mraidAdView.mraidBridge || bridge == mraidAdView.mraidTwoPartBridge) {
                MraidAdView.this.openUrl(str, true);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidResize(final Bridge bridge) {
            ViewGroup viewGroup;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge != mraidAdView.mraidBridge && bridge != mraidAdView.mraidTwoPartBridge) {
                return;
            }
            if (MraidAdView.this.isInterstitial()) {
                bridge.sendErrorMessage("Can not resize with placementType interstitial.", "resize");
                return;
            }
            int i7 = C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[bridge.getState().ordinal()];
            if (i7 != 1 && i7 != 2 && i7 != 5) {
                Activity activity = MraidAdView.this.getActivity();
                if (activity == null) {
                    bridge.sendErrorMessage("Can not resize loading, current activity is nul.", "resize");
                    return;
                }
                ViewGroup viewGroup2 = (ViewGroup) activity.getWindow().getDecorView();
                int pxToDp = Utils.pxToDp(viewGroup2.getWidth());
                int pxToDp2 = Utils.pxToDp(viewGroup2.getHeight() - DisplayUtils.getNavBarHeight(activity));
                int[] iArr = new int[2];
                if (bridge.getState() == Consts.State.Resized) {
                    MraidAdView.this.webView.getLocationOnScreen(iArr);
                } else {
                    MraidAdView.this.getLocationOnScreen(iArr);
                }
                int pxToDp3 = Utils.pxToDp(iArr[0]);
                int pxToDp4 = Utils.pxToDp(iArr[1]);
                ResizeProperties resizeProperties = bridge.getResizeProperties();
                boolean allowOffscreen = resizeProperties.getAllowOffscreen();
                int offsetX = pxToDp3 + resizeProperties.getOffsetX();
                int offsetY = pxToDp4 + resizeProperties.getOffsetY();
                int width = resizeProperties.getWidth();
                int height = resizeProperties.getHeight();
                Consts.CustomClosePosition customClosePosition = resizeProperties.getCustomClosePosition();
                if (width >= pxToDp && height >= pxToDp2) {
                    bridge.sendErrorMessage("Size must be smaller than the max size.", "resize");
                    return;
                } else if (width >= 32 && height >= 32) {
                    int statusBarHeightDp = MraidAdView.this.statusBarHeightDp();
                    if (!allowOffscreen) {
                        if (width > pxToDp) {
                            width = pxToDp;
                        }
                        if (height > pxToDp2) {
                            height = pxToDp2;
                        }
                        if (offsetX < 0) {
                            i3 = 0;
                        } else {
                            if (offsetX + width > pxToDp) {
                                i3 = (int) (offsetX - (i2 - pxToDp));
                            } else {
                                i3 = offsetX;
                            }
                        }
                        if (offsetY < statusBarHeightDp) {
                            i5 = offsetX;
                            i6 = statusBarHeightDp;
                        } else {
                            if (offsetY + height > pxToDp2) {
                                i5 = offsetX;
                                i6 = (int) (offsetY - (i4 - pxToDp2));
                            } else {
                                i5 = offsetX;
                                i6 = offsetY;
                            }
                        }
                        double d = offsetY - i6;
                        int i8 = i5;
                        viewGroup = viewGroup2;
                        offsetX = (int) (i8 - (i5 - i3));
                        offsetY = (int) (offsetY - d);
                    } else {
                        viewGroup = viewGroup2;
                    }
                    int i9 = width - 32;
                    switch (C2168110.$SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[customClosePosition.ordinal()]) {
                        case 2:
                            i9 = (width / 2) - 16;
                            i = 0;
                            break;
                        case 3:
                            i = 0;
                            i9 = 0;
                            break;
                        case 4:
                            i = height - 32;
                            i9 = 0;
                            break;
                        case 5:
                            i9 = (width / 2) - 16;
                            i = height - 32;
                            break;
                        case 6:
                            i = height - 32;
                            break;
                        case 7:
                            i9 = (width / 2) - 16;
                            i = (height / 2) - 16;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    int i10 = i9 + offsetX;
                    int i11 = i + offsetY;
                    int i12 = i10 + 32;
                    int i13 = i11 + 32;
                    if (i10 >= 0 && i11 >= statusBarHeightDp && i12 <= pxToDp && i13 <= pxToDp2) {
                        final int dpToPx = Utils.dpToPx(offsetX);
                        final int dpToPx2 = Utils.dpToPx(offsetY);
                        final int dpToPx3 = Utils.dpToPx(width);
                        final int dpToPx4 = Utils.dpToPx(height);
                        final int dpToPx5 = Utils.dpToPx(i10);
                        final int dpToPx6 = Utils.dpToPx(i11);
                        final ViewGroup viewGroup3 = viewGroup;
                        MraidAdView.this.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.7
                            @Override // java.lang.Runnable
                            public void run() {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPx3, dpToPx4);
                                layoutParams.setMargins(dpToPx, dpToPx2, 0, 0);
                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Utils.dpToPx(32), Utils.dpToPx(32));
                                layoutParams2.setMargins(dpToPx5, dpToPx6, 0, 0);
                                if (MraidAdView.this.mraidResizeLayout == null) {
                                    ViewGroup viewGroup4 = (ViewGroup) MraidAdView.this.webView.getParent();
                                    if (viewGroup4 != null) {
                                        viewGroup4.removeView(MraidAdView.this.webView);
                                    }
                                    MraidAdView.this.mraidResizeCloseArea = new View(MraidAdView.this.getContext());
                                    MraidAdView.this.mraidResizeCloseArea.setBackgroundColor(0);
                                    MraidAdView.this.mraidResizeCloseArea.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.7.1
                                        @Override // android.view.View.OnClickListener
                                        public void onClick(View view) {
                                            if (view != MraidAdView.this.mraidResizeCloseArea) {
                                                return;
                                            }
                                            RunnableC217007 runnableC217007 = RunnableC217007.this;
                                            MraidAdView.this.mraidBridgeHandler.mraidClose(bridge);
                                        }
                                    });
                                    MraidAdView.this.mraidResizeLayout = new RelativeLayout(MraidAdView.this.getContext());
                                    MraidAdView.this.mraidResizeLayout.addView(MraidAdView.this.webView, layoutParams);
                                    MraidAdView.this.mraidResizeLayout.addView(MraidAdView.this.mraidResizeCloseArea, layoutParams2);
                                    viewGroup3.addView(MraidAdView.this.mraidResizeLayout, 0, new ViewGroup.LayoutParams(-1, -1));
                                    viewGroup3.bringChildToFront(MraidAdView.this.mraidResizeLayout);
                                } else {
                                    MraidAdView.this.mraidResizeLayout.updateViewLayout(MraidAdView.this.webView, layoutParams);
                                    MraidAdView.this.mraidResizeLayout.updateViewLayout(MraidAdView.this.mraidResizeCloseArea, layoutParams2);
                                }
                                MraidAdView.this.updateMRAIDLayoutForState(bridge, Consts.State.Resized, true);
                                MraidAdView.this.prepareCloseButton();
                            }
                        });
                        return;
                    }
                    bridge.sendErrorMessage("Resize close control must remain on screen.", "resize");
                    return;
                } else {
                    bridge.sendErrorMessage("Size must be at least the minimum close area size.", "resize");
                    return;
                }
            }
            bridge.sendErrorMessage("Can not resize loading, hidden or expanded.", "resize");
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidUnload(Bridge bridge) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge != mraidAdView.mraidBridge && bridge != mraidAdView.mraidTwoPartBridge) {
                return;
            }
            if (MraidAdView.this.isInterstitial()) {
                MraidAdView.this.closeInterstitial();
                MraidAdView.this.resetMRAIDOrientation();
                return;
            }
            MraidAdView.this.removeContent();
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidUpdateCurrentPosition(Bridge bridge) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge == mraidAdView.mraidBridge || bridge == mraidAdView.mraidTwoPartBridge) {
                MraidAdView.this.updateMRAIDLayoutForState(bridge, bridge.getState(), false);
            }
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidUpdatedExpandProperties(Bridge bridge) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge != mraidAdView.mraidBridge && bridge != mraidAdView.mraidTwoPartBridge) {
                return;
            }
            MraidAdView.this.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    MraidAdView.this.prepareCloseButton();
                }
            });
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidUpdatedOrientationProperties(final Bridge bridge) {
            MraidAdView mraidAdView = MraidAdView.this;
            if (bridge != mraidAdView.mraidBridge && bridge != mraidAdView.mraidTwoPartBridge) {
                return;
            }
            if (bridge.getState() == Consts.State.Expanded || MraidAdView.this.isInterstitial()) {
                MraidAdView.this.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.mraid.MraidAdView.MRAIDHandler.6
                    @Override // java.lang.Runnable
                    public void run() {
                        MraidAdView.this.setMRAIDOrientation(bridge);
                        bridge.setCurrentAppOrientation(MraidAdView.this.getOrientation(), MraidAdView.this.getOrientationLocked());
                    }
                });
            }
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidUpdatedResizeProperties(Bridge bridge) {
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidCreateCalendarEvent(Bridge bridge, String str) {
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidSetCloseCounter(Bridge bridge, String str) {
        }

        @Override // com.maticoo.sdk.mraid.Bridge.Handler
        public void mraidStorePicture(Bridge bridge, String str) {
        }
    }
}

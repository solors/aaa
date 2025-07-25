package com.vungle.ads.internal.p623ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.vungle.ads.AdConfig;
import com.vungle.ads.C29113b;
import com.vungle.ads.C29137h;
import com.vungle.ads.C29554p0;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.C29338j;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.p623ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.C29518o;
import com.vungle.ads.internal.util.RingerModeReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: AdActivity.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.ui.AdActivity */
/* loaded from: classes7.dex */
public abstract class AdActivity extends Activity {
    @NotNull
    public static final C29480a Companion = new C29480a(null);
    @NotNull
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    @NotNull
    public static final String REQUEST_KEY_EXTRA = "request";
    @NotNull
    private static final String TAG = "AdActivity";
    @Nullable
    private static AdPayload advertisement;
    @Nullable
    private static BidPayload bidPayload;
    @Nullable
    private static AdEventListener eventListener;
    @Nullable
    private static PresenterDelegate presenterDelegate;
    @Nullable
    private MRAIDAdWidget mraidAdWidget;
    @Nullable
    private MRAIDPresenter mraidPresenter;
    @NotNull
    private String placementRefId = "";
    @NotNull
    private final RingerModeReceiver ringerModeReceiver = new RingerModeReceiver();
    @Nullable
    private UnclosedAd unclosedAd;

    /* compiled from: ServiceLocator.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$b */
    /* loaded from: classes7.dex */
    public static final class C29481b extends Lambda implements Functions<SignalManager> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29481b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.signals.b] */
        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final SignalManager invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(SignalManager.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$c */
    /* loaded from: classes7.dex */
    public static final class C29482c extends Lambda implements Functions<Executors> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29482c(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.executor.a] */
        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final Executors invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(Executors.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$d */
    /* loaded from: classes7.dex */
    public static final class C29483d extends Lambda implements Functions<Platform> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29483d(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.platform.d] */
        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final Platform invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(Platform.class);
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$e */
    /* loaded from: classes7.dex */
    public static final class C29484e extends Lambda implements Functions<OMTracker.C29385b> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29484e(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.d$b, java.lang.Object] */
        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final OMTracker.C29385b invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(OMTracker.C29385b.class);
        }
    }

    /* compiled from: AdActivity.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$f */
    /* loaded from: classes7.dex */
    public static final class C29485f implements MRAIDAdWidget.InterfaceC29492a {
        final /* synthetic */ InterfaceC38501j<SignalManager> $signalManager$delegate;

        C29485f(InterfaceC38501j<SignalManager> interfaceC38501j) {
            this.$signalManager$delegate = interfaceC38501j;
        }

        @Override // com.vungle.ads.internal.p623ui.view.MRAIDAdWidget.InterfaceC29492a
        public void close() {
            UnclosedAd unclosedAd = AdActivity.this.unclosedAd;
            if (unclosedAd != null) {
                AdActivity.m110388onCreate$lambda2(this.$signalManager$delegate).removeUnclosedAd(unclosedAd);
            }
            AdActivity.this.finish();
        }
    }

    /* compiled from: AdActivity.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$g */
    /* loaded from: classes7.dex */
    public static final class C29486g implements MRAIDAdWidget.InterfaceC29495d {
        C29486g() {
        }

        @Override // com.vungle.ads.internal.p623ui.view.MRAIDAdWidget.InterfaceC29495d
        public boolean onTouch(@Nullable MotionEvent motionEvent) {
            MRAIDPresenter mraidPresenter$vungle_ads_release = AdActivity.this.getMraidPresenter$vungle_ads_release();
            if (mraidPresenter$vungle_ads_release != null) {
                mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
                return false;
            }
            return false;
        }
    }

    /* compiled from: AdActivity.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$h */
    /* loaded from: classes7.dex */
    public static final class C29487h implements MRAIDAdWidget.InterfaceC29496e {
        C29487h() {
        }

        @Override // com.vungle.ads.internal.p623ui.view.MRAIDAdWidget.InterfaceC29496e
        public void setOrientation(int i) {
            AdActivity.this.setRequestedOrientation(i);
        }
    }

    private final void hideSystemUi() {
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    private final void onConcurrentPlaybackError(String str) {
        String str2;
        C29554p0 c29554p0 = new C29554p0();
        AdEventListener adEventListener = eventListener;
        if (adEventListener != null) {
            adEventListener.onError(c29554p0, str);
        }
        c29554p0.setPlacementId(this.placementRefId);
        AdPayload adPayload = advertisement;
        String str3 = null;
        if (adPayload != null) {
            str2 = adPayload.getCreativeId();
        } else {
            str2 = null;
        }
        c29554p0.setCreativeId(str2);
        AdPayload adPayload2 = advertisement;
        if (adPayload2 != null) {
            str3 = adPayload2.eventId();
        }
        c29554p0.setEventId(str3);
        c29554p0.logErrorNoReturnValue$vungle_ads_release();
        C29518o.Companion.m37467e(TAG, "onConcurrentPlaybackError: " + c29554p0.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final SignalManager m110388onCreate$lambda2(InterfaceC38501j<SignalManager> interfaceC38501j) {
        return interfaceC38501j.getValue();
    }

    /* renamed from: onCreate$lambda-6  reason: not valid java name */
    private static final Executors m110389onCreate$lambda6(InterfaceC38501j<? extends Executors> interfaceC38501j) {
        return interfaceC38501j.getValue();
    }

    /* renamed from: onCreate$lambda-7  reason: not valid java name */
    private static final Platform m110390onCreate$lambda7(InterfaceC38501j<? extends Platform> interfaceC38501j) {
        return interfaceC38501j.getValue();
    }

    /* renamed from: onCreate$lambda-8  reason: not valid java name */
    private static final OMTracker.C29385b m110391onCreate$lambda8(InterfaceC38501j<OMTracker.C29385b> interfaceC38501j) {
        return interfaceC38501j.getValue();
    }

    @VisibleForTesting(otherwise = 4)
    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    @Nullable
    public final MRAIDAdWidget getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    @Nullable
    public final MRAIDPresenter getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    @NotNull
    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i = newConfig.orientation;
            if (i == 2) {
                C29518o.Companion.m37468d(TAG, "landscape");
            } else if (i == 1) {
                C29518o.Companion.m37468d(TAG, "portrait");
            }
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.onViewConfigurationChanged();
            }
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(TAG, "onConfigurationChanged: " + e.getLocalizedMessage());
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String str;
        InterfaceC38501j m14553b;
        InterfaceC38501j m14553b2;
        InterfaceC38501j m14553b3;
        InterfaceC38501j m14553b4;
        String watermark$vungle_ads_release;
        super.onCreate(bundle);
        boolean z = true;
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        C29480a c29480a = Companion;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String valueOf = String.valueOf(c29480a.getPlacement(intent));
        this.placementRefId = valueOf;
        AdPayload adPayload = advertisement;
        ConfigManager configManager = ConfigManager.INSTANCE;
        C29338j placement = configManager.getPlacement(valueOf);
        if (placement != null && adPayload != null) {
            getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            String str2 = null;
            UnclosedAd unclosedAd = null;
            try {
                MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(this);
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                EnumC38505n enumC38505n = EnumC38505n.f101865b;
                m14553b = LazyJVM.m14553b(enumC38505n, new C29481b(this));
                Intent intent2 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "intent");
                String eventId = c29480a.getEventId(intent2);
                if (eventId != null) {
                    unclosedAd = new UnclosedAd(eventId, (String) null, 2, (DefaultConstructorMarker) null);
                }
                this.unclosedAd = unclosedAd;
                if (unclosedAd != null) {
                    m110388onCreate$lambda2(m14553b).recordUnclosedAd(unclosedAd);
                }
                mRAIDAdWidget.setCloseDelegate(new C29485f(m14553b));
                mRAIDAdWidget.setOnViewTouchListener(new C29486g());
                mRAIDAdWidget.setOrientationDelegate(new C29487h());
                m14553b2 = LazyJVM.m14553b(enumC38505n, new C29482c(this));
                m14553b3 = LazyJVM.m14553b(enumC38505n, new C29483d(this));
                VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement, m110389onCreate$lambda6(m14553b2).getOffloadExecutor(), m110388onCreate$lambda2(m14553b), m110390onCreate$lambda7(m14553b3));
                m14553b4 = LazyJVM.m14553b(enumC38505n, new C29484e(this));
                OMTracker make = m110391onCreate$lambda8(m14553b4).make((configManager.omEnabled() && adPayload.omEnabled()) ? false : false);
                VungleThreadPoolExecutor jobExecutor = m110389onCreate$lambda6(m14553b2).getJobExecutor();
                vungleWebClient.setWebViewObserver(make);
                this.ringerModeReceiver.setWebClient(vungleWebClient);
                MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement, vungleWebClient, jobExecutor, make, bidPayload, m110390onCreate$lambda7(m14553b3));
                mRAIDPresenter.setEventListener(eventListener);
                mRAIDPresenter.setPresenterDelegate$vungle_ads_release(presenterDelegate);
                mRAIDPresenter.prepare();
                setContentView(mRAIDAdWidget, mRAIDAdWidget.getLayoutParams());
                AdConfig adConfig = adPayload.getAdConfig();
                if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                    WatermarkView watermarkView = new WatermarkView(this, watermark$vungle_ads_release);
                    ((FrameLayout) getWindow().getDecorView().findViewById(16908290)).addView(watermarkView);
                    watermarkView.bringToFront();
                }
                this.mraidAdWidget = mRAIDAdWidget;
                this.mraidPresenter = mRAIDPresenter;
                return;
            } catch (InstantiationException unused) {
                AdEventListener adEventListener = eventListener;
                if (adEventListener != null) {
                    C29113b c29113b = new C29113b();
                    c29113b.setPlacementId$vungle_ads_release(this.placementRefId);
                    AdPayload adPayload2 = advertisement;
                    if (adPayload2 != null) {
                        str = adPayload2.eventId();
                    } else {
                        str = null;
                    }
                    c29113b.setEventId$vungle_ads_release(str);
                    AdPayload adPayload3 = advertisement;
                    if (adPayload3 != null) {
                        str2 = adPayload3.getCreativeId();
                    }
                    c29113b.setCreativeId$vungle_ads_release(str2);
                    adEventListener.onError(c29113b.logError$vungle_ads_release(), this.placementRefId);
                }
                finish();
                return;
            }
        }
        AdEventListener adEventListener2 = eventListener;
        if (adEventListener2 != null) {
            adEventListener2.onError(new C29137h(), this.placementRefId);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach(isChangingConfigurations() | 2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        C29480a c29480a = Companion;
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent()");
        String placement = c29480a.getPlacement(intent2);
        String placement2 = c29480a.getPlacement(intent);
        Intent intent3 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent()");
        String eventId = c29480a.getEventId(intent3);
        String eventId2 = c29480a.getEventId(intent);
        if ((placement != null && placement2 != null && !Intrinsics.m17075f(placement, placement2)) || (eventId != null && eventId2 != null && !Intrinsics.m17075f(eventId, eventId2))) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37468d(TAG, "Tried to play another placement " + placement2 + " while playing " + placement);
            onConcurrentPlaybackError(placement2);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.ringerModeReceiver);
        C29518o.C29519a c29519a = C29518o.Companion;
        c29519a.m37468d(TAG, "unregisterReceiver(): " + this.ringerModeReceiver.hashCode());
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        hideSystemUi();
        registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        C29518o.C29519a c29519a = C29518o.Companion;
        c29519a.m37468d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(@Nullable MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(@Nullable MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    public final void setPlacementRefId$vungle_ads_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i);
        }
    }

    /* compiled from: AdActivity.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.ui.AdActivity$a */
    /* loaded from: classes7.dex */
    public static final class C29480a {
        private C29480a() {
        }

        public /* synthetic */ C29480a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return null;
                }
                return extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return null;
                }
                return extras.getString("request");
            } catch (Exception unused) {
                return null;
            }
        }

        @NotNull
        public final Intent createIntent(@Nullable Context context, @NotNull String placement, @Nullable String str) {
            Intrinsics.checkNotNullParameter(placement, "placement");
            Intent intent = new Intent(context, VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString("request", placement);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, str);
            intent.putExtras(bundle);
            return intent;
        }

        @Nullable
        public final AdPayload getAdvertisement$vungle_ads_release() {
            return AdActivity.advertisement;
        }

        @Nullable
        public final BidPayload getBidPayload$vungle_ads_release() {
            return AdActivity.bidPayload;
        }

        @VisibleForTesting
        @Nullable
        public final AdEventListener getEventListener$vungle_ads_release() {
            return AdActivity.eventListener;
        }

        @Nullable
        public final PresenterDelegate getPresenterDelegate$vungle_ads_release() {
            return AdActivity.presenterDelegate;
        }

        public final void setAdvertisement$vungle_ads_release(@Nullable AdPayload adPayload) {
            AdActivity.advertisement = adPayload;
        }

        public final void setBidPayload$vungle_ads_release(@Nullable BidPayload bidPayload) {
            AdActivity.bidPayload = bidPayload;
        }

        public final void setEventListener$vungle_ads_release(@Nullable AdEventListener adEventListener) {
            AdActivity.eventListener = adEventListener;
        }

        public final void setPresenterDelegate$vungle_ads_release(@Nullable PresenterDelegate presenterDelegate) {
            AdActivity.presenterDelegate = presenterDelegate;
        }

        @VisibleForTesting
        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }
}

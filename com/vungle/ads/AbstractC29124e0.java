package com.vungle.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.ThreadUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: BaseAd.kt */
@Metadata
/* renamed from: com.vungle.ads.e0 */
/* loaded from: classes7.dex */
public abstract class AbstractC29124e0 implements BaseAd {
    @NotNull
    private final AdConfig adConfig;
    @NotNull
    private final InterfaceC38501j adInternal$delegate;
    @Nullable
    private BaseAdListener adListener;
    @NotNull
    private final Context context;
    @Nullable
    private String creativeId;
    @NotNull
    private final C29572v1 displayToClickMetric;
    @Nullable
    private String eventId;
    @NotNull
    private final String placementId;
    @NotNull
    private final C29136g2 presentToDisplayMetric;
    @NotNull
    private final C29136g2 requestToResponseMetric;
    @NotNull
    private final C29136g2 responseToShowMetric;
    @NotNull
    private final C29136g2 showToFailMetric;
    @NotNull
    private final C29136g2 showToPresentMetric;
    @NotNull
    private final InterfaceC38501j signalManager$delegate;
    @Nullable
    private SignaledAd signaledAd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseAd.kt */
    @Metadata
    /* renamed from: com.vungle.ads.e0$a */
    /* loaded from: classes7.dex */
    public static final class C29125a extends Lambda implements Functions<AdInternal> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29125a() {
            super(0);
            AbstractC29124e0.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final AdInternal invoke() {
            AbstractC29124e0 abstractC29124e0 = AbstractC29124e0.this;
            return abstractC29124e0.constructAdInternal$vungle_ads_release(abstractC29124e0.getContext());
        }
    }

    /* compiled from: BaseAd.kt */
    @Metadata
    /* renamed from: com.vungle.ads.e0$b */
    /* loaded from: classes7.dex */
    public static final class C29126b implements AdLoaderCallback {
        final /* synthetic */ String $adMarkup;

        C29126b(String str) {
            AbstractC29124e0.this = r1;
            this.$adMarkup = str;
        }

        @Override // com.vungle.ads.internal.load.AdLoaderCallback
        public void onFailure(@NotNull AbstractC29537l2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            AbstractC29124e0 abstractC29124e0 = AbstractC29124e0.this;
            abstractC29124e0.onLoadFailure$vungle_ads_release(abstractC29124e0, error);
        }

        @Override // com.vungle.ads.internal.load.AdLoaderCallback
        public void onSuccess(@NotNull AdPayload advertisement) {
            Intrinsics.checkNotNullParameter(advertisement, "advertisement");
            AbstractC29124e0.this.onAdLoaded$vungle_ads_release(advertisement);
            AbstractC29124e0 abstractC29124e0 = AbstractC29124e0.this;
            abstractC29124e0.onLoadSuccess$vungle_ads_release(abstractC29124e0, this.$adMarkup);
        }
    }

    /* compiled from: ServiceLocator.kt */
    @Metadata
    /* renamed from: com.vungle.ads.e0$c */
    /* loaded from: classes7.dex */
    public static final class C29127c extends Lambda implements Functions<SignalManager> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29127c(Context context) {
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

    public AbstractC29124e0(@NotNull Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14553b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        m14554a = LazyJVM.m14554a(new C29125a());
        this.adInternal$delegate = m14554a;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m14553b = LazyJVM.m14553b(EnumC38505n.f101865b, new C29127c(context));
        this.signalManager$delegate = m14553b;
        this.requestToResponseMetric = new C29136g2(Sdk$SDKMetric.EnumC29430b.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.responseToShowMetric = new C29136g2(Sdk$SDKMetric.EnumC29430b.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.showToPresentMetric = new C29136g2(Sdk$SDKMetric.EnumC29430b.AD_SHOW_TO_PRESENT_DURATION_MS);
        this.presentToDisplayMetric = new C29136g2(Sdk$SDKMetric.EnumC29430b.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new C29136g2(Sdk$SDKMetric.EnumC29430b.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new C29572v1(Sdk$SDKMetric.EnumC29430b.AD_DISPLAY_TO_CLICK_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.requestToResponseMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.placementId, this.creativeId, this.eventId, (String) null, 16, (Object) null);
        this.responseToShowMetric.markStart();
    }

    /* renamed from: onLoadFailure$lambda-1 */
    public static final void m110291onLoadFailure$lambda1(AbstractC29124e0 this$0, AbstractC29537l2 vungleError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vungleError, "$vungleError");
        BaseAdListener baseAdListener = this$0.adListener;
        if (baseAdListener != null) {
            baseAdListener.onAdFailedToLoad(this$0, vungleError);
        }
    }

    /* renamed from: onLoadSuccess$lambda-0 */
    public static final void m110292onLoadSuccess$lambda0(AbstractC29124e0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseAdListener baseAdListener = this$0.adListener;
        if (baseAdListener != null) {
            baseAdListener.onAdLoaded(this$0);
        }
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public Boolean canPlayAd() {
        boolean z = false;
        if (AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @NotNull
    public abstract AdInternal constructAdInternal$vungle_ads_release(@NotNull Context context);

    @NotNull
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @NotNull
    public final AdInternal getAdInternal$vungle_ads_release() {
        return (AdInternal) this.adInternal$delegate.getValue();
    }

    @Nullable
    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final C29572v1 getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final C29136g2 getPresentToDisplayMetric$vungle_ads_release() {
        return this.presentToDisplayMetric;
    }

    @NotNull
    public final C29136g2 getRequestToResponseMetric$vungle_ads_release() {
        return this.requestToResponseMetric;
    }

    @NotNull
    public final C29136g2 getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    @NotNull
    public final C29136g2 getShowToFailMetric$vungle_ads_release() {
        return this.showToFailMetric;
    }

    @NotNull
    public final C29136g2 getShowToPresentMetric$vungle_ads_release() {
        return this.showToPresentMetric;
    }

    @NotNull
    public final SignalManager getSignalManager$vungle_ads_release() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    @Nullable
    public final SignaledAd getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    @Override // com.vungle.ads.BaseAd
    public void load(@Nullable String str) {
        this.requestToResponseMetric.markStart();
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, new C29126b(str));
    }

    public void onAdLoaded$vungle_ads_release(@NotNull AdPayload advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String eventId = advertisement.eventId();
        this.eventId = eventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd != null) {
            signaledAd.setEventId(eventId);
        }
    }

    public void onLoadFailure$vungle_ads_release(@NotNull AbstractC29124e0 baseAd, @NotNull final AbstractC29537l2 vungleError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(vungleError, "vungleError");
        ThreadUtil.INSTANCE.runOnUiThread(new Runnable() { // from class: com.vungle.ads.c0
            {
                AbstractC29124e0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC29124e0.m110291onLoadFailure$lambda1(AbstractC29124e0.this, vungleError);
            }
        });
        onLoadEnd();
    }

    public void onLoadSuccess$vungle_ads_release(@NotNull AbstractC29124e0 baseAd, @Nullable String str) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        ThreadUtil.INSTANCE.runOnUiThread(new Runnable() { // from class: com.vungle.ads.d0
            {
                AbstractC29124e0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC29124e0.m110292onLoadSuccess$lambda0(AbstractC29124e0.this);
            }
        });
        onLoadEnd();
    }

    public final void setAdListener(@Nullable BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    public final void setSignaledAd$vungle_ads_release(@Nullable SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }
}

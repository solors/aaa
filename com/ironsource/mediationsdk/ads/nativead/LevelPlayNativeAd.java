package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.C20086i9;
import com.ironsource.C20976sl;
import com.ironsource.C21083ul;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C20423p;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {
    @Nullable

    /* renamed from: a */
    private String f51278a;
    @Nullable

    /* renamed from: b */
    private Placement f51279b;
    @Nullable

    /* renamed from: c */
    private LevelPlayNativeAdListener f51280c;
    @Nullable

    /* renamed from: d */
    private C20976sl f51281d;
    @Nullable

    /* renamed from: e */
    private AdapterNativeAdData f51282e;
    @Nullable

    /* renamed from: f */
    private AdapterNativeAdViewBinder f51283f;
    @NotNull

    /* renamed from: g */
    private final AtomicBoolean f51284g;

    @Metadata
    /* loaded from: classes6.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private String f51285a;
        @Nullable

        /* renamed from: b */
        private LevelPlayNativeAdListener f51286b;

        @NotNull
        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        @Nullable
        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f51286b;
        }

        @Nullable
        public final String getMPlacementName$mediationsdk_release() {
            return this.f51285a;
        }

        public final void setMListener$mediationsdk_release(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f51286b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(@Nullable String str) {
            this.f51285a = str;
        }

        @NotNull
        public final Builder withActivity(@Nullable Activity activity) {
            int i;
            ContextProvider.getInstance().updateActivity(activity);
            IronLog ironLog = IronLog.INTERNAL;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("activity is updated to: ");
            if (activity != null) {
                i = activity.hashCode();
            } else {
                i = 0;
            }
            sb2.append(i);
            ironLog.verbose(sb2.toString());
            return this;
        }

        @NotNull
        public final Builder withListener(@NotNull LevelPlayNativeAdListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f51286b = listener;
            return this;
        }

        @NotNull
        public final Builder withPlacementName(@Nullable String str) {
            this.f51285a = str;
            return this;
        }
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f51284g = new AtomicBoolean(false);
        this.f51278a = builder.getMPlacementName$mediationsdk_release();
        this.f51280c = builder.getMListener$mediationsdk_release();
    }

    /* renamed from: a */
    private final void m57075a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f51280c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            C20976sl c20976sl = this.f51281d;
            if (c20976sl != null) {
                c20976sl.m54932M();
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f51282e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f51282e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f51282e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f51282e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    @Nullable
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f51283f;
    }

    @Nullable
    public final UUID getObjectId() {
        C20976sl c20976sl = this.f51281d;
        if (c20976sl != null) {
            return c20976sl.m58235k();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f51282e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        boolean z;
        IronLog.API.info(String.valueOf(this));
        String initError = C20423p.m56615m().m56634e();
        Intrinsics.checkNotNullExpressionValue(initError, "initError");
        if (initError.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LevelPlayNativeAdListener levelPlayNativeAdListener = this.f51280c;
            if (levelPlayNativeAdListener != null) {
                levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): " + initError, IronSourceConstants.NATIVE_AD_UNIT));
                return;
            }
            return;
        }
        IronSourceThreadManager.INSTANCE.getInitHandler().post(new Runnable() { // from class: s3.a
            {
                LevelPlayNativeAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.m57074a(LevelPlayNativeAd.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(@Nullable final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s3.e
            {
                LevelPlayNativeAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.m57072a(LevelPlayNativeAd.this, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(@Nullable final AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s3.b
            {
                LevelPlayNativeAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.m57069b(LevelPlayNativeAd.this, adInfo);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(@Nullable final IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s3.d
            {
                LevelPlayNativeAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.m57071a(LevelPlayNativeAd.this, ironSourceError);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(@Nullable final AdInfo adInfo, @NotNull final AdapterNativeAdData adapterNativeAdData, @NotNull final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: s3.c
            {
                LevelPlayNativeAd.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.m57073a(LevelPlayNativeAd.this, adapterNativeAdData, nativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f51280c = levelPlayNativeAdListener;
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* renamed from: a */
    public static final void m57074a(LevelPlayNativeAd this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m57070b();
        C20976sl c20976sl = this$0.f51281d;
        if (c20976sl != null) {
            c20976sl.m54928a(this$0.f51279b);
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this$0.m57075a();
        }
    }

    /* renamed from: b */
    private final void m57070b() {
        if (this.f51284g.compareAndSet(false, true)) {
            C20976sl m56630f = C20423p.m56615m().m56630f();
            this.f51281d = m56630f;
            if (m56630f != null) {
                m56630f.m54930a(this);
                C21083ul m56612n = C20423p.m56615m().m56612n(this.f51278a);
                Intrinsics.checkNotNullExpressionValue(m56612n, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f51279b = new Placement(m56612n);
            }
        }
    }

    /* renamed from: a */
    public static final void m57073a(LevelPlayNativeAd this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.f51282e = adapterNativeAdData;
        this$0.f51283f = nativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f51280c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* renamed from: b */
    public static final void m57069b(LevelPlayNativeAd this$0, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f51280c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    /* renamed from: a */
    public static final void m57072a(LevelPlayNativeAd this$0, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f51280c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }

    /* renamed from: a */
    public static final void m57071a(LevelPlayNativeAd this$0, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f51280c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }
}

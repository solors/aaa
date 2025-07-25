package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.rl */
/* loaded from: classes6.dex */
public final class C20766rl extends AbstractC19798e2 {
    @NotNull

    /* renamed from: a */
    private final InternalNativeAdListener f52780a;

    public C20766rl(@NotNull InternalNativeAdListener mNativeAdListener) {
        Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.f52780a = mNativeAdListener;
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54669a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f52780a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: d */
    public void mo54662d(@Nullable AdInfo adInfo) {
        this.f52780a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54667a(@Nullable IronSourceError ironSourceError) {
        this.f52780a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54508a(@NotNull Placement placement, @Nullable AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f52780a.onNativeAdClicked(adInfo);
    }
}

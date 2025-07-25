package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ua */
/* loaded from: classes6.dex */
public final class C21068ua extends AbstractC19798e2 {
    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54670a() {
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: b */
    public void mo54664b() {
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: c */
    public void mo54506c(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: d */
    public void mo54662d(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: g */
    public void mo54661g(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54669a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder nativeAdViewBinder, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: b */
    public void mo54663b(@NotNull Placement placement, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54668a(@NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54667a(@Nullable IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54666a(@NotNull IronSourceError error, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54508a(@NotNull Placement placement, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @Override // com.ironsource.AbstractC19798e2
    /* renamed from: a */
    public void mo54665a(boolean z, @NotNull AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}

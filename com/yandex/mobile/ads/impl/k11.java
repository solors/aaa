package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k11 {
    @NotNull

    /* renamed from: a */
    private final h12 f81226a;
    @NotNull

    /* renamed from: b */
    private final n51 f81227b;
    @NotNull

    /* renamed from: c */
    private final iv1 f81228c;

    public /* synthetic */ k11(pq1 pq1Var) {
        this(pq1Var, new h12(), new n51(pq1Var), new iv1(pq1Var));
    }

    @NotNull
    /* renamed from: a */
    public final z41 m32689a(@NotNull Context context, @NotNull l11 nativeAdBlock, @NotNull wg0 imageProvider, @NotNull h21 nativeAdFactoriesProvider, @NotNull u11 nativeAdControllers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        s90 s90Var = new s90();
        y41 y41Var = new y41(this.f81227b.m31660a(context, nativeAdBlock, imageProvider, nativeAdFactoriesProvider, s90Var, nativeAdControllers));
        return new z41(context, y41Var, imageProvider, this.f81228c.m33113a(context, nativeAdBlock, y41Var, nativeAdFactoriesProvider, s90Var), nativeAdControllers);
    }

    public k11(@NotNull pq1 sdkEnvironmentModule, @NotNull h12 trackingDataCreator, @NotNull n51 nativeGenericAdsCreator, @NotNull iv1 sliderAdBinderConfigurationCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(trackingDataCreator, "trackingDataCreator");
        Intrinsics.checkNotNullParameter(nativeGenericAdsCreator, "nativeGenericAdsCreator");
        Intrinsics.checkNotNullParameter(sliderAdBinderConfigurationCreator, "sliderAdBinderConfigurationCreator");
        this.f81226a = trackingDataCreator;
        this.f81227b = nativeGenericAdsCreator;
        this.f81228c = sliderAdBinderConfigurationCreator;
    }

    @NotNull
    /* renamed from: a */
    public final p81 m32688a(@NotNull l11 nativeAdBlock, @NotNull z01 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        h12 h12Var = this.f81226a;
        List<ot1> m26486h = nativeAd.m26486h();
        List<ot1> m31668i = nativeAdBlock.m32373c().m31668i();
        h12Var.getClass();
        ArrayList m33723a = h12.m33723a(m26486h, m31668i);
        h12 h12Var2 = this.f81226a;
        List<String> m26488f = nativeAd.m26488f();
        List<String> m31670g = nativeAdBlock.m32373c().m31670g();
        h12Var2.getClass();
        return new p81(nativeAd.m26492b(), m33723a, h12.m33723a(m26488f, m31670g), nativeAd.m26494a(), nativeAd.m26491c());
    }
}

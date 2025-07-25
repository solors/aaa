package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.C24229q;
import com.moloco.sdk.internal.ortb.model.C24049o;
import com.moloco.sdk.internal.services.InterfaceC24377m;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.publisher.d */
/* loaded from: classes7.dex */
public final class C24095d implements InterfaceC24117g0 {
    @Nullable

    /* renamed from: a */
    public final BannerAdShowListener f62345a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC24117g0 f62346b;

    public C24095d(@Nullable BannerAdShowListener bannerAdShowListener, @NotNull InterfaceC24377m appLifecycleTrackerService, @NotNull InterfaceC25403a customUserEventBuilderService, @NotNull Functions<C24049o> provideSdkEvents, @NotNull Functions<C24213s> provideBUrlData, @NotNull AdFormatType adType) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f62345a = bannerAdShowListener;
        this.f62346b = C24071b.m47062b(bannerAdShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, null, null, adType, 96, null);
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    /* renamed from: a */
    public void mo46949a(@NotNull C24229q internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f62346b.mo46949a(internalError);
    }

    @Nullable
    /* renamed from: b */
    public final BannerAdShowListener m46997b() {
        return this.f62345a;
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62346b.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62346b.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24117g0
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62346b.onAdShowSuccess(molocoAd);
    }
}

package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.y6 */
/* loaded from: classes6.dex */
public final class C21255y6 implements InterfaceC20616p0<BannerAdView> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20169jt f54561a;
    @NotNull

    /* renamed from: b */
    private final BannerAdLoaderListener f54562b;

    public C21255y6(@NotNull InterfaceC20169jt threadManager, @NotNull BannerAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f54561a = threadManager;
        this.f54562b = publisherListener;
    }

    /* renamed from: a */
    public static final void m54031a(C21255y6 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f54562b.onBannerAdLoadFailed(error);
    }

    /* renamed from: b */
    public static /* synthetic */ void m54027b(C21255y6 c21255y6, BannerAdView bannerAdView) {
        m54030a(c21255y6, bannerAdView);
    }

    /* renamed from: c */
    public static /* synthetic */ void m54026c(C21255y6 c21255y6, IronSourceError ironSourceError) {
        m54031a(c21255y6, ironSourceError);
    }

    @Override // com.ironsource.InterfaceC20616p0
    public void onAdLoadFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f54561a.mo54479a(new Runnable() { // from class: com.ironsource.z00
            @Override // java.lang.Runnable
            public final void run() {
                C21255y6.m54026c(C21255y6.this, error);
            }
        });
    }

    /* renamed from: a */
    public static final void m54030a(C21255y6 this$0, BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        this$0.f54562b.onBannerAdLoaded(adObject);
    }

    @Override // com.ironsource.InterfaceC20616p0
    /* renamed from: a */
    public void mo54028a(@NotNull final BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f54561a.mo54479a(new Runnable() { // from class: com.ironsource.a10
            @Override // java.lang.Runnable
            public final void run() {
                C21255y6.m54027b(C21255y6.this, adObject);
            }
        });
    }
}

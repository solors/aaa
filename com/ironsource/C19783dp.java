package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.dp */
/* loaded from: classes6.dex */
public final class C19783dp implements InterfaceC20616p0<RewardedAd> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20169jt f49814a;
    @NotNull

    /* renamed from: b */
    private final RewardedAdLoaderListener f49815b;

    public C19783dp(@NotNull InterfaceC20169jt threadManager, @NotNull RewardedAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f49814a = threadManager;
        this.f49815b = publisherListener;
    }

    /* renamed from: a */
    public static final void m58864a(C19783dp this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f49815b.onRewardedAdLoadFailed(error);
    }

    /* renamed from: b */
    public static /* synthetic */ void m58861b(C19783dp c19783dp, IronSourceError ironSourceError) {
        m58864a(c19783dp, ironSourceError);
    }

    /* renamed from: c */
    public static /* synthetic */ void m58860c(C19783dp c19783dp, RewardedAd rewardedAd) {
        m58863a(c19783dp, rewardedAd);
    }

    @Override // com.ironsource.InterfaceC20616p0
    public void onAdLoadFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f49814a.mo54479a(new Runnable() { // from class: com.ironsource.yv
            @Override // java.lang.Runnable
            public final void run() {
                C19783dp.m58861b(C19783dp.this, error);
            }
        });
    }

    /* renamed from: a */
    public static final void m58863a(C19783dp this$0, RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        this$0.f49815b.onRewardedAdLoaded(adObject);
    }

    @Override // com.ironsource.InterfaceC20616p0
    /* renamed from: a */
    public void mo54028a(@NotNull final RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f49814a.mo54479a(new Runnable() { // from class: com.ironsource.xv
            @Override // java.lang.Runnable
            public final void run() {
                C19783dp.m58860c(C19783dp.this, adObject);
            }
        });
    }
}

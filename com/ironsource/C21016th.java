package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.th */
/* loaded from: classes6.dex */
public final class C21016th implements InterfaceC20616p0<InterstitialAd> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20169jt f53561a;
    @NotNull

    /* renamed from: b */
    private final InterstitialAdLoaderListener f53562b;

    public C21016th(@NotNull InterfaceC20169jt threadManager, @NotNull InterstitialAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f53561a = threadManager;
        this.f53562b = publisherListener;
    }

    /* renamed from: a */
    public static final void m54797a(C21016th this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f53562b.onInterstitialAdLoadFailed(error);
    }

    /* renamed from: b */
    public static /* synthetic */ void m54794b(C21016th c21016th, InterstitialAd interstitialAd) {
        m54796a(c21016th, interstitialAd);
    }

    /* renamed from: c */
    public static /* synthetic */ void m54793c(C21016th c21016th, IronSourceError ironSourceError) {
        m54797a(c21016th, ironSourceError);
    }

    @Override // com.ironsource.InterfaceC20616p0
    public void onAdLoadFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f53561a.mo54479a(new Runnable() { // from class: com.ironsource.d00
            @Override // java.lang.Runnable
            public final void run() {
                C21016th.m54793c(C21016th.this, error);
            }
        });
    }

    /* renamed from: a */
    public static final void m54796a(C21016th this$0, InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        this$0.f53562b.onInterstitialAdLoaded(adObject);
    }

    @Override // com.ironsource.InterfaceC20616p0
    /* renamed from: a */
    public void mo54028a(@NotNull final InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f53561a.mo54479a(new Runnable() { // from class: com.ironsource.e00
            @Override // java.lang.Runnable
            public final void run() {
                C21016th.m54794b(C21016th.this, adObject);
            }
        });
    }
}

package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C20639ph;
import com.ironsource.InterfaceC20695qh;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class InterstitialAd implements InterfaceC20695qh {
    @NotNull

    /* renamed from: a */
    private final C20639ph f74449a;
    @Nullable

    /* renamed from: b */
    private InterstitialAdListener f74450b;

    public InterstitialAd(@NotNull C20639ph interstitialAdInternal) {
        Intrinsics.checkNotNullParameter(interstitialAdInternal, "interstitialAdInternal");
        this.f74449a = interstitialAdInternal;
        interstitialAdInternal.m55816a(this);
    }

    @NotNull
    public final InterstitialAdInfo getAdInfo() {
        return this.f74449a.m55814b();
    }

    @Nullable
    public final InterstitialAdListener getListener() {
        return this.f74450b;
    }

    public final boolean isReadyToShow() {
        return this.f74449a.m55810d();
    }

    @Override // com.ironsource.InterfaceC20695qh
    public void onAdInstanceDidBecomeVisible() {
        InterstitialAdListener interstitialAdListener = this.f74450b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC20695qh
    public void onAdInstanceDidClick() {
        InterstitialAdListener interstitialAdListener = this.f74450b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC20695qh
    public void onAdInstanceDidDismiss() {
        InterstitialAdListener interstitialAdListener = this.f74450b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC20695qh
    public void onAdInstanceDidFailedToShow(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterstitialAdListener interstitialAdListener = this.f74450b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC20695qh
    public void onAdInstanceDidShow() {
        InterstitialAdListener interstitialAdListener = this.f74450b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(@Nullable InterstitialAdListener interstitialAdListener) {
        this.f74450b = interstitialAdListener;
    }

    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f74449a.m55820a(activity);
    }

    @Override // com.ironsource.InterfaceC20695qh
    public void onAdInstanceDidReward(@Nullable String str, int i) {
    }
}

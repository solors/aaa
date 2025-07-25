package sg.bigo.ads.api;

import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.api.d */
/* loaded from: classes10.dex */
public abstract class AbstractC43582d implements AdInteractionListener {
    /* renamed from: a */
    public abstract void mo5363a(@NonNull NativeAd nativeAd);

    /* renamed from: a */
    public abstract void mo5362a(@NonNull NativeAd nativeAd, @NonNull AdError adError);

    /* renamed from: b */
    public abstract void mo5361b(@NonNull NativeAd nativeAd);

    /* renamed from: c */
    public abstract void mo5360c(@NonNull NativeAd nativeAd);

    /* renamed from: d */
    public abstract void mo5359d(@NonNull NativeAd nativeAd);

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdClicked() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdImpression() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdOpened() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdError(@NonNull AdError adError) {
    }
}

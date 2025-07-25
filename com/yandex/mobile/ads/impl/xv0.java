package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class xv0 implements n81 {
    @NotNull

    /* renamed from: a */
    private final n81 f87851a;
    @NotNull

    /* renamed from: b */
    private final MediatedNativeAd f87852b;
    @NotNull

    /* renamed from: c */
    private final wv0 f87853c;

    /* renamed from: d */
    private boolean f87854d;

    public xv0(@NotNull n81 nativeAdViewRenderer, @NotNull MediatedNativeAd mediatedNativeAd, @NotNull wv0 mediatedNativeRenderingTracker) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "nativeAdViewRenderer");
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        Intrinsics.checkNotNullParameter(mediatedNativeRenderingTracker, "mediatedNativeRenderingTracker");
        this.f87851a = nativeAdViewRenderer;
        this.f87852b = mediatedNativeAd;
        this.f87853c = mediatedNativeRenderingTracker;
    }

    @Override // com.yandex.mobile.ads.impl.n81
    /* renamed from: a */
    public final void mo27209a(@NotNull v31 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f87851a.mo27209a(nativeAdViewAdapter);
        f41 m28537g = nativeAdViewAdapter.m28537g();
        View m28539e = nativeAdViewAdapter.m28539e();
        if (m28539e != null) {
            this.f87852b.unbindNativeAd(new tv0(m28539e, m28537g));
        }
    }

    @Override // com.yandex.mobile.ads.impl.n81
    /* renamed from: a */
    public final void mo27208a(@NotNull v31 nativeAdViewAdapter, @NotNull C31758wn clickListenerConfigurator) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(clickListenerConfigurator, "clickListenerConfigurator");
        this.f87851a.mo27208a(nativeAdViewAdapter, clickListenerConfigurator);
        f41 m28537g = nativeAdViewAdapter.m28537g();
        View m28539e = nativeAdViewAdapter.m28539e();
        if (m28539e != null) {
            this.f87852b.bindNativeAd(new tv0(m28539e, m28537g));
        }
        if (nativeAdViewAdapter.m28539e() == null || this.f87854d) {
            return;
        }
        this.f87854d = true;
        this.f87853c.m27738a();
    }

    @Override // com.yandex.mobile.ads.impl.n81
    /* renamed from: a */
    public final void mo27210a() {
        this.f87851a.mo27210a();
    }
}

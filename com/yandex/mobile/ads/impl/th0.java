package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class th0 implements t90, a92, yh0, ly0, tk1 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashSet f85683a = new LinkedHashSet();
    @NotNull

    /* renamed from: b */
    private final LinkedHashSet f85684b = new LinkedHashSet();
    @NotNull

    /* renamed from: c */
    private final LinkedHashSet f85685c = new LinkedHashSet();
    @NotNull

    /* renamed from: d */
    private final LinkedHashSet f85686d = new LinkedHashSet();
    @NotNull

    /* renamed from: e */
    private final LinkedHashSet f85687e = new LinkedHashSet();

    /* renamed from: a */
    public final void m29167a(@NotNull t90 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f85683a.add(forceImpressionTrackingListener);
    }

    /* renamed from: b */
    public final void m29165b(@NotNull uh0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.f85685c.add(impressionTrackingListener);
    }

    /* renamed from: c */
    public final void m29164c(@NotNull uh0 videoImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(videoImpressionTrackingListener, "videoImpressionTrackingListener");
        this.f85684b.add(videoImpressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.a92
    /* renamed from: d */
    public final void mo28779d() {
        for (a92 a92Var : this.f85684b) {
            a92Var.mo28779d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ly0
    /* renamed from: e */
    public final void mo27998e() {
        for (ly0 ly0Var : this.f85687e) {
            ly0Var.mo27998e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.tk1
    /* renamed from: f */
    public final void mo28778f() {
        for (tk1 tk1Var : this.f85685c) {
            tk1Var.mo28778f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yh0
    /* renamed from: g */
    public final void mo26907g() {
        for (yh0 yh0Var : this.f85686d) {
            yh0Var.mo26907g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.a92
    /* renamed from: h */
    public final void mo28777h() {
        for (a92 a92Var : this.f85684b) {
            a92Var.mo28777h();
        }
    }

    /* renamed from: a */
    public final void m29168a(@NotNull ly0 mobileAdsSchemeImpressionListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f85687e.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.ly0
    /* renamed from: b */
    public final void mo27999b() {
        for (ly0 ly0Var : this.f85687e) {
            ly0Var.mo27999b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yh0
    /* renamed from: c */
    public final void mo26908c() {
        for (yh0 yh0Var : this.f85686d) {
            yh0Var.mo26908c();
        }
    }

    /* renamed from: a */
    public final void m29166a(@NotNull uh0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.f85686d.add(impressionTrackingListener);
    }

    @Override // com.yandex.mobile.ads.impl.t90
    /* renamed from: a */
    public final void mo28376a() {
        for (t90 t90Var : this.f85683a) {
            t90Var.mo28376a();
        }
    }
}

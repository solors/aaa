package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class t51 implements ja0 {
    @NotNull

    /* renamed from: a */
    private final uh1 f85515a;
    @NotNull

    /* renamed from: b */
    private final oc1 f85516b;
    @NotNull

    /* renamed from: c */
    private final th1 f85517c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC31326s1 f85518d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC29972ay f85519e;

    /* renamed from: com.yandex.mobile.ads.impl.t51$a */
    /* loaded from: classes8.dex */
    private final class C31426a implements qc1, k02 {
        public C31426a() {
        }

        @Override // com.yandex.mobile.ads.impl.qc1
        /* renamed from: a */
        public final void mo25973a() {
            t51.this.f85515a.mo27865a();
        }

        @Override // com.yandex.mobile.ads.impl.k02
        /* renamed from: a */
        public final void mo28719a(long j, long j2) {
            long m29163a = t51.this.f85517c.m29163a() + (t51.this.f85519e.mo32726a() - j);
            t51.this.f85515a.mo27864a(t51.this.f85518d.mo29886a(), m29163a);
        }
    }

    public t51(@NotNull uh1 progressListener, @NotNull e02 timeProviderContainer, @NotNull oc1 pausableTimer, @NotNull th1 progressIncrementer, @NotNull InterfaceC31326s1 adBlockDurationProvider, @NotNull InterfaceC29972ay defaultContentDelayProvider) {
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f85515a = progressListener;
        this.f85516b = pausableTimer;
        this.f85517c = progressIncrementer;
        this.f85518d = adBlockDurationProvider;
        this.f85519e = defaultContentDelayProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f85516b.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
        this.f85516b.pause();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
        this.f85516b.resume();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        C31426a c31426a = new C31426a();
        this.f85516b.mo30764a(this.f85519e.mo32726a(), c31426a);
        this.f85516b.mo30763a(c31426a);
    }
}

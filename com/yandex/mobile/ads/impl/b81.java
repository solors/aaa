package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b81 implements ja0, t71 {
    @NotNull

    /* renamed from: a */
    private final o71 f77187a;
    @NotNull

    /* renamed from: b */
    private final uh1 f77188b;
    @NotNull

    /* renamed from: c */
    private final th1 f77189c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC31326s1 f77190d;

    public b81(@NotNull o71 nativeVideoController, @NotNull uh1 progressListener, @NotNull e02 timeProviderContainer, @NotNull th1 progressIncrementer, @NotNull InterfaceC31326s1 adBlockDurationProvider) {
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        Intrinsics.checkNotNullParameter(adBlockDurationProvider, "adBlockDurationProvider");
        this.f77187a = nativeVideoController;
        this.f77188b = progressListener;
        this.f77189c = progressIncrementer;
        this.f77190d = adBlockDurationProvider;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29263a(long j, long j2) {
        long m29163a = this.f77189c.m29163a() + j2;
        long mo29885a = this.f77190d.mo29885a(j);
        if (m29163a >= mo29885a) {
            this.f77187a.m31138b(this);
            this.f77188b.mo27865a();
            return;
        }
        this.f77188b.mo27864a(mo29885a, m29163a);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: b */
    public final void mo29262b() {
        this.f77188b.mo27865a();
        this.f77187a.m31138b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f77187a.m31138b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        this.f77187a.m31139a(this);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29264a() {
        this.f77188b.mo27865a();
        this.f77187a.m31138b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
    }
}

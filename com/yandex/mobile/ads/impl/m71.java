package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class m71 implements ja0, t71 {
    @NotNull

    /* renamed from: a */
    private final o71 f82069a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31470to f82070b;
    @Nullable

    /* renamed from: c */
    private final Long f82071c;
    @NotNull

    /* renamed from: d */
    private final C31597uo f82072d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC30261eo f82073e;

    public m71(@NotNull C30149d8<?> adResponse, @NotNull o71 nativeVideoController, @NotNull InterfaceC31470to closeShowListener, @NotNull e02 timeProviderContainer, @Nullable Long l, @NotNull C31597uo closeTimerProgressIncrementer, @NotNull InterfaceC30261eo closableAdChecker) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(closableAdChecker, "closableAdChecker");
        this.f82069a = nativeVideoController;
        this.f82070b = closeShowListener;
        this.f82071c = l;
        this.f82072d = closeTimerProgressIncrementer;
        this.f82073e = closableAdChecker;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29263a(long j, long j2) {
        if (this.f82073e.mo26971a()) {
            this.f82072d.mo28719a(j - j2, j2);
            long m28720a = this.f82072d.m28720a() + j2;
            Long l = this.f82071c;
            if (l == null || m28720a < l.longValue()) {
                return;
            }
            this.f82070b.mo29100a();
            this.f82069a.m31138b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: b */
    public final void mo29262b() {
        if (this.f82073e.mo26971a()) {
            this.f82070b.mo29100a();
            this.f82069a.m31138b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f82069a.m31138b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        this.f82069a.m31139a(this);
        if (this.f82073e.mo26971a() && this.f82071c != null && this.f82072d.m28720a() >= this.f82071c.longValue()) {
            this.f82070b.mo29100a();
            this.f82069a.m31138b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29264a() {
        this.f82070b.mo29100a();
        this.f82069a.m31138b(this);
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
    }
}

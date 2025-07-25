package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d51 implements ja0 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31470to f77887a;
    @NotNull

    /* renamed from: b */
    private final C31597uo f77888b;

    /* renamed from: c */
    private final long f77889c;
    @NotNull

    /* renamed from: d */
    private final oc1 f77890d;
    @NotNull

    /* renamed from: e */
    private final C30144a f77891e;

    /* renamed from: com.yandex.mobile.ads.impl.d51$a */
    /* loaded from: classes8.dex */
    private final class C30144a implements qc1 {
        public C30144a() {
        }

        @Override // com.yandex.mobile.ads.impl.qc1
        /* renamed from: a */
        public final void mo25973a() {
            d51.m35099a(d51.this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ d51(com.yandex.mobile.ads.impl.C30149d8 r9, com.yandex.mobile.ads.impl.InterfaceC31470to r10, com.yandex.mobile.ads.impl.e02 r11) {
        /*
            r8 = this;
            com.yandex.mobile.ads.impl.uo r4 = r11.m34732c()
            long r5 = com.yandex.mobile.ads.impl.e51.m34664a(r9)
            int r0 = com.yandex.mobile.ads.impl.oc1.f83452a
            r0 = 0
            com.yandex.mobile.ads.impl.oc1 r7 = com.yandex.mobile.ads.impl.oc1.C31031a.m31055a(r0)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d51.<init>(com.yandex.mobile.ads.impl.d8, com.yandex.mobile.ads.impl.to, com.yandex.mobile.ads.impl.e02):void");
    }

    /* renamed from: a */
    public static final void m35099a(d51 d51Var) {
        d51Var.f77887a.mo29100a();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f77890d.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
        this.f77890d.pause();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
        this.f77890d.resume();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        long max = Math.max(0L, this.f77889c - this.f77888b.m28720a());
        this.f77890d.mo30763a(this.f77888b);
        this.f77890d.mo30764a(max, this.f77891e);
    }

    public d51(@NotNull C30149d8<?> adResponse, @NotNull InterfaceC31470to closeShowListener, @NotNull e02 timeProviderContainer, @NotNull C31597uo closeTimerProgressIncrementer, long j, @NotNull oc1 pausableTimer) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f77887a = closeShowListener;
        this.f77888b = closeTimerProgressIncrementer;
        this.f77889c = j;
        this.f77890d = pausableTimer;
        this.f77891e = new C30144a();
    }
}

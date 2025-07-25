package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oc1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f51 implements ja0 {
    @NotNull

    /* renamed from: a */
    private final oc1 f78979a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC29972ay f78980b;
    @Nullable

    /* renamed from: c */
    private InterfaceC30068c3 f78981c;
    @Nullable

    /* renamed from: d */
    private uh1 f78982d;

    /* renamed from: com.yandex.mobile.ads.impl.f51$a */
    /* loaded from: classes8.dex */
    private final class C30294a implements qc1 {
        public C30294a() {
        }

        @Override // com.yandex.mobile.ads.impl.qc1
        /* renamed from: a */
        public final void mo25973a() {
            f51.m34217b(f51.this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.f51$b */
    /* loaded from: classes8.dex */
    private final class C30295b implements k02 {

        /* renamed from: a */
        private final long f78984a;

        public C30295b(long j) {
            this.f78984a = j;
        }

        @Override // com.yandex.mobile.ads.impl.k02
        /* renamed from: a */
        public final void mo28719a(long j, long j2) {
            uh1 uh1Var = f51.this.f78982d;
            if (uh1Var != null) {
                long j3 = this.f78984a;
                uh1Var.mo27864a(j3, j3 - j);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f51(InterfaceC30068c3 interfaceC30068c3, e02 e02Var, uh1 uh1Var) {
        this(interfaceC30068c3, e02Var, uh1Var, oc1.C31031a.m31055a(false), e02Var.m34731d());
        int i = oc1.f83452a;
    }

    /* renamed from: b */
    public static final void m34217b(f51 f51Var) {
        uh1 uh1Var = f51Var.f78982d;
        if (uh1Var != null) {
            uh1Var.mo27865a();
        }
        InterfaceC30068c3 interfaceC30068c3 = f51Var.f78981c;
        if (interfaceC30068c3 != null) {
            interfaceC30068c3.mo30350b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f78979a.invalidate();
        this.f78979a.mo30763a(null);
        this.f78981c = null;
        this.f78982d = null;
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
        this.f78979a.pause();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
        this.f78979a.resume();
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        C30294a c30294a = new C30294a();
        long mo32726a = this.f78980b.mo32726a();
        this.f78979a.mo30763a(new C30295b(mo32726a));
        this.f78979a.mo30764a(mo32726a, c30294a);
    }

    public f51(@NotNull InterfaceC30068c3 adCompleteListener, @NotNull e02 timeProviderContainer, @NotNull uh1 progressListener, @NotNull oc1 pausableTimer, @NotNull InterfaceC29972ay defaultContentDelayProvider) {
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        Intrinsics.checkNotNullParameter(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f78979a = pausableTimer;
        this.f78980b = defaultContentDelayProvider;
        this.f78981c = adCompleteListener;
        this.f78982d = progressListener;
    }
}

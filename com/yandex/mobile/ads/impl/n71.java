package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class n71 implements ja0, t71 {
    @NotNull

    /* renamed from: a */
    private final o71 f82626a;
    @Nullable

    /* renamed from: b */
    private final Long f82627b;
    @Nullable

    /* renamed from: c */
    private InterfaceC30068c3 f82628c;
    @Nullable

    /* renamed from: d */
    private uh1 f82629d;

    public n71(@NotNull C30149d8<?> adResponse, @NotNull o71 nativeVideoController, @NotNull InterfaceC30068c3 adCompleteListener, @NotNull uh1 progressListener, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeVideoController, "nativeVideoController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f82626a = nativeVideoController;
        this.f82627b = l;
        this.f82628c = adCompleteListener;
        this.f82629d = progressListener;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29263a(long j, long j2) {
        uh1 uh1Var = this.f82629d;
        if (uh1Var != null) {
            uh1Var.mo27864a(j, j2);
        }
        Long l = this.f82627b;
        if (l == null || j2 <= l.longValue()) {
            return;
        }
        uh1 uh1Var2 = this.f82629d;
        if (uh1Var2 != null) {
            uh1Var2.mo27865a();
        }
        InterfaceC30068c3 interfaceC30068c3 = this.f82628c;
        if (interfaceC30068c3 != null) {
            interfaceC30068c3.mo30350b();
        }
        this.f82626a.m31138b(this);
        this.f82628c = null;
        this.f82629d = null;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: b */
    public final void mo29262b() {
        uh1 uh1Var = this.f82629d;
        if (uh1Var != null) {
            uh1Var.mo27865a();
        }
        InterfaceC30068c3 interfaceC30068c3 = this.f82628c;
        if (interfaceC30068c3 != null) {
            interfaceC30068c3.mo30350b();
        }
        this.f82626a.m31138b(this);
        this.f82628c = null;
        this.f82629d = null;
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void invalidate() {
        this.f82626a.m31138b(this);
        this.f82628c = null;
        this.f82629d = null;
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void start() {
        this.f82626a.m31139a(this);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    /* renamed from: a */
    public final void mo29264a() {
        InterfaceC30068c3 interfaceC30068c3 = this.f82628c;
        if (interfaceC30068c3 != null) {
            interfaceC30068c3.mo30351a();
        }
        this.f82628c = null;
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.ja0
    public final void resume() {
    }
}

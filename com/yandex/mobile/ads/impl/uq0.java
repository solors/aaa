package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uq0 {
    @NotNull

    /* renamed from: a */
    private final pj0 f86367a;
    @NotNull

    /* renamed from: b */
    private final zq0 f86368b;
    @NotNull

    /* renamed from: c */
    private final ar0 f86369c;
    @NotNull

    /* renamed from: d */
    private final ik0 f86370d;
    @NotNull

    /* renamed from: e */
    private final C30821m2 f86371e;

    public uq0(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull C31920yr instreamAdBreak, @NotNull pj0 instreamAdPlayerController, @NotNull C31253r2 adBreakStatusController, @NotNull zq0 manualPlaybackEventListener, @NotNull ar0 manualPlaybackManager, @NotNull ik0 instreamAdViewsHolderManager, @NotNull C30821m2 adBreakPlaybackController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAdBreak, "instreamAdBreak");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(manualPlaybackEventListener, "manualPlaybackEventListener");
        Intrinsics.checkNotNullParameter(manualPlaybackManager, "manualPlaybackManager");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(adBreakPlaybackController, "adBreakPlaybackController");
        this.f86367a = instreamAdPlayerController;
        this.f86368b = manualPlaybackEventListener;
        this.f86369c = manualPlaybackManager;
        this.f86370d = instreamAdViewsHolderManager;
        this.f86371e = adBreakPlaybackController;
    }

    /* renamed from: b */
    public final void m28707b() {
        hk0 m33219a = this.f86370d.m33219a();
        if (m33219a != null && m33219a.m33540b() != null) {
            this.f86371e.m32157a();
        }
    }

    /* renamed from: c */
    public final void m28706c() {
        this.f86367a.m30641a();
        this.f86371e.m32155a(new C31606a());
        this.f86371e.m32149d();
    }

    /* renamed from: d */
    public final void m28705d() {
        hk0 m33219a = this.f86370d.m33219a();
        if (m33219a != null && m33219a.m33540b() != null) {
            this.f86371e.m32145f();
        }
    }

    /* renamed from: a */
    public final void m28711a() {
        this.f86371e.m32153b();
        this.f86367a.m30637b();
        this.f86370d.m33217b();
    }

    /* renamed from: a */
    public final void m28709a(@NotNull h50 instreamAdView) {
        List<k62> m17166m;
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        uq0 m35807a = this.f86369c.m35807a(instreamAdView);
        if (!Intrinsics.m17075f(this, m35807a)) {
            if (m35807a != null) {
                m35807a.f86371e.m32151c();
                m35807a.f86370d.m33217b();
            }
            if (this.f86369c.m35805a(this)) {
                this.f86371e.m32151c();
                this.f86370d.m33217b();
            }
            this.f86369c.m35806a(instreamAdView, this);
        }
        ik0 ik0Var = this.f86370d;
        m17166m = C37563v.m17166m();
        ik0Var.m33218a(instreamAdView, m17166m);
        this.f86367a.m30641a();
        this.f86371e.m32143g();
    }

    /* renamed from: com.yandex.mobile.ads.impl.uq0$a */
    /* loaded from: classes8.dex */
    private final class C31606a implements InterfaceC30898n2 {
        public C31606a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30898n2
        /* renamed from: a */
        public final void mo28704a() {
            uq0.this.f86368b.onInstreamAdBreakPrepared();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30898n2
        /* renamed from: b */
        public final void mo28703b() {
            uq0.this.f86368b.onInstreamAdBreakStarted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30898n2
        /* renamed from: e */
        public final void mo28701e() {
            uq0.this.f86368b.onInstreamAdBreakCompleted();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30898n2
        /* renamed from: g */
        public final void mo28700g() {
            uq0.this.f86368b.onInstreamAdBreakError("Ad player returned error");
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30898n2
        /* renamed from: d */
        public final void mo28702d() {
        }
    }

    /* renamed from: a */
    public final void m28710a(@Nullable a62 a62Var) {
        this.f86371e.m32154a(a62Var);
    }
}

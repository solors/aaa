package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vl0 {
    @NotNull

    /* renamed from: a */
    private final pj0 f86809a;
    @NotNull

    /* renamed from: b */
    private final m92 f86810b;
    @NotNull

    /* renamed from: c */
    private final a62 f86811c;
    @NotNull

    /* renamed from: d */
    private final C31670c f86812d;
    @NotNull

    /* renamed from: e */
    private final C31668a f86813e;
    @NotNull

    /* renamed from: f */
    private final C31669b f86814f;
    @NotNull

    /* renamed from: g */
    private final i92 f86815g;
    @NotNull

    /* renamed from: h */
    private final C30776l8 f86816h;
    @Nullable

    /* renamed from: i */
    private C30607j8 f86817i;
    @Nullable

    /* renamed from: j */
    private wl0 f86818j;

    /* renamed from: k */
    private boolean f86819k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.vl0$a */
    /* loaded from: classes8.dex */
    public final class C31668a implements InterfaceC30916n8 {
        public C31668a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: a */
        public final void mo28262a() {
            vl0.this.m28271e();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: b */
        public final void mo28261b() {
            vl0.m28266g(vl0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: c */
        public final void mo28260c() {
            vl0.m28270e(vl0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.vl0$b */
    /* loaded from: classes8.dex */
    public final class C31669b implements InterfaceC30916n8 {
        public C31669b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: a */
        public final void mo28262a() {
            vl0.m28274c(vl0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: b */
        public final void mo28261b() {
            vl0.m28266g(vl0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: c */
        public final void mo28260c() {
            vl0.m28274c(vl0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.vl0$c */
    /* loaded from: classes8.dex */
    public final class C31670c implements InterfaceC30916n8 {
        public C31670c() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: a */
        public final void mo28262a() {
            vl0.this.f86819k = false;
            vl0.m28272d(vl0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: b */
        public final void mo28261b() {
            boolean z = vl0.this.f86819k;
            vl0.this.f86819k = false;
            if (!z) {
                wl0 wl0Var = vl0.this.f86818j;
                if (wl0Var != null) {
                    wl0Var.onInstreamAdPrepared();
                    return;
                }
                return;
            }
            vl0.m28266g(vl0.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
        /* renamed from: c */
        public final void mo28260c() {
            vl0.m28272d(vl0.this);
        }
    }

    public /* synthetic */ vl0(Context context, pq1 pq1Var, C31763wr c31763wr, pj0 pj0Var, ik0 ik0Var, m92 m92Var) {
        this(context, pq1Var, c31763wr, pj0Var, ik0Var, m92Var, new j92(), new a62());
    }

    /* renamed from: c */
    public static final void m28274c(vl0 vl0Var) {
        wl0 wl0Var = vl0Var.f86818j;
        if (wl0Var != null) {
            wl0Var.mo27875a();
        }
        vl0Var.f86810b.m32058h();
        vl0Var.f86809a.m30637b();
    }

    /* renamed from: d */
    public static final void m28272d(vl0 vl0Var) {
        C30607j8 m32310a = vl0Var.f86816h.m32310a();
        vl0Var.f86817i = m32310a;
        m32310a.m33029a(vl0Var.f86813e);
        C30607j8 c30607j8 = vl0Var.f86817i;
        if (c30607j8 != null) {
            c30607j8.m33025f();
        }
    }

    /* renamed from: e */
    public static final void m28270e(vl0 vl0Var) {
        C30607j8 m32308b = vl0Var.f86816h.m32308b();
        vl0Var.f86817i = m32308b;
        if (m32308b != null) {
            m32308b.m33029a(vl0Var.f86814f);
            C30607j8 c30607j8 = vl0Var.f86817i;
            if (c30607j8 != null) {
                c30607j8.m33025f();
                return;
            }
            return;
        }
        wl0 wl0Var = vl0Var.f86818j;
        if (wl0Var != null) {
            wl0Var.mo27875a();
        }
        vl0Var.f86810b.m32058h();
        vl0Var.f86809a.m30637b();
    }

    /* renamed from: g */
    public static final void m28266g(vl0 vl0Var) {
        C30607j8 c30607j8 = vl0Var.f86817i;
        if (c30607j8 != null) {
            c30607j8.m33023h();
        }
    }

    /* renamed from: h */
    public final void m28265h() {
        if (this.f86817i == null) {
            C30607j8 m32307c = this.f86816h.m32307c();
            this.f86817i = m32307c;
            if (m32307c != null) {
                m32307c.m33029a(this.f86812d);
                this.f86819k = false;
                C30607j8 c30607j8 = this.f86817i;
                if (c30607j8 != null) {
                    c30607j8.m33025f();
                    return;
                }
                return;
            }
            wl0 wl0Var = this.f86818j;
            if (wl0Var != null) {
                wl0Var.onInstreamAdPrepared();
                return;
            }
            return;
        }
        wl0 wl0Var2 = this.f86818j;
        if (wl0Var2 != null) {
            wl0Var2.onInstreamAdPrepared();
        }
    }

    /* renamed from: i */
    public final void m28264i() {
        C30607j8 c30607j8 = this.f86817i;
        if (c30607j8 != null) {
            c30607j8.m33024g();
        }
    }

    /* renamed from: j */
    public final void m28263j() {
        this.f86815g.m33331f();
        C30607j8 c30607j8 = this.f86817i;
        if (c30607j8 != null) {
            c30607j8.m33026e();
        }
    }

    /* renamed from: a */
    public final void m28281a() {
        this.f86815g.m33337a();
    }

    /* renamed from: b */
    public final void m28277b() {
        C30607j8 c30607j8 = this.f86817i;
        if (c30607j8 != null) {
            c30607j8.m33024g();
            return;
        }
        wl0 wl0Var = this.f86818j;
        if (wl0Var != null) {
            wl0Var.mo27875a();
        }
        this.f86810b.m32058h();
        this.f86809a.m30637b();
    }

    /* renamed from: f */
    public final void m28269f() {
        if (this.f86817i != null) {
            this.f86815g.m33334c();
            C30607j8 c30607j8 = this.f86817i;
            if (c30607j8 != null) {
                c30607j8.m33023h();
                return;
            }
            return;
        }
        C30607j8 m32307c = this.f86816h.m32307c();
        this.f86817i = m32307c;
        if (m32307c != null) {
            m32307c.m33029a(this.f86812d);
            this.f86815g.m33334c();
            this.f86819k = true;
            C30607j8 c30607j82 = this.f86817i;
            if (c30607j82 != null) {
                c30607j82.m33025f();
                return;
            }
            return;
        }
        C30607j8 m32310a = this.f86816h.m32310a();
        this.f86817i = m32310a;
        m32310a.m33029a(this.f86813e);
        C30607j8 c30607j83 = this.f86817i;
        if (c30607j83 != null) {
            c30607j83.m33025f();
        }
    }

    /* renamed from: a */
    public final void m28278a(@Nullable C32008zp c32008zp) {
        this.f86811c.m35947a(c32008zp);
    }

    /* renamed from: g */
    public final void m28267g() {
        this.f86810b.m32065a(this.f86815g);
        this.f86815g.m33333d();
    }

    public vl0(@NotNull Context context, @NotNull pq1 sdkEnvironmentModule, @NotNull C31763wr instreamVideoAd, @NotNull pj0 instreamAdPlayerController, @NotNull ik0 instreamAdViewsHolderManager, @NotNull m92 videoPlayerController, @NotNull j92 videoPlaybackControllerFactory, @NotNull a62 videoAdCreativePlaybackProxyListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(videoPlaybackControllerFactory, "videoPlaybackControllerFactory");
        Intrinsics.checkNotNullParameter(videoAdCreativePlaybackProxyListener, "videoAdCreativePlaybackProxyListener");
        this.f86809a = instreamAdPlayerController;
        this.f86810b = videoPlayerController;
        this.f86811c = videoAdCreativePlaybackProxyListener;
        this.f86812d = new C31670c();
        this.f86813e = new C31668a();
        this.f86814f = new C31669b();
        videoPlaybackControllerFactory.getClass();
        i92 m33007a = j92.m33007a(videoPlayerController, this);
        this.f86815g = m33007a;
        this.f86816h = new C30776l8(context, sdkEnvironmentModule, instreamVideoAd, instreamAdPlayerController, instreamAdViewsHolderManager, videoPlayerController, m33007a, videoAdCreativePlaybackProxyListener);
    }

    /* renamed from: a */
    public final void m28279a(@Nullable wl0 wl0Var) {
        this.f86818j = wl0Var;
    }

    /* renamed from: c */
    public final void m28275c() {
        C30607j8 c30607j8 = this.f86817i;
        if (c30607j8 != null) {
            c30607j8.m33027d();
        }
        this.f86809a.m30637b();
    }

    /* renamed from: d */
    public final void m28273d() {
        m28275c();
        this.f86810b.m32058h();
        this.f86815g.m33335b();
    }

    /* renamed from: e */
    public final void m28271e() {
        wl0 wl0Var = this.f86818j;
        if (wl0Var != null) {
            wl0Var.mo27874b();
        }
        this.f86810b.m32058h();
        this.f86809a.m30637b();
    }
}

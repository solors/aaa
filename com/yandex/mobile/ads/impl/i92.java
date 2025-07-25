package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class i92 implements InterfaceC30269et {
    @NotNull

    /* renamed from: a */
    private final m92 f80383a;
    @NotNull

    /* renamed from: b */
    private final vl0 f80384b;
    @NotNull

    /* renamed from: c */
    private final ma2 f80385c;
    @Nullable

    /* renamed from: d */
    private k92 f80386d;

    public i92(@NotNull m92 videoPlayerController, @NotNull vl0 instreamVideoPresenter) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(instreamVideoPresenter, "instreamVideoPresenter");
        this.f80383a = videoPlayerController;
        this.f80384b = instreamVideoPresenter;
        this.f80385c = videoPlayerController.m32066a();
    }

    /* renamed from: a */
    public final void m33337a() {
        int ordinal = this.f80385c.m32057a().ordinal();
        if (ordinal == 0) {
            this.f80384b.m28267g();
        } else if (ordinal == 7) {
            this.f80384b.m28271e();
        } else if (ordinal == 4) {
            this.f80383a.m32062d();
            this.f80384b.m28264i();
        } else if (ordinal != 5) {
        } else {
            this.f80384b.m28277b();
        }
    }

    /* renamed from: b */
    public final void m33335b() {
        int ordinal = this.f80385c.m32057a().ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6 || ordinal == 7) {
            this.f80385c.m32056a(la2.f81759b);
            k92 k92Var = this.f80386d;
            if (k92Var != null) {
                k92Var.mo30187a();
            }
        }
    }

    /* renamed from: c */
    public final void m33334c() {
        int ordinal = this.f80385c.m32057a().ordinal();
        if (ordinal == 2 || ordinal == 3) {
            this.f80383a.m32062d();
        }
    }

    /* renamed from: d */
    public final void m33333d() {
        this.f80385c.m32056a(la2.f81760c);
        this.f80383a.m32061e();
    }

    /* renamed from: e */
    public final void m33332e() {
        int ordinal = this.f80385c.m32057a().ordinal();
        if (ordinal == 2 || ordinal == 6) {
            this.f80383a.m32060f();
        }
    }

    /* renamed from: f */
    public final void m33331f() {
        int ordinal = this.f80385c.m32057a().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3 || ordinal == 6) {
                this.f80385c.m32056a(la2.f81763f);
                return;
            }
            return;
        }
        this.f80385c.m32056a(la2.f81759b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoCompleted() {
        this.f80385c.m32056a(la2.f81764g);
        k92 k92Var = this.f80386d;
        if (k92Var != null) {
            k92Var.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoError() {
        this.f80385c.m32056a(la2.f81766i);
        k92 k92Var = this.f80386d;
        if (k92Var != null) {
            k92Var.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoPaused() {
        this.f80385c.m32056a(la2.f81765h);
        k92 k92Var = this.f80386d;
        if (k92Var != null) {
            k92Var.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoPrepared() {
        if (la2.f81760c == this.f80385c.m32057a()) {
            this.f80385c.m32056a(la2.f81761d);
            this.f80384b.m28269f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30269et
    public final void onVideoResumed() {
        this.f80385c.m32056a(la2.f81762e);
        k92 k92Var = this.f80386d;
        if (k92Var != null) {
            k92Var.onVideoResumed();
        }
    }

    /* renamed from: a */
    public final void m33336a(@Nullable k92 k92Var) {
        this.f80386d = k92Var;
    }
}

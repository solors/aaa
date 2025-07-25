package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j8 */
/* loaded from: classes8.dex */
public final class C30607j8 implements InterfaceC30916n8 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30833m8 f80792a;
    @NotNull

    /* renamed from: b */
    private final C31096p8 f80793b;
    @NotNull

    /* renamed from: c */
    private final a62 f80794c;
    @Nullable

    /* renamed from: d */
    private InterfaceC30916n8 f80795d;

    public C30607j8(@NotNull InterfaceC30833m8 adSectionPlaybackController, @NotNull C31096p8 adSectionStatusController, @NotNull a62 adCreativePlaybackProxyListener) {
        Intrinsics.checkNotNullParameter(adSectionPlaybackController, "adSectionPlaybackController");
        Intrinsics.checkNotNullParameter(adSectionStatusController, "adSectionStatusController");
        Intrinsics.checkNotNullParameter(adCreativePlaybackProxyListener, "adCreativePlaybackProxyListener");
        this.f80792a = adSectionPlaybackController;
        this.f80793b = adSectionStatusController;
        this.f80794c = adCreativePlaybackProxyListener;
        adSectionPlaybackController.mo30198a(this);
        adSectionPlaybackController.mo30197a(adCreativePlaybackProxyListener);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
    /* renamed from: a */
    public final void mo28262a() {
        this.f80793b.m30814a(EnumC31024o8.f83366f);
        InterfaceC30916n8 interfaceC30916n8 = this.f80795d;
        if (interfaceC30916n8 != null) {
            interfaceC30916n8.mo28262a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
    /* renamed from: b */
    public final void mo28261b() {
        this.f80793b.m30814a(EnumC31024o8.f83363c);
        InterfaceC30916n8 interfaceC30916n8 = this.f80795d;
        if (interfaceC30916n8 != null) {
            interfaceC30916n8.mo28261b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30916n8
    /* renamed from: c */
    public final void mo28260c() {
        this.f80793b.m30814a(EnumC31024o8.f83365e);
        InterfaceC30916n8 interfaceC30916n8 = this.f80795d;
        if (interfaceC30916n8 != null) {
            interfaceC30916n8.mo28260c();
        }
    }

    /* renamed from: d */
    public final void m33027d() {
        int ordinal = this.f80793b.m30815a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f80792a.mo30192c();
        }
    }

    /* renamed from: e */
    public final void m33026e() {
        int ordinal = this.f80793b.m30815a().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.f80792a.mo30188f();
        }
    }

    /* renamed from: f */
    public final void m33025f() {
        InterfaceC30916n8 interfaceC30916n8;
        int ordinal = this.f80793b.m30815a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 4 && (interfaceC30916n8 = this.f80795d) != null) {
                    interfaceC30916n8.mo28262a();
                    return;
                }
                return;
            }
            InterfaceC30916n8 interfaceC30916n82 = this.f80795d;
            if (interfaceC30916n82 != null) {
                interfaceC30916n82.mo28261b();
                return;
            }
            return;
        }
        this.f80792a.prepare();
    }

    /* renamed from: g */
    public final void m33024g() {
        InterfaceC30916n8 interfaceC30916n8;
        int ordinal = this.f80793b.m30815a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4 && (interfaceC30916n8 = this.f80795d) != null) {
                        interfaceC30916n8.mo28262a();
                        return;
                    }
                    return;
                }
                InterfaceC30916n8 interfaceC30916n82 = this.f80795d;
                if (interfaceC30916n82 != null) {
                    interfaceC30916n82.mo28260c();
                    return;
                }
                return;
            }
            this.f80792a.resume();
            return;
        }
        this.f80792a.prepare();
    }

    /* renamed from: h */
    public final void m33023h() {
        InterfaceC30916n8 interfaceC30916n8;
        int ordinal = this.f80793b.m30815a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4 && (interfaceC30916n8 = this.f80795d) != null) {
                            interfaceC30916n8.mo28262a();
                            return;
                        }
                        return;
                    }
                    InterfaceC30916n8 interfaceC30916n82 = this.f80795d;
                    if (interfaceC30916n82 != null) {
                        interfaceC30916n82.mo28260c();
                        return;
                    }
                    return;
                }
                this.f80792a.resume();
                return;
            }
            this.f80793b.m30814a(EnumC31024o8.f83364d);
            this.f80792a.start();
            return;
        }
        this.f80792a.prepare();
    }

    /* renamed from: a */
    public final void m33028a(@Nullable pl0 pl0Var) {
        this.f80794c.m35947a(pl0Var);
    }

    /* renamed from: a */
    public final void m33029a(@Nullable InterfaceC30916n8 interfaceC30916n8) {
        this.f80795d = interfaceC30916n8;
    }
}

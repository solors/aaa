package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s5 */
/* loaded from: classes8.dex */
public final class C31330s5 implements InterfaceC30117cs {
    @NotNull

    /* renamed from: a */
    private final C30077c9 f85018a;
    @Nullable

    /* renamed from: b */
    private InterfaceC30117cs f85019b;

    public C31330s5(@NotNull C30077c9 adStartedListener) {
        Intrinsics.checkNotNullParameter(adStartedListener, "adStartedListener");
        this.f85018a = adStartedListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: a */
    public final void mo29863a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29863a(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: b */
    public final void mo29859b(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29859b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: c */
    public final void mo29858c(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f85018a.m35338a();
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29858c(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: d */
    public final void mo29857d(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29857d(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: e */
    public final void mo29856e(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29856e(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: f */
    public final void mo29855f(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29855f(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: g */
    public final void mo29854g(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29854g(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: h */
    public final void mo29853h(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29853h(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: i */
    public final void mo29852i(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29852i(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: a */
    public final void mo29861a(@NotNull kl0 videoAd, @NotNull g72 error) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29861a(videoAd, error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
    /* renamed from: a */
    public final void mo29862a(@NotNull kl0 videoAd, float f) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        InterfaceC30117cs interfaceC30117cs = this.f85019b;
        if (interfaceC30117cs != null) {
            interfaceC30117cs.mo29862a(videoAd, f);
        }
    }

    /* renamed from: a */
    public final void m29860a(@Nullable qj0 qj0Var) {
        this.f85019b = qj0Var;
    }
}

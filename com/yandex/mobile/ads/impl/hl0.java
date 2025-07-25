package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class hl0 implements f72<kl0> {
    @NotNull

    /* renamed from: a */
    private final kl0 f80099a;
    @NotNull

    /* renamed from: b */
    private final pj0 f80100b;
    @Nullable

    /* renamed from: c */
    private C30471a f80101c;

    public hl0(@NotNull kl0 instreamVideoAd, @NotNull pj0 instreamAdPlayerController) {
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        this.f80099a = instreamVideoAd;
        this.f80100b = instreamAdPlayerController;
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: a */
    public final void mo33531a(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80100b.m30630g(videoAdInfo.m32085d());
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: b */
    public final long mo33529b() {
        return this.f80100b.m30640a(this.f80099a);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: c */
    public final void mo33528c() {
        this.f80100b.m30631f(this.f80099a);
    }

    /* renamed from: d */
    public final void m33527d() {
        this.f80100b.m30629h(this.f80099a);
    }

    /* renamed from: e */
    public final void m33526e() {
        this.f80100b.m30627j(this.f80099a);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final long getAdPosition() {
        return this.f80100b.m30636b(this.f80099a);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final float getVolume() {
        return this.f80100b.m30634c(this.f80099a);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final boolean isPlayingAd() {
        return this.f80100b.m30633d(this.f80099a);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final void pauseAd() {
        this.f80100b.m30632e(this.f80099a);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    public final void resumeAd() {
        this.f80100b.m30628i(this.f80099a);
    }

    /* renamed from: com.yandex.mobile.ads.impl.hl0$a */
    /* loaded from: classes8.dex */
    private static final class C30471a implements InterfaceC30117cs {
        @NotNull

        /* renamed from: a */
        private final h72 f80102a;

        public C30471a(@NotNull x62 listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f80102a = listener;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: a */
        public final void mo29863a(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27654a(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: b */
        public final void mo29859b(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27653b(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: c */
        public final void mo29858c(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27647h(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: d */
        public final void mo29857d(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27648g(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: e */
        public final void mo29856e(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27650e(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: f */
        public final void mo29855f(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27657a((a72) videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: g */
        public final void mo29854g(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27651d(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: h */
        public final void mo29853h(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27652c(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: i */
        public final void mo29852i(@NotNull kl0 videoAd) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27649f(videoAd.m32500f());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: a */
        public final void mo29861a(@NotNull kl0 videoAd, @NotNull g72 error) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            Intrinsics.checkNotNullParameter(error, "error");
            this.f80102a.mo27655a(videoAd.m32500f(), error);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30117cs
        /* renamed from: a */
        public final void mo29862a(@NotNull kl0 videoAd, float f) {
            Intrinsics.checkNotNullParameter(videoAd, "videoAd");
            this.f80102a.mo27656a(videoAd.m32500f(), f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: a */
    public final void mo33530a(@Nullable x62 x62Var) {
        C30471a c30471a = this.f80101c;
        if (c30471a != null) {
            this.f80100b.m30635b(this.f80099a, c30471a);
            this.f80101c = null;
        }
        if (x62Var != null) {
            C30471a c30471a2 = new C30471a(x62Var);
            this.f80100b.m30638a(this.f80099a, c30471a2);
            this.f80101c = c30471a2;
        }
    }

    /* renamed from: a */
    public final void m33532a(float f) {
        this.f80100b.m30639a(this.f80099a, f);
    }

    @Override // com.yandex.mobile.ads.impl.f72
    /* renamed from: a */
    public final void mo33533a() {
        this.f80100b.m30626k(this.f80099a);
    }
}

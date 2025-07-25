package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yk0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jl0 implements y62<kl0>, yk0.InterfaceC31904a {
    @NotNull

    /* renamed from: a */
    private final y62<kl0> f80974a;
    @NotNull

    /* renamed from: b */
    private final AtomicInteger f80975b;

    public jl0(@NotNull y62<kl0> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80974a = listener;
        this.f80975b = new AtomicInteger(2);
    }

    /* renamed from: m */
    private final void m32874m(m62<kl0> m62Var) {
        if (this.f80975b.decrementAndGet() == 0) {
            this.f80974a.mo27015d(m62Var);
        }
    }

    /* renamed from: a */
    public final void m32875a() {
        this.f80975b.set(2);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: b */
    public final void mo27017b(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27017b(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: c */
    public final void mo27016c(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27016c(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: d */
    public final void mo27015d(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        m32874m(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: e */
    public final void mo27014e(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27014e(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: f */
    public final void mo27013f(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27013f(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: g */
    public final void mo27012g(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27012g(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.yk0.InterfaceC31904a
    /* renamed from: h */
    public final void mo26866h(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        m32874m(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: i */
    public final void mo27011i(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27011i(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: j */
    public final void mo27010j(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27010j(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: k */
    public final void mo27009k(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27009k(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: l */
    public final void mo27008l(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27008l(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: a */
    public final void mo27018a(@NotNull m62<kl0> videoAdInfo, @NotNull g72 videoAdPlayerError) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(videoAdPlayerError, "videoAdPlayerError");
        this.f80974a.mo27018a(videoAdInfo, videoAdPlayerError);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: a */
    public final void mo27020a(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27020a(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.y62
    /* renamed from: a */
    public final void mo27019a(@NotNull m62<kl0> videoAdInfo, float f) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f80974a.mo27019a(videoAdInfo, f);
    }
}

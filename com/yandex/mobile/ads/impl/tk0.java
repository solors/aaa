package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class tk0 implements ib1 {
    @NotNull

    /* renamed from: a */
    private final al0 f85735a;
    @NotNull

    /* renamed from: b */
    private final kl0 f85736b;

    public tk0(@NotNull al0 instreamInteractionTracker, @NotNull kl0 videoAd, @NotNull C30814ly customAdClickHandler) {
        Intrinsics.checkNotNullParameter(instreamInteractionTracker, "instreamInteractionTracker");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(customAdClickHandler, "customAdClickHandler");
        this.f85735a = instreamInteractionTracker;
        this.f85736b = videoAd;
    }

    @Override // com.yandex.mobile.ads.impl.ib1
    /* renamed from: a */
    public final void mo28740a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        new sk0(this.f85735a);
        throw null;
    }
}

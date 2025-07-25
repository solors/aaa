package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class xa1 {
    @NotNull

    /* renamed from: a */
    private final AbstractC31183q8 f87611a;
    @NotNull

    /* renamed from: b */
    private final dt0 f87612b;
    @NotNull

    /* renamed from: c */
    private final C30531i3 f87613c;

    public xa1(@NotNull xh2 adSession, @NotNull dt0 mediaEvents, @NotNull C30531i3 adEvents) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        this.f87611a = adSession;
        this.f87612b = mediaEvents;
        this.f87613c = adEvents;
    }

    @NotNull
    /* renamed from: a */
    public final C30531i3 m27600a() {
        return this.f87613c;
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC31183q8 m27599b() {
        return this.f87611a;
    }

    @NotNull
    /* renamed from: c */
    public final dt0 m27598c() {
        return this.f87612b;
    }
}

package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class zd1 implements l72 {
    @NotNull

    /* renamed from: a */
    private final t71 f88831a;

    public zd1(@NotNull t71 nativeVideoPlaybackEventListener) {
        Intrinsics.checkNotNullParameter(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        this.f88831a = nativeVideoPlaybackEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        this.f88831a.mo29263a(j, j2);
    }
}

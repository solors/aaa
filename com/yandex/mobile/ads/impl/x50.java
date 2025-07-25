package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class x50 {
    @NotNull

    /* renamed from: a */
    private final tf1 f87553a;
    @NotNull

    /* renamed from: b */
    private final v82 f87554b;

    public x50(@NotNull tf1 positionProviderHolder, @NotNull v82 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f87553a = positionProviderHolder;
        this.f87554b = videoDurationHolder;
    }

    /* renamed from: a */
    public final void m27658a(@NotNull AdPlaybackState adPlaybackState, int i) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        long usToMs = Util.usToMs(adPlaybackState.getAdGroup(i).timeUs);
        if (usToMs == Long.MIN_VALUE) {
            usToMs = this.f87554b.m28489a();
        }
        this.f87553a.m29180a(new z50(usToMs));
    }

    /* renamed from: a */
    public final void m27659a() {
        this.f87553a.m29180a((z50) null);
    }
}

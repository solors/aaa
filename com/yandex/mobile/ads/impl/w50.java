package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class w50 {
    @NotNull

    /* renamed from: a */
    private final sf1 f87128a;
    @NotNull

    /* renamed from: b */
    private final u82 f87129b;

    public w50(@NotNull sf1 positionProviderHolder, @NotNull u82 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f87128a = positionProviderHolder;
        this.f87129b = videoDurationHolder;
    }

    /* renamed from: a */
    public final void m28027a(@NotNull AdPlaybackState adPlaybackState, int i) {
        Intrinsics.checkNotNullParameter(adPlaybackState, "adPlaybackState");
        long usToMs = Util.usToMs(adPlaybackState.getAdGroup(i).timeUs);
        if (usToMs == Long.MIN_VALUE) {
            usToMs = this.f87129b.m28850a();
        }
        this.f87128a.m29630a(new y50(usToMs));
    }

    /* renamed from: a */
    public final void m28028a() {
        this.f87128a.m29630a((y50) null);
    }
}

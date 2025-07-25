package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.u2 */
/* loaded from: classes8.dex */
public final class C31548u2 {
    @NotNull

    /* renamed from: a */
    private final v82 f86083a;

    public C31548u2(@NotNull v82 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f86083a = videoDurationHolder;
    }

    /* renamed from: a */
    public final long m28901a(@NotNull C32011zr adBreakPosition) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        long m26011b = adBreakPosition.m26011b();
        int ordinal = adBreakPosition.m26012a().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return m26011b;
            }
        } else if (m26011b == 100) {
            return Long.MIN_VALUE;
        } else {
            if (m26011b == 0) {
                return 0L;
            }
            if (this.f86083a.m28489a() != -9223372036854775807L) {
                return (((float) m26011b) / 100) * ((float) this.f86083a.m28489a());
            }
        }
        return -1L;
    }
}

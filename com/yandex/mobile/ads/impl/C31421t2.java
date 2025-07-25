package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.t2 */
/* loaded from: classes8.dex */
public final class C31421t2 {
    @NotNull

    /* renamed from: a */
    private final u82 f85489a;

    public C31421t2(@NotNull u82 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        this.f85489a = videoDurationHolder;
    }

    /* renamed from: a */
    public final long m29315a(@NotNull C32011zr adBreakPosition) {
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
            if (this.f85489a.m28850a() != -9223372036854775807L) {
                return (((float) m26011b) / 100) * ((float) this.f85489a.m28850a());
            }
        }
        return -1L;
    }
}

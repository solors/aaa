package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p82 {
    @NotNull

    /* renamed from: a */
    private final u82 f83748a;
    @NotNull

    /* renamed from: b */
    private final sf1 f83749b;

    public p82(@NotNull sf1 positionProviderHolder, @NotNull u82 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f83748a = videoDurationHolder;
        this.f83749b = positionProviderHolder;
    }

    /* renamed from: a */
    public final boolean m30808a() {
        long j;
        long m28850a = this.f83748a.m28850a();
        if (m28850a != -9223372036854775807L) {
            ne1 m29629b = this.f83749b.m29629b();
            if (m29629b != null) {
                j = m29629b.mo27030a();
            } else {
                j = -1;
            }
            if (j + 1000 >= m28850a) {
                return true;
            }
        }
        return false;
    }
}

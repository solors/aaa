package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q82 {
    @NotNull

    /* renamed from: a */
    private final v82 f84256a;
    @NotNull

    /* renamed from: b */
    private final tf1 f84257b;

    public q82(@NotNull tf1 positionProviderHolder, @NotNull v82 videoDurationHolder) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        this.f84256a = videoDurationHolder;
        this.f84257b = positionProviderHolder;
    }

    /* renamed from: a */
    public final boolean m30445a() {
        long j;
        long m28489a = this.f84256a.m28489a();
        if (m28489a != -9223372036854775807L) {
            oe1 m29179b = this.f84257b.m29179b();
            if (m29179b != null) {
                j = m29179b.mo26372a();
            } else {
                j = -1;
            }
            if (j + 1000 >= m28489a) {
                return true;
            }
        }
        return false;
    }
}

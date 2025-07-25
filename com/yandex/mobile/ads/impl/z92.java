package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z92 implements xh1 {
    @NotNull

    /* renamed from: a */
    private final C30370g9 f88793a;
    @NotNull

    /* renamed from: b */
    private final tf1 f88794b;
    @NotNull

    /* renamed from: c */
    private final v82 f88795c;
    @NotNull

    /* renamed from: d */
    private final ue1 f88796d;

    public z92(@NotNull C30370g9 adStateHolder, @NotNull se1 playerStateController, @NotNull tf1 positionProviderHolder, @NotNull v82 videoDurationHolder, @NotNull ue1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f88793a = adStateHolder;
        this.f88794b = positionProviderHolder;
        this.f88795c = videoDurationHolder;
        this.f88796d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.xh1
    @NotNull
    /* renamed from: a */
    public final be1 mo26294a() {
        long j;
        rf1 m29182a = this.f88794b.m29182a();
        oe1 m29179b = this.f88794b.m29179b();
        long j2 = -1;
        if (m29182a != null) {
            j = m29182a.mo26372a();
        } else if (m29179b != null && !this.f88793a.m33905b() && !this.f88796d.m28800c()) {
            j = m29179b.mo26372a();
        } else {
            j = -1;
        }
        if (this.f88795c.m28489a() != -9223372036854775807L) {
            j2 = this.f88795c.m28489a();
        }
        return new be1(j, j2);
    }
}

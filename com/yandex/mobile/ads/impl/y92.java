package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class y92 implements wh1 {
    @NotNull

    /* renamed from: a */
    private final C30300f9 f88124a;
    @NotNull

    /* renamed from: b */
    private final sf1 f88125b;
    @NotNull

    /* renamed from: c */
    private final u82 f88126c;
    @NotNull

    /* renamed from: d */
    private final te1 f88127d;

    public y92(@NotNull C30300f9 adStateHolder, @NotNull re1 playerStateController, @NotNull sf1 positionProviderHolder, @NotNull u82 videoDurationHolder, @NotNull te1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f88124a = adStateHolder;
        this.f88125b = positionProviderHolder;
        this.f88126c = videoDurationHolder;
        this.f88127d = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.wh1
    @NotNull
    /* renamed from: a */
    public final ce1 mo26975a() {
        long j;
        qf1 m29632a = this.f88125b.m29632a();
        ne1 m29629b = this.f88125b.m29629b();
        long j2 = -1;
        if (m29632a != null) {
            j = m29632a.mo27030a();
        } else if (m29629b != null && !this.f88124a.m34194b() && !this.f88127d.m29199c()) {
            j = m29629b.mo27030a();
        } else {
            j = -1;
        }
        if (this.f88126c.m28850a() != -9223372036854775807L) {
            j2 = this.f88126c.m28850a();
        }
        return new ce1(j, j2);
    }
}

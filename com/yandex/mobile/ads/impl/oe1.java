package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class oe1 implements rf1 {
    @NotNull

    /* renamed from: a */
    private final Player f83467a;
    @NotNull

    /* renamed from: b */
    private final ue1 f83468b;

    public oe1(@NotNull Player player, @NotNull ue1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f83467a = player;
        this.f83468b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.rf1
    /* renamed from: a */
    public final long mo26372a() {
        long j;
        Timeline m28801b = this.f83468b.m28801b();
        Timeline.Period m28804a = this.f83468b.m28804a();
        long contentPosition = this.f83467a.getContentPosition();
        if (!m28801b.isEmpty()) {
            j = m28801b.getPeriod(0, m28804a).getPositionInWindowMs();
        } else {
            j = 0;
        }
        return contentPosition - j;
    }
}

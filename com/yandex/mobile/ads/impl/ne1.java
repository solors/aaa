package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ne1 implements qf1 {
    @NotNull

    /* renamed from: a */
    private final Player f82727a;
    @NotNull

    /* renamed from: b */
    private final te1 f82728b;

    public ne1(@NotNull Player player, @NotNull te1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f82727a = player;
        this.f82728b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    /* renamed from: a */
    public final long mo27030a() {
        long j;
        Timeline m29200b = this.f82728b.m29200b();
        Timeline.Period m29203a = this.f82728b.m29203a();
        long contentPosition = this.f82727a.getContentPosition();
        if (!m29200b.isEmpty()) {
            j = m29200b.getPeriod(0, m29203a).getPositionInWindowMs();
        } else {
            j = 0;
        }
        return contentPosition - j;
    }
}

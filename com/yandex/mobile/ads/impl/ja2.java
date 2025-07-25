package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ja2 {
    @NotNull

    /* renamed from: a */
    private final te1 f80857a;
    @NotNull

    /* renamed from: b */
    private final r82 f80858b;

    public ja2(@NotNull te1 playerStateHolder, @NotNull r82 videoCompletedNotifier) {
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        this.f80857a = playerStateHolder;
        this.f80858b = videoCompletedNotifier;
    }

    /* renamed from: a */
    public final void m32949a(@NotNull Player player) {
        boolean z;
        Intrinsics.checkNotNullParameter(player, "player");
        if (!this.f80857a.m29199c() && !player.isPlayingAd()) {
            this.f80858b.m30116c();
            boolean m30117b = this.f80858b.m30117b();
            Timeline m29200b = this.f80857a.m29200b();
            if (!m30117b && !m29200b.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                m29200b.getPeriod(0, this.f80857a.m29203a());
            }
        }
    }
}

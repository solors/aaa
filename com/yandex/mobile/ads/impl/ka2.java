package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ka2 {
    @NotNull

    /* renamed from: a */
    private final ue1 f81355a;
    @NotNull

    /* renamed from: b */
    private final s82 f81356b;

    public ka2(@NotNull ue1 playerStateHolder, @NotNull s82 videoCompletedNotifier) {
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        this.f81355a = playerStateHolder;
        this.f81356b = videoCompletedNotifier;
    }

    /* renamed from: a */
    public final void m32610a(@NotNull Player player) {
        boolean z;
        Intrinsics.checkNotNullParameter(player, "player");
        if (!this.f81355a.m28800c() && !player.isPlayingAd()) {
            this.f81356b.m29673c();
            boolean m29674b = this.f81356b.m29674b();
            Timeline m28801b = this.f81355a.m28801b();
            if (!m29674b && !m28801b.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                m28801b.getPeriod(0, this.f81355a.m28804a());
            }
        }
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ng2 {
    @NotNull

    /* renamed from: a */
    private final ConcurrentHashMap<kl0, VideoAd> f82781a = new ConcurrentHashMap<>();
    @NotNull

    /* renamed from: b */
    private final ConcurrentHashMap<VideoAd, kl0> f82782b = new ConcurrentHashMap<>();

    @Nullable
    /* renamed from: a */
    public final kl0 m31514a(@NotNull VideoAd yandexVideoAd) {
        Intrinsics.checkNotNullParameter(yandexVideoAd, "yandexVideoAd");
        kl0 kl0Var = this.f82782b.get(yandexVideoAd);
        if (kl0Var == null) {
            km0.m32488a("Incorrect state exception. Released VideoAd usage detected inside InstreamAdPlayerListener. Please, check your InStream callbacks notification order.", new Object[0]);
        }
        return kl0Var;
    }

    /* renamed from: b */
    public final void m31513b(@NotNull kl0 coreVideoAd) {
        Intrinsics.checkNotNullParameter(coreVideoAd, "coreVideoAd");
        this.f82781a.remove(coreVideoAd);
    }

    /* renamed from: b */
    public final void m31512b(@NotNull VideoAd videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f82782b.remove(videoAd);
    }

    @NotNull
    /* renamed from: a */
    public final VideoAd m31515a(@NotNull kl0 coreVideoAd) {
        Intrinsics.checkNotNullParameter(coreVideoAd, "coreVideoAd");
        VideoAd videoAd = this.f82781a.get(coreVideoAd);
        if (videoAd == null) {
            rh2 rh2Var = new rh2(coreVideoAd, new n62());
            this.f82781a.put(coreVideoAd, rh2Var);
            this.f82782b.put(rh2Var, coreVideoAd);
            return rh2Var;
        }
        return videoAd;
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class vh2 implements InterfaceC30192dt {
    @NotNull

    /* renamed from: a */
    private final VideoPlayer f86757a;

    public vh2(@NotNull VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f86757a = videoPlayer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    /* renamed from: a */
    public final void mo28307a(@Nullable r92 r92Var) {
        wh2 wh2Var;
        if (r92Var != null) {
            wh2Var = new wh2(r92Var);
        } else {
            wh2Var = null;
        }
        this.f86757a.setVideoPlayerListener(wh2Var);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vh2) && Intrinsics.m17075f(this.f86757a, ((vh2) obj).f86757a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final long getVideoDuration() {
        return this.f86757a.getVideoDuration();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final long getVideoPosition() {
        return this.f86757a.getVideoPosition();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final float getVolume() {
        return this.f86757a.getVolume();
    }

    public final int hashCode() {
        return this.f86757a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void pauseVideo() {
        this.f86757a.pauseVideo();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void prepareVideo() {
        this.f86757a.prepareVideo();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30192dt
    public final void resumeVideo() {
        this.f86757a.resumeVideo();
    }

    @NotNull
    public final String toString() {
        VideoPlayer videoPlayer = this.f86757a;
        return "YandexVideoPlayerAdapter(videoPlayer=" + videoPlayer + ")";
    }
}

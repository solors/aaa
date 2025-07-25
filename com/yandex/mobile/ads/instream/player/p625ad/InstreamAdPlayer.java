package com.yandex.mobile.ads.instream.player.p625ad;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* renamed from: com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer */
/* loaded from: classes8.dex */
public interface InstreamAdPlayer {
    long getAdDuration(@NotNull VideoAd videoAd);

    long getAdPosition(@NotNull VideoAd videoAd);

    float getVolume(@NotNull VideoAd videoAd);

    boolean isPlayingAd(@NotNull VideoAd videoAd);

    void pauseAd(@NotNull VideoAd videoAd);

    void playAd(@NotNull VideoAd videoAd);

    void prepareAd(@NotNull VideoAd videoAd);

    void releaseAd(@NotNull VideoAd videoAd);

    void resumeAd(@NotNull VideoAd videoAd);

    void setInstreamAdPlayerListener(@Nullable InstreamAdPlayerListener instreamAdPlayerListener);

    void setVolume(@NotNull VideoAd videoAd, float f);

    void skipAd(@NotNull VideoAd videoAd);

    void stopAd(@NotNull VideoAd videoAd);
}

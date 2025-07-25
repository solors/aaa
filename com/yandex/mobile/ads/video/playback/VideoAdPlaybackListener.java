package com.yandex.mobile.ads.video.playback;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface VideoAdPlaybackListener {
    void onAdClicked(@NotNull VideoAd videoAd);

    void onAdCompleted(@NotNull VideoAd videoAd);

    void onAdError(@NotNull VideoAd videoAd);

    void onAdPaused(@NotNull VideoAd videoAd);

    void onAdPrepared(@NotNull VideoAd videoAd);

    void onAdResumed(@NotNull VideoAd videoAd);

    void onAdSkipped(@NotNull VideoAd videoAd);

    void onAdStarted(@NotNull VideoAd videoAd);

    void onAdStopped(@NotNull VideoAd videoAd);

    void onImpression(@NotNull VideoAd videoAd);

    void onVolumeChanged(@NotNull VideoAd videoAd, float f);
}

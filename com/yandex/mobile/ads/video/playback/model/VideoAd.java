package com.yandex.mobile.ads.video.playback.model;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public interface VideoAd {
    @NotNull
    VideoAdInfo getAdInfo();

    @NotNull
    AdPodInfo getAdPodInfo();

    long getDuration();

    @Nullable
    String getInfo();

    @NotNull
    MediaFile getMediaFile();

    @NotNull
    List<MediaFile> getMediaFiles();

    @Nullable
    SkipInfo getSkipInfo();
}

package com.yandex.mobile.ads.video.playback.model;

import com.yandex.mobile.ads.impl.a72;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public interface MediaFile extends a72 {
    int getAdHeight();

    int getAdWidth();

    @Nullable
    String getApiFramework();

    @Nullable
    Integer getBitrate();

    @Nullable
    String getMediaType();

    @Override // com.yandex.mobile.ads.impl.a72
    @NotNull
    String getUrl();
}

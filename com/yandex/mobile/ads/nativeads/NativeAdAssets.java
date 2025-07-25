package com.yandex.mobile.ads.nativeads;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public interface NativeAdAssets {
    @Nullable
    String getAge();

    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    String getDomain();

    @Nullable
    NativeAdImage getFavicon();

    @Nullable
    NativeAdImage getIcon();

    @Nullable
    NativeAdImage getImage();

    @Nullable
    NativeAdMedia getMedia();

    @Nullable
    String getPrice();

    @Nullable
    Float getRating();

    @Nullable
    String getReviewCount();

    @Nullable
    String getSponsored();

    @Nullable
    String getTitle();

    @Nullable
    String getWarning();

    boolean isFeedbackAvailable();
}

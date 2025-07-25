package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface NativeAd {
    void addImageLoadingListener(@NotNull NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void bindNativeAd(@NotNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    @NotNull
    NativeAdAssets getAdAssets();

    @NotNull
    NativeAdType getAdType();

    @Nullable
    String getInfo();

    void loadImages();

    void removeImageLoadingListener(@NotNull NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void setNativeAdEventListener(@Nullable NativeAdEventListener nativeAdEventListener);
}

package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import kotlin.Metadata;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface ClosableNativeAdEventListener extends NativeAdEventListener {
    void closeNativeAd();
}

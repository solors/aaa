package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(@Nullable ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}

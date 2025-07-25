package com.yandex.mobile.ads.feed;

import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public interface FeedAdEventListener {
    void onAdClicked();

    void onImpression(@Nullable ImpressionData impressionData);
}

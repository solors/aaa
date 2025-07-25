package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface POBBaseAd {
    void destroy();

    @Nullable
    POBRequest getAdRequest();

    @Nullable
    POBImpression getImpression();

    void loadAd();
}

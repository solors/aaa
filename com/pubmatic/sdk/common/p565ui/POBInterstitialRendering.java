package com.pubmatic.sdk.common.p565ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

/* renamed from: com.pubmatic.sdk.common.ui.POBInterstitialRendering */
/* loaded from: classes7.dex */
public interface POBInterstitialRendering {
    void destroy();

    void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    void setAdRendererListener(@Nullable POBInterstitialRendererListener pOBInterstitialRendererListener);

    void setVideoAdEventListener(@Nullable POBVideoAdEventListener pOBVideoAdEventListener);

    void show(int i);
}

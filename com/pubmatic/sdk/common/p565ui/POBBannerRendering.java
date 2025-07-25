package com.pubmatic.sdk.common.p565ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;

/* renamed from: com.pubmatic.sdk.common.ui.POBBannerRendering */
/* loaded from: classes7.dex */
public interface POBBannerRendering {
    void destroy();

    void invalidateExpiration();

    void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener);
}

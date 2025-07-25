package com.pubmatic.sdk.video.renderer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;
import com.pubmatic.sdk.common.p565ui.POBBannerRendering;

/* loaded from: classes7.dex */
public interface POBVideoRendering extends POBBannerRendering {
    @Override // com.pubmatic.sdk.common.p565ui.POBBannerRendering
    void destroy();

    @Override // com.pubmatic.sdk.common.p565ui.POBBannerRendering
    /* synthetic */ void invalidateExpiration();

    void proceedAdSkip(boolean z);

    @Override // com.pubmatic.sdk.common.p565ui.POBBannerRendering
    /* synthetic */ void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    @Override // com.pubmatic.sdk.common.p565ui.POBBannerRendering
    /* synthetic */ void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener);

    void setVideoRenderingListener(@Nullable POBVideoRenderingListener pOBVideoRenderingListener);

    void setVideoSkipEventListener(@Nullable POBVideoSkipEventListener pOBVideoSkipEventListener);
}

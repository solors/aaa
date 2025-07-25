package com.pubmatic.sdk.common.p565ui;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

/* renamed from: com.pubmatic.sdk.common.ui.POBRewardedAdRendering */
/* loaded from: classes7.dex */
public interface POBRewardedAdRendering {
    void destroy();

    void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    void setAdRendererListener(@NonNull POBRewardedAdRendererListener pOBRewardedAdRendererListener);

    void show();
}

package com.pubmatic.sdk.video.renderer;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;

/* loaded from: classes7.dex */
public interface POBVideoRenderingListener {
    void notifyAdEvent(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType);

    void onSkipOptionUpdate(boolean z);
}

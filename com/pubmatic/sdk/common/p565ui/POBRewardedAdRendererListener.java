package com.pubmatic.sdk.common.p565ui;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBDataType$POBVideoAdEventType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

@MainThread
/* renamed from: com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener */
/* loaded from: classes7.dex */
public interface POBRewardedAdRendererListener {
    void onAdClicked();

    @Deprecated
    void onAdEventOccurred(@NonNull POBDataType$POBVideoAdEventType pOBDataType$POBVideoAdEventType);

    void onAdExpired();

    void onAdImpression();

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdRender(@Nullable POBAdDescriptor pOBAdDescriptor);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onLeavingApplication();

    void onReceiveReward(@Nullable POBCoreReward pOBCoreReward);
}

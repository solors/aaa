package com.pubmatic.sdk.video.player;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;

/* loaded from: classes7.dex */
public interface POBVastPlayerListener {
    void onClose();

    void onDsaInfoIconClick();

    void onEndCardWillLeaveApp();

    void onFailedToPlay(@NonNull POBError pOBError);

    void onIndustryIconClick(@Nullable String str);

    void onOpenLandingPage(@Nullable String str);

    void onPlaybackCompleted(float f);

    void onReadyToPlay(@Nullable POBVastAd pOBVastAd, float f);

    void onSkip();

    void onVideoEventOccurred(@NonNull POBVastCreative.POBEventTypes pOBEventTypes);

    void onVideoStarted(float f, float f2);

    void shouldForwardClickEvent();
}

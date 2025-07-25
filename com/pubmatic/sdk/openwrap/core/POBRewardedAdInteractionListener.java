package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;

/* loaded from: classes7.dex */
public interface POBRewardedAdInteractionListener extends POBFullScreenAdInteractionListener {
    void trackAdComplete(@Nullable POBReward pOBReward);

    @Override // com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener
    /* synthetic */ void trackAdDismissed();

    @Override // com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener
    /* synthetic */ void trackAdFailed(POBError pOBError);

    @Override // com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener
    /* synthetic */ void trackAdShown();

    @Override // com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener
    /* synthetic */ void trackClick();

    @Override // com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener
    /* synthetic */ void trackImpression();
}

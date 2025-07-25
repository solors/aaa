package com.pubmatic.sdk.openwrap.core;

import com.pubmatic.sdk.common.POBError;

/* loaded from: classes7.dex */
public interface POBFullScreenAdInteractionListener {
    void trackAdDismissed();

    void trackAdFailed(POBError pOBError);

    void trackAdShown();

    void trackClick();

    void trackImpression();
}

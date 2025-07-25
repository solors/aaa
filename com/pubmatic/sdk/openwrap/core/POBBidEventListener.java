package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;

/* loaded from: classes7.dex */
public interface POBBidEventListener {
    void onBidFailed(@NonNull POBBidEvent pOBBidEvent, @NonNull POBError pOBError);

    void onBidReceived(@NonNull POBBidEvent pOBBidEvent, @NonNull POBBid pOBBid);
}

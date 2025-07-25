package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@MainThread
/* loaded from: classes7.dex */
public interface POBBidEvent {

    /* loaded from: classes7.dex */
    public enum BidEventError {
        CLIENT_SIDE_AUCTION_LOSS("BidEventErrorClientSideAuctionLoss"),
        BID_EXPIRED("BidEventErrorBidExpired"),
        OTHER("BidEventErrorOther");
        
        @NonNull

        /* renamed from: b */
        private final String f70614b;

        BidEventError(@NonNull String str) {
            this.f70614b = str;
        }

        @NonNull
        public String getErrorMessage() {
            return this.f70614b;
        }
    }

    @Nullable
    POBBid getBid();

    void proceedOnError(@NonNull BidEventError bidEventError, @NonNull String str);

    boolean proceedToLoadAd();

    void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener);
}

package com.pubmatic.sdk.openwrap.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.POBBid;

/* loaded from: classes7.dex */
public class POBDefaultInterstitialEventHandler extends POBInterstitialEvent {
    @Nullable

    /* renamed from: a */
    private POBInterstitialEventListener f70753a;

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.f70753a = null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        if (this.f70753a != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.f70753a.onOpenWrapPartnerWin(pOBBid.getId());
                return;
            }
            this.f70753a.onFailedToLoad(prepareErrorFromResponse(this.f70753a.getBidsProvider()));
        }
    }

    @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEvent
    public void setEventListener(@NonNull POBInterstitialEventListener pOBInterstitialEventListener) {
        this.f70753a = pOBInterstitialEventListener;
    }
}

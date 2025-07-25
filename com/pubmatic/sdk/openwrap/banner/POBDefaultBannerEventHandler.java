package com.pubmatic.sdk.openwrap.banner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.openwrap.core.POBBid;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class POBDefaultBannerEventHandler extends POBBannerEvent {
    @Nullable

    /* renamed from: a */
    private POBAdSize[] f70570a;
    @Nullable

    /* renamed from: b */
    private POBBannerEventListener f70571b;

    public POBDefaultBannerEventHandler(@NonNull POBAdSize... pOBAdSizeArr) {
        this.f70570a = pOBAdSizeArr;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.f70571b = null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        if (this.f70571b != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.f70571b.onOpenWrapPartnerWin(pOBBid.getId());
                return;
            }
            this.f70571b.onFailed(prepareErrorFromResponse(this.f70571b.getBidsProvider()));
        }
    }

    @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEvent
    @Nullable
    public POBAdSize[] requestedAdSizes() {
        POBAdSize[] pOBAdSizeArr = this.f70570a;
        if (pOBAdSizeArr != null) {
            return (POBAdSize[]) Arrays.copyOf(pOBAdSizeArr, pOBAdSizeArr.length);
        }
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEvent
    public void setEventListener(@NonNull POBBannerEventListener pOBBannerEventListener) {
        this.f70571b = pOBBannerEventListener;
    }

    public POBDefaultBannerEventHandler() {
    }
}

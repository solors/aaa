package com.pubmatic.sdk.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdServerSignalingEventListener;
import com.pubmatic.sdk.openwrap.core.POBBid;

/* loaded from: classes7.dex */
public class POBDefaultNativeEventHandler extends POBNativeAdEvent {
    @Override // com.pubmatic.sdk.nativead.POBNativeAdEvent
    @NonNull
    public POBNativeAdEventBridge createNativeAdEventBridge() {
        return new POBDefaultNativeAdEventBridge();
    }

    /* loaded from: classes7.dex */
    protected static class POBDefaultNativeAdEventBridge extends POBNativeAdEventBridge {
        @Nullable

        /* renamed from: a */
        private POBAdServerSignalingEventListener f70396a;

        protected POBDefaultNativeAdEventBridge() {
        }

        @Override // com.pubmatic.sdk.nativead.POBNativeAdEventBridge
        @Nullable
        public View getAdServerView() {
            return null;
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
        public void requestAd(@Nullable POBBid pOBBid) {
            if (this.f70396a != null) {
                if (pOBBid != null && pOBBid.getStatus() == 1) {
                    this.f70396a.onOpenWrapPartnerWin(pOBBid.getId());
                    return;
                }
                this.f70396a.onFailed(prepareErrorFromResponse(this.f70396a.getBidsProvider()));
            }
        }

        @Override // com.pubmatic.sdk.nativead.POBNativeAdEventBridge
        public void setSignalingEventListener(@NonNull POBAdServerSignalingEventListener pOBAdServerSignalingEventListener) {
            this.f70396a = pOBAdServerSignalingEventListener;
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
        public void destroy() {
        }

        @Override // com.pubmatic.sdk.nativead.POBNativeAdEventBridge
        public void trackClick() {
        }

        @Override // com.pubmatic.sdk.nativead.POBNativeAdEventBridge
        public void trackImpression() {
        }

        @Override // com.pubmatic.sdk.nativead.POBNativeAdEventBridge
        public void setNativeAdEventListener(@NonNull POBNativeAdEventListener pOBNativeAdEventListener) {
        }
    }
}

package com.pubmatic.sdk.rewardedad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBReward;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBDefaultRewardedAdEventHandler extends POBRewardedAdEvent {
    @Nullable

    /* renamed from: a */
    private POBRewardedAdEventListener f70780a;
    @Nullable

    /* renamed from: b */
    private POBBid f70781b;
    @Nullable

    /* renamed from: c */
    private Map<String, Object> f70782c;

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.f70781b = null;
        this.f70780a = null;
        this.f70782c = null;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    @Nullable
    public Map<String, String> getAdServerConfig() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID, "true");
        return hashMap;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    @Nullable
    public List<POBReward> getAdServerRewards() {
        POBBid pOBBid = this.f70781b;
        if (pOBBid != null) {
            return pOBBid.getAllRewards();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    @Nullable
    public POBReward getSelectedReward() {
        POBReward pOBReward;
        POBBid pOBBid = this.f70781b;
        if (pOBBid != null) {
            pOBReward = pOBBid.getFirstReward();
        } else {
            pOBReward = null;
        }
        Map<String, Object> map = this.f70782c;
        if (map != null) {
            Object obj = map.get(OpenWrapSDK.KEY_SELECTED_REWARD);
            List<POBReward> adServerRewards = getAdServerRewards();
            if (adServerRewards != null && obj != null) {
                for (POBReward pOBReward2 : adServerRewards) {
                    if (pOBReward2.equals(obj)) {
                        return (POBReward) obj;
                    }
                }
                return pOBReward;
            }
            return pOBReward;
        }
        return pOBReward;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        this.f70782c = null;
        if (this.f70780a != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.f70781b = pOBBid;
                this.f70780a.onOpenWrapPartnerWin(pOBBid.getId());
                return;
            }
            this.f70781b = null;
            this.f70780a.onFailedToLoad(prepareErrorFromResponse(this.f70780a.getBidsProvider()));
        }
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    public void setCustomData(@Nullable Map<String, Object> map) {
        this.f70782c = map;
    }

    @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEvent
    public void setEventListener(@NonNull POBRewardedAdEventListener pOBRewardedAdEventListener) {
        this.f70780a = pOBRewardedAdEventListener;
    }
}

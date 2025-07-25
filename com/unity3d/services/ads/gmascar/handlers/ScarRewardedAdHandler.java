package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import p715i8.ScarAdMetadata;

/* loaded from: classes7.dex */
public class ScarRewardedAdHandler extends ScarAdHandlerBase implements IScarRewardedAdListenerWrapper {
    private boolean _hasEarnedReward;

    public ScarRewardedAdHandler(ScarAdMetadata scarAdMetadata, EventSubject<GMAEvent> eventSubject, GMAEventSender gMAEventSender) {
        super(scarAdMetadata, eventSubject, gMAEventSender);
        this._hasEarnedReward = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdFailedToShow(int i, String str) {
        this._gmaEventSender.send(GMAEvent.REWARDED_SHOW_ERROR, this._scarAdMetadata.m23099c(), this._scarAdMetadata.m23098d(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdImpression() {
        this._gmaEventSender.send(GMAEvent.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(GMAEvent.AD_SKIPPED, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(GMAEvent.AD_EARNED_REWARD, new Object[0]);
    }
}

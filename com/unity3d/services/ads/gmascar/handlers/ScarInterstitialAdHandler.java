package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import p715i8.ScarAdMetadata;

/* loaded from: classes7.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase implements IScarInterstitialAdListenerWrapper {
    public ScarInterstitialAdHandler(ScarAdMetadata scarAdMetadata, EventSubject<GMAEvent> eventSubject, GMAEventSender gMAEventSender) {
        super(scarAdMetadata, eventSubject, gMAEventSender);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdFailedToShow(int i, String str) {
        this._gmaEventSender.send(GMAEvent.INTERSTITIAL_SHOW_ERROR, this._scarAdMetadata.m23099c(), this._scarAdMetadata.m23098d(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdImpression() {
        this._gmaEventSender.send(GMAEvent.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(GMAEvent.AD_LEFT_APPLICATION, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(GMAEvent.AD_SKIPPED, new Object[0]);
    }
}

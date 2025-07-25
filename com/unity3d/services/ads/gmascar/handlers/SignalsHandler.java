package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import p741j8.ISignalCollectionListener;

/* loaded from: classes7.dex */
public class SignalsHandler implements ISignalCollectionListener {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // p741j8.ISignalCollectionListener
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(GMAEvent.SIGNALS, str);
    }

    @Override // p741j8.ISignalCollectionListener
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(GMAEvent.SIGNALS_ERROR, str);
    }
}

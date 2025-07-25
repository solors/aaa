package com.pubmatic.sdk.omsdk;

import com.iab.omid.library.pubmatic.adsession.AdSession;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.omsdk.POBNativeMeasurement;

/* renamed from: com.pubmatic.sdk.omsdk.a */
/* loaded from: classes7.dex */
class RunnableC26782a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBNativeMeasurement.C26778a f70531a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26782a(POBNativeMeasurement.C26778a c26778a) {
        this.f70531a = c26778a;
    }

    @Override // java.lang.Runnable
    public void run() {
        AdSession adSession = POBNativeMeasurement.this.adSession;
        if (adSession != null) {
            adSession.start();
            POBLog.debug(POBOMSDKUtil.TAG, "Ad session started : %s", POBNativeMeasurement.this.adSession.getAdSessionId());
            this.f70531a.f70521c.onOmidSessionInitialized();
        }
    }
}

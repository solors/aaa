package com.pubmatic.sdk.common.cache;

import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;

/* renamed from: com.pubmatic.sdk.common.cache.a */
/* loaded from: classes7.dex */
class RunnableC26698a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f70101a;

    /* renamed from: b */
    final /* synthetic */ POBCacheManager.RunnableC26694a f70102b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26698a(POBCacheManager.RunnableC26694a runnableC26694a, String str) {
        this.f70102b = runnableC26694a;
        this.f70101a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        String str;
        POBCacheManager.RunnableC26694a runnableC26694a;
        POBMeasurementProvider.POBScriptListener pOBScriptListener;
        String str2;
        obj = POBCacheManager.this.f70084i;
        synchronized (obj) {
            POBCacheManager.this.f70082g = this.f70101a;
            str = POBCacheManager.this.f70082g;
            if (str != null && (pOBScriptListener = (runnableC26694a = this.f70102b).f70091a) != null) {
                str2 = POBCacheManager.this.f70082g;
                pOBScriptListener.onMeasurementScriptReceived(str2);
            }
        }
    }
}

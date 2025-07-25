package com.five_corp.p372ad.internal.tracking_data;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.five_corp.ad.internal.tracking_data.b */
/* loaded from: classes4.dex */
public final class C14108b {

    /* renamed from: a */
    public final Context f26727a;

    public C14108b(Context context) {
        this.f26727a = context;
    }

    /* renamed from: a */
    public final C14107a m78097a() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            for (int i = 1; i <= 3; i++) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f26727a);
                    if (advertisingIdInfo != null) {
                        return new C14107a(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
                    }
                } catch (Exception unused) {
                }
            }
            return new C14107a(null, true);
        }
        throw new RuntimeException("UI Thread cannot run this method");
    }
}

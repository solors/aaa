package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.s */
/* loaded from: classes7.dex */
public final class C26404s {

    /* renamed from: a */
    boolean f68840a = false;

    /* renamed from: b */
    boolean f68841b = true;

    /* renamed from: c */
    String f68842c;

    /* renamed from: a */
    public void m41723a(Context context) {
        if (this.f68840a) {
            return;
        }
        m41721b(context);
        this.f68840a = true;
    }

    /* renamed from: b */
    void m41721b(Context context) {
        C26468z0.m41528a("get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f68842c = advertisingIdInfo.getId();
            C26468z0.m41528a("AId: " + this.f68842c);
            this.f68841b = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            C26468z0.m41528a("AId ad tracking enabled: " + this.f68841b);
        } catch (Throwable th) {
            C26468z0.m41524b("failed to get google AId", th);
        }
    }

    /* renamed from: a */
    public void m41722a(C26405s0 c26405s0, Context context) {
        if (TextUtils.isEmpty(this.f68842c)) {
            return;
        }
        c26405s0.m41705a(this.f68842c, this.f68841b);
    }

    /* renamed from: c */
    public void m41720c(Context context) {
    }
}

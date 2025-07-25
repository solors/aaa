package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.a0 */
/* loaded from: classes7.dex */
public final class C26289a0 {

    /* renamed from: b */
    String f68478b;

    /* renamed from: a */
    boolean f68477a = false;

    /* renamed from: c */
    boolean f68479c = true;

    /* renamed from: a */
    public void m42204a(Context context) {
        if (this.f68477a) {
            return;
        }
        this.f68477a = true;
        m42202b(context);
    }

    /* renamed from: b */
    void m42202b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f68478b = advertisingIdInfo.getId();
            C26468z0.m41528a("HuaweiAIdDataProvider: oaid: " + this.f68478b);
            this.f68479c = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            C26468z0.m41528a("HuaweiAIdDataProvider: oaid tracking enabled: " + this.f68479c);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m42203a(C26405s0 c26405s0, Context context) {
        if (TextUtils.isEmpty(this.f68478b)) {
            return;
        }
        c26405s0.m41693b(this.f68478b, this.f68479c);
    }

    /* renamed from: c */
    public void m42201c(Context context) {
    }
}

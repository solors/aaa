package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.ZU */
/* loaded from: assets/audience_network.dex */
public class C13005ZU implements InterfaceC113297n {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C13004ZT A01;

    public C13005ZU(C13004ZT c13004zt, AdvertisingId advertisingId) {
        this.A01 = c13004zt;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113297n
    public final boolean A9W() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113297n
    public final String getId() {
        return this.A00.getId();
    }
}

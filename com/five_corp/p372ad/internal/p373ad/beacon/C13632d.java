package com.five_corp.p372ad.internal.p373ad.beacon;

/* renamed from: com.five_corp.ad.internal.ad.beacon.d */
/* loaded from: classes4.dex */
public final class C13632d {

    /* renamed from: a */
    public final EnumC13633e f25252a;

    /* renamed from: b */
    public final String f25253b;

    /* renamed from: c */
    public final C13629a f25254c;

    public C13632d(EnumC13633e enumC13633e, String str, C13629a c13629a) {
        this.f25252a = enumC13633e;
        this.f25253b = str;
        this.f25254c = c13629a;
    }

    public final String toString() {
        return "ExtraTrackingBeacon{extraTrackingEventType=" + this.f25252a + ", beaconCondition=" + String.valueOf(this.f25254c) + ", url='" + this.f25253b + "'}";
    }
}

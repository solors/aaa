package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dv */
/* loaded from: assets/audience_network.dex */
public final class C11703Dv {
    public final int A00;
    public final long A01;
    public final long A02;

    public C11703Dv(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C11703Dv(int i, long j, long j2, C11702Du c11702Du) {
        this(i, j, j2);
    }

    public static C11703Dv A00(Parcel parcel) {
        return new C11703Dv(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}

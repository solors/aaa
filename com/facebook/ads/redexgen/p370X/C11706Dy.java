package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dy */
/* loaded from: assets/audience_network.dex */
public final class C11706Dy {
    public final int A00;
    public final long A01;

    public C11706Dy(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C11706Dy(int i, long j, C11705Dx c11705Dx) {
        this(i, j);
    }

    public static C11706Dy A00(Parcel parcel) {
        return new C11706Dy(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}

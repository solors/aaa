package com.facebook.ads.redexgen.p370X;

import android.net.Uri;

/* renamed from: com.facebook.ads.redexgen.X.XW */
/* loaded from: assets/audience_network.dex */
public final class C12886XW {
    public InterfaceC11586C0 A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final InterfaceC11871Gy A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public C12886XW(InterfaceC11871Gy interfaceC11871Gy) {
        this.A06 = interfaceC11871Gy;
    }

    public final C12886XW A00(String str) {
        AbstractC11914Hf.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final C11674DQ A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C12966Yr();
        }
        return new C11674DQ(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}

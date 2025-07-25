package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.6F */
/* loaded from: assets/audience_network.dex */
public final class C112476F {
    public final long A00;
    public final EnumC112466E A01;
    public final String A02;
    public final boolean A03;

    public C112476F(String str, boolean z, EnumC112466E enumC112466E) {
        this(str, z, enumC112466E, System.currentTimeMillis());
    }

    public C112476F(String str, boolean z, EnumC112466E enumC112466E, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC112466E;
        this.A00 = j;
    }

    public static C112476F A00() {
        return new C112476F("", true, EnumC112466E.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC112466E A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}

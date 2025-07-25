package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.A2 */
/* loaded from: assets/audience_network.dex */
public final class C11466A2 {
    public static String[] A04 = {"", "VtJRvyPxmOImdsyLi4M2", "Gm1PRIYmvz", "uPcs22Bv4Ecng1eDU86bpHQLBlw1u", "FddESRKU", "iRaMLR8dbHBCXOgyzzarEjyYAsYlFtS", "", "bNCmKEz4NkHWTfLh0ykYoXiICiHkm4jm"};
    public static final C11466A2 A05 = new C11466A2(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C11466A2(float f) {
        this(f, 1.0f, false);
    }

    public C11466A2(float f, float f2, boolean z) {
        AbstractC11914Hf.A03(f > 0.0f);
        AbstractC11914Hf.A03(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f);
    }

    public final long A00(long j) {
        return this.A03 * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11466A2 c11466a2 = (C11466A2) obj;
        if (this.A01 == c11466a2.A01) {
            float f = this.A00;
            if (A04[6].length() == 0) {
                String[] strArr = A04;
                strArr[5] = "hwWatJQYKhKE8FUxymmZjRx10ScAWIj";
                strArr[3] = "Hxeg71DMLMKL7cxntL9BIHkxZ6VOo";
                if (f == c11466a2.A00) {
                    boolean z = this.A02;
                    boolean z2 = c11466a2.A02;
                    if (A04[7].charAt(4) != 'a') {
                        A04[6] = "";
                        if (z == z2) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        int result2 = this.A02 ? 1 : 0;
        return (((((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + result2;
    }
}

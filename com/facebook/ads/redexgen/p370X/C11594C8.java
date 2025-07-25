package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.C8 */
/* loaded from: assets/audience_network.dex */
public final class C11594C8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C11594C8(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11594C8 c11594c8 = (C11594C8) obj;
        if (this.A01 == c11594c8.A01 && this.A02 == c11594c8.A02 && this.A00 == c11594c8.A00 && Arrays.equals(this.A03, c11594c8.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = this.A00;
        return ((((i + result2) * 31) + this.A02) * 31) + result3;
    }
}

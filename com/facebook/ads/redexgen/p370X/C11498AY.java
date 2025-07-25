package com.facebook.ads.redexgen.p370X;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.AY */
/* loaded from: assets/audience_network.dex */
public final class C11498AY {
    public static final C11498AY A04 = new C11497AX().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C11498AY(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11498AY c11498ay = (C11498AY) obj;
        return this.A01 == c11498ay.A01 && this.A02 == c11498ay.A02 && this.A03 == c11498ay.A03;
    }

    public final int hashCode() {
        int result = this.A01;
        int result2 = this.A03;
        return (((((17 * 31) + result) * 31) + this.A02) * 31) + result2;
    }
}

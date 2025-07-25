package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.Gb */
/* loaded from: assets/audience_network.dex */
public final class C11850Gb {
    public final int A00;
    public final int A01;
    public final String A02;

    public C11850Gb(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11850Gb c11850Gb = (C11850Gb) obj;
        if (this.A00 == c11850Gb.A00 && this.A01 == c11850Gb.A01 && TextUtils.equals(this.A02, c11850Gb.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i = result * 31;
        int result2 = this.A01;
        int result3 = (i + result2) * 31;
        int result4 = this.A02 != null ? this.A02.hashCode() : 0;
        return result3 + result4;
    }
}

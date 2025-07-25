package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.DT */
/* loaded from: assets/audience_network.dex */
public final class C11677DT {
    public final String A00;
    public final boolean A01;

    public C11677DT(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != C11677DT.class) {
            return false;
        }
        C11677DT c11677dt = (C11677DT) obj;
        return TextUtils.equals(this.A00, c11677dt.A00) && this.A01 == c11677dt.A01;
    }

    public final int hashCode() {
        int result = 1 * 31;
        int prime = this.A00 == null ? 0 : this.A00.hashCode();
        int result2 = (result + prime) * 31;
        int prime2 = this.A01 ? 1231 : 1237;
        return result2 + prime2;
    }
}

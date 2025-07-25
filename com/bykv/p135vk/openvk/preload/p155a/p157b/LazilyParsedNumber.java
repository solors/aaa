package com.bykv.p135vk.openvk.preload.p155a.p157b;

import java.math.BigDecimal;

/* renamed from: com.bykv.vk.openvk.preload.a.b.f */
/* loaded from: classes3.dex */
public final class LazilyParsedNumber extends Number {

    /* renamed from: a */
    private final String f13776a;

    public LazilyParsedNumber(String str) {
        this.f13776a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f13776a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        String str = this.f13776a;
        String str2 = ((LazilyParsedNumber) obj).f13776a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f13776a);
    }

    public final int hashCode() {
        return this.f13776a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f13776a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f13776a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f13776a);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f13776a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f13776a).longValue();
        }
    }

    public final String toString() {
        return this.f13776a;
    }
}

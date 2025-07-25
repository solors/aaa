package com.applovin.impl;

/* renamed from: com.applovin.impl.w6 */
/* loaded from: classes2.dex */
public final class C5757w6 {

    /* renamed from: a */
    public final int f11671a;

    /* renamed from: b */
    public final int f11672b;

    /* renamed from: c */
    public final String f11673c;

    private C5757w6(int i, int i2, String str) {
        this.f11671a = i;
        this.f11672b = i2;
        this.f11673c = str;
    }

    /* renamed from: a */
    public static C5757w6 m93675a(C4066ah c4066ah) {
        String str;
        c4066ah.m100778g(2);
        int m100762w = c4066ah.m100762w();
        int i = m100762w >> 1;
        int m100762w2 = ((c4066ah.m100762w() >> 3) & 31) | ((m100762w & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i);
        if (m100762w2 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(m100762w2);
        return new C5757w6(i, m100762w2, sb2.toString());
    }
}

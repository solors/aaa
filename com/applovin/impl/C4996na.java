package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.na */
/* loaded from: classes2.dex */
public final class C4996na {

    /* renamed from: a */
    public final List f8529a;

    /* renamed from: b */
    public final int f8530b;

    /* renamed from: c */
    public final String f8531c;

    private C4996na(List list, int i, String str) {
        this.f8529a = list;
        this.f8530b = i;
        this.f8531c = str;
    }

    /* renamed from: a */
    public static C4996na m97026a(C4066ah c4066ah) {
        List singletonList;
        try {
            c4066ah.m100778g(21);
            int m100762w = c4066ah.m100762w() & 3;
            int m100762w2 = c4066ah.m100762w();
            int m100785d = c4066ah.m100785d();
            int i = 0;
            for (int i2 = 0; i2 < m100762w2; i2++) {
                c4066ah.m100778g(1);
                int m100799C = c4066ah.m100799C();
                for (int i3 = 0; i3 < m100799C; i3++) {
                    int m100799C2 = c4066ah.m100799C();
                    i += m100799C2 + 4;
                    c4066ah.m100778g(m100799C2);
                }
            }
            c4066ah.m100780f(m100785d);
            byte[] bArr = new byte[i];
            int i4 = 0;
            String str = null;
            for (int i5 = 0; i5 < m100762w2; i5++) {
                int m100762w3 = c4066ah.m100762w() & 127;
                int m100799C3 = c4066ah.m100799C();
                for (int i6 = 0; i6 < m100799C3; i6++) {
                    int m100799C4 = c4066ah.m100799C();
                    byte[] bArr2 = AbstractC5912yf.f12322a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(c4066ah.m100787c(), c4066ah.m100785d(), bArr, length, m100799C4);
                    if (m100762w3 == 33 && i6 == 0) {
                        str = AbstractC5046o3.m96879a(new C4123bh(bArr, length, length + m100799C4));
                    }
                    i4 = length + m100799C4;
                    c4066ah.m100778g(m100799C4);
                }
            }
            if (i == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C4996na(singletonList, m100762w + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C4187ch.m100188a("Error parsing HEVC config", e);
        }
    }
}

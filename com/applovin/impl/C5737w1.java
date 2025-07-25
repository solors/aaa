package com.applovin.impl;

import com.applovin.impl.AbstractC5912yf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.w1 */
/* loaded from: classes2.dex */
public final class C5737w1 {

    /* renamed from: a */
    public final List f11590a;

    /* renamed from: b */
    public final int f11591b;

    /* renamed from: c */
    public final int f11592c;

    /* renamed from: d */
    public final int f11593d;

    /* renamed from: e */
    public final float f11594e;

    /* renamed from: f */
    public final String f11595f;

    private C5737w1(List list, int i, int i2, int i3, float f, String str) {
        this.f11590a = list;
        this.f11591b = i;
        this.f11592c = i2;
        this.f11593d = i3;
        this.f11594e = f;
        this.f11595f = str;
    }

    /* renamed from: a */
    private static byte[] m93755a(C4066ah c4066ah) {
        int m100799C = c4066ah.m100799C();
        int m100785d = c4066ah.m100785d();
        c4066ah.m100778g(m100799C);
        return AbstractC5046o3.m96875a(c4066ah.m100787c(), m100785d, m100799C);
    }

    /* renamed from: b */
    public static C5737w1 m93754b(C4066ah c4066ah) {
        int i;
        int i2;
        float f;
        String str;
        try {
            c4066ah.m100778g(4);
            int m100762w = (c4066ah.m100762w() & 3) + 1;
            if (m100762w != 3) {
                ArrayList arrayList = new ArrayList();
                int m100762w2 = c4066ah.m100762w() & 31;
                for (int i3 = 0; i3 < m100762w2; i3++) {
                    arrayList.add(m93755a(c4066ah));
                }
                int m100762w3 = c4066ah.m100762w();
                for (int i4 = 0; i4 < m100762w3; i4++) {
                    arrayList.add(m93755a(c4066ah));
                }
                if (m100762w2 > 0) {
                    AbstractC5912yf.C5914b m92745c = AbstractC5912yf.m92745c((byte[]) arrayList.get(0), m100762w, ((byte[]) arrayList.get(0)).length);
                    int i5 = m92745c.f12333e;
                    int i6 = m92745c.f12334f;
                    float f2 = m92745c.f12335g;
                    str = AbstractC5046o3.m96880a(m92745c.f12329a, m92745c.f12330b, m92745c.f12331c);
                    i = i5;
                    i2 = i6;
                    f = f2;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new C5737w1(arrayList, m100762w, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C4187ch.m100188a("Error parsing AVC config", e);
        }
    }
}

package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.x01;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.rh */
/* loaded from: classes8.dex */
public final class C31284rh {

    /* renamed from: a */
    public final List<byte[]> f84756a;

    /* renamed from: b */
    public final int f84757b;

    /* renamed from: c */
    public final int f84758c;

    /* renamed from: d */
    public final int f84759d;

    /* renamed from: e */
    public final float f84760e;
    @Nullable

    /* renamed from: f */
    public final String f84761f;

    private C31284rh(ArrayList arrayList, int i, int i2, int i3, float f, @Nullable String str) {
        this.f84756a = arrayList;
        this.f84757b = i;
        this.f84758c = i2;
        this.f84759d = i3;
        this.f84760e = f;
        this.f84761f = str;
    }

    /* renamed from: a */
    public static C31284rh m30050a(cc1 cc1Var) throws gc1 {
        int i;
        int i2;
        float f;
        String str;
        try {
            cc1Var.m35284f(4);
            int m35270t = (cc1Var.m35270t() & 3) + 1;
            if (m35270t != 3) {
                ArrayList arrayList = new ArrayList();
                int m35270t2 = cc1Var.m35270t() & 31;
                for (int i3 = 0; i3 < m35270t2; i3++) {
                    int m35264z = cc1Var.m35264z();
                    int m35289d = cc1Var.m35289d();
                    cc1Var.m35284f(m35264z);
                    arrayList.add(C30575ip.m33156a(cc1Var.m35291c(), m35289d, m35264z));
                }
                int m35270t3 = cc1Var.m35270t();
                for (int i4 = 0; i4 < m35270t3; i4++) {
                    int m35264z2 = cc1Var.m35264z();
                    int m35289d2 = cc1Var.m35289d();
                    cc1Var.m35284f(m35264z2);
                    arrayList.add(C30575ip.m33156a(cc1Var.m35291c(), m35289d2, m35264z2));
                }
                if (m35270t2 > 0) {
                    x01.C31784c m27710b = x01.m27710b((byte[]) arrayList.get(0), m35270t, ((byte[]) arrayList.get(0)).length);
                    int i5 = m27710b.f87471e;
                    int i6 = m27710b.f87472f;
                    float f2 = m27710b.f87473g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(m27710b.f87467a), Integer.valueOf(m27710b.f87468b), Integer.valueOf(m27710b.f87469c));
                    f = f2;
                    i2 = i6;
                    i = i5;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new C31284rh(arrayList, m35270t, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw gc1.m33885a("Error parsing AVC config", e);
        }
    }
}

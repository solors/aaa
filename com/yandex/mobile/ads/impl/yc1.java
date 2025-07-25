package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C31840xt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes8.dex */
public final class yc1 extends eu1 {

    /* renamed from: m */
    private final cc1 f88145m = new cc1();

    /* renamed from: n */
    private final cc1 f88146n = new cc1();

    /* renamed from: o */
    private final C31882a f88147o = new C31882a();
    @Nullable

    /* renamed from: p */
    private Inflater f88148p;

    /* renamed from: com.yandex.mobile.ads.impl.yc1$a */
    /* loaded from: classes8.dex */
    private static final class C31882a {

        /* renamed from: a */
        private final cc1 f88149a = new cc1();

        /* renamed from: b */
        private final int[] f88150b = new int[256];

        /* renamed from: c */
        private boolean f88151c;

        /* renamed from: d */
        private int f88152d;

        /* renamed from: e */
        private int f88153e;

        /* renamed from: f */
        private int f88154f;

        /* renamed from: g */
        private int f88155g;

        /* renamed from: h */
        private int f88156h;

        /* renamed from: i */
        private int f88157i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.eu1
    /* renamed from: a */
    protected final oy1 mo26966a(byte[] bArr, int i, boolean z) throws qy1 {
        cc1 cc1Var;
        boolean z2;
        C31840xt c31840xt;
        int i2;
        int i3;
        int m35267w;
        this.f88145m.m35296a(i, bArr);
        cc1 cc1Var2 = this.f88145m;
        if (cc1Var2.m35299a() > 0 && cc1Var2.m35283g() == 120) {
            if (this.f88148p == null) {
                this.f88148p = new Inflater();
            }
            if (y32.m27080a(cc1Var2, this.f88146n, this.f88148p)) {
                cc1Var2.m35296a(this.f88146n.m35287e(), this.f88146n.m35291c());
            }
        }
        C31882a c31882a = this.f88147o;
        int i4 = 0;
        c31882a.f88152d = 0;
        c31882a.f88153e = 0;
        c31882a.f88154f = 0;
        c31882a.f88155g = 0;
        c31882a.f88156h = 0;
        c31882a.f88157i = 0;
        c31882a.f88149a.m35290c(0);
        c31882a.f88151c = false;
        ArrayList arrayList = new ArrayList();
        while (this.f88145m.m35299a() >= 3) {
            cc1 cc1Var3 = this.f88145m;
            C31882a c31882a2 = this.f88147o;
            int m35287e = cc1Var3.m35287e();
            int m35270t = cc1Var3.m35270t();
            int m35264z = cc1Var3.m35264z();
            int m35289d = cc1Var3.m35289d() + m35264z;
            if (m35289d > m35287e) {
                cc1Var3.m35286e(m35287e);
                c31840xt = null;
                i4 = i4;
            } else {
                int i5 = 128;
                if (m35270t == 128) {
                    cc1Var = cc1Var3;
                    if (c31882a2.f88152d == 0 || c31882a2.f88153e == 0 || c31882a2.f88156h == 0 || c31882a2.f88157i == 0 || c31882a2.f88149a.m35287e() == 0 || c31882a2.f88149a.m35289d() != c31882a2.f88149a.m35287e() || !c31882a2.f88151c) {
                        z2 = 0;
                        c31840xt = null;
                    } else {
                        c31882a2.f88149a.m35286e(0);
                        int i6 = c31882a2.f88156h * c31882a2.f88157i;
                        int[] iArr = new int[i6];
                        int i7 = 0;
                        while (i7 < i6) {
                            int m35270t2 = c31882a2.f88149a.m35270t();
                            if (m35270t2 != 0) {
                                i2 = i7 + 1;
                                iArr[i7] = c31882a2.f88150b[m35270t2];
                            } else {
                                int m35270t3 = c31882a2.f88149a.m35270t();
                                if (m35270t3 != 0) {
                                    i2 = ((m35270t3 & 64) == 0 ? m35270t3 & 63 : ((m35270t3 & 63) << 8) | c31882a2.f88149a.m35270t()) + i7;
                                    Arrays.fill(iArr, i7, i2, (m35270t3 & 128) == 0 ? 0 : c31882a2.f88150b[c31882a2.f88149a.m35270t()]);
                                }
                            }
                            i7 = i2;
                        }
                        c31840xt = new C31840xt.C31841a().m27247a(Bitmap.createBitmap(iArr, c31882a2.f88156h, c31882a2.f88157i, Bitmap.Config.ARGB_8888)).m27242b(c31882a2.f88154f / c31882a2.f88152d).m27241b(0).m27248a(0, c31882a2.f88155g / c31882a2.f88153e).m27249a(0).m27232d(c31882a2.f88156h / c31882a2.f88152d).m27250a(c31882a2.f88157i / c31882a2.f88153e).m27251a();
                        z2 = 0;
                    }
                    c31882a2.f88152d = z2 ? 1 : 0;
                    c31882a2.f88153e = z2 ? 1 : 0;
                    c31882a2.f88154f = z2 ? 1 : 0;
                    c31882a2.f88155g = z2 ? 1 : 0;
                    c31882a2.f88156h = z2 ? 1 : 0;
                    c31882a2.f88157i = z2 ? 1 : 0;
                    c31882a2.f88149a.m35290c(z2 ? 1 : 0);
                    c31882a2.f88151c = z2;
                    i3 = z2;
                } else {
                    switch (m35270t) {
                        case 20:
                            c31882a2.getClass();
                            if (m35264z % 5 == 2) {
                                cc1Var3.m35284f(2);
                                Arrays.fill(c31882a2.f88150b, i4);
                                int i8 = m35264z / 5;
                                int i9 = i4;
                                while (i9 < i8) {
                                    int m35270t4 = cc1Var3.m35270t();
                                    int m35270t5 = cc1Var3.m35270t();
                                    int m35270t6 = cc1Var3.m35270t();
                                    int m35270t7 = cc1Var3.m35270t();
                                    int m35270t8 = cc1Var3.m35270t();
                                    double d = m35270t5;
                                    double d2 = m35270t6 - i5;
                                    double d3 = m35270t7 - i5;
                                    int[] iArr2 = c31882a2.f88150b;
                                    int i10 = y32.f88010a;
                                    iArr2[m35270t4] = (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | (m35270t8 << 24) | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255));
                                    i9++;
                                    cc1Var3 = cc1Var3;
                                    i5 = 128;
                                }
                                cc1Var = cc1Var3;
                                c31882a2.f88151c = true;
                                break;
                            }
                            cc1Var = cc1Var3;
                            break;
                        case 21:
                            c31882a2.getClass();
                            if (m35264z >= 4) {
                                cc1Var3.m35284f(3);
                                int i11 = m35264z - 4;
                                if (((cc1Var3.m35270t() & 128) != 0 ? 1 : i4) != 0) {
                                    if (i11 >= 7 && (m35267w = cc1Var3.m35267w()) >= 4) {
                                        c31882a2.f88156h = cc1Var3.m35264z();
                                        c31882a2.f88157i = cc1Var3.m35264z();
                                        c31882a2.f88149a.m35290c(m35267w - 4);
                                        i11 = m35264z - 11;
                                    }
                                }
                                int m35289d2 = c31882a2.f88149a.m35289d();
                                int m35287e2 = c31882a2.f88149a.m35287e();
                                if (m35289d2 < m35287e2 && i11 > 0) {
                                    int min = Math.min(i11, m35287e2 - m35289d2);
                                    cc1Var3.m35294a(c31882a2.f88149a.m35291c(), m35289d2, min);
                                    c31882a2.f88149a.m35286e(m35289d2 + min);
                                }
                            }
                            cc1Var = cc1Var3;
                            break;
                        case 22:
                            c31882a2.getClass();
                            if (m35264z >= 19) {
                                c31882a2.f88152d = cc1Var3.m35264z();
                                c31882a2.f88153e = cc1Var3.m35264z();
                                cc1Var3.m35284f(11);
                                c31882a2.f88154f = cc1Var3.m35264z();
                                c31882a2.f88155g = cc1Var3.m35264z();
                            }
                            cc1Var = cc1Var3;
                            break;
                        default:
                            cc1Var = cc1Var3;
                            break;
                    }
                    i3 = 0;
                    c31840xt = null;
                }
                cc1Var.m35286e(m35289d);
                i4 = i3;
            }
            if (c31840xt != null) {
                arrayList.add(c31840xt);
            }
        }
        return new zc1(Collections.unmodifiableList(arrayList));
    }
}

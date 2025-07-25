package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.k22;

/* loaded from: classes8.dex */
public final class xc1 implements k22 {

    /* renamed from: a */
    private final t20 f87627a;

    /* renamed from: b */
    private final bc1 f87628b = new bc1(new byte[10]);

    /* renamed from: c */
    private int f87629c = 0;

    /* renamed from: d */
    private int f87630d;

    /* renamed from: e */
    private n02 f87631e;

    /* renamed from: f */
    private boolean f87632f;

    /* renamed from: g */
    private boolean f87633g;

    /* renamed from: h */
    private boolean f87634h;

    /* renamed from: i */
    private int f87635i;

    /* renamed from: j */
    private int f87636j;

    /* renamed from: k */
    private boolean f87637k;

    /* renamed from: l */
    private long f87638l;

    public xc1(t20 t20Var) {
        this.f87627a = t20Var;
    }

    @Override // com.yandex.mobile.ads.impl.k22
    /* renamed from: a */
    public final void mo27576a(int i, cc1 cc1Var) throws gc1 {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f87631e != null) {
            int i7 = 2;
            int i8 = 3;
            int i9 = -1;
            int i10 = 0;
            if ((i & 1) != 0) {
                int i11 = this.f87629c;
                if (i11 != 0 && i11 != 1) {
                    if (i11 == 2) {
                        gq0.m33792d("PesReader", "Unexpected start indicator reading extended header");
                    } else if (i11 == 3) {
                        if (this.f87636j != -1) {
                            gq0.m33792d("PesReader", "Unexpected start indicator: expected " + this.f87636j + " more bytes");
                        }
                        this.f87627a.mo26243b();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                this.f87629c = 1;
                this.f87630d = 0;
            }
            int i12 = i;
            while (cc1Var.m35299a() > 0) {
                int i13 = this.f87629c;
                if (i13 == 0) {
                    i2 = i7;
                    i3 = i8;
                    i4 = i9;
                    i5 = i10;
                    cc1Var.m35284f(cc1Var.m35299a());
                } else if (i13 == 1) {
                    i3 = i8;
                    int i14 = i10;
                    if (m27575a(9, cc1Var, this.f87628b.f77261a)) {
                        this.f87628b.m35499c(i14);
                        int m35502b = this.f87628b.m35502b(24);
                        if (m35502b != 1) {
                            zo0.m26074a("Unexpected start code prefix: ", m35502b, "PesReader");
                            i4 = -1;
                            this.f87636j = -1;
                            i6 = 0;
                            i2 = 2;
                        } else {
                            this.f87628b.m35497d(8);
                            int m35502b2 = this.f87628b.m35502b(16);
                            this.f87628b.m35497d(5);
                            this.f87637k = this.f87628b.m35494f();
                            i2 = 2;
                            this.f87628b.m35497d(2);
                            this.f87632f = this.f87628b.m35494f();
                            this.f87633g = this.f87628b.m35494f();
                            this.f87628b.m35497d(6);
                            int m35502b3 = this.f87628b.m35502b(8);
                            this.f87635i = m35502b3;
                            if (m35502b2 == 0) {
                                this.f87636j = -1;
                                i4 = -1;
                            } else {
                                int i15 = (m35502b2 - 3) - m35502b3;
                                this.f87636j = i15;
                                if (i15 < 0) {
                                    gq0.m33792d("PesReader", "Found negative packet payload size: " + this.f87636j);
                                    i4 = -1;
                                    this.f87636j = -1;
                                } else {
                                    i4 = -1;
                                }
                            }
                            i6 = 2;
                        }
                        this.f87629c = i6;
                        i5 = 0;
                        this.f87630d = 0;
                    } else {
                        i5 = i14;
                        i4 = -1;
                        i2 = 2;
                    }
                } else if (i13 != i7) {
                    if (i13 == i8) {
                        int m35299a = cc1Var.m35299a();
                        int i16 = this.f87636j;
                        int i17 = i16 == i9 ? i10 : m35299a - i16;
                        if (i17 > 0) {
                            m35299a -= i17;
                            cc1Var.m35288d(cc1Var.m35289d() + m35299a);
                        }
                        this.f87627a.mo26245a(cc1Var);
                        int i18 = this.f87636j;
                        if (i18 != i9) {
                            int i19 = i18 - m35299a;
                            this.f87636j = i19;
                            if (i19 == 0) {
                                this.f87627a.mo26243b();
                                this.f87629c = 1;
                                this.f87630d = i10;
                            }
                        }
                        i2 = i7;
                        i3 = i8;
                        i4 = i9;
                        i5 = i10;
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m27575a(Math.min(10, this.f87635i), cc1Var, this.f87628b.f77261a) && m27575a(this.f87635i, cc1Var, (byte[]) null)) {
                    this.f87628b.m35499c(i10);
                    this.f87638l = -9223372036854775807L;
                    if (this.f87632f) {
                        this.f87628b.m35497d(4);
                        this.f87628b.m35497d(1);
                        this.f87628b.m35497d(1);
                        long m35502b4 = (this.f87628b.m35502b(15) << 15) | (this.f87628b.m35502b(i8) << 30) | this.f87628b.m35502b(15);
                        this.f87628b.m35497d(1);
                        if (!this.f87634h && this.f87633g) {
                            this.f87628b.m35497d(4);
                            this.f87628b.m35497d(1);
                            long m35502b5 = this.f87628b.m35502b(15) << 15;
                            this.f87628b.m35497d(1);
                            this.f87628b.m35497d(1);
                            this.f87631e.m31718b(m35502b5 | (this.f87628b.m35502b(i8) << 30) | this.f87628b.m35502b(15));
                            this.f87634h = true;
                        }
                        this.f87638l = this.f87631e.m31718b(m35502b4);
                    }
                    i12 |= this.f87637k ? 4 : 0;
                    this.f87627a.mo26246a(i12, this.f87638l);
                    this.f87629c = 3;
                    this.f87630d = 0;
                    i10 = 0;
                    i9 = -1;
                    i8 = 3;
                    i7 = 2;
                } else {
                    i3 = i8;
                    i4 = i9;
                    i5 = i10;
                    i2 = 2;
                }
                i10 = i5;
                i9 = i4;
                i8 = i3;
                i7 = i2;
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private boolean m27575a(int i, cc1 cc1Var, @Nullable byte[] bArr) {
        int min = Math.min(cc1Var.m35299a(), i - this.f87630d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            cc1Var.m35284f(min);
        } else {
            cc1Var.m35294a(bArr, this.f87630d, min);
        }
        int i2 = this.f87630d + min;
        this.f87630d = i2;
        return i2 == i;
    }

    @Override // com.yandex.mobile.ads.impl.k22
    /* renamed from: a */
    public final void mo27574a(n02 n02Var, p50 p50Var, k22.C30694d c30694d) {
        this.f87631e = n02Var;
        this.f87627a.mo26244a(p50Var, c30694d);
    }

    @Override // com.yandex.mobile.ads.impl.k22
    /* renamed from: a */
    public final void mo27577a() {
        this.f87629c = 0;
        this.f87630d = 0;
        this.f87634h = false;
        this.f87627a.mo26247a();
    }
}

package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes8.dex */
final class fa1 {

    /* renamed from: a */
    private final ga1 f79030a = new ga1();

    /* renamed from: b */
    private final cc1 f79031b = new cc1(0, new byte[65025]);

    /* renamed from: c */
    private int f79032c = -1;

    /* renamed from: d */
    private int f79033d;

    /* renamed from: e */
    private boolean f79034e;

    /* renamed from: a */
    public final ga1 m34187a() {
        return this.f79030a;
    }

    /* renamed from: b */
    public final cc1 m34185b() {
        return this.f79031b;
    }

    /* renamed from: c */
    public final void m34184c() {
        ga1 ga1Var = this.f79030a;
        ga1Var.f79580a = 0;
        ga1Var.f79581b = 0L;
        ga1Var.f79582c = 0;
        ga1Var.f79583d = 0;
        ga1Var.f79584e = 0;
        this.f79031b.m35290c(0);
        this.f79032c = -1;
        this.f79034e = false;
    }

    /* renamed from: d */
    public final void m34183d() {
        if (this.f79031b.m35291c().length == 65025) {
            return;
        }
        cc1 cc1Var = this.f79031b;
        cc1Var.m35296a(this.f79031b.m35287e(), Arrays.copyOf(cc1Var.m35291c(), Math.max(65025, this.f79031b.m35287e())));
    }

    /* renamed from: a */
    public final boolean m34186a(C30513hy c30513hy) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.f79034e) {
            this.f79034e = false;
            this.f79031b.m35290c(0);
        }
        while (true) {
            if (this.f79034e) {
                return true;
            }
            if (this.f79032c < 0) {
                if (!this.f79030a.m33899a(c30513hy, -1L) || !this.f79030a.m33898a(c30513hy, true)) {
                    break;
                }
                ga1 ga1Var = this.f79030a;
                int i4 = ga1Var.f79583d;
                if ((ga1Var.f79580a & 1) == 1 && this.f79031b.m35287e() == 0) {
                    this.f79033d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.f79033d;
                        ga1 ga1Var2 = this.f79030a;
                        if (i6 >= ga1Var2.f79582c) {
                            break;
                        }
                        int[] iArr = ga1Var2.f79585f;
                        this.f79033d = i6 + 1;
                        i3 = iArr[i6];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.f79033d;
                } else {
                    i2 = 0;
                }
                try {
                    c30513hy.mo27621a(i4);
                    this.f79032c = i2;
                } catch (EOFException unused) {
                }
            }
            int i7 = this.f79032c;
            this.f79033d = 0;
            int i8 = 0;
            do {
                int i9 = this.f79033d;
                int i10 = i7 + i9;
                ga1 ga1Var3 = this.f79030a;
                if (i10 >= ga1Var3.f79582c) {
                    break;
                }
                int[] iArr2 = ga1Var3.f79585f;
                this.f79033d = i9 + 1;
                i = iArr2[i10];
                i8 += i;
            } while (i == 255);
            int i11 = this.f79032c + this.f79033d;
            if (i8 > 0) {
                cc1 cc1Var = this.f79031b;
                cc1Var.m35298a(cc1Var.m35287e() + i8);
                try {
                    c30513hy.mo27619a(this.f79031b.m35291c(), this.f79031b.m35287e(), i8, false);
                    cc1 cc1Var2 = this.f79031b;
                    cc1Var2.m35288d(cc1Var2.m35287e() + i8);
                    this.f79034e = this.f79030a.f79585f[i11 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i11 == this.f79030a.f79582c) {
                i11 = -1;
            }
            this.f79032c = i11;
        }
        return false;
    }
}

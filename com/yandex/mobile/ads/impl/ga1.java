package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes8.dex */
final class ga1 {

    /* renamed from: a */
    public int f79580a;

    /* renamed from: b */
    public long f79581b;

    /* renamed from: c */
    public int f79582c;

    /* renamed from: d */
    public int f79583d;

    /* renamed from: e */
    public int f79584e;

    /* renamed from: f */
    public final int[] f79585f = new int[255];

    /* renamed from: g */
    private final cc1 f79586g = new cc1(255);

    /* renamed from: a */
    public final boolean m33898a(C30513hy c30513hy, boolean z) throws IOException {
        this.f79580a = 0;
        this.f79581b = 0L;
        this.f79582c = 0;
        this.f79583d = 0;
        this.f79584e = 0;
        this.f79586g.m35290c(27);
        try {
            if (c30513hy.mo27615b(this.f79586g.m35291c(), 0, 27, z) && this.f79586g.m35268v() == 1332176723) {
                if (this.f79586g.m35270t() != 0) {
                    if (z) {
                        return false;
                    }
                    throw gc1.m33886a("unsupported bit stream revision");
                }
                this.f79580a = this.f79586g.m35270t();
                this.f79581b = this.f79586g.m35278l();
                this.f79586g.m35276n();
                this.f79586g.m35276n();
                this.f79586g.m35276n();
                int m35270t = this.f79586g.m35270t();
                this.f79582c = m35270t;
                this.f79583d = m35270t + 27;
                this.f79586g.m35290c(m35270t);
                try {
                    if (c30513hy.mo27615b(this.f79586g.m35291c(), 0, this.f79582c, z)) {
                        for (int i = 0; i < this.f79582c; i++) {
                            this.f79585f[i] = this.f79586g.m35270t();
                            this.f79584e += this.f79585f[i];
                        }
                        return true;
                    }
                } catch (EOFException e) {
                    if (!z) {
                        throw e;
                    }
                }
                return false;
            }
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m33899a(C30513hy c30513hy, long j) throws IOException {
        int i;
        if (c30513hy.mo27622a() == c30513hy.mo27613d()) {
            this.f79586g.m35290c(4);
            while (true) {
                i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i != 0 && c30513hy.mo27622a() + 4 >= j) {
                    break;
                }
                try {
                    if (!c30513hy.mo27615b(this.f79586g.m35291c(), 0, 4, true)) {
                        break;
                    }
                    this.f79586g.m35286e(0);
                    if (this.f79586g.m35268v() == 1332176723) {
                        c30513hy.mo27614c();
                        return true;
                    }
                    c30513hy.mo27621a(1);
                } catch (EOFException unused) {
                }
            }
            do {
                if (i != 0 && c30513hy.mo27622a() >= j) {
                    break;
                }
            } while (c30513hy.m33442c(1) != -1);
            return false;
        }
        throw new IllegalArgumentException();
    }
}

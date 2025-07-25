package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
final class dw1 {

    /* renamed from: a */
    private final cc1 f78263a = new cc1(8);

    /* renamed from: b */
    private int f78264b;

    /* renamed from: a */
    private long m34840a(C30513hy c30513hy) throws IOException {
        int i = 0;
        c30513hy.mo27615b(this.f78263a.m35291c(), 0, 1, false);
        int i2 = this.f78263a.m35291c()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        c30513hy.mo27615b(this.f78263a.m35291c(), 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.f78263a.m35291c()[i] & 255) + (i5 << 8);
        }
        this.f78264b = i4 + 1 + this.f78264b;
        return i5;
    }

    /* renamed from: b */
    public final boolean m34839b(C30513hy c30513hy) throws IOException {
        long m34840a;
        int i;
        long mo27618b = c30513hy.mo27618b();
        int i2 = (mo27618b > (-1L) ? 1 : (mo27618b == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && mo27618b <= 1024) {
            j = mo27618b;
        }
        int i3 = (int) j;
        c30513hy.mo27615b(this.f78263a.m35291c(), 0, 4, false);
        long m35268v = this.f78263a.m35268v();
        this.f78264b = 4;
        while (m35268v != 440786851) {
            int i4 = this.f78264b + 1;
            this.f78264b = i4;
            if (i4 == i3) {
                return false;
            }
            c30513hy.mo27615b(this.f78263a.m35291c(), 0, 1, false);
            m35268v = ((m35268v << 8) & (-256)) | (this.f78263a.m35291c()[0] & 255);
        }
        long m34840a2 = m34840a(c30513hy);
        long j2 = this.f78264b;
        if (m34840a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + m34840a2 >= mo27618b) {
            return false;
        }
        while (true) {
            int i5 = (this.f78264b > (j2 + m34840a2) ? 1 : (this.f78264b == (j2 + m34840a2) ? 0 : -1));
            if (i5 < 0) {
                if (m34840a(c30513hy) != Long.MIN_VALUE && (m34840a(c30513hy)) >= 0 && m34840a <= 2147483647L) {
                    if (i != 0) {
                        int i6 = (int) m34840a;
                        c30513hy.m33444a(false, i6);
                        this.f78264b += i6;
                    }
                }
            } else if (i5 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }
}

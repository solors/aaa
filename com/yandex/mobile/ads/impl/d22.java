package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.x02;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class d22 {

    /* renamed from: a */
    private final byte[] f77855a = new byte[10];

    /* renamed from: b */
    private boolean f77856b;

    /* renamed from: c */
    private int f77857c;

    /* renamed from: d */
    private long f77858d;

    /* renamed from: e */
    private int f77859e;

    /* renamed from: f */
    private int f77860f;

    /* renamed from: g */
    private int f77861g;

    /* renamed from: a */
    public final void m35114a(x02 x02Var, @Nullable x02.C31785a c31785a) {
        if (this.f77857c > 0) {
            x02Var.mo26069a(this.f77858d, this.f77859e, this.f77860f, this.f77861g, c31785a);
            this.f77857c = 0;
        }
    }

    /* renamed from: a */
    public final void m35117a() {
        this.f77856b = false;
        this.f77857c = 0;
    }

    /* renamed from: a */
    public final void m35115a(x02 x02Var, long j, int i, int i2, int i3, @Nullable x02.C31785a c31785a) {
        if (this.f77861g <= i2 + i3) {
            if (this.f77856b) {
                int i4 = this.f77857c;
                int i5 = i4 + 1;
                this.f77857c = i5;
                if (i4 == 0) {
                    this.f77858d = j;
                    this.f77859e = i;
                    this.f77860f = 0;
                }
                this.f77860f += i2;
                this.f77861g = i3;
                if (i5 >= 16) {
                    m35114a(x02Var, c31785a);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    /* renamed from: a */
    public final void m35116a(o50 o50Var) throws IOException {
        if (this.f77856b) {
            return;
        }
        o50Var.mo27620a(this.f77855a, 0, 10);
        o50Var.mo27614c();
        byte[] bArr = this.f77855a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f77856b = true;
        }
    }
}

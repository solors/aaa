package com.bytedance.sdk.openadsdk.p288Lq;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.Lq.IL */
/* loaded from: classes3.dex */
public class C7891IL {

    /* renamed from: IL */
    public static int f17217IL = 0;

    /* renamed from: bX */
    public static int f17218bX = 1;

    /* renamed from: bg */
    public static int f17219bg = -1;
    public static int eqN = 2;

    /* renamed from: zx */
    public static int f17220zx = 3;
    private int ldr = f17219bg;

    /* renamed from: iR */
    private long f17224iR = 0;

    /* renamed from: Kg */
    private long f17221Kg = 0;

    /* renamed from: WR */
    private final List<C7892bX> f17222WR = new ArrayList();

    /* renamed from: eo */
    private long f17223eo = 0;

    /* renamed from: IL */
    public void m87461IL(long j) {
        int i;
        int i2 = this.ldr;
        if (i2 != f17219bg && i2 != (i = f17220zx)) {
            this.ldr = i;
            this.f17221Kg = j;
        }
    }

    /* renamed from: bX */
    public void m87460bX(long j) {
        int i;
        int i2 = this.ldr;
        if (i2 != f17219bg && i2 != (i = eqN) && i2 != f17220zx) {
            this.ldr = i;
            this.f17223eo = j;
        }
    }

    /* renamed from: bg */
    public void m87458bg(long j) {
        this.ldr = f17217IL;
        this.f17224iR = j;
    }

    public void eqN(long j) {
        int i = this.ldr;
        if (i != f17219bg && i == eqN) {
            this.ldr = f17218bX;
            this.f17222WR.add(new C7892bX(this.f17223eo, j));
            this.f17223eo = 0L;
        }
    }

    /* renamed from: bg */
    public long m87457bg(long j, long j2) {
        long j3;
        long j4;
        long m87456IL;
        long j5 = this.f17221Kg;
        if (j5 == 0 || j <= j5) {
            int i = 0;
            for (C7892bX c7892bX : this.f17222WR) {
                if (c7892bX.m87456IL() > j) {
                    if (j < c7892bX.m87455bg()) {
                        j4 = i;
                        m87456IL = c7892bX.m87456IL() - c7892bX.m87455bg();
                    } else {
                        j4 = i;
                        m87456IL = c7892bX.m87456IL() - j;
                    }
                    i = (int) (j4 + m87456IL);
                }
            }
            long j6 = this.f17224iR;
            if (j6 < j) {
                long j7 = this.f17223eo;
                if (j7 == 0) {
                    j7 = this.f17221Kg;
                    if (j7 == 0) {
                        j3 = j2 - j;
                    }
                } else if (j7 <= j) {
                    return 0L;
                }
                return (j7 - j) - i;
            }
            long j8 = this.f17223eo;
            if (j8 == 0) {
                j8 = this.f17221Kg;
                if (j8 == 0) {
                    j3 = j2 - j6;
                }
            } else if (j8 <= j6) {
                return 0L;
            }
            return (j8 - j6) - i;
            return j3 - i;
        }
        return 0L;
    }

    /* renamed from: bg */
    public int m87459bg() {
        return this.ldr;
    }
}

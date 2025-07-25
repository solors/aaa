package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.X6 */
/* loaded from: assets/audience_network.dex */
public final class C12860X6 implements InterfaceC11867Gu, InterfaceC11894HL<Object> {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final Handler A06;
    public final InterfaceC11866Gt A07;
    public final InterfaceC11917Hi A08;
    public final C11949IF A09;

    public C12860X6() {
        this(null, null, 1000000L, 2000, InterfaceC11917Hi.A00);
    }

    public C12860X6(Handler handler, InterfaceC11866Gt interfaceC11866Gt, long j, int i, InterfaceC11917Hi interfaceC11917Hi) {
        this.A06 = handler;
        this.A07 = interfaceC11866Gt;
        this.A09 = new C11949IF(i);
        this.A08 = interfaceC11917Hi;
        this.A01 = j;
    }

    private void A01(int i, long j, long j2) {
        if (this.A06 != null && this.A07 != null) {
            this.A06.post(new RunnableC11877H4(this, i, j, j2));
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11867Gu
    public final synchronized long A6V() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11894HL
    public final synchronized void ABS(Object obj, int i) {
        this.A02 += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r16.A04 >= 524288) goto L13;
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11894HL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void ADr(java.lang.Object r17) {
        /*
            r16 = this;
            r4 = r16
            monitor-enter(r4)
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            r9 = 1
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A04(r0)     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.Hi r0 = r4.A08     // Catch: java.lang.Throwable -> L70
            long r2 = r0.A5p()     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A03     // Catch: java.lang.Throwable -> L70
            long r0 = r2 - r5
            int r11 = (int) r0     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A05     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A05 = r5     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A04     // Catch: java.lang.Throwable -> L70
            long r0 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r5 = r5 + r0
            r4.A04 = r5     // Catch: java.lang.Throwable -> L70
            if (r11 <= 0) goto L59
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            r0 = 8000(0x1f40, double:3.9525E-320)
            long r5 = r5 * r0
            long r0 = (long) r11     // Catch: java.lang.Throwable -> L70
            long r5 = r5 / r0
            float r8 = (float) r5     // Catch: java.lang.Throwable -> L70
            com.facebook.ads.redexgen.X.IF r7 = r4.A09     // Catch: java.lang.Throwable -> L70
            long r5 = r4.A02     // Catch: java.lang.Throwable -> L70
            double r0 = (double) r5     // Catch: java.lang.Throwable -> L70
            double r5 = java.lang.Math.sqrt(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = (int) r5     // Catch: java.lang.Throwable -> L70
            r7.A03(r0, r8)     // Catch: java.lang.Throwable -> L70
            long r7 = r4.A05     // Catch: java.lang.Throwable -> L70
            r5 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L4e
            long r7 = r4.A04     // Catch: java.lang.Throwable -> L70
            r5 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L59
        L4e:
            com.facebook.ads.redexgen.X.IF r1 = r4.A09     // Catch: java.lang.Throwable -> L70
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r1.A02(r0)     // Catch: java.lang.Throwable -> L70
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L70
            r4.A01 = r0     // Catch: java.lang.Throwable -> L70
        L59:
            long r12 = r4.A02     // Catch: java.lang.Throwable -> L70
            long r14 = r4.A01     // Catch: java.lang.Throwable -> L70
            r10 = r4
            r10.A01(r11, r12, r14)     // Catch: java.lang.Throwable -> L70
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L70
            int r0 = r0 - r9
            r4.A00 = r0     // Catch: java.lang.Throwable -> L70
            if (r0 <= 0) goto L6a
            r4.A03 = r2     // Catch: java.lang.Throwable -> L70
        L6a:
            r0 = 0
            r4.A02 = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r4)
            return
        L70:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12860X6.ADr(java.lang.Object):void");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11894HL
    public final synchronized void ADs(Object obj, C11876H3 c11876h3) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A5p();
        }
        this.A00++;
    }
}

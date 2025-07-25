package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.E5 */
/* loaded from: assets/audience_network.dex */
public final class C11711E5 implements InterfaceC12884XU, InterfaceC12885XV {
    public static String[] A06 = {"FKxkeTyNcELruURTBl6lcHzQkOtglqVi", "5VUPZyR", "h4QAdQ2k4bq5I5kw9k507iFMyPiUKBqg", "ACG7if3eIl7svvFGCbIXgylPM5X6", "MMEOde", "Ne8Swyj20Utm40D", "fzp5cmA7a9jEIH2cS1qn9VNYlxJ5WcKE", "e38WKWMIi9RGh5e82fLDO75VNnvmj40O"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC12885XV A03;
    public C12890Xa[] A04 = new C12890Xa[0];
    public final InterfaceC12884XU A05;

    public C11711E5(InterfaceC12884XU interfaceC12884XU, boolean z, long j, long j2) {
        this.A05 = interfaceC12884XU;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C11482AI A00(long j, C11482AI c11482ai) {
        long toleranceBeforeUs = AbstractC11953IK.A0E(c11482ai.A01, 0L, j - this.A01);
        long j2 = c11482ai.A00;
        long j3 = this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j;
        if (A06[6].length() != 32) {
            throw new RuntimeException();
        }
        A06[7] = "39x0yJkTHKofHHETezutF7bVoixqTCZQ";
        long A0E = AbstractC11953IK.A0E(j2, 0L, j3);
        if (toleranceBeforeUs == c11482ai.A01 && A0E == c11482ai.A00) {
            return c11482ai;
        }
        return new C11482AI(toleranceBeforeUs, A0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11770FH
    /* renamed from: A01 */
    public final void ABd(InterfaceC12884XU interfaceC12884XU) {
        this.A03.ABd(this);
    }

    public static boolean A02(long j, InterfaceC11858Gl[] interfaceC11858GlArr) {
        if (j != 0) {
            for (InterfaceC11858Gl interfaceC11858Gl : interfaceC11858GlArr) {
                if (interfaceC11858Gl != null && !AbstractC11932Hx.A09(interfaceC11858Gl.A8I().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final boolean A4p(long j) {
        return this.A05.A4p(j);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void A5W(long j, boolean z) {
        this.A05.A5W(j, z);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long A6L(long j, C11482AI c11482ai) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6L(j, A00(j, c11482ai));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long A6b() {
        long A6b = this.A05.A6b();
        if (A6b != Long.MIN_VALUE) {
            long bufferedPositionUs = this.A00;
            int i = (bufferedPositionUs > Long.MIN_VALUE ? 1 : (bufferedPositionUs == Long.MIN_VALUE ? 0 : -1));
            if (A06[2].charAt(4) == 'm') {
                throw new RuntimeException();
            }
            A06[2] = "v7PeKUnzeGhoG0IESTdo7BlOEWICkZOG";
            if (i == 0 || A6b < this.A00) {
                return A6b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long A7s() {
        long A7s = this.A05.A7s();
        if (A7s == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A7s >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A7s;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final TrackGroupArray A8Z() {
        return this.A05.A8Z();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void AAn() throws IOException {
        this.A05.AAn();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12885XV
    public final void ADC(InterfaceC12884XU interfaceC12884XU) {
        this.A03.ADC(this);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void AEX(InterfaceC12885XV interfaceC12885XV, long j) {
        this.A03 = interfaceC12885XV;
        this.A05.AEX(this, j);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long AEo() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long initialDiscontinuityUs = AEo();
            return initialDiscontinuityUs != -9223372036854775807L ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long AEo = this.A05.AEo();
        if (AEo == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        AbstractC11914Hf.A04(AEo >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && AEo > this.A00) {
            z = false;
        }
        AbstractC11914Hf.A04(z);
        return AEo;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void AEu(long j) {
        this.A05.AEu(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r5 <= r8.A00) goto L25;
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AGB(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A02 = r0
            com.facebook.ads.redexgen.X.Xa[] r3 = r8.A04
            int r2 = r3.length
            r7 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L18
            r0 = r3[r1]
            if (r0 == 0) goto L15
            r0.A00()
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            com.facebook.ads.redexgen.X.XU r0 = r8.A05
            long r5 = r0.AGB(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r0 = r8.A01
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11711E5.A06
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 28
            if (r1 == r0) goto L4f
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11711E5.A06
            java.lang.String r1 = "IA7KJv"
            r0 = 1
            r2[r0] = r1
            if (r3 < 0) goto L4b
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r1 = r8.A00
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L4b
        L4a:
            r7 = 1
        L4b:
            com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A04(r7)
            return r5
        L4f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11711E5.AGB(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AGC(com.facebook.ads.redexgen.p370X.InterfaceC11858Gl[] r15, boolean[] r16, com.facebook.ads.redexgen.p370X.InterfaceC11769FG[] r17, boolean[] r18, long r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11711E5.AGC(com.facebook.ads.redexgen.X.Gl[], boolean[], com.facebook.ads.redexgen.X.FG[], boolean[], long):long");
    }
}

package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XC */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12866XC implements InterfaceC11858Gl {
    public int A00;
    public final long[] A01;
    public final Format[] A02;
    public final int A03;
    public final TrackGroup A04;
    public final int[] A05;

    /* JADX WARN: Incorrect condition in loop: B:12:0x0042 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC12866XC(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r4, int... r5) {
        /*
            r3 = this;
            r3.<init>()
            int r0 = r5.length
            if (r0 <= 0) goto L2c
            r0 = 1
        L7:
            com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A04(r0)
            java.lang.Object r0 = com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A01(r4)
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup) r0
            r3.A04 = r0
            int r0 = r5.length
            r3.A03 = r0
            int r0 = r3.A03
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r0 = new com.facebook.ads.internal.exoplayer2.thirdparty.Format[r0]
            r3.A02 = r0
            r2 = 0
        L1c:
            int r0 = r5.length
            if (r2 >= r0) goto L2e
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r1 = r3.A02
            r0 = r5[r2]
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r4.A01(r0)
            r1[r2] = r0
            int r2 = r2 + 1
            goto L1c
        L2c:
            r0 = 0
            goto L7
        L2e:
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r2 = r3.A02
            r1 = 0
            com.facebook.ads.redexgen.X.GZ r0 = new com.facebook.ads.redexgen.X.GZ
            r0.<init>()
            java.util.Arrays.sort(r2, r0)
            int r0 = r3.A03
            int[] r0 = new int[r0]
            r3.A05 = r0
            r2 = 0
        L40:
            int r0 = r3.A03
            if (r2 >= r0) goto L53
            int[] r1 = r3.A05
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r0 = r3.A02
            r0 = r0[r2]
            int r0 = r4.A00(r0)
            r1[r2] = r0
            int r2 = r2 + 1
            goto L40
        L53:
            int r0 = r3.A03
            long[] r0 = new long[r0]
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC12866XC.<init>(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[]):void");
    }

    public final boolean A00(int i, long j) {
        return this.A01[i] > j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public void A5q() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final Format A7U(int i) {
        return this.A02[i];
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final int A7a(int i) {
        return this.A05[i];
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final Format A8I() {
        return this.A02[A8J()];
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final TrackGroup A8Y() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public void AD5(float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC12866XC abstractC12866XC = (AbstractC12866XC) obj;
        return this.A04 == abstractC12866XC.A04 && Arrays.equals(this.A05, abstractC12866XC.A05);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11858Gl
    public final int length() {
        return this.A05.length;
    }
}

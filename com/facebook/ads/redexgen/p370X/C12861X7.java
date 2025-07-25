package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.X7 */
/* loaded from: assets/audience_network.dex */
public final class C12861X7 implements InterfaceC11864Gr {
    public static byte[] A08;
    public static String[] A09 = {"uCIHf2uPFSpN7s394GB", "bw9U9dL", "AAvtM4z7IZvGS3xiAGY", "RwMjBWFP3sqBY", "V8vFz2NVX1z2e3auyeYyWjFvf7xuik3z", "MjYG2pSQFtH7G", "DfS2nPoTWNflTHew7ejwtivrUd6Et1b1", "Z7pxnQFdOkAG9OVyKKW5ogdy9zcWk7rj"};
    public int A00;
    public int A01;
    public int A02;
    public C11863Gq[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C11863Gq[] A07;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[0] = "UrFOZG2CNzDWALsIN7J";
            strArr[2] = "hMYy47mgqrPq4T1YTM5";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 42);
            i4++;
        }
    }

    public static void A01() {
        A08 = new byte[]{-60, -72, -61, -36, -45, -26, -34, -45, -47, -30, -45, -46, -114, -49, -38, -38, -35, -47, -49, -30, -41, -35, -36, -88, -114};
    }

    static {
        A01();
    }

    public C12861X7(boolean z, int i) {
        this(z, i, 0);
    }

    public C12861X7(boolean z, int i, int i2) {
        AbstractC11914Hf.A03(i > 0);
        AbstractC11914Hf.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C11863Gq[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C11863Gq(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C11863Gq[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AHB();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11864Gr
    public final synchronized C11863Gq A3t() {
        C11863Gq c11863Gq;
        this.A00++;
        if (this.A01 > 0) {
            C11863Gq[] c11863GqArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c11863Gq = c11863GqArr[i];
            this.A03[this.A01] = null;
        } else {
            c11863Gq = new C11863Gq(new byte[this.A04], 0);
        }
        return c11863Gq;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11864Gr
    public final int A7b() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11864Gr
    public final synchronized void AEz(C11863Gq c11863Gq) {
        this.A07[0] = c11863Gq;
        AF0(this.A07);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11864Gr
    public final synchronized void AF0(C11863Gq[] c11863GqArr) {
        if (this.A01 + c11863GqArr.length >= this.A03.length) {
            this.A03 = (C11863Gq[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + c11863GqArr.length));
        }
        for (C11863Gq c11863Gq : c11863GqArr) {
            if (c11863Gq.A01 == this.A06 || c11863Gq.A01.length == this.A04) {
                C11863Gq[] c11863GqArr2 = this.A03;
                int i = this.A01;
                this.A01 = i + 1;
                c11863GqArr2[i] = c11863Gq;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 68) + System.identityHashCode(c11863Gq.A01) + A00(0, 2, 110) + System.identityHashCode(this.A06) + A00(0, 2, 110) + c11863Gq.A01.length + A00(0, 2, 110) + this.A04);
            }
        }
        this.A00 -= c11863GqArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11864Gr
    public final synchronized void AHB() {
        int A04 = AbstractC11953IK.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A04 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C11863Gq highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C11863Gq lowAllocation = this.A03[highIndex];
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        C11863Gq[] c11863GqArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c11863GqArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}

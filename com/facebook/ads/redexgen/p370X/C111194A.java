package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4A */
/* loaded from: assets/audience_network.dex */
public class C111194A {
    public static byte[] A02;
    public static String[] A03 = {"eKMrgqlCE6gemHc3i8XP3AKPCikI", "F056EMXFpemItrIKSNHDMT", "UP7tmvacf", "VwJuHcYZb6pOUF9c5fygzqO1xhwXl8", "rbSS0TX92cN6cYo9TUPXDkEXEuy61J", "qalk034xToBy0kTaZmHtwYGALLiE8EwC", "z1", "iDDMQnl7H0FoGDQAr6PhZLTqZy2Xncag"};
    public long A00 = 0;
    public C111194A A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{47, 47};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C111194A();
        }
    }

    public final int A03(int i) {
        if (this.A01 == null) {
            if (i >= 64) {
                return Long.bitCount(this.A00);
            }
            long j = this.A00;
            long j2 = (1 << i) - 1;
            if (A03[6].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "eBNk3oMk3zKdgPZGJWBoIC6ya78Y9W";
            strArr[4] = "SZljZRIwDL4qj86IVN03h7W6Ja49N5";
            return Long.bitCount(j & j2);
        } else if (i < 64) {
            return Long.bitCount(this.A00 & ((1 << i) - 1));
        } else {
            return this.A01.A03(i - 64) + Long.bitCount(this.A00);
        }
    }

    public final void A04() {
        this.A00 = 0L;
        if (this.A01 != null) {
            C111194A c111194a = this.A01;
            String[] strArr = A03;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "MSI1mtfoMLAkHcYJR6PW0K";
            strArr2[7] = "fUjJFSbhC3MyLq7bD4XnyNju1VoRa1IS";
            c111194a.A04();
        }
    }

    public final void A05(int i) {
        if (i >= 64) {
            if (this.A01 != null) {
                C111194A c111194a = this.A01;
                int i2 = i - 64;
                if (A03[6].length() != 2) {
                    throw new RuntimeException();
                }
                A03[6] = "gh";
                c111194a.A05(i2);
                return;
            }
            return;
        }
        this.A00 &= (1 << i) ^ (-1);
    }

    public final void A06(int i) {
        if (i >= 64) {
            A01();
            this.A01.A06(i - 64);
            return;
        }
        this.A00 |= 1 << i;
    }

    public final void A07(int i, boolean z) {
        if (i >= 64) {
            A01();
            this.A01.A07(i - 64, z);
            return;
        }
        boolean z2 = (this.A00 & Long.MIN_VALUE) != 0;
        long mask = (1 << i) - 1;
        this.A00 = (this.A00 & mask) | ((this.A00 & ((-1) ^ mask)) << 1);
        if (z) {
            A06(i);
        } else {
            A05(i);
        }
        if (!z2 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z2);
    }

    public final boolean A08(int i) {
        if (i < 64) {
            return (this.A00 & (1 << i)) != 0;
        }
        A01();
        return this.A01.A08(i - 64);
    }

    public final boolean A09(int i) {
        if (i >= 64) {
            A01();
            return this.A01.A09(i - 64);
        }
        long j = 1 << i;
        boolean z = (this.A00 & j) != 0;
        long mask = this.A00;
        this.A00 = mask & (j ^ (-1));
        long j2 = j - 1;
        long mask2 = this.A00;
        long before = this.A00;
        this.A00 = (mask2 & j2) | Long.rotateRight(before & ((-1) ^ j2), 1);
        if (this.A01 != null) {
            if (this.A01.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z;
    }

    public final String toString() {
        return this.A01 == null ? Long.toBinaryString(this.A00) : this.A01.toString() + A00(0, 2, 114) + Long.toBinaryString(this.A00);
    }
}

package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.EY */
/* loaded from: assets/audience_network.dex */
public final class C11725EY implements InterfaceC12949Ya {
    public static byte[] A05;
    public static String[] A06 = {"Xr6CfYARiXWi1tHF5rKzHnV8sizRHMyX", "wJO", "vhv6fx1WvUjVUT42a865NPYV6nOkfSqv", "ykO1A1PT3jL3Q8zq7D2WaGEX54xmjF9S", "j", "GNQC5jQwe2bl4DeUZLcdaEx2Qf8zZlwn", "pCroGV0GNScuUwFSTYQpDpdwc2fRC0On", "UPhRQNGhO5dHFWFW9SQSP3jiGA6NTJBd"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 88, 9, 24, 31, 22, 113, 53, 48, 37, 48, 113, 34, 56, 43, 52, 113, 60, 56, 34, 60, 48, 37, 50, 57, 107, 113, 52, 5, 2, 11, 63, 9, 9, 7, 9, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        double d;
        if (A9h()) {
            long A0E = AbstractC11953IK.A0E(j, 0L, this.A03);
            double d2 = (A0E * 100.0d) / this.A03;
            if (d2 <= 0.0d) {
                d = 0.0d;
            } else if (d2 >= 100.0d) {
                d = 256.0d;
            } else {
                int i = (int) d2;
                double d3 = this.A04[i];
                d = (((i == 99 ? 256.0d : this.A04[i + 1]) - d3) * (d2 - i)) + d3;
            }
            return new C11591C5(new C11593C7(A0E, this.A02 + AbstractC11953IK.A0E(Math.round((d / 256.0d) * this.A01), this.A00, this.A01 - 1)));
        }
        return new C11591C5(new C11593C7(0L, this.A02 + this.A00));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12949Ya
    public final long A8W(long j) {
        long j2 = j - this.A02;
        if (!A9h() || j2 <= this.A00) {
            return 0L;
        }
        double d = (j2 * 256.0d) / this.A01;
        int A0B = AbstractC11953IK.A0B(this.A04, (long) d, true, true);
        long A00 = A00(A0B);
        long j3 = this.A04[A0B];
        long A002 = A00(A0B + 1);
        long j4 = A0B == 99 ? 256L : this.A04[A0B + 1];
        return Math.round((A002 - A00) * (j3 == j4 ? 0.0d : (d - j3) / (j4 - j3))) + A00;
    }

    static {
        A03();
    }

    public C11725EY(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public C11725EY(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    public static C11725EY A01(long durationUs, long dataSize, C11589C3 c11589c3, C11939I4 c11939i4) {
        int A0H;
        int i = c11589c3.A04;
        int i2 = c11589c3.A03;
        int A08 = c11939i4.A08();
        if ((A08 & 1) != 1 || (A0H = c11939i4.A0H()) == 0) {
            return null;
        }
        long A0F = AbstractC11953IK.A0F(A0H, i * 1000000, i2);
        int i3 = A08 & 6;
        if (A06[4].length() != 20) {
            A06[4] = "W327rNxAr1Lp0kX";
            if (i3 != 6) {
                return new C11725EY(dataSize, c11589c3.A02, A0F);
            }
            long A0H2 = c11939i4.A0H();
            long[] jArr = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                long A0E = c11939i4.A0E();
                String[] strArr = A06;
                String str = strArr[6];
                String str2 = strArr[2];
                int charAt = str.charAt(6);
                int i5 = str2.charAt(6);
                if (charAt == i5) {
                    throw new RuntimeException();
                }
                A06[7] = "SFqGi8tygZ59FROXyWZkbYPPfUMGUQ5V";
                jArr[i4] = A0E;
            }
            if (durationUs != -1 && durationUs != dataSize + A0H2) {
                Log.w(A02(27, 10, 64), A02(2, 25, 125) + durationUs + A02(0, 2, 84) + (dataSize + A0H2));
            }
            return new C11725EY(dataSize, c11589c3.A02, A0F, A0H2, jArr);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return this.A04 != null;
    }
}

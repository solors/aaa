package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.EZ */
/* loaded from: assets/audience_network.dex */
public final class C11726EZ implements InterfaceC12949Ya {
    public static byte[] A03;
    public static String[] A04 = {"hDr4AhOelyV4M87pxxzrySU8", "ag02JsPBw1CSC6lAevKl8ElSb7ghegxm", "8KgIWPNY6Gpuv5I23X99L6M1", "BC5znNfWRALdfcPg4enkL0n", "sH1sq28fUh4pGPjb57fY53htTKBjXus7", "cCA6T6hrJ6nKn0yn0LF0tCx", "oJ6ugJrvZKDALziksWoJHm", "OeXUOmYCRuSHACW5UkCDsaSWUNhRh"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        String[] strArr = A04;
        if (strArr[5].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A04[4] = "eDFZ3Zqg0xNSdShrMJsmVraFmK4fXi8F";
        A03 = new byte[]{48, 60, 83, 71, 87, 76, 37, 97, 100, 113, 100, 37, 118, 108, Byte.MAX_VALUE, 96, 37, 104, 108, 118, 104, 100, 113, 102, 109, 63, 37, 26, 46, 62, 37, 31, 41, 41, 39, 41, 62};
    }

    static {
        A02();
    }

    public C11726EZ(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static C11726EZ A00(long j, long j2, C11589C3 c11589c3, C11939I4 c11939i4) {
        int A0E;
        long j3 = j2;
        c11939i4.A0Z(10);
        int numFrames = c11939i4.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = c11589c3.A03;
        long A0F = AbstractC11953IK.A0F(numFrames, (sampleRate >= 32000 ? 1152 : 576) * 1000000, sampleRate);
        int A0I = c11939i4.A0I();
        int numFrames2 = c11939i4.A0I();
        int A0I2 = c11939i4.A0I();
        c11939i4.A0Z(2);
        long j4 = j3 + c11589c3.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(j3, j4);
            switch (A0I2) {
                case 1:
                    A0E = c11939i4.A0E();
                    break;
                case 2:
                    A0E = c11939i4.A0I();
                    break;
                case 3:
                    A0E = c11939i4.A0G();
                    break;
                case 4:
                    A0E = c11939i4.A0H();
                    break;
                default:
                    return null;
            }
            j3 += A0E * numFrames2;
        }
        if (j != -1 && j != j3) {
            Log.w(A01(27, 10, 54), A01(2, 25, 127) + j + A01(0, 2, 102) + j3);
        }
        return new C11726EZ(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        int A0B = AbstractC11953IK.A0B(this.A02, j, true, true);
        C11593C7 c11593c7 = new C11593C7(this.A02[A0B], this.A01[A0B]);
        int tableIndex = (c11593c7.A01 > j ? 1 : (c11593c7.A01 == j ? 0 : -1));
        if (tableIndex < 0) {
            int tableIndex2 = this.A02.length;
            if (A0B != tableIndex2 - 1) {
                int tableIndex3 = A0B + 1;
                long j2 = this.A02[tableIndex3];
                int tableIndex4 = A0B + 1;
                C11593C7 nextSeekPoint = new C11593C7(j2, this.A01[tableIndex4]);
                return new C11591C5(c11593c7, nextSeekPoint);
            }
        }
        return new C11591C5(c11593c7);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12949Ya
    public final long A8W(long j) {
        return this.A02[AbstractC11953IK.A0B(this.A01, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return true;
    }
}

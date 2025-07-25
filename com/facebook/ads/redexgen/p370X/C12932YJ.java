package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.YJ */
/* loaded from: assets/audience_network.dex */
public final class C12932YJ extends AbstractC11641Ct {
    public static byte[] A01;
    public static String[] A02 = {"9zUE1kBCLrpctXUh4di4teUCMMnlOwHm", "hxL5RrPmAhc7c6Sqok7geqGtoBQuG54z", "7qxsi95CwX1d32mD6PhTx1jG463xSlTg", "ROqSYZWleG9mDiFvnXHBa66Bw", "byItOkkTBkpZWV9t1cXQ", "rK61A2vaMRzsIHVSYP2n5X", "FfCvZ6O62JH3XUMkSbfnO7", "CFRLGqs9mpPSc58Q2JPSfTLdlWu7MMes"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-26, 7, 12, 10, -16, 4, -13, -8, -2, -66, -2, -1, 4, 2};
    }

    static {
        A02();
        A03 = AbstractC11953IK.A08(A01(0, 4, 83));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i;
        int i2;
        int frames = bArr[0] & 255;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i = 1;
                break;
            case 1:
            case 2:
                i = 2;
                break;
            default:
                int toc2 = bArr[1];
                i = toc2 & 63;
                break;
        }
        int config = frames >> 3;
        int frames2 = config & 3;
        if (config >= 16) {
            i2 = 2500 << frames2;
        } else if (config >= 12) {
            int length = frames2 & 1;
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int frames3 = str.length();
            int toc3 = str2.length();
            if (frames3 != toc3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "3r7DJYLfzRYqaRlcvCuDWA";
            strArr2[5] = "1ZUf0xo6oEwAlYAqSthqXk";
            i2 = 10000 << length;
        } else if (frames2 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << frames2;
        }
        return i * i2;
    }

    private void A03(List<byte[]> initializationData, int i) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i * 1000000000) / 48000).array());
    }

    public static boolean A04(C11939I4 c11939i4) {
        if (c11939i4.A04() < A04.length) {
            return false;
        }
        byte[] bArr = new byte[A04.length];
        byte[] header = A04;
        c11939i4.A0c(bArr, 0, header.length);
        byte[] header2 = A04;
        return Arrays.equals(bArr, header2);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11641Ct
    public final long A07(C11939I4 c11939i4) {
        return A04(A00(c11939i4.A00));
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11641Ct
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11641Ct
    public final boolean A0A(C11939I4 c11939i4, long j, C11640Cs c11640Cs) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(c11939i4.A00, c11939i4.A07());
            int i = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            A03(arrayList, 3840);
            c11640Cs.A00 = Format.A07(null, A01(4, 10, 75), null, -1, -1, i, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean headerPacket = c11939i4.A08() == A03;
        String[] strArr = A02;
        if (strArr[2].charAt(8) != strArr[0].charAt(8)) {
            String[] strArr2 = A02;
            strArr2[2] = "JHJxUYNn6gdFJmATsQeXbTNgPw95NmiQ";
            strArr2[0] = "1OX1ZlBLBQsnobg1X9ALf0NdaXPdAO6N";
            c11939i4.A0Y(0);
            return headerPacket;
        }
        throw new RuntimeException();
    }
}

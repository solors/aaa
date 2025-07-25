package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.YM */
/* loaded from: assets/audience_network.dex */
public final class C12935YM extends AbstractC11641Ct {
    public static byte[] A02;
    public static String[] A03 = {"P4OcMr", "yzGUgjKhy2TcBuT81YWAaiS5", "V9Tib6IfMi4NOqM1D0u830Y2yBdPdBt7", "OFAtjnGVyOXYsjxgv2tUilfsOLsGPVA2", "mLmiaTwnnACP94", "cQZMgeBNGwnvvvB3OnriOOb2AFb6ME4P", "wxDgqbrpyTXZpGk4hb9UcFKfmJ4Jr8rC", "ZIsPCe9SsRFytxGe4XrO3tcn"};
    public C12936YN A00;
    public C11926Hr A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {34, 54, 39, 42, 44, 108, 37, 47, 34, 32};
        String[] strArr = A03;
        if (strArr[2].charAt(3) == strArr[3].charAt(3)) {
            throw new RuntimeException();
        }
        A03[0] = "xoHdp6";
        A02 = bArr;
    }

    static {
        A03();
    }

    private int A00(C11939I4 c11939i4) {
        int value = (c11939i4.A00[2] & 255) >> 4;
        switch (value) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int blockSizeCode = 576 << (value - 2);
                return blockSizeCode;
            case 6:
            case 7:
                c11939i4.A0Z(4);
                c11939i4.A0O();
                int value2 = value == 6 ? c11939i4.A0E() : c11939i4.A0I();
                c11939i4.A0Y(0);
                int blockSizeCode2 = value2 + 1;
                return blockSizeCode2;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode3 = 256 << (value - 8);
                return blockSizeCode3;
            default:
                return -1;
        }
    }

    public static boolean A04(C11939I4 c11939i4) {
        if (c11939i4.A04() >= 5 && c11939i4.A0E() == 127) {
            int i = (c11939i4.A0M() > 1179402563L ? 1 : (c11939i4.A0M() == 1179402563L ? 0 : -1));
            String[] strArr = A03;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[4] = "cSF3Iph02w2lMO";
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11641Ct
    public final long A07(C11939I4 c11939i4) {
        if (!A05(c11939i4.A00)) {
            return -1L;
        }
        return A00(c11939i4);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11641Ct
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            if (A03[5].charAt(28) != 'M') {
                throw new RuntimeException();
            }
            A03[5] = "Lwh1jCIc51N2CryTcfCaB8rWVU2cMDKL";
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11641Ct
    public final boolean A0A(C11939I4 c11939i4, long j, C11640Cs c11640Cs) throws IOException, InterruptedException {
        byte[] bArr = c11939i4.A00;
        if (this.A01 == null) {
            this.A01 = new C11926Hr(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, c11939i4.A07());
            data[4] = UnsignedBytes.MAX_POWER_OF_TWO;
            List singletonList = Collections.singletonList(data);
            c11640Cs.A00 = Format.A07(null, A02(0, 10, 37), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.A00 = new C12936YN(this);
            this.A00.A01(c11939i4);
            return true;
        } else if (!A05(bArr)) {
            return true;
        } else {
            if (this.A00 != null) {
                this.A00.A00(j);
                c11640Cs.A01 = this.A00;
            }
            return false;
        }
    }
}

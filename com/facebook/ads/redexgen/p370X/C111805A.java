package com.facebook.ads.redexgen.p370X;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5A */
/* loaded from: assets/audience_network.dex */
public final class C111805A extends AbstractC11661DD {
    public static byte[] A0C;
    public static String[] A0D = {"uPRtooN1mrpPWtcIlb5668ZKfYVdzjkj", "9X5O0mohLhXJ7t6NoPERFE8nyauk6CB9", "qU5XOqtgL8wvA16vKF1DqOjKAu5DqneE", "7EXG0IPVOCl5nW4ISobsZsOVcrd8XJic", "1cIPLbJRIWAOgz82BPbrtaaCtdud6uIX", "LoaGbC7dgNNPM6H7LjLEtBOJkffBiTAV", "ATKN7VvE5cyZJ8kViDaz3Q8PQ8A", "az4oatOqZKbyVNpIoLDpKLWjQ80V1Ke9"};
    public static final int[] A0E;
    public static final int[] A0F;
    public static final int[] A0G;
    public static final int[] A0H;
    public static final int[] A0I;
    public static final int[] A0J;
    public static final int[] A0K;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public List<C11805Fs> A05;
    public List<C11805Fs> A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C11939I4 A0A = new C11939I4();
    public final ArrayList<C11812Fz> A0B = new ArrayList<>();
    public C11812Fz A04 = new C11812Fz(0, 4);

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[7].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "0WoUWtBUrhBdvujHrk0pBh1b44b9fFkR";
            strArr2[7] = "LpwXMND3FqjgYESdE0TPh3qwS83waWDS";
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0C = new byte[]{-47, -32, -32, -36, -39, -45, -47, -28, -39, -33, -34, -97, -24, -99, -35, -32, -92, -99, -45, -43, -47, -99, -90, -96, -88};
    }

    static {
        A07();
        A0G = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0F = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0K = new int[]{-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
        A0E = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        A0H = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        A0I = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        A0J = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    }

    public C111805A(String str, int i) {
        this.A08 = A04(0, 25, 96).equals(str) ? 2 : 3;
        switch (i) {
            case 3:
            case 4:
                this.A09 = 2;
                break;
            default:
                this.A09 = 1;
                break;
        }
        A0B(0);
        A06();
    }

    public static char A00(byte b) {
        int index = A0E[(b & Byte.MAX_VALUE) - 32];
        return (char) index;
    }

    public static char A01(byte b) {
        int index = A0I[b & 31];
        return (char) index;
    }

    public static char A02(byte b) {
        int index = A0J[b & 31];
        return (char) index;
    }

    public static char A03(byte b) {
        int index = A0H[b & 15];
        return (char) index;
    }

    private List<C11805Fs> A05() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.A0B.size(); i++) {
            C11805Fs A05 = this.A0B.get(i).A05();
            if (A05 != null) {
                arrayList.add(A05);
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A04.A09(this.A02);
        this.A0B.clear();
        this.A0B.add(this.A04);
    }

    private void A08(byte b) {
        this.A04.A08(' ');
        int style = (b >> 1) & 7;
        this.A04.A0E(style, (b & 1) == 1);
    }

    private void A09(byte b) {
        switch (b) {
            case 32:
                A0B(2);
                return;
            case 33:
            case 34:
            case 35:
            case 36:
            case 40:
            default:
                if (this.A02 == 0) {
                    return;
                }
                switch (b) {
                    case 33:
                        this.A04.A06();
                        return;
                    case 36:
                    default:
                        return;
                    case 44:
                        this.A05 = null;
                        int i = this.A02;
                        String[] strArr = A0D;
                        if (strArr[3].charAt(22) != strArr[5].charAt(22)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0D;
                        strArr2[1] = "IxV2WZghQ5T6kwEibQ02uWW7iDs4uQOS";
                        strArr2[7] = "gVEIHyW2z7iU6qQnAfFVCGXDV5ZJtx1l";
                        if (i != 1 && this.A02 != 3) {
                            return;
                        }
                        A06();
                        return;
                    case 45:
                        if (this.A02 != 1 || this.A04.A0F()) {
                            return;
                        }
                        this.A04.A07();
                        return;
                    case 46:
                        A06();
                        return;
                    case 47:
                        this.A05 = A05();
                        A06();
                        return;
                }
            case 37:
                A0B(1);
                A0C(2);
                return;
            case 38:
                A0B(1);
                A0C(3);
                return;
            case 39:
                A0B(1);
                A0C(4);
                return;
            case 41:
                A0B(3);
                return;
        }
    }

    private void A0A(byte b, byte b2) {
        int i = A0G[b & 7];
        int row = b2 & 32;
        int row2 = row != 0 ? 1 : 0;
        if (row2 != 0) {
            i++;
        }
        int A04 = this.A04.A04();
        String[] strArr = A0D;
        String str = strArr[0];
        String str2 = strArr[4];
        int charAt = str.charAt(27);
        int row3 = str2.charAt(27);
        if (charAt == row3) {
            String[] strArr2 = A0D;
            strArr2[3] = "H7JbpxrghbTwVbej4vMcLROuhZC8DeWr";
            strArr2[5] = "f6rT0LLTXL2YnQKUw42rJTOPcer4RkWK";
            if (i != A04) {
                int i2 = this.A02;
                String[] strArr3 = A0D;
                String str3 = strArr3[3];
                String str4 = strArr3[5];
                int charAt2 = str3.charAt(22);
                int row4 = str4.charAt(22);
                if (charAt2 == row4) {
                    A0D[2] = "rCP7fK2t8T6BPFgVAgjNGO2T1MmN1wLB";
                    if (i2 != 1 && !this.A04.A0F()) {
                        this.A04 = new C11812Fz(this.A02, this.A03);
                        this.A0B.add(this.A04);
                    }
                    this.A04.A0C(i);
                }
            }
            boolean isCursor = (b2 & 16) == 16;
            int row5 = b2 & 1;
            boolean z = row5 == 1;
            int row6 = b2 >> 1;
            int i3 = row6 & 7;
            C11812Fz c11812Fz = this.A04;
            int row7 = isCursor ? 8 : i3;
            c11812Fz.A0E(row7, z);
            if (isCursor) {
                C11812Fz c11812Fz2 = this.A04;
                int row8 = A0F[i3];
                c11812Fz2.A0B(row8);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0B(int i) {
        if (this.A02 == i) {
            return;
        }
        int i2 = this.A02;
        this.A02 = i;
        A06();
        if (i2 == 3 || i == 1 || i == 0) {
            this.A05 = null;
        }
    }

    private void A0C(int i) {
        this.A03 = i;
        this.A04.A0A(i);
    }

    public static boolean A0D(byte b) {
        return (b & 240) == 16;
    }

    private boolean A0E(byte b, byte b2) {
        boolean A0D2 = A0D(b);
        if (A0D2) {
            boolean isRepeatableControl = this.A07;
            if (isRepeatableControl && this.A00 == b && this.A01 == b2) {
                this.A07 = false;
                return true;
            }
            this.A07 = true;
            this.A00 = b;
            this.A01 = b2;
        }
        boolean isRepeatableControl2 = A0F(b, b2);
        if (isRepeatableControl2) {
            A08(b2);
        } else {
            boolean isRepeatableControl3 = A0H(b, b2);
            if (isRepeatableControl3) {
                A0A(b, b2);
            } else {
                boolean isRepeatableControl4 = A0I(b, b2);
                if (isRepeatableControl4) {
                    this.A04.A0D(b2 - 32);
                } else {
                    boolean isRepeatableControl5 = A0G(b, b2);
                    if (isRepeatableControl5) {
                        A09(b2);
                    }
                }
            }
        }
        return A0D2;
    }

    public static boolean A0F(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    public static boolean A0G(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    public static boolean A0H(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    public static boolean A0I(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    public static /* synthetic */ int[] A0J() {
        int[] iArr = A0K;
        String[] strArr = A0D;
        if (strArr[0].charAt(27) != strArr[4].charAt(27)) {
            throw new RuntimeException();
        }
        A0D[2] = "hjViamzirxEPLHidOwU1TOUc6K9qymfc";
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD
    public final /* bridge */ /* synthetic */ C11672DO A0L() throws C11807Fu {
        return super.A5Q();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD
    public final /* bridge */ /* synthetic */ AbstractC11670DM A0M() throws C11807Fu {
        return super.A5R();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD
    public final C12877XN A0N() {
        this.A06 = this.A05;
        return new C12877XN(this.A05);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD
    public final /* bridge */ /* synthetic */ void A0O(C11672DO c11672do) throws C11807Fu {
        super.AEj(c11672do);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD
    public final void A0P(C11672DO c11672do) {
        this.A0A.A0b(c11672do.A01.array(), c11672do.A01.limit());
        boolean z = false;
        boolean z2 = false;
        while (this.A0A.A04() >= this.A08) {
            byte ccData2 = this.A08 == 2 ? (byte) -4 : (byte) this.A0A.A0E();
            byte ccData1 = (byte) (this.A0A.A0E() & 127);
            byte A0E2 = (byte) (this.A0A.A0E() & 127);
            if ((ccData2 & 6) == 4 && (this.A09 != 1 || (ccData2 & 1) == 0)) {
                if (this.A09 != 2 || (ccData2 & 1) == 1) {
                    if (ccData1 != 0 || A0E2 != 0) {
                        z = true;
                        if ((ccData1 & 247) == 17 && (A0E2 & 240) == 48) {
                            this.A04.A08(A03(A0E2));
                        } else if ((ccData1 & 246) == 18 && (A0E2 & 224) == 32) {
                            this.A04.A06();
                            if ((ccData1 & 1) == 0) {
                                this.A04.A08(A01(A0E2));
                            } else {
                                this.A04.A08(A02(A0E2));
                            }
                        } else {
                            int i = ccData1 & 224;
                            if (A0D[2].charAt(21) != 'O') {
                                throw new RuntimeException();
                            }
                            A0D[6] = "aD9kIE7wrPx5oNR2SvDx5IuQrQK";
                            if (i == 0) {
                                z2 = A0E(ccData1, A0E2);
                            } else {
                                this.A04.A08(A00(ccData1));
                                if ((A0E2 & 224) != 0) {
                                    this.A04.A08(A00(A0E2));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            if (!z2) {
                this.A07 = false;
            }
            if (this.A02 == 1 || this.A02 == 3) {
                this.A05 = A05();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD
    public final boolean A0R() {
        return this.A05 != this.A06;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD, com.facebook.ads.redexgen.p370X.InterfaceC11542BG
    public final void AEy() {
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD, com.facebook.ads.redexgen.p370X.InterfaceC12880XQ
    public final /* bridge */ /* synthetic */ void AGb(long j) {
        super.AGb(j);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11661DD, com.facebook.ads.redexgen.p370X.InterfaceC11542BG
    public final void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A0B(0);
        A0C(4);
        A06();
        this.A07 = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
    }
}

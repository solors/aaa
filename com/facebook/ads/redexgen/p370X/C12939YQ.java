package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.YQ */
/* loaded from: assets/audience_network.dex */
public final class C12939YQ implements InterfaceC11583Bx, InterfaceC11592C6 {
    public static byte[] A0J;
    public static String[] A0K = {"wz4V52vnyaYzOzVosV2ggmqDE2de2aPD", "esit5oX7p0ewzuQ78yIb5IGBQ4Ll7QTy", "tMkVwszYh26uN0N48v", "KJWf5gllWosHtEG14Ww8x97Nig", "fJrikXC0LBawWnAwWRav5JxSrwLR9RG4", "RlENClTr9MFxo5IUenPz66cSFO", "MF3OfsQe3I", "XRSHK8nEMc6B"};
    public static final InterfaceC11586C0 A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC11585Bz A09;
    public C11939I4 A0A;
    public boolean A0B;
    public C11625Cd[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C11939I4 A0F;
    public final C11939I4 A0G;
    public final C11939I4 A0H;
    public final ArrayDeque<C12947YY> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{-18, 33, 28, 26, -51, 32, 22, 39, 18, -51, 25, 18, 32, 32, -51, 33, 21, 14, 27, -51, 21, 18, 14, 17, 18, 31, -51, 25, 18, 27, 20, 33, 21, -51, -43, 34, 27, 32, 34, 29, 29, 28, 31, 33, 18, 17, -42, -37, -5, -2, -86, -86};
    }

    static {
        A07();
        A0L = new C12940YR();
        A0M = AbstractC11953IK.A08(A04(48, 4, 25));
    }

    public C12939YQ() {
        this(0);
    }

    public C12939YQ(int i) {
        this.A0E = i;
        this.A0F = new C11939I4(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C11939I4(AbstractC11935I0.A03);
        this.A0G = new C11939I4(4);
        this.A06 = -1;
    }

    private int A00(long j) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        for (int i3 = 0; i3 < this.A0C.length; i3++) {
            C11625Cd c11625Cd = this.A0C[i3];
            int i4 = c11625Cd.A00;
            if (i4 != c11625Cd.A03.A01) {
                long j4 = c11625Cd.A03.A06[i4];
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - j;
                int i5 = (j6 < 0 || j6 >= 262144) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < sampleAccumulatedBytes)) {
                    i = i5;
                    sampleAccumulatedBytes = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    minAccumulatedBytesTrackIndex = i3;
                }
            }
        }
        if (j3 == Long.MAX_VALUE || trackIndex == 0) {
            return i2;
        }
        if (A0K[0].charAt(24) != 'E') {
            throw new RuntimeException();
        }
        A0K[6] = "tZzV2qNllM";
        if (j2 < 10485760 + j3) {
            return i2;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A01(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        int i;
        long A86 = interfaceC11584By.A86();
        if (this.A06 == -1) {
            this.A06 = A00(A86);
            if (this.A06 == -1) {
                return -1;
            }
        }
        C11625Cd c11625Cd = this.A0C[this.A06];
        InterfaceC11595C9 trackOutput = c11625Cd.A01;
        int i2 = c11625Cd.A00;
        long j = c11625Cd.A03.A06[i2];
        int sampleSize = c11625Cd.A03.A05[i2];
        long j2 = (j - A86) + this.A04;
        if (j2 < 0 || j2 >= 262144) {
            c11590c4.A00 = j;
            return 1;
        }
        if (c11625Cd.A02.A02 == 1) {
            j2 += 8;
            sampleSize -= 8;
        }
        interfaceC11584By.AGq((int) j2);
        if (c11625Cd.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[7].length()) {
                A0K[0] = "vyve0RiE3dygV6rbXBv0klsLEJYuli0L";
                bArr[2] = 0;
                int i3 = c11625Cd.A02.A01;
                int i4 = 4 - c11625Cd.A02.A01;
                while (this.A04 < sampleSize) {
                    if (this.A05 == 0) {
                        interfaceC11584By.readFully(this.A0G.A00, i4, i3);
                        this.A0G.A0Y(0);
                        this.A05 = this.A0G.A0H();
                        this.A0H.A0Y(0);
                        trackOutput.AFv(this.A0H, 4);
                        this.A04 += 4;
                        sampleSize += i4;
                    } else {
                        int AFu = trackOutput.AFu(interfaceC11584By, this.A05, false);
                        this.A04 += AFu;
                        this.A05 -= AFu;
                    }
                }
                i = 0;
            } else {
                throw new RuntimeException();
            }
        } else {
            while (true) {
                int i5 = this.A04;
                String[] strArr2 = A0K;
                if (strArr2[1].charAt(20) == strArr2[4].charAt(20)) {
                    A0K[6] = "5r7UGAoy7S";
                    if (i5 >= sampleSize) {
                        break;
                    }
                    int AFu2 = trackOutput.AFu(interfaceC11584By, sampleSize - this.A04, false);
                    this.A04 += AFu2;
                    this.A05 -= AFu2;
                } else if (i5 >= sampleSize) {
                    break;
                } else {
                    int AFu22 = trackOutput.AFu(interfaceC11584By, sampleSize - this.A04, false);
                    this.A04 += AFu22;
                    this.A05 -= AFu22;
                }
            }
            i = 0;
        }
        trackOutput.AFw(c11625Cd.A03.A07[i2], c11625Cd.A03.A04[i2], sampleSize, 0, null);
        c11625Cd.A00++;
        this.A06 = -1;
        this.A04 = i;
        this.A05 = i;
        return i;
    }

    public static int A02(C11634Cm c11634Cm, long j) {
        int A00 = c11634Cm.A00(j);
        if (A00 == -1) {
            return c11634Cm.A01(j);
        }
        return A00;
    }

    public static long A03(C11634Cm c11634Cm, long j, long j2) {
        int A02 = A02(c11634Cm, j);
        if (A02 == -1) {
            return j2;
        }
        return Math.min(c11634Cm.A06[A02], j2);
    }

    private ArrayList<C11634Cm> A05(C12947YY c12947yy, C11587C1 c11587c1, boolean z) throws C11464A0 {
        C11631Cj A0C;
        ArrayList<C11634Cm> arrayList = new ArrayList<>();
        for (int i = 0; i < c12947yy.A01.size(); i++) {
            C12947YY c12947yy2 = c12947yy.A01.get(i);
            int i2 = ((AbstractC11610CO) c12947yy2).A00;
            if (i2 == AbstractC11610CO.A1L && (A0C = AbstractC11615CT.A0C(c12947yy2, c12947yy.A07(AbstractC11610CO.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                C11634Cm A0E = AbstractC11615CT.A0E(A0C, c12947yy2.A06(AbstractC11610CO.A0d).A06(AbstractC11610CO.A0h).A06(AbstractC11610CO.A16), c11587c1);
                if (A0E.A01 != 0) {
                    arrayList.add(A0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws C11464A0 {
        while (true) {
            ArrayDeque<C12947YY> arrayDeque = this.A0I;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[3] = "94GrU73F5EyrcbNA6j51EfMGM9";
            strArr2[5] = "F9uNEWGJqPBROLdqhW4wSeNvu2";
            if (arrayDeque.isEmpty() || this.A0I.peek().A00 != j) {
                break;
            }
            C12947YY pop = this.A0I.pop();
            if (((AbstractC11610CO) pop).A00 == AbstractC11610CO.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                C12947YY containerAtom = this.A0I.peek();
                containerAtom.A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j) {
        C11625Cd[] c11625CdArr;
        for (C11625Cd track : this.A0C) {
            C11634Cm c11634Cm = track.A03;
            int A00 = c11634Cm.A00(j);
            if (A00 == -1) {
                A00 = c11634Cm.A01(j);
            }
            track.A00 = A00;
        }
    }

    private void A0A(C12947YY c12947yy) throws C11464A0 {
        ArrayList<C11634Cm> A05;
        int trackCount = -1;
        long j = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C11587C1 c11587c1 = new C11587C1();
        C12946YX A07 = c12947yy.A07(AbstractC11610CO.A1P);
        if (A07 != null && (metadata = AbstractC11615CT.A0F(A07, this.A0B)) != null) {
            c11587c1.A05(metadata);
        }
        try {
            A05 = A05(c12947yy, c11587c1, (this.A0E & 1) != 0);
        } catch (C12943YU unused) {
            c11587c1 = new C11587C1();
            A05 = A05(c12947yy, c11587c1, true);
        }
        int size = A05.size();
        for (int i = 0; i < size; i++) {
            C11634Cm c11634Cm = A05.get(i);
            C11631Cj c11631Cj = c11634Cm.A03;
            C11625Cd c11625Cd = new C11625Cd(c11631Cj, c11634Cm, this.A09.AHA(i, c11631Cj.A03));
            Format A0F = c11631Cj.A07.A0F(c11634Cm.A00 + 30);
            if (c11631Cj.A03 == 1) {
                if (c11587c1.A03()) {
                    A0F = A0F.A0G(c11587c1.A00, c11587c1.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            c11625Cd.A01.A69(A0F);
            j = Math.max(j, c11631Cj.A04 != -9223372036854775807L ? c11631Cj.A04 : c11634Cm.A02);
            if (c11631Cj.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(c11625Cd);
        }
        this.A02 = trackCount;
        this.A08 = j;
        this.A0C = (C11625Cd[]) arrayList.toArray(new C11625Cd[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5u();
        this.A09.AG8(this);
    }

    public static boolean A0B(int i) {
        return i == AbstractC11610CO.A0j || i == AbstractC11610CO.A1L || i == AbstractC11610CO.A0d || i == AbstractC11610CO.A0h || i == AbstractC11610CO.A16 || i == AbstractC11610CO.A0N;
    }

    public static boolean A0C(int i) {
        if (i != AbstractC11610CO.A0c && i != AbstractC11610CO.A0n && i != AbstractC11610CO.A0V && i != AbstractC11610CO.A1A && i != AbstractC11610CO.A1D && i != AbstractC11610CO.A1B && i != AbstractC11610CO.A0C && i != AbstractC11610CO.A0O && i != AbstractC11610CO.A19 && i != AbstractC11610CO.A1C && i != AbstractC11610CO.A1E && i != AbstractC11610CO.A17 && i != AbstractC11610CO.A0B) {
            int i2 = AbstractC11610CO.A1J;
            String[] strArr = A0K;
            if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                throw new RuntimeException();
            }
            A0K[0] = "U3OZ2jnvkswrjx8Ur9vHK1X6EFaJhYJ7";
            if (i != i2 && i != AbstractC11610CO.A0U && i != AbstractC11610CO.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC11584By.AEp(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        if (this.A07 == 1) {
            interfaceC11584By.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else {
            long endPosition = this.A07;
            if (endPosition == 0) {
                long A7g = interfaceC11584By.A7g();
                if (A7g == -1 && !this.A0I.isEmpty()) {
                    A7g = this.A0I.peek().A00;
                }
                if (A7g != -1) {
                    long endPosition2 = interfaceC11584By.A86();
                    long j = A7g - endPosition2;
                    int i = this.A00;
                    String[] strArr = A0K;
                    if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0K;
                    strArr2[1] = "dzRUDibdLgOz76mBe3Hd5q70FZ39yex3";
                    strArr2[4] = "PQflqNZiVauK8bXoCB0g54EgUoVKXKVc";
                    long endPosition3 = i;
                    this.A07 = j + endPosition3;
                }
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A86 = (interfaceC11584By.A86() + this.A07) - this.A00;
                this.A0I.push(new C12947YY(this.A01, A86));
                if (this.A07 == this.A00) {
                    A08(A86);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                AbstractC11914Hf.A04(this.A00 == 8);
                AbstractC11914Hf.A04(this.A07 <= 2147483647L);
                this.A0A = new C11939I4((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C11464A0(A04(0, 48, 60));
    }

    private boolean A0E(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        long j = this.A07 - this.A00;
        long A86 = interfaceC11584By.A86() + j;
        boolean z = false;
        if (this.A0A != null) {
            interfaceC11584By.readFully(this.A0A.A00, this.A00, (int) j);
            if (this.A01 == AbstractC11610CO.A0U) {
                this.A0B = A0F(this.A0A);
            } else {
                boolean isEmpty = this.A0I.isEmpty();
                String[] strArr = A0K;
                if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                    throw new RuntimeException();
                }
                A0K[6] = "JSMKdVw6fi";
                if (!isEmpty) {
                    this.A0I.peek().A09(new C12946YX(this.A01, this.A0A));
                }
            }
        } else if (j < 262144) {
            interfaceC11584By.AGq((int) j);
        } else {
            c11590c4.A00 = interfaceC11584By.A86() + j;
            z = true;
        }
        A08(A86);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C11939I4 c11939i4) {
        int A08;
        int majorBrand;
        c11939i4.A0Y(8);
        int A082 = c11939i4.A08();
        int majorBrand2 = A0M;
        if (A082 == majorBrand2) {
            return true;
        }
        c11939i4.A0Z(4);
        do {
            int A04 = c11939i4.A04();
            String[] strArr = A0K;
            String str = strArr[3];
            String str2 = strArr[5];
            int length = str.length();
            int majorBrand3 = str2.length();
            if (length != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "ak31gwjiZ7lchhs8qU";
            strArr2[7] = "SN9Txq6J8sCX";
            if (A04 > 0) {
                A08 = c11939i4.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (A08 != majorBrand);
        return true;
    }

    public static long[][] A0G(C11625Cd[] c11625CdArr) {
        long[][] jArr = new long[c11625CdArr.length];
        int[] iArr = new int[c11625CdArr.length];
        long[] jArr2 = new long[c11625CdArr.length];
        boolean[] tracksFinished = new boolean[c11625CdArr.length];
        for (int i = 0; i < c11625CdArr.length; i++) {
            jArr[i] = new long[c11625CdArr[i].A03.A01];
            jArr2[i] = c11625CdArr[i].A03.A07[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c11625CdArr.length) {
            long j2 = Long.MAX_VALUE;
            int minTimeTrackIndex = -1;
            for (int i3 = 0; i3 < c11625CdArr.length; i3++) {
                if (!tracksFinished[i3]) {
                    long minTimeUs = jArr2[i3];
                    if (minTimeUs <= j2) {
                        minTimeTrackIndex = i3;
                        j2 = jArr2[i3];
                    }
                }
            }
            int i4 = iArr[minTimeTrackIndex];
            jArr[minTimeTrackIndex][i4] = j;
            j += c11625CdArr[minTimeTrackIndex].A03.A05[i4];
            int i5 = i4 + 1;
            iArr[minTimeTrackIndex] = i5;
            if (i5 < jArr[minTimeTrackIndex].length) {
                jArr2[minTimeTrackIndex] = c11625CdArr[minTimeTrackIndex].A03.A07[i5];
            } else {
                tracksFinished[minTimeTrackIndex] = true;
                i2++;
            }
        }
        return jArr;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final long A7F() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final C11591C5 A8H(long j) {
        long secondTimeUs;
        long j2;
        int sampleIndex;
        if (this.A0C.length == 0) {
            return new C11591C5(C11593C7.A04);
        }
        long j3 = -9223372036854775807L;
        long secondOffset = -1;
        int i = this.A02;
        if (A0K[6].length() == 10) {
            String[] strArr = A0K;
            strArr[1] = "zNPStOwPeWMWlu6U4cps5UEx93ZdGJzU";
            strArr[4] = "1Oiw5RRZUeL0D5PfWcAG5DXe0fbn2IOb";
            if (i != -1) {
                C11634Cm c11634Cm = this.A0C[this.A02].A03;
                int A02 = A02(c11634Cm, j);
                if (A02 == -1) {
                    return new C11591C5(C11593C7.A04);
                }
                secondTimeUs = c11634Cm.A07[A02];
                j2 = c11634Cm.A06[A02];
                if (secondTimeUs < j && A02 < c11634Cm.A01 - 1 && (sampleIndex = c11634Cm.A01(j)) != -1 && sampleIndex != A02) {
                    j3 = c11634Cm.A07[sampleIndex];
                    secondOffset = c11634Cm.A06[sampleIndex];
                }
            } else {
                secondTimeUs = j;
                j2 = Long.MAX_VALUE;
            }
            for (int i2 = 0; i2 < this.A0C.length; i2++) {
                int i3 = this.A02;
                if (A0K[6].length() == 10) {
                    A0K[0] = "CBUdIpY9GLFYfu7LhTfnmGuFEDhohH6D";
                    if (i2 != i3) {
                        C11634Cm c11634Cm2 = this.A0C[i2].A03;
                        j2 = A03(c11634Cm2, secondTimeUs, j2);
                        if (j3 != -9223372036854775807L) {
                            secondOffset = A03(c11634Cm2, j3, secondOffset);
                        }
                    }
                }
            }
            C11593C7 c11593c7 = new C11593C7(secondTimeUs, j2);
            if (j3 == -9223372036854775807L) {
                return new C11591C5(c11593c7);
            }
            return new C11591C5(c11593c7, new C11593C7(j3, secondOffset));
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A09 = interfaceC11585Bz;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11592C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final int AEk(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (A0D(interfaceC11584By)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    if (!A0E(interfaceC11584By, c11590c4)) {
                        break;
                    } else {
                        String[] strArr = A0K;
                        if (strArr[2].length() != strArr[7].length()) {
                            A0K[6] = "Qacs7AJWJq";
                            return 1;
                        }
                        throw new RuntimeException();
                    }
                case 2:
                    return A01(interfaceC11584By, c11590c4);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void AG7(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final boolean AGs(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        return AbstractC11629Ch.A04(interfaceC11584By);
    }
}

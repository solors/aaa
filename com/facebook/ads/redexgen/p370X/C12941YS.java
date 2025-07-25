package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.YS */
/* loaded from: assets/audience_network.dex */
public final class C12941YS implements InterfaceC11583Bx {
    public static byte[] A0X;
    public static String[] A0Y = {"NLNd4eI8orA1H4rBpr8HMLqUS8K0bIhZ", "4iV8K", "FgNr", "GaBUpY3lkp20WVhZ3rI", "4koLIaX6bKg5r0b1Lqm", "8ZnkkLJNVKhhCexk35olMcz5oR9RrYh", "DMCEbABAxHK2JHC68zvJPiYU4vzbcsY5", "h5GR"};
    public static final InterfaceC11586C0 A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC11585Bz A0C;
    public C11622Ca A0D;
    public C11939I4 A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC11595C9[] A0H;
    public InterfaceC11595C9[] A0I;
    public final int A0J;
    public final SparseArray<C11622Ca> A0K;
    public final DrmInitData A0L;
    public final InterfaceC11595C9 A0M;
    public final C11631Cj A0N;
    public final C11939I4 A0O;
    public final C11939I4 A0P;
    public final C11939I4 A0Q;
    public final C11939I4 A0R;
    public final C11950IG A0S;
    public final ArrayDeque<C12947YY> A0T;
    public final ArrayDeque<C11621CZ> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(C11622Ca c11622Ca, int i, long j, int i2, C11939I4 c11939i4, int i3) {
        int i4 = i3;
        long j2 = j;
        c11939i4.A0Y(8);
        int A00 = AbstractC11610CO.A00(c11939i4.A08());
        C11631Cj c11631Cj = c11622Ca.A05;
        C11633Cl c11633Cl = c11622Ca.A07;
        C11616CU c11616cu = c11633Cl.A07;
        c11633Cl.A0E[i] = c11939i4.A0H();
        c11633Cl.A0G[i] = c11633Cl.A05;
        if ((A00 & 1) != 0) {
            long[] jArr = c11633Cl.A0G;
            long j3 = jArr[i];
            long A08 = c11939i4.A08();
            String[] strArr = A0Y;
            if (strArr[0].charAt(25) == strArr[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[4] = "sBrX2EtwYh6muAXVYmp";
            strArr2[3] = "Nkb2elyGZGwJQHQIPXA";
            jArr[i] = j3 + A08;
        }
        int i5 = A00 & 4;
        String[] strArr3 = A0Y;
        if (strArr3[1].length() != strArr3[5].length()) {
            String[] strArr4 = A0Y;
            strArr4[4] = "HmZMGavRpWiJTUMCOGz";
            strArr4[3] = "B8AJYf0RCBxmiXX5ezT";
            boolean z = i5 != 0;
            int i6 = c11616cu.A01;
            if (z) {
                i6 = c11939i4.A0H();
            }
            boolean z2 = (A00 & 256) != 0;
            boolean z3 = (A00 & 512) != 0;
            boolean z4 = (A00 & 1024) != 0;
            boolean z5 = (A00 & 2048) != 0;
            long j4 = 0;
            if (c11631Cj.A08 != null && c11631Cj.A08.length == 1 && c11631Cj.A08[0] == 0) {
                j4 = AbstractC11953IK.A0F(c11631Cj.A09[0], 1000L, c11631Cj.A06);
            }
            int[] iArr = c11633Cl.A0D;
            int[] iArr2 = c11633Cl.A0C;
            long[] jArr2 = c11633Cl.A0F;
            boolean[] zArr = c11633Cl.A0I;
            boolean z6 = c11631Cj.A03 == 2 && (i2 & 1) != 0;
            int i7 = i4 + c11633Cl.A0E[i];
            long j5 = c11631Cj.A06;
            if (i > 0) {
                j2 = c11633Cl.A06;
            }
            String[] strArr5 = A0Y;
            if (strArr5[7].length() != strArr5[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr6 = A0Y;
            strArr6[7] = "ymkz";
            strArr6[2] = "tPkJ";
            while (i4 < i7) {
                int A0H = z2 ? c11939i4.A0H() : c11616cu.A00;
                int A0H2 = z3 ? c11939i4.A0H() : c11616cu.A03;
                int A082 = (i4 == 0 && z) ? i6 : z4 ? c11939i4.A08() : c11616cu.A01;
                if (z5) {
                    iArr2[i4] = (int) ((c11939i4.A08() * 1000) / j5);
                } else {
                    iArr2[i4] = 0;
                }
                jArr2[i4] = AbstractC11953IK.A0F(j2, 1000L, j5) - j4;
                iArr[i4] = A0H2;
                zArr[i4] = ((A082 >> 16) & 1) == 0 && (!z6 || i4 == 0);
                j2 += A0H;
                i4++;
            }
            c11633Cl.A06 = j2;
            return i7;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C12968Yt> A04(C11939I4 c11939i4, long j) throws C11464A0 {
        long A0N;
        long A0N2;
        c11939i4.A0Y(8);
        int A01 = AbstractC11610CO.A01(c11939i4.A08());
        c11939i4.A0Z(4);
        long A0M = c11939i4.A0M();
        if (A01 == 0) {
            A0N = c11939i4.A0M();
            A0N2 = j + c11939i4.A0M();
        } else {
            A0N = c11939i4.A0N();
            A0N2 = j + c11939i4.A0N();
        }
        long A0F = AbstractC11953IK.A0F(A0N, 1000000L, A0M);
        c11939i4.A0Z(2);
        int A0I = c11939i4.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        long j2 = A0F;
        for (int i = 0; i < A0I; i++) {
            int A08 = c11939i4.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C11464A0(A0A(581, 28, 60));
            }
            long A0M2 = c11939i4.A0M();
            iArr[i] = Integer.MAX_VALUE & A08;
            jArr[i] = A0N2;
            jArr3[i] = j2;
            A0N += A0M2;
            j2 = AbstractC11953IK.A0F(A0N, 1000000L, A0M);
            jArr2[i] = j2 - jArr3[i];
            c11939i4.A0Z(4);
            A0N2 += iArr[i];
        }
        return Pair.create(Long.valueOf(A0F), new C12968Yt(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11622Ca A09(C11939I4 c11939i4, SparseArray<C11622Ca> sparseArray) {
        c11939i4.A0Y(8);
        int A00 = AbstractC11610CO.A00(c11939i4.A08());
        C11622Ca A08 = A08(sparseArray, c11939i4.A08());
        if (A08 == null) {
            return null;
        }
        int i = A00 & 1;
        String[] strArr = A0Y;
        if (strArr[4].length() == strArr[3].length()) {
            String[] strArr2 = A0Y;
            strArr2[7] = "FJhT";
            strArr2[2] = "Pkvr";
            if (i != 0) {
                long A0N = c11939i4.A0N();
                A08.A07.A05 = A0N;
                A08.A07.A04 = A0N;
            }
            C11616CU c11616cu = A08.A04;
            int A0H = (A00 & 2) != 0 ? c11939i4.A0H() - 1 : c11616cu.A02;
            int i2 = A00 & 8;
            String[] strArr3 = A0Y;
            if (strArr3[1].length() != strArr3[5].length()) {
                String[] strArr4 = A0Y;
                strArr4[1] = "0FTku";
                strArr4[5] = "hJQPen4eUYzTZKVdfpRcJxs2T1l2JpI";
                A08.A07.A07 = new C11616CU(A0H, i2 != 0 ? c11939i4.A0H() : c11616cu.A00, (A00 & 16) != 0 ? c11939i4.A0H() : c11616cu.A03, (A00 & 32) != 0 ? c11939i4.A0H() : c11616cu.A01);
                return A08;
            }
        }
        throw new RuntimeException();
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{41, 37, 102, 83, 72, 74, 7, 84, 78, 93, 66, 7, 75, 66, 84, 84, 7, 83, 79, 70, 73, 7, 79, 66, 70, 67, 66, 85, 7, 75, 66, 73, SignedBytes.MAX_POWER_OF_TWO, 83, 79, 7, 15, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 14, 9, 117, 94, 68, 66, 73, 16, 83, 95, 69, 94, 68, 16, 89, 94, 16, 67, 82, 87, SignedBytes.MAX_POWER_OF_TWO, 16, 17, 13, 16, 1, 16, 24, 69, 94, 67, 69, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 95, 66, 68, 85, 84, 25, 30, 56, 19, 9, 15, 4, 93, 30, 18, 8, 19, 9, 93, 20, 19, 93, 14, 26, 13, 25, 93, 92, SignedBytes.MAX_POWER_OF_TWO, 93, 76, 93, 85, 8, 19, 14, 8, 13, 13, 18, 15, 9, 24, 25, 84, 83, 40, 28, 15, 9, 3, 11, 0, 26, 11, 10, 35, 30, 90, 43, 22, 26, 28, 15, 13, 26, 1, 28, 10, 36, 45, 44, 49, 42, 45, 36, 99, 45, 38, 36, 34, 55, 42, 53, 38, 99, 44, 37, 37, 48, 38, 55, 99, 55, 44, 99, 48, 34, 46, 51, 47, 38, 99, 39, 34, 55, 34, 109, 58, 19, 23, 16, 86, 23, 2, 25, 27, 86, 18, 19, 16, 31, 24, 19, 5, 86, 19, 14, 2, 19, 24, 18, 19, 18, 86, 23, 2, 25, 27, 86, 5, 31, 12, 19, 86, 94, 3, 24, 5, 3, 6, 6, 25, 4, 2, 19, 18, 95, 88, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 85, 75, 86, 74, 2, 78, 71, 76, 69, 86, 74, 2, 28, 2, 16, 19, 22, 21, 22, 26, 17, 20, 22, 21, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 11, 12, 122, 83, 88, 81, 66, 94, 22, 91, 95, 69, 91, 87, 66, 85, 94, 12, 22, 35, 10, 10, 31, 9, 24, 76, 24, 3, 76, 9, 2, 15, 30, 21, 28, 24, 5, 3, 2, 76, 8, 13, 24, 13, 76, 27, 13, 31, 76, 2, 9, 11, 13, 24, 5, 26, 9, 66, 69, 108, 108, 121, 111, 126, 42, 126, 101, 42, 111, 100, 110, 42, 101, 108, 42, 103, 110, 107, 126, 42, 125, 107, 121, 42, 100, 111, 109, 107, 126, 99, 124, 111, 36, 16, 41, 58, 45, 45, 54, 59, 54, 49, 56, Byte.MAX_VALUE, 11, 45, 62, 60, 52, 26, 49, 60, 45, 38, 47, 43, 54, 48, 49, 29, 48, 39, Byte.MAX_VALUE, 47, 62, 45, 62, 50, 58, 43, 58, 45, 44, Byte.MAX_VALUE, 54, 44, Byte.MAX_VALUE, 42, 49, 44, 42, 47, 47, 48, 45, 43, 58, 59, 113, 11, 51, 49, 40, 40, 61, 60, 120, 40, 43, 43, 48, 120, 57, 44, 55, 53, 120, 112, 62, 57, 49, 52, 61, 60, 120, 44, 55, 120, 61, 32, 44, 42, 57, 59, 44, 120, 45, 45, 49, 60, 113, 20, 44, 46, 55, 55, 46, 41, 32, 103, 38, 51, 40, 42, 103, 48, 46, 51, 47, 103, 43, 34, 41, 32, 51, 47, 103, 121, 103, 117, 118, 115, 112, 115, Byte.MAX_VALUE, 116, 113, 115, 112, 103, 111, 50, 41, 52, 50, 55, 55, 40, 53, 51, 34, 35, 110, 105, 77, 118, 125, 96, 104, 125, 123, 108, 125, 124, 56, 117, 119, 119, 110, 56, 122, 119, 96, 54, 72, 115, 120, 101, 109, 120, 126, 105, 120, 121, 61, 110, 124, 116, 114, 61, 120, 115, 105, 111, 100, 61, 126, 114, 104, 115, 105, 39, 61, 90, 97, 103, 110, 97, 107, 99, 106, 107, 47, 102, 97, 107, 102, 125, 106, 108, 123, 47, 125, 106, 105, 106, 125, 106, 97, 108, 106, 86, 97, 114, 105, 97, 98, 108, 101, 32, 108, 101, 110, 103, 116, 104, 32, 100, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 32, 105, 110, 32, 115, 103, 112, 100, 32, 102, 111, 117, 110, 100, 32, 40, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 41, 41, 56, 56, 36, 33, 43, 41, 60, 33, 39, 38, 103, 48, 101, 45, 37, 59, 47, 37, 51, 63, 49, 122, 101, 104, 105, 99, 35, 100, 105, 122, 111, 34, 61, 48, 49, 59, 123, 57, 36, 96};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0K(C12947YY c12947yy) throws C11464A0 {
        AbstractC11914Hf.A06(this.A0N == null, A0A(532, 20, 43));
        DrmInitData drmInitData = this.A0L;
        String[] strArr = A0Y;
        if (strArr[1].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[0] = "cITVXbucFjOfeClWrkS0v9B8d8WyNU66";
        strArr2[6] = "gc4qcVgrZ1gcE7K2dExDGvJ4qDD8VQ1r";
        DrmInitData A05 = drmInitData != null ? this.A0L : A05(c12947yy.A02);
        C12947YY A06 = c12947yy.A06(AbstractC11610CO.A0m);
        SparseArray<C11616CU> sparseArray = new SparseArray<>();
        long j = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i = 0; i < size; i++) {
            C12946YX c12946yx = A06.A02.get(i);
            if (((AbstractC11610CO) c12946yx).A00 == AbstractC11610CO.A1M) {
                Pair<Integer, C11616CU> A03 = A03(c12946yx.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (C11616CU) A03.second);
            } else if (((AbstractC11610CO) c12946yx).A00 == AbstractC11610CO.A0f) {
                j = A01(c12946yx.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c12947yy.A01.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C12947YY c12947yy2 = c12947yy.A01.get(i2);
            if (((AbstractC11610CO) c12947yy2).A00 == AbstractC11610CO.A1L) {
                C11631Cj A0C = AbstractC11615CT.A0C(c12947yy2, c12947yy.A07(AbstractC11610CO.A0n), j, A05, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            AbstractC11914Hf.A04(this.A0K.size() == size3);
            for (int i3 = 0; i3 < size3; i3++) {
                C11631Cj c11631Cj = (C11631Cj) sparseArray2.valueAt(i3);
                this.A0K.get(c11631Cj.A00).A07(c11631Cj, A06(sparseArray, c11631Cj.A00));
            }
            return;
        }
        for (int i4 = 0; i4 < size3; i4++) {
            C11631Cj c11631Cj2 = (C11631Cj) sparseArray2.valueAt(i4);
            C11622Ca c11622Ca = new C11622Ca(this.A0C.AHA(i4, c11631Cj2.A03));
            c11622Ca.A07(c11631Cj2, A06(sparseArray, c11631Cj2.A00));
            this.A0K.put(c11631Cj2.A00, c11622Ca);
            this.A08 = Math.max(this.A08, c11631Cj2.A04);
        }
        A0C();
        this.A0C.A5u();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(C12947YY c12947yy, SparseArray<C11622Ca> sparseArray, int i, byte[] bArr) throws C11464A0 {
        C11622Ca A09 = A09(c12947yy.A07(AbstractC11610CO.A1I).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        C11633Cl c11633Cl = A09.A07;
        long j = c11633Cl.A06;
        A09.A04();
        if (c12947yy.A07(AbstractC11610CO.A1H) != null && (i & 2) == 0) {
            j = A02(c12947yy.A07(AbstractC11610CO.A1H).A00);
        }
        A0N(c12947yy, A09, j, i);
        C11631Cj c11631Cj = A09.A05;
        C11616CU c11616cu = c11633Cl.A07;
        String[] strArr = A0Y;
        if (strArr[4].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[4] = "WU7oMBOObJevND1f7OB";
        strArr2[3] = "wctXeW8hr2zoeToUczf";
        C11632Ck A00 = c11631Cj.A00(c11616cu.A02);
        C12946YX A07 = c12947yy.A07(AbstractC11610CO.A0u);
        if (A07 != null) {
            A0P(A00, A07.A00, c11633Cl);
        }
        C12946YX A072 = c12947yy.A07(AbstractC11610CO.A0t);
        if (A072 != null) {
            A0S(A072.A00, c11633Cl);
        }
        C12946YX A073 = c12947yy.A07(AbstractC11610CO.A10);
        if (A073 != null) {
            A0T(A073.A00, c11633Cl);
        }
        C12946YX A074 = c12947yy.A07(AbstractC11610CO.A0x);
        C12946YX A075 = c12947yy.A07(AbstractC11610CO.A11);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, c11633Cl);
        }
        int size = c12947yy.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<C12946YX> list = c12947yy.A02;
            String[] strArr3 = A0Y;
            if (strArr3[0].charAt(25) == strArr3[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0Y;
            strArr4[1] = "paWge";
            strArr4[5] = "dXzfuXi73AxT86ALLJ8HbAy7LfB3Ldz";
            C12946YX c12946yx = list.get(i2);
            if (((AbstractC11610CO) c12946yx).A00 == AbstractC11610CO.A1Q) {
                A0U(c12946yx.A00, c11633Cl, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0P(C11632Ck c11632Ck, C11939I4 c11939i4, C11633Cl c11633Cl) throws C11464A0 {
        int i = c11632Ck.A00;
        c11939i4.A0Y(8);
        if ((AbstractC11610CO.A00(c11939i4.A08()) & 1) == 1) {
            c11939i4.A0Z(8);
        }
        int A0E = c11939i4.A0E();
        int A0H = c11939i4.A0H();
        if (A0H != c11633Cl.A00) {
            throw new C11464A0(A0A(290, 17, 5) + A0H + A0A(0, 2, 54) + c11633Cl.A00);
        }
        int i2 = 0;
        if (A0E == 0) {
            boolean[] zArr = c11633Cl.A0H;
            for (int i3 = 0; i3 < A0H; i3++) {
                int A0E2 = c11939i4.A0E();
                i2 += A0E2;
                zArr[i3] = A0E2 > i;
            }
        } else {
            i2 = 0 + (A0E * A0H);
            Arrays.fill(c11633Cl.A0H, 0, A0H, A0E > i);
        }
        c11633Cl.A02(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r4 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
        if (r4 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r4 = false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0V(com.facebook.ads.redexgen.p370X.C11939I4 r10, com.facebook.ads.redexgen.p370X.C11939I4 r11, java.lang.String r12, com.facebook.ads.redexgen.p370X.C11633Cl r13) throws com.facebook.ads.redexgen.p370X.C11464A0 {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12941YS.A0V(com.facebook.ads.redexgen.X.I4, com.facebook.ads.redexgen.X.I4, java.lang.String, com.facebook.ads.redexgen.X.Cl):void");
    }

    static {
        A0D();
        A0Z = new C12942YT();
        A0a = AbstractC11953IK.A08(A0A(682, 4, 101));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 123), Long.MAX_VALUE);
    }

    public C12941YS() {
        this(0);
    }

    public C12941YS(int i) {
        this(i, null);
    }

    public C12941YS(int i, C11950IG c11950ig) {
        this(i, c11950ig, null, null);
    }

    public C12941YS(int i, C11950IG c11950ig, C11631Cj c11631Cj, DrmInitData drmInitData) {
        this(i, c11950ig, c11631Cj, drmInitData, Collections.emptyList());
    }

    public C12941YS(int i, C11950IG c11950ig, C11631Cj c11631Cj, DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c11950ig, c11631Cj, drmInitData, closedCaptionFormats, null);
    }

    public C12941YS(int i, C11950IG c11950ig, C11631Cj c11631Cj, DrmInitData drmInitData, List<Format> closedCaptionFormats, InterfaceC11595C9 interfaceC11595C9) {
        this.A0J = (c11631Cj != null ? 8 : 0) | i;
        this.A0S = c11950ig;
        this.A0N = c11631Cj;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = interfaceC11595C9;
        this.A0O = new C11939I4(16);
        this.A0R = new C11939I4(AbstractC11935I0.A03);
        this.A0Q = new C11939I4(5);
        this.A0P = new C11939I4();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(C11939I4 c11939i4) {
        c11939i4.A0Y(8);
        int fullAtom = c11939i4.A08();
        return AbstractC11610CO.A01(fullAtom) == 0 ? c11939i4.A0M() : c11939i4.A0N();
    }

    public static long A02(C11939I4 c11939i4) {
        c11939i4.A0Y(8);
        int fullAtom = c11939i4.A08();
        int version = AbstractC11610CO.A01(fullAtom);
        return version == 1 ? c11939i4.A0N() : c11939i4.A0M();
    }

    public static Pair<Integer, C11616CU> A03(C11939I4 c11939i4) {
        c11939i4.A0Y(12);
        int defaultSampleDescriptionIndex = c11939i4.A08();
        int trackId = c11939i4.A0H();
        int defaultSampleFlags = c11939i4.A0H();
        int defaultSampleSize = c11939i4.A0H();
        int defaultSampleDuration = c11939i4.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C11616CU(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C12946YX> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C12946YX c12946yx = list.get(i);
            int leafChildrenSize = ((AbstractC11610CO) c12946yx).A00;
            if (leafChildrenSize == AbstractC11610CO.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c12946yx.A00.A00;
                UUID A02 = AbstractC11628Cg.A02(bArr);
                if (A02 == null) {
                    Log.w(A0A(128, 22, 93), A0A(437, 42, 107));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0A(696, 9, 103), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C11616CU A06(SparseArray<C11616CU> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C11616CU) AbstractC11914Hf.A01(sparseArray.get(i));
    }

    public static C11622Ca A07(SparseArray<C11622Ca> sparseArray) {
        C11622Ca c11622Ca = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C11622Ca valueAt = sparseArray.valueAt(i);
            if (valueAt.A02 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < j) {
                    c11622Ca = valueAt;
                    j = nextTrackRunOffset;
                }
            }
        }
        return c11622Ca;
    }

    public static C11622Ca A08(SparseArray<C11622Ca> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x005c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0I
            if (r0 != 0) goto L4a
            r0 = 2
            com.facebook.ads.redexgen.X.C9[] r0 = new com.facebook.ads.redexgen.p370X.InterfaceC11595C9[r0]
            r6.A0I = r0
            r5 = 0
            com.facebook.ads.redexgen.X.C9 r0 = r6.A0M
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.C9[] r2 = r6.A0I
            int r1 = r5 + 1
            com.facebook.ads.redexgen.X.C9 r0 = r6.A0M
            r2[r5] = r0
            r5 = r1
        L17:
            int r0 = r6.A0J
            r4 = 4
            r0 = r0 & r4
            if (r0 == 0) goto L30
            com.facebook.ads.redexgen.X.C9[] r3 = r6.A0I
            int r2 = r5 + 1
            com.facebook.ads.redexgen.X.Bz r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.Ca> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C9 r0 = r1.AHA(r0, r4)
            r3[r5] = r0
            r5 = r2
        L30:
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0I
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.facebook.ads.redexgen.X.C9[] r0 = (com.facebook.ads.redexgen.p370X.InterfaceC11595C9[]) r0
            r6.A0I = r0
            com.facebook.ads.redexgen.X.C9[] r4 = r6.A0I
            int r3 = r4.length
            r2 = 0
        L3e:
            if (r2 >= r3) goto L4a
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.redexgen.p370X.C12941YS.A0b
            r1.A69(r0)
            int r2 = r2 + 1
            goto L3e
        L4a:
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0H
            if (r0 != 0) goto L80
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C9[] r0 = new com.facebook.ads.redexgen.p370X.InterfaceC11595C9[r0]
            r6.A0H = r0
            r3 = 0
        L59:
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L80
            com.facebook.ads.redexgen.X.Bz r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.Ca> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.C9 r1 = r2.AHA(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r0
            r1.A69(r0)
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0H
            r0[r3] = r1
            int r3 = r3 + 1
            goto L59
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12941YS.A0C():void");
    }

    private void A0E(long j) {
        while (!this.A0U.isEmpty()) {
            C11621CZ removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j2 = j + removeFirst.A01;
            if (this.A0S != null) {
                j2 = this.A0S.A06(j2);
            }
            for (InterfaceC11595C9 interfaceC11595C9 : this.A0I) {
                interfaceC11595C9.AFw(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C11464A0 {
        while (!this.A0T.isEmpty()) {
            C12947YY peek = this.A0T.peek();
            String[] strArr = A0Y;
            if (strArr[0].charAt(25) == strArr[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[4] = "gNXaBBDJLYyRWj2Z7QI";
            strArr2[3] = "TD4PDa0LhqSPzxNxfPG";
            if (peek.A00 != j) {
                break;
            }
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        int i = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC11584By.readFully(this.A0E.A00, 8, i);
            int atomPayloadSize = this.A01;
            A0O(new C12946YX(atomPayloadSize, this.A0E), interfaceC11584By.A86());
        } else {
            interfaceC11584By.AGq(i);
        }
        A0F(interfaceC11584By.A86());
        String[] strArr = A0Y;
        String str = strArr[0];
        String str2 = strArr[6];
        int atomPayloadSize2 = str.charAt(25);
        if (atomPayloadSize2 == str2.charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[1] = "4FJvf";
        strArr2[5] = "L9aSIrlhJLOJ4gZHMUtL1skIFqYjh5f";
    }

    private void A0H(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        C11622Ca nextTrackBundle = null;
        long j = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            C11633Cl c11633Cl = this.A0K.valueAt(i).A07;
            if (c11633Cl.A0B && c11633Cl.A04 < j) {
                j = c11633Cl.A04;
                SparseArray<C11622Ca> sparseArray = this.A0K;
                String[] strArr = A0Y;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Y;
                strArr2[1] = "kt1A3";
                strArr2[5] = "mNo1CSqVUFLWh990elZl1WPNTwsUo12";
                C11622Ca nextTrackBundle2 = sparseArray.valueAt(i);
                nextTrackBundle = nextTrackBundle2;
            }
        }
        if (nextTrackBundle == null) {
            this.A02 = 3;
            return;
        }
        int A86 = (int) (j - interfaceC11584By.A86());
        if (A86 >= 0) {
            interfaceC11584By.AGq(A86);
            nextTrackBundle.A07.A04(interfaceC11584By);
            return;
        }
        throw new C11464A0(A0A(307, 39, 95));
    }

    private void A0I(C12947YY c12947yy) throws C11464A0 {
        if (((AbstractC11610CO) c12947yy).A00 == AbstractC11610CO.A0j) {
            A0K(c12947yy);
        } else if (((AbstractC11610CO) c12947yy).A00 == AbstractC11610CO.A0i) {
            A0J(c12947yy);
        } else if (this.A0T.isEmpty()) {
        } else {
            this.A0T.peek().A08(c12947yy);
        }
    }

    private void A0J(C12947YY c12947yy) throws C11464A0 {
        A0L(c12947yy, this.A0K, this.A0J, this.A0W);
        DrmInitData A05 = this.A0L != null ? null : A05(c12947yy.A02);
        if (A05 != null) {
            int size = this.A0K.size();
            String[] strArr = A0Y;
            if (strArr[1].length() != strArr[5].length()) {
                String[] strArr2 = A0Y;
                strArr2[0] = "AYjZd4g6T0IxTHPvW5j6vW4JlA5KT5rF";
                strArr2[6] = "Mee0jY90dwUegeNg5bKbsrEqYZuyqQmD";
                int i = 0;
                while (i < size) {
                    C11622Ca valueAt = this.A0K.valueAt(i);
                    String[] strArr3 = A0Y;
                    String str = strArr3[1];
                    String str2 = strArr3[5];
                    int trackCount = str.length();
                    if (trackCount != str2.length()) {
                        String[] strArr4 = A0Y;
                        strArr4[0] = "9D0DcxlbTrvCOM9kwdnib1tB4ktxoksB";
                        strArr4[6] = "xmyCm9TqbgmL7mY9bOatvH3VH7vFgkg3";
                        valueAt.A06(A05);
                        i++;
                    } else {
                        valueAt.A06(A05);
                        i++;
                    }
                }
            }
            throw new RuntimeException();
        }
        if (this.A0A != -9223372036854775807L) {
            int size2 = this.A0K.size();
            String[] strArr5 = A0Y;
            if (strArr5[0].charAt(25) == strArr5[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr6 = A0Y;
            strArr6[1] = "SLujA";
            strArr6[5] = "54hBL6ZhhAHwudix1T3OFjmqjeaVz8V";
            for (int i2 = 0; i2 < size2; i2++) {
                C11622Ca valueAt2 = this.A0K.valueAt(i2);
                long j = this.A0A;
                String[] strArr7 = A0Y;
                String str3 = strArr7[7];
                String str4 = strArr7[2];
                int trackCount2 = str3.length();
                if (trackCount2 != str4.length()) {
                    throw new RuntimeException();
                }
                String[] strArr8 = A0Y;
                strArr8[0] = "JzptpZA4eYxy2xJI1KlH0ejrbcDGS6Rm";
                strArr8[6] = "qWlvxcI9Vh7HD5II0LoLiUDgTr4SEUlu";
                valueAt2.A05(j);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(C12947YY c12947yy, SparseArray<C11622Ca> sparseArray, int i, byte[] bArr) throws C11464A0 {
        int size = c12947yy.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C12947YY child = c12947yy.A01.get(i2);
            int i3 = ((AbstractC11610CO) child).A00;
            int moofContainerChildrenSize = AbstractC11610CO.A1K;
            if (i3 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i, bArr);
            }
        }
    }

    public static void A0N(C12947YY c12947yy, C11622Ca c11622Ca, long j, int trunIndex) {
        int i = 0;
        int trunSampleCount = 0;
        List<C12946YX> list = c12947yy.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C12946YX c12946yx = list.get(i2);
            if (((AbstractC11610CO) c12946yx).A00 == AbstractC11610CO.A1N) {
                C11939I4 trunData = c12946yx.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    trunSampleCount += A0H;
                    String[] strArr = A0Y;
                    if (strArr[4].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0Y;
                    strArr2[0] = "ra20oBhvV3095H1tQEj3cUfqdugQ0hdh";
                    strArr2[6] = "LUb7Sxx6Lbmy90ZTUB4vzQSJRbj77A9K";
                    i++;
                } else {
                    continue;
                }
            }
        }
        c11622Ca.A02 = 0;
        c11622Ca.A00 = 0;
        c11622Ca.A01 = 0;
        c11622Ca.A07.A03(i, trunSampleCount);
        int i3 = 0;
        int trunStartPosition = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C12946YX c12946yx2 = list.get(i4);
            int trunIndex2 = ((AbstractC11610CO) c12946yx2).A00;
            if (trunIndex2 == AbstractC11610CO.A1N) {
                trunStartPosition = A00(c11622Ca, i3, j, trunIndex, c12946yx2.A00, trunStartPosition);
                i3++;
            }
        }
    }

    private void A0O(C12946YX c12946yx, long j) throws C11464A0 {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(c12946yx);
        } else if (((AbstractC11610CO) c12946yx).A00 == AbstractC11610CO.A12) {
            Pair<Long, C12968Yt> A04 = A04(c12946yx.A00, j);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AG8((InterfaceC11592C6) A04.second);
            this.A0F = true;
        } else if (((AbstractC11610CO) c12946yx).A00 != AbstractC11610CO.A0P) {
        } else {
            A0Q(c12946yx.A00);
        }
    }

    private void A0Q(C11939I4 c11939i4) {
        InterfaceC11595C9[] interfaceC11595C9Arr;
        if (this.A0I == null || this.A0I.length == 0) {
            return;
        }
        c11939i4.A0Y(12);
        int A04 = c11939i4.A04();
        c11939i4.A0Q();
        c11939i4.A0Q();
        long A0F = AbstractC11953IK.A0F(c11939i4.A0M(), 1000000L, c11939i4.A0M());
        for (InterfaceC11595C9 interfaceC11595C9 : this.A0I) {
            c11939i4.A0Y(12);
            interfaceC11595C9.AFv(c11939i4, A04);
        }
        if (this.A0B != -9223372036854775807L) {
            long j = this.A0B + A0F;
            if (this.A0S != null) {
                j = this.A0S.A06(j);
            }
            for (InterfaceC11595C9 interfaceC11595C92 : this.A0I) {
                interfaceC11595C92.AFw(j, 1, A04, 0, null);
            }
            return;
        }
        this.A0U.addLast(new C11621CZ(A0F, A04));
        this.A03 += A04;
    }

    public static void A0R(C11939I4 c11939i4, int i, C11633Cl c11633Cl) throws C11464A0 {
        c11939i4.A0Y(i + 8);
        int fullAtom = c11939i4.A08();
        int flags = AbstractC11610CO.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c11939i4.A0H();
            int fullAtom4 = c11633Cl.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c11633Cl.A0H, 0, sampleCount, z);
                int A04 = c11939i4.A04();
                String[] strArr = A0Y;
                String str = strArr[7];
                String str2 = strArr[2];
                int flags2 = str.length();
                int fullAtom5 = str2.length();
                if (flags2 != fullAtom5) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Y;
                strArr2[7] = "AHUK";
                strArr2[2] = "TJdi";
                c11633Cl.A02(A04);
                c11633Cl.A05(c11939i4);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(290, 17, 5)).append(sampleCount).append(A0A(0, 2, 54));
            int fullAtom6 = c11633Cl.A00;
            throw new C11464A0(append.append(fullAtom6).toString());
        }
        throw new C11464A0(A0A(381, 56, 108));
    }

    public static void A0S(C11939I4 c11939i4, C11633Cl c11633Cl) throws C11464A0 {
        c11939i4.A0Y(8);
        int flags = c11939i4.A08();
        int fullAtom = AbstractC11610CO.A00(flags) & 1;
        if (fullAtom == 1) {
            c11939i4.A0Z(8);
        }
        int A0H = c11939i4.A0H();
        if (A0H == 1) {
            int entryCount = AbstractC11610CO.A01(flags);
            c11633Cl.A04 += entryCount == 0 ? c11939i4.A0M() : c11939i4.A0N();
            return;
        }
        throw new C11464A0(A0A(552, 29, 46) + A0H);
    }

    public static void A0T(C11939I4 c11939i4, C11633Cl c11633Cl) throws C11464A0 {
        A0R(c11939i4, 0, c11633Cl);
    }

    public static void A0U(C11939I4 c11939i4, C11633Cl c11633Cl, byte[] bArr) throws C11464A0 {
        c11939i4.A0Y(8);
        c11939i4.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c11939i4, 16, c11633Cl);
    }

    public static boolean A0W(int i) {
        if (i != AbstractC11610CO.A0j) {
            int i2 = AbstractC11610CO.A1L;
            String[] strArr = A0Y;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[4] = "z52WapgDuUmRrJT6dfh";
            strArr2[3] = "pwB1eRxling54jqU6H4";
            if (i != i2 && i != AbstractC11610CO.A0d && i != AbstractC11610CO.A0h && i != AbstractC11610CO.A16 && i != AbstractC11610CO.A0i && i != AbstractC11610CO.A1K && i != AbstractC11610CO.A0m && i != AbstractC11610CO.A0N) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
        if (r4 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
        if (r4 == com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0O) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
        if (r4 == com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0f) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
        if (r4 != com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0P) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
        if (r4 != r3) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0X(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0V
            if (r4 == r0) goto Lae
            int r3 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0c
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12941YS.A0Y
            r0 = 1
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lbb
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12941YS.A0Y
            java.lang.String r1 = "7R4knsjQsoYw3FkbVRD"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "IJ7EeFeEp8TvkaWnmhI"
            r0 = 3
            r2[r0] = r1
            if (r4 == r3) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0n
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A12
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A1A
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A1H
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A1I
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A1J
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A1M
            if (r4 == r0) goto Lae
            int r3 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A1N
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12941YS.A0Y
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb5
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12941YS.A0Y
            java.lang.String r1 = "XNpM"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "Sb63"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0r
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0u
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0t
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A10
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A1Q
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0x
            if (r4 == r0) goto Lae
            int r3 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A11
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12941YS.A0Y
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb2
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12941YS.A0Y
            java.lang.String r1 = "rn1A"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "2A15"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto Lae
        La2:
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0O
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0f
            if (r4 == r0) goto Lae
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11610CO.A0P
            if (r4 != r0) goto Lb0
        Lae:
            r0 = 1
        Laf:
            return r0
        Lb0:
            r0 = 0
            goto Laf
        Lb2:
            if (r4 == r3) goto Lae
            goto La2
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lbb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12941YS.A0X(int):boolean");
    }

    private boolean A0Y(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC11584By.AEp(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0Y(0);
            this.A07 = this.A0O.A0M();
            this.A01 = this.A0O.A08();
        }
        int i = (this.A07 > 1L ? 1 : (this.A07 == 1L ? 0 : -1));
        String[] strArr = A0Y;
        if (strArr[4].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[7] = "deGD";
        strArr2[2] = "uZkj";
        if (i == 0) {
            interfaceC11584By.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0N();
        } else if (this.A07 == 0) {
            long A7g = interfaceC11584By.A7g();
            int trackCount = (A7g > (-1L) ? 1 : (A7g == (-1L) ? 0 : -1));
            if (trackCount == 0 && !this.A0T.isEmpty()) {
                A7g = this.A0T.peek().A00;
            }
            int trackCount2 = (A7g > (-1L) ? 1 : (A7g == (-1L) ? 0 : -1));
            if (trackCount2 != 0) {
                long A86 = A7g - interfaceC11584By.A86();
                int trackCount3 = this.A00;
                this.A07 = A86 + trackCount3;
            }
        }
        if (this.A07 >= this.A00) {
            long A862 = interfaceC11584By.A86() - this.A00;
            if (this.A01 == AbstractC11610CO.A0i) {
                int size = this.A0K.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C11633Cl c11633Cl = this.A0K.valueAt(i2).A07;
                    c11633Cl.A03 = A862;
                    c11633Cl.A04 = A862;
                    c11633Cl.A05 = A862;
                }
            }
            if (this.A01 == AbstractC11610CO.A0b) {
                this.A0D = null;
                this.A09 = this.A07 + A862;
                if (!this.A0F) {
                    this.A0C.AG8(new C12963Yo(this.A08, A862));
                    this.A0F = true;
                }
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long A863 = (interfaceC11584By.A86() + this.A07) - 8;
                this.A0T.push(new C12947YY(this.A01, A863));
                if (this.A07 == this.A00) {
                    A0F(A863);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 == 8) {
                    if (this.A07 <= 2147483647L) {
                        this.A0E = new C11939I4((int) this.A07);
                        System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                        this.A02 = 1;
                    } else {
                        throw new C11464A0(A0A(241, 49, 17));
                    }
                } else {
                    throw new C11464A0(A0A(FacebookRequestErrorClassification.EC_INVALID_TOKEN, 51, 69));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                String[] strArr3 = A0Y;
                if (strArr3[4].length() != strArr3[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0Y;
                strArr4[0] = "CFkyaDHKl829MEsfGeCJV98D86mxwRuG";
                strArr4[6] = "SvrGe4OZrAn9QexWiwFyRQyCjduNZ0ii";
                this.A02 = 1;
            } else {
                throw new C11464A0(A0A(479, 53, 116));
            }
            return true;
        }
        throw new C11464A0(A0A(2, 48, 20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0173, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11935I0.A0C(r14, r13[r12]) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0175, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0196, code lost:
        if (com.facebook.ads.redexgen.p370X.AbstractC11935I0.A0C(r14, r13[r12]) != false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.facebook.ads.redexgen.p370X.InterfaceC11584By r20) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12941YS.A0Z(com.facebook.ads.redexgen.X.By):boolean");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void A9D(InterfaceC11585Bz interfaceC11585Bz) {
        this.A0C = interfaceC11585Bz;
        if (this.A0N != null) {
            C11622Ca c11622Ca = new C11622Ca(interfaceC11585Bz.AHA(0, this.A0N.A03));
            c11622Ca.A07(this.A0N, new C11616CU(0, 0, 0, 0));
            this.A0K.put(0, c11622Ca);
            A0C();
            this.A0C.A5u();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final int AEk(InterfaceC11584By interfaceC11584By, C11590C4 c11590c4) throws IOException, InterruptedException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (A0Y(interfaceC11584By)) {
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                    A0G(interfaceC11584By);
                    break;
                case 2:
                    A0H(interfaceC11584By);
                    break;
                default:
                    if (!A0Z(interfaceC11584By)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final void AG7(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11583Bx
    public final boolean AGs(InterfaceC11584By interfaceC11584By) throws IOException, InterruptedException {
        return AbstractC11629Ch.A03(interfaceC11584By);
    }
}

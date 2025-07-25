package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.CJ */
/* loaded from: assets/audience_network.dex */
public final class C11605CJ {
    public static byte[] A0h;
    public static String[] A0i = {"TtyepP10CNsDag1URICwE6hIE7CqgYU9", "m8ww6qTIx4g60NbQo6OTNqNVzhOAuvGj", "EAp2sEiLSEmEtd7dtkgY6tYTWEtOHuPW", "eOcWKbTzXtUc2KG9ooLNDV4usHn8wMy9", "WdDLwdg0eIZ6Sa8QKK39no5JkIU2PsyL", "kXwzlIVv1vukuk2UNb3hZ115KjTj8NVB", "XVFUuuGJ", "RAwGWRZpRYUoK5XjDkWZ6kKzFPqgeuVP"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public C11594C8 A0V;
    public InterfaceC11595C9 A0W;
    public C11606CK A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<String, List<byte[]>> A00(C11939I4 c11939i4) throws C11464A0 {
        try {
            c11939i4.A0Z(16);
            long A0K = c11939i4.A0K();
            if (A0K == 1482049860) {
                return new Pair<>(A01(881, 10, 61), null);
            }
            if (A0K != 826496599) {
                Log.w(A01(283, 17, 42), A01(419, 51, 51));
                return new Pair<>(A01(944, 15, 65), null);
            }
            byte[] bArr = c11939i4.A00;
            for (int A06 = c11939i4.A06() + 20; A06 < bArr.length - 4; A06++) {
                if (bArr[A06] == 0 && bArr[A06 + 1] == 0 && bArr[A06 + 2] == 1 && bArr[A06 + 3] == 15) {
                    return new Pair<>(A01(934, 10, 121), Collections.singletonList(Arrays.copyOfRange(bArr, A06, bArr.length)));
                }
            }
            throw new C11464A0(A01(238, 45, 71));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C11464A0(A01(137, 33, 16));
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0h = new byte[]{58, 52, 71, 113, 96, 96, 125, 122, 115, 52, 121, 125, 121, 113, SignedBytes.MAX_POWER_OF_TWO, 109, 100, 113, 52, 96, 123, 52, 83, 77, 83, 83, 81, 30, 0, 30, 28, 108, 126, 96, 123, 107, 108, 40, 54, 45, 61, 58, 70, 44, 49, 57, 59, 44, 58, 58, 19, 13, 22, 6, 1, 125, 30, 29, 1, 1, 30, 23, 1, 1, 25, 7, 29, 25, 27, 107, 45, 51, 42, 32, 45, 47, 0, 30, 12, 17, 4, 6, 110, 13, 115, 114, 108, 126, 99, 118, 116, 28, Byte.MAX_VALUE, 0, 45, 51, 33, 63, 67, 45, 47, 33, 54, 40, 56, 39, 34, 36, 25, 7, 8, 27, 21, 119, 17, 22, 12, 119, 20, 17, 12, 75, 85, 94, 88, 95, 79, 66, 78, 116, 106, 99, 122, 103, 119, 124, 102, 74, 125, 125, 96, 125, 47, Byte.MAX_VALUE, 110, 125, 124, 102, 97, 104, 47, 73, 96, 122, 125, 76, 76, 47, Byte.MAX_VALUE, 125, 102, 121, 110, 123, 106, 47, 107, 110, 123, 110, 104, 95, 95, 66, 95, 13, 93, 76, 95, 94, 68, 67, 74, 13, 96, 126, 2, 108, 110, 96, 13, 78, 66, 73, 72, 78, 13, 93, 95, 68, 91, 76, 89, 72, 13, 58, 58, 39, 58, 104, 56, 41, 58, 59, 33, 38, 47, 104, 62, 39, 58, 42, 33, 59, 104, 43, 39, 44, 45, 43, 104, 56, 58, 33, 62, 41, 60, 45, 30, 57, 49, 52, 61, 60, 120, 44, 55, 120, 62, 49, 54, 60, 120, 30, 55, 45, 42, 27, 27, 120, 14, 27, 105, 120, 49, 54, 49, 44, 49, 57, 52, 49, 34, 57, 44, 49, 55, 54, 120, 60, 57, 44, 57, 120, 84, 65, 71, 90, 70, 94, 84, 112, 77, 65, 71, 84, 86, 65, 90, 71, 72, 105, 104, 43, 86, 69, 75, 38, 75, 85, 41, 71, 69, 75, 38, 111, 117, 38, 115, 104, 117, 115, 118, 118, 105, 116, 114, 99, 98, 40, 38, 85, 99, 114, 114, 111, 104, 97, 38, 107, 111, 107, 99, 82, Byte.MAX_VALUE, 118, 99, 38, 114, 105, 38, 102, 106, 113, 99, 119, 102, 96, 119, 90, 86, 65, 77, 68, 95, 38, 89, 78, 90, 17, 29, 22, 7, 26, 22, 109, 3, 17, 17, 123, 119, 124, 109, 112, 124, 7, 125, 124, 110, 16, 48, 60, 53, 44, 33, 48, 54, 33, 98, 89, 82, 79, 71, 82, 84, 67, 82, 83, 23, 122, 126, 122, 114, 23, 67, 78, 71, 82, 25, 121, 66, 71, 66, 67, 91, 66, 12, 106, 67, 89, 94, 111, 111, 2, 12, Byte.MAX_VALUE, 73, 88, 88, 69, 66, 75, 12, 65, 69, 65, 73, 120, 85, 92, 73, 12, 88, 67, 12, 90, 69, 72, 73, 67, 3, 84, 1, 89, 66, 71, 66, 67, 91, 66, 19, 40, 52, 35, 37, 41, 33, 40, 47, 60, 35, 34, 102, 37, 41, 34, 35, 37, 102, 47, 34, 35, 40, 50, 47, 32, 47, 35, 52, 104, 11, 48, 45, 43, 46, 46, 49, 44, 42, 59, 58, 126, 14, 29, 19, 126, 60, 55, 42, 126, 58, 59, 46, 42, 54, 100, 126, 9, 0, 18, 15, 26, 24, 109, 69, 76, 94, 67, 86, 84, 39, 60, 90, SignedBytes.MAX_POWER_OF_TWO, 92, 60, 82, 67, 94, 87, 69, 88, 77, 79, 60, 39, 65, 91, 71, 39, 73, 91, 88, 63, 54, 36, 57, 44, 46, 93, 70, 32, 58, 38, 70, 40, 63, 42, 4, 13, 31, 2, 23, 21, 102, 125, 27, 1, 29, 125, 1, 2, 45, 36, 54, 43, 62, 60, 51, 84, 50, 40, 52, 84, 51, 62, 45, 56, 99, 106, 120, 102, 26, 99, 115, 98, 26, 115, 122, 96, 103, 118, 118, 72, 65, 74, 86, 91, 81, 76, 95, 119, 126, 119, 113, 25, 23, 30, 23, 17, 120, 37, 52, 52, 40, 45, 39, 37, 48, 45, 43, 42, 107, 32, 50, 38, 55, 49, 38, 55, 44, 61, 61, 33, 36, 46, 44, 57, 36, 34, 35, 98, 61, 42, 62, 50, 35, 35, 63, 58, 48, 50, 39, 58, 60, 61, 124, 37, 60, 49, 32, 38, 49, 4, 21, 21, 9, 12, 6, 4, 17, 12, 10, 11, 74, 29, 72, 22, 16, 7, 23, 12, 21, 112, 100, 117, 120, 126, 62, 112, 114, 34, 120, 108, 125, 112, 118, 54, 124, 120, 122, 42, 85, 65, 80, 93, 91, 27, 82, 88, 85, 87, 44, 56, 41, 36, 34, 98, 32, 61, 121, 44, 96, 33, 44, 57, 32, 112, 100, 117, 120, 126, 62, 124, 97, 116, 118, 121, 109, 124, 113, 119, 55, 117, 104, 125, Byte.MAX_VALUE, 53, 84, 42, 114, 102, 119, 122, 124, 60, 124, 99, 102, 96, 10, 30, 15, 2, 4, 68, 25, 10, 28, 20, 0, 17, 28, 26, 90, 1, 7, 0, 16, 88, 29, 17, 92, 72, 89, 84, 82, 18, 75, 83, 89, 19, 89, 73, 78, 100, 112, 97, 108, 106, 42, 115, 107, 97, 43, 97, 113, 118, 43, 109, 97, 55, 35, 50, 63, 57, 121, 32, 57, 36, 52, 63, 37, 80, 68, 85, 88, 94, 30, 73, 28, 68, 95, 90, 95, 94, 70, 95, 91, 80, 89, 81, SignedBytes.MAX_POWER_OF_TWO, 93, 81, 10, 93, 8, 86, 86, 68, 84, 75, 70, 71, 77, 13, 17, 69, 82, 82, 6, 25, 20, 21, 31, 95, 17, 6, 19, 86, 73, 68, 69, 79, 15, 72, 69, 86, 67, 59, 36, 41, 40, 34, 98, 32, 61, 121, 59, 96, 40, 62, 54, 41, 36, 37, 47, 111, 45, 48, 37, 39, 114, 16, 15, 2, 3, 9, 73, 17, 16, 5, 87, 40, 55, 58, 59, 49, 113, 38, 115, 43, 48, 53, 48, 49, 41, 48, 80, 79, 66, 67, 73, 9, 94, 11, 80, 72, 66, 8, 73, 72, 20, 8, 80, 86, 30, 87, 72, 69, 68, 78, 14, 89, 12, 87, 79, 69, 15, 78, 79, 19, 15, 87, 81, 24};
    }

    static {
        A04();
    }

    public C11605CJ() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 33);
    }

    public /* synthetic */ C11605CJ(C12953Ye c12953Ye) {
        this();
    }

    public static List<byte[]> A03(byte[] bArr) throws C11464A0 {
        String A01 = A01(204, 34, 87);
        try {
            if (bArr[0] == 2) {
                int vorbisInfoLength = 1;
                int i = 0;
                while (bArr[vorbisInfoLength] == -1) {
                    i += 255;
                    vorbisInfoLength++;
                }
                int i2 = vorbisInfoLength + 1;
                int i3 = i + bArr[vorbisInfoLength];
                int i4 = 0;
                while (bArr[i2] == -1) {
                    i4 += 255;
                    i2++;
                }
                int vorbisInfoLength2 = i2 + 1;
                int i5 = i4 + bArr[i2];
                if (bArr[vorbisInfoLength2] == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, vorbisInfoLength2, bArr2, 0, i3);
                    int vorbisInfoLength3 = vorbisInfoLength2 + i3;
                    if (bArr[vorbisInfoLength3] == 3) {
                        int vorbisInfoLength4 = vorbisInfoLength3 + i5;
                        if (bArr[vorbisInfoLength4] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength4];
                            System.arraycopy(bArr, vorbisInfoLength4, bArr3, 0, bArr.length - vorbisInfoLength4);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C11464A0(A01);
                    }
                    throw new C11464A0(A01);
                }
                throw new C11464A0(A01);
            }
            throw new C11464A0(A01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C11464A0(A01);
        }
    }

    public static boolean A05(C11939I4 c11939i4) throws C11464A0 {
        UUID uuid;
        UUID uuid2;
        try {
            int A0C = c11939i4.A0C();
            String[] strArr = A0i;
            String str = strArr[0];
            String str2 = strArr[5];
            int charAt = str.charAt(30);
            int formatTag = str2.charAt(30);
            if (charAt != formatTag) {
                String[] strArr2 = A0i;
                strArr2[7] = "btDGG2k1MNOxSWFdYkDb2MrpvBIB67jK";
                strArr2[4] = "0Z9O3kQM2sFmRQtnTHMrsNRouk3kcM83";
                if (A0C == 1) {
                    return true;
                }
                if (A0C != 65534) {
                    return false;
                }
                c11939i4.A0Y(24);
                long A0L = c11939i4.A0L();
                uuid = C12951Yc.A0s;
                int i = (A0L > uuid.getMostSignificantBits() ? 1 : (A0L == uuid.getMostSignificantBits() ? 0 : -1));
                String[] strArr3 = A0i;
                String str3 = strArr3[0];
                String str4 = strArr3[5];
                int charAt2 = str3.charAt(30);
                int formatTag2 = str4.charAt(30);
                if (charAt2 != formatTag2) {
                    String[] strArr4 = A0i;
                    strArr4[1] = "OmasR49I6W1XHsGGoFrlmABzyAa3STQZ";
                    strArr4[3] = "9ywrsCPrxRDqLwPHooYmIZj10ZIoH4sJ";
                    if (i == 0) {
                        long A0L2 = c11939i4.A0L();
                        uuid2 = C12951Yc.A0s;
                        int formatTag3 = (A0L2 > uuid2.getLeastSignificantBits() ? 1 : (A0L2 == uuid2.getLeastSignificantBits() ? 0 : -1));
                        if (formatTag3 == 0) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C11464A0(A01(170, 34, 50));
        }
    }

    private byte[] A06() {
        if (this.A06 == -1.0f || this.A07 == -1.0f || this.A04 == -1.0f || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f) {
            return null;
        }
        float f = this.A01;
        String[] strArr = A0i;
        if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0i;
        strArr2[7] = "6JMDZWqFQp2EIdVNUQF4P86Hd3gy2V52";
        strArr2[4] = "MlPD9OYc6mBKgGsKjEpYXPYDnb0BkbFs";
        if (f == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr);
        hdrStaticInfo.put((byte) 0);
        hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
        hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
        hdrStaticInfo.putShort((short) this.A0K);
        hdrStaticInfo.putShort((short) this.A0L);
        return bArr;
    }

    public final void A07() {
        if (this.A0X != null) {
            this.A0X.A02(this);
        }
    }

    public final void A08() {
        if (this.A0X != null) {
            this.A0X.A00();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0295, code lost:
        if (r7.equals(A01(578, 14, 77)) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0297, code lost:
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x02a6, code lost:
        if (r7.equals(A01(578, 14, 77)) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x038b, code lost:
        if (r19 == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x038d, code lost:
        r19 = -1;
        r13 = A01(853, 15, 46);
        r3 = new java.lang.StringBuilder().append(r8);
        r2 = r27.A0A;
        android.util.Log.w(r7, r3.append(r2).append(r9).append(r13).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x03c5, code lost:
        if (r19 == 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(com.facebook.ads.redexgen.p370X.InterfaceC11585Bz r28, int r29) throws com.facebook.ads.redexgen.p370X.C11464A0 {
        /*
            Method dump skipped, instructions count: 1966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11605CJ.A09(com.facebook.ads.redexgen.X.Bz, int):void");
    }
}

package com.facebook.ads.redexgen.p370X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.AV */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11495AV {
    public static byte[] A00;
    public static String[] A01 = {"feKkTIGaKBzYly9JWp1UGSpJz", "JpaSPsw5bhSGcni6SunY9qE9XqqxOTB4", "FdOEv1spqmDR0S1eel7tXx2JiMt3s7CT", "r67N7OmmUfE7C5kYOwS37DJ2khtydzMF", "kr3JWI8OgoIha1qlRfFHcWBfXWb0v", "RBj3wIWlApOb1m0jvRLNALJUkjzpgsHR", "X8Xzq1UvYCBYzPt3qtZ0CSa2Q2yi8g5o", "c5elHHscTrd0Xh0UaNxMEpwYBzse3bvH"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A07(C11939I4 c11939i4, String str, String str2, DrmInitData drmInitData) {
        int i = A05[(c11939i4.A0E() & 192) >> 6];
        int A0E = c11939i4.A0E();
        int i2 = A04[(A0E & 56) >> 3];
        if ((A0E & 4) != 0) {
            i2++;
        }
        return Format.A07(str, A0A(0, 9, 27), null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A08(C11939I4 c11939i4, String str, String str2, DrmInitData drmInitData) {
        c11939i4.A0Z(2);
        int i = A05[(c11939i4.A0E() & 192) >> 6];
        int A0E = c11939i4.A0E();
        int i2 = A04[(A0E & 14) >> 1];
        if ((A0E & 1) != 0) {
            i2++;
        }
        if (((c11939i4.A0E() & 30) >> 1) > 0 && (c11939i4.A0E() & 2) != 0) {
            i2 += 2;
        }
        String A0A = A0A(9, 10, 9);
        if (c11939i4.A04() > 0 && (c11939i4.A0E() & 1) != 0) {
            A0A = A0A(19, 14, 6);
        }
        if (A01[4].length() != 29) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "hD3DRaYZXSMOR9zyDUbj39jX2JJ2nHPn";
        strArr[1] = "v3z9M6fGZsIfOS8Dc7RRmNft5mWEgAHm";
        return Format.A07(str, A0A, null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-84, -64, -81, -76, -70, 122, -84, -82, 126, -102, -82, -99, -94, -88, 104, -98, -102, -100, 108, -105, -85, -102, -97, -91, 101, -101, -105, -103, 105, 99, -96, -91, -103};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int halfFrmsizecod = A05.length;
            if (i >= halfFrmsizecod || i2 < 0) {
                return -1;
            }
            int halfFrmsizecod2 = A07.length;
            if (i3 >= halfFrmsizecod2) {
                return -1;
            }
            int i4 = A05[i];
            if (i4 == 44100) {
                int halfFrmsizecod3 = i2 % 2;
                return (A07[i3] + halfFrmsizecod3) * 2;
            }
            int[] iArr = A02;
            if (A01[0].length() == 25) {
                String[] strArr = A01;
                strArr[5] = "z2kqD8LOBdJ7Jqq56i3U3gKvsmG5ydnN";
                strArr[1] = "YMMRFpU7Ahc9T1mVgCBm1YbjvN5yyMtc";
                int sampleRate = iArr[i3];
                if (i4 == 32000) {
                    int halfFrmsizecod4 = sampleRate * 6;
                    return halfFrmsizecod4;
                }
                int i5 = sampleRate * 4;
                if (A01[2].charAt(5) != 89) {
                    A01[3] = "t1FH6FzkE8u1jEcLtoSWphmlT7OPpQP7";
                    return i5;
                }
            }
            throw new RuntimeException();
        }
        return -1;
    }

    public static int A02(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i = startIndex - 10;
        for (int i2 = position; i2 <= i; i2++) {
            int startIndex2 = i2 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i2 - position;
            }
        }
        String[] strArr = A01;
        String str = strArr[5];
        String str2 = strArr[1];
        int endIndex2 = str.charAt(24);
        int startIndex3 = str2.charAt(24);
        if (endIndex2 != startIndex3) {
            A01[7] = "r38b7CGA0ZL34koDTyhy3Bv0CTT7Kabk";
            return -1;
        }
        throw new RuntimeException();
    }

    public static int A03(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i * 256;
        return fscod2;
    }

    public static int A04(ByteBuffer byteBuffer, int i) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        int frmsizecod = bArr[4] & 63;
        return A01(fscod, frmsizecod);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x02b5, code lost:
        if (r11 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b7, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02be, code lost:
        if (r19.A0F() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02c0, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02c7, code lost:
        if (r19.A0F() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c9, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02d0, code lost:
        if (r19.A0F() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02d2, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02d9, code lost:
        if (r19.A0F() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02db, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02e2, code lost:
        if (r19.A0F() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02e4, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02eb, code lost:
        if (r19.A0F() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02f1, code lost:
        if (r19.A0F() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02f3, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02f6, code lost:
        r11 = r19.A0F();
        r1 = com.facebook.ads.redexgen.p370X.AbstractC11495AV.A01[0].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0305, code lost:
        if (r1 == 25) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0307, code lost:
        com.facebook.ads.redexgen.p370X.AbstractC11495AV.A01[3] = "qJzivxaQKyIBuYFA9MtvwwNWCqeYoXjr";
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x030e, code lost:
        if (r11 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0310, code lost:
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x033d, code lost:
        com.facebook.ads.redexgen.p370X.AbstractC11495AV.A01[4] = "1LYtBwQIYeIEBcVIN3d1egxpsMHGR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0344, code lost:
        if (r11 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0347, code lost:
        if (r11 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0352, code lost:
        if (r13 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
        if (r13 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
        r19.A08(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p370X.C11494AU A09(com.facebook.ads.redexgen.p370X.C11938I3 r19) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC11495AV.A09(com.facebook.ads.redexgen.X.I3):com.facebook.ads.redexgen.X.AU");
    }
}

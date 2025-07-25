package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.primitives.SignedBytes;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Xi */
/* loaded from: assets/audience_network.dex */
public final class C12896Xi implements InterfaceC11683Db {
    public static byte[] A01;
    public static String[] A02 = {"oDcarx9FEV95l", "ZTtmoYFQI4gqa1qx5G8sf9d7DJClXSOg", "4BWiiQEHzTJJ", "sM9tLFh19BbK8", "f3pvpmQKnWva5xh3Eex5w2xyNPMIbB03", "EKLMFNQM5OgFXY3Ny", "aUxYV7Tn322", "5RuBVxa5hmFU3oUcV3HVFMdvL2Njpkaf"};
    public static final int A03;
    public static final InterfaceC11695Dn A04;
    public final InterfaceC11695Dn A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ChapterFrame A06(C11939I4 c11939i4, int i, int i2, boolean z, int i3, InterfaceC11695Dn interfaceC11695Dn) throws UnsupportedEncodingException {
        int A06 = c11939i4.A06();
        int A022 = A02(c11939i4.A00, A06);
        String str = new String(c11939i4.A00, A06, A022 - A06, A0I(169, 10, 107));
        c11939i4.A0Y(A022 + 1);
        int A08 = c11939i4.A08();
        int A082 = c11939i4.A08();
        long A0M = c11939i4.A0M();
        if (A0M == 4294967295L) {
            A0M = -1;
        }
        long A0M2 = c11939i4.A0M();
        if (A0M2 == 4294967295L) {
            A0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A06 + i;
        while (c11939i4.A06() < i4) {
            Id3Frame A0B = A0B(i2, c11939i4, z, i3, interfaceC11695Dn);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A08, A082, A0M, A0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static GeobFrame A09(C11939I4 c11939i4, int i) throws UnsupportedEncodingException {
        int A0E = c11939i4.A0E();
        String A0H = A0H(A0E);
        byte[] bArr = new byte[i - 1];
        c11939i4.A0c(bArr, 0, i - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(169, 10, 107));
        int i2 = A022 + 1;
        int A032 = A03(bArr, i2, A0E);
        String A0K = A0K(bArr, i2, A032, A0H);
        int A00 = A00(A0E) + A032;
        int A033 = A03(bArr, A00, A0E);
        return new GeobFrame(str, A0K, A0K(bArr, A00, A033, A0H), A0N(bArr, A00(A0E) + A033, bArr.length));
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{28, 90, 28, 90, 28, 90, 66, 4, 66, 4, 66, 4, 66, 4, 70, 74, 12, 24, 11, 7, 15, 57, 3, 16, 15, 87, 4, 33, 52, 33, 96, 52, 47, 47, 96, 51, 40, 47, 50, 52, 96, 52, 47, 96, 34, 37, 96, 33, 46, 96, 9, 4, 115, 96, 52, 33, 39, 37, 2, 10, 15, 6, 7, 67, 23, 12, 67, 7, 6, 0, 12, 7, 6, 67, 5, 17, 2, 14, 6, 89, 67, 10, 7, 94, SignedBytes.MAX_POWER_OF_TWO, 103, 111, 106, 99, 98, 38, 114, 105, 38, 112, 103, 106, 111, 98, 103, 114, 99, 38, 79, 66, 53, 38, 114, 103, 97, 38, 113, 111, 114, 110, 38, 107, 103, 108, 105, 116, 80, 99, 116, 117, 111, 105, 104, 59, 91, 111, 124, 112, 120, 61, 110, 116, 103, 120, 61, 120, 101, 126, 120, 120, 121, 110, 61, 111, 120, 112, 124, 116, 115, 116, 115, 122, 61, 105, 124, 122, 61, 121, 124, 105, 124, 25, 20, 99, 63, 37, 57, 91, 78, 78, 67, 79, 91, 71, 19, 62, 105, 30, 63, 57, 53, 62, 63, 40, 106, 82, 80, 73, 73, 92, 93, 25, 112, 125, 10, 25, 77, 88, 94, 25, 78, 80, 77, 81, 25, 84, 88, 83, 86, 75, 111, 92, 75, 74, 80, 86, 87, 4, 11, 25, 88, 87, 93, 25, 76, 87, 93, 92, 95, 80, 87, 92, 93, 25, 90, 86, 84, 73, 75, 92, 74, 74, 80, 86, 87, 25, 74, 90, 81, 92, 84, 92, 105, 81, 83, 74, 74, 95, 94, 26, 115, 126, 9, 26, 78, 91, 93, 26, 77, 83, 78, 82, 26, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 26, 87, 91, 80, 85, 72, 108, 95, 72, 73, 83, 85, 84, 7, 75, 115, 113, 104, 104, 113, 118, Byte.MAX_VALUE, 56, 109, 118, 107, 109, 104, 104, 119, 106, 108, 125, 124, 56, 123, 119, 117, 104, 106, 125, 107, 107, 125, 124, 56, 119, 106, 56, 125, 118, 123, 106, 97, 104, 108, 125, 124, 56, 126, 106, 121, 117, 125, 24, 20, 20, 20, 67, 66, 80, 59, 39, 32, 2, 3, 17, 122, 102, 97, 21, 18, 72, 73, 91, 48, 37, 4, 63, 52, 41, 33, 52, 50, 37, 52, 53, 113, 55, 56, 35, 34, 37, 113, 37, 57, 35, 52, 52, 113, 51, 40, 37, 52, 34, 113, 62, 55, 113, 24, 21, 98, 113, 37, 48, 54, 113, 57, 52, 48, 53, 52, 35, 107, 113, 31, 36, 57, 63, 58, 58, 37, 56, 62, 47, 46, 106, 41, 34, 43, 56, 43, 41, 62, 47, 56, 106, 47, 36, 41, 37, 46, 35, 36, 45, 117, 122, 122, 122, 41, 45, 33, 39, 37, 111, 70, 66, 78, 72, 74, 0, 69, 95, 74, 72, 121, 125, 113, 119, 117, 63, 122, 96, 119};
    }

    static {
        A0L();
        A04 = new C12897Xj();
        A03 = AbstractC11953IK.A08(A0I(166, 3, 77));
    }

    public C12896Xi() {
        this(null);
    }

    public C12896Xi(InterfaceC11695Dn interfaceC11695Dn) {
        this.A00 = interfaceC11695Dn;
    }

    public static int A00(int i) {
        if (i == 0 || i == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C11939I4 c11939i4, int i) {
        byte[] bArr = c11939i4.A00;
        for (int A06 = c11939i4.A06(); A06 + 1 < i; A06++) {
            int i2 = bArr[A06];
            if ((i2 & 255) == 255) {
                int i3 = A06 + 1;
                int i4 = A02[2].length();
                if (i4 != 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[5] = "fMvheGAz69fX12AY3";
                strArr[6] = "xzSVXT6CIC9";
                if (bArr[i3] == 0) {
                    int i5 = A06 + 1;
                    System.arraycopy(bArr, A06 + 2, bArr, i5, (i - A06) - 2);
                    i--;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12896Xi.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:32:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(byte[] r4, int r5, int r6) {
        /*
            int r1 = A02(r4, r5)
            if (r6 == 0) goto L9
            r0 = 3
            if (r6 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r4.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L45
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r4[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r3 = r1 + 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12896Xi.A02
            r0 = 0
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L34
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12896Xi.A02
            java.lang.String r1 = "c1mKOA0yx6PM3ayoz9Rx2ZFyjjZjHwoF"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "pETkHlW31R8gYQsHDxP1siPj2h04g4up"
            r0 = 7
            r2[r0] = r1
            int r1 = A02(r4, r3)
            goto La
        L45:
            int r0 = r4.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12896Xi.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(C11939I4 c11939i4, int i, int i2) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int descriptionStartIndex = c11939i4.A0E();
        String A0H = A0H(descriptionStartIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c11939i4.A0c(bArr, 0, encoding2);
        String A0I = A0I(FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 6, 93);
        String A0I2 = A0I(169, 10, 107);
        if (i2 == 2) {
            A022 = 2;
            A0M = A0I + AbstractC11953IK.A0M(new String(bArr, 0, 3, A0I2));
            if (A0I(474, 9, 13).equals(A0M)) {
                A0M = A0I(464, 10, 50);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = AbstractC11953IK.A0M(new String(bArr, 0, A022, A0I2));
            if (A0M.indexOf(47) == -1) {
                A0M = A0I + A0M;
            }
        }
        int encoding3 = A022 + 1;
        int i3 = bArr[encoding3] & 255;
        int i4 = A022 + 2;
        int mimeTypeEndIndex = A03(bArr, i4, descriptionStartIndex);
        int encoding4 = mimeTypeEndIndex - i4;
        String str = new String(bArr, i4, encoding4, A0H);
        int encoding5 = bArr.length;
        return new ApicFrame(A0M, str, i3, A0N(bArr, A00(descriptionStartIndex) + mimeTypeEndIndex, encoding5));
    }

    public static BinaryFrame A05(C11939I4 c11939i4, int i, String str) {
        byte[] bArr = new byte[i];
        c11939i4.A0c(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C11939I4 c11939i4, int i, int i2, boolean z, int elementIdEndIndex, InterfaceC11695Dn interfaceC11695Dn) throws UnsupportedEncodingException {
        int A06 = c11939i4.A06();
        int A022 = A02(c11939i4.A00, A06);
        String A0I = A0I(169, 10, 107);
        String str = new String(c11939i4.A00, A06, A022 - A06, A0I);
        c11939i4.A0Y(A022 + 1);
        int framePosition = c11939i4.A0E();
        boolean z2 = (framePosition & 2) != 0;
        boolean z3 = (framePosition & 1) != 0;
        int A0E = c11939i4.A0E();
        String[] strArr = new String[A0E];
        for (int i3 = 0; i3 < A0E; i3++) {
            int startIndex = c11939i4.A06();
            int i4 = A02(c11939i4.A00, startIndex);
            strArr[i3] = new String(c11939i4.A00, startIndex, i4 - startIndex, A0I);
            c11939i4.A0Y(i4 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = A06 + i;
        while (c11939i4.A06() < i5) {
            Id3Frame A0B = A0B(i2, c11939i4, z, elementIdEndIndex, interfaceC11695Dn);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C11939I4 c11939i4, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int textStartIndex = c11939i4.A0E();
        String A0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        c11939i4.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i - 4;
        c11939i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, A0H);
        int A00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, A00, textStartIndex);
        String charset = A0K(data, A00, encoding4, A0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00e7, code lost:
        if (r6 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00fb, code lost:
        if (r6 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x010c, code lost:
        if (r8 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x010f, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0140, code lost:
        if (r8 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0142, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0148, code lost:
        if (r8 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x014b, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00bb, code lost:
        if (r8 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00bd, code lost:
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p370X.C11696Do A0A(com.facebook.ads.redexgen.p370X.C11939I4 r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12896Xi.A0A(com.facebook.ads.redexgen.X.I4):com.facebook.ads.redexgen.X.Do");
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0176, code lost:
        if (r11 == 87) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0178, code lost:
        if (r10 != 88) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x017a, code lost:
        if (r9 != 88) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x017c, code lost:
        if (r22 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x017e, code lost:
        if (r8 != 88) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0181, code lost:
        if (r11 == 87) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0184, code lost:
        r4 = A0F(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x018a, code lost:
        if (r11 != 87) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x018c, code lost:
        r0 = A0J(r22, r11, r10, r9, r8);
        r4 = A0G(r23, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x019a, code lost:
        if (r11 != 80) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x019e, code lost:
        if (r10 != 82) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x01a0, code lost:
        if (r9 != 73) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01a4, code lost:
        if (r8 != 86) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x01a6, code lost:
        r4 = A0C(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x01af, code lost:
        if (r11 != 71) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01b3, code lost:
        if (r10 != 69) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x01b5, code lost:
        if (r9 != 79) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01b9, code lost:
        if (r8 == 66) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x01bb, code lost:
        if (r22 != 2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01bd, code lost:
        r4 = A09(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01c6, code lost:
        if (r22 != 2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01c8, code lost:
        if (r11 != 80) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x01ca, code lost:
        if (r10 != 73) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01cc, code lost:
        if (r9 != 67) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x01cf, code lost:
        if (r11 != 65) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x01d1, code lost:
        if (r10 != 80) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x01d3, code lost:
        if (r9 != 73) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x01d5, code lost:
        if (r8 != 67) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01d7, code lost:
        r4 = A04(r23, r7, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x01dc, code lost:
        if (r11 != 67) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x01de, code lost:
        if (r10 != 79) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x01e2, code lost:
        if (r9 != 77) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x01e4, code lost:
        if (r8 == 77) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x01e6, code lost:
        if (r22 != 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x01e8, code lost:
        r4 = A08(r23, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x01ef, code lost:
        if (r11 != 67) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x01f3, code lost:
        if (r10 != 72) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x01f5, code lost:
        if (r9 != 65) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x01f7, code lost:
        if (r8 != 80) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x01f9, code lost:
        r4 = A06(r23, r7, r22, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0206, code lost:
        if (r11 != 67) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0208, code lost:
        if (r10 != 84) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x020a, code lost:
        if (r9 != 79) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x020c, code lost:
        if (r8 != 67) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x020e, code lost:
        r4 = A07(r23, r7, r22, r24, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x021b, code lost:
        r0 = A0J(r22, r11, r10, r9, r8);
        r4 = A05(r23, r7, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame A0B(int r22, com.facebook.ads.redexgen.p370X.C11939I4 r23, boolean r24, int r25, com.facebook.ads.redexgen.p370X.InterfaceC11695Dn r26) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12896Xi.A0B(int, com.facebook.ads.redexgen.X.I4, boolean, int, com.facebook.ads.redexgen.X.Dn):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(C11939I4 c11939i4, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c11939i4.A0c(bArr, 0, i);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(169, 10, 107)), A0N(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C11939I4 c11939i4, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int valueStartIndex = c11939i4.A0E();
        String A0H = A0H(valueStartIndex);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        c11939i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, A0H);
        int A00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, A00, valueStartIndex);
        String A0K = A0K(data, A00, encoding4, A0H);
        String charset = A0I(353, 4, 81);
        return new TextInformationFrame(charset, description, A0K);
    }

    public static TextInformationFrame A0E(C11939I4 c11939i4, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int A0E = c11939i4.A0E();
        String A0H = A0H(A0E);
        int encoding = i - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i - 1;
        c11939i4.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, A0E);
        return new TextInformationFrame(str, null, new String(data, 0, encoding3, A0H));
    }

    public static UrlLinkFrame A0F(C11939I4 c11939i4, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int descriptionEndIndex = c11939i4.A0E();
        String A0H = A0H(descriptionEndIndex);
        int encoding = i - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i - 1;
        c11939i4.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, A0H);
        int A00 = A00(descriptionEndIndex) + encoding3;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(169, 10, 107));
        String charset = A0I(454, 4, 63);
        return new UrlLinkFrame(charset, str, A0K);
    }

    public static UrlLinkFrame A0G(C11939I4 c11939i4, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c11939i4.A0c(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 107)));
    }

    public static String A0H(int i) {
        String A0I = A0I(169, 10, 107);
        switch (i) {
            case 0:
                return A0I;
            case 1:
                return A0I(357, 6, 11);
            case 2:
                return A0I(363, 8, 74);
            case 3:
                return A0I(371, 5, 0);
            default:
                return A0I;
        }
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, 36), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 122), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 > i) {
            int length = bArr.length;
            String[] strArr = A02;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "2w8qNsEXNbi1RtaKY";
            strArr2[6] = "xIsAvF4aqsL";
            if (i2 <= length) {
                return new String(bArr, i, i2 - i, str);
            }
        }
        return A0I(0, 0, 89);
    }

    public static boolean A0M(C11939I4 c11939i4, int i, int i2, boolean z) {
        int A08;
        long A0M;
        int A0I;
        int A06 = c11939i4.A06();
        while (true) {
            try {
                if (c11939i4.A04() < i2) {
                    c11939i4.A0Y(A06);
                    return true;
                }
                if (i >= 3) {
                    try {
                        A08 = c11939i4.A08();
                        A0M = c11939i4.A0M();
                        A0I = c11939i4.A0I();
                    } catch (Throwable th) {
                        th = th;
                        c11939i4.A0Y(A06);
                        throw th;
                    }
                } else {
                    A08 = c11939i4.A0G();
                    A0M = c11939i4.A0G();
                    A0I = 0;
                }
                if (A08 == 0 && A0M == 0 && A0I == 0) {
                    c11939i4.A0Y(A06);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & A0M) != 0) {
                        c11939i4.A0Y(A06);
                        return false;
                    }
                    A0M = (((A0M >> 24) & 255) << 21) | (A0M & 255) | (((A0M >> 8) & 255) << 7) | (((A0M >> 16) & 255) << 14);
                }
                boolean z2 = false;
                boolean z3 = false;
                if (i == 4) {
                    z2 = (A0I & 64) != 0;
                    z3 = (A0I & 1) != 0;
                } else if (i == 3) {
                    int minimumFrameSize = A0I & 32;
                    z2 = minimumFrameSize != 0;
                    int minimumFrameSize2 = A0I & 128;
                    z3 = minimumFrameSize2 != 0;
                }
                int minimumFrameSize3 = 0;
                if (z2) {
                    minimumFrameSize3 = 0 + 1;
                }
                if (z3) {
                    minimumFrameSize3 += 4;
                }
                if (A0M < minimumFrameSize3) {
                    c11939i4.A0Y(A06);
                    return false;
                }
                int minimumFrameSize4 = c11939i4.A04();
                if (minimumFrameSize4 >= A0M) {
                    int minimumFrameSize5 = (int) A0M;
                    c11939i4.A0Z(minimumFrameSize5);
                } else {
                    c11939i4.A0Y(A06);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0N(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public final Metadata A0O(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        C11939I4 c11939i4 = new C11939I4(bArr, i);
        C11696Do A0A = A0A(c11939i4);
        if (A0A == null) {
            return null;
        }
        int A06 = c11939i4.A06();
        i2 = A0A.A01;
        int frameHeaderSize = i2 == 2 ? 6 : 10;
        i3 = A0A.A00;
        z = A0A.A02;
        if (z) {
            i8 = A0A.A00;
            i3 = A01(c11939i4, i8);
        }
        c11939i4.A0X(A06 + i3);
        boolean z2 = false;
        i4 = A0A.A01;
        if (!A0M(c11939i4, i4, frameHeaderSize, false)) {
            i6 = A0A.A01;
            String[] strArr = A02;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "2HRW23rQNZUN4UoGi";
            strArr2[6] = "wx9wVCYymkj";
            if (i6 == 4 && A0M(c11939i4, 4, frameHeaderSize, true)) {
                z2 = true;
            } else {
                StringBuilder append = new StringBuilder().append(A0I(84, 45, 27));
                i7 = A0A.A01;
                Log.w(A0I(179, 10, 71), append.append(i7).toString());
                return null;
            }
        }
        while (c11939i4.A04() >= frameHeaderSize) {
            i5 = A0A.A01;
            Id3Frame A0B = A0B(i5, c11939i4, z2, frameHeaderSize, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11683Db
    public final Metadata A5N(C11724EX c11724ex) {
        ByteBuffer buffer = c11724ex.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}

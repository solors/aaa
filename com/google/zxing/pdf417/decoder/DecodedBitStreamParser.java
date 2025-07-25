package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class DecodedBitStreamParser {

    /* renamed from: a */
    private static final char[] f44624a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f44625b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f44626c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C177161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f44627a;

        static {
            int[] iArr = new int[Mode.values().length];
            f44627a = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44627a[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44627a[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44627a[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44627a[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44627a[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f44626c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f44626c;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m65695a(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.m65695a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.zxing.common.DecoderResult m65694b(int[] r6, java.lang.String r7) throws com.google.zxing.FormatException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r2 = 1
            int r1 = r1 << r2
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = r6[r2]
            com.google.zxing.pdf417.PDF417ResultMetadata r3 = new com.google.zxing.pdf417.PDF417ResultMetadata
            r3.<init>()
            r4 = 2
        L12:
            r5 = 0
            r5 = r6[r5]
            if (r4 >= r5) goto L6d
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L58
            switch(r2) {
                case 900: goto L53;
                case 901: goto L4e;
                case 902: goto L49;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 922: goto L44;
                case 923: goto L44;
                case 924: goto L4e;
                case 925: goto L41;
                case 926: goto L3e;
                case 927: goto L2d;
                case 928: goto L28;
                default: goto L21;
            }
        L21:
            int r4 = r4 + (-1)
            int r2 = m65689g(r6, r4, r0)
            goto L60
        L28:
            int r2 = m65692d(r6, r4, r3)
            goto L60
        L2d:
            int r2 = r4 + 1
            r1 = r6[r4]
            com.google.zxing.common.CharacterSetECI r1 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L60
        L3e:
            int r2 = r4 + 2
            goto L60
        L41:
            int r2 = r4 + 1
            goto L60
        L44:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        L49:
            int r2 = m65690f(r6, r4, r0)
            goto L60
        L4e:
            int r2 = m65695a(r2, r6, r1, r4, r0)
            goto L60
        L53:
            int r2 = m65689g(r6, r4, r0)
            goto L60
        L58:
            int r2 = r4 + 1
            r4 = r6[r4]
            char r4 = (char) r4
            r0.append(r4)
        L60:
            int r4 = r6.length
            if (r2 >= r4) goto L68
            int r4 = r2 + 1
            r2 = r6[r2]
            goto L12
        L68:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        L6d:
            int r6 = r0.length()
            if (r6 == 0) goto L81
            com.google.zxing.common.DecoderResult r6 = new com.google.zxing.common.DecoderResult
            java.lang.String r0 = r0.toString()
            r1 = 0
            r6.<init>(r1, r0, r1, r7)
            r6.setOther(r3)
            return r6
        L81:
            com.google.zxing.FormatException r6 = com.google.zxing.FormatException.getFormatInstance()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.m65694b(int[], java.lang.String):com.google.zxing.common.DecoderResult");
    }

    /* renamed from: c */
    private static String m65693c(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f44626c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: d */
    static int m65692d(int[] iArr, int i, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        int i2;
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i3 = 0;
            while (i3 < 2) {
                iArr2[i3] = iArr[i];
                i3++;
                i++;
            }
            pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(m65693c(iArr2, 2)));
            StringBuilder sb2 = new StringBuilder();
            int m65689g = m65689g(iArr, i, sb2);
            pDF417ResultMetadata.setFileId(sb2.toString());
            if (iArr[m65689g] == 923) {
                i2 = m65689g + 1;
            } else {
                i2 = -1;
            }
            while (m65689g < iArr[0]) {
                int i4 = iArr[m65689g];
                if (i4 != 922) {
                    if (i4 == 923) {
                        int i5 = m65689g + 1;
                        switch (iArr[i5]) {
                            case 0:
                                StringBuilder sb3 = new StringBuilder();
                                m65689g = m65689g(iArr, i5 + 1, sb3);
                                pDF417ResultMetadata.setFileName(sb3.toString());
                                continue;
                            case 1:
                                StringBuilder sb4 = new StringBuilder();
                                m65689g = m65690f(iArr, i5 + 1, sb4);
                                pDF417ResultMetadata.setSegmentCount(Integer.parseInt(sb4.toString()));
                                continue;
                            case 2:
                                StringBuilder sb5 = new StringBuilder();
                                m65689g = m65690f(iArr, i5 + 1, sb5);
                                pDF417ResultMetadata.setTimestamp(Long.parseLong(sb5.toString()));
                                continue;
                            case 3:
                                StringBuilder sb6 = new StringBuilder();
                                m65689g = m65689g(iArr, i5 + 1, sb6);
                                pDF417ResultMetadata.setSender(sb6.toString());
                                continue;
                            case 4:
                                StringBuilder sb7 = new StringBuilder();
                                m65689g = m65689g(iArr, i5 + 1, sb7);
                                pDF417ResultMetadata.setAddressee(sb7.toString());
                                continue;
                            case 5:
                                StringBuilder sb8 = new StringBuilder();
                                m65689g = m65690f(iArr, i5 + 1, sb8);
                                pDF417ResultMetadata.setFileSize(Long.parseLong(sb8.toString()));
                                continue;
                            case 6:
                                StringBuilder sb9 = new StringBuilder();
                                m65689g = m65690f(iArr, i5 + 1, sb9);
                                pDF417ResultMetadata.setChecksum(Integer.parseInt(sb9.toString()));
                                continue;
                            default:
                                throw FormatException.getFormatInstance();
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                } else {
                    m65689g++;
                    pDF417ResultMetadata.setLastSegment(true);
                }
            }
            if (i2 != -1) {
                int i6 = m65689g - i2;
                if (pDF417ResultMetadata.isLastSegment()) {
                    i6--;
                }
                pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i2, i6 + i2));
            }
            return m65689g;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static void m65691e(int[] iArr, int[] iArr2, int i, StringBuilder sb2) {
        Mode mode;
        int i2;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (C177161.f44627a[mode2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 27:
                                        mode2 = Mode.LOWER;
                                        break;
                                    case 28:
                                        mode2 = Mode.MIXED;
                                        break;
                                    case 29:
                                        mode = Mode.PUNCT_SHIFT;
                                        c = 0;
                                        Mode mode4 = mode;
                                        mode3 = mode2;
                                        mode2 = mode4;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr2[i3]);
                            }
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 27:
                                        mode = Mode.ALPHA_SHIFT;
                                        c = 0;
                                        Mode mode42 = mode;
                                        mode3 = mode2;
                                        mode2 = mode42;
                                        break;
                                    case 28:
                                        mode2 = Mode.MIXED;
                                        break;
                                    case 29:
                                        mode = Mode.PUNCT_SHIFT;
                                        c = 0;
                                        Mode mode422 = mode;
                                        mode3 = mode2;
                                        mode2 = mode422;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr2[i3]);
                            }
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 3:
                    if (i4 < 25) {
                        c = f44625b[i4];
                        break;
                    } else {
                        if (i4 != 900) {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 25:
                                        mode2 = Mode.PUNCT;
                                        break;
                                    case 27:
                                        mode2 = Mode.LOWER;
                                        break;
                                    case 28:
                                        mode2 = Mode.ALPHA;
                                        break;
                                    case 29:
                                        mode = Mode.PUNCT_SHIFT;
                                        c = 0;
                                        Mode mode4222 = mode;
                                        mode3 = mode2;
                                        mode2 = mode4222;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr2[i3]);
                            }
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 4:
                    if (i4 < 29) {
                        c = f44624a[i4];
                        break;
                    } else {
                        if (i4 != 29) {
                            if (i4 != 900) {
                                if (i4 == 913) {
                                    sb2.append((char) iArr2[i3]);
                                }
                            } else {
                                mode2 = Mode.ALPHA;
                            }
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                case 5:
                    if (i4 < 26) {
                        c = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        if (i4 != 900) {
                            mode2 = mode3;
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c = f44624a[i4];
                    } else {
                        if (i4 != 29) {
                            if (i4 != 900) {
                                if (i4 == 913) {
                                    sb2.append((char) iArr2[i3]);
                                }
                                c = 0;
                            } else {
                                mode2 = Mode.ALPHA;
                            }
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                    mode2 = mode3;
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb2.append(c);
            }
        }
    }

    /* renamed from: f */
    private static int m65690f(int[] iArr, int i, StringBuilder sb2) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != 928) {
                        switch (i5) {
                        }
                    }
                    i4--;
                    z = true;
                }
                if ((i2 % 15 == 0 || i5 == 902 || z) && i2 > 0) {
                    sb2.append(m65693c(iArr2, i2));
                    i2 = 0;
                }
                i = i4;
            }
        }
        return i;
    }

    /* renamed from: g */
    private static int m65689g(int[] iArr, int i, StringBuilder sb2) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != 913) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE:
                            break;
                        default:
                            switch (i5) {
                            }
                    }
                }
                i = i4 - 1;
                z = true;
            } else {
                iArr2[i3] = 913;
                i = i4 + 1;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        m65691e(iArr2, iArr3, i3, sb2);
        return i;
    }
}

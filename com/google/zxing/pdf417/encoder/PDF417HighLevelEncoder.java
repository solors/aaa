package com.google.zxing.pdf417.encoder;

import com.google.common.primitives.SignedBytes;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class PDF417HighLevelEncoder {

    /* renamed from: c */
    private static final byte[] f44675c;

    /* renamed from: a */
    private static final byte[] f44673a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f44674b = {59, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    private static final byte[] f44676d = new byte[128];

    /* renamed from: e */
    private static final Charset f44677e = StandardCharsets.ISO_8859_1;

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1 */
    /* loaded from: classes5.dex */
    static /* synthetic */ class C177171 {

        /* renamed from: a */
        static final /* synthetic */ int[] f44678a;

        static {
            int[] iArr = new int[Compaction.values().length];
            f44678a = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44678a[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44678a[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f44675c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f44673a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            if (b > 0) {
                f44675c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f44676d, (byte) -1);
        while (true) {
            byte[] bArr3 = f44674b;
            if (i < bArr3.length) {
                byte b2 = bArr3[i];
                if (b2 > 0) {
                    f44676d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private PDF417HighLevelEncoder() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r1 - r6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m65590a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L57
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = m65580k(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L57:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.m65590a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    /* renamed from: b */
    private static int m65589b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m65580k(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m65588c(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = m65580k(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = m65577n(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.m65588c(java.lang.CharSequence, int):int");
    }

    /* renamed from: d */
    private static void m65587d(byte[] bArr, int i, int i2, int i3, StringBuilder sb2) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb2.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb2.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb2.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m65586e(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f44677e;
        } else if (!f44677e.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            m65583h(characterSetECIByName.getValue(), sb2);
        }
        int length = str.length();
        int i = C177171.f44678a[compaction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < length) {
                        int m65589b = m65589b(str, i2);
                        if (m65589b >= 13) {
                            sb2.append((char) 902);
                            m65585f(str, i2, m65589b, sb2);
                            i2 += m65589b;
                            i3 = 0;
                            i4 = 2;
                        } else {
                            int m65588c = m65588c(str, i2);
                            if (m65588c < 5 && m65589b != length) {
                                int m65590a = m65590a(str, i2, charset);
                                if (m65590a == 0) {
                                    m65590a = 1;
                                }
                                int i5 = m65590a + i2;
                                byte[] bytes = str.substring(i2, i5).getBytes(charset);
                                if (bytes.length == 1 && i4 == 0) {
                                    m65587d(bytes, 0, 1, 0, sb2);
                                } else {
                                    m65587d(bytes, 0, bytes.length, i4, sb2);
                                    i4 = 1;
                                    i3 = 0;
                                }
                                i2 = i5;
                            } else {
                                if (i4 != 0) {
                                    sb2.append((char) 900);
                                    i3 = 0;
                                    i4 = 0;
                                }
                                i3 = m65584g(str, i2, m65588c, sb2, i3);
                                i2 += m65588c;
                            }
                        }
                    }
                } else {
                    sb2.append((char) 902);
                    m65585f(str, 0, length, sb2);
                }
            } else {
                byte[] bytes2 = str.getBytes(charset);
                m65587d(bytes2, 0, bytes2.length, 1, sb2);
            }
        } else {
            m65584g(str, 0, length, sb2, 0);
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static void m65585f(String str, int i, int i2, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2) {
            sb3.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb4 = new StringBuilder("1");
            int i4 = i + i3;
            sb4.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6 A[EDGE_INSN: B:76:0x00f6->B:55:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x000f A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m65584g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.m65584g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: h */
    private static void m65583h(int i, StringBuilder sb2) throws WriterException {
        if (i >= 0 && i < 900) {
            sb2.append((char) 927);
            sb2.append((char) i);
        } else if (i < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i / 900) - 1));
            sb2.append((char) (i % 900));
        } else if (i < 811800) {
            sb2.append((char) 925);
            sb2.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: i */
    private static boolean m65582i(char c) {
        if (c != ' ') {
            if (c < 'a' || c > 'z') {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m65581j(char c) {
        if (c != ' ') {
            if (c < 'A' || c > 'Z') {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m65580k(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private static boolean m65579l(char c) {
        if (f44675c[c] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static boolean m65578m(char c) {
        if (f44676d[c] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static boolean m65577n(char c) {
        if (c != '\t' && c != '\n' && c != '\r') {
            if (c < ' ' || c > '~') {
                return false;
            }
            return true;
        }
        return true;
    }
}

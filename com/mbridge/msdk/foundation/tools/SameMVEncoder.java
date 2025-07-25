package com.mbridge.msdk.foundation.tools;

import com.ironsource.C20517nb;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.tools.ag */
/* loaded from: classes6.dex */
public final class SameMVEncoder {

    /* renamed from: a */
    private static final char[] f56898a;

    /* renamed from: b */
    private static final byte[] f56899b = new byte[128];

    /* renamed from: c */
    private static Map<Character, Character> f56900c;

    /* renamed from: d */
    private static char[] f56901d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f56898a = cArr;
        HashMap hashMap = new HashMap();
        f56900c = hashMap;
        hashMap.put('A', 'v');
        f56900c.put('B', 'S');
        f56900c.put('C', 'o');
        f56900c.put('D', 'a');
        f56900c.put('E', 'j');
        f56900c.put('F', 'c');
        f56900c.put('G', '7');
        f56900c.put('H', 'd');
        f56900c.put('I', 'R');
        f56900c.put('J', 'z');
        f56900c.put('K', 'p');
        f56900c.put('L', 'W');
        f56900c.put('M', 'i');
        f56900c.put('N', 'f');
        f56900c.put('O', 'G');
        f56900c.put('P', 'y');
        f56900c.put('Q', 'N');
        f56900c.put('R', 'x');
        f56900c.put('S', 'Z');
        f56900c.put('T', 'n');
        f56900c.put('U', 'V');
        f56900c.put('V', '5');
        f56900c.put('W', 'k');
        f56900c.put('X', '+');
        f56900c.put('Y', 'D');
        f56900c.put('Z', 'H');
        f56900c.put('a', 'L');
        f56900c.put('b', 'Y');
        f56900c.put('c', 'h');
        f56900c.put('d', 'J');
        f56900c.put('e', '4');
        f56900c.put('f', '6');
        f56900c.put('g', 'l');
        f56900c.put('h', 't');
        f56900c.put('i', '0');
        f56900c.put('j', 'U');
        f56900c.put('k', '3');
        f56900c.put('l', 'Q');
        f56900c.put('m', 'r');
        f56900c.put('n', 'g');
        f56900c.put('o', 'E');
        f56900c.put('p', 'u');
        f56900c.put('q', 'q');
        f56900c.put('r', '8');
        f56900c.put('s', 's');
        f56900c.put('t', 'w');
        f56900c.put('u', '/');
        f56900c.put('v', 'X');
        f56900c.put('w', 'M');
        f56900c.put('x', 'e');
        f56900c.put('y', 'B');
        f56900c.put('z', 'A');
        f56900c.put('0', 'T');
        f56900c.put('1', '2');
        f56900c.put('2', 'F');
        f56900c.put('3', 'b');
        f56900c.put('4', '9');
        f56900c.put('5', 'P');
        f56900c.put('6', '1');
        f56900c.put('7', 'O');
        f56900c.put('8', 'I');
        f56900c.put('9', 'K');
        f56900c.put('+', 'm');
        f56900c.put('/', 'C');
        f56901d = new char[cArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            char[] cArr2 = f56898a;
            if (i2 >= cArr2.length) {
                break;
            }
            f56901d[i2] = f56900c.get(Character.valueOf(cArr2[i2])).charValue();
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = f56899b;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = Byte.MAX_VALUE;
            i3++;
        }
        while (true) {
            char[] cArr3 = f56901d;
            if (i >= cArr3.length) {
                return;
            }
            f56899b[cArr3[i]] = (byte) i;
            i++;
        }
    }

    /* renamed from: a */
    private static int m51817a(char[] cArr, byte[] bArr, int i) {
        try {
            char c = cArr[3];
            boolean z = c == '=' ? true : true;
            char c2 = cArr[2];
            if (c2 == '=') {
                z = true;
            }
            byte[] bArr2 = f56899b;
            byte b = bArr2[cArr[0]];
            byte b2 = bArr2[cArr[1]];
            byte b3 = bArr2[c2];
            byte b4 = bArr2[c];
            if (z) {
                bArr[i] = (byte) (((b2 >> 4) & 3) | ((b << 2) & 252));
                return 1;
            } else if (z) {
                bArr[i] = (byte) ((3 & (b2 >> 4)) | ((b << 2) & 252));
                bArr[i + 1] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                return 2;
            } else if (z) {
                int i2 = i + 1;
                bArr[i] = (byte) (((b << 2) & 252) | ((b2 >> 4) & 3));
                bArr[i2] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                bArr[i2 + 1] = (byte) (((b3 << 6) & 192) | (b4 & 63));
                return 3;
            } else {
                throw new RuntimeException("Internal Error");
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static String m51816b(String str) {
        byte[] bytes = str.getBytes();
        return m51818a(bytes, 0, bytes.length);
    }

    /* renamed from: c */
    private static byte[] m51815c(String str) {
        int i;
        try {
            int length = str.length();
            int i2 = 259;
            if (length < 259) {
                i2 = length;
            }
            char[] cArr = new char[i2];
            int i3 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < length) {
                int i7 = i4 + 256;
                if (i7 <= length) {
                    str.getChars(i4, i7, cArr, i6);
                    i = i6 + 256;
                } else {
                    str.getChars(i4, length, cArr, i6);
                    i = (length - i4) + i6;
                }
                int i8 = i6;
                while (i6 < i) {
                    char c = cArr[i6];
                    if (c != '=') {
                        byte[] bArr2 = f56899b;
                        if (c < bArr2.length) {
                            if (bArr2[c] == Byte.MAX_VALUE) {
                            }
                        }
                        i6++;
                    }
                    int i9 = i8 + 1;
                    cArr[i8] = c;
                    if (i9 == 4) {
                        i5 += m51817a(cArr, bArr, i5);
                        i8 = 0;
                    } else {
                        i8 = i9;
                    }
                    i6++;
                }
                i4 = i7;
                i6 = i8;
            }
            if (i5 == i3) {
                return bArr;
            }
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr, 0, bArr3, 0, i5);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m51819a(String str) {
        byte[] m51815c = m51815c(str);
        if (m51815c == null || m51815c.length <= 0) {
            return null;
        }
        return new String(m51815c);
    }

    /* renamed from: a */
    private static String m51818a(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i2 / 3) << 2) + 4];
            int i3 = 0;
            while (i2 >= 3) {
                int i4 = ((bArr[i] & 255) << 16) + ((bArr[i + 1] & 255) << 8) + (bArr[i + 2] & 255);
                int i5 = i3 + 1;
                char[] cArr2 = f56901d;
                cArr[i3] = cArr2[i4 >> 18];
                int i6 = i5 + 1;
                cArr[i5] = cArr2[(i4 >> 12) & 63];
                int i7 = i6 + 1;
                cArr[i6] = cArr2[(i4 >> 6) & 63];
                i3 = i7 + 1;
                cArr[i7] = cArr2[i4 & 63];
                i += 3;
                i2 -= 3;
            }
            if (i2 == 1) {
                int i8 = bArr[i] & 255;
                int i9 = i3 + 1;
                char[] cArr3 = f56901d;
                cArr[i3] = cArr3[i8 >> 2];
                int i10 = i9 + 1;
                cArr[i9] = cArr3[(i8 << 4) & 63];
                int i11 = i10 + 1;
                cArr[i10] = C20517nb.f52173T;
                i3 = i11 + 1;
                cArr[i11] = C20517nb.f52173T;
            } else if (i2 == 2) {
                int i12 = ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
                int i13 = i3 + 1;
                char[] cArr4 = f56901d;
                cArr[i3] = cArr4[i12 >> 10];
                int i14 = i13 + 1;
                cArr[i13] = cArr4[(i12 >> 4) & 63];
                int i15 = i14 + 1;
                cArr[i14] = cArr4[(i12 << 2) & 63];
                i3 = i15 + 1;
                cArr[i15] = C20517nb.f52173T;
            }
            return new String(cArr, 0, i3);
        } catch (Exception unused) {
            return null;
        }
    }
}

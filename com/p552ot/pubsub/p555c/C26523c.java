package com.p552ot.pubsub.p555c;

import com.p552ot.pubsub.util.C26586j;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ot.pubsub.c.c */
/* loaded from: classes7.dex */
public class C26523c {

    /* renamed from: a */
    private static final String f69403a = "Base64Util";

    /* renamed from: b */
    private static char[] f69404b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: c */
    private static byte[] f69405c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* renamed from: a */
    public static String m41352a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f69404b[i3 >>> 2]);
                stringBuffer.append(f69404b[(i3 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i2 + 1;
            int i5 = bArr[i2] & 255;
            if (i4 == length) {
                stringBuffer.append(f69404b[i3 >>> 2]);
                stringBuffer.append(f69404b[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                stringBuffer.append(f69404b[(i5 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] & 255;
            stringBuffer.append(f69404b[i3 >>> 2]);
            stringBuffer.append(f69404b[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
            stringBuffer.append(f69404b[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
            stringBuffer.append(f69404b[i7 & 63]);
            i = i6;
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m41351b(String str) {
        try {
            return m41352a(str.getBytes("UTF-8"));
        } catch (Exception e) {
            C26586j.m41074b(f69403a, "base64Encode:" + e.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static String m41349c(String str) {
        try {
            return new String(m41353a(str), "UTF-8");
        } catch (Exception e) {
            C26586j.m41074b(f69403a, e.getMessage());
            return "";
        }
    }

    /* renamed from: d */
    private static byte[] m41348d(String str) throws UnsupportedEncodingException {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i5 = 0;
        while (i5 < length) {
            while (true) {
                i = i5 + 1;
                b = f69405c[bytes[i5]];
                if (i >= length || b != -1) {
                    break;
                }
                i5 = i;
            }
            if (b == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b2 = f69405c[bytes[i]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i = i2;
            }
            if (b2 == -1) {
                break;
            }
            stringBuffer.append((char) ((b << 2) | ((b2 & 48) >>> 4)));
            while (true) {
                i3 = i2 + 1;
                byte b5 = bytes[i2];
                if (b5 == 61) {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
                b3 = f69405c[b5];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            stringBuffer.append((char) (((b2 & 15) << 4) | ((b3 & 60) >>> 2)));
            while (true) {
                i4 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    return stringBuffer.toString().getBytes("iso8859-1");
                }
                b4 = f69405c[b6];
                if (i4 >= length || b4 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b4 == -1) {
                break;
            }
            stringBuffer.append((char) (b4 | ((b3 & 3) << 6)));
            i5 = i4;
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }

    /* renamed from: b */
    public static String m41350b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                stringBuffer.append(f69404b[i3 >>> 2]);
                stringBuffer.append(f69404b[(i3 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i2 + 1;
            int i5 = bArr[i2] & 255;
            if (i4 == length) {
                stringBuffer.append(f69404b[i3 >>> 2]);
                stringBuffer.append(f69404b[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                stringBuffer.append(f69404b[(i5 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] & 255;
            stringBuffer.append(f69404b[i3 >>> 2]);
            stringBuffer.append(f69404b[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
            stringBuffer.append(f69404b[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
            stringBuffer.append(f69404b[i7 & 63]);
            i = i6;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static byte[] m41353a(String str) {
        try {
            return m41348d(str);
        } catch (UnsupportedEncodingException e) {
            C26586j.m41073b(f69403a, "decode e", e);
            return new byte[0];
        }
    }

    /* renamed from: a */
    public static byte[] m41354a() {
        return new byte[]{84, 123, 100, 101, 118, 33, 80, 100, 101, 116, 116, 37, 94, 52, 77, 73};
    }
}

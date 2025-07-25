package com.p551my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.my.tracker.obfuscated.u0 */
/* loaded from: classes7.dex */
public final class C26439u0 {

    /* renamed from: a */
    public static final Charset f69040a = Charset.forName("UTF-8");

    /* renamed from: a */
    static int m41603a(double d, OutputStream outputStream) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        outputStream.write(((int) doubleToRawLongBits) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 8)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 16)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 24)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 32)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 40)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 48)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 56)) & 255);
        return 8;
    }

    /* renamed from: b */
    public static int m41588b(int i, int i2, OutputStream outputStream) {
        return m41599a(i, 0, outputStream) + m41587b(i2, outputStream);
    }

    /* renamed from: a */
    static int m41602a(float f, OutputStream outputStream) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        outputStream.write(floatToRawIntBits & 255);
        outputStream.write((floatToRawIntBits >> 8) & 255);
        outputStream.write((floatToRawIntBits >> 16) & 255);
        outputStream.write((floatToRawIntBits >> 24) & 255);
        return 4;
    }

    /* renamed from: b */
    static int m41587b(int i, OutputStream outputStream) {
        return i < 0 ? m41592a(i, outputStream) : m41596a(i, outputStream);
    }

    /* renamed from: a */
    public static int m41601a(int i, double d, OutputStream outputStream) {
        return m41599a(i, 1, outputStream) + m41603a(d, outputStream);
    }

    /* renamed from: a */
    public static int m41600a(int i, float f, OutputStream outputStream) {
        return m41599a(i, 5, outputStream) + m41602a(f, outputStream);
    }

    /* renamed from: a */
    static int m41599a(int i, int i2, OutputStream outputStream) {
        return m41596a((i << 3) | i2, outputStream);
    }

    /* renamed from: a */
    public static int m41598a(int i, long j, OutputStream outputStream) {
        return m41599a(i, 0, outputStream) + m41592a(j, outputStream);
    }

    /* renamed from: a */
    public static int m41597a(int i, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (byteArrayOutputStream == null) {
            return 0;
        }
        return m41599a(i, 2, outputStream) + m41591a(byteArrayOutputStream, outputStream);
    }

    /* renamed from: a */
    static int m41596a(int i, OutputStream outputStream) {
        int i2 = 0;
        while (true) {
            i2++;
            if ((i & (-128)) == 0) {
                outputStream.write(i);
                return i2;
            }
            outputStream.write((i & 127) | 128);
            i >>>= 7;
        }
    }

    /* renamed from: a */
    public static int m41595a(int i, String str, OutputStream outputStream) {
        if (str == null) {
            return 0;
        }
        return m41599a(i, 2, outputStream) + m41590a(str, outputStream);
    }

    /* renamed from: a */
    public static int m41594a(int i, byte[] bArr, OutputStream outputStream) {
        if (bArr == null) {
            return 0;
        }
        return m41599a(i, 2, outputStream) + m41589a(bArr, outputStream);
    }

    /* renamed from: a */
    public static int m41593a(int i, String[] strArr, OutputStream outputStream) {
        if (strArr == null) {
            return 0;
        }
        int i2 = 0;
        for (String str : strArr) {
            i2 += m41595a(i, str, outputStream);
        }
        return i2;
    }

    /* renamed from: a */
    static int m41592a(long j, OutputStream outputStream) {
        int i = 0;
        while (true) {
            i++;
            if (((-128) & j) == 0) {
                outputStream.write((int) j);
                return i;
            }
            outputStream.write(((int) (127 & j)) | 128);
            j >>>= 7;
        }
    }

    /* renamed from: a */
    static int m41591a(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        int size = byteArrayOutputStream.size();
        int m41587b = m41587b(size, outputStream) + size;
        byteArrayOutputStream.writeTo(outputStream);
        return m41587b;
    }

    /* renamed from: a */
    static int m41590a(String str, OutputStream outputStream) {
        return m41589a(str.getBytes(f69040a), outputStream);
    }

    /* renamed from: a */
    static int m41589a(byte[] bArr, OutputStream outputStream) {
        int m41587b = m41587b(bArr.length, outputStream) + bArr.length;
        outputStream.write(bArr);
        return m41587b;
    }
}

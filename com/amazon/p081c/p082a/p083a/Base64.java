package com.amazon.p081c.p082a.p083a;

import androidx.core.view.MotionEventCompat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.amazon.c.a.a.c */
/* loaded from: classes2.dex */
public class Base64 {

    /* renamed from: a */
    public static final int f2905a = 0;

    /* renamed from: b */
    public static final int f2906b = 1;

    /* renamed from: c */
    public static final int f2907c = 0;

    /* renamed from: d */
    public static final int f2908d = 2;

    /* renamed from: e */
    public static final int f2909e = 4;

    /* renamed from: f */
    public static final int f2910f = 8;

    /* renamed from: g */
    public static final int f2911g = 16;

    /* renamed from: h */
    public static final int f2912h = 32;

    /* renamed from: i */
    static final /* synthetic */ boolean f2913i = true;

    /* renamed from: j */
    private static final int f2914j = 76;

    /* renamed from: l */
    private static final byte f2916l = 10;

    /* renamed from: m */
    private static final String f2917m = "US-ASCII";

    /* renamed from: o */
    private static final byte f2919o = -1;

    /* renamed from: p */
    private static final byte[] f2920p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: n */
    private static final byte f2918n = -5;

    /* renamed from: k */
    private static final byte f2915k = 61;

    /* renamed from: q */
    private static final byte[] f2921q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f2918n, f2918n, -9, -9, f2918n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f2918n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, f2915k, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: r */
    private static final byte[] f2922r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: s */
    private static final byte[] f2923s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f2918n, f2918n, -9, -9, f2918n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f2918n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f2915k, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: t */
    private static final byte[] f2924t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: u */
    private static final byte[] f2925u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f2918n, f2918n, -9, -9, f2918n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f2918n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, f2915k, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* compiled from: Base64.java */
    /* renamed from: com.amazon.c.a.a.c$a */
    /* loaded from: classes2.dex */
    public static class C3615a extends FilterInputStream {

        /* renamed from: a */
        private boolean f2926a;

        /* renamed from: b */
        private int f2927b;

        /* renamed from: c */
        private byte[] f2928c;

        /* renamed from: d */
        private int f2929d;

        /* renamed from: e */
        private int f2930e;

        /* renamed from: f */
        private int f2931f;

        /* renamed from: g */
        private boolean f2932g;

        /* renamed from: h */
        private int f2933h;

        /* renamed from: i */
        private byte[] f2934i;

        public C3615a(InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read;
            if (this.f2927b < 0) {
                if (!this.f2926a) {
                    byte[] bArr = new byte[4];
                    int i = 0;
                    while (i < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.f2934i[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr[i] = (byte) read;
                        i++;
                    }
                    if (i != 4) {
                        if (i == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f2930e = Base64.m102659b(bArr, 0, this.f2928c, 0, this.f2933h);
                    this.f2927b = 0;
                } else {
                    byte[] bArr2 = new byte[3];
                    int i2 = 0;
                    for (int i3 = 0; i3 < 3; i3++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr2[i3] = (byte) read2;
                        i2++;
                    }
                    if (i2 <= 0) {
                        return -1;
                    }
                    Base64.m102660b(bArr2, 0, i2, this.f2928c, 0, this.f2933h);
                    this.f2927b = 0;
                    this.f2930e = 4;
                }
            }
            int i4 = this.f2927b;
            if (i4 >= 0) {
                if (i4 >= this.f2930e) {
                    return -1;
                }
                if (this.f2926a && this.f2932g && this.f2931f >= 76) {
                    this.f2931f = 0;
                    return 10;
                }
                this.f2931f++;
                byte[] bArr3 = this.f2928c;
                int i5 = i4 + 1;
                this.f2927b = i5;
                byte b = bArr3[i4];
                if (i5 >= this.f2929d) {
                    this.f2927b = -1;
                }
                return b & 255;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        public C3615a(InputStream inputStream, int i) {
            super(inputStream);
            this.f2933h = i;
            this.f2932g = (i & 8) > 0;
            boolean z = (i & 1) > 0;
            this.f2926a = z;
            int i2 = z ? 4 : 3;
            this.f2929d = i2;
            this.f2928c = new byte[i2];
            this.f2927b = -1;
            this.f2931f = 0;
            this.f2934i = Base64.m102657c(i);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i + i3] = (byte) read;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    /* compiled from: Base64.java */
    /* renamed from: com.amazon.c.a.a.c$b */
    /* loaded from: classes2.dex */
    public static class C3616b extends FilterOutputStream {

        /* renamed from: a */
        private boolean f2935a;

        /* renamed from: b */
        private int f2936b;

        /* renamed from: c */
        private byte[] f2937c;

        /* renamed from: d */
        private int f2938d;

        /* renamed from: e */
        private int f2939e;

        /* renamed from: f */
        private boolean f2940f;

        /* renamed from: g */
        private byte[] f2941g;

        /* renamed from: h */
        private boolean f2942h;

        /* renamed from: i */
        private int f2943i;

        /* renamed from: j */
        private byte[] f2944j;

        public C3616b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        /* renamed from: a */
        public void m102652a() throws IOException {
            int i = this.f2936b;
            if (i > 0) {
                if (this.f2935a) {
                    ((FilterOutputStream) this).out.write(Base64.m102658b(this.f2941g, this.f2937c, i, this.f2943i));
                    this.f2936b = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        /* renamed from: b */
        public void m102651b() throws IOException {
            m102652a();
            this.f2942h = true;
        }

        /* renamed from: c */
        public void m102650c() {
            this.f2942h = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            m102652a();
            super.close();
            this.f2937c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.f2942h) {
                ((FilterOutputStream) this).out.write(i);
            } else if (this.f2935a) {
                byte[] bArr = this.f2937c;
                int i2 = this.f2936b;
                int i3 = i2 + 1;
                this.f2936b = i3;
                bArr[i2] = (byte) i;
                int i4 = this.f2938d;
                if (i3 >= i4) {
                    ((FilterOutputStream) this).out.write(Base64.m102658b(this.f2941g, bArr, i4, this.f2943i));
                    int i5 = this.f2939e + 4;
                    this.f2939e = i5;
                    if (this.f2940f && i5 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.f2939e = 0;
                    }
                    this.f2936b = 0;
                }
            } else {
                byte b = this.f2944j[i & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.f2937c;
                int i6 = this.f2936b;
                int i7 = i6 + 1;
                this.f2936b = i7;
                bArr2[i6] = (byte) i;
                if (i7 >= this.f2938d) {
                    ((FilterOutputStream) this).out.write(this.f2941g, 0, Base64.m102659b(bArr2, 0, this.f2941g, 0, this.f2943i));
                    this.f2936b = 0;
                }
            }
        }

        public C3616b(OutputStream outputStream, int i) {
            super(outputStream);
            this.f2940f = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.f2935a = z;
            int i2 = z ? 3 : 4;
            this.f2938d = i2;
            this.f2937c = new byte[i2];
            this.f2936b = 0;
            this.f2939e = 0;
            this.f2942h = false;
            this.f2941g = new byte[4];
            this.f2943i = i;
            this.f2944j = Base64.m102657c(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f2942h) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    private Base64() {
    }

    /* renamed from: b */
    private static final byte[] m102665b(int i) {
        if ((i & 16) == 16) {
            return f2922r;
        }
        if ((i & 32) == 32) {
            return f2924t;
        }
        return f2920p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final byte[] m102657c(int i) {
        if ((i & 16) == 16) {
            return f2923s;
        }
        if ((i & 32) == 32) {
            return f2925u;
        }
        return f2921q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m102658b(byte[] bArr, byte[] bArr2, int i, int i2) {
        m102660b(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m102654c(byte[] bArr) throws IOException {
        return m102653c(bArr, 0, bArr.length, 0);
    }

    /* renamed from: a */
    public static void m102675a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            m102658b(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m102660b(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] m102665b = m102665b(i4);
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = m102665b[i5 >>> 18];
            bArr2[i3 + 1] = m102665b[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = f2915k;
            bArr2[i3 + 3] = f2915k;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = m102665b[i5 >>> 18];
            bArr2[i3 + 1] = m102665b[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = m102665b[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = f2915k;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = m102665b[i5 >>> 18];
            bArr2[i3 + 1] = m102665b[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = m102665b[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = m102665b[i5 & 63];
            return bArr2;
        }
    }

    /* renamed from: c */
    public static byte[] m102653c(byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4;
        if (bArr != null) {
            if (i < 0 || (i4 = i + i2) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            if (i2 == 0) {
                return new byte[0];
            }
            if (i2 >= 4) {
                byte[] m102657c = m102657c(i3);
                byte[] bArr2 = new byte[(i2 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i5 = 0;
                int i6 = 0;
                while (i < i4) {
                    byte b = bArr[i];
                    byte b2 = m102657c[b & 255];
                    if (b2 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i] & 255), Integer.valueOf(i)));
                    }
                    if (b2 >= -1) {
                        int i7 = i5 + 1;
                        bArr3[i5] = b;
                        if (i7 > 3) {
                            i6 += m102659b(bArr3, 0, bArr2, i6, i3);
                            if (bArr[i] == 61) {
                                break;
                            }
                            i5 = 0;
                        } else {
                            i5 = i7;
                        }
                    }
                    i++;
                }
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr2, 0, bArr4, 0, i6);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    /* renamed from: a */
    public static void m102674a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            m102658b(bArr2, bArr, min, 0);
            for (int i = 0; i < 4; i++) {
                charBuffer.put((char) (bArr2[i] & 255));
            }
        }
    }

    /* renamed from: a */
    public static String m102680a(Serializable serializable) throws IOException {
        return m102679a(serializable, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static String m102679a(Serializable serializable, int i) throws IOException {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        C3616b c3616b;
        OutputStream outputStream2;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c3616b = new C3616b(byteArrayOutputStream, i | 1);
                    try {
                        if ((i & 2) != 0) {
                            outputStream = new GZIPOutputStream(c3616b);
                            try {
                                objectOutputStream = new ObjectOutputStream(outputStream);
                                outputStream = outputStream;
                            } catch (IOException e) {
                                e = e;
                                outputStream2 = objectOutputStream;
                                objectOutputStream = byteArrayOutputStream;
                                outputStream = outputStream;
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    OutputStream outputStream3 = outputStream2;
                                    byteArrayOutputStream = objectOutputStream;
                                    objectOutputStream = outputStream3;
                                    try {
                                        objectOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        c3616b.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                objectOutputStream.close();
                                outputStream.close();
                                c3616b.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream = new ObjectOutputStream(c3616b);
                            outputStream = null;
                        }
                        objectOutputStream.writeObject(serializable);
                        try {
                            objectOutputStream.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            c3616b.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), "US-ASCII");
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e2) {
                        e = e2;
                        OutputStream outputStream4 = objectOutputStream;
                        objectOutputStream = byteArrayOutputStream;
                        outputStream2 = outputStream4;
                        outputStream = outputStream4;
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = objectOutputStream;
                    }
                } catch (IOException e3) {
                    e = e3;
                    outputStream = null;
                    c3616b = null;
                    objectOutputStream = byteArrayOutputStream;
                    outputStream2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                    c3616b = null;
                }
            } catch (IOException e4) {
                e = e4;
                outputStream = null;
                outputStream2 = null;
                c3616b = null;
            } catch (Throwable th5) {
                th = th5;
                outputStream = null;
                byteArrayOutputStream = 0;
                c3616b = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    /* renamed from: b */
    public static byte[] m102662b(byte[] bArr) {
        try {
            return m102661b(bArr, 0, bArr.length, 0);
        } catch (IOException e) {
            if (f2913i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: b */
    public static byte[] m102661b(byte[] bArr, int i, int i2, int i3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        C3616b c3616b;
        ?? r4;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        } else if (i2 >= 0) {
            if (i + i2 > bArr.length) {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
            }
            if ((i3 & 2) != 0) {
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c3616b = new C3616b(byteArrayOutputStream, i3 | 1);
                    } catch (IOException e) {
                        e = e;
                        c3616b = null;
                        r4 = 0;
                    } catch (Throwable th) {
                        th = th;
                        c3616b = null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    c3616b = null;
                    r4 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    c3616b = null;
                }
                try {
                    r4 = new GZIPOutputStream(c3616b);
                    try {
                        r4.write(bArr, i, i2);
                        r4.close();
                        try {
                            r4.close();
                        } catch (Exception unused) {
                        }
                        try {
                            c3616b.close();
                        } catch (Exception unused2) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused3) {
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (IOException e3) {
                        e = e3;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        r4 = r4;
                        try {
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            byteArrayOutputStream2 = r4;
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused4) {
                            }
                            try {
                                c3616b.close();
                            } catch (Exception unused5) {
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused6) {
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream2 = r4;
                        byteArrayOutputStream2.close();
                        c3616b.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                    r4 = 0;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream2.close();
                    c3616b.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } else {
                boolean z = (i3 & 8) != 0;
                int i4 = ((i2 / 3) * 4) + (i2 % 3 > 0 ? 4 : 0);
                if (z) {
                    i4 += i4 / 76;
                }
                int i5 = i4;
                byte[] bArr2 = new byte[i5];
                int i6 = i2 - 2;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < i6) {
                    int i10 = i7;
                    m102660b(bArr, i7 + i, 3, bArr2, i8, i3);
                    int i11 = i9 + 4;
                    if (!z || i11 < 76) {
                        i9 = i11;
                    } else {
                        bArr2[i8 + 4] = 10;
                        i8++;
                        i9 = 0;
                    }
                    i7 = i10 + 3;
                    i8 += 4;
                }
                int i12 = i7;
                if (i12 < i2) {
                    m102660b(bArr, i12 + i, i2 - i12, bArr2, i8, i3);
                    i8 += 4;
                }
                int i13 = i8;
                if (i13 <= i5 - 1) {
                    byte[] bArr3 = new byte[i13];
                    System.arraycopy(bArr2, 0, bArr3, 0, i13);
                    return bArr3;
                }
                return bArr2;
            }
        } else {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        }
    }

    /* renamed from: c */
    public static String m102656c(String str) throws IOException {
        C3615a c3615a = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                C3615a c3615a2 = new C3615a(new BufferedInputStream(new FileInputStream(file)), 1);
                int i = 0;
                while (true) {
                    try {
                        int read = c3615a2.read(bArr, i, 4096);
                        if (read < 0) {
                            break;
                        }
                        i += read;
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        c3615a = c3615a2;
                        try {
                            c3615a.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i, "US-ASCII");
                try {
                    c3615a2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    public static void m102655c(String str, String str2) throws IOException {
        byte[] m102664b = m102664b(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(m102664b);
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static String m102673a(byte[] bArr) {
        String str;
        try {
            str = m102670a(bArr, 0, bArr.length, 0);
        } catch (IOException e) {
            if (!f2913i) {
                throw new AssertionError(e.getMessage());
            }
            str = null;
        }
        if (f2913i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static String m102672a(byte[] bArr, int i) throws IOException {
        return m102670a(bArr, 0, bArr.length, i);
    }

    /* renamed from: a */
    public static String m102671a(byte[] bArr, int i, int i2) {
        String str;
        try {
            str = m102670a(bArr, i, i2, 0);
        } catch (IOException e) {
            if (!f2913i) {
                throw new AssertionError(e.getMessage());
            }
            str = null;
        }
        if (f2913i || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static String m102670a(byte[] bArr, int i, int i2, int i3) throws IOException {
        byte[] m102661b = m102661b(bArr, i, i2, i3);
        try {
            return new String(m102661b, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(m102661b);
        }
    }

    /* renamed from: a */
    public static byte[] m102678a(String str) throws IOException {
        return m102677a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0059 -> B:73:0x0059). Please submit an issue!!! */
    /* renamed from: a */
    public static byte[] m102677a(String str, int i) throws IOException {
        byte[] bytes;
        ?? length;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] m102653c = m102653c(bytes, 0, bytes.length, i);
            boolean z = (i & 4) != 0;
            if (m102653c != null && (length = m102653c.length) >= 4 && !z && 35615 == ((m102653c[0] & 255) | ((m102653c[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            length = new ByteArrayInputStream(m102653c);
                            try {
                                gZIPInputStream = new GZIPInputStream(length);
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, read);
                                    } catch (IOException e) {
                                        e = e;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        length = length;
                                        try {
                                            e.printStackTrace();
                                            byteArrayOutputStream.close();
                                            gZIPInputStream.close();
                                            length.close();
                                            return m102653c;
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                length.close();
                                            } catch (Exception unused4) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        length.close();
                                        throw th;
                                    }
                                }
                                m102653c = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                            } catch (IOException e2) {
                                e = e2;
                                gZIPInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            length = 0;
                            gZIPInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            length = 0;
                            gZIPInputStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        length = 0;
                        gZIPInputStream = null;
                    } catch (Throwable th5) {
                        th = th5;
                        length = 0;
                        gZIPInputStream = null;
                    }
                } catch (Exception unused5) {
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return m102653c;
        }
        throw new NullPointerException("Input string was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m102659b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        if (bArr != null) {
            if (bArr2 != null) {
                if (i >= 0 && (i4 = i + 3) < bArr.length) {
                    if (i2 >= 0 && (i5 = i2 + 2) < bArr2.length) {
                        byte[] m102657c = m102657c(i3);
                        byte b = bArr[i + 2];
                        if (b == 61) {
                            bArr2[i2] = (byte) ((((m102657c[bArr[i + 1]] & 255) << 12) | ((m102657c[bArr[i]] & 255) << 18)) >>> 16);
                            return 1;
                        }
                        byte b2 = bArr[i4];
                        if (b2 == 61) {
                            int i6 = ((m102657c[bArr[i + 1]] & 255) << 12) | ((m102657c[bArr[i]] & 255) << 18) | ((m102657c[b] & 255) << 6);
                            bArr2[i2] = (byte) (i6 >>> 16);
                            bArr2[i2 + 1] = (byte) (i6 >>> 8);
                            return 2;
                        }
                        int i7 = ((m102657c[bArr[i + 1]] & 255) << 12) | ((m102657c[bArr[i]] & 255) << 18) | ((m102657c[b] & 255) << 6) | (m102657c[b2] & 255);
                        bArr2[i2] = (byte) (i7 >> 16);
                        bArr2[i2 + 1] = (byte) (i7 >> 8);
                        bArr2[i5] = (byte) i7;
                        return 3;
                    }
                    throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
                }
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
            }
            throw new NullPointerException("Destination array was null.");
        }
        throw new NullPointerException("Source array was null.");
    }

    /* renamed from: a */
    public static void m102667a(byte[] bArr, String str) throws IOException {
        if (bArr != null) {
            C3616b c3616b = null;
            try {
                try {
                    C3616b c3616b2 = new C3616b(new FileOutputStream(str), 1);
                    try {
                        c3616b2.write(bArr);
                        try {
                            c3616b2.close();
                        } catch (Exception unused) {
                        }
                    } catch (IOException e) {
                    } catch (Throwable th) {
                        th = th;
                        c3616b = c3616b2;
                        try {
                            c3616b.close();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    throw e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("Data to encode was null.");
        }
    }

    /* renamed from: b */
    public static byte[] m102664b(String str) throws IOException {
        C3615a c3615a = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    C3615a c3615a2 = new C3615a(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i = 0;
                    while (true) {
                        try {
                            int read = c3615a2.read(bArr, i, 4096);
                            if (read < 0) {
                                break;
                            }
                            i += read;
                        } catch (IOException e) {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            c3615a = c3615a2;
                            try {
                                c3615a.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    try {
                        c3615a2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m102676a(String str, String str2) throws IOException {
        C3616b c3616b = null;
        try {
            try {
                C3616b c3616b2 = new C3616b(new FileOutputStream(str2), 0);
                try {
                    c3616b2.write(str.getBytes("US-ASCII"));
                    try {
                        c3616b2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    c3616b = c3616b2;
                    try {
                        c3616b.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public static void m102663b(String str, String str2) throws IOException {
        String m102656c = m102656c(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(m102656c.getBytes("US-ASCII"));
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

package com.explorestack.iab.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;

/* renamed from: com.explorestack.iab.utils.h */
/* loaded from: classes3.dex */
public class C10515h {

    /* renamed from: a */
    private static final byte[] f24043a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.explorestack.iab.utils.h$b */
    /* loaded from: classes3.dex */
    public static final class C10517b {

        /* renamed from: a */
        long f24044a;

        /* renamed from: b */
        byte[] f24045b;

        /* renamed from: c */
        int f24046c;

        /* renamed from: d */
        int f24047d;

        /* renamed from: e */
        boolean f24048e;

        /* renamed from: f */
        int f24049f;

        private C10517b() {
        }
    }

    /* renamed from: a */
    private int m79290a(int i, int i2) {
        int i3 = i - 2147483648;
        int i4 = i2 - 2147483648;
        if (i3 < i4) {
            return -1;
        }
        if (i3 == i4) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    private int m79289b(C10517b c10517b) {
        if (c10517b.f24045b != null) {
            return c10517b.f24046c - c10517b.f24047d;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* renamed from: e */
    private void m79286e(byte[] bArr, int i, int i2, C10517b c10517b) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        byte b;
        long j9;
        if (c10517b.f24048e) {
            return;
        }
        ?? r3 = 1;
        if (i2 < 0) {
            c10517b.f24048e = true;
        }
        int i3 = 0;
        int i4 = i;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 == 61) {
                c10517b.f24048e = r3;
                break;
            }
            byte[] m79284g = m79284g(7, c10517b);
            if (b2 >= 0) {
                byte[] bArr2 = f24043a;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i6 = (c10517b.f24049f + r3) % 8;
                    c10517b.f24049f = i6;
                    c10517b.f24044a = (c10517b.f24044a << 5) + b;
                    if (i6 == 0) {
                        int i7 = c10517b.f24046c;
                        m79284g[i7] = (byte) ((j9 >> 32) & 255);
                        m79284g[i7 + 1] = (byte) ((j9 >> 24) & 255);
                        m79284g[i7 + 2] = (byte) ((j9 >> 16) & 255);
                        m79284g[i7 + 3] = (byte) ((j9 >> 8) & 255);
                        c10517b.f24046c = i7 + 5;
                        m79284g[i7 + 4] = (byte) (j9 & 255);
                    }
                }
            }
            i3++;
            i4 = i5;
            r3 = 1;
        }
        if (c10517b.f24048e && c10517b.f24049f > 0) {
            byte[] m79284g2 = m79284g(7, c10517b);
            switch (c10517b.f24049f) {
                case 1:
                case 2:
                    int i8 = c10517b.f24046c;
                    c10517b.f24046c = i8 + 1;
                    m79284g2[i8] = (byte) ((c10517b.f24044a >> 2) & 255);
                    return;
                case 3:
                    int i9 = c10517b.f24046c;
                    c10517b.f24046c = i9 + 1;
                    m79284g2[i9] = (byte) ((c10517b.f24044a >> 7) & 255);
                    return;
                case 4:
                    c10517b.f24044a = c10517b.f24044a >> 4;
                    int i10 = c10517b.f24046c;
                    m79284g2[i10] = (byte) ((j >> 12) & 255);
                    c10517b.f24046c = i10 + 2;
                    m79284g2[i10 + 1] = (byte) (j2 & 255);
                    return;
                case 5:
                    c10517b.f24044a = c10517b.f24044a >> 1;
                    int i11 = c10517b.f24046c;
                    m79284g2[i11] = (byte) ((j3 >> 17) & 255);
                    m79284g2[i11 + 1] = (byte) ((j3 >> 9) & 255);
                    c10517b.f24046c = i11 + 3;
                    m79284g2[i11 + 2] = (byte) (j4 & 255);
                    return;
                case 6:
                    c10517b.f24044a = c10517b.f24044a >> 6;
                    int i12 = c10517b.f24046c;
                    m79284g2[i12] = (byte) ((j5 >> 22) & 255);
                    m79284g2[i12 + 1] = (byte) ((j5 >> 14) & 255);
                    c10517b.f24046c = i12 + 3;
                    m79284g2[i12 + 2] = (byte) (j6 & 255);
                    return;
                case 7:
                    c10517b.f24044a = c10517b.f24044a >> 3;
                    int i13 = c10517b.f24046c;
                    m79284g2[i13] = (byte) ((j7 >> 27) & 255);
                    m79284g2[i13 + 1] = (byte) ((j7 >> 19) & 255);
                    m79284g2[i13 + 2] = (byte) ((j7 >> 11) & 255);
                    c10517b.f24046c = i13 + 4;
                    m79284g2[i13 + 3] = (byte) (j8 & 255);
                    return;
                default:
                    throw new IllegalStateException("Impossible modulus " + c10517b.f24049f);
            }
        }
    }

    /* renamed from: f */
    private void m79285f(byte[] bArr, int i, C10517b c10517b) {
        if (c10517b.f24045b != null) {
            int min = Math.min(m79289b(c10517b), i);
            System.arraycopy(c10517b.f24045b, c10517b.f24047d, bArr, 0, min);
            int i2 = c10517b.f24047d + min;
            c10517b.f24047d = i2;
            if (i2 >= c10517b.f24046c) {
                c10517b.f24045b = null;
            }
        }
    }

    /* renamed from: g */
    private byte[] m79284g(int i, C10517b c10517b) {
        byte[] bArr = c10517b.f24045b;
        if (bArr == null) {
            c10517b.f24045b = new byte[Math.max(i, 8192)];
            c10517b.f24046c = 0;
            c10517b.f24047d = 0;
        } else {
            int i2 = c10517b.f24046c + i;
            if (i2 - bArr.length > 0) {
                return m79283h(c10517b, i2);
            }
        }
        return c10517b.f24045b;
    }

    /* renamed from: h */
    private byte[] m79283h(C10517b c10517b, int i) {
        int length = c10517b.f24045b.length * 2;
        if (m79290a(length, i) < 0) {
            length = i;
        }
        if (m79290a(length, 2147483639) > 0) {
            length = Math.max(i, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = c10517b.f24045b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        c10517b.f24045b = bArr;
        return bArr;
    }

    @NonNull
    /* renamed from: c */
    public String m79288c(@NonNull String str) {
        return m79287d(str.getBytes(Charset.forName("UTF-8")));
    }

    @NonNull
    /* renamed from: d */
    public String m79287d(@Nullable byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            C10517b c10517b = new C10517b();
            m79286e(bArr, 0, bArr.length, c10517b);
            m79286e(bArr, 0, -1, c10517b);
            int i = c10517b.f24046c;
            byte[] bArr2 = new byte[i];
            m79285f(bArr2, i, c10517b);
            return new String(bArr2);
        }
        return new String(bArr);
    }
}

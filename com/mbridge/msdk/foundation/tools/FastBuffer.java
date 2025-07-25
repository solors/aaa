package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;

/* renamed from: com.mbridge.msdk.foundation.tools.q */
/* loaded from: classes6.dex */
public final class FastBuffer {

    /* renamed from: a */
    public byte[] f57016a;

    /* renamed from: b */
    public int f57017b;

    /* renamed from: c */
    private char[] f57018c;

    public FastBuffer(int i) {
        this(new byte[i], 0);
    }

    /* renamed from: a */
    public static int m51632a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                i2++;
            } else if (charAt < 2048) {
                i2 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i2 += 3;
            } else {
                i3++;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: c */
    private long m51624c(int i) {
        byte[] bArr = this.f57016a;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((255 & bArr[i7]) << 48) | (bArr[i7 + 1] << 56);
    }

    /* renamed from: b */
    public final long m51629b() {
        long m51624c = m51624c(this.f57017b);
        this.f57017b += 8;
        return m51624c;
    }

    /* renamed from: d */
    public final short m51623d() {
        byte[] bArr = this.f57016a;
        int i = this.f57017b;
        int i2 = i + 1;
        this.f57017b = i2 + 1;
        return (short) ((bArr[i2] << 8) | (bArr[i] & 255));
    }

    public FastBuffer(byte[] bArr, int i) {
        this.f57018c = null;
        this.f57016a = bArr;
        this.f57017b = i;
    }

    /* renamed from: c */
    public final int m51625c() {
        byte[] bArr = this.f57016a;
        int i = this.f57017b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f57017b = i5 + 1;
        return (bArr[i5] << 24) | i6;
    }

    /* renamed from: a */
    public final byte m51638a() {
        byte[] bArr = this.f57016a;
        int i = this.f57017b;
        this.f57017b = i + 1;
        return bArr[i];
    }

    /* renamed from: b */
    public final void m51628b(int i) {
        byte[] bArr = this.f57016a;
        int i2 = this.f57017b;
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >> 16);
        this.f57017b = i5 + 1;
        bArr[i5] = (byte) (i >> 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final long m51635a(int i, int i2) {
        long j = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            j ^= m51624c(i6);
            i6 += 8;
        }
        while (i5 < (i4 << 3)) {
            j ^= (this.f57016a[i6] & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i8 = (i & 7) << 3;
        return (j >>> (64 - i8)) | (j << i8);
    }

    public FastBuffer(byte[] bArr) {
        this(bArr, 0);
    }

    /* renamed from: a */
    public final void m51637a(byte b) {
        byte[] bArr = this.f57016a;
        int i = this.f57017b;
        this.f57017b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public final void m51630a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f57016a, this.f57017b, length);
            this.f57017b += length;
        }
    }

    /* renamed from: b */
    public final void m51627b(int i, int i2) {
        byte[] bArr = this.f57016a;
        int i3 = i + 1;
        bArr[i] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >> 8);
        bArr[i4] = (byte) (i2 >> 16);
        bArr[i4 + 1] = (byte) (i2 >> 24);
    }

    /* renamed from: a */
    public final void m51633a(long j) {
        m51634a(this.f57017b, j);
        this.f57017b += 8;
    }

    /* renamed from: b */
    public final void m51626b(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.f57016a;
        int i = this.f57017b;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                bArr[i] = (byte) charAt;
                i2 = i3;
                i++;
            } else if (charAt < 2048) {
                int i4 = i + 1;
                bArr[i] = (byte) ((charAt >>> 6) | 192);
                i = i4 + 1;
                bArr[i4] = (byte) ((charAt & '?') | 128);
                i2 = i3;
            } else if (charAt >= 55296 && charAt <= 57343) {
                int i5 = i3 + 1;
                int charAt2 = ((charAt << '\n') + str.charAt(i3)) - 56613888;
                int i6 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i = i8 + 1;
                bArr[i8] = (byte) ((charAt2 & 63) | 128);
                i2 = i5;
            } else {
                int i9 = i + 1;
                bArr[i] = (byte) ((charAt >>> '\f') | 224);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt >>> 6) & 63) | 128);
                bArr[i10] = (byte) ((charAt & '?') | 128);
                i2 = i3;
                i = i10 + 1;
            }
        }
        this.f57017b = i;
    }

    /* renamed from: a */
    public final void m51634a(int i, long j) {
        byte[] bArr = this.f57016a;
        int i2 = i + 1;
        bArr[i] = (byte) j;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j >> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j >> 24);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j >> 32);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j >> 40);
        bArr[i7] = (byte) (j >> 48);
        bArr[i7 + 1] = (byte) (j >> 56);
    }

    /* renamed from: a */
    public final void m51631a(short s) {
        byte[] bArr = this.f57016a;
        int i = this.f57017b;
        int i2 = i + 1;
        bArr[i] = (byte) s;
        this.f57017b = i2 + 1;
        bArr[i2] = (byte) (s >> 8);
    }

    /* renamed from: a */
    public final String m51636a(int i) {
        String str;
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        if (i > 2048) {
            str = new String(this.f57016a, this.f57017b, i, StandardCharsets.UTF_8);
        } else {
            char[] cArr = this.f57018c;
            if (cArr == null) {
                if (i <= 256) {
                    this.f57018c = new char[256];
                } else {
                    this.f57018c = new char[2048];
                }
            } else if (cArr.length < i) {
                this.f57018c = new char[2048];
            }
            char[] cArr2 = this.f57018c;
            byte[] bArr = this.f57016a;
            int i2 = this.f57017b;
            int i3 = i2 + i;
            int i4 = 0;
            while (i2 < i3) {
                int i5 = i2 + 1;
                byte b = bArr[i2];
                if (b > 0) {
                    cArr2[i4] = (char) b;
                    i2 = i5;
                    i4++;
                } else if (b < -32) {
                    cArr2[i4] = (char) (((b & 31) << 6) | (bArr[i5] & 63));
                    i2 = i5 + 1;
                    i4++;
                } else if (b < -16) {
                    int i6 = i5 + 1;
                    cArr2[i4] = (char) (((b & 15) << 12) | ((bArr[i5] & 63) << 6) | (bArr[i6] & 63));
                    i2 = i6 + 1;
                    i4++;
                } else {
                    int i7 = i5 + 1;
                    int i8 = i7 + 1;
                    int i9 = ((b & 7) << 18) | ((bArr[i5] & 63) << 12) | ((bArr[i7] & 63) << 6) | (bArr[i8] & 63);
                    int i10 = i4 + 1;
                    cArr2[i4] = (char) ((i9 >>> 10) + 55232);
                    i4 = i10 + 1;
                    cArr2[i10] = (char) ((i9 & 1023) + 56320);
                    i2 = i8 + 1;
                }
            }
            if (i2 <= i3) {
                str = new String(cArr2, 0, i4);
            } else {
                throw new IllegalArgumentException("Invalid String");
            }
        }
        this.f57017b += i;
        return str;
    }
}

package com.ironsource;

import com.google.common.primitives.UnsignedBytes;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.bl */
/* loaded from: classes6.dex */
public final class C19646bl {

    /* renamed from: d */
    private static final byte[] f49304d = {UnsignedBytes.MAX_POWER_OF_TWO, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a */
    private C19648b f49305a = new C19648b();

    /* renamed from: b */
    private C19648b f49306b = new C19648b();

    /* renamed from: c */
    private int[] f49307c = new int[16];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.bl$b */
    /* loaded from: classes6.dex */
    public class C19648b {

        /* renamed from: a */
        private boolean f49308a;

        /* renamed from: b */
        private int[] f49309b;

        /* renamed from: c */
        private long f49310c;

        /* renamed from: d */
        private byte[] f49311d;

        private C19648b() {
            this.f49308a = true;
            this.f49309b = new int[4];
            this.f49311d = new byte[64];
            m59281a();
        }

        /* renamed from: a */
        static /* synthetic */ long m59279a(C19648b c19648b, long j) {
            long j2 = c19648b.f49310c + j;
            c19648b.f49310c = j2;
            return j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m59272f(C19648b c19648b) {
            byte[] bArr = c19648b.f49311d;
            byte[] bArr2 = this.f49311d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = c19648b.f49309b;
            int[] iArr2 = this.f49309b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            this.f49308a = c19648b.f49308a;
            this.f49310c = c19648b.f49310c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m59281a() {
            int[] iArr = this.f49309b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f49310c = 0L;
        }
    }

    C19646bl() {
        m59284c();
    }

    /* renamed from: a */
    private static int m59299a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & i2) | (i4 & (~i2))) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: b */
    private static int m59288b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & (~i4)) | (i2 & i4)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: c */
    private static int m59283c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 ^ i2) ^ i4) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    /* renamed from: d */
    private static int m59282d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + (i3 ^ ((~i4) | i2)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    public String toString() {
        return m59289b();
    }

    /* renamed from: a */
    public static String m59295a(String str) {
        C19646bl c19646bl = new C19646bl();
        c19646bl.m59287b(str);
        return c19646bl.m59289b();
    }

    /* renamed from: b */
    public String m59289b() {
        return m59293a(m59301a());
    }

    /* renamed from: c */
    public void m59284c() {
        this.f49305a.m59281a();
        this.f49306b.f49308a = false;
    }

    /* renamed from: a */
    private static String m59293a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public void m59287b(String str) {
        m59286b(str.getBytes());
    }

    /* renamed from: a */
    public void m59300a(byte b) {
        m59292a(new byte[]{b}, 1);
    }

    /* renamed from: b */
    public void m59286b(byte[] bArr) {
        m59285b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private void m59297a(C19648b c19648b, byte[] bArr, int i, int i2) {
        int i3 = 0;
        this.f49306b.f49308a = false;
        if (i2 + i > bArr.length) {
            i2 = bArr.length - i;
        }
        int i4 = ((int) (c19648b.f49310c >>> 3)) & 63;
        C19648b.m59279a(c19648b, i2 << 3);
        int i5 = 64 - i4;
        if (i2 >= i5) {
            System.arraycopy(bArr, i, c19648b.f49311d, i4, i5);
            m59296a(c19648b, m59291a(c19648b.f49311d, 64, 0));
            while (i5 + 63 < i2) {
                m59296a(c19648b, m59291a(bArr, 64, i5));
                i5 += 64;
            }
            i4 = 0;
            i3 = i5;
        }
        if (i3 < i2) {
            for (int i6 = i3; i6 < i2; i6++) {
                c19648b.f49311d[(i4 + i6) - i3] = bArr[i6 + i];
            }
        }
    }

    /* renamed from: b */
    public void m59285b(byte[] bArr, int i, int i2) {
        m59297a(this.f49305a, bArr, i, i2);
    }

    /* renamed from: a */
    private static void m59296a(C19648b c19648b, int[] iArr) {
        int i = c19648b.f49309b[0];
        int i2 = c19648b.f49309b[1];
        int i3 = c19648b.f49309b[2];
        int i4 = c19648b.f49309b[3];
        int m59299a = m59299a(i, i2, i3, i4, iArr[0], 7, -680876936);
        int m59299a2 = m59299a(i4, m59299a, i2, i3, iArr[1], 12, -389564586);
        int m59299a3 = m59299a(i3, m59299a2, m59299a, i2, iArr[2], 17, 606105819);
        int m59299a4 = m59299a(i2, m59299a3, m59299a2, m59299a, iArr[3], 22, -1044525330);
        int m59299a5 = m59299a(m59299a, m59299a4, m59299a3, m59299a2, iArr[4], 7, -176418897);
        int m59299a6 = m59299a(m59299a2, m59299a5, m59299a4, m59299a3, iArr[5], 12, 1200080426);
        int m59299a7 = m59299a(m59299a3, m59299a6, m59299a5, m59299a4, iArr[6], 17, -1473231341);
        int m59299a8 = m59299a(m59299a4, m59299a7, m59299a6, m59299a5, iArr[7], 22, -45705983);
        int m59299a9 = m59299a(m59299a5, m59299a8, m59299a7, m59299a6, iArr[8], 7, 1770035416);
        int m59299a10 = m59299a(m59299a6, m59299a9, m59299a8, m59299a7, iArr[9], 12, -1958414417);
        int m59299a11 = m59299a(m59299a7, m59299a10, m59299a9, m59299a8, iArr[10], 17, -42063);
        int m59299a12 = m59299a(m59299a8, m59299a11, m59299a10, m59299a9, iArr[11], 22, -1990404162);
        int m59299a13 = m59299a(m59299a9, m59299a12, m59299a11, m59299a10, iArr[12], 7, 1804603682);
        int m59299a14 = m59299a(m59299a10, m59299a13, m59299a12, m59299a11, iArr[13], 12, -40341101);
        int m59299a15 = m59299a(m59299a11, m59299a14, m59299a13, m59299a12, iArr[14], 17, -1502002290);
        int m59299a16 = m59299a(m59299a12, m59299a15, m59299a14, m59299a13, iArr[15], 22, 1236535329);
        int m59288b = m59288b(m59299a13, m59299a16, m59299a15, m59299a14, iArr[1], 5, -165796510);
        int m59288b2 = m59288b(m59299a14, m59288b, m59299a16, m59299a15, iArr[6], 9, -1069501632);
        int m59288b3 = m59288b(m59299a15, m59288b2, m59288b, m59299a16, iArr[11], 14, 643717713);
        int m59288b4 = m59288b(m59299a16, m59288b3, m59288b2, m59288b, iArr[0], 20, -373897302);
        int m59288b5 = m59288b(m59288b, m59288b4, m59288b3, m59288b2, iArr[5], 5, -701558691);
        int m59288b6 = m59288b(m59288b2, m59288b5, m59288b4, m59288b3, iArr[10], 9, 38016083);
        int m59288b7 = m59288b(m59288b3, m59288b6, m59288b5, m59288b4, iArr[15], 14, -660478335);
        int m59288b8 = m59288b(m59288b4, m59288b7, m59288b6, m59288b5, iArr[4], 20, -405537848);
        int m59288b9 = m59288b(m59288b5, m59288b8, m59288b7, m59288b6, iArr[9], 5, 568446438);
        int m59288b10 = m59288b(m59288b6, m59288b9, m59288b8, m59288b7, iArr[14], 9, -1019803690);
        int m59288b11 = m59288b(m59288b7, m59288b10, m59288b9, m59288b8, iArr[3], 14, -187363961);
        int m59288b12 = m59288b(m59288b8, m59288b11, m59288b10, m59288b9, iArr[8], 20, 1163531501);
        int m59288b13 = m59288b(m59288b9, m59288b12, m59288b11, m59288b10, iArr[13], 5, -1444681467);
        int m59288b14 = m59288b(m59288b10, m59288b13, m59288b12, m59288b11, iArr[2], 9, -51403784);
        int m59288b15 = m59288b(m59288b11, m59288b14, m59288b13, m59288b12, iArr[7], 14, 1735328473);
        int m59288b16 = m59288b(m59288b12, m59288b15, m59288b14, m59288b13, iArr[12], 20, -1926607734);
        int m59283c = m59283c(m59288b13, m59288b16, m59288b15, m59288b14, iArr[5], 4, -378558);
        int m59283c2 = m59283c(m59288b14, m59283c, m59288b16, m59288b15, iArr[8], 11, -2022574463);
        int m59283c3 = m59283c(m59288b15, m59283c2, m59283c, m59288b16, iArr[11], 16, 1839030562);
        int m59283c4 = m59283c(m59288b16, m59283c3, m59283c2, m59283c, iArr[14], 23, -35309556);
        int m59283c5 = m59283c(m59283c, m59283c4, m59283c3, m59283c2, iArr[1], 4, -1530992060);
        int m59283c6 = m59283c(m59283c2, m59283c5, m59283c4, m59283c3, iArr[4], 11, 1272893353);
        int m59283c7 = m59283c(m59283c3, m59283c6, m59283c5, m59283c4, iArr[7], 16, -155497632);
        int m59283c8 = m59283c(m59283c4, m59283c7, m59283c6, m59283c5, iArr[10], 23, -1094730640);
        int m59283c9 = m59283c(m59283c5, m59283c8, m59283c7, m59283c6, iArr[13], 4, 681279174);
        int m59283c10 = m59283c(m59283c6, m59283c9, m59283c8, m59283c7, iArr[0], 11, -358537222);
        int m59283c11 = m59283c(m59283c7, m59283c10, m59283c9, m59283c8, iArr[3], 16, -722521979);
        int m59283c12 = m59283c(m59283c8, m59283c11, m59283c10, m59283c9, iArr[6], 23, 76029189);
        int m59283c13 = m59283c(m59283c9, m59283c12, m59283c11, m59283c10, iArr[9], 4, -640364487);
        int m59283c14 = m59283c(m59283c10, m59283c13, m59283c12, m59283c11, iArr[12], 11, -421815835);
        int m59283c15 = m59283c(m59283c11, m59283c14, m59283c13, m59283c12, iArr[15], 16, 530742520);
        int m59283c16 = m59283c(m59283c12, m59283c15, m59283c14, m59283c13, iArr[2], 23, -995338651);
        int m59282d = m59282d(m59283c13, m59283c16, m59283c15, m59283c14, iArr[0], 6, -198630844);
        int m59282d2 = m59282d(m59283c14, m59282d, m59283c16, m59283c15, iArr[7], 10, 1126891415);
        int m59282d3 = m59282d(m59283c15, m59282d2, m59282d, m59283c16, iArr[14], 15, -1416354905);
        int m59282d4 = m59282d(m59283c16, m59282d3, m59282d2, m59282d, iArr[5], 21, -57434055);
        int m59282d5 = m59282d(m59282d, m59282d4, m59282d3, m59282d2, iArr[12], 6, 1700485571);
        int m59282d6 = m59282d(m59282d2, m59282d5, m59282d4, m59282d3, iArr[3], 10, -1894986606);
        int m59282d7 = m59282d(m59282d3, m59282d6, m59282d5, m59282d4, iArr[10], 15, -1051523);
        int m59282d8 = m59282d(m59282d4, m59282d7, m59282d6, m59282d5, iArr[1], 21, -2054922799);
        int m59282d9 = m59282d(m59282d5, m59282d8, m59282d7, m59282d6, iArr[8], 6, 1873313359);
        int m59282d10 = m59282d(m59282d6, m59282d9, m59282d8, m59282d7, iArr[15], 10, -30611744);
        int m59282d11 = m59282d(m59282d7, m59282d10, m59282d9, m59282d8, iArr[6], 15, -1560198380);
        int m59282d12 = m59282d(m59282d8, m59282d11, m59282d10, m59282d9, iArr[13], 21, 1309151649);
        int m59282d13 = m59282d(m59282d9, m59282d12, m59282d11, m59282d10, iArr[4], 6, -145523070);
        int m59282d14 = m59282d(m59282d10, m59282d13, m59282d12, m59282d11, iArr[11], 10, -1120210379);
        int m59282d15 = m59282d(m59282d11, m59282d14, m59282d13, m59282d12, iArr[2], 15, 718787259);
        int m59282d16 = m59282d(m59282d12, m59282d15, m59282d14, m59282d13, iArr[9], 21, -343485551);
        int[] iArr2 = c19648b.f49309b;
        iArr2[0] = iArr2[0] + m59282d13;
        int[] iArr3 = c19648b.f49309b;
        iArr3[1] = iArr3[1] + m59282d16;
        int[] iArr4 = c19648b.f49309b;
        iArr4[2] = iArr4[2] + m59282d15;
        int[] iArr5 = c19648b.f49309b;
        iArr5[3] = iArr5[3] + m59282d14;
    }

    /* renamed from: a */
    public void m59294a(String str, String str2) throws UnsupportedEncodingException {
        m59286b(str.getBytes(str2));
    }

    /* renamed from: a */
    public void m59292a(byte[] bArr, int i) {
        m59285b(bArr, 0, i);
    }

    /* renamed from: a */
    public byte[] m59301a() {
        if (!this.f49306b.f49308a) {
            this.f49306b.m59272f(this.f49305a);
            long j = this.f49306b.f49310c;
            int i = (int) ((j >>> 3) & 63);
            m59297a(this.f49306b, f49304d, 0, i < 56 ? 56 - i : 120 - i);
            m59297a(this.f49306b, m59298a(j), 0, 8);
            this.f49306b.f49308a = true;
        }
        return m59290a(this.f49306b.f49309b, 16);
    }

    /* renamed from: a */
    private static byte[] m59298a(long j) {
        return new byte[]{(byte) (j & 255), (byte) ((j >>> 8) & 255), (byte) ((j >>> 16) & 255), (byte) ((j >>> 24) & 255), (byte) ((j >>> 32) & 255), (byte) ((j >>> 40) & 255), (byte) ((j >>> 48) & 255), (byte) ((j >>> 56) & 255)};
    }

    /* renamed from: a */
    private static byte[] m59290a(int[] iArr, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 4) {
            int i4 = iArr[i2];
            bArr[i3] = (byte) (i4 & 255);
            bArr[i3 + 1] = (byte) ((i4 >>> 8) & 255);
            bArr[i3 + 2] = (byte) ((i4 >>> 16) & 255);
            bArr[i3 + 3] = (byte) ((i4 >>> 24) & 255);
            i2++;
        }
        return bArr;
    }

    /* renamed from: a */
    private int[] m59291a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4 += 4) {
            this.f49307c[i3] = (bArr[i4 + i2] & 255) | ((bArr[(i4 + 1) + i2] & 255) << 8) | ((bArr[(i4 + 2) + i2] & 255) << 16) | ((bArr[(i4 + 3) + i2] & 255) << 24);
            i3++;
        }
        return this.f49307c;
    }
}

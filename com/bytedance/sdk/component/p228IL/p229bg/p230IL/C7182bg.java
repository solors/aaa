package com.bytedance.sdk.component.p228IL.p229bg.p230IL;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.IL.bg.IL.bg */
/* loaded from: classes3.dex */
public final class C7182bg implements InterfaceC7178IL, InterfaceC7181bX, Cloneable, ByteChannel {

    /* renamed from: bX */
    private static final byte[] f15483bX = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: IL */
    long f15484IL;

    /* renamed from: bg */
    C7186zx f15485bg;

    /* renamed from: IL */
    public byte m89694IL() {
        long j = this.f15484IL;
        if (j != 0) {
            C7186zx c7186zx = this.f15485bg;
            int i = c7186zx.f15494IL;
            int i2 = c7186zx.f15495bX;
            int i3 = i + 1;
            byte b = c7186zx.f15496bg[i];
            this.f15484IL = j - 1;
            if (i3 == i2) {
                this.f15485bg = c7186zx.m89664IL();
                C7185ldr.m89665bg(c7186zx);
            } else {
                c7186zx.f15494IL = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: bX */
    public String m89690bX() {
        try {
            return m89685bg(this.f15484IL, C7180WR.f15482bg);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: bg */
    public boolean m89688bg() {
        return this.f15484IL == 0;
    }

    /* renamed from: eqN */
    public C7182bg clone() {
        C7182bg c7182bg = new C7182bg();
        if (this.f15484IL == 0) {
            return c7182bg;
        }
        C7186zx m89663bg = this.f15485bg.m89663bg();
        c7182bg.f15485bg = m89663bg;
        m89663bg.f15497iR = m89663bg;
        m89663bg.ldr = m89663bg;
        C7186zx c7186zx = this.f15485bg;
        while (true) {
            c7186zx = c7186zx.ldr;
            if (c7186zx != this.f15485bg) {
                c7182bg.f15485bg.f15497iR.m89662bg(c7186zx.m89663bg());
            } else {
                c7182bg.f15484IL = this.f15484IL;
                return c7182bg;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7182bg)) {
            return false;
        }
        C7182bg c7182bg = (C7182bg) obj;
        long j = this.f15484IL;
        if (j != c7182bg.f15484IL) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C7186zx c7186zx = this.f15485bg;
        C7186zx c7186zx2 = c7182bg.f15485bg;
        int i = c7186zx.f15494IL;
        int i2 = c7186zx2.f15494IL;
        while (j2 < this.f15484IL) {
            long min = Math.min(c7186zx.f15495bX - i, c7186zx2.f15495bX - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c7186zx.f15496bg[i] != c7186zx2.f15496bg[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c7186zx.f15495bX) {
                c7186zx = c7186zx.ldr;
                i = c7186zx.f15494IL;
            }
            if (i2 == c7186zx2.f15495bX) {
                c7186zx2 = c7186zx2.ldr;
                i2 = c7186zx2.f15494IL;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        C7186zx c7186zx = this.f15485bg;
        if (c7186zx == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c7186zx.f15495bX;
            for (int i3 = c7186zx.f15494IL; i3 < i2; i3++) {
                i = (i * 31) + c7186zx.f15496bg[i3];
            }
            c7186zx = c7186zx.ldr;
        } while (c7186zx != this.f15485bg);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C7186zx c7186zx = this.f15485bg;
        if (c7186zx == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c7186zx.f15495bX - c7186zx.f15494IL);
        byteBuffer.put(c7186zx.f15496bg, c7186zx.f15494IL, min);
        int i = c7186zx.f15494IL + min;
        c7186zx.f15494IL = i;
        this.f15484IL -= min;
        if (i == c7186zx.f15495bX) {
            this.f15485bg = c7186zx.m89664IL();
            C7185ldr.m89665bg(c7186zx);
        }
        return min;
    }

    public String toString() {
        return m89679zx().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C7186zx m89689bX = m89689bX(1);
                int min = Math.min(i, 8192 - m89689bX.f15495bX);
                byteBuffer.get(m89689bX.f15496bg, m89689bX.f15495bX, min);
                i -= min;
                m89689bX.f15495bX += min;
            }
            this.f15484IL += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: zx */
    public final C7183eqN m89679zx() {
        long j = this.f15484IL;
        if (j <= 2147483647L) {
            return eqN((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f15484IL);
    }

    /* renamed from: bg */
    public String m89685bg(long j, Charset charset) throws EOFException {
        C7180WR.m89702bg(this.f15484IL, 0L, j);
        if (charset != null) {
            if (j <= 2147483647L) {
                if (j == 0) {
                    return "";
                }
                C7186zx c7186zx = this.f15485bg;
                int i = c7186zx.f15494IL;
                if (i + j > c7186zx.f15495bX) {
                    return new String(m89686bg(j), charset);
                }
                String str = new String(c7186zx.f15496bg, i, (int) j, charset);
                int i2 = (int) (c7186zx.f15494IL + j);
                c7186zx.f15494IL = i2;
                this.f15484IL -= j;
                if (i2 == c7186zx.f15495bX) {
                    this.f15485bg = c7186zx.m89664IL();
                    C7185ldr.m89665bg(c7186zx);
                }
                return str;
            }
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: bX */
    C7186zx m89689bX(int i) {
        if (i > 0 && i <= 8192) {
            C7186zx c7186zx = this.f15485bg;
            if (c7186zx == null) {
                C7186zx m89666bg = C7185ldr.m89666bg();
                this.f15485bg = m89666bg;
                m89666bg.f15497iR = m89666bg;
                m89666bg.ldr = m89666bg;
                return m89666bg;
            }
            C7186zx c7186zx2 = c7186zx.f15497iR;
            return (c7186zx2.f15495bX + i > 8192 || !c7186zx2.f15498zx) ? c7186zx2.m89662bg(C7185ldr.m89666bg()) : c7186zx2;
        }
        throw new IllegalArgumentException();
    }

    public final C7183eqN eqN(int i) {
        if (i == 0) {
            return C7183eqN.f15487bX;
        }
        return new C7184iR(this, i);
    }

    /* renamed from: IL */
    public C7182bg m89691IL(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            C7180WR.m89702bg(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C7186zx m89689bX = m89689bX(1);
                int min = Math.min(i3 - i, 8192 - m89689bX.f15495bX);
                System.arraycopy(bArr, i, m89689bX.f15496bg, m89689bX.f15495bX, min);
                i += min;
                m89689bX.f15495bX += min;
            }
            this.f15484IL += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: bg */
    public byte[] m89686bg(long j) throws EOFException {
        C7180WR.m89702bg(this.f15484IL, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            m89681bg(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    /* renamed from: bg */
    public void m89681bg(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int m89680bg = m89680bg(bArr, i, bArr.length - i);
            if (m89680bg == -1) {
                throw new EOFException();
            }
            i += m89680bg;
        }
    }

    /* renamed from: IL */
    public C7182bg m89693IL(int i) {
        C7186zx m89689bX = m89689bX(1);
        byte[] bArr = m89689bX.f15496bg;
        int i2 = m89689bX.f15495bX;
        m89689bX.f15495bX = i2 + 1;
        bArr[i2] = (byte) i;
        this.f15484IL++;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    /* renamed from: bg */
    public int m89680bg(byte[] bArr, int i, int i2) {
        C7180WR.m89702bg(bArr.length, i, i2);
        C7186zx c7186zx = this.f15485bg;
        if (c7186zx == null) {
            return -1;
        }
        int min = Math.min(i2, c7186zx.f15495bX - c7186zx.f15494IL);
        System.arraycopy(c7186zx.f15496bg, c7186zx.f15494IL, bArr, i, min);
        int i3 = c7186zx.f15494IL + min;
        c7186zx.f15494IL = i3;
        this.f15484IL -= min;
        if (i3 == c7186zx.f15495bX) {
            this.f15485bg = c7186zx.m89664IL();
            C7185ldr.m89665bg(c7186zx);
        }
        return min;
    }

    /* renamed from: IL */
    public C7182bg m89692IL(long j) {
        if (j == 0) {
            return m89693IL(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C7186zx m89689bX = m89689bX(numberOfTrailingZeros);
        byte[] bArr = m89689bX.f15496bg;
        int i = m89689bX.f15495bX;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f15483bX[(int) (15 & j)];
            j >>>= 4;
        }
        m89689bX.f15495bX += numberOfTrailingZeros;
        this.f15484IL += numberOfTrailingZeros;
        return this;
    }

    /* renamed from: bg */
    public C7182bg m89684bg(String str) {
        return m89683bg(str, 0, str.length());
    }

    /* renamed from: bg */
    public C7182bg m89683bg(String str, int i, int i2) {
        char charAt;
        if (str != null) {
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 > str.length()) {
                        throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
                    }
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C7186zx m89689bX = m89689bX(1);
                            byte[] bArr = m89689bX.f15496bg;
                            int i3 = m89689bX.f15495bX - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = m89689bX.f15495bX;
                            int i6 = (i3 + i) - i5;
                            m89689bX.f15495bX = i5 + i6;
                            this.f15484IL += i6;
                        } else {
                            if (charAt2 < 2048) {
                                m89693IL((charAt2 >> 6) | 192);
                                m89693IL((charAt2 & '?') | 128);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i7 = i + 1;
                                char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                                if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                                    int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                    m89693IL((i8 >> 18) | 240);
                                    m89693IL(((i8 >> 12) & 63) | 128);
                                    m89693IL(((i8 >> 6) & 63) | 128);
                                    m89693IL((i8 & 63) | 128);
                                    i += 2;
                                } else {
                                    m89693IL(63);
                                    i = i7;
                                }
                            } else {
                                m89693IL((charAt2 >> '\f') | 224);
                                m89693IL(((charAt2 >> 6) & 63) | 128);
                                m89693IL((charAt2 & '?') | 128);
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            }
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        throw new IllegalArgumentException("string == null");
    }

    /* renamed from: bg */
    public C7182bg m89687bg(int i) {
        if (i < 128) {
            m89693IL(i);
        } else if (i < 2048) {
            m89693IL((i >> 6) | 192);
            m89693IL((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                m89693IL(63);
            } else {
                m89693IL((i >> 12) | 224);
                m89693IL(((i >> 6) & 63) | 128);
                m89693IL((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            m89693IL((i >> 18) | 240);
            m89693IL(((i >> 12) & 63) | 128);
            m89693IL(((i >> 6) & 63) | 128);
            m89693IL((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: bg */
    public C7182bg m89682bg(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 > str.length()) {
                        throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
                    } else if (charset != null) {
                        if (charset.equals(C7180WR.f15482bg)) {
                            return m89683bg(str, i, i2);
                        }
                        byte[] bytes = str.substring(i, i2).getBytes(charset);
                        return m89691IL(bytes, 0, bytes.length);
                    } else {
                        throw new IllegalArgumentException("charset == null");
                    }
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            }
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        throw new IllegalArgumentException("string == null");
    }
}

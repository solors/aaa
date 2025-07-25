package okio;

import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p822of.C39176a;

/* compiled from: Buffer.kt */
@Metadata
/* renamed from: okio.e */
/* loaded from: classes10.dex */
public final class C39200e implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    @Nullable

    /* renamed from: b */
    public Segment f102937b;

    /* renamed from: c */
    private long f102938c;

    /* compiled from: Buffer.kt */
    @Metadata
    /* renamed from: okio.e$a */
    /* loaded from: classes10.dex */
    public static final class C39201a implements Closeable {
        @Nullable

        /* renamed from: b */
        public C39200e f102939b;
        @Nullable

        /* renamed from: c */
        private Segment f102940c;
        @Nullable

        /* renamed from: f */
        public byte[] f102942f;

        /* renamed from: d */
        public long f102941d = -1;

        /* renamed from: g */
        public int f102943g = -1;

        /* renamed from: h */
        public int f102944h = -1;

        /* renamed from: a */
        public final void m13580a(@Nullable Segment segment) {
            this.f102940c = segment;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean z;
            if (this.f102939b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f102939b = null;
                m13580a(null);
                this.f102941d = -1L;
                this.f102942f = null;
                this.f102943g = -1;
                this.f102944h = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    @Override // okio.BufferedSink
    /* renamed from: H */
    public long mo13440H(@NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: I */
    public C39200e write(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i2;
        C39189b.m13633b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment m13583w = m13583w(1);
            int min = Math.min(i3 - i, 8192 - m13583w.f103023c);
            int i4 = i + min;
            _ArraysJvm.m17398g(source, m13583w.f103021a, m13583w.f103023c, i, i4);
            m13583w.f103023c += min;
            i = i4;
        }
        m13586t(size() + j);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: K */
    public C39200e writeByte(int i) {
        Segment m13583w = m13583w(1);
        byte[] bArr = m13583w.f103021a;
        int i2 = m13583w.f103023c;
        m13583w.f103023c = i2 + 1;
        bArr[i2] = (byte) i;
        m13586t(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: M */
    public C39200e writeDecimalLong(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        Segment m13583w = m13583w(i2);
        byte[] bArr = m13583w.f103021a;
        int i3 = m13583w.f103023c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = C39176a.m13721a()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        m13583w.f103023c += i2;
        m13586t(size() + i2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: N */
    public C39200e writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment m13583w = m13583w(i);
        byte[] bArr = m13583w.f103021a;
        int i2 = m13583w.f103023c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C39176a.m13721a()[(int) (15 & j)];
            j >>>= 4;
        }
        m13583w.f103023c += i;
        m13586t(size() + i);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: O */
    public C39200e writeInt(int i) {
        Segment m13583w = m13583w(4);
        byte[] bArr = m13583w.f103021a;
        int i2 = m13583w.f103023c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        m13583w.f103023c = i5 + 1;
        m13586t(size() + 4);
        return this;
    }

    @NotNull
    /* renamed from: P */
    public C39200e m13604P(int i) {
        return writeInt(C39189b.m13629f(i));
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: Q */
    public C39200e writeShort(int i) {
        Segment m13583w = m13583w(2);
        byte[] bArr = m13583w.f103021a;
        int i2 = m13583w.f103023c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        m13583w.f103023c = i3 + 1;
        m13586t(size() + 2);
        return this;
    }

    @NotNull
    /* renamed from: R */
    public C39200e m13602R(@NotNull String string, int i, int i2, @NotNull Charset charset) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > string.length()) {
                    z3 = false;
                }
                if (z3) {
                    if (Intrinsics.m17075f(charset, Charsets.UTF_8)) {
                        return writeUtf8(string, i, i2);
                    }
                    String substring = string.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @NotNull
    /* renamed from: S */
    public C39200e m13601S(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m13602R(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: T */
    public C39200e writeUtf8(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: U */
    public C39200e writeUtf8(@NotNull String string, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        char c;
        boolean z4;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= string.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = string.charAt(i);
                        if (charAt2 < 128) {
                            Segment m13583w = m13583w(1);
                            byte[] bArr = m13583w.f103021a;
                            int i3 = m13583w.f103023c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = string.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = m13583w.f103023c;
                            int i6 = (i3 + i) - i5;
                            m13583w.f103023c = i5 + i6;
                            m13586t(size() + i6);
                        } else {
                            if (charAt2 < 2048) {
                                Segment m13583w2 = m13583w(2);
                                byte[] bArr2 = m13583w2.f103021a;
                                int i7 = m13583w2.f103023c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                m13583w2.f103023c = i7 + 2;
                                m13586t(size() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = string.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c && c < 57344) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                        Segment m13583w3 = m13583w(4);
                                        byte[] bArr3 = m13583w3.f103021a;
                                        int i10 = m13583w3.f103023c;
                                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                        m13583w3.f103023c = i10 + 4;
                                        m13586t(size() + 4);
                                        i += 2;
                                    }
                                }
                                writeByte(63);
                                i = i8;
                            } else {
                                Segment m13583w4 = m13583w(3);
                                byte[] bArr4 = m13583w4.f103021a;
                                int i11 = m13583w4.f103023c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                m13583w4.f103023c = i11 + 3;
                                m13586t(size() + 3);
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @NotNull
    /* renamed from: V */
    public C39200e m13598V(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            Segment m13583w = m13583w(2);
            byte[] bArr = m13583w.f103021a;
            int i2 = m13583w.f103023c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            m13583w.f103023c = i2 + 2;
            m13586t(size() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i < 57344) {
                z = true;
            }
            if (z) {
                writeByte(63);
            } else if (i < 65536) {
                Segment m13583w2 = m13583w(3);
                byte[] bArr2 = m13583w2.f103021a;
                int i3 = m13583w2.f103023c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                m13583w2.f103023c = i3 + 3;
                m13586t(size() + 3);
            } else if (i <= 1114111) {
                Segment m13583w3 = m13583w(4);
                byte[] bArr3 = m13583w3.f103021a;
                int i4 = m13583w3.f103023c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                m13583w3.f103023c = i4 + 4;
                m13586t(size() + 4);
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C39189b.m13625j(i));
            }
        }
        return this;
    }

    /* renamed from: b */
    public final void m13597b() {
        skip(size());
    }

    @Override // okio.BufferedSource
    /* renamed from: c */
    public long mo13424c(@NotNull C39208h bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m13589n(bytes, 0L);
    }

    @Override // okio.BufferedSource
    /* renamed from: d */
    public long mo13423d(@NotNull C39208h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return m13588r(targetBytes, 0L);
    }

    @NotNull
    /* renamed from: e */
    public C39200e clone() {
        return m13594h();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39200e) {
            C39200e c39200e = (C39200e) obj;
            if (size() == c39200e.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.f102937b;
                Intrinsics.m17074g(segment);
                Segment segment2 = c39200e.f102937b;
                Intrinsics.m17074g(segment2);
                int i = segment.f103022b;
                int i2 = segment2.f103022b;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(segment.f103023c - i, segment2.f103023c - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (segment.f103021a[i] == segment2.f103021a[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == segment.f103023c) {
                        segment = segment.f103026f;
                        Intrinsics.m17074g(segment);
                        i = segment.f103022b;
                    }
                    if (i2 == segment2.f103023c) {
                        segment2 = segment2.f103026f;
                        Intrinsics.m17074g(segment2);
                        i2 = segment2.f103022b;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (this.f102938c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m13595f() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.f102937b;
        Intrinsics.m17074g(segment);
        Segment segment2 = segment.f103027g;
        Intrinsics.m17074g(segment2);
        int i = segment2.f103023c;
        if (i < 8192 && segment2.f103025e) {
            size -= i - segment2.f103022b;
        }
        return size;
    }

    @NotNull
    /* renamed from: h */
    public final C39200e m13594h() {
        C39200e c39200e = new C39200e();
        if (size() != 0) {
            Segment segment = this.f102937b;
            Intrinsics.m17074g(segment);
            Segment m13413d = segment.m13413d();
            c39200e.f102937b = m13413d;
            m13413d.f103027g = m13413d;
            m13413d.f103026f = m13413d;
            for (Segment segment2 = segment.f103026f; segment2 != segment; segment2 = segment2.f103026f) {
                Segment segment3 = m13413d.f103027g;
                Intrinsics.m17074g(segment3);
                Intrinsics.m17074g(segment2);
                segment3.m13414c(segment2.m13413d());
            }
            c39200e.m13586t(size());
        }
        return c39200e;
    }

    public int hashCode() {
        Segment segment = this.f102937b;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.f103023c;
            for (int i3 = segment.f103022b; i3 < i2; i3++) {
                i = (i * 31) + segment.f103021a[i3];
            }
            segment = segment.f103026f;
            Intrinsics.m17074g(segment);
        } while (segment != this.f102937b);
        return i;
    }

    @NotNull
    /* renamed from: i */
    public final C39200e m13593i(@NotNull C39200e out, long j, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        C39189b.m13633b(size(), j, j2);
        if (j2 != 0) {
            out.m13586t(out.size() + j2);
            Segment segment = this.f102937b;
            while (true) {
                Intrinsics.m17074g(segment);
                int i = segment.f103023c;
                int i2 = segment.f103022b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                segment = segment.f103026f;
            }
            while (j2 > 0) {
                Intrinsics.m17074g(segment);
                Segment m13413d = segment.m13413d();
                int i3 = m13413d.f103022b + ((int) j);
                m13413d.f103022b = i3;
                m13413d.f103023c = Math.min(i3 + ((int) j2), m13413d.f103023c);
                Segment segment2 = out.f102937b;
                if (segment2 == null) {
                    m13413d.f103027g = m13413d;
                    m13413d.f103026f = m13413d;
                    out.f102937b = m13413d;
                } else {
                    Intrinsics.m17074g(segment2);
                    Segment segment3 = segment2.f103027g;
                    Intrinsics.m17074g(segment3);
                    segment3.m13414c(m13413d);
                }
                j2 -= m13413d.f103023c - m13413d.f103022b;
                segment = segment.f103026f;
                j = 0;
            }
        }
        return this;
    }

    public long indexOf(byte b, long j, long j2) {
        Segment segment;
        int i;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (segment = this.f102937b) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    segment = segment.f103027g;
                    Intrinsics.m17074g(segment);
                    j3 -= segment.f103023c - segment.f103022b;
                }
                while (j3 < j2) {
                    byte[] bArr = segment.f103021a;
                    int min = (int) Math.min(segment.f103023c, (segment.f103022b + j2) - j3);
                    i = (int) ((segment.f103022b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += segment.f103023c - segment.f103022b;
                    segment = segment.f103026f;
                    Intrinsics.m17074g(segment);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (segment.f103023c - segment.f103022b) + j3;
                if (j4 > j) {
                    break;
                }
                segment = segment.f103026f;
                Intrinsics.m17074g(segment);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = segment.f103021a;
                int min2 = (int) Math.min(segment.f103023c, (segment.f103022b + j2) - j3);
                i = (int) ((segment.f103022b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i++;
                    }
                }
                j3 += segment.f103023c - segment.f103022b;
                segment = segment.f103026f;
                Intrinsics.m17074g(segment);
                j = j3;
            }
            return -1L;
            return (i - segment.f103022b) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new C39202b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.BufferedSource
    /* renamed from: j */
    public boolean mo13421j(long j, @NotNull C39208h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m13587s(j, bytes, 0, bytes.m13569C());
    }

    /* renamed from: m */
    public final byte m13590m(long j) {
        C39189b.m13633b(size(), j, 1L);
        Segment segment = this.f102937b;
        if (segment != null) {
            if (size() - j < j) {
                long size = size();
                while (size > j) {
                    segment = segment.f103027g;
                    Intrinsics.m17074g(segment);
                    size -= segment.f103023c - segment.f103022b;
                }
                Intrinsics.m17074g(segment);
                return segment.f103021a[(int) ((segment.f103022b + j) - size)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (segment.f103023c - segment.f103022b) + j2;
                if (j3 <= j) {
                    segment = segment.f103026f;
                    Intrinsics.m17074g(segment);
                    j2 = j3;
                } else {
                    Intrinsics.m17074g(segment);
                    return segment.f103021a[(int) ((segment.f103022b + j) - j2)];
                }
            }
        } else {
            Intrinsics.m17074g(null);
            throw null;
        }
    }

    /* renamed from: n */
    public long m13589n(@NotNull C39208h bytes, long j) throws IOException {
        boolean z;
        boolean z2;
        long j2 = j;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.m13569C() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Segment segment = this.f102937b;
                if (segment != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            segment = segment.f103027g;
                            Intrinsics.m17074g(segment);
                            size -= segment.f103023c - segment.f103022b;
                        }
                        byte[] mo13393p = bytes.mo13393p();
                        byte b = mo13393p[0];
                        int m13569C = bytes.m13569C();
                        long size2 = (size() - m13569C) + 1;
                        while (size < size2) {
                            byte[] bArr = segment.f103021a;
                            long j4 = size;
                            int min = (int) Math.min(segment.f103023c, (segment.f103022b + size2) - size);
                            for (int i = (int) ((segment.f103022b + j2) - j4); i < min; i++) {
                                if (bArr[i] == b && C39176a.m13720b(segment, i + 1, mo13393p, 1, m13569C)) {
                                    return (i - segment.f103022b) + j4;
                                }
                            }
                            size = j4 + (segment.f103023c - segment.f103022b);
                            segment = segment.f103026f;
                            Intrinsics.m17074g(segment);
                            j2 = size;
                        }
                    } else {
                        while (true) {
                            long j5 = (segment.f103023c - segment.f103022b) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            segment = segment.f103026f;
                            Intrinsics.m17074g(segment);
                            j3 = j5;
                        }
                        byte[] mo13393p2 = bytes.mo13393p();
                        byte b2 = mo13393p2[0];
                        int m13569C2 = bytes.m13569C();
                        long size3 = (size() - m13569C2) + 1;
                        while (j3 < size3) {
                            byte[] bArr2 = segment.f103021a;
                            long j6 = size3;
                            int min2 = (int) Math.min(segment.f103023c, (segment.f103022b + size3) - j3);
                            for (int i2 = (int) ((segment.f103022b + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2 && C39176a.m13720b(segment, i2 + 1, mo13393p2, 1, m13569C2)) {
                                    return (i2 - segment.f103022b) + j3;
                                }
                            }
                            j3 += segment.f103023c - segment.f103022b;
                            segment = segment.f103026f;
                            Intrinsics.m17074g(segment);
                            j2 = j3;
                            size3 = j6;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // okio.BufferedSource
    /* renamed from: o */
    public long mo13420o(@NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return C39217m0.m13507d(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    /* renamed from: q */
    public int mo13419q(@NotNull Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int m13717e = C39176a.m13717e(this, options, false, 2, null);
        if (m13717e == -1) {
            return -1;
        }
        skip(options.m13481d()[m13717e].m13569C());
        return m13717e;
    }

    /* renamed from: r */
    public long m13588r(@NotNull C39208h targetBytes, long j) {
        boolean z;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Segment segment = this.f102937b;
            if (segment == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    segment = segment.f103027g;
                    Intrinsics.m17074g(segment);
                    j2 -= segment.f103023c - segment.f103022b;
                }
                if (targetBytes.m13569C() == 2) {
                    byte m13562g = targetBytes.m13562g(0);
                    byte m13562g2 = targetBytes.m13562g(1);
                    while (j2 < size()) {
                        byte[] bArr = segment.f103021a;
                        i = (int) ((segment.f103022b + j) - j2);
                        int i3 = segment.f103023c;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (b != m13562g && b != m13562g2) {
                                i++;
                            }
                            i2 = segment.f103022b;
                        }
                        j2 += segment.f103023c - segment.f103022b;
                        segment = segment.f103026f;
                        Intrinsics.m17074g(segment);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] mo13393p = targetBytes.mo13393p();
                while (j2 < size()) {
                    byte[] bArr2 = segment.f103021a;
                    i = (int) ((segment.f103022b + j) - j2);
                    int i4 = segment.f103023c;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        for (byte b3 : mo13393p) {
                            if (b2 == b3) {
                                i2 = segment.f103022b;
                            }
                        }
                        i++;
                    }
                    j2 += segment.f103023c - segment.f103022b;
                    segment = segment.f103026f;
                    Intrinsics.m17074g(segment);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (segment.f103023c - segment.f103022b) + j2;
                if (j3 > j) {
                    break;
                }
                segment = segment.f103026f;
                Intrinsics.m17074g(segment);
                j2 = j3;
            }
            if (targetBytes.m13569C() == 2) {
                byte m13562g3 = targetBytes.m13562g(0);
                byte m13562g4 = targetBytes.m13562g(1);
                while (j2 < size()) {
                    byte[] bArr3 = segment.f103021a;
                    i = (int) ((segment.f103022b + j) - j2);
                    int i5 = segment.f103023c;
                    while (i < i5) {
                        byte b4 = bArr3[i];
                        if (b4 != m13562g3 && b4 != m13562g4) {
                            i++;
                        }
                        i2 = segment.f103022b;
                    }
                    j2 += segment.f103023c - segment.f103022b;
                    segment = segment.f103026f;
                    Intrinsics.m17074g(segment);
                    j = j2;
                }
                return -1L;
            }
            byte[] mo13393p2 = targetBytes.mo13393p();
            while (j2 < size()) {
                byte[] bArr4 = segment.f103021a;
                i = (int) ((segment.f103022b + j) - j2);
                int i6 = segment.f103023c;
                while (i < i6) {
                    byte b5 = bArr4[i];
                    for (byte b6 : mo13393p2) {
                        if (b5 == b6) {
                            i2 = segment.f103022b;
                        }
                    }
                    i++;
                }
                j2 += segment.f103023c - segment.f103022b;
                segment = segment.f103026f;
                Intrinsics.m17074g(segment);
                j = j2;
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Segment segment = this.f102937b;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), segment.f103023c - segment.f103022b);
        sink.put(segment.f103021a, segment.f103022b, min);
        int i = segment.f103022b + min;
        segment.f103022b = i;
        this.f102938c -= min;
        if (i == segment.f103023c) {
            this.f102937b = segment.m13415b();
            SegmentPool.m13408b(segment);
        }
        return min;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() != 0) {
            Segment segment = this.f102937b;
            Intrinsics.m17074g(segment);
            int i = segment.f103022b;
            int i2 = segment.f103023c;
            int i3 = i + 1;
            byte b = segment.f103021a[i];
            m13586t(size() - 1);
            if (i3 == i2) {
                this.f102937b = segment.m13415b();
                SegmentPool.m13408b(segment);
            } else {
                segment.f103022b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public C39208h readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x009b, code lost:
        m13586t(size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00a4, code lost:
        if (r2 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a6, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a8, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00a9, code lost:
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00b3, code lost:
        if (size() == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00b5, code lost:
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00b7, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ba, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00df, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + okio.C39189b.m13626i(m13590m(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00e5, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e6, code lost:
        if (r2 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00ea, code lost:
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
        return r8;
     */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C39200e.readDecimalLong():long");
    }

    public void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00aa A[EDGE_INSN: B:92:0x00aa->B:87:0x00aa ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb4
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.w0 r6 = r14.f102937b
            kotlin.jvm.internal.Intrinsics.m17074g(r6)
            byte[] r7 = r6.f103021a
            int r8 = r6.f103022b
            int r9 = r6.f103023c
        L18:
            if (r8 >= r9) goto L96
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3f
        L27:
            r11 = 97
            if (r10 < r11) goto L34
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L34
            int r11 = r10 + (-97)
        L31:
            int r11 = r11 + 10
            goto L3f
        L34:
            r11 = 65
            if (r10 < r11) goto L77
            r11 = 70
            if (r10 > r11) goto L77
            int r11 = r10 + (-65)
            goto L31
        L3f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4f:
            okio.e r0 = new okio.e
            r0.<init>()
            okio.e r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L77:
            if (r0 == 0) goto L7b
            r1 = 1
            goto L96
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.C39189b.m13626i(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            if (r8 != r9) goto La2
            okio.w0 r7 = r6.m13415b()
            r14.f102937b = r7
            okio.SegmentPool.m13408b(r6)
            goto La4
        La2:
            r6.f103022b = r8
        La4:
            if (r1 != 0) goto Laa
            okio.w0 r6 = r14.f102937b
            if (r6 != 0) goto Ld
        Laa:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m13586t(r1)
            return r4
        Lb4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C39200e.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() >= 4) {
            Segment segment = this.f102937b;
            Intrinsics.m17074g(segment);
            int i = segment.f103022b;
            int i2 = segment.f103023c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.f103021a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            m13586t(size() - 4);
            if (i8 == i2) {
                this.f102937b = segment.m13415b();
                SegmentPool.m13408b(segment);
            } else {
                segment.f103022b = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return C39189b.m13629f(readInt());
    }

    public long readLong() throws EOFException {
        if (size() >= 8) {
            Segment segment = this.f102937b;
            Intrinsics.m17074g(segment);
            int i = segment.f103022b;
            int i2 = segment.f103023c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = segment.f103021a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            m13586t(size() - 8);
            if (i10 == i2) {
                this.f102937b = segment.m13415b();
                SegmentPool.m13408b(segment);
            } else {
                segment.f103022b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return C39189b.m13628g(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() >= 2) {
            Segment segment = this.f102937b;
            Intrinsics.m17074g(segment);
            int i = segment.f103022b;
            int i2 = segment.f103023c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.f103021a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            m13586t(size() - 2);
            if (i4 == i2) {
                this.f102937b = segment.m13415b();
                SegmentPool.m13408b(segment);
            } else {
                segment.f103022b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return C39189b.m13627h(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.f102938c, charset);
    }

    @NotNull
    public String readUtf8() {
        return readString(this.f102938c, Charsets.UTF_8);
    }

    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i2;
        int i3;
        if (size() != 0) {
            byte m13590m = m13590m(0L);
            boolean z = false;
            if ((m13590m & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                i = m13590m & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((m13590m & 224) == 192) {
                i = m13590m & 31;
                i2 = 2;
                i3 = 128;
            } else if ((m13590m & 240) == 224) {
                i = m13590m & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((m13590m & 248) == 240) {
                i = m13590m & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j = i2;
            if (size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte m13590m2 = m13590m(j2);
                    if ((m13590m2 & 192) == 128) {
                        i = (i << 6) | (m13590m2 & 63);
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return 65533;
                }
                if (55296 <= i && i < 57344) {
                    z = true;
                }
                if (z || i < i3) {
                    return 65533;
                }
                return i;
            }
            throw new EOFException("size < " + i2 + ": " + size() + " (to read code point prefixed 0x" + C39189b.m13626i(m13590m) + ')');
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        if (this.f102938c >= j) {
            return true;
        }
        return false;
    }

    @Override // okio.BufferedSource
    public void require(long j) throws EOFException {
        if (this.f102938c >= j) {
            return;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public boolean m13587s(long j, @NotNull C39208h bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || bytes.m13569C() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m13590m(i3 + j) != bytes.m13562g(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final long size() {
        return this.f102938c;
    }

    @Override // okio.BufferedSource
    public void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.f102937b;
            if (segment != null) {
                int min = (int) Math.min(j, segment.f103023c - segment.f103022b);
                long j2 = min;
                m13586t(size() - j2);
                j -= j2;
                int i = segment.f103022b + min;
                segment.f103022b = i;
                if (i == segment.f103023c) {
                    this.f102937b = segment.m13415b();
                    SegmentPool.m13408b(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public final void m13586t(long j) {
        this.f102938c = j;
    }

    @Override // okio.Source
    @NotNull
    public C39196c1 timeout() {
        return C39196c1.NONE;
    }

    @NotNull
    public String toString() {
        return m13585u().toString();
    }

    @NotNull
    /* renamed from: u */
    public final C39208h m13585u() {
        boolean z;
        if (size() <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m13584v((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @NotNull
    /* renamed from: v */
    public final C39208h m13584v(int i) {
        if (i == 0) {
            return C39208h.f102953g;
        }
        C39189b.m13633b(size(), 0L, i);
        Segment segment = this.f102937b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.m17074g(segment);
            int i5 = segment.f103023c;
            int i6 = segment.f103022b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                segment = segment.f103026f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.f102937b;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.m17074g(segment2);
            bArr[i7] = segment2.f103021a;
            i2 += segment2.f103023c - segment2.f103022b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.f103022b;
            segment2.f103024d = true;
            i7++;
            segment2 = segment2.f103026f;
        }
        return new C39231y0(bArr, iArr);
    }

    @NotNull
    /* renamed from: w */
    public final Segment m13583w(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            Segment segment = this.f102937b;
            if (segment == null) {
                Segment m13407c = SegmentPool.m13407c();
                this.f102937b = m13407c;
                m13407c.f103027g = m13407c;
                m13407c.f103026f = m13407c;
                return m13407c;
            }
            Intrinsics.m17074g(segment);
            Segment segment2 = segment.f103027g;
            Intrinsics.m17074g(segment2);
            if (segment2.f103023c + i <= 8192 && segment2.f103025e) {
                return segment2;
            }
            return segment2.m13414c(SegmentPool.m13407c());
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: x */
    public C39200e mo13441E(@NotNull C39208h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.mo13403I(this, 0, byteString.m13569C());
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: y */
    public C39200e write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    /* compiled from: Buffer.kt */
    @Metadata
    /* renamed from: okio.e$b */
    /* loaded from: classes10.dex */
    public static final class C39202b extends InputStream {
        C39202b() {
            C39200e.this = r1;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C39200e.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C39200e.this.size() > 0) {
                return C39200e.this.readByte() & 255;
            }
            return -1;
        }

        @NotNull
        public String toString() {
            return C39200e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] sink, int i, int i2) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C39200e.this.read(sink, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (size() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public C39208h readByteString(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (size() >= j) {
                if (j >= 4096) {
                    C39208h m13584v = m13584v((int) j);
                    skip(j);
                    return m13584v;
                }
                return new C39208h(readByteArray(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @NotNull
    public String readString(long j, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.f102938c >= j) {
                if (i == 0) {
                    return "";
                }
                Segment segment = this.f102937b;
                Intrinsics.m17074g(segment);
                int i2 = segment.f103022b;
                if (i2 + j > segment.f103023c) {
                    return new String(readByteArray(j), charset);
                }
                int i3 = (int) j;
                String str = new String(segment.f103021a, i2, i3, charset);
                int i4 = segment.f103022b + i3;
                segment.f103022b = i4;
                this.f102938c -= j;
                if (i4 == segment.f103023c) {
                    this.f102937b = segment.m13415b();
                    SegmentPool.m13408b(segment);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j) throws EOFException {
        return readString(j, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j) throws EOFException {
        if (j >= 0) {
            long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
            long indexOf = indexOf((byte) 10, 0L, j2);
            if (indexOf != -1) {
                return C39176a.m13719c(this, indexOf);
            }
            if (j2 < size() && m13590m(j2 - 1) == 13 && m13590m(j2) == 10) {
                return C39176a.m13719c(this, j2);
            }
            C39200e c39200e = new C39200e();
            m13593i(c39200e, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + c39200e.readByteString().mo13395l() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            Segment m13583w = m13583w(1);
            int min = Math.min(i, 8192 - m13583w.f103023c);
            source.get(m13583w.f103021a, m13583w.f103023c, min);
            i -= min;
            m13583w.f103023c += min;
        }
        this.f102938c += remaining;
        return remaining;
    }

    public int read(@NotNull byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C39189b.m13633b(sink.length, i, i2);
        Segment segment = this.f102937b;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.f103023c - segment.f103022b);
        byte[] bArr = segment.f103021a;
        int i3 = segment.f103022b;
        _ArraysJvm.m17398g(bArr, sink, i, i3, i3 + min);
        segment.f103022b += min;
        m13586t(size() - min);
        if (segment.f103022b == segment.f103023c) {
            this.f102937b = segment.m13415b();
            SegmentPool.m13408b(segment);
        }
        return min;
    }

    @Override // okio.Sink
    public void write(@NotNull C39200e source, long j) {
        Segment segment;
        Segment segment2;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            C39189b.m13633b(source.size(), 0L, j);
            while (j > 0) {
                Segment segment3 = source.f102937b;
                Intrinsics.m17074g(segment3);
                int i = segment3.f103023c;
                Intrinsics.m17074g(source.f102937b);
                if (j < i - segment.f103022b) {
                    Segment segment4 = this.f102937b;
                    if (segment4 != null) {
                        Intrinsics.m17074g(segment4);
                        segment2 = segment4.f103027g;
                    } else {
                        segment2 = null;
                    }
                    if (segment2 != null && segment2.f103025e) {
                        if ((segment2.f103023c + j) - (segment2.f103024d ? 0 : segment2.f103022b) <= 8192) {
                            Segment segment5 = source.f102937b;
                            Intrinsics.m17074g(segment5);
                            segment5.m13411f(segment2, (int) j);
                            source.m13586t(source.size() - j);
                            m13586t(size() + j);
                            return;
                        }
                    }
                    Segment segment6 = source.f102937b;
                    Intrinsics.m17074g(segment6);
                    source.f102937b = segment6.m13412e((int) j);
                }
                Segment segment7 = source.f102937b;
                Intrinsics.m17074g(segment7);
                long j2 = segment7.f103023c - segment7.f103022b;
                source.f102937b = segment7.m13415b();
                Segment segment8 = this.f102937b;
                if (segment8 == null) {
                    this.f102937b = segment7;
                    segment7.f103027g = segment7;
                    segment7.f103026f = segment7;
                } else {
                    Intrinsics.m17074g(segment8);
                    Segment segment9 = segment8.f103027g;
                    Intrinsics.m17074g(segment9);
                    segment9.m13414c(segment7).m13416a();
                }
                source.m13586t(source.size() - j2);
                m13586t(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // okio.Source
    public long read(@NotNull C39200e sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j >= 0) {
            if (size() == 0) {
                return -1L;
            }
            if (j > size()) {
                j = size();
            }
            sink.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public C39200e buffer() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: k */
    public C39200e emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    /* renamed from: l */
    public C39200e emitCompleteSegments() {
        return this;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    /* renamed from: z */
    public C39200e mo13418z() {
        return this;
    }
}

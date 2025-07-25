package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ReaderInputStream */
/* loaded from: classes4.dex */
final class ReaderInputStream extends InputStream {

    /* renamed from: b */
    private final Reader f41320b;

    /* renamed from: c */
    private final CharsetEncoder f41321c;

    /* renamed from: d */
    private final byte[] f41322d;

    /* renamed from: f */
    private CharBuffer f41323f;

    /* renamed from: g */
    private ByteBuffer f41324g;

    /* renamed from: h */
    private boolean f41325h;

    /* renamed from: i */
    private boolean f41326i;

    /* renamed from: j */
    private boolean f41327j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderInputStream(Reader reader, Charset charset, int i) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i);
    }

    /* renamed from: a */
    private static int m68209a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    /* renamed from: b */
    private int m68208b(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f41324g.remaining());
        this.f41324g.get(bArr, i, min);
        return min;
    }

    /* renamed from: e */
    private static CharBuffer m68207e(CharBuffer charBuffer) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        Java8Compatibility.m68218d(wrap, charBuffer.position());
        Java8Compatibility.m68219c(wrap, charBuffer.limit());
        return wrap;
    }

    /* renamed from: f */
    private void m68206f() throws IOException {
        if (m68209a(this.f41323f) == 0) {
            if (this.f41323f.position() > 0) {
                Java8Compatibility.m68220b(this.f41323f.compact());
            } else {
                this.f41323f = m68207e(this.f41323f);
            }
        }
        int limit = this.f41323f.limit();
        int read = this.f41320b.read(this.f41323f.array(), limit, m68209a(this.f41323f));
        if (read == -1) {
            this.f41325h = true;
        } else {
            Java8Compatibility.m68219c(this.f41323f, limit + read);
        }
    }

    /* renamed from: h */
    private void m68205h(boolean z) {
        Java8Compatibility.m68220b(this.f41324g);
        if (z && this.f41324g.remaining() == 0) {
            this.f41324g = ByteBuffer.allocate(this.f41324g.capacity() * 2);
        } else {
            this.f41326i = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41320b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f41322d) == 1) {
            return UnsignedBytes.toInt(this.f41322d[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r2 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return r2;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.Preconditions.checkPositionIndexes(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f41325h
            r2 = r0
        Ld:
            boolean r3 = r7.f41326i
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.m68208b(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f41327j
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f41326i = r0
            java.nio.ByteBuffer r3 = r7.f41324g
            com.google.common.p384io.Java8Compatibility.m68221a(r3)
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = -1
        L2d:
            return r2
        L2e:
            boolean r3 = r7.f41327j
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f41321c
            java.nio.ByteBuffer r4 = r7.f41324g
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f41321c
            java.nio.CharBuffer r4 = r7.f41323f
            java.nio.ByteBuffer r5 = r7.f41324g
            boolean r6 = r7.f41325h
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.m68205h(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f41327j = r5
            r7.m68205h(r0)
            goto Ld
        L65:
            boolean r3 = r7.f41325h
            if (r3 == 0) goto L6b
            r1 = r5
            goto L2e
        L6b:
            r7.m68206f()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p384io.ReaderInputStream.read(byte[], int, int):int");
    }

    ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.f41322d = new byte[1];
        this.f41320b = (Reader) Preconditions.checkNotNull(reader);
        this.f41321c = (CharsetEncoder) Preconditions.checkNotNull(charsetEncoder);
        Preconditions.checkArgument(i > 0, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        CharBuffer allocate = CharBuffer.allocate(i);
        this.f41323f = allocate;
        Java8Compatibility.m68220b(allocate);
        this.f41324g = ByteBuffer.allocate(i);
    }
}

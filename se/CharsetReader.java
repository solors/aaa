package se;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: se.q */
/* loaded from: classes8.dex */
public final class CharsetReader {
    @NotNull

    /* renamed from: a */
    private final InputStream f111875a;
    @NotNull

    /* renamed from: b */
    private final Charset f111876b;
    @NotNull

    /* renamed from: c */
    private final CharsetDecoder f111877c;
    @NotNull

    /* renamed from: d */
    private final ByteBuffer f111878d;

    /* renamed from: e */
    private boolean f111879e;

    /* renamed from: f */
    private char f111880f;

    public CharsetReader(@NotNull InputStream inputStream, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f111875a = inputStream;
        this.f111876b = charset;
        CharsetDecoder onUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        Intrinsics.checkNotNullExpressionValue(onUnmappableCharacter, "charset.newDecoder()\n   …odingErrorAction.REPLACE)");
        this.f111877c = onUnmappableCharacter;
        ByteBuffer wrap = ByteBuffer.wrap(C42706j.f111846c.m6763d());
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(ByteArrayPool8k.take())");
        this.f111878d = wrap;
        Intrinsics.m17073h(wrap, "null cannot be cast to non-null type java.nio.Buffer");
        wrap.flip();
    }

    /* renamed from: a */
    private final int m6706a(char[] cArr, int i, int i2) {
        CharBuffer wrap = CharBuffer.wrap(cArr, i, i2);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z = false;
        while (true) {
            CoderResult decode = this.f111877c.decode(this.f111878d, wrap, z);
            if (decode.isUnderflow()) {
                if (z || !wrap.hasRemaining()) {
                    break;
                } else if (m6705b() < 0) {
                    if (wrap.position() == 0 && !this.f111878d.hasRemaining()) {
                        z = true;
                        break;
                    }
                    this.f111877c.reset();
                    z = true;
                } else {
                    continue;
                }
            } else if (decode.isOverflow()) {
                wrap.position();
                break;
            } else {
                decode.throwException();
            }
        }
        if (z) {
            this.f111877c.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }

    /* renamed from: b */
    private final int m6705b() {
        int i;
        this.f111878d.compact();
        try {
            int limit = this.f111878d.limit();
            int position = this.f111878d.position();
            if (position <= limit) {
                i = limit - position;
            } else {
                i = 0;
            }
            int read = this.f111875a.read(this.f111878d.array(), this.f111878d.arrayOffset() + position, i);
            if (read < 0) {
                return read;
            }
            ByteBuffer byteBuffer = (ByteBuffer) this.f111878d.position(position + read);
            ByteBuffer byteBuffer2 = this.f111878d;
            Intrinsics.m17073h(byteBuffer2, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer2.flip();
            return this.f111878d.remaining();
        } finally {
            ByteBuffer byteBuffer3 = this.f111878d;
            Intrinsics.m17073h(byteBuffer3, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer3.flip();
        }
    }

    /* renamed from: c */
    private final int m6704c() {
        if (this.f111879e) {
            this.f111879e = false;
            return this.f111880f;
        }
        char[] cArr = new char[2];
        int m6703d = m6703d(cArr, 0, 2);
        if (m6703d == -1) {
            return -1;
        }
        if (m6703d != 1) {
            if (m6703d == 2) {
                this.f111880f = cArr[1];
                this.f111879e = true;
                return cArr[0];
            }
            throw new IllegalStateException(("Unreachable state: " + m6703d).toString());
        }
        return cArr[0];
    }

    /* renamed from: d */
    public final int m6703d(@NotNull char[] array, int i, int i2) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(array, "array");
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i >= 0 && i < array.length) {
            z = true;
        } else {
            z = false;
        }
        if (z && i2 >= 0 && i + i2 <= array.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.f111879e) {
                array[i] = this.f111880f;
                i++;
                i2--;
                this.f111879e = false;
                if (i2 == 0) {
                    return 1;
                }
                i3 = 1;
            }
            if (i2 == 1) {
                int m6704c = m6704c();
                if (m6704c == -1) {
                    if (i3 == 0) {
                        return -1;
                    }
                    return i3;
                }
                array[i] = (char) m6704c;
                return i3 + 1;
            }
            return m6706a(array, i, i2) + i3;
        }
        throw new IllegalArgumentException(("Unexpected arguments: " + i + ", " + i2 + ", " + array.length).toString());
    }

    /* renamed from: e */
    public final void m6702e() {
        C42706j c42706j = C42706j.f111846c;
        byte[] array = this.f111878d.array();
        Intrinsics.checkNotNullExpressionValue(array, "byteBuffer.array()");
        c42706j.m6764c(array);
    }
}

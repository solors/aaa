package p1000uc;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tc.MemoryJvm;
import vc.C44557a;
import vc.Input;

@Metadata
/* renamed from: uc.a */
/* loaded from: classes9.dex */
public final class CharsetJVM {

    /* renamed from: a */
    private static final CharBuffer f116730a = CharBuffer.allocate(0);
    @NotNull

    /* renamed from: b */
    private static final ByteBuffer f116731b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        Intrinsics.m17074g(allocate);
        f116731b = allocate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed".toString());
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m2881a(@org.jetbrains.annotations.NotNull java.nio.charset.CharsetDecoder r11, @org.jetbrains.annotations.NotNull vc.Input r12, @org.jetbrains.annotations.NotNull java.lang.Appendable r13, int r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1000uc.CharsetJVM.m2881a(java.nio.charset.CharsetDecoder, vc.m, java.lang.Appendable, int):int");
    }

    @NotNull
    /* renamed from: b */
    public static final String m2880b(@NotNull CharsetDecoder charsetDecoder, @NotNull Input input, int i) {
        Intrinsics.checkNotNullParameter(charsetDecoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (i == 0) {
            return "";
        }
        if (input.m2458M() - input.m2456O() >= i) {
            if (input.m2457N().hasArray()) {
                ByteBuffer m2457N = input.m2457N();
                byte[] array = m2457N.array();
                Intrinsics.checkNotNullExpressionValue(array, "bb.array()");
                Charset charset = charsetDecoder.charset();
                Intrinsics.checkNotNullExpressionValue(charset, "charset()");
                String str = new String(array, m2457N.arrayOffset() + m2457N.position() + input.m2459K().m2509h(), i, charset);
                input.m2427m(i);
                return str;
            }
            return m2879c(charsetDecoder, input, i);
        }
        return m2878d(charsetDecoder, input, i);
    }

    /* renamed from: c */
    private static final String m2879c(CharsetDecoder charsetDecoder, Input input, int i) {
        CharBuffer allocate = CharBuffer.allocate(i);
        ByteBuffer m3119d = MemoryJvm.m3119d(input.m2457N(), input.m2459K().m2509h(), i);
        CoderResult rc = charsetDecoder.decode(m3119d, allocate, true);
        if (rc.isMalformed() || rc.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(rc, "rc");
            m2872j(rc);
        }
        allocate.flip();
        input.m2427m(m3119d.position());
        String charBuffer = allocate.toString();
        Intrinsics.checkNotNullExpressionValue(charBuffer, "cb.toString()");
        return charBuffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
        throw new java.lang.IllegalStateException("Buffer's limit change is not allowed".toString());
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String m2878d(java.nio.charset.CharsetDecoder r17, vc.Input r18, int r19) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1000uc.CharsetJVM.m2878d(java.nio.charset.CharsetDecoder, vc.m, int):java.lang.String");
    }

    /* renamed from: e */
    public static final boolean m2877e(@NotNull CharsetEncoder charsetEncoder, @NotNull C44557a dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer m2510g = dst.m2510g();
        int m2507j = dst.m2507j();
        int m2511f = dst.m2511f() - m2507j;
        ByteBuffer m3119d = MemoryJvm.m3119d(m2510g, m2507j, m2511f);
        boolean z = true;
        CoderResult result = charsetEncoder.encode(f116730a, m3119d, true);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            m2872j(result);
        }
        boolean isUnderflow = result.isUnderflow();
        if (m3119d.limit() != m2511f) {
            z = false;
        }
        if (z) {
            dst.m2516a(m3119d.position());
            return isUnderflow;
        }
        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
    }

    /* renamed from: f */
    public static final int m2876f(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i, int i2, @NotNull C44557a dst) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(dst, "dst");
        CharBuffer wrap = CharBuffer.wrap(input, i, i2);
        int remaining = wrap.remaining();
        ByteBuffer m2510g = dst.m2510g();
        int m2507j = dst.m2507j();
        int m2511f = dst.m2511f() - m2507j;
        ByteBuffer m3119d = MemoryJvm.m3119d(m2510g, m2507j, m2511f);
        boolean z = false;
        CoderResult result = charsetEncoder.encode(wrap, m3119d, false);
        if (result.isMalformed() || result.isUnmappable()) {
            Intrinsics.checkNotNullExpressionValue(result, "result");
            m2872j(result);
        }
        if (m3119d.limit() == m2511f) {
            z = true;
        }
        if (z) {
            dst.m2516a(m3119d.position());
            return remaining - wrap.remaining();
        }
        throw new IllegalStateException("Buffer's limit change is not allowed".toString());
    }

    @NotNull
    /* renamed from: g */
    public static final byte[] m2875g(@NotNull CharsetEncoder charsetEncoder, @NotNull CharSequence input, int i, int i2) {
        Intrinsics.checkNotNullParameter(charsetEncoder, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof String) {
            if (i == 0 && i2 == input.length()) {
                byte[] bytes = ((String) input).getBytes(charsetEncoder.charset());
                Intrinsics.checkNotNullExpressionValue(bytes, "input as java.lang.String).getBytes(charset())");
                return bytes;
            }
            String substring = ((String) input).substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Intrinsics.m17073h(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
            Intrinsics.checkNotNullExpressionValue(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
            return bytes2;
        }
        return m2874h(charsetEncoder, input, i, i2);
    }

    /* renamed from: h */
    private static final byte[] m2874h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) {
        boolean z;
        ByteBuffer encode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            byte[] array = encode.array();
            if (array.length == encode.remaining()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bArr = array;
            }
        }
        if (bArr == null) {
            byte[] bArr2 = new byte[encode.remaining()];
            encode.get(bArr2);
            return bArr2;
        }
        return bArr;
    }

    @NotNull
    /* renamed from: i */
    public static final String m2873i(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        String name = charset.name();
        Intrinsics.checkNotNullExpressionValue(name, "name()");
        return name;
    }

    /* renamed from: j */
    private static final void m2872j(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new C44470c(message);
        }
    }
}

package se;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AbstractJsonLexer.kt */
@Metadata
/* renamed from: se.p */
/* loaded from: classes8.dex */
public final class C42722p {
    @NotNull

    /* renamed from: a */
    public static final C42722p f111872a;
    @NotNull

    /* renamed from: b */
    public static final char[] f111873b;
    @NotNull

    /* renamed from: c */
    public static final byte[] f111874c;

    static {
        C42722p c42722p = new C42722p();
        f111872a = c42722p;
        f111873b = new char[117];
        f111874c = new byte[126];
        c42722p.m6709f();
        c42722p.m6710e();
    }

    private C42722p() {
    }

    /* renamed from: a */
    private final void m6714a(char c, char c2) {
        m6713b(c, c2);
    }

    /* renamed from: b */
    private final void m6713b(int i, char c) {
        if (c != 'u') {
            f111873b[c] = (char) i;
        }
    }

    /* renamed from: c */
    private final void m6712c(char c, byte b) {
        m6711d(c, b);
    }

    /* renamed from: d */
    private final void m6711d(int i, byte b) {
        f111874c[i] = b;
    }

    /* renamed from: e */
    private final void m6710e() {
        for (int i = 0; i < 33; i++) {
            m6711d(i, Byte.MAX_VALUE);
        }
        m6711d(9, (byte) 3);
        m6711d(10, (byte) 3);
        m6711d(13, (byte) 3);
        m6711d(32, (byte) 3);
        m6712c(',', (byte) 4);
        m6712c(':', (byte) 5);
        m6712c('{', (byte) 6);
        m6712c('}', (byte) 7);
        m6712c('[', (byte) 8);
        m6712c(']', (byte) 9);
        m6712c('\"', (byte) 1);
        m6712c('\\', (byte) 2);
    }

    /* renamed from: f */
    private final void m6709f() {
        for (int i = 0; i < 32; i++) {
            m6713b(i, 'u');
        }
        m6713b(8, 'b');
        m6713b(9, 't');
        m6713b(10, 'n');
        m6713b(12, 'f');
        m6713b(13, 'r');
        m6714a('/', '/');
        m6714a('\"', '\"');
        m6714a('\\', '\\');
    }
}

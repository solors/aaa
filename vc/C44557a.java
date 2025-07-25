package vc;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharJVM;
import org.jetbrains.annotations.NotNull;
import p1029wc.ChunkBuffer;
import p804nd.ExceptionsH;

/* compiled from: Buffer.kt */
@Metadata
/* renamed from: vc.a */
/* loaded from: classes9.dex */
public class C44557a {
    @NotNull

    /* renamed from: g */
    public static final C44558a f116944g = new C44558a(null);
    @NotNull

    /* renamed from: a */
    private final ByteBuffer f116945a;

    /* renamed from: b */
    private int f116946b;

    /* renamed from: c */
    private int f116947c;

    /* renamed from: d */
    private int f116948d;

    /* renamed from: e */
    private int f116949e;

    /* renamed from: f */
    private final int f116950f;

    /* compiled from: Buffer.kt */
    @Metadata
    /* renamed from: vc.a$a */
    /* loaded from: classes9.dex */
    public static final class C44558a {
        private C44558a() {
        }

        public /* synthetic */ C44558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C44557a m2498a() {
            return ChunkBuffer.f117160j.m2142a();
        }
    }

    public /* synthetic */ C44557a(ByteBuffer byteBuffer, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer);
    }

    /* renamed from: a */
    public final void m2516a(int i) {
        int i2 = this.f116947c + i;
        if (i >= 0 && i2 <= this.f116949e) {
            this.f116947c = i2;
        } else {
            C44559d.m2493a(i, m2511f() - m2507j());
            throw new ExceptionsH();
        }
    }

    /* renamed from: b */
    public final boolean m2515b(int i) {
        int i2 = this.f116949e;
        int i3 = this.f116947c;
        if (i >= i3) {
            if (i >= i2) {
                if (i == i2) {
                    this.f116947c = i;
                    return false;
                }
                C44559d.m2493a(i - i3, m2511f() - m2507j());
                throw new ExceptionsH();
            }
            this.f116947c = i;
            return true;
        }
        C44559d.m2493a(i - i3, m2511f() - m2507j());
        throw new ExceptionsH();
    }

    /* renamed from: c */
    public final void m2514c(int i) {
        if (i == 0) {
            return;
        }
        int i2 = this.f116946b + i;
        if (i >= 0 && i2 <= this.f116947c) {
            this.f116946b = i2;
        } else {
            C44559d.m2492b(i, m2507j() - m2509h());
            throw new ExceptionsH();
        }
    }

    /* renamed from: d */
    public final void m2513d(int i) {
        if (i >= 0 && i <= this.f116947c) {
            if (this.f116946b != i) {
                this.f116946b = i;
                return;
            }
            return;
        }
        C44559d.m2492b(i - this.f116946b, m2507j() - m2509h());
        throw new ExceptionsH();
    }

    /* renamed from: e */
    public final int m2512e() {
        return this.f116950f;
    }

    /* renamed from: f */
    public final int m2511f() {
        return this.f116949e;
    }

    @NotNull
    /* renamed from: g */
    public final ByteBuffer m2510g() {
        return this.f116945a;
    }

    /* renamed from: h */
    public final int m2509h() {
        return this.f116946b;
    }

    /* renamed from: i */
    public final int m2508i() {
        return this.f116948d;
    }

    /* renamed from: j */
    public final int m2507j() {
        return this.f116947c;
    }

    /* renamed from: k */
    public final byte m2506k() {
        int i = this.f116946b;
        if (i != this.f116947c) {
            this.f116946b = i + 1;
            return this.f116945a.get(i);
        }
        throw new EOFException("No readable bytes available.");
    }

    /* renamed from: l */
    public final void m2505l() {
        this.f116949e = this.f116950f;
    }

    /* renamed from: m */
    public final void m2504m() {
        m2503n(0);
        m2505l();
    }

    /* renamed from: n */
    public final void m2503n(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > this.f116946b) {
                z2 = false;
            }
            if (z2) {
                this.f116946b = i;
                if (this.f116948d > i) {
                    this.f116948d = i;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + i + " > " + this.f116946b).toString());
        }
        throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + i).toString());
    }

    /* renamed from: o */
    public final void m2502o(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.f116950f - i;
            if (i2 >= this.f116947c) {
                this.f116949e = i2;
                return;
            }
            if (i2 < 0) {
                C44559d.m2491c(this, i);
            }
            if (i2 < this.f116948d) {
                C44559d.m2489e(this, i);
            }
            if (this.f116946b == this.f116947c) {
                this.f116949e = i2;
                this.f116946b = i2;
                this.f116947c = i2;
                return;
            }
            C44559d.m2490d(this, i);
            return;
        }
        throw new IllegalArgumentException(("endGap shouldn't be negative: " + i).toString());
    }

    /* renamed from: p */
    public final void m2501p(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.f116946b;
            if (i2 >= i) {
                this.f116948d = i;
                return;
            } else if (i2 == this.f116947c) {
                if (i <= this.f116949e) {
                    this.f116947c = i;
                    this.f116946b = i;
                    this.f116948d = i;
                    return;
                }
                C44559d.m2486h(this, i);
                throw new ExceptionsH();
            } else {
                C44559d.m2487g(this, i);
                throw new ExceptionsH();
            }
        }
        throw new IllegalArgumentException(("startGap shouldn't be negative: " + i).toString());
    }

    /* renamed from: q */
    public void mo2156q() {
        m2504m();
        m2500r();
    }

    /* renamed from: r */
    public final void m2500r() {
        m2499s(this.f116950f - this.f116948d);
    }

    /* renamed from: s */
    public final void m2499s(int i) {
        int i2 = this.f116948d;
        this.f116946b = i2;
        this.f116947c = i2;
        this.f116949e = i;
    }

    @NotNull
    public String toString() {
        int checkRadix;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Buffer[0x");
        int hashCode = hashCode();
        checkRadix = CharJVM.checkRadix(16);
        String num = Integer.toString(hashCode, checkRadix);
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        sb2.append("](");
        sb2.append(m2507j() - m2509h());
        sb2.append(" used, ");
        sb2.append(m2511f() - m2507j());
        sb2.append(" free, ");
        sb2.append(this.f116948d + (m2512e() - m2511f()));
        sb2.append(" reserved of ");
        sb2.append(this.f116950f);
        sb2.append(')');
        return sb2.toString();
    }

    private C44557a(ByteBuffer memory) {
        Intrinsics.checkNotNullParameter(memory, "memory");
        this.f116945a = memory;
        this.f116949e = memory.limit();
        this.f116950f = memory.limit();
    }
}

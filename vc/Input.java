package vc;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1029wc.ChunkBuffer;
import p1029wc.UTF8;
import p1029wc.Unsafe;
import p1061yc.InterfaceC45101f;
import p804nd.ExceptionsH;

@Metadata
/* renamed from: vc.m */
/* loaded from: classes9.dex */
public abstract class Input implements Closeable {
    @NotNull

    /* renamed from: j */
    public static final C44563a f116958j = new C44563a(null);
    @NotNull

    /* renamed from: b */
    private final InterfaceC45101f<ChunkBuffer> f116959b;
    @NotNull

    /* renamed from: c */
    private ChunkBuffer f116960c;
    @NotNull

    /* renamed from: d */
    private ByteBuffer f116961d;

    /* renamed from: f */
    private int f116962f;

    /* renamed from: g */
    private int f116963g;

    /* renamed from: h */
    private long f116964h;

    /* renamed from: i */
    private boolean f116965i;

    /* compiled from: Input.kt */
    @Metadata
    /* renamed from: vc.m$a */
    /* loaded from: classes9.dex */
    public static final class C44563a {
        private C44563a() {
        }

        public /* synthetic */ C44563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Input() {
        this(null, 0L, null, 7, null);
    }

    /* renamed from: S */
    private final Void m2452S(int i, int i2) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + i + ", max = " + i2);
    }

    /* renamed from: T */
    private final Void m2451T(int i) {
        throw new IllegalStateException("minSize of " + i + " is too big (should be less than 8)");
    }

    /* renamed from: U */
    private final Void m2450U(int i, int i2) {
        throw new UTF8("Premature end of stream: expected at least " + i + " chars but had only " + i2);
    }

    /* renamed from: X */
    private final ChunkBuffer m2447X(int i, ChunkBuffer chunkBuffer) {
        boolean z;
        while (true) {
            int m2458M = m2458M() - m2456O();
            if (m2458M >= i) {
                return chunkBuffer;
            }
            ChunkBuffer m2151x = chunkBuffer.m2151x();
            if (m2151x == null && (m2151x = m2426n()) == null) {
                return null;
            }
            if (m2458M == 0) {
                if (chunkBuffer != ChunkBuffer.f117160j.m2142a()) {
                    m2440c0(chunkBuffer);
                }
                chunkBuffer = m2151x;
            } else {
                int m2497a = BufferAppend.m2497a(chunkBuffer, m2151x, i - m2458M);
                this.f116963g = chunkBuffer.m2507j();
                m2437e0(this.f116964h - m2497a);
                if (m2151x.m2507j() > m2151x.m2509h()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    chunkBuffer.m2159C(null);
                    chunkBuffer.m2159C(m2151x.m2152w());
                    m2151x.m2161A(this.f116959b);
                } else {
                    m2151x.m2501p(m2497a);
                }
                if (chunkBuffer.m2507j() - chunkBuffer.m2509h() >= i) {
                    return chunkBuffer;
                }
                if (i > 8) {
                    m2451T(i);
                    throw new ExceptionsH();
                }
            }
        }
    }

    /* renamed from: Y */
    private final int m2446Y(Appendable appendable, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i2 == 0 && i == 0) {
            return 0;
        }
        if (m2460I()) {
            if (i == 0) {
                return 0;
            }
            m2436f(i);
            throw new ExceptionsH();
        } else if (i2 >= i) {
            ChunkBuffer m2120b = Unsafe.m2120b(this, 1);
            if (m2120b == null) {
                i3 = 0;
            } else {
                i3 = 0;
                boolean z5 = false;
                while (true) {
                    try {
                        ByteBuffer m2510g = m2120b.m2510g();
                        int m2509h = m2120b.m2509h();
                        int m2507j = m2120b.m2507j();
                        for (int i4 = m2509h; i4 < m2507j; i4++) {
                            int i5 = m2510g.get(i4) & 255;
                            if ((i5 & 128) != 128) {
                                char c = (char) i5;
                                if (i3 == i2) {
                                    z3 = false;
                                } else {
                                    appendable.append(c);
                                    i3++;
                                    z3 = true;
                                }
                                if (z3) {
                                }
                            }
                            m2120b.m2514c(i4 - m2509h);
                            z = false;
                            break;
                        }
                        m2120b.m2514c(m2507j - m2509h);
                        z = true;
                        if (z) {
                            z2 = true;
                        } else if (i3 == i2) {
                            z2 = false;
                        } else {
                            z2 = false;
                            z5 = true;
                        }
                        if (!z2) {
                            z4 = true;
                            break;
                        }
                        try {
                            ChunkBuffer m2119c = Unsafe.m2119c(this, m2120b);
                            if (m2119c == null) {
                                break;
                            }
                            m2120b = m2119c;
                        } catch (Throwable th) {
                            th = th;
                            if (z4) {
                                Unsafe.m2121a(this, m2120b);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z4 = true;
                    }
                }
                if (z4) {
                    Unsafe.m2121a(this, m2120b);
                }
                z4 = z5;
            }
            if (z4) {
                return i3 + m2441b0(appendable, i - i3, i2 - i3);
            }
            if (i3 >= i) {
                return i3;
            }
            m2450U(i, i3);
            throw new ExceptionsH();
        } else {
            m2452S(i, i2);
            throw new ExceptionsH();
        }
    }

    /* renamed from: a */
    private final void m2444a(ChunkBuffer chunkBuffer) {
        if (chunkBuffer.m2507j() - chunkBuffer.m2509h() == 0) {
            m2440c0(chunkBuffer);
        }
    }

    /* renamed from: a0 */
    public static /* synthetic */ String m2443a0(Input input, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = Integer.MAX_VALUE;
            }
            return input.m2445Z(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
        r5.m2514c(((r11 - r9) - r14) + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
        if (r16 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ec, code lost:
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
        if (r16 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f3, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f4, code lost:
        r9 = r5.m2507j() - r5.m2509h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0131, code lost:
        if (r4 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0133, code lost:
        p1029wc.Unsafe.m2121a(r17, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0136, code lost:
        r6 = r8;
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int m2441b0(java.lang.Appendable r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.Input.m2441b0(java.lang.Appendable, int, int):int");
    }

    /* renamed from: e */
    private final void m2438e(ChunkBuffer chunkBuffer) {
        boolean z;
        ChunkBuffer m2479a = Buffers.m2479a(this.f116960c);
        if (m2479a == ChunkBuffer.f117160j.m2142a()) {
            m2435f0(chunkBuffer);
            long j = 0;
            if (this.f116964h == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ChunkBuffer m2151x = chunkBuffer.m2151x();
                if (m2151x != null) {
                    j = Buffers.m2477c(m2151x);
                }
                m2437e0(j);
                return;
            }
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        m2479a.m2159C(chunkBuffer);
        m2437e0(this.f116964h + Buffers.m2477c(chunkBuffer));
    }

    /* renamed from: f */
    private final Void m2436f(int i) {
        throw new EOFException("at least " + i + " characters required but no bytes available");
    }

    /* renamed from: f0 */
    private final void m2435f0(ChunkBuffer chunkBuffer) {
        this.f116960c = chunkBuffer;
        this.f116961d = chunkBuffer.m2510g();
        this.f116962f = chunkBuffer.m2509h();
        this.f116963g = chunkBuffer.m2507j();
    }

    /* renamed from: l */
    private final int m2428l(int i, int i2) {
        while (i != 0) {
            ChunkBuffer m2449V = m2449V(1);
            if (m2449V == null) {
                return i2;
            }
            int min = Math.min(m2449V.m2507j() - m2449V.m2509h(), i);
            m2449V.m2514c(min);
            this.f116962f += min;
            m2444a(m2449V);
            i -= min;
            i2 += min;
        }
        return i2;
    }

    /* renamed from: n */
    private final ChunkBuffer m2426n() {
        if (this.f116965i) {
            return null;
        }
        ChunkBuffer mo2422u = mo2422u();
        if (mo2422u == null) {
            this.f116965i = true;
            return null;
        }
        m2438e(mo2422u);
        return mo2422u;
    }

    /* renamed from: s */
    private final ChunkBuffer m2424s(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2) {
        boolean z;
        while (chunkBuffer != chunkBuffer2) {
            ChunkBuffer m2152w = chunkBuffer.m2152w();
            chunkBuffer.m2161A(this.f116959b);
            if (m2152w == null) {
                m2435f0(chunkBuffer2);
                m2437e0(0L);
                chunkBuffer = chunkBuffer2;
            } else {
                if (m2152w.m2507j() > m2152w.m2509h()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m2435f0(m2152w);
                    m2437e0(this.f116964h - (m2152w.m2507j() - m2152w.m2509h()));
                    return m2152w;
                }
                chunkBuffer = m2152w;
            }
        }
        return m2426n();
    }

    /* renamed from: x */
    private final void m2419x(ChunkBuffer chunkBuffer) {
        if (this.f116965i && chunkBuffer.m2151x() == null) {
            this.f116962f = chunkBuffer.m2509h();
            this.f116963g = chunkBuffer.m2507j();
            m2437e0(0L);
            return;
        }
        int m2507j = chunkBuffer.m2507j() - chunkBuffer.m2509h();
        int min = Math.min(m2507j, 8 - (chunkBuffer.m2512e() - chunkBuffer.m2511f()));
        if (m2507j > min) {
            m2418y(chunkBuffer, m2507j, min);
        } else {
            ChunkBuffer mo916L = this.f116959b.mo916L();
            mo916L.m2502o(8);
            mo916L.m2159C(chunkBuffer.m2152w());
            BufferAppend.m2497a(mo916L, chunkBuffer, m2507j);
            m2435f0(mo916L);
        }
        chunkBuffer.m2161A(this.f116959b);
    }

    /* renamed from: y */
    private final void m2418y(ChunkBuffer chunkBuffer, int i, int i2) {
        ChunkBuffer mo916L = this.f116959b.mo916L();
        ChunkBuffer mo916L2 = this.f116959b.mo916L();
        mo916L.m2502o(8);
        mo916L2.m2502o(8);
        mo916L.m2159C(mo916L2);
        mo916L2.m2159C(chunkBuffer.m2152w());
        BufferAppend.m2497a(mo916L, chunkBuffer, i - i2);
        BufferAppend.m2497a(mo916L2, chunkBuffer, i2);
        m2435f0(mo916L);
        m2437e0(Buffers.m2477c(mo916L2));
    }

    /* renamed from: I */
    public final boolean m2460I() {
        if (m2458M() - m2456O() == 0 && this.f116964h == 0 && (this.f116965i || m2426n() == null)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: K */
    public final ChunkBuffer m2459K() {
        ChunkBuffer chunkBuffer = this.f116960c;
        chunkBuffer.m2513d(this.f116962f);
        return chunkBuffer;
    }

    /* renamed from: M */
    public final int m2458M() {
        return this.f116963g;
    }

    @NotNull
    /* renamed from: N */
    public final ByteBuffer m2457N() {
        return this.f116961d;
    }

    /* renamed from: O */
    public final int m2456O() {
        return this.f116962f;
    }

    @NotNull
    /* renamed from: P */
    public final InterfaceC45101f<ChunkBuffer> m2455P() {
        return this.f116959b;
    }

    /* renamed from: Q */
    public final long m2454Q() {
        return (m2458M() - m2456O()) + this.f116964h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public final void m2453R() {
        if (!this.f116965i) {
            this.f116965i = true;
        }
    }

    @Nullable
    /* renamed from: V */
    public final ChunkBuffer m2449V(int i) {
        ChunkBuffer m2459K = m2459K();
        if (this.f116963g - this.f116962f >= i) {
            return m2459K;
        }
        return m2447X(i, m2459K);
    }

    @Nullable
    /* renamed from: W */
    public final ChunkBuffer m2448W(int i) {
        return m2447X(i, m2459K());
    }

    @NotNull
    /* renamed from: Z */
    public final String m2445Z(int i, int i2) {
        int m16917e;
        int m16912j;
        if (i == 0 && (i2 == 0 || m2460I())) {
            return "";
        }
        long m2454Q = m2454Q();
        if (m2454Q <= 0 || i2 < m2454Q) {
            m16917e = _Ranges.m16917e(i, 16);
            m16912j = _Ranges.m16912j(m16917e, i2);
            StringBuilder sb2 = new StringBuilder(m16912j);
            m2446Y(sb2, i, i2);
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
            return sb3;
        }
        return C44566s.m2380g(this, (int) m2454Q, null, 2, null);
    }

    /* renamed from: b */
    public final void m2442b(@NotNull ChunkBuffer chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ChunkBuffer.C44651d c44651d = ChunkBuffer.f117160j;
        if (chain == c44651d.m2142a()) {
            return;
        }
        long m2477c = Buffers.m2477c(chain);
        if (this.f116960c == c44651d.m2142a()) {
            m2435f0(chain);
            m2437e0(m2477c - (m2458M() - m2456O()));
            return;
        }
        Buffers.m2479a(this.f116960c).m2159C(chain);
        m2437e0(this.f116964h + m2477c);
    }

    @NotNull
    /* renamed from: c0 */
    public final ChunkBuffer m2440c0(@NotNull ChunkBuffer head) {
        Intrinsics.checkNotNullParameter(head, "head");
        ChunkBuffer m2152w = head.m2152w();
        if (m2152w == null) {
            m2152w = ChunkBuffer.f117160j.m2142a();
        }
        m2435f0(m2152w);
        m2437e0(this.f116964h - (m2152w.m2507j() - m2152w.m2509h()));
        head.m2161A(this.f116959b);
        return m2152w;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        release();
        if (!this.f116965i) {
            this.f116965i = true;
        }
        mo2431i();
    }

    /* renamed from: d0 */
    public final void m2439d0(int i) {
        this.f116962f = i;
    }

    /* renamed from: e0 */
    public final void m2437e0(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f116964h = j;
            return;
        }
        throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j).toString());
    }

    @Nullable
    /* renamed from: g0 */
    public final ChunkBuffer m2434g0() {
        ChunkBuffer m2459K = m2459K();
        ChunkBuffer m2151x = m2459K.m2151x();
        ChunkBuffer m2142a = ChunkBuffer.f117160j.m2142a();
        if (m2459K == m2142a) {
            return null;
        }
        if (m2151x == null) {
            m2435f0(m2142a);
            m2437e0(0L);
        } else {
            m2435f0(m2151x);
            m2437e0(this.f116964h - (m2151x.m2507j() - m2151x.m2509h()));
        }
        m2459K.m2159C(null);
        return m2459K;
    }

    /* renamed from: h */
    public final boolean m2433h() {
        if (this.f116962f == this.f116963g && this.f116964h == 0) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: h0 */
    public final ChunkBuffer m2432h0() {
        ChunkBuffer m2459K = m2459K();
        ChunkBuffer m2142a = ChunkBuffer.f117160j.m2142a();
        if (m2459K == m2142a) {
            return null;
        }
        m2435f0(m2142a);
        m2437e0(0L);
        return m2459K;
    }

    /* renamed from: i */
    protected abstract void mo2431i();

    /* renamed from: i0 */
    public final boolean m2430i0(@NotNull ChunkBuffer chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ChunkBuffer m2479a = Buffers.m2479a(m2459K());
        int m2507j = chain.m2507j() - chain.m2509h();
        if (m2507j != 0 && m2479a.m2511f() - m2479a.m2507j() >= m2507j) {
            BufferAppend.m2497a(m2479a, chain, m2507j);
            if (m2459K() == m2479a) {
                this.f116963g = m2479a.m2507j();
                return true;
            }
            m2437e0(this.f116964h + m2507j);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final int m2429k(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m2428l(i, 0);
        }
        throw new IllegalArgumentException(("Negative discard is not allowed: " + i).toString());
    }

    /* renamed from: m */
    public final void m2427m(int i) {
        if (m2429k(i) == i) {
            return;
        }
        throw new EOFException("Unable to discard " + i + " bytes due to end of packet");
    }

    @Nullable
    /* renamed from: r */
    public final ChunkBuffer m2425r(@NotNull ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return m2424s(current, ChunkBuffer.f117160j.m2142a());
    }

    public final void release() {
        ChunkBuffer m2459K = m2459K();
        ChunkBuffer m2142a = ChunkBuffer.f117160j.m2142a();
        if (m2459K != m2142a) {
            m2435f0(m2142a);
            m2437e0(0L);
            Buffers.m2478b(m2459K, this.f116959b);
        }
    }

    @Nullable
    /* renamed from: t */
    public final ChunkBuffer m2423t(@NotNull ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(current, "current");
        return m2425r(current);
    }

    @Nullable
    /* renamed from: u */
    protected ChunkBuffer mo2422u() {
        ChunkBuffer mo916L = this.f116959b.mo916L();
        try {
            mo916L.m2502o(8);
            int mo2421v = mo2421v(mo916L.m2510g(), mo916L.m2507j(), mo916L.m2511f() - mo916L.m2507j());
            if (mo2421v == 0) {
                boolean z = true;
                this.f116965i = true;
                if (mo916L.m2507j() <= mo916L.m2509h()) {
                    z = false;
                }
                if (!z) {
                    mo916L.m2161A(this.f116959b);
                    return null;
                }
            }
            mo916L.m2516a(mo2421v);
            return mo916L;
        } catch (Throwable th) {
            mo916L.m2161A(this.f116959b);
            throw th;
        }
    }

    /* renamed from: v */
    protected abstract int mo2421v(@NotNull ByteBuffer byteBuffer, int i, int i2);

    /* renamed from: w */
    public final void m2420w(@NotNull ChunkBuffer current) {
        Intrinsics.checkNotNullParameter(current, "current");
        ChunkBuffer m2151x = current.m2151x();
        if (m2151x == null) {
            m2419x(current);
            return;
        }
        int m2507j = current.m2507j() - current.m2509h();
        int min = Math.min(m2507j, 8 - (current.m2512e() - current.m2511f()));
        if (m2151x.m2508i() < min) {
            m2419x(current);
            return;
        }
        C44559d.m2488f(m2151x, min);
        if (m2507j > min) {
            current.m2505l();
            this.f116963g = current.m2507j();
            m2437e0(this.f116964h + min);
            return;
        }
        m2435f0(m2151x);
        m2437e0(this.f116964h - ((m2151x.m2507j() - m2151x.m2509h()) - min));
        current.m2152w();
        current.m2161A(this.f116959b);
    }

    public Input(@NotNull ChunkBuffer head, long j, @NotNull InterfaceC45101f<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f116959b = pool;
        this.f116960c = head;
        this.f116961d = head.m2510g();
        this.f116962f = head.m2509h();
        int m2507j = head.m2507j();
        this.f116963g = m2507j;
        this.f116964h = j - (m2507j - this.f116962f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Input(p1029wc.ChunkBuffer r1, long r2, p1061yc.InterfaceC45101f<p1029wc.ChunkBuffer> r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto La
            wc.a$d r1 = p1029wc.ChunkBuffer.f117160j
            wc.a r1 = r1.m2142a()
        La:
            r6 = r5 & 2
            if (r6 == 0) goto L12
            long r2 = vc.Buffers.m2477c(r1)
        L12:
            r5 = r5 & 4
            if (r5 == 0) goto L1c
            wc.a$d r4 = p1029wc.ChunkBuffer.f117160j
            yc.f r4 = r4.m2140c()
        L1c:
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.Input.<init>(wc.a, long, yc.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

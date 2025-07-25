package vc;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1029wc.C44652b;
import p1029wc.C44653f;
import p1029wc.ChunkBuffer;
import p1029wc.Numbers;
import p1061yc.InterfaceC45101f;
import p804nd.ExceptionsH;
import tc.MemoryJvm;

@Metadata
/* renamed from: vc.p */
/* loaded from: classes9.dex */
public abstract class Output implements Appendable, Closeable {
    @NotNull

    /* renamed from: b */
    private final InterfaceC45101f<ChunkBuffer> f116966b;
    @Nullable

    /* renamed from: c */
    private ChunkBuffer f116967c;
    @Nullable

    /* renamed from: d */
    private ChunkBuffer f116968d;
    @NotNull

    /* renamed from: f */
    private ByteBuffer f116969f;

    /* renamed from: g */
    private int f116970g;

    /* renamed from: h */
    private int f116971h;

    /* renamed from: i */
    private int f116972i;

    /* renamed from: j */
    private int f116973j;

    public Output(@NotNull InterfaceC45101f<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f116966b = pool;
        this.f116969f = MemoryJvm.f116542a.m3118a();
    }

    /* renamed from: P */
    private final void m2410P(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2, InterfaceC45101f<ChunkBuffer> interfaceC45101f) {
        chunkBuffer.m2515b(this.f116970g);
        int m2507j = chunkBuffer.m2507j() - chunkBuffer.m2509h();
        int m2507j2 = chunkBuffer2.m2507j() - chunkBuffer2.m2509h();
        int m2387a = PacketJVM.m2387a();
        if (m2507j2 >= m2387a || m2507j2 > (chunkBuffer.m2512e() - chunkBuffer.m2511f()) + (chunkBuffer.m2511f() - chunkBuffer.m2507j())) {
            m2507j2 = -1;
        }
        if (m2507j >= m2387a || m2507j > chunkBuffer2.m2508i() || !C44652b.m2139a(chunkBuffer2)) {
            m2507j = -1;
        }
        if (m2507j2 == -1 && m2507j == -1) {
            m2403i(chunkBuffer2);
        } else if (m2507j != -1 && m2507j2 > m2507j) {
            if (m2507j2 != -1 && m2507j >= m2507j2) {
                throw new IllegalStateException("prep = " + m2507j + ", app = " + m2507j2);
            }
            m2409Q(chunkBuffer2, chunkBuffer);
        } else {
            BufferAppend.m2497a(chunkBuffer, chunkBuffer2, (chunkBuffer.m2511f() - chunkBuffer.m2507j()) + (chunkBuffer.m2512e() - chunkBuffer.m2511f()));
            m2407b();
            ChunkBuffer m2152w = chunkBuffer2.m2152w();
            if (m2152w != null) {
                m2403i(m2152w);
            }
            chunkBuffer2.m2161A(interfaceC45101f);
        }
    }

    /* renamed from: Q */
    private final void m2409Q(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2) {
        BufferAppend.m2495c(chunkBuffer, chunkBuffer2);
        ChunkBuffer chunkBuffer3 = this.f116967c;
        if (chunkBuffer3 != null) {
            if (chunkBuffer3 == chunkBuffer2) {
                this.f116967c = chunkBuffer;
            } else {
                while (true) {
                    ChunkBuffer m2151x = chunkBuffer3.m2151x();
                    Intrinsics.m17074g(m2151x);
                    if (m2151x == chunkBuffer2) {
                        break;
                    }
                    chunkBuffer3 = m2151x;
                }
                chunkBuffer3.m2159C(chunkBuffer);
            }
            chunkBuffer2.m2161A(this.f116966b);
            this.f116968d = Buffers.m2479a(chunkBuffer);
            return;
        }
        throw new IllegalStateException("head should't be null since it is already handled in the fast-path".toString());
    }

    /* renamed from: k */
    private final void m2402k(ChunkBuffer chunkBuffer, ChunkBuffer chunkBuffer2, int i) {
        ChunkBuffer chunkBuffer3 = this.f116968d;
        if (chunkBuffer3 == null) {
            this.f116967c = chunkBuffer;
            this.f116973j = 0;
        } else {
            chunkBuffer3.m2159C(chunkBuffer);
            int i2 = this.f116970g;
            chunkBuffer3.m2515b(i2);
            this.f116973j += i2 - this.f116972i;
        }
        this.f116968d = chunkBuffer2;
        this.f116973j += i;
        this.f116969f = chunkBuffer2.m2510g();
        this.f116970g = chunkBuffer2.m2507j();
        this.f116972i = chunkBuffer2.m2509h();
        this.f116971h = chunkBuffer2.m2511f();
    }

    /* renamed from: l */
    private final void m2401l(char c) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = 3;
        ChunkBuffer m2415I = m2415I(3);
        try {
            ByteBuffer m2510g = m2415I.m2510g();
            int m2507j = m2415I.m2507j();
            boolean z5 = true;
            if (c >= 0 && c < 128) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m2510g.put(m2507j, (byte) c);
                i = 1;
            } else {
                if (128 <= c && c < 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    m2510g.put(m2507j, (byte) (((c >> 6) & 31) | 192));
                    m2510g.put(m2507j + 1, (byte) ((c & '?') | 128));
                    i = 2;
                } else {
                    if (2048 <= c && c < 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        m2510g.put(m2507j, (byte) (((c >> '\f') & 15) | 224));
                        m2510g.put(m2507j + 1, (byte) (((c >> 6) & 63) | 128));
                        m2510g.put(m2507j + 2, (byte) ((c & '?') | 128));
                    } else {
                        if (0 <= c && c < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            m2510g.put(m2507j, (byte) (((c >> 18) & 7) | 240));
                            m2510g.put(m2507j + 1, (byte) (((c >> '\f') & 63) | 128));
                            m2510g.put(m2507j + 2, (byte) (((c >> 6) & 63) | 128));
                            m2510g.put(m2507j + 3, (byte) ((c & '?') | 128));
                            i = 4;
                        } else {
                            C44653f.m2122j(c);
                            throw new ExceptionsH();
                        }
                    }
                }
            }
            m2415I.m2516a(i);
            if (i < 0) {
                z5 = false;
            }
            if (z5) {
                return;
            }
            throw new IllegalStateException("The returned value shouldn't be negative".toString());
        } finally {
            m2407b();
        }
    }

    /* renamed from: m */
    private final ChunkBuffer m2400m() {
        ChunkBuffer mo916L = this.f116966b.mo916L();
        mo916L.m2502o(8);
        m2399n(mo916L);
        return mo916L;
    }

    /* renamed from: t */
    private final void m2396t() {
        ChunkBuffer m2414K = m2414K();
        if (m2414K == null) {
            return;
        }
        ChunkBuffer chunkBuffer = m2414K;
        do {
            try {
                mo2397s(chunkBuffer.m2510g(), chunkBuffer.m2509h(), chunkBuffer.m2507j() - chunkBuffer.m2509h());
                chunkBuffer = chunkBuffer.m2151x();
            } finally {
                Buffers.m2478b(m2414K, this.f116966b);
            }
        } while (chunkBuffer != null);
    }

    @NotNull
    /* renamed from: I */
    public final ChunkBuffer m2415I(int i) {
        ChunkBuffer chunkBuffer;
        if (m2393w() - m2392x() >= i && (chunkBuffer = this.f116968d) != null) {
            chunkBuffer.m2515b(this.f116970g);
            return chunkBuffer;
        }
        return m2400m();
    }

    @Nullable
    /* renamed from: K */
    public final ChunkBuffer m2414K() {
        ChunkBuffer chunkBuffer = this.f116967c;
        if (chunkBuffer == null) {
            return null;
        }
        ChunkBuffer chunkBuffer2 = this.f116968d;
        if (chunkBuffer2 != null) {
            chunkBuffer2.m2515b(this.f116970g);
        }
        this.f116967c = null;
        this.f116968d = null;
        this.f116970g = 0;
        this.f116971h = 0;
        this.f116972i = 0;
        this.f116973j = 0;
        this.f116969f = MemoryJvm.f116542a.m3118a();
        return chunkBuffer;
    }

    /* renamed from: M */
    public final void m2413M(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "chunkBuffer");
        ChunkBuffer chunkBuffer2 = this.f116968d;
        if (chunkBuffer2 == null) {
            m2403i(chunkBuffer);
        } else {
            m2410P(chunkBuffer2, chunkBuffer, this.f116966b);
        }
    }

    /* renamed from: N */
    public final void m2412N(@NotNull ByteReadPacket packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        ChunkBuffer m2432h0 = packet.m2432h0();
        if (m2432h0 == null) {
            packet.release();
            return;
        }
        ChunkBuffer chunkBuffer = this.f116968d;
        if (chunkBuffer == null) {
            m2403i(m2432h0);
        } else {
            m2410P(chunkBuffer, m2432h0, packet.m2455P());
        }
    }

    /* renamed from: O */
    public final void m2411O(@NotNull ByteReadPacket p, long j) {
        Intrinsics.checkNotNullParameter(p, "p");
        while (j > 0) {
            long m2458M = p.m2458M() - p.m2456O();
            if (m2458M <= j) {
                j -= m2458M;
                ChunkBuffer m2434g0 = p.m2434g0();
                if (m2434g0 != null) {
                    m2399n(m2434g0);
                } else {
                    throw new EOFException("Unexpected end of packet");
                }
            } else {
                ChunkBuffer m2449V = p.m2449V(1);
                if (m2449V != null) {
                    int m2509h = m2449V.m2509h();
                    try {
                        C44565q.m2390a(this, m2449V, (int) j);
                        int m2509h2 = m2449V.m2509h();
                        if (m2509h2 >= m2509h) {
                            if (m2509h2 == m2449V.m2507j()) {
                                p.m2425r(m2449V);
                                return;
                            } else {
                                p.m2439d0(m2509h2);
                                return;
                            }
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    } catch (Throwable th) {
                        int m2509h3 = m2449V.m2509h();
                        if (m2509h3 >= m2509h) {
                            if (m2509h3 == m2449V.m2507j()) {
                                p.m2425r(m2449V);
                            } else {
                                p.m2439d0(m2509h3);
                            }
                            throw th;
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                }
                C44566s.m2386a(1);
                throw new ExceptionsH();
            }
        }
    }

    /* renamed from: a */
    public final void m2408a() {
        boolean z;
        ChunkBuffer m2395u = m2395u();
        if (m2395u != ChunkBuffer.f117160j.m2142a()) {
            if (m2395u.m2151x() == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m2395u.m2500r();
                m2395u.m2502o(8);
                int m2507j = m2395u.m2507j();
                this.f116970g = m2507j;
                this.f116972i = m2507j;
                this.f116971h = m2395u.m2511f();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: b */
    public final void m2407b() {
        ChunkBuffer chunkBuffer = this.f116968d;
        if (chunkBuffer != null) {
            this.f116970g = chunkBuffer.m2507j();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            mo2398r();
        }
    }

    @Override // java.lang.Appendable
    @NotNull
    /* renamed from: e */
    public Output append(char c) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.f116970g;
        int i2 = 3;
        if (this.f116971h - i >= 3) {
            ByteBuffer byteBuffer = this.f116969f;
            boolean z4 = true;
            if (c >= 0 && c < 128) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byteBuffer.put(i, (byte) c);
                i2 = 1;
            } else {
                if (128 <= c && c < 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    byteBuffer.put(i, (byte) (((c >> 6) & 31) | 192));
                    byteBuffer.put(i + 1, (byte) ((c & '?') | 128));
                    i2 = 2;
                } else {
                    if (2048 <= c && c < 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        byteBuffer.put(i, (byte) (((c >> '\f') & 15) | 224));
                        byteBuffer.put(i + 1, (byte) (((c >> 6) & 63) | 128));
                        byteBuffer.put(i + 2, (byte) ((c & '?') | 128));
                    } else {
                        if (0 > c || c >= 0) {
                            z4 = false;
                        }
                        if (z4) {
                            byteBuffer.put(i, (byte) (((c >> 18) & 7) | 240));
                            byteBuffer.put(i + 1, (byte) (((c >> '\f') & 63) | 128));
                            byteBuffer.put(i + 2, (byte) (((c >> 6) & 63) | 128));
                            byteBuffer.put(i + 3, (byte) ((c & '?') | 128));
                            i2 = 4;
                        } else {
                            C44653f.m2122j(c);
                            throw new ExceptionsH();
                        }
                    }
                }
            }
            this.f116970g = i + i2;
            return this;
        }
        m2401l(c);
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    /* renamed from: f */
    public Output append(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            append("null", 0, 4);
        } else {
            append(charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final void flush() {
        m2396t();
    }

    @Override // java.lang.Appendable
    @NotNull
    /* renamed from: h */
    public Output append(@Nullable CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return append("null", i, i2);
        }
        C44566s.m2379h(this, charSequence, i, i2, Charsets.UTF_8);
        return this;
    }

    /* renamed from: i */
    public final void m2403i(@NotNull ChunkBuffer head) {
        Intrinsics.checkNotNullParameter(head, "head");
        ChunkBuffer m2479a = Buffers.m2479a(head);
        long m2477c = Buffers.m2477c(head) - (m2479a.m2507j() - m2479a.m2509h());
        if (m2477c < 2147483647L) {
            m2402k(head, m2479a, (int) m2477c);
        } else {
            Numbers.m2132a(m2477c, "total size increase");
            throw new ExceptionsH();
        }
    }

    /* renamed from: n */
    public final void m2399n(@NotNull ChunkBuffer buffer) {
        boolean z;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.m2151x() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m2402k(buffer, buffer, 0);
            return;
        }
        throw new IllegalStateException("It should be a single buffer chunk.".toString());
    }

    /* renamed from: r */
    protected abstract void mo2398r();

    public final void release() {
        close();
    }

    /* renamed from: s */
    protected abstract void mo2397s(@NotNull ByteBuffer byteBuffer, int i, int i2);

    @NotNull
    /* renamed from: u */
    public final ChunkBuffer m2395u() {
        ChunkBuffer chunkBuffer = this.f116967c;
        if (chunkBuffer == null) {
            return ChunkBuffer.f117160j.m2142a();
        }
        return chunkBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: v */
    public final InterfaceC45101f<ChunkBuffer> m2394v() {
        return this.f116966b;
    }

    /* renamed from: w */
    public final int m2393w() {
        return this.f116971h;
    }

    /* renamed from: x */
    public final int m2392x() {
        return this.f116970g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final int m2391y() {
        return this.f116973j + (this.f116970g - this.f116972i);
    }

    public Output() {
        this(ChunkBuffer.f117160j.m2140c());
    }
}

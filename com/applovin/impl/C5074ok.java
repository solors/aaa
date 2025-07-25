package com.applovin.impl;

import com.applovin.impl.InterfaceC5099p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.applovin.impl.ok */
/* loaded from: classes2.dex */
public final class C5074ok implements InterfaceC5099p1 {

    /* renamed from: b */
    private int f8902b;

    /* renamed from: c */
    private float f8903c = 1.0f;

    /* renamed from: d */
    private float f8904d = 1.0f;

    /* renamed from: e */
    private InterfaceC5099p1.C5100a f8905e;

    /* renamed from: f */
    private InterfaceC5099p1.C5100a f8906f;

    /* renamed from: g */
    private InterfaceC5099p1.C5100a f8907g;

    /* renamed from: h */
    private InterfaceC5099p1.C5100a f8908h;

    /* renamed from: i */
    private boolean f8909i;

    /* renamed from: j */
    private C5018nk f8910j;

    /* renamed from: k */
    private ByteBuffer f8911k;

    /* renamed from: l */
    private ShortBuffer f8912l;

    /* renamed from: m */
    private ByteBuffer f8913m;

    /* renamed from: n */
    private long f8914n;

    /* renamed from: o */
    private long f8915o;

    /* renamed from: p */
    private boolean f8916p;

    public C5074ok() {
        InterfaceC5099p1.C5100a c5100a = InterfaceC5099p1.C5100a.f8973e;
        this.f8905e = c5100a;
        this.f8906f = c5100a;
        this.f8907g = c5100a;
        this.f8908h = c5100a;
        ByteBuffer byteBuffer = InterfaceC5099p1.f8972a;
        this.f8911k = byteBuffer;
        this.f8912l = byteBuffer.asShortBuffer();
        this.f8913m = byteBuffer;
        this.f8902b = -1;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: a */
    public InterfaceC5099p1.C5100a mo92597a(InterfaceC5099p1.C5100a c5100a) {
        if (c5100a.f8976c == 2) {
            int i = this.f8902b;
            if (i == -1) {
                i = c5100a.f8974a;
            }
            this.f8905e = c5100a;
            InterfaceC5099p1.C5100a c5100a2 = new InterfaceC5099p1.C5100a(i, c5100a.f8975b, 2);
            this.f8906f = c5100a2;
            this.f8909i = true;
            return c5100a2;
        }
        throw new InterfaceC5099p1.C5101b(c5100a);
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: b */
    public void mo92596b() {
        if (mo92594f()) {
            InterfaceC5099p1.C5100a c5100a = this.f8905e;
            this.f8907g = c5100a;
            InterfaceC5099p1.C5100a c5100a2 = this.f8906f;
            this.f8908h = c5100a2;
            if (this.f8909i) {
                this.f8910j = new C5018nk(c5100a.f8974a, c5100a.f8975b, this.f8903c, this.f8904d, c5100a2.f8974a);
            } else {
                C5018nk c5018nk = this.f8910j;
                if (c5018nk != null) {
                    c5018nk.m96952a();
                }
            }
        }
        this.f8913m = InterfaceC5099p1.f8972a;
        this.f8914n = 0L;
        this.f8915o = 0L;
        this.f8916p = false;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: c */
    public boolean mo92334c() {
        C5018nk c5018nk;
        if (this.f8916p && ((c5018nk = this.f8910j) == null || c5018nk.m96941b() == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: d */
    public ByteBuffer mo92333d() {
        int m96941b;
        C5018nk c5018nk = this.f8910j;
        if (c5018nk != null && (m96941b = c5018nk.m96941b()) > 0) {
            if (this.f8911k.capacity() < m96941b) {
                ByteBuffer order = ByteBuffer.allocateDirect(m96941b).order(ByteOrder.nativeOrder());
                this.f8911k = order;
                this.f8912l = order.asShortBuffer();
            } else {
                this.f8911k.clear();
                this.f8912l.clear();
            }
            c5018nk.m96946a(this.f8912l);
            this.f8915o += m96941b;
            this.f8911k.limit(m96941b);
            this.f8913m = this.f8911k;
        }
        ByteBuffer byteBuffer = this.f8913m;
        this.f8913m = InterfaceC5099p1.f8972a;
        return byteBuffer;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: e */
    public void mo92595e() {
        C5018nk c5018nk = this.f8910j;
        if (c5018nk != null) {
            c5018nk.m96930e();
        }
        this.f8916p = true;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: f */
    public boolean mo92594f() {
        if (this.f8906f.f8974a != -1 && (Math.abs(this.f8903c - 1.0f) >= 1.0E-4f || Math.abs(this.f8904d - 1.0f) >= 1.0E-4f || this.f8906f.f8974a != this.f8905e.f8974a)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    public void reset() {
        this.f8903c = 1.0f;
        this.f8904d = 1.0f;
        InterfaceC5099p1.C5100a c5100a = InterfaceC5099p1.C5100a.f8973e;
        this.f8905e = c5100a;
        this.f8906f = c5100a;
        this.f8907g = c5100a;
        this.f8908h = c5100a;
        ByteBuffer byteBuffer = InterfaceC5099p1.f8972a;
        this.f8911k = byteBuffer;
        this.f8912l = byteBuffer.asShortBuffer();
        this.f8913m = byteBuffer;
        this.f8902b = -1;
        this.f8909i = false;
        this.f8910j = null;
        this.f8914n = 0L;
        this.f8915o = 0L;
        this.f8916p = false;
    }

    /* renamed from: a */
    public long m96642a(long j) {
        if (this.f8915o >= 1024) {
            long m96935c = this.f8914n - ((C5018nk) AbstractC4100b1.m100583a(this.f8910j)).m96935c();
            int i = this.f8908h.f8974a;
            int i2 = this.f8907g.f8974a;
            if (i == i2) {
                return AbstractC5863xp.m92974c(j, m96935c, this.f8915o);
            }
            return AbstractC5863xp.m92974c(j, m96935c * i, this.f8915o * i2);
        }
        return (long) (this.f8903c * j);
    }

    /* renamed from: b */
    public void m96641b(float f) {
        if (this.f8903c != f) {
            this.f8903c = f;
            this.f8909i = true;
        }
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: a */
    public void mo92336a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f8914n += remaining;
            ((C5018nk) AbstractC4100b1.m100583a(this.f8910j)).m96939b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: a */
    public void m96643a(float f) {
        if (this.f8904d != f) {
            this.f8904d = f;
            this.f8909i = true;
        }
    }
}

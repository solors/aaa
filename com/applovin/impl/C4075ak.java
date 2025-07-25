package com.applovin.impl;

import com.applovin.impl.InterfaceC5099p1;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.ak */
/* loaded from: classes2.dex */
public final class C4075ak extends AbstractC5942z1 {

    /* renamed from: i */
    private final long f4789i;

    /* renamed from: j */
    private final long f4790j;

    /* renamed from: k */
    private final short f4791k;

    /* renamed from: l */
    private int f4792l;

    /* renamed from: m */
    private boolean f4793m;

    /* renamed from: n */
    private byte[] f4794n;

    /* renamed from: o */
    private byte[] f4795o;

    /* renamed from: p */
    private int f4796p;

    /* renamed from: q */
    private int f4797q;

    /* renamed from: r */
    private int f4798r;

    /* renamed from: s */
    private boolean f4799s;

    /* renamed from: t */
    private long f4800t;

    public C4075ak() {
        this(150000L, 20000L, (short) 1024);
    }

    /* renamed from: a */
    private int m100691a(long j) {
        return (int) ((j * this.f12408b.f8974a) / 1000000);
    }

    /* renamed from: b */
    private int m100687b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.f4791k) {
                    int i = this.f4792l;
                    return ((limit / i) * i) + i;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }

    /* renamed from: c */
    private int m100686c(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f4791k) {
                int i = this.f4792l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: d */
    private void m100685d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m92598a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f4799s = true;
        }
    }

    /* renamed from: e */
    private void m100684e(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m100686c = m100686c(byteBuffer);
        int position = m100686c - byteBuffer.position();
        byte[] bArr = this.f4794n;
        int length = bArr.length;
        int i = this.f4797q;
        int i2 = length - i;
        if (m100686c < limit && position < i2) {
            m100688a(bArr, i);
            this.f4797q = 0;
            this.f4796p = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f4794n, this.f4797q, min);
        int i3 = this.f4797q + min;
        this.f4797q = i3;
        byte[] bArr2 = this.f4794n;
        if (i3 == bArr2.length) {
            if (this.f4799s) {
                m100688a(bArr2, this.f4798r);
                this.f4800t += (this.f4797q - (this.f4798r * 2)) / this.f4792l;
            } else {
                this.f4800t += (i3 - this.f4798r) / this.f4792l;
            }
            m100690a(byteBuffer, this.f4794n, this.f4797q);
            this.f4797q = 0;
            this.f4796p = 2;
        }
        byteBuffer.limit(limit);
    }

    @Override // com.applovin.impl.AbstractC5942z1, com.applovin.impl.InterfaceC5099p1
    /* renamed from: f */
    public boolean mo92594f() {
        return this.f4793m;
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: g */
    protected void mo92332g() {
        if (this.f4793m) {
            this.f4792l = this.f12408b.f8977d;
            int m100691a = m100691a(this.f4789i) * this.f4792l;
            if (this.f4794n.length != m100691a) {
                this.f4794n = new byte[m100691a];
            }
            int m100691a2 = m100691a(this.f4790j) * this.f4792l;
            this.f4798r = m100691a2;
            if (this.f4795o.length != m100691a2) {
                this.f4795o = new byte[m100691a2];
            }
        }
        this.f4796p = 0;
        this.f4800t = 0L;
        this.f4797q = 0;
        this.f4799s = false;
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: h */
    protected void mo92331h() {
        int i = this.f4797q;
        if (i > 0) {
            m100688a(this.f4794n, i);
        }
        if (!this.f4799s) {
            this.f4800t += this.f4798r / this.f4792l;
        }
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: i */
    protected void mo92330i() {
        this.f4793m = false;
        this.f4798r = 0;
        byte[] bArr = AbstractC5863xp.f12156f;
        this.f4794n = bArr;
        this.f4795o = bArr;
    }

    /* renamed from: j */
    public long m100681j() {
        return this.f4800t;
    }

    public C4075ak(long j, long j2, short s) {
        AbstractC4100b1.m100580a(j2 <= j);
        this.f4789i = j;
        this.f4790j = j2;
        this.f4791k = s;
        byte[] bArr = AbstractC5863xp.f12156f;
        this.f4794n = bArr;
        this.f4795o = bArr;
    }

    /* renamed from: a */
    private void m100688a(byte[] bArr, int i) {
        m92598a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f4799s = true;
        }
    }

    /* renamed from: f */
    private void m100683f(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f4794n.length));
        int m100687b = m100687b(byteBuffer);
        if (m100687b == byteBuffer.position()) {
            this.f4796p = 1;
        } else {
            byteBuffer.limit(m100687b);
            m100685d(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: a */
    public void mo92336a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m92599a()) {
            int i = this.f4796p;
            if (i == 0) {
                m100683f(byteBuffer);
            } else if (i == 1) {
                m100684e(byteBuffer);
            } else if (i == 2) {
                m100682g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: b */
    public InterfaceC5099p1.C5100a mo92335b(InterfaceC5099p1.C5100a c5100a) {
        if (c5100a.f8976c == 2) {
            return this.f4793m ? c5100a : InterfaceC5099p1.C5100a.f8973e;
        }
        throw new InterfaceC5099p1.C5101b(c5100a);
    }

    /* renamed from: a */
    public void m100689a(boolean z) {
        this.f4793m = z;
    }

    /* renamed from: a */
    private void m100690a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f4798r);
        int i2 = this.f4798r - min;
        System.arraycopy(bArr, i - i2, this.f4795o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f4795o, i2, min);
    }

    /* renamed from: g */
    private void m100682g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m100686c = m100686c(byteBuffer);
        byteBuffer.limit(m100686c);
        this.f4800t += byteBuffer.remaining() / this.f4792l;
        m100690a(byteBuffer, this.f4795o, this.f4798r);
        if (m100686c < limit) {
            m100688a(this.f4795o, this.f4798r);
            this.f4796p = 0;
            byteBuffer.limit(limit);
        }
    }
}

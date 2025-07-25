package com.applovin.impl;

import com.applovin.impl.InterfaceC5099p1;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.zo */
/* loaded from: classes2.dex */
final class C5988zo extends AbstractC5942z1 {

    /* renamed from: i */
    private int f12603i;

    /* renamed from: j */
    private int f12604j;

    /* renamed from: k */
    private boolean f12605k;

    /* renamed from: l */
    private int f12606l;

    /* renamed from: m */
    private byte[] f12607m = AbstractC5863xp.f12156f;

    /* renamed from: n */
    private int f12608n;

    /* renamed from: o */
    private long f12609o;

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: a */
    public void mo92336a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f12606l);
        this.f12609o += min / this.f12408b.f8977d;
        this.f12606l -= min;
        byteBuffer.position(position + min);
        if (this.f12606l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f12608n + i2) - this.f12607m.length;
        ByteBuffer m92598a = m92598a(length);
        int m93039a = AbstractC5863xp.m93039a(length, 0, this.f12608n);
        m92598a.put(this.f12607m, 0, m93039a);
        int m93039a2 = AbstractC5863xp.m93039a(length - m93039a, 0, i2);
        byteBuffer.limit(byteBuffer.position() + m93039a2);
        m92598a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - m93039a2;
        int i4 = this.f12608n - m93039a;
        this.f12608n = i4;
        byte[] bArr = this.f12607m;
        System.arraycopy(bArr, m93039a, bArr, 0, i4);
        byteBuffer.get(this.f12607m, this.f12608n, i3);
        this.f12608n += i3;
        m92598a.flip();
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: b */
    public InterfaceC5099p1.C5100a mo92335b(InterfaceC5099p1.C5100a c5100a) {
        if (c5100a.f8976c == 2) {
            this.f12605k = true;
            if (this.f12603i == 0 && this.f12604j == 0) {
                return InterfaceC5099p1.C5100a.f8973e;
            }
            return c5100a;
        }
        throw new InterfaceC5099p1.C5101b(c5100a);
    }

    @Override // com.applovin.impl.AbstractC5942z1, com.applovin.impl.InterfaceC5099p1
    /* renamed from: c */
    public boolean mo92334c() {
        if (super.mo92334c() && this.f12608n == 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.AbstractC5942z1, com.applovin.impl.InterfaceC5099p1
    /* renamed from: d */
    public ByteBuffer mo92333d() {
        int i;
        if (super.mo92334c() && (i = this.f12608n) > 0) {
            m92598a(i).put(this.f12607m, 0, this.f12608n).flip();
            this.f12608n = 0;
        }
        return super.mo92333d();
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: g */
    protected void mo92332g() {
        if (this.f12605k) {
            this.f12605k = false;
            int i = this.f12604j;
            int i2 = this.f12408b.f8977d;
            this.f12607m = new byte[i * i2];
            this.f12606l = this.f12603i * i2;
        }
        this.f12608n = 0;
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: h */
    protected void mo92331h() {
        int i;
        if (this.f12605k) {
            if (this.f12608n > 0) {
                this.f12609o += i / this.f12408b.f8977d;
            }
            this.f12608n = 0;
        }
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: i */
    protected void mo92330i() {
        this.f12607m = AbstractC5863xp.f12156f;
    }

    /* renamed from: j */
    public long m92329j() {
        return this.f12609o;
    }

    /* renamed from: k */
    public void m92328k() {
        this.f12609o = 0L;
    }

    /* renamed from: a */
    public void m92337a(int i, int i2) {
        this.f12603i = i;
        this.f12604j = i2;
    }
}

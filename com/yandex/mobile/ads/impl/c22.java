package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC31983zg;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class c22 extends AbstractC30628jj {

    /* renamed from: i */
    private int f77476i;

    /* renamed from: j */
    private int f77477j;

    /* renamed from: k */
    private boolean f77478k;

    /* renamed from: l */
    private int f77479l;

    /* renamed from: m */
    private byte[] f77480m = y32.f88015f;

    /* renamed from: n */
    private int f77481n;

    /* renamed from: o */
    private long f77482o;

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj, com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final boolean mo26239a() {
        return super.mo26239a() && this.f77481n == 0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: b */
    public final InterfaceC31983zg.C31984a mo29000b(InterfaceC31983zg.C31984a c31984a) throws InterfaceC31983zg.C31985b {
        if (c31984a.f88854c == 2) {
            this.f77478k = true;
            if (this.f77476i == 0 && this.f77477j == 0) {
                return InterfaceC31983zg.C31984a.f88851e;
            }
            return c31984a;
        }
        throw new InterfaceC31983zg.C31985b(c31984a);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj, com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: c */
    public final ByteBuffer mo26235c() {
        int i;
        if (super.mo26239a() && (i = this.f77481n) > 0) {
            m32907a(i).put(this.f77480m, 0, this.f77481n).flip();
            this.f77481n = 0;
        }
        return super.mo26235c();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: f */
    protected final void mo28999f() {
        if (this.f77478k) {
            this.f77478k = false;
            int i = this.f77477j;
            int i2 = this.f80926b.f88855d;
            this.f77480m = new byte[i * i2];
            this.f77479l = this.f77476i * i2;
        }
        this.f77481n = 0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: g */
    protected final void mo28998g() {
        int i;
        if (this.f77478k) {
            if (this.f77481n > 0) {
                this.f77482o += i / this.f80926b.f88855d;
            }
            this.f77481n = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: h */
    protected final void mo28997h() {
        this.f77480m = y32.f88015f;
    }

    /* renamed from: i */
    public final long m35376i() {
        return this.f77482o;
    }

    /* renamed from: j */
    public final void m35375j() {
        this.f77482o = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final void mo26237a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f77479l);
        this.f77482o += min / this.f80926b.f88855d;
        this.f77479l -= min;
        byteBuffer.position(position + min);
        if (this.f77479l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f77481n + i2) - this.f77480m.length;
        ByteBuffer m32907a = m32907a(length);
        int i3 = this.f77481n;
        int i4 = y32.f88010a;
        int max = Math.max(0, Math.min(length, i3));
        m32907a.put(this.f77480m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i2));
        byteBuffer.limit(byteBuffer.position() + max2);
        m32907a.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i2 - max2;
        int i6 = this.f77481n - max;
        this.f77481n = i6;
        byte[] bArr = this.f77480m;
        System.arraycopy(bArr, max, bArr, 0, i6);
        byteBuffer.get(this.f77480m, this.f77481n, i5);
        this.f77481n += i5;
        m32907a.flip();
    }

    /* renamed from: a */
    public final void m35377a(int i, int i2) {
        this.f77476i = i;
        this.f77477j = i2;
    }
}

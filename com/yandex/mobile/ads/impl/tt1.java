package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC31983zg;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class tt1 extends AbstractC30628jj {

    /* renamed from: i */
    private final long f85865i = 150000;

    /* renamed from: j */
    private final long f85866j = 20000;

    /* renamed from: k */
    private final short f85867k = 1024;

    /* renamed from: l */
    private int f85868l;

    /* renamed from: m */
    private boolean f85869m;

    /* renamed from: n */
    private byte[] f85870n;

    /* renamed from: o */
    private byte[] f85871o;

    /* renamed from: p */
    private int f85872p;

    /* renamed from: q */
    private int f85873q;

    /* renamed from: r */
    private int f85874r;

    /* renamed from: s */
    private boolean f85875s;

    /* renamed from: t */
    private long f85876t;

    public tt1(int i) {
        byte[] bArr = y32.f88015f;
        this.f85870n = bArr;
        this.f85871o = bArr;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final void mo26237a(ByteBuffer byteBuffer) {
        int limit;
        int limit2;
        int position;
        while (byteBuffer.hasRemaining() && !m32906e()) {
            int i = this.f85872p;
            if (i == 0) {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f85870n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f85867k) {
                            int i2 = this.f85868l;
                            position = ((limit4 / i2) * i2) + i2;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f85872p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    m32907a(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f85875s = true;
                    }
                }
                byteBuffer.limit(limit3);
            } else if (i == 1) {
                int limit5 = byteBuffer.limit();
                int position2 = byteBuffer.position();
                while (true) {
                    if (position2 < byteBuffer.limit()) {
                        if (Math.abs((int) byteBuffer.getShort(position2)) > this.f85867k) {
                            int i3 = this.f85868l;
                            limit2 = (position2 / i3) * i3;
                            break;
                        }
                        position2 += 2;
                    } else {
                        limit2 = byteBuffer.limit();
                        break;
                    }
                }
                int position3 = limit2 - byteBuffer.position();
                byte[] bArr = this.f85870n;
                int length = bArr.length;
                int i4 = this.f85873q;
                int i5 = length - i4;
                if (limit2 < limit5 && position3 < i5) {
                    m32907a(i4).put(bArr, 0, i4).flip();
                    if (i4 > 0) {
                        this.f85875s = true;
                    }
                    this.f85873q = 0;
                    this.f85872p = 0;
                } else {
                    int min = Math.min(position3, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f85870n, this.f85873q, min);
                    int i6 = this.f85873q + min;
                    this.f85873q = i6;
                    byte[] bArr2 = this.f85870n;
                    if (i6 == bArr2.length) {
                        if (this.f85875s) {
                            int i7 = this.f85874r;
                            m32907a(i7).put(bArr2, 0, i7).flip();
                            if (i7 > 0) {
                                this.f85875s = true;
                            }
                            this.f85876t += (this.f85873q - (this.f85874r * 2)) / this.f85868l;
                        } else {
                            this.f85876t += (i6 - this.f85874r) / this.f85868l;
                        }
                        byte[] bArr3 = this.f85870n;
                        int i8 = this.f85873q;
                        int min2 = Math.min(byteBuffer.remaining(), this.f85874r);
                        int i9 = this.f85874r - min2;
                        System.arraycopy(bArr3, i8 - i9, this.f85871o, 0, i9);
                        byteBuffer.position(byteBuffer.limit() - min2);
                        byteBuffer.get(this.f85871o, i9, min2);
                        this.f85873q = 0;
                        this.f85872p = 2;
                    }
                    byteBuffer.limit(limit5);
                }
            } else if (i == 2) {
                int limit6 = byteBuffer.limit();
                int position4 = byteBuffer.position();
                while (true) {
                    if (position4 < byteBuffer.limit()) {
                        if (Math.abs((int) byteBuffer.getShort(position4)) > this.f85867k) {
                            int i10 = this.f85868l;
                            limit = (position4 / i10) * i10;
                            break;
                        }
                        position4 += 2;
                    } else {
                        limit = byteBuffer.limit();
                        break;
                    }
                }
                byteBuffer.limit(limit);
                this.f85876t += byteBuffer.remaining() / this.f85868l;
                byte[] bArr4 = this.f85871o;
                int i11 = this.f85874r;
                int min3 = Math.min(byteBuffer.remaining(), this.f85874r);
                int i12 = this.f85874r - min3;
                System.arraycopy(bArr4, i11 - i12, this.f85871o, 0, i12);
                byteBuffer.position(byteBuffer.limit() - min3);
                byteBuffer.get(this.f85871o, i12, min3);
                if (limit < limit6) {
                    byte[] bArr5 = this.f85871o;
                    int i13 = this.f85874r;
                    m32907a(i13).put(bArr5, 0, i13).flip();
                    if (i13 > 0) {
                        this.f85875s = true;
                    }
                    this.f85872p = 0;
                    byteBuffer.limit(limit6);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: b */
    public final InterfaceC31983zg.C31984a mo29000b(InterfaceC31983zg.C31984a c31984a) throws InterfaceC31983zg.C31985b {
        if (c31984a.f88854c == 2) {
            if (!this.f85869m) {
                return InterfaceC31983zg.C31984a.f88851e;
            }
            return c31984a;
        }
        throw new InterfaceC31983zg.C31985b(c31984a);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: f */
    protected final void mo28999f() {
        if (this.f85869m) {
            InterfaceC31983zg.C31984a c31984a = this.f80926b;
            int i = c31984a.f88855d;
            this.f85868l = i;
            long j = this.f85865i;
            long j2 = c31984a.f88852a;
            int i2 = ((int) ((j * j2) / 1000000)) * i;
            if (this.f85870n.length != i2) {
                this.f85870n = new byte[i2];
            }
            int i3 = ((int) ((this.f85866j * j2) / 1000000)) * i;
            this.f85874r = i3;
            if (this.f85871o.length != i3) {
                this.f85871o = new byte[i3];
            }
        }
        this.f85872p = 0;
        this.f85876t = 0L;
        this.f85873q = 0;
        this.f85875s = false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: g */
    protected final void mo28998g() {
        int i = this.f85873q;
        if (i > 0) {
            m32907a(i).put(this.f85870n, 0, i).flip();
            if (i > 0) {
                this.f85875s = true;
            }
        }
        if (!this.f85875s) {
            this.f85876t += this.f85874r / this.f85868l;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: h */
    protected final void mo28997h() {
        this.f85869m = false;
        this.f85874r = 0;
        byte[] bArr = y32.f88015f;
        this.f85870n = bArr;
        this.f85871o = bArr;
    }

    /* renamed from: i */
    public final long m28996i() {
        return this.f85876t;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj, com.yandex.mobile.ads.impl.InterfaceC31983zg
    public final boolean isActive() {
        return this.f85869m;
    }

    /* renamed from: a */
    public final void m29001a(boolean z) {
        this.f85869m = z;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.x */
/* loaded from: classes4.dex */
public final class C14820x implements InterfaceC14799c {

    /* renamed from: d */
    public C14819w f28238d;

    /* renamed from: g */
    public ByteBuffer f28241g;

    /* renamed from: h */
    public ShortBuffer f28242h;

    /* renamed from: i */
    public ByteBuffer f28243i;

    /* renamed from: j */
    public long f28244j;

    /* renamed from: k */
    public long f28245k;

    /* renamed from: l */
    public boolean f28246l;

    /* renamed from: e */
    public float f28239e = 1.0f;

    /* renamed from: f */
    public float f28240f = 1.0f;

    /* renamed from: b */
    public int f28236b = -1;

    /* renamed from: c */
    public int f28237c = -1;

    public C14820x() {
        ByteBuffer byteBuffer = InterfaceC14799c.f28104a;
        this.f28241g = byteBuffer;
        this.f28242h = byteBuffer.asShortBuffer();
        this.f28243i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final boolean mo77538a(int i, int i2, int i3) {
        if (i3 == 2) {
            if (this.f28237c == i && this.f28236b == i2) {
                return false;
            }
            this.f28237c = i;
            this.f28236b = i2;
            return true;
        }
        throw new C14798b(i, i2, i3);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: b */
    public final void mo77536b() {
        int i;
        C14819w c14819w = this.f28238d;
        int i2 = c14819w.f28228q;
        float f = c14819w.f28226o;
        float f2 = c14819w.f28227p;
        int i3 = c14819w.f28229r + ((int) ((((i2 / (f / f2)) + c14819w.f28230s) / f2) + 0.5f));
        c14819w.m77544a((c14819w.f28216e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = c14819w.f28216e * 2;
            int i5 = c14819w.f28213b;
            if (i4 >= i * i5) {
                break;
            }
            c14819w.f28219h[(i5 * i2) + i4] = 0;
            i4++;
        }
        c14819w.f28228q = i + c14819w.f28228q;
        c14819w.m77545a();
        if (c14819w.f28229r > i3) {
            c14819w.f28229r = i3;
        }
        c14819w.f28228q = 0;
        c14819w.f28231t = 0;
        c14819w.f28230s = 0;
        this.f28246l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: c */
    public final boolean mo77535c() {
        C14819w c14819w;
        if (this.f28246l && ((c14819w = this.f28238d) == null || c14819w.f28229r == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: d */
    public final boolean mo77534d() {
        if (Math.abs(this.f28239e - 1.0f) < 0.01f && Math.abs(this.f28240f - 1.0f) < 0.01f) {
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: e */
    public final int mo77533e() {
        return this.f28236b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: f */
    public final void mo77532f() {
        this.f28238d = null;
        ByteBuffer byteBuffer = InterfaceC14799c.f28104a;
        this.f28241g = byteBuffer;
        this.f28242h = byteBuffer.asShortBuffer();
        this.f28243i = byteBuffer;
        this.f28236b = -1;
        this.f28237c = -1;
        this.f28244j = 0L;
        this.f28245k = 0L;
        this.f28246l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    public final void flush() {
        C14819w c14819w = new C14819w(this.f28237c, this.f28236b);
        this.f28238d = c14819w;
        c14819w.f28226o = this.f28239e;
        c14819w.f28227p = this.f28240f;
        this.f28243i = InterfaceC14799c.f28104a;
        this.f28244j = 0L;
        this.f28245k = 0L;
        this.f28246l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final void mo77537a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f28244j += remaining;
            C14819w c14819w = this.f28238d;
            c14819w.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i = c14819w.f28213b;
            int i2 = remaining2 / i;
            c14819w.m77544a(i2);
            asShortBuffer.get(c14819w.f28219h, c14819w.f28228q * c14819w.f28213b, ((i * i2) * 2) / 2);
            c14819w.f28228q += i2;
            c14819w.m77545a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = this.f28238d.f28229r * this.f28236b * 2;
        if (i3 > 0) {
            if (this.f28241g.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f28241g = order;
                this.f28242h = order.asShortBuffer();
            } else {
                this.f28241g.clear();
                this.f28242h.clear();
            }
            C14819w c14819w2 = this.f28238d;
            ShortBuffer shortBuffer = this.f28242h;
            c14819w2.getClass();
            int min = Math.min(shortBuffer.remaining() / c14819w2.f28213b, c14819w2.f28229r);
            shortBuffer.put(c14819w2.f28221j, 0, c14819w2.f28213b * min);
            int i4 = c14819w2.f28229r - min;
            c14819w2.f28229r = i4;
            short[] sArr = c14819w2.f28221j;
            int i5 = c14819w2.f28213b;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.f28245k += i3;
            this.f28241g.limit(i3);
            this.f28243i = this.f28241g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final ByteBuffer mo77539a() {
        ByteBuffer byteBuffer = this.f28243i;
        this.f28243i = InterfaceC14799c.f28104a;
        return byteBuffer;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.s */
/* loaded from: classes4.dex */
public final class C14815s implements InterfaceC14799c {

    /* renamed from: b */
    public int f28194b;

    /* renamed from: c */
    public int f28195c;

    /* renamed from: d */
    public int[] f28196d;

    /* renamed from: e */
    public boolean f28197e;

    /* renamed from: f */
    public int[] f28198f;

    /* renamed from: g */
    public ByteBuffer f28199g;

    /* renamed from: h */
    public ByteBuffer f28200h;

    /* renamed from: i */
    public boolean f28201i;

    public C14815s() {
        ByteBuffer byteBuffer = InterfaceC14799c.f28104a;
        this.f28199g = byteBuffer;
        this.f28200h = byteBuffer;
        this.f28194b = -1;
        this.f28195c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final boolean mo77538a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f28196d, this.f28198f);
        int[] iArr = this.f28196d;
        this.f28198f = iArr;
        if (iArr == null) {
            this.f28197e = false;
            return z;
        } else if (i3 == 2) {
            if (!z && this.f28195c == i && this.f28194b == i2) {
                return false;
            }
            this.f28195c = i;
            this.f28194b = i2;
            this.f28197e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f28198f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f28197e = (i5 != i4) | this.f28197e;
                    i4++;
                } else {
                    throw new C14798b(i, i2, i3);
                }
            }
        } else {
            throw new C14798b(i, i2, i3);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: b */
    public final void mo77536b() {
        this.f28201i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: c */
    public final boolean mo77535c() {
        if (this.f28201i && this.f28200h == InterfaceC14799c.f28104a) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: d */
    public final boolean mo77534d() {
        return this.f28197e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: e */
    public final int mo77533e() {
        int[] iArr = this.f28198f;
        if (iArr == null) {
            return this.f28194b;
        }
        return iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: f */
    public final void mo77532f() {
        ByteBuffer byteBuffer = InterfaceC14799c.f28104a;
        this.f28200h = byteBuffer;
        this.f28201i = false;
        this.f28199g = byteBuffer;
        this.f28194b = -1;
        this.f28195c = -1;
        this.f28198f = null;
        this.f28197e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    public final void flush() {
        this.f28200h = InterfaceC14799c.f28104a;
        this.f28201i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final void mo77537a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f28194b * 2)) * this.f28198f.length * 2;
        if (this.f28199g.capacity() < length) {
            this.f28199g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f28199g.clear();
        }
        while (position < limit) {
            for (int i : this.f28198f) {
                this.f28199g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f28194b * 2;
        }
        byteBuffer.position(limit);
        this.f28199g.flip();
        this.f28200h = this.f28199g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final ByteBuffer mo77539a() {
        ByteBuffer byteBuffer = this.f28200h;
        this.f28200h = InterfaceC14799c.f28104a;
        return byteBuffer;
    }
}

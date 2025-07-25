package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.v */
/* loaded from: classes4.dex */
public final class C14818v implements InterfaceC14799c {

    /* renamed from: b */
    public int f28206b = -1;

    /* renamed from: c */
    public int f28207c = -1;

    /* renamed from: d */
    public int f28208d = 0;

    /* renamed from: e */
    public ByteBuffer f28209e;

    /* renamed from: f */
    public ByteBuffer f28210f;

    /* renamed from: g */
    public boolean f28211g;

    public C14818v() {
        ByteBuffer byteBuffer = InterfaceC14799c.f28104a;
        this.f28209e = byteBuffer;
        this.f28210f = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final boolean mo77538a(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C14798b(i, i2, i3);
        }
        if (this.f28206b == i && this.f28207c == i2 && this.f28208d == i3) {
            return false;
        }
        this.f28206b = i;
        this.f28207c = i2;
        this.f28208d = i3;
        if (i3 == 2) {
            this.f28209e = InterfaceC14799c.f28104a;
            return true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: b */
    public final void mo77536b() {
        this.f28211g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: c */
    public final boolean mo77535c() {
        if (this.f28211g && this.f28210f == InterfaceC14799c.f28104a) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: d */
    public final boolean mo77534d() {
        int i = this.f28208d;
        if (i != 0 && i != 2) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: e */
    public final int mo77533e() {
        return this.f28207c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: f */
    public final void mo77532f() {
        ByteBuffer byteBuffer = InterfaceC14799c.f28104a;
        this.f28210f = byteBuffer;
        this.f28211g = false;
        this.f28209e = byteBuffer;
        this.f28206b = -1;
        this.f28207c = -1;
        this.f28208d = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    public final void flush() {
        this.f28210f = InterfaceC14799c.f28104a;
        this.f28211g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo77537a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f28208d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 3
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r6) goto L20
            if (r3 == r5) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r5
        L21:
            int r2 = r2 * 2
        L23:
            java.nio.ByteBuffer r3 = r7.f28209e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f28209e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.f28209e
            r2.clear()
        L3f:
            int r2 = r7.f28208d
            if (r2 == r6) goto L81
            if (r2 == r5) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f28209e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f28209e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f28209e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f28209e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.f28209e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f28209e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f28209e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f28209e
            r7.f28210f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C14818v.mo77537a(java.nio.ByteBuffer):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC14799c
    /* renamed from: a */
    public final ByteBuffer mo77539a() {
        ByteBuffer byteBuffer = this.f28210f;
        this.f28210f = InterfaceC14799c.f28104a;
        return byteBuffer;
    }
}

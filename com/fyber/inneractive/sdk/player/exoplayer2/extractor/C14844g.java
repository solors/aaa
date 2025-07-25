package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.C15015p;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C14825b;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C14826c;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15069a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15093l;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15070b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.g */
/* loaded from: classes4.dex */
public final class C14844g implements InterfaceC14935r {

    /* renamed from: a */
    public final InterfaceC15070b f28337a;

    /* renamed from: b */
    public final int f28338b;

    /* renamed from: c */
    public final C14836e f28339c;

    /* renamed from: d */
    public final LinkedBlockingDeque f28340d;

    /* renamed from: e */
    public final C14835d f28341e;

    /* renamed from: f */
    public final C15121n f28342f;

    /* renamed from: g */
    public final AtomicInteger f28343g;

    /* renamed from: h */
    public long f28344h;

    /* renamed from: i */
    public C15014o f28345i;

    /* renamed from: j */
    public long f28346j;

    /* renamed from: k */
    public C15069a f28347k;

    /* renamed from: l */
    public int f28348l;

    /* renamed from: m */
    public boolean f28349m;

    /* renamed from: n */
    public InterfaceC14837f f28350n;

    public C14844g(InterfaceC15070b interfaceC15070b) {
        this.f28337a = interfaceC15070b;
        ((C15093l) interfaceC15070b).getClass();
        this.f28338b = 65536;
        this.f28339c = new C14836e();
        this.f28340d = new LinkedBlockingDeque();
        this.f28341e = new C14835d();
        this.f28342f = new C15121n(32);
        this.f28343g = new AtomicInteger();
        this.f28348l = 65536;
    }

    /* renamed from: a */
    public final void m77502a(boolean z) {
        int andSet = this.f28343g.getAndSet(z ? 0 : 2);
        m77507a();
        C14836e c14836e = this.f28339c;
        c14836e.f28306m = Long.MIN_VALUE;
        c14836e.f28307n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f28345i = null;
        }
    }

    /* renamed from: b */
    public final void m77500b() {
        if (this.f28343g.getAndSet(2) == 0) {
            m77507a();
        }
    }

    /* renamed from: c */
    public final void m77499c() {
        if (!this.f28343g.compareAndSet(1, 0)) {
            m77507a();
        }
    }

    /* renamed from: d */
    public final long m77498d() {
        long max;
        C14836e c14836e = this.f28339c;
        synchronized (c14836e) {
            max = Math.max(c14836e.f28306m, c14836e.f28307n);
        }
        return max;
    }

    /* renamed from: e */
    public final C15014o m77497e() {
        C15014o c15014o;
        C14836e c14836e = this.f28339c;
        synchronized (c14836e) {
            if (c14836e.f28309p) {
                c15014o = null;
            } else {
                c15014o = c14836e.f28310q;
            }
        }
        return c15014o;
    }

    /* renamed from: f */
    public final void m77496f() {
        long j;
        C14836e c14836e = this.f28339c;
        synchronized (c14836e) {
            int i = c14836e.f28302i;
            if (i == 0) {
                j = -1;
            } else {
                int i2 = c14836e.f28304k + i;
                int i3 = c14836e.f28294a;
                int i4 = (i2 - 1) % i3;
                c14836e.f28304k = i2 % i3;
                c14836e.f28303j += i;
                c14836e.f28302i = 0;
                j = c14836e.f28296c[i4] + c14836e.f28297d[i4];
            }
        }
        if (j != -1) {
            m77505a(j);
        }
    }

    /* renamed from: a */
    public final boolean m77501a(boolean z, long j) {
        long j2;
        C14836e c14836e = this.f28339c;
        synchronized (c14836e) {
            if (c14836e.f28302i != 0) {
                long[] jArr = c14836e.f28299f;
                int i = c14836e.f28304k;
                if (j >= jArr[i]) {
                    if (j <= c14836e.f28307n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (i != c14836e.f28305l && c14836e.f28299f[i] <= j) {
                            if ((c14836e.f28298e[i] & 1) != 0) {
                                i2 = i3;
                            }
                            i = (i + 1) % c14836e.f28294a;
                            i3++;
                        }
                        if (i2 != -1) {
                            int i4 = (c14836e.f28304k + i2) % c14836e.f28294a;
                            c14836e.f28304k = i4;
                            c14836e.f28303j += i2;
                            c14836e.f28302i -= i2;
                            j2 = c14836e.f28296c[i4];
                        }
                    }
                    j2 = -1;
                }
            }
            j2 = -1;
        }
        if (j2 == -1) {
            return false;
        }
        m77505a(j2);
        return true;
    }

    /* renamed from: a */
    public final int m77503a(C15015p c15015p, C14826c c14826c, boolean z, boolean z2, long j) {
        int i;
        long j2;
        char c;
        C14836e c14836e = this.f28339c;
        C15014o c15014o = this.f28345i;
        C14835d c14835d = this.f28341e;
        synchronized (c14836e) {
            i = 1;
            if (c14836e.f28302i != 0) {
                if (!z) {
                    C15014o[] c15014oArr = c14836e.f28301h;
                    int i2 = c14836e.f28304k;
                    if (c15014oArr[i2] == c15014o) {
                        if (c14826c.f28265c == null && c14826c.f28267e == 0) {
                            c = 65533;
                        } else {
                            long j3 = c14836e.f28299f[i2];
                            c14826c.f28266d = j3;
                            c14826c.f28263a = c14836e.f28298e[i2];
                            c14835d.f28290a = c14836e.f28297d[i2];
                            c14835d.f28291b = c14836e.f28296c[i2];
                            c14835d.f28293d = c14836e.f28300g[i2];
                            c14836e.f28306m = Math.max(c14836e.f28306m, j3);
                            int i3 = c14836e.f28302i - 1;
                            c14836e.f28302i = i3;
                            int i4 = c14836e.f28304k + 1;
                            c14836e.f28304k = i4;
                            c14836e.f28303j++;
                            if (i4 == c14836e.f28294a) {
                                c14836e.f28304k = 0;
                            }
                            if (i3 > 0) {
                                j2 = c14836e.f28296c[c14836e.f28304k];
                            } else {
                                j2 = c14835d.f28291b + c14835d.f28290a;
                            }
                            c14835d.f28292c = j2;
                            c = 65532;
                        }
                    }
                }
                c15015p.f29477a = c14836e.f28301h[c14836e.f28304k];
                c = 65531;
            } else if (z2) {
                c14826c.f28263a = 4;
                c = 65532;
            } else {
                C15014o c15014o2 = c14836e.f28310q;
                if (c15014o2 == null || (!z && c15014o2 == c15014o)) {
                    c = 65533;
                } else {
                    c15015p.f29477a = c15014o2;
                    c = 65531;
                }
            }
        }
        if (c == 65531) {
            this.f28345i = c15015p.f29477a;
            return -5;
        } else if (c != 65532) {
            if (c == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        } else if (c14826c.m77525b(4)) {
            return -4;
        } else {
            if (c14826c.f28266d < j) {
                c14826c.f28263a = Integer.MIN_VALUE | c14826c.f28263a;
            }
            if (c14826c.m77525b(1073741824)) {
                C14835d c14835d2 = this.f28341e;
                long j4 = c14835d2.f28291b;
                this.f28342f.m77201c(1);
                m77504a(j4, this.f28342f.f29804a, 1);
                long j5 = j4 + 1;
                byte b = this.f28342f.f29804a[0];
                boolean z3 = (b & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                int i5 = b & Byte.MAX_VALUE;
                C14825b c14825b = c14826c.f28264b;
                if (c14825b.f28258a == null) {
                    c14825b.f28258a = new byte[16];
                }
                m77504a(j5, c14825b.f28258a, i5);
                long j6 = j5 + i5;
                if (z3) {
                    this.f28342f.m77201c(2);
                    m77504a(j6, this.f28342f.f29804a, 2);
                    j6 += 2;
                    i = this.f28342f.m77187o();
                }
                int i6 = i;
                C14825b c14825b2 = c14826c.f28264b;
                int[] iArr = c14825b2.f28259b;
                if (iArr == null || iArr.length < i6) {
                    iArr = new int[i6];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = c14825b2.f28260c;
                if (iArr3 == null || iArr3.length < i6) {
                    iArr3 = new int[i6];
                }
                int[] iArr4 = iArr3;
                if (z3) {
                    int i7 = i6 * 6;
                    this.f28342f.m77201c(i7);
                    m77504a(j6, this.f28342f.f29804a, i7);
                    j6 += i7;
                    this.f28342f.m77197e(0);
                    for (int i8 = 0; i8 < i6; i8++) {
                        iArr2[i8] = this.f28342f.m77187o();
                        iArr4[i8] = this.f28342f.m77189m();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = c14835d2.f28290a - ((int) (j6 - c14835d2.f28291b));
                }
                C14825b c14825b3 = c14826c.f28264b;
                c14825b3.m77528a(i6, iArr2, iArr4, c14835d2.f28293d, c14825b3.f28258a);
                long j7 = c14835d2.f28291b;
                int i9 = (int) (j6 - j7);
                c14835d2.f28291b = j7 + i9;
                c14835d2.f28290a -= i9;
            }
            int i10 = this.f28341e.f28290a;
            ByteBuffer byteBuffer = c14826c.f28265c;
            if (byteBuffer == null) {
                c14826c.f28265c = c14826c.m77526a(i10);
            } else {
                int capacity = byteBuffer.capacity();
                int position = c14826c.f28265c.position();
                int i11 = i10 + position;
                if (capacity < i11) {
                    ByteBuffer m77526a = c14826c.m77526a(i11);
                    if (position > 0) {
                        c14826c.f28265c.position(0);
                        c14826c.f28265c.limit(position);
                        m77526a.put(c14826c.f28265c);
                    }
                    c14826c.f28265c = m77526a;
                }
            }
            C14835d c14835d3 = this.f28341e;
            long j8 = c14835d3.f28291b;
            ByteBuffer byteBuffer2 = c14826c.f28265c;
            int i12 = c14835d3.f28290a;
            while (i12 > 0) {
                m77505a(j8);
                int i13 = (int) (j8 - this.f28344h);
                int min = Math.min(i12, this.f28338b - i13);
                C15069a c15069a = (C15069a) this.f28340d.peek();
                byteBuffer2.put(c15069a.f29622a, c15069a.f29623b + i13, min);
                j8 += min;
                i12 -= min;
            }
            m77505a(this.f28341e.f28292c);
            return -4;
        }
    }

    /* renamed from: a */
    public final void m77504a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            m77505a(j);
            int i3 = (int) (j - this.f28344h);
            int min = Math.min(i - i2, this.f28338b - i3);
            C15069a c15069a = (C15069a) this.f28340d.peek();
            System.arraycopy(c15069a.f29622a, c15069a.f29623b + i3, bArr, i2, min);
            j += min;
            i2 += min;
        }
    }

    /* renamed from: a */
    public final void m77505a(long j) {
        int i = ((int) (j - this.f28344h)) / this.f28338b;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC15070b interfaceC15070b = this.f28337a;
            C15069a c15069a = (C15069a) this.f28340d.remove();
            C15093l c15093l = (C15093l) interfaceC15070b;
            synchronized (c15093l) {
                C15069a[] c15069aArr = c15093l.f29712a;
                c15069aArr[0] = c15069a;
                c15093l.m77243a(c15069aArr);
            }
            this.f28344h += this.f28338b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final void mo77419a(C15014o c15014o) {
        boolean z;
        if (c15014o == null) {
            c15014o = null;
        }
        C14836e c14836e = this.f28339c;
        synchronized (c14836e) {
            z = true;
            if (c15014o == null) {
                c14836e.f28309p = true;
            } else {
                c14836e.f28309p = false;
                C15014o c15014o2 = c14836e.f28310q;
                int i = AbstractC15133z.f29832a;
                if (!c15014o.equals(c15014o2)) {
                    c14836e.f28310q = c15014o;
                }
            }
            z = false;
        }
        InterfaceC14837f interfaceC14837f = this.f28350n;
        if (interfaceC14837f == null || !z) {
            return;
        }
        interfaceC14837f.mo77298e();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final int mo77420a(C14833b c14833b, int i, boolean z) {
        int i2 = 0;
        if (!this.f28343g.compareAndSet(0, 1)) {
            int min = Math.min(c14833b.f28288f, i);
            c14833b.m77520b(min);
            if (min == 0) {
                min = c14833b.m77522a(C14833b.f28282g, 0, Math.min(i, 4096), 0, true);
            }
            if (min != -1) {
                c14833b.f28285c += min;
            }
            if (min == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            return min;
        }
        try {
            int m77506a = m77506a(i);
            C15069a c15069a = this.f28347k;
            byte[] bArr = c15069a.f29622a;
            int i3 = c15069a.f29623b + this.f28348l;
            int i4 = c14833b.f28288f;
            if (i4 != 0) {
                int min2 = Math.min(i4, m77506a);
                System.arraycopy(c14833b.f28286d, 0, bArr, i3, min2);
                c14833b.m77520b(min2);
                i2 = min2;
            }
            if (i2 == 0) {
                i2 = c14833b.m77522a(bArr, i3, m77506a, 0, true);
            }
            if (i2 != -1) {
                c14833b.f28285c += i2;
            }
            if (i2 == -1) {
                if (z) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f28348l += i2;
            this.f28346j += i2;
            return i2;
        } finally {
            m77499c();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final void mo77422a(int i, C15121n c15121n) {
        if (!this.f28343g.compareAndSet(0, 1)) {
            c15121n.m77197e(c15121n.f29805b + i);
            return;
        }
        while (i > 0) {
            int m77506a = m77506a(i);
            C15069a c15069a = this.f28347k;
            c15121n.m77205a(c15069a.f29622a, c15069a.f29623b + this.f28348l, m77506a);
            this.f28348l += m77506a;
            this.f28346j += m77506a;
            i -= m77506a;
        }
        m77499c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r
    /* renamed from: a */
    public final void mo77421a(long j, int i, int i2, int i3, byte[] bArr) {
        if (!this.f28343g.compareAndSet(0, 1)) {
            C14836e c14836e = this.f28339c;
            synchronized (c14836e) {
                c14836e.f28307n = Math.max(c14836e.f28307n, j);
            }
            return;
        }
        try {
            if (this.f28349m) {
                if ((i & 1) != 0 && this.f28339c.m77518a(j)) {
                    this.f28349m = false;
                }
                return;
            }
            this.f28339c.m77517a(j, i, (this.f28346j - i2) - i3, i2, bArr);
        } finally {
            m77499c();
        }
    }

    /* renamed from: a */
    public final void m77507a() {
        C14836e c14836e = this.f28339c;
        c14836e.f28303j = 0;
        c14836e.f28304k = 0;
        c14836e.f28305l = 0;
        c14836e.f28302i = 0;
        c14836e.f28308o = true;
        InterfaceC15070b interfaceC15070b = this.f28337a;
        LinkedBlockingDeque linkedBlockingDeque = this.f28340d;
        ((C15093l) interfaceC15070b).m77243a((C15069a[]) linkedBlockingDeque.toArray(new C15069a[linkedBlockingDeque.size()]));
        this.f28340d.clear();
        ((C15093l) this.f28337a).m77245a();
        this.f28344h = 0L;
        this.f28346j = 0L;
        this.f28347k = null;
        this.f28348l = this.f28338b;
    }

    /* renamed from: a */
    public final int m77506a(int i) {
        C15069a c15069a;
        if (this.f28348l == this.f28338b) {
            this.f28348l = 0;
            C15093l c15093l = (C15093l) this.f28337a;
            synchronized (c15093l) {
                c15093l.f29714c++;
                int i2 = c15093l.f29715d;
                if (i2 > 0) {
                    C15069a[] c15069aArr = c15093l.f29716e;
                    int i3 = i2 - 1;
                    c15093l.f29715d = i3;
                    c15069a = c15069aArr[i3];
                    c15069aArr[i3] = null;
                } else {
                    c15069a = new C15069a(0, new byte[65536]);
                }
            }
            this.f28347k = c15069a;
            this.f28340d.add(c15069a);
        }
        return Math.min(i, this.f28338b - this.f28348l);
    }
}

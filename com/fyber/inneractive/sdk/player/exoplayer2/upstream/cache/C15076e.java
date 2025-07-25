package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15068E;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15090i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e */
/* loaded from: classes4.dex */
public final class C15076e implements InterfaceC15089h {

    /* renamed from: a */
    public final C15083l f29635a;

    /* renamed from: b */
    public final InterfaceC15089h f29636b;

    /* renamed from: c */
    public final C15068E f29637c;

    /* renamed from: d */
    public final InterfaceC15089h f29638d;

    /* renamed from: e */
    public final boolean f29639e = false;

    /* renamed from: f */
    public final boolean f29640f = true;

    /* renamed from: g */
    public final boolean f29641g = false;

    /* renamed from: h */
    public InterfaceC15089h f29642h;

    /* renamed from: i */
    public boolean f29643i;

    /* renamed from: j */
    public Uri f29644j;

    /* renamed from: k */
    public int f29645k;

    /* renamed from: l */
    public String f29646l;

    /* renamed from: m */
    public long f29647m;

    /* renamed from: n */
    public long f29648n;

    /* renamed from: o */
    public C15084m f29649o;

    /* renamed from: p */
    public boolean f29650p;

    /* renamed from: q */
    public boolean f29651q;

    public C15076e(C15083l c15083l, InterfaceC15089h interfaceC15089h, InterfaceC15089h interfaceC15089h2, C15074c c15074c) {
        this.f29635a = c15083l;
        this.f29636b = interfaceC15089h2;
        this.f29638d = interfaceC15089h;
        if (c15074c != null) {
            this.f29637c = new C15068E(interfaceC15089h, c15074c);
        } else {
            this.f29637c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        try {
            Uri uri = c15092k.f29706a;
            this.f29644j = uri;
            this.f29645k = c15092k.f29711f;
            String str = c15092k.f29710e;
            if (str == null) {
                str = uri.toString();
            }
            this.f29646l = str;
            this.f29647m = c15092k.f29708c;
            boolean z = (this.f29640f && this.f29650p) || (c15092k.f29709d == -1 && this.f29641g);
            this.f29651q = z;
            long j = c15092k.f29709d;
            if (j == -1 && !z) {
                long m77249a = this.f29635a.m77249a(str);
                this.f29648n = m77249a;
                if (m77249a != -1) {
                    long j2 = m77249a - c15092k.f29708c;
                    this.f29648n = j2;
                    if (j2 <= 0) {
                        throw new C15090i();
                    }
                }
                m77260a(true);
                return this.f29648n;
            }
            this.f29648n = j;
            m77260a(true);
            return this.f29648n;
        } catch (IOException e) {
            if (this.f29642h == this.f29636b || (e instanceof C15072a)) {
                this.f29650p = true;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public final void m77259b() {
        InterfaceC15089h interfaceC15089h = this.f29642h;
        if (interfaceC15089h == null) {
            return;
        }
        try {
            interfaceC15089h.close();
            this.f29642h = null;
            this.f29643i = false;
            C15084m c15084m = this.f29649o;
            if (c15084m != null) {
                C15083l c15083l = this.f29635a;
                synchronized (c15083l) {
                    if (c15084m == c15083l.f29679c.remove(c15084m.f29656a)) {
                        c15083l.notifyAll();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                this.f29649o = null;
            }
        } catch (Throwable th) {
            C15084m c15084m2 = this.f29649o;
            if (c15084m2 != null) {
                this.f29635a.m77247b(c15084m2);
                this.f29649o = null;
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        this.f29644j = null;
        try {
            m77259b();
        } catch (IOException e) {
            if (this.f29642h == this.f29636b || (e instanceof C15072a)) {
                this.f29650p = true;
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f29648n == 0) {
            return -1;
        }
        try {
            int read = this.f29642h.read(bArr, i, i2);
            if (read >= 0) {
                long j = read;
                this.f29647m += j;
                long j2 = this.f29648n;
                if (j2 != -1) {
                    this.f29648n = j2 - j;
                }
            } else {
                if (this.f29643i) {
                    m77261a(this.f29647m);
                    this.f29648n = 0L;
                }
                m77259b();
                long j3 = this.f29648n;
                if ((j3 > 0 || j3 == -1) && m77260a(false)) {
                    return read(bArr, i, i2);
                }
            }
            return read;
        } catch (IOException e) {
            if (this.f29642h == this.f29636b || (e instanceof C15072a)) {
                this.f29650p = true;
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        InterfaceC15089h interfaceC15089h = this.f29642h;
        return interfaceC15089h == this.f29638d ? interfaceC15089h.mo77235a() : this.f29644j;
    }

    /* renamed from: a */
    public final boolean m77260a(boolean z) {
        C15084m m77248a;
        C15092k c15092k;
        C15092k c15092k2;
        long j;
        IOException iOException = null;
        if (this.f29651q) {
            m77248a = null;
        } else if (this.f29639e) {
            try {
                C15083l c15083l = this.f29635a;
                String str = this.f29646l;
                long j2 = this.f29647m;
                synchronized (c15083l) {
                    while (true) {
                        m77248a = c15083l.m77248a(str, j2);
                        if (m77248a != null) {
                            break;
                        }
                        c15083l.wait();
                    }
                }
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            m77248a = this.f29635a.m77248a(this.f29646l, this.f29647m);
        }
        if (m77248a == null) {
            this.f29642h = this.f29638d;
            Uri uri = this.f29644j;
            long j3 = this.f29647m;
            c15092k2 = new C15092k(uri, j3, j3, this.f29648n, this.f29646l, this.f29645k);
        } else {
            if (m77248a.f29659d) {
                Uri fromFile = Uri.fromFile(m77248a.f29660e);
                long j4 = this.f29647m - m77248a.f29657b;
                long j5 = m77248a.f29658c - j4;
                long j6 = this.f29648n;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
                c15092k = new C15092k(fromFile, this.f29647m, j4, j5, this.f29646l, this.f29645k);
                this.f29642h = this.f29636b;
            } else {
                long j7 = m77248a.f29658c;
                if (j7 == -1) {
                    j7 = this.f29648n;
                } else {
                    long j8 = this.f29648n;
                    if (j8 != -1) {
                        j7 = Math.min(j7, j8);
                    }
                }
                Uri uri2 = this.f29644j;
                long j9 = this.f29647m;
                c15092k = new C15092k(uri2, j9, j9, j7, this.f29646l, this.f29645k);
                C15068E c15068e = this.f29637c;
                if (c15068e != null) {
                    this.f29642h = c15068e;
                    this.f29649o = m77248a;
                } else {
                    this.f29642h = this.f29638d;
                    this.f29635a.m77247b(m77248a);
                }
            }
            c15092k2 = c15092k;
        }
        boolean z2 = true;
        this.f29643i = c15092k2.f29709d == -1;
        try {
            j = this.f29642h.mo77234a(c15092k2);
        } catch (IOException e) {
            if (!z && this.f29643i) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if ((th instanceof C15090i) && ((C15090i) th).f29699a == 0) {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException != null) {
                throw iOException;
            }
            z2 = false;
            j = 0;
        }
        if (this.f29643i && j != -1) {
            this.f29648n = j;
            m77261a(c15092k2.f29708c + j);
        }
        return z2;
    }

    /* renamed from: a */
    public final void m77261a(long j) {
        if (this.f29642h == this.f29637c) {
            C15083l c15083l = this.f29635a;
            String str = this.f29646l;
            synchronized (c15083l) {
                C15080i c15080i = c15083l.f29680d;
                C15079h c15079h = (C15079h) c15080i.f29666a.get(str);
                if (c15079h != null) {
                    if (c15079h.f29665d != j) {
                        c15079h.f29665d = j;
                        c15080i.f29671f = true;
                    }
                } else {
                    c15080i.m77256a(str, j);
                }
                c15083l.f29680d.m77255b();
            }
        }
    }
}

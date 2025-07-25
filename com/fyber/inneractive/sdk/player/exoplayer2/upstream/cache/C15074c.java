package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15123p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c */
/* loaded from: classes4.dex */
public final class C15074c {

    /* renamed from: a */
    public final C15083l f29624a;

    /* renamed from: b */
    public final long f29625b = 10485760;

    /* renamed from: c */
    public final int f29626c = 20480;

    /* renamed from: d */
    public C15092k f29627d;

    /* renamed from: e */
    public File f29628e;

    /* renamed from: f */
    public OutputStream f29629f;

    /* renamed from: g */
    public FileOutputStream f29630g;

    /* renamed from: h */
    public long f29631h;

    /* renamed from: i */
    public long f29632i;

    /* renamed from: j */
    public C15123p f29633j;

    public C15074c(C15083l c15083l) {
        this.f29624a = c15083l;
    }

    /* renamed from: a */
    public final void m77263a() {
        OutputStream outputStream = this.f29629f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f29630g.getFD().sync();
            AbstractC15133z.m77160a(this.f29629f);
            this.f29629f = null;
            File file = this.f29628e;
            this.f29628e = null;
            C15083l c15083l = this.f29624a;
            synchronized (c15083l) {
                C15084m m77246a = C15084m.m77246a(file, c15083l.f29680d);
                if (m77246a != null) {
                    if (c15083l.f29679c.containsKey(m77246a.f29656a)) {
                        if (file.exists()) {
                            if (file.length() == 0) {
                                file.delete();
                                return;
                            }
                            long m77249a = c15083l.m77249a(m77246a.f29656a);
                            if (m77249a != -1 && m77246a.f29657b + m77246a.f29658c > m77249a) {
                                throw new IllegalStateException();
                            }
                            c15083l.m77250a(m77246a);
                            c15083l.f29680d.m77255b();
                            c15083l.notifyAll();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            AbstractC15133z.m77160a(this.f29629f);
            this.f29629f = null;
            File file2 = this.f29628e;
            this.f29628e = null;
            file2.delete();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m77262b() {
        long min;
        File file;
        long j = this.f29627d.f29709d;
        if (j == -1) {
            min = this.f29625b;
        } else {
            min = Math.min(j - this.f29632i, this.f29625b);
        }
        C15083l c15083l = this.f29624a;
        C15092k c15092k = this.f29627d;
        String str = c15092k.f29710e;
        long j2 = c15092k.f29707b + this.f29632i;
        synchronized (c15083l) {
            if (c15083l.f29679c.containsKey(str)) {
                if (!c15083l.f29677a.exists()) {
                    c15083l.m77253a();
                    c15083l.f29677a.mkdirs();
                }
                c15083l.f29678b.m77254a(c15083l, min);
                File file2 = c15083l.f29677a;
                C15080i c15080i = c15083l.f29680d;
                C15079h c15079h = (C15079h) c15080i.f29666a.get(str);
                if (c15079h == null) {
                    c15079h = c15080i.m77256a(str, -1L);
                }
                int i = c15079h.f29662a;
                long currentTimeMillis = System.currentTimeMillis();
                Pattern pattern = C15084m.f29683g;
                file = new File(file2, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
            } else {
                throw new IllegalStateException();
            }
        }
        this.f29628e = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f29628e);
        this.f29630g = fileOutputStream;
        if (this.f29626c > 0) {
            C15123p c15123p = this.f29633j;
            if (c15123p == null) {
                this.f29633j = new C15123p(this.f29630g, this.f29626c);
            } else {
                c15123p.m77176a(fileOutputStream);
            }
            this.f29629f = this.f29633j;
        } else {
            this.f29629f = fileOutputStream;
        }
        this.f29631h = 0L;
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C15073b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C15074c;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.E */
/* loaded from: classes4.dex */
public final class C15068E implements InterfaceC15089h {

    /* renamed from: a */
    public final InterfaceC15089h f29620a;

    /* renamed from: b */
    public final C15074c f29621b;

    public C15068E(InterfaceC15089h interfaceC15089h, C15074c c15074c) {
        interfaceC15089h.getClass();
        this.f29620a = interfaceC15089h;
        c15074c.getClass();
        this.f29621b = c15074c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        C15092k c15092k2 = c15092k;
        long mo77234a = this.f29620a.mo77234a(c15092k2);
        if (c15092k2.f29709d == -1 && mo77234a != -1) {
            c15092k2 = new C15092k(c15092k2.f29706a, c15092k2.f29707b, c15092k2.f29708c, mo77234a, c15092k2.f29710e, c15092k2.f29711f);
        }
        C15074c c15074c = this.f29621b;
        c15074c.getClass();
        if (c15092k2.f29709d == -1 && (c15092k2.f29711f & 2) != 2) {
            c15074c.f29627d = null;
        } else {
            c15074c.f29627d = c15092k2;
            c15074c.f29632i = 0L;
            try {
                c15074c.m77262b();
            } catch (IOException e) {
                throw new C15073b(e);
            }
        }
        return mo77234a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        try {
            this.f29620a.close();
            C15074c c15074c = this.f29621b;
            if (c15074c.f29627d != null) {
                try {
                    c15074c.m77263a();
                } catch (IOException e) {
                    throw new C15073b(e);
                }
            }
        } catch (Throwable th) {
            C15074c c15074c2 = this.f29621b;
            if (c15074c2.f29627d != null) {
                try {
                    c15074c2.m77263a();
                } catch (IOException e2) {
                    throw new C15073b(e2);
                }
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f29620a.read(bArr, i, i2);
        if (read > 0) {
            C15074c c15074c = this.f29621b;
            if (c15074c.f29627d != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (c15074c.f29631h == c15074c.f29625b) {
                            c15074c.m77263a();
                            c15074c.m77262b();
                        }
                        int min = (int) Math.min(read - i3, c15074c.f29625b - c15074c.f29631h);
                        c15074c.f29629f.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        c15074c.f29631h += j;
                        c15074c.f29632i += j;
                    } catch (IOException e) {
                        throw new C15073b(e);
                    }
                }
            }
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        return this.f29620a.mo77235a();
    }
}

package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.io.EOFException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g */
/* loaded from: classes4.dex */
public final class C14920g {

    /* renamed from: h */
    public static final int f28981h = AbstractC15133z.m77158a("OggS");

    /* renamed from: a */
    public int f28982a;

    /* renamed from: b */
    public long f28983b;

    /* renamed from: c */
    public int f28984c;

    /* renamed from: d */
    public int f28985d;

    /* renamed from: e */
    public int f28986e;

    /* renamed from: f */
    public final int[] f28987f = new int[255];

    /* renamed from: g */
    public final C15121n f28988g = new C15121n(255);

    /* renamed from: a */
    public final boolean m77435a(C14833b c14833b, boolean z) {
        int i;
        C15121n c15121n = this.f28988g;
        c15121n.f29805b = 0;
        c15121n.f29806c = 0;
        this.f28982a = 0;
        this.f28983b = 0L;
        this.f28984c = 0;
        this.f28985d = 0;
        this.f28986e = 0;
        long j = c14833b.f28284b;
        if ((j != -1 && j - (c14833b.f28285c + c14833b.f28287e) < 27) || !c14833b.m77521a(c15121n.f29804a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f28988g.m77191k() != f28981h) {
            if (z) {
                return false;
            }
            throw new C15017r("expected OggS capture pattern at begin of page");
        } else if (this.f28988g.m77192j() != 0) {
            if (z) {
                return false;
            }
            throw new C15017r("unsupported bit stream revision");
        } else {
            this.f28982a = this.f28988g.m77192j();
            C15121n c15121n2 = this.f28988g;
            byte[] bArr = c15121n2.f29804a;
            c15121n2.f29805b = c15121n2.f29805b + 8;
            this.f28983b = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((255 & bArr[i + 7]) << 56);
            c15121n2.m77198e();
            this.f28988g.m77198e();
            this.f28988g.m77198e();
            int m77192j = this.f28988g.m77192j();
            this.f28984c = m77192j;
            this.f28985d = m77192j + 27;
            C15121n c15121n3 = this.f28988g;
            c15121n3.f29805b = 0;
            c15121n3.f29806c = 0;
            c14833b.m77521a(c15121n3.f29804a, 0, m77192j, false);
            for (int i2 = 0; i2 < this.f28984c; i2++) {
                this.f28987f[i2] = this.f28988g.m77192j();
                this.f28986e += this.f28987f[i2];
            }
            return true;
        }
    }
}

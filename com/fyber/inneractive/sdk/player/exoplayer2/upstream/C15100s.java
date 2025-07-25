package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.s */
/* loaded from: classes4.dex */
public final class C15100s implements InterfaceC15089h {

    /* renamed from: a */
    public final C15094m f29753a;

    /* renamed from: b */
    public RandomAccessFile f29754b;

    /* renamed from: c */
    public Uri f29755c;

    /* renamed from: d */
    public long f29756d;

    /* renamed from: e */
    public boolean f29757e;

    public C15100s(C15094m c15094m) {
        this.f29753a = c15094m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        try {
            this.f29755c = c15092k.f29706a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c15092k.f29706a.getPath(), "r");
            this.f29754b = randomAccessFile;
            randomAccessFile.seek(c15092k.f29708c);
            long j = c15092k.f29709d;
            if (j == -1) {
                j = this.f29754b.length() - c15092k.f29708c;
            }
            this.f29756d = j;
            if (j >= 0) {
                this.f29757e = true;
                C15094m c15094m = this.f29753a;
                if (c15094m != null) {
                    synchronized (c15094m) {
                        if (c15094m.f29718b == 0) {
                            c15094m.f29719c = SystemClock.elapsedRealtime();
                        }
                        c15094m.f29718b++;
                    }
                }
                return this.f29756d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C15099r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        this.f29755c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f29754b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C15099r(e);
            }
        } finally {
            this.f29754b = null;
            if (this.f29757e) {
                this.f29757e = false;
                C15094m c15094m = this.f29753a;
                if (c15094m != null) {
                    c15094m.m77242a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f29756d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f29754b.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                long j2 = read;
                this.f29756d -= j2;
                C15094m c15094m = this.f29753a;
                if (c15094m != null) {
                    synchronized (c15094m) {
                        c15094m.f29720d += j2;
                    }
                }
            }
            return read;
        } catch (IOException e) {
            throw new C15099r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        return this.f29755c;
    }
}

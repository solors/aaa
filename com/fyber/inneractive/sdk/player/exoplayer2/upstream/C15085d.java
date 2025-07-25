package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.d */
/* loaded from: classes4.dex */
public final class C15085d implements InterfaceC15089h {

    /* renamed from: a */
    public final AssetManager f29686a;

    /* renamed from: b */
    public final C15094m f29687b;

    /* renamed from: c */
    public Uri f29688c;

    /* renamed from: d */
    public InputStream f29689d;

    /* renamed from: e */
    public long f29690e;

    /* renamed from: f */
    public boolean f29691f;

    public C15085d(Context context, C15094m c15094m) {
        this.f29686a = context.getAssets();
        this.f29687b = c15094m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        try {
            Uri uri = c15092k.f29706a;
            this.f29688c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            InputStream open = this.f29686a.open(path, 1);
            this.f29689d = open;
            if (open.skip(c15092k.f29708c) >= c15092k.f29708c) {
                long j = c15092k.f29709d;
                if (j != -1) {
                    this.f29690e = j;
                } else {
                    long available = this.f29689d.available();
                    this.f29690e = available;
                    if (available == 2147483647L) {
                        this.f29690e = -1L;
                    }
                }
                this.f29691f = true;
                C15094m c15094m = this.f29687b;
                if (c15094m != null) {
                    synchronized (c15094m) {
                        if (c15094m.f29718b == 0) {
                            c15094m.f29719c = SystemClock.elapsedRealtime();
                        }
                        c15094m.f29718b++;
                    }
                }
                return this.f29690e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C15071c(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        this.f29688c = null;
        try {
            try {
                InputStream inputStream = this.f29689d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C15071c(e);
            }
        } finally {
            this.f29689d = null;
            if (this.f29691f) {
                this.f29691f = false;
                C15094m c15094m = this.f29687b;
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
        long j = this.f29690e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C15071c(e);
            }
        }
        int read = this.f29689d.read(bArr, i, i2);
        if (read == -1) {
            if (this.f29690e == -1) {
                return -1;
            }
            throw new C15071c(new EOFException());
        }
        long j2 = this.f29690e;
        if (j2 != -1) {
            this.f29690e = j2 - read;
        }
        C15094m c15094m = this.f29687b;
        if (c15094m != null) {
            synchronized (c15094m) {
                c15094m.f29720d += read;
            }
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        return this.f29688c;
    }
}

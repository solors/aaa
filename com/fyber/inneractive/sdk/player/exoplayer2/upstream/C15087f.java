package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.f */
/* loaded from: classes4.dex */
public final class C15087f implements InterfaceC15089h {

    /* renamed from: a */
    public final ContentResolver f29692a;

    /* renamed from: b */
    public final C15094m f29693b;

    /* renamed from: c */
    public Uri f29694c;

    /* renamed from: d */
    public AssetFileDescriptor f29695d;

    /* renamed from: e */
    public FileInputStream f29696e;

    /* renamed from: f */
    public long f29697f;

    /* renamed from: g */
    public boolean f29698g;

    public C15087f(Context context, C15094m c15094m) {
        this.f29692a = context.getContentResolver();
        this.f29693b = c15094m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        try {
            Uri uri = c15092k.f29706a;
            this.f29694c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f29692a.openAssetFileDescriptor(uri, "r");
            this.f29695d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f29696e = new FileInputStream(this.f29695d.getFileDescriptor());
                long startOffset = this.f29695d.getStartOffset();
                if (this.f29696e.skip(c15092k.f29708c + startOffset) - startOffset == c15092k.f29708c) {
                    long j = c15092k.f29709d;
                    if (j != -1) {
                        this.f29697f = j;
                    } else {
                        long length = this.f29695d.getLength();
                        this.f29697f = length;
                        if (length == -1) {
                            long available = this.f29696e.available();
                            this.f29697f = available;
                            if (available == 0) {
                                this.f29697f = -1L;
                            }
                        }
                    }
                    this.f29698g = true;
                    C15094m c15094m = this.f29693b;
                    if (c15094m != null) {
                        synchronized (c15094m) {
                            if (c15094m.f29718b == 0) {
                                c15094m.f29719c = SystemClock.elapsedRealtime();
                            }
                            c15094m.f29718b++;
                        }
                    }
                    return this.f29697f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f29694c);
        } catch (IOException e) {
            throw new C15086e(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        this.f29694c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f29696e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f29696e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f29695d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C15086e(e);
                    }
                } finally {
                    this.f29695d = null;
                    if (this.f29698g) {
                        this.f29698g = false;
                        C15094m c15094m = this.f29693b;
                        if (c15094m != null) {
                            c15094m.m77242a();
                        }
                    }
                }
            } catch (IOException e2) {
                throw new C15086e(e2);
            }
        } catch (Throwable th) {
            this.f29696e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f29695d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f29695d = null;
                    if (this.f29698g) {
                        this.f29698g = false;
                        C15094m c15094m2 = this.f29693b;
                        if (c15094m2 != null) {
                            c15094m2.m77242a();
                        }
                    }
                    throw th;
                } finally {
                    this.f29695d = null;
                    if (this.f29698g) {
                        this.f29698g = false;
                        C15094m c15094m3 = this.f29693b;
                        if (c15094m3 != null) {
                            c15094m3.m77242a();
                        }
                    }
                }
            } catch (IOException e3) {
                throw new C15086e(e3);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f29697f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C15086e(e);
            }
        }
        int read = this.f29696e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f29697f == -1) {
                return -1;
            }
            throw new C15086e(new EOFException());
        }
        long j2 = this.f29697f;
        if (j2 != -1) {
            this.f29697f = j2 - read;
        }
        C15094m c15094m = this.f29693b;
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
        return this.f29694c;
    }
}

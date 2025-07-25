package com.fyber.inneractive.sdk.player.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.cache.j */
/* loaded from: classes4.dex */
public final class C14756j implements Closeable {

    /* renamed from: a */
    public final InputStream f27968a;

    /* renamed from: b */
    public final Charset f27969b;

    /* renamed from: c */
    public byte[] f27970c;

    /* renamed from: d */
    public int f27971d;

    /* renamed from: e */
    public int f27972e;

    public C14756j(FileInputStream fileInputStream) {
        Charset charset = AbstractC14757k.f27973a;
        charset.getClass();
        if (charset.equals(charset)) {
            this.f27968a = fileInputStream;
            this.f27969b = charset;
            this.f27970c = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }

    /* renamed from: a */
    public final String m77642a() {
        int i;
        synchronized (this.f27968a) {
            byte[] bArr = this.f27970c;
            if (bArr != null) {
                if (this.f27971d >= this.f27972e) {
                    int read = this.f27968a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f27971d = 0;
                        this.f27972e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i2 = this.f27971d; i2 != this.f27972e; i2++) {
                    byte[] bArr2 = this.f27970c;
                    if (bArr2[i2] == 10) {
                        int i3 = this.f27971d;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.f27969b.name());
                                this.f27971d = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.f27969b.name());
                        this.f27971d = i2 + 1;
                        return str2;
                    }
                }
                C14755i c14755i = new C14755i(this, (this.f27972e - this.f27971d) + 80);
                while (true) {
                    byte[] bArr3 = this.f27970c;
                    int i4 = this.f27971d;
                    c14755i.write(bArr3, i4, this.f27972e - i4);
                    this.f27972e = -1;
                    InputStream inputStream = this.f27968a;
                    byte[] bArr4 = this.f27970c;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f27971d = 0;
                        this.f27972e = read2;
                        for (int i5 = 0; i5 != this.f27972e; i5++) {
                            byte[] bArr5 = this.f27970c;
                            if (bArr5[i5] == 10) {
                                int i6 = this.f27971d;
                                if (i5 != i6) {
                                    c14755i.write(bArr5, i6, i5 - i6);
                                }
                                this.f27971d = i5 + 1;
                                return c14755i.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f27968a) {
            if (this.f27970c != null) {
                this.f27970c = null;
                this.f27968a.close();
            }
        }
    }
}

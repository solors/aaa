package com.inmobi.media;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.inmobi.media.Ua */
/* loaded from: classes6.dex */
public final class C19127Ua implements Closeable {

    /* renamed from: a */
    public final InputStream f47842a;

    /* renamed from: b */
    public final Charset f47843b;

    /* renamed from: c */
    public byte[] f47844c;

    /* renamed from: d */
    public int f47845d;

    /* renamed from: e */
    public int f47846e;

    public C19127Ua(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (charset.equals(AbstractC19128Ub.f47847a)) {
            this.f47842a = fileInputStream;
            this.f47843b = charset;
            this.f47844c = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }

    /* renamed from: a */
    public final String m60639a() {
        int i;
        synchronized (this.f47842a) {
            byte[] bArr = this.f47844c;
            if (bArr != null) {
                if (this.f47845d >= this.f47846e) {
                    int read = this.f47842a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f47845d = 0;
                        this.f47846e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i2 = this.f47845d; i2 != this.f47846e; i2++) {
                    byte[] bArr2 = this.f47844c;
                    if (bArr2[i2] == 10) {
                        int i3 = this.f47845d;
                        if (i2 != i3) {
                            i = i2 - 1;
                            if (bArr2[i] == 13) {
                                String str = new String(bArr2, i3, i - i3, this.f47843b.name());
                                this.f47845d = i2 + 1;
                                return str;
                            }
                        }
                        i = i2;
                        String str2 = new String(bArr2, i3, i - i3, this.f47843b.name());
                        this.f47845d = i2 + 1;
                        return str2;
                    }
                }
                C19114Ta c19114Ta = new C19114Ta(this, (this.f47846e - this.f47845d) + 80);
                while (true) {
                    byte[] bArr3 = this.f47844c;
                    int i4 = this.f47845d;
                    c19114Ta.write(bArr3, i4, this.f47846e - i4);
                    this.f47846e = -1;
                    InputStream inputStream = this.f47842a;
                    byte[] bArr4 = this.f47844c;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f47845d = 0;
                        this.f47846e = read2;
                        for (int i5 = 0; i5 != this.f47846e; i5++) {
                            byte[] bArr5 = this.f47844c;
                            if (bArr5[i5] == 10) {
                                int i6 = this.f47845d;
                                if (i5 != i6) {
                                    c19114Ta.write(bArr5, i6, i5 - i6);
                                }
                                this.f47845d = i5 + 1;
                                return c19114Ta.toString();
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
        synchronized (this.f47842a) {
            if (this.f47844c != null) {
                this.f47844c = null;
                this.f47842a.close();
            }
        }
    }
}

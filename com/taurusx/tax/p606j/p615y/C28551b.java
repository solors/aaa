package com.taurusx.tax.p606j.p615y;

import com.taurusx.tax.C28162a;
import com.taurusx.tax.p606j.C28517d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.taurusx.tax.j.y.b */
/* loaded from: classes7.dex */
public class C28551b implements Closeable {

    /* renamed from: a */
    public final InputStream f74003a;

    /* renamed from: b */
    public final Charset f74004b;

    /* renamed from: c */
    public byte[] f74005c;

    /* renamed from: d */
    public int f74006d;

    /* renamed from: e */
    public int f74007e;

    /* renamed from: com.taurusx.tax.j.y.b$a */
    /* loaded from: classes7.dex */
    public class C28552a extends ByteArrayOutputStream {
        public C28552a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C28551b.this.f74004b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C28551b(InputStream inputStream, int i, Charset charset) {
        if (inputStream != null && charset != null) {
            if (i >= 0) {
                if (charset.equals(C28517d.f73959a)) {
                    this.f74003a = inputStream;
                    this.f74004b = charset;
                    this.f74005c = new byte[i];
                    return;
                }
                throw new IllegalArgumentException(C28162a.m38504a(new byte[]{-30, 109, -60, 118, -57, 115, -40, 113, -61, 102, -45, 35, -46, 109, -44, 108, -45, 106, -39, 100}, new byte[]{-73, 3}));
            }
            throw new IllegalArgumentException(C28162a.m38504a(new byte[]{-4, 56, -17, 56, -4, 48, -21, 32, -65, 101, -94, 121, -81}, new byte[]{-97, 89}));
        }
        throw null;
    }

    /* renamed from: a */
    public final void m37957a() throws IOException {
        InputStream inputStream = this.f74003a;
        byte[] bArr = this.f74005c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f74006d = 0;
            this.f74007e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public String m37956b() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f74003a) {
            if (this.f74005c != null) {
                if (this.f74006d >= this.f74007e) {
                    m37957a();
                }
                for (int i3 = this.f74006d; i3 != this.f74007e; i3++) {
                    byte[] bArr2 = this.f74005c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f74006d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f74004b.name());
                                this.f74006d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f74004b.name());
                        this.f74006d = i3 + 1;
                        return str2;
                    }
                }
                C28552a c28552a = new C28552a((this.f74007e - this.f74006d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f74005c;
                    int i5 = this.f74006d;
                    c28552a.write(bArr3, i5, this.f74007e - i5);
                    this.f74007e = -1;
                    m37957a();
                    i = this.f74006d;
                    while (i != this.f74007e) {
                        bArr = this.f74005c;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.f74006d;
                if (i != i6) {
                    c28552a.write(bArr, i6, i - i6);
                }
                this.f74006d = i + 1;
                return c28552a.toString();
            }
            throw new IOException(C28162a.f73047a.m23824a(new byte[]{-74, -1, -108, -13, -88, -13, -101, -14, -97, -28, -38, -1, -119, -74, -103, -6, -107, -27, -97, -14}, new byte[]{-6, -106}));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f74003a) {
            if (this.f74005c != null) {
                this.f74005c = null;
                this.f74003a.close();
            }
        }
    }
}

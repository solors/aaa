package com.bytedance.sdk.component.p275zx.p277bX.p280bg.p282bg;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bX */
/* loaded from: classes3.dex */
class C7810bX implements Closeable {

    /* renamed from: IL */
    private final Charset f17037IL;

    /* renamed from: bX */
    private byte[] f17038bX;

    /* renamed from: bg */
    private final InputStream f17039bg;
    private int eqN;

    /* renamed from: zx */
    private int f17040zx;

    public C7810bX(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: bX */
    private void m87675bX() throws IOException {
        InputStream inputStream = this.f17039bg;
        byte[] bArr = this.f17038bX;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.eqN = 0;
            this.f17040zx = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: IL */
    public boolean m87676IL() {
        if (this.f17040zx == -1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f17039bg) {
            if (this.f17038bX != null) {
                this.f17038bX = null;
                this.f17039bg.close();
            }
        }
    }

    public C7810bX(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(C7819eqN.f17070bg)) {
                this.f17039bg = inputStream;
                this.f17037IL = charset;
                this.f17038bX = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    /* renamed from: bg */
    public String m87674bg() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f17039bg) {
            if (this.f17038bX != null) {
                if (this.eqN >= this.f17040zx) {
                    m87675bX();
                }
                for (int i3 = this.eqN; i3 != this.f17040zx; i3++) {
                    byte[] bArr2 = this.f17038bX;
                    if (bArr2[i3] == 10) {
                        int i4 = this.eqN;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f17037IL.name());
                                this.eqN = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f17037IL.name());
                        this.eqN = i3 + 1;
                        return str2;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f17040zx - this.eqN) + 80) { // from class: com.bytedance.sdk.component.zx.bX.bg.bg.bX.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i5 = ((ByteArrayOutputStream) this).count;
                        if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                            i5--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i5, C7810bX.this.f17037IL.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.f17038bX;
                    int i5 = this.eqN;
                    byteArrayOutputStream.write(bArr3, i5, this.f17040zx - i5);
                    this.f17040zx = -1;
                    m87675bX();
                    i = this.eqN;
                    while (i != this.f17040zx) {
                        bArr = this.f17038bX;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.eqN;
                if (i != i6) {
                    byteArrayOutputStream.write(bArr, i6, i - i6);
                }
                this.eqN = i + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}

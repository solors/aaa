package com.mobilefuse.videoplayer.utils.lrucache;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes7.dex */
class StrictLineReader implements Closeable {

    /* renamed from: CR */
    private static final byte f61735CR = 13;

    /* renamed from: LF */
    private static final byte f61736LF = 10;
    private byte[] buf;
    private final Charset charset;
    private int end;

    /* renamed from: in */
    private final InputStream f61737in;
    private int pos;

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void fillBuf() throws IOException {
        InputStream inputStream = this.f61737in;
        byte[] bArr = this.buf;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.pos = 0;
            this.end = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f61737in) {
            if (this.buf != null) {
                this.buf = null;
                this.f61737in.close();
            }
        }
    }

    public boolean hasUnterminatedLine() {
        if (this.end == -1) {
            return true;
        }
        return false;
    }

    public String readLine() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f61737in) {
            if (this.buf != null) {
                if (this.pos >= this.end) {
                    fillBuf();
                }
                for (int i3 = this.pos; i3 != this.end; i3++) {
                    byte[] bArr2 = this.buf;
                    if (bArr2[i3] == 10) {
                        int i4 = this.pos;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.charset.name());
                                this.pos = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.charset.name());
                        this.pos = i3 + 1;
                        return str2;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.end - this.pos) + 80) { // from class: com.mobilefuse.videoplayer.utils.lrucache.StrictLineReader.1
                    @Override // java.io.ByteArrayOutputStream
                    @NonNull
                    public String toString() {
                        int i5 = ((ByteArrayOutputStream) this).count;
                        if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                            i5--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i5, StrictLineReader.this.charset.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.buf;
                    int i5 = this.pos;
                    byteArrayOutputStream.write(bArr3, i5, this.end - i5);
                    this.end = -1;
                    fillBuf();
                    i = this.pos;
                    while (i != this.end) {
                        bArr = this.buf;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.pos;
                if (i != i6) {
                    byteArrayOutputStream.write(bArr, i6, i - i6);
                }
                this.pos = i + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public StrictLineReader(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(Util.US_ASCII)) {
                this.f61737in = inputStream;
                this.charset = charset;
                this.buf = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}

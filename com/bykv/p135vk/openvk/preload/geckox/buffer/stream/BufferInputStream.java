package com.bykv.p135vk.openvk.preload.geckox.buffer.stream;

import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bykv.vk.openvk.preload.geckox.buffer.stream.a */
/* loaded from: classes3.dex */
public final class BufferInputStream extends InputStream {

    /* renamed from: a */
    private Buffer f14006a;

    /* renamed from: b */
    private long f14007b;

    public BufferInputStream(Buffer buffer) {
        this.f14006a = buffer;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long mo91349b = this.f14006a.mo91349b() - this.f14006a.mo91345c();
        if (mo91349b > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) mo91349b;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f14007b = i;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f14006a.mo91347b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f14006a.mo91348b(this.f14007b);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        return this.f14006a.mo91352a(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f14006a.mo91346b(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f14006a.mo91344d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}

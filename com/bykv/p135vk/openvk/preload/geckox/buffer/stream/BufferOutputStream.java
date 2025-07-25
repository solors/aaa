package com.bykv.p135vk.openvk.preload.geckox.buffer.stream;

import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import java.io.IOException;

/* renamed from: com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream */
/* loaded from: classes3.dex */
public class BufferOutputStream extends RandomOutputStream {
    private Buffer mBuffer;

    public BufferOutputStream(Buffer buffer) {
        this.mBuffer = buffer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.mBuffer.mo91353a(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mBuffer.mo91351a(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.mBuffer.mo91350a(bArr, i, i2);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.stream.RandomOutputStream
    public void write(long j, int i) throws IOException {
        synchronized (this) {
            this.mBuffer.mo91348b(j);
            this.mBuffer.mo91353a(i);
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.stream.RandomOutputStream
    public void write(long j, byte[] bArr) throws IOException {
        synchronized (this) {
            this.mBuffer.mo91348b(j);
            this.mBuffer.mo91351a(bArr);
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.stream.RandomOutputStream
    public void write(long j, byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            this.mBuffer.mo91348b(j);
            this.mBuffer.mo91350a(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }
}

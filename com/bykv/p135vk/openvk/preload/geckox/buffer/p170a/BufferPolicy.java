package com.bykv.p135vk.openvk.preload.geckox.buffer.p170a;

import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bykv.vk.openvk.preload.geckox.buffer.a.a */
/* loaded from: classes3.dex */
public final class BufferPolicy implements Buffer {

    /* renamed from: a */
    private RandomAccessFile f13998a;

    /* renamed from: b */
    private AtomicBoolean f13999b = new AtomicBoolean(false);

    /* renamed from: c */
    private File f14000c;

    private BufferPolicy(File file) throws IOException {
        this.f14000c = file;
        file.getParentFile().mkdirs();
        try {
            this.f13998a = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            CloseableUtils.close(this.f13998a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static Buffer m91356a(File file, long j) throws IOException {
        Buffer m91355b = m91355b(file, j);
        GeckoLogger.m91263d("gecko-debug-tag", "buffer type:" + m91355b.getClass());
        return m91355b;
    }

    /* renamed from: b */
    private static Buffer m91355b(File file, long j) throws IOException {
        if (j <= 0) {
            try {
                return new BufferPolicy(file);
            } catch (Exception e) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e.getMessage(), e);
            }
        }
        try {
            return new RAFBuffer(j, file);
        } catch (Exception e2) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: c */
    public final long mo91345c() throws IOException {
        if (!this.f13999b.get()) {
            return this.f13998a.getFilePointer();
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: d */
    public final int mo91344d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo91347b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: e */
    public final void mo91343e() {
        if (this.f13999b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f13998a);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: f */
    public final File mo91342f() {
        return this.f14000c;
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: a */
    public final void mo91354a() throws IOException {
        if (this.f13999b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: a */
    public final void mo91353a(int i) throws IOException {
        mo91351a(new byte[]{(byte) i});
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: a */
    public final void mo91351a(byte[] bArr) throws IOException {
        mo91350a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: a */
    public final synchronized long mo91352a(long j) throws IOException {
        int i;
        if (this.f13999b.get()) {
            throw new IOException("released!");
        }
        i = (int) j;
        if (i == j) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return this.f13998a.skipBytes(i);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    public final long mo91349b() throws IOException {
        return this.f13998a.length();
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    public final void mo91348b(long j) throws IOException {
        if (!this.f13999b.get()) {
            if (j < 0) {
                j = 0;
            }
            this.f13998a.seek(j);
            return;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    public final int mo91347b(byte[] bArr) throws IOException {
        return mo91346b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: a */
    public final int mo91350a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f13999b.get()) {
            if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                this.f13998a.write(bArr, i, i2);
            }
            return i2;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    public final int mo91346b(byte[] bArr, int i, int i2) throws IOException {
        int read;
        if (!this.f13999b.get()) {
            if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                read = this.f13998a.read(bArr, i, i2);
            }
            return read;
        }
        throw new IOException("released!");
    }
}

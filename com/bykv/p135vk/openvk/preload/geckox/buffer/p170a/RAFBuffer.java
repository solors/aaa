package com.bykv.p135vk.openvk.preload.geckox.buffer.p170a;

import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bykv.vk.openvk.preload.geckox.buffer.a.b */
/* loaded from: classes3.dex */
final class RAFBuffer implements Buffer {

    /* renamed from: a */
    private long f14001a;

    /* renamed from: b */
    private long f14002b;

    /* renamed from: c */
    private RandomAccessFile f14003c;

    /* renamed from: d */
    private AtomicBoolean f14004d = new AtomicBoolean(false);

    /* renamed from: e */
    private File f14005e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RAFBuffer(long j, File file) throws IOException {
        this.f14001a = j;
        this.f14005e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f14003c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e) {
            CloseableUtils.close(this.f14003c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: a */
    public final void mo91354a() throws IOException {
        if (this.f14004d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    public final long mo91349b() {
        return this.f14001a;
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: c */
    public final long mo91345c() throws IOException {
        if (!this.f14004d.get()) {
            return this.f14002b;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: d */
    public final int mo91344d() throws IOException {
        byte[] bArr = new byte[1];
        if (mo91347b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: e */
    public final void mo91343e() {
        if (this.f14004d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f14003c);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: f */
    public final File mo91342f() {
        return this.f14005e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r4 > r0) goto L5;
     */
    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo91348b(long r4) throws java.io.IOException {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f14004d
            boolean r0 = r0.get()
            if (r0 != 0) goto L1f
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
        Le:
            r4 = r0
            goto L17
        L10:
            long r0 = r3.f14001a
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto Le
        L17:
            r3.f14002b = r4
            java.io.RandomAccessFile r0 = r3.f14003c
            r0.seek(r4)
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "released!"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.preload.geckox.buffer.p170a.RAFBuffer.mo91348b(long):void");
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
        int skipBytes;
        if (this.f14004d.get()) {
            throw new IOException("released!");
        }
        int i = (int) j;
        if (i == j) {
            skipBytes = this.f14003c.skipBytes(i);
            this.f14002b = this.f14003c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return skipBytes;
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    public final int mo91347b(byte[] bArr) throws IOException {
        return mo91346b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: b */
    public final int mo91346b(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f14004d.get()) {
            if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.f14002b;
                long j2 = this.f14001a;
                if (j == j2) {
                    return -1;
                }
                if (i2 + j > j2) {
                    i2 = (int) (j2 - j);
                }
                int read = this.f14003c.read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                this.f14002b += read;
                return read;
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer
    /* renamed from: a */
    public final int mo91350a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f14004d.get()) {
            if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                long j = this.f14002b;
                long j2 = this.f14001a;
                if (j == j2) {
                    return 0;
                }
                if (i2 + j > j2) {
                    i2 = (int) (j2 - j);
                }
                this.f14003c.write(bArr, i, i2);
                this.f14002b += i2;
                return i2;
            }
        }
        throw new IOException("released!");
    }
}

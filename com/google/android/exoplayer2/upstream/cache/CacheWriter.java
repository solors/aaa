package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes4.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;

    /* renamed from: a */
    private final CacheDataSource f35971a;

    /* renamed from: b */
    private final Cache f35972b;

    /* renamed from: c */
    private final DataSpec f35973c;

    /* renamed from: d */
    private final String f35974d;

    /* renamed from: e */
    private final byte[] f35975e;
    @Nullable

    /* renamed from: f */
    private final ProgressListener f35976f;

    /* renamed from: g */
    private long f35977g;

    /* renamed from: h */
    private long f35978h;

    /* renamed from: i */
    private long f35979i;

    /* renamed from: j */
    private volatile boolean f35980j;

    /* loaded from: classes4.dex */
    public interface ProgressListener {
        void onProgress(long j, long j2, long j3);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, @Nullable byte[] bArr, @Nullable ProgressListener progressListener) {
        this.f35971a = cacheDataSource;
        this.f35972b = cacheDataSource.getCache();
        this.f35973c = dataSpec;
        this.f35975e = bArr == null ? new byte[131072] : bArr;
        this.f35976f = progressListener;
        this.f35974d = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.f35977g = dataSpec.position;
    }

    /* renamed from: a */
    private long m72728a() {
        long j = this.f35978h;
        if (j == -1) {
            return -1L;
        }
        return j - this.f35973c.position;
    }

    /* renamed from: b */
    private void m72727b(long j) {
        this.f35979i += j;
        ProgressListener progressListener = this.f35976f;
        if (progressListener != null) {
            progressListener.onProgress(m72728a(), this.f35979i, j);
        }
    }

    /* renamed from: c */
    private void m72726c(long j) {
        if (this.f35978h == j) {
            return;
        }
        this.f35978h = j;
        ProgressListener progressListener = this.f35976f;
        if (progressListener != null) {
            progressListener.onProgress(m72728a(), this.f35979i, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: IOException -> 0x0068, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: IOException -> 0x0068, TRY_LEAVE, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long m72725d(long r7, long r9) throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r7 + r9
            long r2 = r6.f35978h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L13
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = r2
            goto L14
        L13:
            r0 = r1
        L14:
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L36
            com.google.android.exoplayer2.upstream.DataSpec r5 = r6.f35973c
            com.google.android.exoplayer2.upstream.DataSpec$Builder r5 = r5.buildUpon()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r5 = r5.setPosition(r7)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r5.setLength(r9)
            com.google.android.exoplayer2.upstream.DataSpec r9 = r9.build()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r10 = r6.f35971a     // Catch: java.io.IOException -> L31
            long r9 = r10.open(r9)     // Catch: java.io.IOException -> L31
            goto L38
        L31:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r9 = r6.f35971a
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r9)
        L36:
            r1 = r2
            r9 = r3
        L38:
            if (r1 != 0) goto L5d
            r6.m72724e()
            com.google.android.exoplayer2.upstream.DataSpec r9 = r6.f35973c
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.buildUpon()
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.setPosition(r7)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r9 = r9.setLength(r3)
            com.google.android.exoplayer2.upstream.DataSpec r9 = r9.build()
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r10 = r6.f35971a     // Catch: java.io.IOException -> L56
            long r9 = r10.open(r9)     // Catch: java.io.IOException -> L56
            goto L5d
        L56:
            r7 = move-exception
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r8 = r6.f35971a
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r8)
            throw r7
        L5d:
            if (r0 == 0) goto L6a
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L6a
            long r9 = r9 + r7
            r6.m72726c(r9)     // Catch: java.io.IOException -> L68
            goto L6a
        L68:
            r7 = move-exception
            goto L8b
        L6a:
            r9 = r2
            r10 = r9
        L6c:
            r1 = -1
            if (r9 == r1) goto L83
            r6.m72724e()     // Catch: java.io.IOException -> L68
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r9 = r6.f35971a     // Catch: java.io.IOException -> L68
            byte[] r3 = r6.f35975e     // Catch: java.io.IOException -> L68
            int r4 = r3.length     // Catch: java.io.IOException -> L68
            int r9 = r9.read(r3, r2, r4)     // Catch: java.io.IOException -> L68
            if (r9 == r1) goto L6c
            long r3 = (long) r9     // Catch: java.io.IOException -> L68
            r6.m72727b(r3)     // Catch: java.io.IOException -> L68
            int r10 = r10 + r9
            goto L6c
        L83:
            if (r0 == 0) goto L91
            long r0 = (long) r10     // Catch: java.io.IOException -> L68
            long r7 = r7 + r0
            r6.m72726c(r7)     // Catch: java.io.IOException -> L68
            goto L91
        L8b:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r8 = r6.f35971a
            com.google.android.exoplayer2.upstream.DataSourceUtil.closeQuietly(r8)
            throw r7
        L91:
            com.google.android.exoplayer2.upstream.cache.CacheDataSource r7 = r6.f35971a
            r7.close()
            long r7 = (long) r10
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.CacheWriter.m72725d(long, long):long");
    }

    /* renamed from: e */
    private void m72724e() throws InterruptedIOException {
        if (!this.f35980j) {
            return;
        }
        throw new InterruptedIOException();
    }

    @WorkerThread
    public void cache() throws IOException {
        long j;
        m72724e();
        Cache cache = this.f35972b;
        String str = this.f35974d;
        DataSpec dataSpec = this.f35973c;
        this.f35979i = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.f35973c;
        long j2 = dataSpec2.length;
        if (j2 != -1) {
            this.f35978h = dataSpec2.position + j2;
        } else {
            long contentLength = ContentMetadata.getContentLength(this.f35972b.getContentMetadata(this.f35974d));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.f35978h = contentLength;
        }
        ProgressListener progressListener = this.f35976f;
        if (progressListener != null) {
            progressListener.onProgress(m72728a(), this.f35979i, 0L);
        }
        while (true) {
            long j3 = this.f35978h;
            if (j3 != -1 && this.f35977g >= j3) {
                return;
            }
            m72724e();
            long j4 = this.f35978h;
            if (j4 == -1) {
                j = Long.MAX_VALUE;
            } else {
                j = j4 - this.f35977g;
            }
            long cachedLength = this.f35972b.getCachedLength(this.f35974d, this.f35977g, j);
            if (cachedLength > 0) {
                this.f35977g += cachedLength;
            } else {
                long j5 = -cachedLength;
                if (j5 == Long.MAX_VALUE) {
                    j5 = -1;
                }
                long j6 = this.f35977g;
                this.f35977g = j6 + m72725d(j6, j5);
            }
        }
    }

    public void cancel() {
        this.f35980j = true;
    }
}

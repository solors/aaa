package io.bidmachine.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

@UnstableApi
/* loaded from: classes9.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    @Nullable
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    /* loaded from: classes9.dex */
    public interface ProgressListener {
        void onProgress(long j, long j2, long j3);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, @Nullable byte[] bArr, @Nullable ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    private long getLength() {
        long j = this.endPosition;
        if (j == -1) {
            return -1L;
        }
        return j - this.dataSpec.position;
    }

    private void onNewBytesCached(long j) {
        this.bytesCached += j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: IOException -> 0x0068, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: IOException -> 0x0068, TRY_LEAVE, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long readBlockToCache(long r7, long r9) throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r7 + r9
            long r2 = r6.endPosition
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
            io.bidmachine.media3.datasource.DataSpec r5 = r6.dataSpec
            io.bidmachine.media3.datasource.DataSpec$Builder r5 = r5.buildUpon()
            io.bidmachine.media3.datasource.DataSpec$Builder r5 = r5.setPosition(r7)
            io.bidmachine.media3.datasource.DataSpec$Builder r9 = r5.setLength(r9)
            io.bidmachine.media3.datasource.DataSpec r9 = r9.build()
            io.bidmachine.media3.datasource.cache.CacheDataSource r10 = r6.dataSource     // Catch: java.io.IOException -> L31
            long r9 = r10.open(r9)     // Catch: java.io.IOException -> L31
            goto L38
        L31:
            io.bidmachine.media3.datasource.cache.CacheDataSource r9 = r6.dataSource
            io.bidmachine.media3.datasource.DataSourceUtil.closeQuietly(r9)
        L36:
            r1 = r2
            r9 = r3
        L38:
            if (r1 != 0) goto L5d
            r6.throwIfCanceled()
            io.bidmachine.media3.datasource.DataSpec r9 = r6.dataSpec
            io.bidmachine.media3.datasource.DataSpec$Builder r9 = r9.buildUpon()
            io.bidmachine.media3.datasource.DataSpec$Builder r9 = r9.setPosition(r7)
            io.bidmachine.media3.datasource.DataSpec$Builder r9 = r9.setLength(r3)
            io.bidmachine.media3.datasource.DataSpec r9 = r9.build()
            io.bidmachine.media3.datasource.cache.CacheDataSource r10 = r6.dataSource     // Catch: java.io.IOException -> L56
            long r9 = r10.open(r9)     // Catch: java.io.IOException -> L56
            goto L5d
        L56:
            r7 = move-exception
            io.bidmachine.media3.datasource.cache.CacheDataSource r8 = r6.dataSource
            io.bidmachine.media3.datasource.DataSourceUtil.closeQuietly(r8)
            throw r7
        L5d:
            if (r0 == 0) goto L6a
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L6a
            long r9 = r9 + r7
            r6.onRequestEndPosition(r9)     // Catch: java.io.IOException -> L68
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
            r6.throwIfCanceled()     // Catch: java.io.IOException -> L68
            io.bidmachine.media3.datasource.cache.CacheDataSource r9 = r6.dataSource     // Catch: java.io.IOException -> L68
            byte[] r3 = r6.temporaryBuffer     // Catch: java.io.IOException -> L68
            int r4 = r3.length     // Catch: java.io.IOException -> L68
            int r9 = r9.read(r3, r2, r4)     // Catch: java.io.IOException -> L68
            if (r9 == r1) goto L6c
            long r3 = (long) r9     // Catch: java.io.IOException -> L68
            r6.onNewBytesCached(r3)     // Catch: java.io.IOException -> L68
            int r10 = r10 + r9
            goto L6c
        L83:
            if (r0 == 0) goto L91
            long r0 = (long) r10     // Catch: java.io.IOException -> L68
            long r7 = r7 + r0
            r6.onRequestEndPosition(r7)     // Catch: java.io.IOException -> L68
            goto L91
        L8b:
            io.bidmachine.media3.datasource.cache.CacheDataSource r8 = r6.dataSource
            io.bidmachine.media3.datasource.DataSourceUtil.closeQuietly(r8)
            throw r7
        L91:
            io.bidmachine.media3.datasource.cache.CacheDataSource r7 = r6.dataSource
            r7.close()
            long r7 = (long) r10
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.datasource.cache.CacheWriter.readBlockToCache(long, long):long");
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (!this.isCanceled) {
            return;
        }
        throw new InterruptedIOException();
    }

    @WorkerThread
    public void cache() throws IOException {
        long j;
        throwIfCanceled();
        Cache cache = this.cache;
        String str = this.cacheKey;
        DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.dataSpec;
        long j2 = dataSpec2.length;
        if (j2 != -1) {
            this.endPosition = dataSpec2.position + j2;
        } else {
            long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j3 = this.endPosition;
            if (j3 != -1 && this.nextPosition >= j3) {
                return;
            }
            throwIfCanceled();
            long j4 = this.endPosition;
            if (j4 == -1) {
                j = Long.MAX_VALUE;
            } else {
                j = j4 - this.nextPosition;
            }
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j5 = -cachedLength;
                if (j5 == Long.MAX_VALUE) {
                    j5 = -1;
                }
                long j6 = this.nextPosition;
                this.nextPosition = j6 + readBlockToCache(j6, j5);
            }
        }
    }

    public void cancel() {
        this.isCanceled = true;
    }
}

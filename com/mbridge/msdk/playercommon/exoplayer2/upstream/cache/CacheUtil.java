package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class CacheUtil {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;

    /* loaded from: classes6.dex */
    public static class CachingCounters {
        public volatile long alreadyCachedBytes;
        public volatile long contentLength = -1;
        public volatile long newlyCachedBytes;

        public long totalCachedBytes() {
            return this.alreadyCachedBytes + this.newlyCachedBytes;
        }
    }

    private CacheUtil() {
    }

    public static void cache(DataSpec dataSpec, Cache cache, DataSource dataSource, @Nullable CachingCounters cachingCounters, @Nullable AtomicBoolean atomicBoolean) throws IOException, InterruptedException {
        cache(dataSpec, cache, new CacheDataSource(cache, dataSource), new byte[131072], null, 0, cachingCounters, atomicBoolean, false);
    }

    public static String generateKey(Uri uri) {
        return uri.toString();
    }

    public static void getCached(DataSpec dataSpec, Cache cache, CachingCounters cachingCounters) {
        long j;
        String key = getKey(dataSpec);
        long j2 = dataSpec.absoluteStreamPosition;
        long j3 = dataSpec.length;
        if (j3 == -1) {
            j3 = cache.getContentLength(key);
        }
        cachingCounters.contentLength = j3;
        cachingCounters.alreadyCachedBytes = 0L;
        cachingCounters.newlyCachedBytes = 0L;
        long j4 = j2;
        long j5 = j3;
        while (j5 != 0) {
            int i = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
            if (i != 0) {
                j = j5;
            } else {
                j = Long.MAX_VALUE;
            }
            long cachedLength = cache.getCachedLength(key, j4, j);
            if (cachedLength > 0) {
                cachingCounters.alreadyCachedBytes += cachedLength;
            } else {
                cachedLength = -cachedLength;
                if (cachedLength == Long.MAX_VALUE) {
                    return;
                }
            }
            j4 += cachedLength;
            if (i == 0) {
                cachedLength = 0;
            }
            j5 -= cachedLength;
        }
    }

    public static String getKey(DataSpec dataSpec) {
        String str = dataSpec.key;
        if (str == null) {
            return generateKey(dataSpec.uri);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0084, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long readAndDiscard(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec r16, long r17, long r19, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource r21, byte[] r22, com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager r23, int r24, com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil.CachingCounters r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = r21
            r0 = r22
            r2 = r25
            r3 = r16
        L8:
            if (r23 == 0) goto Ld
            r23.proceed(r24)
        Ld:
            boolean r4 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            if (r4 != 0) goto L87
            com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec r4 = new com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            android.net.Uri r6 = r3.uri     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            byte[] r7 = r3.postBody     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            long r8 = r3.position     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            long r8 = r8 + r17
            long r10 = r3.absoluteStreamPosition     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            long r10 = r8 - r10
            r12 = -1
            java.lang.String r14 = r3.key     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            int r5 = r3.flags     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            r15 = r5 | 2
            r5 = r4
            r8 = r17
            r5.<init>(r6, r7, r8, r10, r12, r14, r15)     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            long r5 = r1.open(r4)     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            long r7 = r2.contentLength     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L44
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 == 0) goto L44
            long r7 = r4.absoluteStreamPosition     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            long r7 = r7 + r5
            r2.contentLength = r7     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
        L44:
            r5 = 0
        L46:
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 == 0) goto L81
            boolean r3 = java.lang.Thread.interrupted()     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            if (r3 != 0) goto L7b
            int r3 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r3 == 0) goto L5e
            int r3 = r0.length     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            long r7 = (long) r3     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            long r11 = r19 - r5
            long r7 = java.lang.Math.min(r7, r11)     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            int r3 = (int) r7     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            goto L5f
        L5e:
            int r3 = r0.length     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
        L5f:
            r7 = 0
            int r3 = r1.read(r0, r7, r3)     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            r7 = -1
            if (r3 != r7) goto L73
            long r7 = r2.contentLength     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L81
            long r7 = r4.absoluteStreamPosition     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            long r7 = r7 + r5
            r2.contentLength = r7     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            goto L81
        L73:
            long r7 = (long) r3     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            long r5 = r5 + r7
            long r11 = r2.newlyCachedBytes     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            long r11 = r11 + r7
            r2.newlyCachedBytes = r11     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            goto L46
        L7b:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            r3.<init>()     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
            throw r3     // Catch: com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L85 java.lang.Throwable -> L8d
        L81:
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly(r21)
            return r5
        L85:
            r3 = r4
            goto L92
        L87:
            java.lang.InterruptedException r4 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            r4.<init>()     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
            throw r4     // Catch: java.lang.Throwable -> L8d com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager.PriorityTooLowException -> L92
        L8d:
            r0 = move-exception
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly(r21)
            throw r0
        L92:
            com.mbridge.msdk.playercommon.exoplayer2.util.Util.closeQuietly(r21)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil.readAndDiscard(com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec, long, long, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource, byte[], com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager, int, com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil$CachingCounters):long");
    }

    public static void remove(Cache cache, String str) {
        for (CacheSpan cacheSpan : cache.getCachedSpans(str)) {
            try {
                cache.removeSpan(cacheSpan);
            } catch (Cache.CacheException unused) {
            }
        }
    }

    public static void cache(DataSpec dataSpec, Cache cache, CacheDataSource cacheDataSource, byte[] bArr, PriorityTaskManager priorityTaskManager, int i, @Nullable CachingCounters cachingCounters, @Nullable AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        CachingCounters cachingCounters2 = cachingCounters;
        Assertions.checkNotNull(cacheDataSource);
        Assertions.checkNotNull(bArr);
        if (cachingCounters2 != null) {
            getCached(dataSpec, cache, cachingCounters2);
        } else {
            cachingCounters2 = new CachingCounters();
        }
        CachingCounters cachingCounters3 = cachingCounters2;
        String key = getKey(dataSpec);
        long j = dataSpec.absoluteStreamPosition;
        long j2 = dataSpec.length;
        if (j2 == -1) {
            j2 = cache.getContentLength(key);
        }
        long j3 = j;
        long j4 = j2;
        while (true) {
            long j5 = 0;
            if (j4 == 0) {
                return;
            }
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            int i2 = (j4 > (-1L) ? 1 : (j4 == (-1L) ? 0 : -1));
            long cachedLength = cache.getCachedLength(key, j3, i2 != 0 ? j4 : Long.MAX_VALUE);
            if (cachedLength <= 0) {
                long j6 = -cachedLength;
                if (readAndDiscard(dataSpec, j3, j6, cacheDataSource, bArr, priorityTaskManager, i, cachingCounters3) < j6) {
                    if (z && i2 != 0) {
                        throw new EOFException();
                    }
                    return;
                }
                cachedLength = j6;
            }
            j3 += cachedLength;
            if (i2 != 0) {
                j5 = cachedLength;
            }
            j4 -= j5;
        }
    }
}

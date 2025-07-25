package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.util.Comparator;
import java.util.TreeSet;

@UnstableApi
/* loaded from: classes2.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    private long currentSize;
    private final TreeSet<CacheSpan> leastRecentlyUsed = new TreeSet<>(new Comparator() { // from class: androidx.media3.datasource.cache.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LeastRecentlyUsedCacheEvictor.m104539a((CacheSpan) obj, (CacheSpan) obj2);
        }
    });
    private final long maxBytes;

    public LeastRecentlyUsedCacheEvictor(long j) {
        this.maxBytes = j;
    }

    /* renamed from: a */
    public static /* synthetic */ int m104539a(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        return compare(cacheSpan, cacheSpan2);
    }

    public static int compare(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j = cacheSpan.lastTouchTimestamp;
        long j2 = cacheSpan2.lastTouchTimestamp;
        if (j - j2 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    private void evictCache(Cache cache, long j) {
        while (this.currentSize + j > this.maxBytes && !this.leastRecentlyUsed.isEmpty()) {
            cache.removeSpan(this.leastRecentlyUsed.first());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.add(cacheSpan);
        this.currentSize += cacheSpan.length;
        evictCache(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        this.leastRecentlyUsed.remove(cacheSpan);
        this.currentSize -= cacheSpan.length;
    }

    @Override // androidx.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            evictCache(cache, j2);
        }
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.CacheEvictor
    public void onCacheInitialized() {
    }
}

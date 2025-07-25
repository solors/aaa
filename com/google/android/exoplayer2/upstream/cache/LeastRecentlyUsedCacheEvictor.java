package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {

    /* renamed from: a */
    private final long f36007a;

    /* renamed from: b */
    private final TreeSet<CacheSpan> f36008b = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.upstream.cache.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LeastRecentlyUsedCacheEvictor.m72697a((CacheSpan) obj, (CacheSpan) obj2);
        }
    });

    /* renamed from: c */
    private long f36009c;

    public LeastRecentlyUsedCacheEvictor(long j) {
        this.f36007a = j;
    }

    /* renamed from: a */
    public static /* synthetic */ int m72697a(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        return m72696b(cacheSpan, cacheSpan2);
    }

    /* renamed from: b */
    public static int m72696b(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
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

    /* renamed from: c */
    private void m72695c(Cache cache, long j) {
        while (this.f36009c + j > this.f36007a && !this.f36008b.isEmpty()) {
            cache.removeSpan(this.f36008b.first());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        this.f36008b.add(cacheSpan);
        this.f36009c += cacheSpan.length;
        m72695c(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        this.f36008b.remove(cacheSpan);
        this.f36009c -= cacheSpan.length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        onSpanRemoved(cache, cacheSpan);
        onSpanAdded(cache, cacheSpan2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            m72695c(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }
}

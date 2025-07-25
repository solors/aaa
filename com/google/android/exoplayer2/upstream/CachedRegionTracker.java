package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;

    /* renamed from: a */
    private final Cache f35743a;

    /* renamed from: b */
    private final String f35744b;

    /* renamed from: c */
    private final ChunkIndex f35745c;

    /* renamed from: d */
    private final TreeSet<Region> f35746d = new TreeSet<>();

    /* renamed from: e */
    private final Region f35747e = new Region(0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class Region implements Comparable<Region> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public Region(long j, long j2) {
            this.startOffset = j;
            this.endOffset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Region region) {
            return Util.compareLong(this.startOffset, region.startOffset);
        }
    }

    public CachedRegionTracker(Cache cache, String str, ChunkIndex chunkIndex) {
        this.f35743a = cache;
        this.f35744b = str;
        this.f35745c = chunkIndex;
        synchronized (this) {
            Iterator<CacheSpan> descendingIterator = cache.addListener(str, this).descendingIterator();
            while (descendingIterator.hasNext()) {
                m72802a(descendingIterator.next());
            }
        }
    }

    /* renamed from: a */
    private void m72802a(CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        Region region = new Region(j, cacheSpan.length + j);
        Region floor = this.f35746d.floor(region);
        Region ceiling = this.f35746d.ceiling(region);
        boolean m72801b = m72801b(floor, region);
        if (m72801b(region, ceiling)) {
            if (m72801b) {
                floor.endOffset = ceiling.endOffset;
                floor.endOffsetIndex = ceiling.endOffsetIndex;
            } else {
                region.endOffset = ceiling.endOffset;
                region.endOffsetIndex = ceiling.endOffsetIndex;
                this.f35746d.add(region);
            }
            this.f35746d.remove(ceiling);
        } else if (m72801b) {
            floor.endOffset = region.endOffset;
            int i = floor.endOffsetIndex;
            while (true) {
                ChunkIndex chunkIndex = this.f35745c;
                if (i >= chunkIndex.length - 1) {
                    break;
                }
                int i2 = i + 1;
                if (chunkIndex.offsets[i2] > floor.endOffset) {
                    break;
                }
                i = i2;
            }
            floor.endOffsetIndex = i;
        } else {
            int binarySearch = Arrays.binarySearch(this.f35745c.offsets, region.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region.endOffsetIndex = binarySearch;
            this.f35746d.add(region);
        }
    }

    /* renamed from: b */
    private boolean m72801b(@Nullable Region region, @Nullable Region region2) {
        if (region != null && region2 != null && region.endOffset == region2.startOffset) {
            return true;
        }
        return false;
    }

    public synchronized int getRegionEndTimeMs(long j) {
        int i;
        Region region = this.f35747e;
        region.startOffset = j;
        Region floor = this.f35746d.floor(region);
        if (floor != null) {
            long j2 = floor.endOffset;
            if (j <= j2 && (i = floor.endOffsetIndex) != -1) {
                ChunkIndex chunkIndex = this.f35745c;
                if (i == chunkIndex.length - 1) {
                    if (j2 == chunkIndex.offsets[i] + chunkIndex.sizes[i]) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i] + ((chunkIndex.durationsUs[i] * (j2 - chunkIndex.offsets[i])) / chunkIndex.sizes[i])) / 1000);
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        m72802a(cacheSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        Region region = new Region(j, cacheSpan.length + j);
        Region floor = this.f35746d.floor(region);
        if (floor == null) {
            Log.m72606e("CachedRegionTracker", "Removed a span we were not aware of");
            return;
        }
        this.f35746d.remove(floor);
        long j2 = floor.startOffset;
        long j3 = region.startOffset;
        if (j2 < j3) {
            Region region2 = new Region(j2, j3);
            int binarySearch = Arrays.binarySearch(this.f35745c.offsets, region2.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            region2.endOffsetIndex = binarySearch;
            this.f35746d.add(region2);
        }
        long j4 = floor.endOffset;
        long j5 = region.endOffset;
        if (j4 > j5) {
            Region region3 = new Region(j5 + 1, j4);
            region3.endOffsetIndex = floor.endOffsetIndex;
            this.f35746d.add(region3);
        }
    }

    public void release() {
        this.f35743a.removeListener(this.f35744b, this);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }
}

package io.bidmachine.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.cache.Cache;
import io.bidmachine.media3.datasource.cache.CacheSpan;
import io.bidmachine.media3.extractor.ChunkIndex;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

@UnstableApi
/* loaded from: classes9.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String TAG = "CachedRegionTracker";
    private final Cache cache;
    private final String cacheKey;
    private final ChunkIndex chunkIndex;
    private final TreeSet<C36453a> regions = new TreeSet<>();
    private final C36453a lookupRegion = new C36453a(0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.media3.exoplayer.upstream.CachedRegionTracker$a */
    /* loaded from: classes9.dex */
    public static class C36453a implements Comparable<C36453a> {
        public long endOffset;
        public int endOffsetIndex;
        public long startOffset;

        public C36453a(long j, long j2) {
            this.startOffset = j;
            this.endOffset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(C36453a c36453a) {
            return Util.compareLong(this.startOffset, c36453a.startOffset);
        }
    }

    public CachedRegionTracker(Cache cache, String str, ChunkIndex chunkIndex) {
        this.cache = cache;
        this.cacheKey = str;
        this.chunkIndex = chunkIndex;
        synchronized (this) {
            Iterator<CacheSpan> descendingIterator = cache.addListener(str, this).descendingIterator();
            while (descendingIterator.hasNext()) {
                mergeSpan(descendingIterator.next());
            }
        }
    }

    private void mergeSpan(CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        C36453a c36453a = new C36453a(j, cacheSpan.length + j);
        C36453a floor = this.regions.floor(c36453a);
        C36453a ceiling = this.regions.ceiling(c36453a);
        boolean regionsConnect = regionsConnect(floor, c36453a);
        if (regionsConnect(c36453a, ceiling)) {
            if (regionsConnect) {
                floor.endOffset = ceiling.endOffset;
                floor.endOffsetIndex = ceiling.endOffsetIndex;
            } else {
                c36453a.endOffset = ceiling.endOffset;
                c36453a.endOffsetIndex = ceiling.endOffsetIndex;
                this.regions.add(c36453a);
            }
            this.regions.remove(ceiling);
        } else if (regionsConnect) {
            floor.endOffset = c36453a.endOffset;
            int i = floor.endOffsetIndex;
            while (true) {
                ChunkIndex chunkIndex = this.chunkIndex;
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
            int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, c36453a.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            c36453a.endOffsetIndex = binarySearch;
            this.regions.add(c36453a);
        }
    }

    private boolean regionsConnect(@Nullable C36453a c36453a, @Nullable C36453a c36453a2) {
        if (c36453a != null && c36453a2 != null && c36453a.endOffset == c36453a2.startOffset) {
            return true;
        }
        return false;
    }

    public synchronized int getRegionEndTimeMs(long j) {
        int i;
        C36453a c36453a = this.lookupRegion;
        c36453a.startOffset = j;
        C36453a floor = this.regions.floor(c36453a);
        if (floor != null) {
            long j2 = floor.endOffset;
            if (j <= j2 && (i = floor.endOffsetIndex) != -1) {
                ChunkIndex chunkIndex = this.chunkIndex;
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

    @Override // io.bidmachine.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanAdded(Cache cache, CacheSpan cacheSpan) {
        mergeSpan(cacheSpan);
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache.Listener
    public synchronized void onSpanRemoved(Cache cache, CacheSpan cacheSpan) {
        long j = cacheSpan.position;
        C36453a c36453a = new C36453a(j, cacheSpan.length + j);
        C36453a floor = this.regions.floor(c36453a);
        if (floor == null) {
            Log.m19949e(TAG, "Removed a span we were not aware of");
            return;
        }
        this.regions.remove(floor);
        long j2 = floor.startOffset;
        long j3 = c36453a.startOffset;
        if (j2 < j3) {
            C36453a c36453a2 = new C36453a(j2, j3);
            int binarySearch = Arrays.binarySearch(this.chunkIndex.offsets, c36453a2.endOffset);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            c36453a2.endOffsetIndex = binarySearch;
            this.regions.add(c36453a2);
        }
        long j4 = floor.endOffset;
        long j5 = c36453a.endOffset;
        if (j4 > j5) {
            C36453a c36453a3 = new C36453a(j5 + 1, j4);
            c36453a3.endOffsetIndex = floor.endOffsetIndex;
            this.regions.add(c36453a3);
        }
    }

    public void release() {
        this.cache.removeListener(this.cacheKey, this);
    }

    @Override // io.bidmachine.media3.datasource.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2) {
    }
}

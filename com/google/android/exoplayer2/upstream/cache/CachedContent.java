package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CachedContent {

    /* renamed from: a */
    private final TreeSet<SimpleCacheSpan> f35981a;

    /* renamed from: b */
    private final ArrayList<Range> f35982b;

    /* renamed from: c */
    private DefaultContentMetadata f35983c;

    /* renamed from: id */
    public final int f35984id;
    public final String key;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Range {
        public final long length;
        public final long position;

        public Range(long j, long j2) {
            this.position = j;
            this.length = j2;
        }

        public boolean contains(long j, long j2) {
            long j3 = this.length;
            if (j3 == -1) {
                if (j >= this.position) {
                    return true;
                }
                return false;
            } else if (j2 == -1) {
                return false;
            } else {
                long j4 = this.position;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
                return false;
            }
        }

        public boolean intersects(long j, long j2) {
            long j3 = this.position;
            if (j3 <= j) {
                long j4 = this.length;
                if (j4 != -1 && j3 + j4 <= j) {
                    return false;
                }
                return true;
            } else if (j2 != -1 && j + j2 <= j3) {
                return false;
            } else {
                return true;
            }
        }
    }

    public CachedContent(int i, String str) {
        this(i, str, DefaultContentMetadata.EMPTY);
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.f35981a.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        DefaultContentMetadata defaultContentMetadata = this.f35983c;
        DefaultContentMetadata copyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.f35983c = copyWithMutationsApplied;
        return !copyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CachedContent.class != obj.getClass()) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) obj;
        if (this.f35984id == cachedContent.f35984id && this.key.equals(cachedContent.key) && this.f35981a.equals(cachedContent.f35981a) && this.f35983c.equals(cachedContent.f35983c)) {
            return true;
        }
        return false;
    }

    public long getCachedBytesLength(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (j2 < 0) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        SimpleCacheSpan span = getSpan(j, j2);
        long j3 = Long.MAX_VALUE;
        if (span.isHoleSpan()) {
            if (!span.isOpenEnded()) {
                j3 = span.length;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        if (j4 >= 0) {
            j3 = j4;
        }
        long j5 = span.position + span.length;
        if (j5 < j3) {
            for (SimpleCacheSpan simpleCacheSpan : this.f35981a.tailSet(span, false)) {
                long j6 = simpleCacheSpan.position;
                if (j6 > j5) {
                    break;
                }
                j5 = Math.max(j5, j6 + simpleCacheSpan.length);
                if (j5 >= j3) {
                    break;
                }
            }
        }
        return Math.min(j5 - j, j2);
    }

    public DefaultContentMetadata getMetadata() {
        return this.f35983c;
    }

    public SimpleCacheSpan getSpan(long j, long j2) {
        SimpleCacheSpan createLookup = SimpleCacheSpan.createLookup(this.key, j);
        SimpleCacheSpan floor = this.f35981a.floor(createLookup);
        if (floor != null && floor.position + floor.length > j) {
            return floor;
        }
        SimpleCacheSpan ceiling = this.f35981a.ceiling(createLookup);
        if (ceiling != null) {
            long j3 = ceiling.position - j;
            if (j2 == -1) {
                j2 = j3;
            } else {
                j2 = Math.min(j3, j2);
            }
        }
        return SimpleCacheSpan.createHole(this.key, j, j2);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.f35981a;
    }

    public int hashCode() {
        return (((this.f35984id * 31) + this.key.hashCode()) * 31) + this.f35983c.hashCode();
    }

    public boolean isEmpty() {
        return this.f35981a.isEmpty();
    }

    public boolean isFullyLocked(long j, long j2) {
        for (int i = 0; i < this.f35982b.size(); i++) {
            if (this.f35982b.get(i).contains(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.f35982b.isEmpty();
    }

    public boolean lockRange(long j, long j2) {
        for (int i = 0; i < this.f35982b.size(); i++) {
            if (this.f35982b.get(i).intersects(j, j2)) {
                return false;
            }
        }
        this.f35982b.add(new Range(j, j2));
        return true;
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (this.f35981a.remove(cacheSpan)) {
            File file = cacheSpan.file;
            if (file != null) {
                file.delete();
                return true;
            }
            return true;
        }
        return false;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j, boolean z) {
        Assertions.checkState(this.f35981a.remove(simpleCacheSpan));
        File file = (File) Assertions.checkNotNull(simpleCacheSpan.file);
        if (z) {
            File cacheFile = SimpleCacheSpan.getCacheFile((File) Assertions.checkNotNull(file.getParentFile()), this.f35984id, simpleCacheSpan.position, j);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.m72602w("CachedContent", "Failed to rename " + file + " to " + cacheFile);
            }
        }
        SimpleCacheSpan copyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j);
        this.f35981a.add(copyWithFileAndLastTouchTimestamp);
        return copyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j) {
        for (int i = 0; i < this.f35982b.size(); i++) {
            if (this.f35982b.get(i).position == j) {
                this.f35982b.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public CachedContent(int i, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f35984id = i;
        this.key = str;
        this.f35983c = defaultContentMetadata;
        this.f35981a = new TreeSet<>();
        this.f35982b = new ArrayList<>();
    }
}

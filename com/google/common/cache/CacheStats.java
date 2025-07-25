package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class CacheStats {

    /* renamed from: a */
    private final long f39550a;

    /* renamed from: b */
    private final long f39551b;

    /* renamed from: c */
    private final long f39552c;

    /* renamed from: d */
    private final long f39553d;

    /* renamed from: e */
    private final long f39554e;

    /* renamed from: f */
    private final long f39555f;

    public CacheStats(long j, long j2, long j3, long j4, long j5, long j6) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        if (j4 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
        if (j5 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Preconditions.checkArgument(z5);
        Preconditions.checkArgument(j6 >= 0);
        this.f39550a = j;
        this.f39551b = j2;
        this.f39552c = j3;
        this.f39553d = j4;
        this.f39554e = j5;
        this.f39555f = j6;
    }

    public double averageLoadPenalty() {
        long saturatedAdd = LongMath.saturatedAdd(this.f39552c, this.f39553d);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.f39554e / saturatedAdd;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CacheStats)) {
            return false;
        }
        CacheStats cacheStats = (CacheStats) obj;
        if (this.f39550a != cacheStats.f39550a || this.f39551b != cacheStats.f39551b || this.f39552c != cacheStats.f39552c || this.f39553d != cacheStats.f39553d || this.f39554e != cacheStats.f39554e || this.f39555f != cacheStats.f39555f) {
            return false;
        }
        return true;
    }

    public long evictionCount() {
        return this.f39555f;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f39550a), Long.valueOf(this.f39551b), Long.valueOf(this.f39552c), Long.valueOf(this.f39553d), Long.valueOf(this.f39554e), Long.valueOf(this.f39555f));
    }

    public long hitCount() {
        return this.f39550a;
    }

    public double hitRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 1.0d;
        }
        return this.f39550a / requestCount;
    }

    public long loadCount() {
        return LongMath.saturatedAdd(this.f39552c, this.f39553d);
    }

    public long loadExceptionCount() {
        return this.f39553d;
    }

    public double loadExceptionRate() {
        long saturatedAdd = LongMath.saturatedAdd(this.f39552c, this.f39553d);
        if (saturatedAdd == 0) {
            return 0.0d;
        }
        return this.f39553d / saturatedAdd;
    }

    public long loadSuccessCount() {
        return this.f39552c;
    }

    public CacheStats minus(CacheStats cacheStats) {
        return new CacheStats(Math.max(0L, LongMath.saturatedSubtract(this.f39550a, cacheStats.f39550a)), Math.max(0L, LongMath.saturatedSubtract(this.f39551b, cacheStats.f39551b)), Math.max(0L, LongMath.saturatedSubtract(this.f39552c, cacheStats.f39552c)), Math.max(0L, LongMath.saturatedSubtract(this.f39553d, cacheStats.f39553d)), Math.max(0L, LongMath.saturatedSubtract(this.f39554e, cacheStats.f39554e)), Math.max(0L, LongMath.saturatedSubtract(this.f39555f, cacheStats.f39555f)));
    }

    public long missCount() {
        return this.f39551b;
    }

    public double missRate() {
        long requestCount = requestCount();
        if (requestCount == 0) {
            return 0.0d;
        }
        return this.f39551b / requestCount;
    }

    public CacheStats plus(CacheStats cacheStats) {
        return new CacheStats(LongMath.saturatedAdd(this.f39550a, cacheStats.f39550a), LongMath.saturatedAdd(this.f39551b, cacheStats.f39551b), LongMath.saturatedAdd(this.f39552c, cacheStats.f39552c), LongMath.saturatedAdd(this.f39553d, cacheStats.f39553d), LongMath.saturatedAdd(this.f39554e, cacheStats.f39554e), LongMath.saturatedAdd(this.f39555f, cacheStats.f39555f));
    }

    public long requestCount() {
        return LongMath.saturatedAdd(this.f39550a, this.f39551b);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("hitCount", this.f39550a).add("missCount", this.f39551b).add("loadSuccessCount", this.f39552c).add("loadExceptionCount", this.f39553d).add("totalLoadTime", this.f39554e).add("evictionCount", this.f39555f).toString();
    }

    public long totalLoadTime() {
        return this.f39554e;
    }
}

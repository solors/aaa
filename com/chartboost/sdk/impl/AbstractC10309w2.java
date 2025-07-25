package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.upstream.cache.CacheSpan;

/* renamed from: com.chartboost.sdk.impl.w2 */
/* loaded from: classes3.dex */
public abstract class AbstractC10309w2 {
    /* renamed from: b */
    public static final int m80202b(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
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
}

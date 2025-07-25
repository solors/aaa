package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

/* loaded from: classes4.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: com.google.android.exoplayer2.upstream.cache.a
        @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return CacheKeyFactory.m72729b(dataSpec);
        }
    };

    /* renamed from: a */
    static /* synthetic */ String m72730a(DataSpec dataSpec) {
        String str = dataSpec.key;
        if (str == null) {
            return dataSpec.uri.toString();
        }
        return str;
    }

    /* renamed from: b */
    static /* synthetic */ String m72729b(DataSpec dataSpec) {
        return m72730a(dataSpec);
    }

    String buildCacheKey(DataSpec dataSpec);
}

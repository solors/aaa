package io.bidmachine.media3.datasource.cache;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSpec;

@UnstableApi
/* loaded from: classes9.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: io.bidmachine.media3.datasource.cache.c
        @Override // io.bidmachine.media3.datasource.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return CacheKeyFactory.m19926a(dataSpec);
        }
    };

    /* renamed from: a */
    static /* synthetic */ String m19926a(DataSpec dataSpec) {
        return lambda$static$0(dataSpec);
    }

    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        if (str == null) {
            return dataSpec.uri.toString();
        }
        return str;
    }

    String buildCacheKey(DataSpec dataSpec);
}

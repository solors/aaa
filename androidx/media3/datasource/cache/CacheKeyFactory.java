package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

@UnstableApi
/* loaded from: classes2.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: androidx.media3.datasource.cache.a
        @Override // androidx.media3.datasource.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return CacheKeyFactory.m104540a(dataSpec);
        }
    };

    /* renamed from: a */
    static /* synthetic */ String m104540a(DataSpec dataSpec) {
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

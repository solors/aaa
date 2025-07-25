package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.AbstractC22930u;
import com.mbridge.msdk.tracker.network.CacheKeyGenerator;

/* renamed from: com.mbridge.msdk.tracker.network.toolbox.e */
/* loaded from: classes6.dex */
public final class DefaultCacheKeyGenerator implements CacheKeyGenerator {
    @Override // com.mbridge.msdk.tracker.network.CacheKeyGenerator
    /* renamed from: a */
    public final String mo49446a(AbstractC22930u<?> abstractC22930u) {
        String m49403k = abstractC22930u.m49403k();
        int m49405i = abstractC22930u.m49405i();
        if (m49405i == 0) {
            return m49403k;
        }
        return Integer.toString(m49405i) + '-' + m49403k;
    }
}

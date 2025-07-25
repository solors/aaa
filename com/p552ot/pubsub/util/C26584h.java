package com.p552ot.pubsub.util;

import android.text.TextUtils;
import android.util.LruCache;
import com.p552ot.pubsub.util.C26582g;

/* renamed from: com.ot.pubsub.util.h */
/* loaded from: classes7.dex */
final class C26584h extends LruCache<String, C26582g.C26583a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C26584h(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.util.LruCache
    /* renamed from: a */
    public int sizeOf(String str, C26582g.C26583a c26583a) {
        if (c26583a != null && !TextUtils.isEmpty(c26583a.f69730a)) {
            return c26583a.f69730a.length();
        }
        return 0;
    }
}

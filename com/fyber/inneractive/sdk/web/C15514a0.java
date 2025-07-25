package com.fyber.inneractive.sdk.web;

import android.util.LruCache;

/* renamed from: com.fyber.inneractive.sdk.web.a0 */
/* loaded from: classes4.dex */
public final class C15514a0 extends LruCache {
    public C15514a0() {
        super(1048576);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        String str;
        C15520d0 c15520d0 = (C15520d0) obj2;
        int i = 0;
        for (String str2 : c15520d0.f30741b.keySet()) {
            if (str2 != null && (str = (String) c15520d0.f30741b.get(str2)) != null) {
                i += str.length() + str2.length();
            }
        }
        return i + c15520d0.f30740a.length;
    }
}

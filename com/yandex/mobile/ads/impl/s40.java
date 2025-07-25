package com.yandex.mobile.ads.impl;

import android.util.LruCache;

/* loaded from: classes8.dex */
public final class s40 extends LruCache<m62<?>, e71> {
    public s40(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, m62<?> m62Var, e71 e71Var, e71 e71Var2) {
        e71 e71Var3 = e71Var;
        if (e71Var3 != null) {
            e71Var3.mo28048a();
        }
    }
}

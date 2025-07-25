package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* renamed from: com.applovin.impl.xi */
/* loaded from: classes2.dex */
final class C5849xi extends AbstractC5699vg implements Serializable {

    /* renamed from: a */
    static final C5849xi f12108a = new C5849xi();

    private C5849xi() {
    }

    @Override // com.applovin.impl.AbstractC5699vg, java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.applovin.impl.AbstractC5699vg
    /* renamed from: c */
    public AbstractC5699vg mo92405c() {
        return AbstractC5699vg.m93898a();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}

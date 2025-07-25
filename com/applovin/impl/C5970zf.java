package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.zf */
/* loaded from: classes2.dex */
public final class C5970zf extends AbstractC5699vg implements Serializable {

    /* renamed from: a */
    static final C5970zf f12565a = new C5970zf();

    private C5970zf() {
    }

    @Override // com.applovin.impl.AbstractC5699vg, java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    @Override // com.applovin.impl.AbstractC5699vg
    /* renamed from: c */
    public AbstractC5699vg mo92405c() {
        return C5849xi.f12108a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}

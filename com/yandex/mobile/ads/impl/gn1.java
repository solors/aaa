package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes8.dex */
final class gn1 extends mb1<Comparable<?>> implements Serializable {

    /* renamed from: b */
    static final gn1 f79710b = new gn1();
    private static final long serialVersionUID = 0;

    private gn1() {
    }

    private Object readResolve() {
        return f79710b;
    }

    @Override // com.yandex.mobile.ads.impl.mb1
    /* renamed from: b */
    public final <S extends Comparable<?>> mb1<S> mo28490b() {
        return v81.f86600b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

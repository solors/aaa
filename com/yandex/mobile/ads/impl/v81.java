package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes8.dex */
final class v81 extends mb1<Comparable<?>> implements Serializable {

    /* renamed from: b */
    static final v81 f86600b = new v81();
    private static final long serialVersionUID = 0;

    private v81() {
    }

    private Object readResolve() {
        return f86600b;
    }

    @Override // com.yandex.mobile.ads.impl.mb1
    /* renamed from: b */
    public final <S extends Comparable<?>> mb1<S> mo28490b() {
        return gn1.f79710b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

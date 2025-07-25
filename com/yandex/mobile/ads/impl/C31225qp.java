package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.qp */
/* loaded from: classes8.dex */
final class C31225qp<T> extends mb1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final Comparator<T> f84443b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31225qp(Comparator<T> comparator) {
        this.f84443b = (Comparator) uf1.m28793a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f84443b.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31225qp) {
            return this.f84443b.equals(((C31225qp) obj).f84443b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f84443b.hashCode();
    }

    public final String toString() {
        return this.f84443b.toString();
    }
}

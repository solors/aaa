package com.yandex.mobile.ads.impl;

import java.io.Serializable;

/* loaded from: classes8.dex */
final class hn1<T> extends mb1<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final mb1<? super T> f80130b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hn1(mb1<? super T> mb1Var) {
        this.f80130b = (mb1) uf1.m28793a(mb1Var);
    }

    @Override // com.yandex.mobile.ads.impl.mb1
    /* renamed from: b */
    public final <S extends T> mb1<S> mo28490b() {
        return (mb1<? super T>) this.f80130b;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f80130b.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hn1) {
            return this.f80130b.equals(((hn1) obj).f80130b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f80130b.hashCode();
    }

    public final String toString() {
        return this.f80130b + ".reverse()";
    }
}

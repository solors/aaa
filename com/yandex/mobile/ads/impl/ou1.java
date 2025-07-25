package com.yandex.mobile.ads.impl;

import com.ironsource.C21114v8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class ou1<E> extends qh0<E> {

    /* renamed from: d */
    final transient E f83616d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ou1(E e) {
        this.f83616d = (E) uf1.m28793a(e);
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: a */
    final int mo30882a(int i, Object[] objArr) {
        objArr[i] = this.f83616d;
        return i + 1;
    }

    @Override // com.yandex.mobile.ads.impl.qh0, com.yandex.mobile.ads.impl.mh0
    /* renamed from: b */
    public final oh0<E> mo30356b() {
        return oh0.m31016a(this.f83616d);
    }

    @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f83616d.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: f */
    public final boolean mo30881f() {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.qh0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f83616d.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.qh0, com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final d32<E> iterator() {
        return new nn0(this.f83616d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C21114v8.C21123i.f54137d + this.f83616d.toString() + ']';
    }
}

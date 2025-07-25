package com.yandex.mobile.ads.impl;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class ck1<E> extends oh0<E> {

    /* renamed from: g */
    static final oh0<Object> f77657g = new ck1(0, new Object[0]);

    /* renamed from: e */
    final transient Object[] f77658e;

    /* renamed from: f */
    private final transient int f77659f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ck1(int i, Object[] objArr) {
        this.f77658e = objArr;
        this.f77659f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.yandex.mobile.ads.impl.oh0, com.yandex.mobile.ads.impl.mh0
    /* renamed from: a */
    public final int mo30882a(int i, Object[] objArr) {
        System.arraycopy(this.f77658e, 0, objArr, i, this.f77659f);
        return i + this.f77659f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: c */
    public final Object[] mo31004c() {
        return this.f77658e;
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: d */
    final int mo31003d() {
        return this.f77659f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: e */
    public final int mo31002e() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: f */
    public final boolean mo30881f() {
        return false;
    }

    @Override // java.util.List
    public final E get(int i) {
        uf1.m28796a(i, this.f77659f);
        E e = (E) this.f77658e[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f77659f;
    }
}

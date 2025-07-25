package com.yandex.mobile.ads.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class ek1<E> extends qh0<E> {

    /* renamed from: i */
    private static final Object[] f78684i = null;

    /* renamed from: j */
    static final ek1<Object> f78685j;

    /* renamed from: d */
    final transient Object[] f78686d;

    /* renamed from: e */
    private final transient int f78687e;

    /* renamed from: f */
    final transient Object[] f78688f;

    /* renamed from: g */
    private final transient int f78689g;

    /* renamed from: h */
    private final transient int f78690h;

    static {
        Object[] objArr = new Object[0];
        f78685j = new ek1<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ek1(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f78686d = objArr;
        this.f78687e = i;
        this.f78688f = objArr2;
        this.f78689g = i2;
        this.f78690h = i3;
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: a */
    final int mo30882a(int i, Object[] objArr) {
        System.arraycopy(this.f78686d, 0, objArr, i, this.f78690h);
        return i + this.f78690h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: c */
    public final Object[] mo31004c() {
        return this.f78686d;
    }

    @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f78688f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m29647a = sc0.m29647a(obj.hashCode());
        while (true) {
            int i = m29647a & this.f78689g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m29647a = i + 1;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: d */
    final int mo31003d() {
        return this.f78690h;
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

    @Override // com.yandex.mobile.ads.impl.qh0
    /* renamed from: g */
    final oh0<E> mo30354g() {
        return oh0.m31012b(this.f78690h, this.f78686d);
    }

    @Override // com.yandex.mobile.ads.impl.qh0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f78687e;
    }

    @Override // com.yandex.mobile.ads.impl.qh0, com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final d32<E> iterator() {
        return mo30356b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f78690h;
    }
}

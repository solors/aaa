package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: j */
    private static final Object[] f40623j;

    /* renamed from: k */
    static final RegularImmutableSet<Object> f40624k;
    @VisibleForTesting

    /* renamed from: d */
    final transient Object[] f40625d;

    /* renamed from: f */
    private final transient int f40626f;
    @VisibleForTesting

    /* renamed from: g */
    final transient Object[] f40627g;

    /* renamed from: h */
    private final transient int f40628h;

    /* renamed from: i */
    private final transient int f40629i;

    static {
        Object[] objArr = new Object[0];
        f40623j = objArr;
        f40624k = new RegularImmutableSet<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f40625d = objArr;
        this.f40626f = i;
        this.f40627g = objArr2;
        this.f40628h = i2;
        this.f40629i = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: a */
    public int mo68773a(Object[] objArr, int i) {
        System.arraycopy(this.f40625d, 0, objArr, i, this.f40629i);
        return i + this.f40629i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: c */
    public Object[] mo68819c() {
        return this.f40625d;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f40627g;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m69450d = Hashing.m69450d(obj);
        while (true) {
            int i = m69450d & this.f40628h;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m69450d = i + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo68818d() {
        return this.f40629i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: e */
    public int mo68817e() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f40626f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: j */
    public ImmutableList<E> mo68824j() {
        return ImmutableList.m69427g(this.f40625d, this.f40629i);
    }

    @Override // com.google.common.collect.ImmutableSet
    /* renamed from: k */
    boolean mo68823k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f40629i;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class RegularImmutableList<E> extends ImmutableList<E> {

    /* renamed from: g */
    static final ImmutableList<Object> f40599g = new RegularImmutableList(new Object[0], 0);
    @VisibleForTesting

    /* renamed from: d */
    final transient Object[] f40600d;

    /* renamed from: f */
    private final transient int f40601f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegularImmutableList(Object[] objArr, int i) {
        this.f40600d = objArr;
        this.f40601f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    /* renamed from: a */
    public int mo68773a(Object[] objArr, int i) {
        System.arraycopy(this.f40600d, 0, objArr, i, this.f40601f);
        return i + this.f40601f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: c */
    public Object[] mo68819c() {
        return this.f40600d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo68818d() {
        return this.f40601f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: e */
    public int mo68817e() {
        return 0;
    }

    @Override // java.util.List
    public E get(int i) {
        Preconditions.checkElementIndex(i, this.f40601f);
        E e = (E) this.f40600d[i];
        Objects.requireNonNull(e);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f40601f;
    }
}

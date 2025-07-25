package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class RegularImmutableAsList<E> extends ImmutableAsList<E> {

    /* renamed from: d */
    private final ImmutableCollection<E> f40591d;

    /* renamed from: f */
    private final ImmutableList<? extends E> f40592f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    /* renamed from: a */
    public int mo68773a(Object[] objArr, int i) {
        return this.f40592f.mo68773a(objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: c */
    public Object[] mo68819c() {
        return this.f40592f.mo68819c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo68818d() {
        return this.f40592f.mo68818d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: e */
    public int mo68817e() {
        return this.f40592f.mo68817e();
    }

    @Override // java.util.List
    public E get(int i) {
        return this.f40592f.get(i);
    }

    @Override // com.google.common.collect.ImmutableAsList
    /* renamed from: j */
    ImmutableCollection<E> mo68837j() {
        return this.f40591d;
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public UnmodifiableListIterator<E> listIterator(int i) {
        return (UnmodifiableListIterator<? extends E>) this.f40592f.listIterator(i);
    }
}

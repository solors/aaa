package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    @LazyInit

    /* renamed from: b */
    private transient Set<E> f39776b;
    @LazyInit

    /* renamed from: c */
    private transient Set<Multiset.Entry<E>> f39777c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class ElementSet extends Multisets.ElementSet<E> {
        ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        /* renamed from: c */
        Multiset<E> mo68763c() {
            return AbstractMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractMultiset.this.mo68664e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class EntrySet extends Multisets.EntrySet<E> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        /* renamed from: c */
        Multiset<E> mo68912c() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Multiset.Entry<E>> iterator() {
            return AbstractMultiset.this.mo68663f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractMultiset.this.mo68665d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean add(@ParametricNullness E e) {
        add(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.m68929c(this, collection);
    }

    /* renamed from: c */
    Set<E> mo68911c() {
        return new ElementSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    Set<Multiset.Entry<E>> createEntrySet() {
        return new EntrySet();
    }

    /* renamed from: d */
    abstract int mo68665d();

    /* renamed from: e */
    abstract Iterator<E> mo68664e();

    @Override // com.google.common.collect.Multiset
    public Set<E> elementSet() {
        Set<E> set = this.f39776b;
        if (set == null) {
            Set<E> mo68911c = mo68911c();
            this.f39776b = mo68911c;
            return mo68911c;
        }
        return set;
    }

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.f39777c;
        if (set == null) {
            Set<Multiset.Entry<E>> createEntrySet = createEntrySet();
            this.f39777c = createEntrySet;
            return createEntrySet;
        }
        return set;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.m68926f(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Iterator<Multiset.Entry<E>> mo68663f();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.m68922j(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.m68921k(this, collection);
    }

    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e, int i) {
        return Multisets.m68919m(this, e, i);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final String toString() {
        return entrySet().toString();
    }

    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e, int i, int i2) {
        return Multisets.m68918n(this, e, i, i2);
    }
}

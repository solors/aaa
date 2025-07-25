package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {
    @LazyInit

    /* renamed from: c */
    private transient ImmutableList<E> f40093c;
    @LazyInit

    /* renamed from: d */
    private transient ImmutableSet<Multiset.Entry<E>> f40094d;

    /* loaded from: classes4.dex */
    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* renamed from: a */
        ObjectCountHashMap<E> f40098a;

        /* renamed from: b */
        boolean f40099b;

        /* renamed from: c */
        boolean f40100c;

        public Builder() {
            this(4);
        }

        /* renamed from: b */
        static <T> ObjectCountHashMap<T> m69355b(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return (ObjectCountHashMap<E>) ((RegularImmutableMultiset) iterable).f40617f;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return (ObjectCountHashMap<E>) ((AbstractMapBasedMultiset) iterable).f39761d;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @CanIgnoreReturnValue
        public Builder<E> addCopies(E e, int i) {
            Objects.requireNonNull(this.f40098a);
            if (i == 0) {
                return this;
            }
            if (this.f40099b) {
                this.f40098a = new ObjectCountHashMap<>((ObjectCountHashMap<? extends E>) this.f40098a);
                this.f40100c = false;
            }
            this.f40099b = false;
            Preconditions.checkNotNull(e);
            ObjectCountHashMap<E> objectCountHashMap = this.f40098a;
            objectCountHashMap.put(e, i + objectCountHashMap.get(e));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<E> setCount(E e, int i) {
            Objects.requireNonNull(this.f40098a);
            if (i == 0 && !this.f40100c) {
                this.f40098a = new ObjectCountLinkedHashMap(this.f40098a);
                this.f40100c = true;
            } else if (this.f40099b) {
                this.f40098a = new ObjectCountHashMap<>((ObjectCountHashMap<? extends E>) this.f40098a);
                this.f40100c = false;
            }
            this.f40099b = false;
            Preconditions.checkNotNull(e);
            if (i == 0) {
                this.f40098a.remove(e);
            } else {
                this.f40098a.put(Preconditions.checkNotNull(e), i);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(int i) {
            this.f40099b = false;
            this.f40100c = false;
            this.f40098a = ObjectCountHashMap.m68896b(i);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableMultiset<E> build() {
            Objects.requireNonNull(this.f40098a);
            if (this.f40098a.m68880y() == 0) {
                return ImmutableMultiset.m69362of();
            }
            if (this.f40100c) {
                this.f40098a = new ObjectCountHashMap<>((ObjectCountHashMap<? extends E>) this.f40098a);
                this.f40100c = false;
            }
            this.f40099b = true;
            return new RegularImmutableMultiset(this.f40098a);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            return addCopies(e, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f40098a);
            if (iterable instanceof Multiset) {
                Multiset m68928d = Multisets.m68928d(iterable);
                ObjectCountHashMap m69355b = m69355b(m68928d);
                if (m69355b != null) {
                    ObjectCountHashMap<E> objectCountHashMap = this.f40098a;
                    objectCountHashMap.m68895c(Math.max(objectCountHashMap.m68880y(), m69355b.m68880y()));
                    for (int mo68872d = m69355b.mo68872d(); mo68872d >= 0; mo68872d = m69355b.mo68868q(mo68872d)) {
                        addCopies(m69355b.m68892g(mo68872d), m69355b.m68890i(mo68872d));
                    }
                } else {
                    Set<Multiset.Entry<E>> entrySet = m68928d.entrySet();
                    ObjectCountHashMap<E> objectCountHashMap2 = this.f40098a;
                    objectCountHashMap2.m68895c(Math.max(objectCountHashMap2.m68880y(), entrySet.size()));
                    for (Multiset.Entry<E> entry : m68928d.entrySet()) {
                        addCopies(entry.getElement(), entry.getCount());
                    }
                }
            } else {
                super.addAll((Iterable) iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(boolean z) {
            this.f40099b = false;
            this.f40100c = false;
            this.f40098a = null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        private EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (entry.getCount() <= 0 || ImmutableMultiset.this.count(entry.getElement()) != entry.getCount()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        /* renamed from: m */
        public Multiset.Entry<E> get(int i) {
            return ImmutableMultiset.this.mo68822i(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    static class EntrySetSerializedForm<E> implements Serializable {

        /* renamed from: b */
        final ImmutableMultiset<E> f40102b;

        EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.f40102b = immutableMultiset;
        }

        Object readResolve() {
            return this.f40102b.entrySet();
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return m69365f(eArr);
    }

    /* renamed from: f */
    private static <E> ImmutableMultiset<E> m69365f(E... eArr) {
        return new Builder().add((Object[]) eArr).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static <E> ImmutableMultiset<E> m69364g(Collection<? extends Multiset.Entry<? extends E>> collection) {
        Builder builder = new Builder(collection.size());
        for (Multiset.Entry<? extends E> entry : collection) {
            builder.addCopies(entry.getElement(), entry.getCount());
        }
        return builder.build();
    }

    /* renamed from: h */
    private ImmutableSet<Multiset.Entry<E>> m69363h() {
        if (isEmpty()) {
            return ImmutableSet.m69331of();
        }
        return new EntrySet();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m69362of() {
        return RegularImmutableMultiset.f40616i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    /* renamed from: a */
    public int mo68773a(Object[] objArr, int i) {
        UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f40093c;
        if (immutableList == null) {
            ImmutableList<E> asList = super.asList();
            this.f40093c = asList;
            return asList;
        }
        return immutableList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Multiset
    public abstract ImmutableSet<E> elementSet();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
        return Multisets.m68926f(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return Sets.m68786b(entrySet());
    }

    /* renamed from: i */
    abstract Multiset.Entry<E> mo68822i(int i);

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        Builder builder = new Builder(Multisets.m68925g(iterable));
        builder.addAll((Iterable) iterable);
        return builder.build();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m69361of(E e) {
        return m69365f(e);
    }

    @Override // com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.f40094d;
        if (immutableSet == null) {
            ImmutableSet<Multiset.Entry<E>> m69363h = m69363h();
            this.f40094d = m69363h;
            return m69363h;
        }
        return immutableSet;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.ImmutableMultiset.1

            /* renamed from: b */
            int f40095b;

            /* renamed from: c */
            E f40096c;

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f40095b <= 0 && !it.hasNext()) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f40095b <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.f40096c = (E) entry.getElement();
                    this.f40095b = entry.getCount();
                }
                this.f40095b--;
                E e = this.f40096c;
                Objects.requireNonNull(e);
                return e;
            }
        };
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m69360of(E e, E e2) {
        return m69365f(e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m69359of(E e, E e2, E e3) {
        return m69365f(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m69358of(E e, E e2, E e3, E e4) {
        return m69365f(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m69357of(E e, E e2, E e3, E e4, E e5) {
        return m69365f(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m69356of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new Builder().add((Builder) e).add((Builder<E>) e2).add((Builder<E>) e3).add((Builder<E>) e4).add((Builder<E>) e5).add((Builder<E>) e6).add((Object[]) eArr).build();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new Builder().addAll((Iterator) it).build();
    }
}

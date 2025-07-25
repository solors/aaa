package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    @RetainedWith
    @LazyInit

    /* renamed from: c */
    private transient ImmutableList<E> f40139c;

    /* loaded from: classes4.dex */
    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        @VisibleForTesting

        /* renamed from: d */
        Object[] f40140d;

        /* renamed from: e */
        private int f40141e;

        public Builder() {
            super(4);
        }

        /* renamed from: d */
        private void m69324d(E e) {
            Objects.requireNonNull(this.f40140d);
            int length = this.f40140d.length - 1;
            int hashCode = e.hashCode();
            int m69451c = Hashing.m69451c(hashCode);
            while (true) {
                int i = m69451c & length;
                Object[] objArr = this.f40140d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f40141e += hashCode;
                    super.add((Builder<E>) e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    m69451c = i + 1;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.ArrayBasedBuilder add(Object obj) {
            return add((Builder<E>) obj);
        }

        Builder(int i) {
            super(i);
            this.f40140d = new Object[ImmutableSet.m69334h(i)];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> m69333i;
            int i = this.f40028b;
            if (i != 0) {
                if (i != 1) {
                    if (this.f40140d == null || ImmutableSet.m69334h(i) != this.f40140d.length) {
                        m69333i = ImmutableSet.m69333i(this.f40028b, this.f40027a);
                        this.f40028b = m69333i.size();
                    } else {
                        Object[] copyOf = ImmutableSet.m69332l(this.f40028b, this.f40027a.length) ? Arrays.copyOf(this.f40027a, this.f40028b) : this.f40027a;
                        int i2 = this.f40141e;
                        Object[] objArr = this.f40140d;
                        m69333i = new RegularImmutableSet<>(copyOf, i2, objArr, objArr.length - 1, this.f40028b);
                    }
                    this.f40029c = true;
                    this.f40140d = null;
                    return m69333i;
                }
                Object obj = this.f40027a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.m69330of(obj);
            }
            return ImmutableSet.m69331of();
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.f40140d != null) {
                for (E e : iterable) {
                    add((Builder<E>) e);
                }
            } else {
                super.addAll((Iterable) iterable);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            Preconditions.checkNotNull(e);
            if (this.f40140d != null && ImmutableSet.m69334h(this.f40028b) <= this.f40140d.length) {
                m69324d(e);
                return this;
            }
            this.f40140d = null;
            super.add((Builder<E>) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add((Builder<E>) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            if (this.f40140d != null) {
                for (E e : eArr) {
                    add((Builder<E>) e);
                }
            } else {
                super.add((Object[]) eArr);
            }
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static class SerializedForm implements Serializable {

        /* renamed from: b */
        final Object[] f40142b;

        SerializedForm(Object[] objArr) {
            this.f40142b = objArr;
        }

        Object readResolve() {
            return ImmutableSet.copyOf(this.f40142b);
        }
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    @Beta
    public static <E> Builder<E> builderWithExpectedSize(int i) {
        CollectPreconditions.m69727b(i, "expectedSize");
        return new Builder<>(i);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m69333i(array.length, array);
    }

    @VisibleForTesting
    /* renamed from: h */
    public static int m69334h(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        Preconditions.checkArgument(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: i */
    public static <E> ImmutableSet<E> m69333i(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m69334h = m69334h(i);
                Object[] objArr2 = new Object[m69334h];
                int i2 = m69334h - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object m68904a = ObjectArrays.m68904a(objArr[i5], i5);
                    int hashCode = m68904a.hashCode();
                    int m69451c = Hashing.m69451c(hashCode);
                    while (true) {
                        int i6 = m69451c & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = m68904a;
                            objArr2[i6] = m68904a;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(m68904a)) {
                            break;
                        } else {
                            m69451c++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new SingletonImmutableSet(obj2);
                } else if (m69334h(i4) < m69334h / 2) {
                    return m69333i(i4, objArr);
                } else {
                    if (m69332l(i4, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return m69330of(obj3);
        }
        return m69331of();
    }

    /* renamed from: l */
    public static boolean m69332l(int i, int i2) {
        if (i < (i2 >> 1) + (i2 >> 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m69331of() {
        return RegularImmutableSet.f40624k;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f40139c;
        if (immutableList == null) {
            ImmutableList<E> mo68824j = mo68824j();
            this.f40139c = mo68824j;
            return mo68824j;
        }
        return immutableList;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && mo68823k() && ((ImmutableSet) obj).mo68823k() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.m68787a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.m68786b(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    /* renamed from: j */
    public ImmutableList<E> mo68824j() {
        return ImmutableList.m69428f(toArray());
    }

    /* renamed from: k */
    boolean mo68823k() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m69330of(E e) {
        return new SingletonImmutableSet(e);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m69329of(E e, E e2) {
        return m69333i(2, e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m69328of(E e, E e2, E e3) {
        return m69333i(3, e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m69327of(E e, E e2, E e3, E e4) {
        return m69333i(4, e, e2, e3, e4);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m69326of(E e, E e2, E e3, E e4, E e5) {
        return m69333i(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableSet<E> m69325of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m69333i(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m69331of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return m69330of((Object) next);
        }
        return new Builder().add((Builder) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return m69333i(eArr.length, (Object[]) eArr.clone());
            }
            return m69330of((Object) eArr[0]);
        }
        return m69331of();
    }
}

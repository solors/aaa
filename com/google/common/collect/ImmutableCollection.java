package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible(emulated = true)
@DoNotMock("Use ImmutableList.of or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    private static final Object[] f40026b = new Object[0];

    /* loaded from: classes4.dex */
    static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* renamed from: a */
        Object[] f40027a;

        /* renamed from: b */
        int f40028b;

        /* renamed from: c */
        boolean f40029c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ArrayBasedBuilder(int i) {
            CollectPreconditions.m69727b(i, "initialCapacity");
            this.f40027a = new Object[i];
            this.f40028b = 0;
        }

        /* renamed from: c */
        private void m69432c(int i) {
            Object[] objArr = this.f40027a;
            if (objArr.length < i) {
                this.f40027a = Arrays.copyOf(objArr, Builder.m69431a(objArr.length, i));
                this.f40029c = false;
            } else if (this.f40029c) {
                this.f40027a = (Object[]) objArr.clone();
                this.f40029c = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ Builder add(Object obj) {
            return add((ArrayBasedBuilder<E>) obj);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m69432c(this.f40028b + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f40028b = ((ImmutableCollection) collection).mo68773a(this.f40027a, this.f40028b);
                    return this;
                }
            }
            super.addAll(iterable);
            return this;
        }

        /* renamed from: b */
        final void m69433b(Object[] objArr, int i) {
            ObjectArrays.m68902c(objArr, i);
            m69432c(this.f40028b + i);
            System.arraycopy(objArr, 0, this.f40027a, this.f40028b, i);
            this.f40028b += i;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public ArrayBasedBuilder<E> add(E e) {
            Preconditions.checkNotNull(e);
            m69432c(this.f40028b + 1);
            Object[] objArr = this.f40027a;
            int i = this.f40028b;
            this.f40028b = i + 1;
            objArr[i] = e;
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            m69433b(eArr, eArr.length);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: a */
    public int mo68773a(Object[] objArr, int i) {
        UnmodifiableIterator<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        if (isEmpty()) {
            return ImmutableList.m69424of();
        }
        return ImmutableList.m69428f(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Object[] mo68819c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo68818d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo68817e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f40026b);
    }

    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @DoNotMock
    /* loaded from: classes4.dex */
    public static abstract class Builder<E> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static int m69431a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        @CanIgnoreReturnValue
        public abstract Builder<E> add(E e);

        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            for (E e : eArr) {
                add((Builder<E>) e);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            for (E e : iterable) {
                add((Builder<E>) e);
            }
            return this;
        }

        public abstract ImmutableCollection<E> build();

        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add((Builder<E>) it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo68819c = mo68819c();
            if (mo68819c != null) {
                return (T[]) Platform.m68862a(mo68819c, mo68817e(), mo68818d(), tArr);
            }
            tArr = (T[]) ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo68773a(tArr, 0);
        return tArr;
    }
}

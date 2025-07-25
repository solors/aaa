package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableSortedMultisetFauxverideShim<E> implements SortedMultiset<E> {
    @LazyInit

    /* renamed from: f */
    transient ImmutableSortedMultiset<E> f40160f;

    /* loaded from: classes4.dex */
    public static class Builder<E> extends ImmutableMultiset.Builder<E> {

        /* renamed from: d */
        private final Comparator<? super E> f40161d;
        @VisibleForTesting

        /* renamed from: e */
        E[] f40162e;

        /* renamed from: f */
        private int[] f40163f;

        /* renamed from: g */
        private int f40164g;

        /* renamed from: h */
        private boolean f40165h;

        public Builder(Comparator<? super E> comparator) {
            super(true);
            this.f40161d = (Comparator) Preconditions.checkNotNull(comparator);
            this.f40162e = (E[]) new Object[4];
            this.f40163f = new int[4];
        }

        /* renamed from: c */
        private void m69266c(boolean z) {
            int i = this.f40164g;
            if (i == 0) {
                return;
            }
            E[] eArr = (E[]) Arrays.copyOf(this.f40162e, i);
            Arrays.sort(eArr, this.f40161d);
            int i2 = 1;
            for (int i3 = 1; i3 < eArr.length; i3++) {
                if (this.f40161d.compare((Object) eArr[i2 - 1], (Object) eArr[i3]) < 0) {
                    eArr[i2] = eArr[i3];
                    i2++;
                }
            }
            Arrays.fill(eArr, i2, this.f40164g, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.f40164g;
                if (i4 > i5 * 3) {
                    eArr = (E[]) Arrays.copyOf(eArr, IntMath.saturatedAdd(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[eArr.length];
            for (int i6 = 0; i6 < this.f40164g; i6++) {
                int binarySearch = Arrays.binarySearch(eArr, 0, i2, this.f40162e[i6], this.f40161d);
                int i7 = this.f40163f[i6];
                if (i7 >= 0) {
                    iArr[binarySearch] = iArr[binarySearch] + i7;
                } else {
                    iArr[binarySearch] = ~i7;
                }
            }
            this.f40162e = eArr;
            this.f40163f = iArr;
            this.f40164g = i2;
        }

        /* renamed from: d */
        private void m69265d() {
            m69266c(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.f40164g;
                if (i < i3) {
                    int[] iArr = this.f40163f;
                    int i4 = iArr[i];
                    if (i4 > 0) {
                        E[] eArr = this.f40162e;
                        eArr[i2] = eArr[i];
                        iArr[i2] = i4;
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.f40162e, i2, i3, (Object) null);
                    Arrays.fill(this.f40163f, i2, this.f40164g, 0);
                    this.f40164g = i2;
                    return;
                }
            }
        }

        /* renamed from: e */
        private void m69264e() {
            int i = this.f40164g;
            E[] eArr = this.f40162e;
            if (i == eArr.length) {
                m69266c(true);
            } else if (this.f40165h) {
                this.f40162e = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.f40165h = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMultiset.Builder addCopies(Object obj, int i) {
            return addCopies((Builder<E>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMultiset.Builder setCount(Object obj, int i) {
            return setCount((Builder<E>) obj, i);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        public Builder<E> addCopies(E e, int i) {
            Preconditions.checkNotNull(e);
            CollectPreconditions.m69727b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            m69264e();
            E[] eArr = this.f40162e;
            int i2 = this.f40164g;
            eArr[i2] = e;
            this.f40163f[i2] = i;
            this.f40164g = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        public Builder<E> setCount(E e, int i) {
            Preconditions.checkNotNull(e);
            CollectPreconditions.m69727b(i, "count");
            m69264e();
            E[] eArr = this.f40162e;
            int i2 = this.f40164g;
            eArr[i2] = e;
            this.f40163f[i2] = ~i;
            this.f40164g = i2 + 1;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMultiset.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSortedMultiset<E> build() {
            m69265d();
            int i = this.f40164g;
            if (i == 0) {
                return ImmutableSortedMultiset.m69274k(this.f40161d);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.m69257m(this.f40161d, i, this.f40162e);
            long[] jArr = new long[this.f40164g + 1];
            int i2 = 0;
            while (i2 < this.f40164g) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + this.f40163f[i2];
                i2 = i3;
            }
            this.f40165h = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f40164g);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            return addCopies((Builder<E>) e, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                for (Multiset.Entry<E> entry : ((Multiset) iterable).entrySet()) {
                    addCopies((Builder<E>) entry.getElement(), entry.getCount());
                }
            } else {
                for (E e : iterable) {
                    add((Builder<E>) e);
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            for (E e : eArr) {
                add((Builder<E>) e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add((Builder<E>) it.next());
            }
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static final class SerializedForm<E> implements Serializable {

        /* renamed from: b */
        final Comparator<? super E> f40166b;

        /* renamed from: c */
        final E[] f40167c;

        /* renamed from: d */
        final int[] f40168d;

        SerializedForm(SortedMultiset<E> sortedMultiset) {
            this.f40166b = sortedMultiset.comparator();
            int size = sortedMultiset.entrySet().size();
            this.f40167c = (E[]) new Object[size];
            this.f40168d = new int[size];
            int i = 0;
            for (Multiset.Entry<E> entry : sortedMultiset.entrySet()) {
                this.f40167c[i] = entry.getElement();
                this.f40168d[i] = entry.getCount();
                i++;
            }
        }

        Object readResolve() {
            int length = this.f40167c.length;
            Builder builder = new Builder(this.f40166b);
            for (int i = 0; i < length; i++) {
                builder.addCopies((Builder) this.f40167c[i], this.f40168d[i]);
            }
            return builder.build();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] comparableArr) {
        return copyOf(Ordering.natural(), Arrays.asList(comparableArr));
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(SortedMultiset<E> sortedMultiset) {
        return m69275j(sortedMultiset.comparator(), Lists.newArrayList(sortedMultiset.entrySet()));
    }

    /* renamed from: j */
    private static <E> ImmutableSortedMultiset<E> m69275j(Comparator<? super E> comparator, Collection<Multiset.Entry<E>> collection) {
        if (collection.isEmpty()) {
            return m69274k(comparator);
        }
        ImmutableList.Builder builder = new ImmutableList.Builder(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i = 0;
        for (Multiset.Entry<E> entry : collection) {
            builder.add((ImmutableList.Builder) entry.getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + entry.getCount();
            i = i2;
        }
        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(builder.build(), comparator), jArr, 0, collection.size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static <E> ImmutableSortedMultiset<E> m69274k(Comparator<? super E> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.f40631l;
        }
        return new RegularImmutableSortedMultiset(comparator);
    }

    public static <E extends Comparable<?>> Builder<E> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m69273of() {
        return (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.f40631l;
    }

    public static <E> Builder<E> orderedBy(Comparator<E> comparator) {
        return new Builder<>(comparator);
    }

    public static <E extends Comparable<?>> Builder<E> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public abstract ImmutableSortedSet<E> elementSet();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ SortedMultiset headMultiset(Object obj, BoundType boundType) {
        return headMultiset((ImmutableSortedMultiset<E>) obj, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return subMultiset((BoundType) obj, boundType, (BoundType) obj2, boundType2);
    }

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ SortedMultiset tailMultiset(Object obj, BoundType boundType) {
        return tailMultiset((ImmutableSortedMultiset<E>) obj, boundType);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* renamed from: of */
    public static ImmutableSortedMultiset m69272of(Comparable comparable) {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) ImmutableSortedSet.m69254of(comparable), new long[]{0, 1}, 0, 1);
    }

    @Override // com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultiset = this.f40160f;
        if (immutableSortedMultiset == null) {
            if (isEmpty()) {
                immutableSortedMultiset = m69274k(Ordering.from(comparator()).reverse());
            } else {
                immutableSortedMultiset = new DescendingImmutableSortedMultiset<>(this);
            }
            this.f40160f = immutableSortedMultiset;
        }
        return immutableSortedMultiset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        Preconditions.checkArgument(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((ImmutableSortedMultiset<E>) e, boundType).headMultiset((ImmutableSortedMultiset<E>) e2, boundType2);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* renamed from: of */
    public static ImmutableSortedMultiset m69271of(Comparable comparable, Comparable comparable2) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        Preconditions.checkNotNull(comparator);
        return new Builder(comparator).addAll((Iterator) it).build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* renamed from: of */
    public static ImmutableSortedMultiset m69270of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* renamed from: of */
    public static ImmutableSortedMultiset m69269of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? m69275j(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new Builder(comparator).addAll((Iterable) iterable).build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* renamed from: of */
    public static ImmutableSortedMultiset m69268of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    /* renamed from: of */
    public static ImmutableSortedMultiset m69267of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList newArrayListWithCapacity = Lists.newArrayListWithCapacity(comparableArr.length + 6);
        Collections.addAll(newArrayListWithCapacity, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(newArrayListWithCapacity, comparableArr);
        return copyOf(Ordering.natural(), newArrayListWithCapacity);
    }
}

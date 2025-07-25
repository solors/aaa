package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Ordering<T> implements Comparator<T> {

    @VisibleForTesting
    /* loaded from: classes4.dex */
    static class ArbitraryOrdering extends Ordering<Object> {

        /* renamed from: b */
        private final AtomicInteger f40572b = new AtomicInteger(0);

        /* renamed from: c */
        private final ConcurrentMap<Object, Integer> f40573c = Platform.m68854i(new MapMaker()).makeMap();

        ArbitraryOrdering() {
        }

        /* renamed from: b */
        private Integer m68864b(Object obj) {
            Integer num = this.f40573c.get(obj);
            if (num == null) {
                Integer valueOf = Integer.valueOf(this.f40572b.getAndIncrement());
                Integer putIfAbsent = this.f40573c.putIfAbsent(obj, valueOf);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return valueOf;
            }
            return num;
        }

        /* renamed from: c */
        int m68863c(Object obj) {
            return System.identityHashCode(obj);
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int m68863c = m68863c(obj);
            int m68863c2 = m68863c(obj2);
            if (m68863c != m68863c2) {
                if (m68863c < m68863c2) {
                    return -1;
                }
                return 1;
            }
            int compareTo = m68864b(obj).compareTo(m68864b(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* loaded from: classes4.dex */
    private static class ArbitraryOrderingHolder {

        /* renamed from: a */
        static final Ordering<Object> f40574a = new ArbitraryOrdering();

        private ArbitraryOrderingHolder() {
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    static class IncomparableValueException extends ClassCastException {

        /* renamed from: b */
        final Object f40575b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public IncomparableValueException(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Cannot compare value: "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r3.<init>(r0)
                r3.f40575b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Ordering.IncomparableValueException.<init>(java.lang.Object):void");
        }
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.f39789b;
    }

    public static Ordering<Object> arbitrary() {
        return ArbitraryOrderingHolder.f40574a;
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> from(Comparator<T> comparator) {
        if (comparator instanceof Ordering) {
            return (Ordering) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    @GwtCompatible(serializable = true)
    public static <C extends Comparable> Ordering<C> natural() {
        return NaturalOrdering.f40553d;
    }

    @GwtCompatible(serializable = true)
    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.f40879b;
    }

    /* renamed from: a */
    public <T2 extends T> Ordering<Map.Entry<T2, ?>> m68865a() {
        return (Ordering<Map.Entry<T2, ?>>) onResultOf(Maps.m69025v());
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @ParametricNullness T t) {
        return Collections.binarySearch(list, t, this);
    }

    @Override // java.util.Comparator
    @CanIgnoreReturnValue
    public abstract int compare(@ParametricNullness T t, @ParametricNullness T t2);

    @GwtCompatible(serializable = true)
    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= i * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering(this);
    }

    @ParametricNullness
    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) max(next, it.next());
        }
        return next;
    }

    @ParametricNullness
    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = (E) min(next, it.next());
        }
        return next;
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering(this);
    }

    @GwtCompatible(serializable = true)
    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
        return new ByFunctionOrdering(function, this);
    }

    @GwtCompatible(serializable = true)
    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] m69228f = Iterables.m69228f(iterable);
        Arrays.sort(m69228f, this);
        return Lists.newArrayList(Arrays.asList(m69228f));
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    @GwtCompatible(serializable = true)
    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(Lists.asList(t, tArr));
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    @GwtCompatible(serializable = true)
    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) Preconditions.checkNotNull(ordering);
    }

    @ParametricNullness
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) max(iterable.iterator());
    }

    @ParametricNullness
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) min(iterable.iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    @ParametricNullness
    public <E extends T> E max(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
        E e4 = (E) max(max(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) max(e4, e5);
        }
        return e4;
    }

    @ParametricNullness
    public <E extends T> E min(@ParametricNullness E e, @ParametricNullness E e2, @ParametricNullness E e3, E... eArr) {
        E e4 = (E) min(min(e, e2), e3);
        for (E e5 : eArr) {
            e4 = (E) min(e4, e5);
        }
        return e4;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i) {
        Preconditions.checkNotNull(it);
        CollectPreconditions.m69727b(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i >= 1073741823) {
            ArrayList newArrayList = Lists.newArrayList(it);
            Collections.sort(newArrayList, this);
            if (newArrayList.size() > i) {
                newArrayList.subList(i, newArrayList.size()).clear();
            }
            newArrayList.trimToSize();
            return Collections.unmodifiableList(newArrayList);
        }
        TopKSelector least = TopKSelector.least(i, this);
        least.offerAll(it);
        return least.topK();
    }
}

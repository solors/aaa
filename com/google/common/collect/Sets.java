package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Sets {

    /* renamed from: com.google.common.collect.Sets$5 */
    /* loaded from: classes4.dex */
    public class C168705<E> extends AbstractSet<Set<E>> {

        /* renamed from: b */
        final /* synthetic */ int f40661b;

        /* renamed from: c */
        final /* synthetic */ ImmutableMap f40662c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.Sets$5$1 */
        /* loaded from: classes4.dex */
        public class C168711 extends AbstractIterator<Set<E>> {

            /* renamed from: d */
            final BitSet f40663d;

            C168711() {
                C168705.this = r2;
                this.f40663d = new BitSet(r2.f40662c.size());
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: c */
            public Set<E> computeNext() {
                if (this.f40663d.isEmpty()) {
                    this.f40663d.set(0, C168705.this.f40661b);
                } else {
                    int nextSetBit = this.f40663d.nextSetBit(0);
                    int nextClearBit = this.f40663d.nextClearBit(nextSetBit);
                    if (nextClearBit == C168705.this.f40662c.size()) {
                        return m69807a();
                    }
                    int i = (nextClearBit - nextSetBit) - 1;
                    this.f40663d.set(0, i);
                    this.f40663d.clear(i, nextClearBit);
                    this.f40663d.set(nextClearBit);
                }
                final BitSet bitSet = (BitSet) this.f40663d.clone();
                return new AbstractSet<E>() { // from class: com.google.common.collect.Sets.5.1.1
                    {
                        C168711.this = this;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean contains(Object obj) {
                        Integer num = (Integer) C168705.this.f40662c.get(obj);
                        if (num != null && bitSet.get(num.intValue())) {
                            return true;
                        }
                        return false;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<E> iterator() {
                        return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.5.1.1.1

                            /* renamed from: d */
                            int f40667d = -1;

                            {
                                C168721.this = this;
                            }

                            @Override // com.google.common.collect.AbstractIterator
                            protected E computeNext() {
                                int nextSetBit2 = bitSet.nextSetBit(this.f40667d + 1);
                                this.f40667d = nextSetBit2;
                                if (nextSetBit2 == -1) {
                                    return m69807a();
                                }
                                return C168705.this.f40662c.keySet().asList().get(this.f40667d);
                            }
                        };
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return C168705.this.f40661b;
                    }
                };
            }
        }

        C168705(int i, ImmutableMap immutableMap) {
            this.f40661b = i;
            this.f40662c = immutableMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set.size() != this.f40661b || !this.f40662c.keySet().containsAll(set)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new C168711();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.binomial(this.f40662c.size(), this.f40661b);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.f40662c.keySet());
            int i = this.f40661b;
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("Sets.combinations(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(i);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* renamed from: b */
        private final transient ImmutableList<ImmutableSet<E>> f40669b;

        /* renamed from: c */
        private final transient CartesianList<E> f40670c;

        private CartesianSet(ImmutableList<ImmutableSet<E>> immutableList, CartesianList<E> cartesianList) {
            this.f40669b = immutableList;
            this.f40670c = cartesianList;
        }

        /* renamed from: j */
        static <E> Set<List<E>> m68781j(List<? extends Set<? extends E>> list) {
            ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
            for (Set<? extends E> set : list) {
                ImmutableSet copyOf = ImmutableSet.copyOf((Collection) set);
                if (copyOf.isEmpty()) {
                    return ImmutableSet.m69331of();
                }
                builder.add((ImmutableList.Builder) copyOf);
            }
            final ImmutableList<E> build = builder.build();
            return new CartesianSet(build, new CartesianList(new ImmutableList<List<E>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return build.size();
                }

                @Override // java.util.List
                public List<E> get(int i) {
                    return ((ImmutableSet) build.get(i)).asList();
                }
            }));
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public Collection<List<E>> delegate() {
            return this.f40670c;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List<E> list = (List) obj;
            if (list.size() != this.f40669b.size()) {
                return false;
            }
            int i = 0;
            for (E e : list) {
                if (!this.f40669b.get(i).contains(e)) {
                    return false;
                }
                i++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                return this.f40669b.equals(((CartesianSet) obj).f40669b);
            }
            return super.equals(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i = 1;
            int size = size() - 1;
            for (int i2 = 0; i2 < this.f40669b.size(); i2++) {
                size = ~(~(size * 31));
            }
            UnmodifiableIterator<ImmutableSet<E>> it = this.f40669b.iterator();
            while (it.hasNext()) {
                ImmutableSet<E> next = it.next();
                i = ~(~((i * 31) + ((size() / next.size()) * next.hashCode())));
            }
            return ~(~(i + size));
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    static class DescendingSet<E> extends ForwardingNavigableSet<E> {

        /* renamed from: b */
        private final NavigableSet<E> f40672b;

        public DescendingSet(NavigableSet<E> navigableSet) {
            this.f40672b = navigableSet;
        }

        /* renamed from: r */
        private static <T> Ordering<T> m68779r(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E ceiling(@ParametricNullness E e) {
            return this.f40672b.floor(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f40672b.comparator();
            if (comparator == null) {
                return Ordering.natural().reverse();
            }
            return m68779r(comparator);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f40672b.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f40672b;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E first() {
            return this.f40672b.last();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E floor(@ParametricNullness E e) {
            return this.f40672b.ceiling(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return this.f40672b.tailSet(e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E higher(@ParametricNullness E e) {
            return this.f40672b.lower(e);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f40672b.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return this.f40672b.first();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E lower(@ParametricNullness E e) {
            return this.f40672b.higher(e);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* renamed from: n */
        public NavigableSet<E> mo68774m() {
            return this.f40672b;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollFirst() {
            return this.f40672b.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollLast() {
            return this.f40672b.pollFirst();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return this.f40672b.subSet(e2, z2, e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return this.f40672b.headSet(e, z).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m69517h();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
            return m69511o(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return m69510p(e, e2);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return m69509q(e);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m69516i(tArr);
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        FilteredNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
            super(navigableSet, predicate);
        }

        /* renamed from: c */
        NavigableSet<E> m68778c() {
            return (NavigableSet) this.f39822b;
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e) {
            return (E) Iterables.find(m68778c().tailSet(e, true), this.f39823c, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.filter(m68778c().descendingIterator(), this.f39823c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Sets.filter((NavigableSet) m68778c().descendingSet(), (Predicate) this.f39823c);
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e) {
            return (E) Iterators.find(m68778c().headSet(e, true).descendingIterator(), this.f39823c, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return Sets.filter((NavigableSet) m68778c().headSet(e, z), (Predicate) this.f39823c);
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e) {
            return (E) Iterables.find(m68778c().tailSet(e, false), this.f39823c, null);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) Iterators.find(m68778c().descendingIterator(), this.f39823c);
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e) {
            return (E) Iterators.find(m68778c().headSet(e, false).descendingIterator(), this.f39823c, null);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) Iterables.m69231c(m68778c(), this.f39823c);
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) Iterables.m69231c(m68778c().descendingSet(), this.f39823c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return Sets.filter((NavigableSet) m68778c().subSet(e, z, e2, z2), (Predicate) this.f39823c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return Sets.filter((NavigableSet) m68778c().tailSet(e, z), (Predicate) this.f39823c);
        }
    }

    /* loaded from: classes4.dex */
    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        FilteredSet(Set<E> set, Predicate<? super E> predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.m68787a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m68786b(this);
        }
    }

    /* loaded from: classes4.dex */
    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        FilteredSortedSet(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f39822b).comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) Iterators.find(this.f39822b.iterator(), this.f39823c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
            return new FilteredSortedSet(((SortedSet) this.f39822b).headSet(e), this.f39823c);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
        @ParametricNullness
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f39822b;
            while (true) {
                ?? r1 = (Object) sortedSet.last();
                if (this.f39823c.apply(r1)) {
                    return r1;
                }
                sortedSet = sortedSet.headSet(r1);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return new FilteredSortedSet(((SortedSet) this.f39822b).subSet(e, e2), this.f39823c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return new FilteredSortedSet(((SortedSet) this.f39822b).tailSet(e), this.f39823c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.m68784d(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* loaded from: classes4.dex */
    public static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* renamed from: b */
        final ImmutableMap<E, Integer> f40673b;

        PowerSet(Set<E> set) {
            boolean z;
            if (set.size() <= 30) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Too many elements to create power set: %s > 30", set.size());
            this.f40673b = Maps.m69026u(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Set) {
                return this.f40673b.keySet().containsAll((Set) obj);
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj instanceof PowerSet) {
                return this.f40673b.keySet().equals(((PowerSet) obj).f40673b.keySet());
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f40673b.keySet().hashCode() << (this.f40673b.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new AbstractIndexedListIterator<Set<E>>(size()) { // from class: com.google.common.collect.Sets.PowerSet.1
                {
                    PowerSet.this = this;
                }

                @Override // com.google.common.collect.AbstractIndexedListIterator
                /* renamed from: a */
                public Set<E> get(int i) {
                    return new SubSet(PowerSet.this.f40673b, i);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f40673b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.f40673b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
            sb2.append("powerSet(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class SetView<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        public <S extends Set<E>> S copyInto(S s) {
            s.addAll(this);
            return s;
        }

        public ImmutableSet<E> immutableCopy() {
            return ImmutableSet.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private SetView() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class SubSet<E> extends AbstractSet<E> {

        /* renamed from: b */
        private final ImmutableMap<E, Integer> f40675b;

        /* renamed from: c */
        private final int f40676c;

        SubSet(ImmutableMap<E, Integer> immutableMap, int i) {
            this.f40675b = immutableMap;
            this.f40676c = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Integer num = this.f40675b.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f40676c) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new UnmodifiableIterator<E>() { // from class: com.google.common.collect.Sets.SubSet.1

                /* renamed from: b */
                final ImmutableList<E> f40677b;

                /* renamed from: c */
                int f40678c;

                {
                    SubSet.this = this;
                    this.f40677b = this.f40675b.keySet().asList();
                    this.f40678c = this.f40676c;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f40678c != 0) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator
                public E next() {
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f40678c);
                    if (numberOfTrailingZeros != 32) {
                        this.f40678c &= ~(1 << numberOfTrailingZeros);
                        return this.f40677b.get(numberOfTrailingZeros);
                    }
                    throw new NoSuchElementException();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f40676c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {

        /* renamed from: b */
        private final NavigableSet<E> f40680b;

        /* renamed from: c */
        private final SortedSet<E> f40681c;

        /* renamed from: d */
        private transient UnmodifiableNavigableSet<E> f40682d;

        UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            this.f40680b = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.f40681c = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e) {
            return this.f40680b.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.unmodifiableIterator(this.f40680b.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.f40682d;
            if (unmodifiableNavigableSet == null) {
                UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.f40680b.descendingSet());
                this.f40682d = unmodifiableNavigableSet2;
                unmodifiableNavigableSet2.f40682d = this;
                return unmodifiableNavigableSet2;
            }
            return unmodifiableNavigableSet;
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e) {
            return this.f40680b.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.f40680b.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e) {
            return this.f40680b.higher(e);
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e) {
            return this.f40680b.lower(e);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: m */
        public SortedSet<E> mo67841j() {
            return this.f40681c;
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return Sets.unmodifiableNavigableSet(this.f40680b.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return Sets.unmodifiableNavigableSet(this.f40680b.tailSet(e, z));
        }
    }

    private Sets() {
    }

    /* renamed from: a */
    public static boolean m68787a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m68786b(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    /* renamed from: c */
    private static <E extends Enum<E>> EnumSet<E> m68785c(Collection<E> collection, Class<E> cls) {
        EnumSet<E> allOf = EnumSet.allOf(cls);
        allOf.removeAll(collection);
        return allOf;
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        return CartesianSet.m68781j(list);
    }

    @Beta
    public static <E> Set<Set<E>> combinations(Set<E> set, int i) {
        boolean z;
        ImmutableMap m69026u = Maps.m69026u(set);
        CollectPreconditions.m69727b(i, "size");
        if (i <= m69026u.size()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "size (%s) must be <= set.size() (%s)", i, m69026u.size());
        if (i == 0) {
            return ImmutableSet.m69330of(ImmutableSet.m69331of());
        }
        if (i == m69026u.size()) {
            return ImmutableSet.m69330of(m69026u.keySet());
        }
        return new C168705(i, m69026u);
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return m68785c(collection, collection.iterator().next().getDeclaringClass());
    }

    /* renamed from: d */
    public static boolean m68784d(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return Iterators.removeAll(set.iterator(), collection);
        }
        return m68783e(set, collection.iterator());
    }

    public static <E> SetView<E> difference(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (set.contains(obj) && !set2.contains(obj)) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i = 0;
                for (E e : set) {
                    if (!set2.contains(e)) {
                        i++;
                    }
                }
                return i;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.3.1

                    /* renamed from: d */
                    final Iterator<E> f40654d;

                    {
                        C168663.this = this;
                        this.f40654d = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        while (this.f40654d.hasNext()) {
                            E next = this.f40654d.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return m69807a();
                    }
                };
            }
        };
    }

    /* renamed from: e */
    public static boolean m68783e(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, (Predicate) predicate);
        }
        if (set instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) set;
            return new FilteredSet((Set) filteredSet.f39822b, Predicates.and(filteredSet.f39823c, predicate));
        }
        return new FilteredSet((Set) Preconditions.checkNotNull(set), (Predicate) Preconditions.checkNotNull(predicate));
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e, E... eArr) {
        return ImmutableEnumSet.m69429m(EnumSet.of((Enum) e, (Enum[]) eArr));
    }

    public static <E> SetView<E> intersection(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (set.contains(obj) && set2.contains(obj)) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                if (set.containsAll(collection) && set2.containsAll(collection)) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i = 0;
                for (E e : set) {
                    if (set2.contains(e)) {
                        i++;
                    }
                }
                return i;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.2.1

                    /* renamed from: d */
                    final Iterator<E> f40650d;

                    {
                        C168642.this = this;
                        this.f40650d = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        while (this.f40650d.hasNext()) {
                            E next = this.f40650d.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return m69807a();
                    }
                };
            }
        };
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        Iterables.addAll(noneOf, iterable);
        return noneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(Maps.m69036k(i));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(Maps.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new LinkedHashSet<>(Maps.m69036k(i));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    @GwtCompatible(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new PowerSet(set);
    }

    @Beta
    @GwtIncompatible
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, Range<K> range) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (navigableSet.comparator() != null && navigableSet.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            if (navigableSet.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            K lowerEndpoint = range.lowerEndpoint();
            BoundType lowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            if (lowerBoundType == boundType) {
                z = true;
            } else {
                z = false;
            }
            K upperEndpoint = range.upperEndpoint();
            if (range.upperBoundType() != boundType) {
                z3 = false;
            }
            return navigableSet.subSet(lowerEndpoint, z, upperEndpoint, z3);
        } else if (range.hasLowerBound()) {
            K lowerEndpoint2 = range.lowerEndpoint();
            if (range.lowerBoundType() != BoundType.CLOSED) {
                z3 = false;
            }
            return navigableSet.tailSet(lowerEndpoint2, z3);
        } else if (range.hasUpperBound()) {
            K upperEndpoint2 = range.upperEndpoint();
            if (range.upperBoundType() != BoundType.CLOSED) {
                z3 = false;
            }
            return navigableSet.headSet(upperEndpoint2, z3);
        } else {
            return (NavigableSet) Preconditions.checkNotNull(navigableSet);
        }
    }

    public static <E> SetView<E> symmetricDifference(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set2.contains(obj) ^ set.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.equals(set2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i = 0;
                for (E e : set) {
                    if (!set2.contains(e)) {
                        i++;
                    }
                }
                for (E e2 : set2) {
                    if (!set.contains(e2)) {
                        i++;
                    }
                }
                return i;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                final Iterator<E> it = set.iterator();
                final Iterator<E> it2 = set2.iterator();
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.4.1
                    {
                        C168684.this = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public E computeNext() {
                        while (it.hasNext()) {
                            E e = (E) it.next();
                            if (!set2.contains(e)) {
                                return e;
                            }
                        }
                        while (it2.hasNext()) {
                            E e2 = (E) it2.next();
                            if (!set.contains(e2)) {
                                return e2;
                            }
                        }
                        return m69807a();
                    }
                };
            }
        };
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return Synchronized.m68723q(navigableSet);
    }

    public static <E> SetView<E> union(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!set.contains(obj) && !set2.contains(obj)) {
                    return false;
                }
                return true;
            }

            @Override // com.google.common.collect.Sets.SetView
            public <S extends Set<E>> S copyInto(S s) {
                s.addAll(set);
                s.addAll(set2);
                return s;
            }

            @Override // com.google.common.collect.Sets.SetView
            public ImmutableSet<E> immutableCopy() {
                return new ImmutableSet.Builder().addAll((Iterable) set).addAll((Iterable) set2).build();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                if (set.isEmpty() && set2.isEmpty()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int size = set.size();
                for (E e : set2) {
                    if (!set.contains(e)) {
                        size++;
                    }
                }
                return size;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.1.1

                    /* renamed from: d */
                    final Iterator<? extends E> f40645d;

                    /* renamed from: f */
                    final Iterator<? extends E> f40646f;

                    {
                        C168621.this = this;
                        this.f40645d = set.iterator();
                        this.f40646f = set2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        if (this.f40645d.hasNext()) {
                            return this.f40645d.next();
                        }
                        while (this.f40646f.hasNext()) {
                            E next = this.f40646f.next();
                            if (!set.contains(next)) {
                                return next;
                            }
                        }
                        return m69807a();
                    }
                };
            }
        };
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        if (!(navigableSet instanceof ImmutableCollection) && !(navigableSet instanceof UnmodifiableNavigableSet)) {
            return new UnmodifiableNavigableSet(navigableSet);
        }
        return navigableSet;
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof ImmutableEnumSet) {
            return (ImmutableEnumSet) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return ImmutableSet.m69331of();
            }
            return ImmutableEnumSet.m69429m(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (it.hasNext()) {
            EnumSet of = EnumSet.of((Enum) it.next());
            Iterators.addAll(of, it);
            return ImmutableEnumSet.m69429m(of);
        }
        return ImmutableSet.m69331of();
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> newConcurrentHashSet = newConcurrentHashSet();
        Iterables.addAll(newConcurrentHashSet, iterable);
        return newConcurrentHashSet;
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        Collection newArrayList;
        if (iterable instanceof Collection) {
            newArrayList = (Collection) iterable;
        } else {
            newArrayList = Lists.newArrayList(iterable);
        }
        return new CopyOnWriteArraySet<>(newArrayList);
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> newHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(newHashSetWithExpectedSize, eArr);
        return newHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> newLinkedHashSet = newLinkedHashSet();
        Iterables.addAll(newLinkedHashSet, iterable);
        return newLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> newTreeSet = newTreeSet();
        Iterables.addAll(newTreeSet, iterable);
        return newTreeSet;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return m68785c(collection, cls);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> newHashSet = newHashSet();
        Iterators.addAll(newHashSet, it);
        return newHashSet;
    }

    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        if (sortedSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) sortedSet;
            return new FilteredSortedSet((SortedSet) filteredSet.f39822b, Predicates.and(filteredSet.f39823c, predicate));
        }
        return new FilteredSortedSet((SortedSet) Preconditions.checkNotNull(sortedSet), (Predicate) Preconditions.checkNotNull(predicate));
    }

    @GwtIncompatible
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.f39822b, Predicates.and(filteredSet.f39823c, predicate));
        }
        return new FilteredNavigableSet((NavigableSet) Preconditions.checkNotNull(navigableSet), (Predicate) Preconditions.checkNotNull(predicate));
    }
}

package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Multisets {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (getCount() != entry.getCount() || !Objects.equal(getElement(), entry.getElement())) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            int hashCode;
            E element = getElement();
            if (element == null) {
                hashCode = 0;
            } else {
                hashCode = element.hashCode();
            }
            return hashCode ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count != 1) {
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 14);
                sb2.append(valueOf);
                sb2.append(" x ");
                sb2.append(count);
                return sb2.toString();
            }
            return valueOf;
        }
    }

    /* loaded from: classes4.dex */
    private static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {

        /* renamed from: b */
        static final DecreasingCount f40534b = new DecreasingCount();

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        /* renamed from: c */
        abstract Multiset<E> mo68763c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo68763c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return mo68763c().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return mo68763c().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo68763c().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (mo68763c().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo68763c().entrySet().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        /* renamed from: c */
        abstract Multiset<E> mo68912c();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo68912c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (entry.getCount() <= 0 || mo68912c().count(entry.getElement()) != entry.getCount()) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                E e = (E) entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return mo68912c().setCount(e, count, 0);
                }
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* renamed from: d */
        final Multiset<E> f40535d;

        /* renamed from: f */
        final Predicate<? super E> f40536f;

        FilteredMultiset(Multiset<E> multiset, Predicate<? super E> predicate) {
            super();
            this.f40535d = (Multiset) Preconditions.checkNotNull(multiset);
            this.f40536f = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E e, int i) {
            Preconditions.checkArgument(this.f40536f.apply(e), "Element %s does not match predicate %s", e, this.f40536f);
            return this.f40535d.add(e, i);
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: c */
        Set<E> mo68911c() {
            return Sets.filter(this.f40535d.elementSet(), this.f40536f);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int count = this.f40535d.count(obj);
            if (count <= 0 || !this.f40536f.apply(obj)) {
                return 0;
            }
            return count;
        }

        @Override // com.google.common.collect.AbstractMultiset
        Set<Multiset.Entry<E>> createEntrySet() {
            return Sets.filter(this.f40535d.entrySet(), new Predicate<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.FilteredMultiset.1
                {
                    FilteredMultiset.this = this;
                }

                @Override // com.google.common.base.Predicate
                public /* bridge */ /* synthetic */ boolean apply(Object obj) {
                    return apply((Multiset.Entry) ((Multiset.Entry) obj));
                }

                public boolean apply(Multiset.Entry<E> entry) {
                    return FilteredMultiset.this.f40536f.apply(entry.getElement());
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: e */
        Iterator<E> mo68664e() {
            throw new AssertionError("should never be called");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: f */
        public Iterator<Multiset.Entry<E>> mo68663f() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            CollectPreconditions.m69727b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.f40535d.remove(obj, i);
            }
            return 0;
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public UnmodifiableIterator<E> iterator() {
            return Iterators.filter(this.f40535d.iterator(), this.f40536f);
        }
    }

    /* loaded from: classes4.dex */
    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        @ParametricNullness

        /* renamed from: b */
        private final E f40538b;

        /* renamed from: c */
        private final int f40539c;

        ImmutableEntry(@ParametricNullness E e, int i) {
            this.f40538b = e;
            this.f40539c = i;
            CollectPreconditions.m69727b(i, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.f40539c;
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public final E getElement() {
            return this.f40538b;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class MultisetIteratorImpl<E> implements Iterator<E> {

        /* renamed from: b */
        private final Multiset<E> f40540b;

        /* renamed from: c */
        private final Iterator<Multiset.Entry<E>> f40541c;

        /* renamed from: d */
        private Multiset.Entry<E> f40542d;

        /* renamed from: f */
        private int f40543f;

        /* renamed from: g */
        private int f40544g;

        /* renamed from: h */
        private boolean f40545h;

        MultisetIteratorImpl(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it) {
            this.f40540b = multiset;
            this.f40541c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f40543f <= 0 && !this.f40541c.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public E next() {
            if (hasNext()) {
                if (this.f40543f == 0) {
                    Multiset.Entry<E> next = this.f40541c.next();
                    this.f40542d = next;
                    int count = next.getCount();
                    this.f40543f = count;
                    this.f40544g = count;
                }
                this.f40543f--;
                this.f40545h = true;
                Multiset.Entry<E> entry = this.f40542d;
                java.util.Objects.requireNonNull(entry);
                return entry.getElement();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.m69724e(this.f40545h);
            if (this.f40544g == 1) {
                this.f40541c.remove();
            } else {
                Multiset<E> multiset = this.f40540b;
                Multiset.Entry<E> entry = this.f40542d;
                java.util.Objects.requireNonNull(entry);
                multiset.remove(entry.getElement());
            }
            this.f40544g--;
            this.f40545h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {

        /* renamed from: b */
        final Multiset<? extends E> f40546b;

        /* renamed from: c */
        transient Set<E> f40547c;

        /* renamed from: d */
        transient Set<Multiset.Entry<E>> f40548d;

        public UnmodifiableMultiset(Multiset<? extends E> multiset) {
            this.f40546b = multiset;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set = this.f40547c;
            if (set == null) {
                Set<E> mo68564l = mo68564l();
                this.f40547c = mo68564l;
                return mo68564l;
            }
            return set;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.f40548d;
            if (set == null) {
                Set<Multiset.Entry<E>> unmodifiableSet = Collections.unmodifiableSet(this.f40546b.entrySet());
                this.f40548d = unmodifiableSet;
                return unmodifiableSet;
            }
            return set;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.unmodifiableIterator(this.f40546b.iterator());
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Multiset<E> delegate() {
            return (Multiset<? extends E>) this.f40546b;
        }

        /* renamed from: l */
        Set<E> mo68564l() {
            return Collections.unmodifiableSet(this.f40546b.elementSet());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(@ParametricNullness E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(@ParametricNullness E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(@ParametricNullness E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        private ViewMultiset() {
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // com.google.common.collect.AbstractMultiset
        /* renamed from: d */
        int mo68665d() {
            return elementSet().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return Multisets.m68924h(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return Multisets.m68923i(this);
        }
    }

    private Multisets() {
    }

    /* renamed from: a */
    private static <E> boolean m68931a(Multiset<E> multiset, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.m69765g(multiset);
        return true;
    }

    /* renamed from: b */
    private static <E> boolean m68930b(Multiset<E> multiset, Multiset<? extends E> multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return m68931a(multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry<? extends E> entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    /* renamed from: c */
    public static <E> boolean m68929c(Multiset<E> multiset, Collection<? extends E> collection) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            return m68930b(multiset, m68928d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.addAll(multiset, collection.iterator());
    }

    @CanIgnoreReturnValue
    public static boolean containsOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        for (Multiset.Entry<?> entry : multiset2.entrySet()) {
            if (multiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    @Beta
    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
        Multiset.Entry[] entryArr = (Multiset.Entry[]) multiset.entrySet().toArray(new Multiset.Entry[0]);
        Arrays.sort(entryArr, DecreasingCount.f40534b);
        return ImmutableMultiset.m69364g(Arrays.asList(entryArr));
    }

    /* renamed from: d */
    public static <T> Multiset<T> m68928d(Iterable<T> iterable) {
        return (Multiset) iterable;
    }

    @Beta
    public static <E> Multiset<E> difference(final Multiset<E> multiset, final Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                int count = multiset.count(obj);
                if (count == 0) {
                    return 0;
                }
                return Math.max(0, count - multiset2.count(obj));
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
            /* renamed from: d */
            int mo68665d() {
                return Iterators.size(mo68663f());
            }

            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: e */
            Iterator<E> mo68664e() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Multisets.4.1
                    {
                        C168464.this = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected E computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            E e = (E) entry.getElement();
                            if (entry.getCount() > multiset2.count(e)) {
                                return e;
                            }
                        }
                        return m69807a();
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: f */
            public Iterator<Multiset.Entry<E>> mo68663f() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.4.2
                    {
                        C168464.this = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    /* renamed from: c */
                    public Multiset.Entry<E> computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            int count = entry.getCount() - multiset2.count(element);
                            if (count > 0) {
                                return Multisets.immutableEntry(element, count);
                            }
                        }
                        return m69807a();
                    }
                };
            }
        };
    }

    /* renamed from: e */
    public static <E> Iterator<E> m68927e(Iterator<Multiset.Entry<E>> it) {
        return new TransformedIterator<Multiset.Entry<E>, E>(it) { // from class: com.google.common.collect.Multisets.5
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* renamed from: b */
            public E mo68681a(Multiset.Entry<E> entry) {
                return entry.getElement();
            }
        };
    }

    /* renamed from: f */
    public static boolean m68926f(Multiset<?> multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Beta
    public static <E> Multiset<E> filter(Multiset<E> multiset, Predicate<? super E> predicate) {
        if (multiset instanceof FilteredMultiset) {
            FilteredMultiset filteredMultiset = (FilteredMultiset) multiset;
            return new FilteredMultiset(filteredMultiset.f40535d, Predicates.and(filteredMultiset.f40536f, predicate));
        }
        return new FilteredMultiset(multiset, predicate);
    }

    /* renamed from: g */
    public static int m68925g(Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    /* renamed from: h */
    public static <E> Iterator<E> m68924h(Multiset<E> multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    /* renamed from: i */
    static int m68923i(Multiset<?> multiset) {
        long j = 0;
        for (Multiset.Entry<?> entry : multiset.entrySet()) {
            j += entry.getCount();
        }
        return Ints.saturatedCast(j);
    }

    public static <E> Multiset.Entry<E> immutableEntry(@ParametricNullness E e, int i) {
        return new ImmutableEntry(e, i);
    }

    public static <E> Multiset<E> intersection(final Multiset<E> multiset, final Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: c */
            Set<E> mo68911c() {
                return Sets.intersection(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                int count = multiset.count(obj);
                if (count == 0) {
                    return 0;
                }
                return Math.min(count, multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: e */
            Iterator<E> mo68664e() {
                throw new AssertionError("should never be called");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: f */
            public Iterator<Multiset.Entry<E>> mo68663f() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.2.1
                    {
                        C168422.this = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    /* renamed from: c */
                    public Multiset.Entry<E> computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            int min = Math.min(entry.getCount(), multiset2.count(element));
                            if (min > 0) {
                                return Multisets.immutableEntry(element, min);
                            }
                        }
                        return m69807a();
                    }
                };
            }
        };
    }

    /* renamed from: j */
    public static boolean m68922j(Multiset<?> multiset, Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    /* renamed from: k */
    public static boolean m68921k(Multiset<?> multiset, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    /* renamed from: l */
    private static <E> boolean m68920l(Multiset<E> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            int count = multiset2.count(next.getElement());
            if (count == 0) {
                it.remove();
            } else if (count < next.getCount()) {
                multiset.setCount(next.getElement(), count);
            }
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    public static <E> int m68919m(Multiset<E> multiset, @ParametricNullness E e, int i) {
        CollectPreconditions.m69727b(i, "count");
        int count = multiset.count(e);
        int i2 = i - count;
        if (i2 > 0) {
            multiset.add(e, i2);
        } else if (i2 < 0) {
            multiset.remove(e, -i2);
        }
        return count;
    }

    /* renamed from: n */
    public static <E> boolean m68918n(Multiset<E> multiset, @ParametricNullness E e, int i, int i2) {
        CollectPreconditions.m69727b(i, "oldCount");
        CollectPreconditions.m69727b(i2, "newCount");
        if (multiset.count(e) == i) {
            multiset.setCount(e, i2);
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return removeOccurrences(multiset, (Multiset<?>) iterable);
        }
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(iterable);
        Iterator<?> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= multiset.remove(it.next());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean retainOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        return m68920l(multiset, multiset2);
    }

    @Beta
    public static <E> Multiset<E> sum(final Multiset<? extends E> multiset, final Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: c */
            Set<E> mo68911c() {
                return Sets.union(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(Object obj) {
                if (!multiset.contains(obj) && !multiset2.contains(obj)) {
                    return false;
                }
                return true;
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                return multiset.count(obj) + multiset2.count(obj);
            }

            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: e */
            Iterator<E> mo68664e() {
                throw new AssertionError("should never be called");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: f */
            public Iterator<Multiset.Entry<E>> mo68663f() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                final Iterator<Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.3.1
                    {
                        C168443.this = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    /* renamed from: c */
                    public Multiset.Entry<E> computeNext() {
                        if (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, entry.getCount() + multiset2.count(element));
                        }
                        while (it2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                            Object element2 = entry2.getElement();
                            if (!multiset.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return m69807a();
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                if (multiset.isEmpty() && multiset2.isEmpty()) {
                    return true;
                }
                return false;
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public int size() {
                return IntMath.saturatedAdd(multiset.size(), multiset2.size());
            }
        };
    }

    @Beta
    public static <E> Multiset<E> union(final Multiset<? extends E> multiset, final Multiset<? extends E> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new ViewMultiset<E>() { // from class: com.google.common.collect.Multisets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: c */
            Set<E> mo68911c() {
                return Sets.union(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(Object obj) {
                if (!multiset.contains(obj) && !multiset2.contains(obj)) {
                    return false;
                }
                return true;
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                return Math.max(multiset.count(obj), multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: e */
            Iterator<E> mo68664e() {
                throw new AssertionError("should never be called");
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMultiset
            /* renamed from: f */
            public Iterator<Multiset.Entry<E>> mo68663f() {
                final Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
                final Iterator<Multiset.Entry<E>> it2 = multiset2.entrySet().iterator();
                return new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.Multisets.1.1
                    {
                        C168401.this = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    /* renamed from: c */
                    public Multiset.Entry<E> computeNext() {
                        if (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, Math.max(entry.getCount(), multiset2.count(element)));
                        }
                        while (it2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                            Object element2 = entry2.getElement();
                            if (!multiset.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        return m69807a();
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                if (multiset.isEmpty() && multiset2.isEmpty()) {
                    return true;
                }
                return false;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
        return ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset)) ? multiset : new UnmodifiableMultiset((Multiset) Preconditions.checkNotNull(multiset));
    }

    @Beta
    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        return new UnmodifiableSortedMultiset((SortedMultiset) Preconditions.checkNotNull(sortedMultiset));
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> immutableMultiset) {
        return (Multiset) Preconditions.checkNotNull(immutableMultiset);
    }

    @CanIgnoreReturnValue
    public static boolean removeOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        Iterator<Multiset.Entry<?>> it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry<?> next = it.next();
            int count = multiset2.count(next.getElement());
            if (count >= next.getCount()) {
                it.remove();
            } else if (count > 0) {
                multiset.remove(next.getElement(), count);
            }
            z = true;
        }
        return z;
    }
}

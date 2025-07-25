package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Iterators {

    /* loaded from: classes4.dex */
    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {

        /* renamed from: g */
        static final UnmodifiableListIterator<Object> f40225g = new ArrayItr(new Object[0], 0, 0, 0);

        /* renamed from: d */
        private final T[] f40226d;

        /* renamed from: f */
        private final int f40227f;

        ArrayItr(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f40226d = tArr;
            this.f40227f = i;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        protected T get(int i) {
            return this.f40226d[this.f40227f + i];
        }
    }

    /* loaded from: classes4.dex */
    public static class ConcatenatedIterator<T> implements Iterator<T> {

        /* renamed from: b */
        private Iterator<? extends T> f40228b;

        /* renamed from: c */
        private Iterator<? extends T> f40229c = Iterators.m69220f();

        /* renamed from: d */
        private Iterator<? extends Iterator<? extends T>> f40230d;

        /* renamed from: f */
        private Deque<Iterator<? extends Iterator<? extends T>>> f40231f;

        ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
            this.f40230d = (Iterator) Preconditions.checkNotNull(it);
        }

        /* renamed from: a */
        private Iterator<? extends Iterator<? extends T>> m69214a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f40230d;
                if (it != null && it.hasNext()) {
                    return this.f40230d;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f40231f;
                if (deque != null && !deque.isEmpty()) {
                    this.f40230d = this.f40231f.removeFirst();
                } else {
                    return null;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.f40229c)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> m69214a = m69214a();
                this.f40230d = m69214a;
                if (m69214a == null) {
                    return false;
                }
                Iterator<? extends T> next = m69214a.next();
                this.f40229c = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.f40229c = concatenatedIterator.f40229c;
                    if (this.f40231f == null) {
                        this.f40231f = new ArrayDeque();
                    }
                    this.f40231f.addFirst(this.f40230d);
                    if (concatenatedIterator.f40231f != null) {
                        while (!concatenatedIterator.f40231f.isEmpty()) {
                            this.f40231f.addFirst(concatenatedIterator.f40231f.removeLast());
                        }
                    }
                    this.f40230d = concatenatedIterator.f40230d;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f40229c;
                this.f40228b = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f40228b;
            if (it != null) {
                it.remove();
                this.f40228b = null;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* loaded from: classes4.dex */
    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.m69724e(false);
        }
    }

    /* loaded from: classes4.dex */
    public static class MergingIterator<T> extends UnmodifiableIterator<T> {

        /* renamed from: b */
        final Queue<PeekingIterator<T>> f40233b;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.f40233b = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m69211b;
                    m69211b = Iterators.MergingIterator.m69211b(comparator, (PeekingIterator) obj, (PeekingIterator) obj2);
                    return m69211b;
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.f40233b.add(Iterators.peekingIterator(it));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public static /* synthetic */ int m69211b(Comparator comparator, PeekingIterator peekingIterator, PeekingIterator peekingIterator2) {
            return comparator.compare(peekingIterator.peek(), peekingIterator2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f40233b.isEmpty();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            PeekingIterator<T> remove = this.f40233b.remove();
            T next = remove.next();
            if (remove.hasNext()) {
                this.f40233b.add(remove);
            }
            return next;
        }
    }

    /* loaded from: classes4.dex */
    public static class PeekingImpl<E> implements PeekingIterator<E> {

        /* renamed from: b */
        private final Iterator<? extends E> f40234b;

        /* renamed from: c */
        private boolean f40235c;

        /* renamed from: d */
        private E f40236d;

        public PeekingImpl(Iterator<? extends E> it) {
            this.f40234b = (Iterator) Preconditions.checkNotNull(it);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f40235c && !this.f40234b.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.f40235c) {
                return this.f40234b.next();
            }
            E e = (E) NullnessCasts.m68906a(this.f40236d);
            this.f40235c = false;
            this.f40236d = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.f40235c) {
                this.f40236d = this.f40234b.next();
                this.f40235c = true;
            }
            return (E) NullnessCasts.m68906a(this.f40236d);
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.f40235c, "Can't remove after you've peeked at next");
            this.f40234b.remove();
        }
    }

    private Iterators() {
    }

    /* renamed from: a */
    public static <T> ListIterator<T> m69225a(Iterator<T> it) {
        return (ListIterator) it;
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it, int i) {
        boolean z;
        Preconditions.checkNotNull(it);
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> boolean all(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (!predicate.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, Predicate<? super T> predicate) {
        if (indexOf(it, predicate) != -1) {
            return true;
        }
        return false;
    }

    public static <T> Enumeration<T> asEnumeration(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new Enumeration<T>() { // from class: com.google.common.collect.Iterators.11
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            @ParametricNullness
            public T nextElement() {
                return (T) it.next();
            }
        };
    }

    /* renamed from: b */
    public static void m69224b(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("position (");
        sb2.append(i);
        sb2.append(") must not be negative");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: c */
    public static void m69223c(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        return concat(m69221e(it, it2));
    }

    public static <T> Iterator<T> consumingIterator(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t = (T) it.next();
                it.remove();
                return t;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.2

            /* renamed from: b */
            Iterator<T> f40209b = Iterators.m69218h();

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (!this.f40209b.hasNext() && !iterable.iterator().hasNext()) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.f40209b.hasNext()) {
                    Iterator<T> it = iterable.iterator();
                    this.f40209b = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.f40209b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f40209b.remove();
            }
        };
    }

    /* renamed from: d */
    static <T> Iterator<T> m69222d(Iterator<? extends T>... itArr) {
        for (Iterator it : (Iterator[]) Preconditions.checkNotNull(itArr)) {
            Preconditions.checkNotNull(it);
        }
        return concat(m69221e(itArr));
    }

    /* renamed from: e */
    private static <I extends Iterator<?>> Iterator<I> m69221e(final I... iArr) {
        return new UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3

            /* renamed from: b */
            int f40211b = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f40211b < iArr.length) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Iterator next() {
                if (hasNext()) {
                    Iterator it = iArr[this.f40211b];
                    Objects.requireNonNull(it);
                    Iterator it2 = it;
                    Iterator[] itArr = iArr;
                    int i = this.f40211b;
                    itArr[i] = null;
                    this.f40211b = i + 1;
                    return it2;
                }
                throw new NoSuchElementException();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean elementsEqual(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Iterators.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: f */
    public static <T> UnmodifiableIterator<T> m69220f() {
        return m69219g();
    }

    public static <T> UnmodifiableIterator<T> filter(final Iterator<T> it, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            @Override // com.google.common.collect.AbstractIterator
            protected T computeNext() {
                while (it.hasNext()) {
                    T t = (T) it.next();
                    if (predicate.apply(t)) {
                        return t;
                    }
                }
                return m69807a();
            }
        };
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return m69217i(tArr, 0, tArr.length, 0);
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(final Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.10
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) enumeration.nextElement();
            }
        };
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i = 0;
        while (contains(it, obj)) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    static <T> UnmodifiableListIterator<T> m69219g() {
        return (UnmodifiableListIterator<T>) ArrayItr.f40225g;
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> it, int i) {
        m69224b(i);
        int advance = advance(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        StringBuilder sb2 = new StringBuilder(91);
        sb2.append("position (");
        sb2.append(i);
        sb2.append(") must be less than the number of elements that remained (");
        sb2.append(advance);
        sb2.append(")");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> it, @ParametricNullness T t) {
        if (it.hasNext()) {
            return it.next();
        }
        return t;
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (it.hasNext()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected one element but was: <");
            sb2.append(next);
            for (int i = 0; i < 4 && it.hasNext(); i++) {
                sb2.append(", ");
                sb2.append(it.next());
            }
            if (it.hasNext()) {
                sb2.append(", ...");
            }
            sb2.append('>');
            throw new IllegalArgumentException(sb2.toString());
        }
        return next;
    }

    /* renamed from: h */
    public static <T> Iterator<T> m69218h() {
        return EmptyModifiableIterator.INSTANCE;
    }

    /* renamed from: i */
    static <T> UnmodifiableListIterator<T> m69217i(T[] tArr, int i, int i2, int i3) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        Preconditions.checkPositionIndexes(i, i + i2, tArr.length);
        Preconditions.checkPositionIndex(i3, i2);
        if (i2 == 0) {
            return m69219g();
        }
        return new ArrayItr(tArr, i, i2, i3);
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: j */
    private static <T> UnmodifiableIterator<List<T>> m69216j(final Iterator<T> it, final int i, final boolean z) {
        boolean z2;
        Preconditions.checkNotNull(it);
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        return new UnmodifiableIterator<List<T>>() { // from class: com.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public List<T> next() {
                if (hasNext()) {
                    Object[] objArr = new Object[i];
                    int i2 = 0;
                    while (i2 < i && it.hasNext()) {
                        objArr[i2] = it.next();
                        i2++;
                    }
                    for (int i3 = i2; i3 < i; i3++) {
                        objArr[i3] = null;
                    }
                    List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                    return (z || i2 == i) ? unmodifiableList : unmodifiableList.subList(0, i2);
                }
                throw new NoSuchElementException();
            }
        };
    }

    /* renamed from: k */
    public static <T> T m69215k(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static <T> Iterator<T> limit(final Iterator<T> it, final int i) {
        boolean z;
        Preconditions.checkNotNull(it);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "limit is negative");
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.7

            /* renamed from: b */
            private int f40219b;

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f40219b < i && it.hasNext()) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (hasNext()) {
                    this.f40219b++;
                    return (T) it.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                it.remove();
            }
        };
    }

    @Beta
    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i) {
        return m69216j(it, i, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i) {
        return m69216j(it, i, false);
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
        if (it instanceof PeekingImpl) {
            return (PeekingImpl) it;
        }
        return new PeekingImpl(it);
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness final T t) {
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9

            /* renamed from: b */
            boolean f40223b;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return !this.f40223b;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.f40223b) {
                    this.f40223b = true;
                    return (T) t;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public static int size(Iterator<?> it) {
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return Ints.saturatedCast(j);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it), cls);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(it) { // from class: com.google.common.collect.Iterators.6
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* renamed from: a */
            public T mo68681a(@ParametricNullness F f) {
                return (T) function.apply(f);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return Optional.m70057of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<? extends T> it) {
        Preconditions.checkNotNull(it);
        if (it instanceof UnmodifiableIterator) {
            return (UnmodifiableIterator) it;
        }
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) it.next();
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it, @ParametricNullness T t) {
        return it.hasNext() ? (T) getLast(it) : t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        return concat(m69221e(it, it2, it3));
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it, Class<T> cls) {
        return filter(it, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        return (PeekingIterator) Preconditions.checkNotNull(peekingIterator);
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(unmodifiableIterator);
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it, int i, @ParametricNullness T t) {
        m69224b(i);
        advance(it, i);
        return (T) getNext(it, t);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, T t) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        return concat(m69221e(it, it2, it3, it4));
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it, @ParametricNullness T t) {
        return it.hasNext() ? (T) getOnlyElement(it) : t;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return m69222d((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        return new ConcatenatedIterator(it);
    }
}

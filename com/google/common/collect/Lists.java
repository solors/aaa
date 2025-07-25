package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Lists {

    /* renamed from: com.google.common.collect.Lists$1 */
    /* loaded from: classes4.dex */
    class C167941 extends RandomAccessListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i) {
            return this.f40297b.listIterator(i);
        }
    }

    /* renamed from: com.google.common.collect.Lists$2 */
    /* loaded from: classes4.dex */
    class C167952 extends AbstractListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i) {
            return this.f40297b.listIterator(i);
        }
    }

    /* loaded from: classes4.dex */
    private static class AbstractListWrapper<E> extends AbstractList<E> {

        /* renamed from: b */
        final List<E> f40297b;

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, @ParametricNullness E e) {
            this.f40297b.add(i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.f40297b.addAll(i, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f40297b.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
            return this.f40297b.get(i);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E remove(int i) {
            return this.f40297b.remove(i);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E set(int i, @ParametricNullness E e) {
            return this.f40297b.set(i, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40297b.size();
        }
    }

    /* loaded from: classes4.dex */
    private static final class CharSequenceAsList extends AbstractList<Character> {

        /* renamed from: b */
        private final CharSequence f40298b;

        CharSequenceAsList(CharSequence charSequence) {
            this.f40298b = charSequence;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40298b.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Character.valueOf(this.f40298b.charAt(i));
        }
    }

    /* loaded from: classes4.dex */
    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @ParametricNullness

        /* renamed from: b */
        final E f40299b;

        /* renamed from: c */
        final E[] f40300c;

        OnePlusArrayList(@ParametricNullness E e, E[] eArr) {
            this.f40299b = e;
            this.f40300c = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
            Preconditions.checkElementIndex(i, size());
            if (i == 0) {
                return this.f40299b;
            }
            return this.f40300c[i - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.f40300c.length, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class Partition<T> extends AbstractList<List<T>> {

        /* renamed from: b */
        final List<T> f40301b;

        /* renamed from: c */
        final int f40302c;

        Partition(List<T> list, int i) {
            this.f40301b = list;
            this.f40302c = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f40301b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.divide(this.f40301b.size(), this.f40302c, RoundingMode.CEILING);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i) {
            Preconditions.checkElementIndex(i, size());
            int i2 = this.f40302c;
            int i3 = i * i2;
            return this.f40301b.subList(i3, Math.min(i2 + i3, this.f40301b.size()));
        }
    }

    /* loaded from: classes4.dex */
    private static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    /* loaded from: classes4.dex */
    private static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        RandomAccessPartition(List<T> list, int i) {
            super(list, i);
        }
    }

    /* loaded from: classes4.dex */
    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    /* loaded from: classes4.dex */
    public static class ReverseList<T> extends AbstractList<T> {

        /* renamed from: b */
        private final List<T> f40303b;

        ReverseList(List<T> list) {
            this.f40303b = (List) Preconditions.checkNotNull(list);
        }

        /* renamed from: d */
        private int m69165d(int i) {
            int size = size();
            Preconditions.checkElementIndex(i, size);
            return (size - 1) - i;
        }

        /* renamed from: e */
        public int m69164e(int i) {
            int size = size();
            Preconditions.checkPositionIndex(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, @ParametricNullness T t) {
            this.f40303b.add(m69164e(i), t);
        }

        /* renamed from: c */
        List<T> m69166c() {
            return this.f40303b;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f40303b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i) {
            return this.f40303b.get(m69165d(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            final ListIterator<T> listIterator = this.f40303b.listIterator(m69164e(i));
            return new ListIterator<T>() { // from class: com.google.common.collect.Lists.ReverseList.1

                /* renamed from: b */
                boolean f40304b;

                {
                    ReverseList.this = this;
                }

                @Override // java.util.ListIterator
                public void add(@ParametricNullness T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.f40304b = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (hasNext()) {
                        this.f40304b = true;
                        return (T) listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return ReverseList.this.m69164e(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                @ParametricNullness
                public T previous() {
                    if (hasPrevious()) {
                        this.f40304b = true;
                        return (T) listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    CollectPreconditions.m69724e(this.f40304b);
                    listIterator.remove();
                    this.f40304b = false;
                }

                @Override // java.util.ListIterator
                public void set(@ParametricNullness T t) {
                    Preconditions.checkState(this.f40304b);
                    listIterator.set(t);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T remove(int i) {
            return this.f40303b.remove(m69165d(i));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T set(int i, @ParametricNullness T t) {
            return this.f40303b.set(m69165d(i), t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40303b.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return Lists.reverse(this.f40303b.subList(m69164e(i2), m69164e(i)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class StringAsImmutableList extends ImmutableList<Character> {

        /* renamed from: d */
        private final String f40307d;

        StringAsImmutableList(String str) {
            this.f40307d = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f40307d.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f40307d.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40307d.length();
        }

        @Override // java.util.List
        public Character get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Character.valueOf(this.f40307d.charAt(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return Lists.charactersOf(this.f40307d.substring(i, i2));
        }
    }

    /* loaded from: classes4.dex */
    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: b */
        final List<F> f40308b;

        /* renamed from: c */
        final Function<? super F, ? extends T> f40309c;

        TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
            this.f40308b = (List) Preconditions.checkNotNull(list);
            this.f40309c = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f40308b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i) {
            return this.f40309c.apply((F) this.f40308b.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f40308b.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this.f40308b.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                {
                    TransformingRandomAccessList.this = this;
                }

                @Override // com.google.common.collect.TransformedIterator
                /* renamed from: a */
                public T mo68681a(F f) {
                    return TransformingRandomAccessList.this.f40309c.apply(f);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.f40309c.apply((F) this.f40308b.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40308b.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: b */
        final List<F> f40311b;

        /* renamed from: c */
        final Function<? super F, ? extends T> f40312c;

        TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
            this.f40311b = (List) Preconditions.checkNotNull(list);
            this.f40312c = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f40311b.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this.f40311b.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                {
                    TransformingSequentialList.this = this;
                }

                @Override // com.google.common.collect.TransformedIterator
                @ParametricNullness
                /* renamed from: a */
                public T mo68681a(@ParametricNullness F f) {
                    return TransformingSequentialList.this.f40312c.apply(f);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40311b.size();
        }
    }

    /* loaded from: classes4.dex */
    private static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @ParametricNullness

        /* renamed from: b */
        final E f40314b;
        @ParametricNullness

        /* renamed from: c */
        final E f40315c;

        /* renamed from: d */
        final E[] f40316d;

        TwoPlusArrayList(@ParametricNullness E e, @ParametricNullness E e2, E[] eArr) {
            this.f40314b = e;
            this.f40315c = e2;
            this.f40316d = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i) {
            if (i != 0) {
                if (i != 1) {
                    Preconditions.checkElementIndex(i, size());
                    return this.f40316d[i - 2];
                }
                return this.f40315c;
            }
            return this.f40314b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.f40316d.length, 2);
        }
    }

    private Lists() {
    }

    /* renamed from: a */
    public static <T> List<T> m69174a(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static <E> List<E> asList(@ParametricNullness E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    @VisibleForTesting
    /* renamed from: b */
    static int m69173b(int i) {
        CollectPreconditions.m69727b(i, "arraySize");
        return Ints.saturatedCast(i + 5 + (i / 10));
    }

    /* renamed from: c */
    public static boolean m69172c(List<?> list, Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equal(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return Iterators.elementsEqual(list.iterator(), list2.iterator());
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return CartesianList.m69730c(list);
    }

    public static ImmutableList<Character> charactersOf(String str) {
        return new StringAsImmutableList((String) Preconditions.checkNotNull(str));
    }

    /* renamed from: d */
    public static int m69171d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m69170e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m69170e(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    public static int m69169f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m69168g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static int m69168g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i) {
        CollectPreconditions.m69727b(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i) {
        return new ArrayList<>(m69173b(i));
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i) {
        boolean z;
        Preconditions.checkNotNull(list);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (list instanceof RandomAccess) {
            return new RandomAccessPartition(list, i);
        }
        return new Partition(list, i);
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).reverse();
        }
        if (list instanceof ReverseList) {
            return ((ReverseList) list).m69166c();
        }
        if (list instanceof RandomAccess) {
            return new RandomAccessReverseList(list);
        }
        return new ReverseList(list);
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        if (list instanceof RandomAccess) {
            return new TransformingRandomAccessList(list, function);
        }
        return new TransformingSequentialList(list, function);
    }

    public static <E> List<E> asList(@ParametricNullness E e, @ParametricNullness E e2, E[] eArr) {
        return new TwoPlusArrayList(e, e2, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    @Beta
    public static List<Character> charactersOf(CharSequence charSequence) {
        return new CharSequenceAsList((CharSequence) Preconditions.checkNotNull(charSequence));
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m69173b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        Collection newArrayList;
        if (iterable instanceof Collection) {
            newArrayList = (Collection) iterable;
        } else {
            newArrayList = newArrayList(iterable);
        }
        return new CopyOnWriteArrayList<>(newArrayList);
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> newLinkedList = newLinkedList();
        Iterables.addAll(newLinkedList, iterable);
        return newLinkedList;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> newArrayList = newArrayList();
        Iterators.addAll(newArrayList, it);
        return newArrayList;
    }
}

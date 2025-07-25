package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final UnmodifiableListIterator<Object> f40037c = new Itr(RegularImmutableList.f40599g, 0);

    /* loaded from: classes4.dex */
    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            this(4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.ArrayBasedBuilder add(Object obj) {
            return add((Builder<E>) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(int i) {
            super(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableList<E> build() {
            this.f40029c = true;
            return ImmutableList.m69427g(this.f40027a, this.f40028b);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e) {
            super.add((Builder<E>) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class Itr<E> extends AbstractIndexedListIterator<E> {

        /* renamed from: d */
        private final ImmutableList<E> f40038d;

        Itr(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f40038d = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected E get(int i) {
            return this.f40038d.get(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* renamed from: d */
        private final transient ImmutableList<E> f40039d;

        ReverseImmutableList(ImmutableList<E> immutableList) {
            this.f40039d = immutableList;
        }

        /* renamed from: j */
        private int m69411j(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: k */
        private int m69410k(int i) {
            return size() - i;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f40039d.contains(obj);
        }

        @Override // java.util.List
        public E get(int i) {
            Preconditions.checkElementIndex(i, size());
            return this.f40039d.get(m69411j(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f40039d.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m69411j(lastIndexOf);
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f40039d.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f40039d.indexOf(obj);
            if (indexOf >= 0) {
                return m69411j(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.f40039d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40039d.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return this.f40039d.subList(m69410k(i2), m69410k(i)).reverse();
        }
    }

    /* loaded from: classes4.dex */
    static class SerializedForm implements Serializable {

        /* renamed from: b */
        final Object[] f40040b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SerializedForm(Object[] objArr) {
            this.f40040b = objArr;
        }

        Object readResolve() {
            return ImmutableList.copyOf(this.f40040b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class SubList extends ImmutableList<E> {

        /* renamed from: d */
        final transient int f40041d;

        /* renamed from: f */
        final transient int f40042f;

        SubList(int i, int i2) {
            this.f40041d = i;
            this.f40042f = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: c */
        public Object[] mo68819c() {
            return ImmutableList.this.mo68819c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: d */
        public int mo68818d() {
            return ImmutableList.this.mo68817e() + this.f40041d + this.f40042f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: e */
        public int mo68817e() {
            return ImmutableList.this.mo68817e() + this.f40041d;
        }

        @Override // java.util.List
        public E get(int i) {
            Preconditions.checkElementIndex(i, this.f40042f);
            return ImmutableList.this.get(i + this.f40041d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40042f;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.f40042f);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f40041d;
            return immutableList.subList(i + i3, i2 + i3);
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

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <E> ImmutableList<E> m69428f(Object[] objArr) {
        return m69427g(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static <E> ImmutableList<E> m69427g(Object[] objArr, int i) {
        if (i == 0) {
            return m69424of();
        }
        return new RegularImmutableList(objArr, i);
    }

    /* renamed from: h */
    private static <E> ImmutableList<E> m69426h(Object... objArr) {
        return m69428f(ObjectArrays.m68903b(objArr));
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69424of() {
        return (ImmutableList<E>) RegularImmutableList.f40599g;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) Iterables.m69227g(iterable, new Comparable[0]);
        ObjectArrays.m68903b(comparableArr);
        Arrays.sort(comparableArr);
        return m69428f(comparableArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: a */
    public int mo68773a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return Lists.m69172c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    /* renamed from: i */
    ImmutableList<E> m69425i(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m69171d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m69169f(this, obj);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new ReverseImmutableList(this);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69423of(E e) {
        return m69426h(e);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m69424of();
        }
        return m69425i(i, i2);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69422of(E e, E e2) {
        return m69426h(e, e2);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69421of(E e, E e2, E e3) {
        return m69426h(e, e2, e3);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return (UnmodifiableListIterator<E>) f40037c;
        }
        return new Itr(this, i);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> asList = ((ImmutableCollection) collection).asList();
            return asList.isPartialView() ? m69428f(asList.toArray()) : asList;
        }
        return m69426h(collection.toArray());
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69420of(E e, E e2, E e3, E e4) {
        return m69426h(e, e2, e3, e4);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] m69228f = Iterables.m69228f(iterable);
        ObjectArrays.m68903b(m69228f);
        Arrays.sort(m69228f, comparator);
        return m69428f(m69228f);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69419of(E e, E e2, E e3, E e4, E e5) {
        return m69426h(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69418of(E e, E e2, E e3, E e4, E e5, E e6) {
        return m69426h(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69417of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return m69426h(e, e2, e3, e4, e5, e6, e7);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m69424of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return m69423of((Object) next);
        }
        return new Builder().add((Builder) next).addAll((Iterator) it).build();
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69416of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return m69426h(e, e2, e3, e4, e5, e6, e7, e8);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69415of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return m69426h(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69414of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return m69426h(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m69413of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return m69426h(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <E> ImmutableList<E> m69412of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return m69426h(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m69424of();
        }
        return m69426h((Object[]) eArr.clone());
    }

    @Override // com.google.common.collect.ImmutableCollection
    @InlineMe(replacement = "this")
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }
}

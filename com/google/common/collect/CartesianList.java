package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.math.IntMath;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class CartesianList<E> extends AbstractList<List<E>> implements RandomAccess {

    /* renamed from: b */
    private final transient ImmutableList<List<E>> f39818b;

    /* renamed from: c */
    private final transient int[] f39819c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CartesianList(ImmutableList<List<E>> immutableList) {
        this.f39818b = immutableList;
        int[] iArr = new int[immutableList.size() + 1];
        iArr[immutableList.size()] = 1;
        try {
            for (int size = immutableList.size() - 1; size >= 0; size--) {
                iArr[size] = IntMath.checkedMultiply(iArr[size + 1], immutableList.get(size).size());
            }
            this.f39819c = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <E> List<List<E>> m69730c(List<? extends List<? extends E>> list) {
        ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
        for (List<? extends E> list2 : list) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list2);
            if (copyOf.isEmpty()) {
                return ImmutableList.m69424of();
            }
            builder.add((ImmutableList.Builder) copyOf);
        }
        return new CartesianList(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public int m69729d(int i, int i2) {
        return (i / this.f39819c[i2 + 1]) % this.f39818b.get(i2).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List<E> list = (List) obj;
        if (list.size() != this.f39818b.size()) {
            return false;
        }
        int i = 0;
        for (E e : list) {
            if (!this.f39818b.get(i).contains(e)) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f39818b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = this.f39818b.get(nextIndex).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i += indexOf * this.f39819c[nextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f39818b.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = this.f39818b.get(nextIndex).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i += lastIndexOf * this.f39819c[nextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39819c[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public ImmutableList<E> get(final int i) {
        Preconditions.checkElementIndex(i, size());
        return new ImmutableList<E>() { // from class: com.google.common.collect.CartesianList.1
            @Override // java.util.List
            public E get(int i2) {
                Preconditions.checkElementIndex(i2, size());
                return (E) ((List) CartesianList.this.f39818b.get(i2)).get(CartesianList.this.m69729d(i, i2));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return CartesianList.this.f39818b.size();
            }
        };
    }
}

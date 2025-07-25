package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.errorprone.annotations.DoNotCall;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class ImmutableSortedMultisetFauxverideShim<E> extends ImmutableMultiset<E> {
    @DoNotCall("Use naturalOrder.")
    @Deprecated
    public static <E> ImmutableSortedMultiset.Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> copyOf(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m69263of(E e) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m69262of(E e, E e2) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m69261of(E e, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m69260of(E e, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m69259of(E e, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedMultiset<E> m69258of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new UnsupportedOperationException();
    }
}

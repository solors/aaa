package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableSortedSet;
import com.google.errorprone.annotations.DoNotCall;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableSortedSetFauxverideShim<E> extends ImmutableSet<E> {
    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builderWithExpectedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> copyOf(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass a parameter of type Comparable")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m69246of(E e) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m69245of(E e, E e2) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m69244of(E e, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m69243of(E e, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m69242of(E e, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m69241of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new UnsupportedOperationException();
    }
}

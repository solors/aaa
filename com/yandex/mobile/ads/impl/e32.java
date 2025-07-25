package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.DoNotCall;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public abstract class e32<E> extends d32<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}

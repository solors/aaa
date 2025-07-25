package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class d32<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

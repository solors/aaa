package com.smaato.sdk.core.util;

import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public interface Iterator<E> {
    default void forEachRemaining(Consumer<? super E> consumer) {
        Objects.requireNonNull(consumer);
        while (hasNext()) {
            consumer.accept(next());
        }
    }

    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
}

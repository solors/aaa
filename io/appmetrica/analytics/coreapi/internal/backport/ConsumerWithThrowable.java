package io.appmetrica.analytics.coreapi.internal.backport;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface ConsumerWithThrowable<T> {
    void consume(@NonNull T t) throws Throwable;
}

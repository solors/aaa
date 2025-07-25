package io.appmetrica.analytics.coreapi.internal.backport;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface FunctionWithThrowable<T, R> {
    R apply(@NonNull T t) throws Throwable;
}

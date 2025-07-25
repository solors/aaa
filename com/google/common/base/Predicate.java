package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface Predicate<T> {
    @CanIgnoreReturnValue
    boolean apply(@ParametricNullness T t);

    boolean equals(Object obj);
}

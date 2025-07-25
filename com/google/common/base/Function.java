package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface Function<F, T> {
    @CanIgnoreReturnValue
    @ParametricNullness
    T apply(@ParametricNullness F f);

    boolean equals(Object obj);
}

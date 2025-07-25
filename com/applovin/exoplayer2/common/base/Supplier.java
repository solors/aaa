package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes2.dex */
public interface Supplier<T> {
    @CanIgnoreReturnValue
    T get();
}

package io.bidmachine.utils.lazy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes9.dex */
public class LazyCachedValue<T> implements LazyValue<T> {
    @NonNull
    private final LazyValue<T> lazyValue;
    @Nullable
    @VisibleForTesting
    volatile T value;

    public LazyCachedValue(@NonNull LazyValue<T> lazyValue) {
        this.lazyValue = lazyValue;
    }

    @Override // io.bidmachine.utils.lazy.LazyValue
    @NonNull
    public T get() {
        T t = this.value;
        if (t == null) {
            T t2 = this.lazyValue.get();
            this.value = t2;
            return t2;
        }
        return t;
    }
}

package com.smaato.sdk.core.util.collections;

import androidx.annotation.Nullable;
import java.util.LinkedHashSet;

/* loaded from: classes7.dex */
public class CacheSet<T> extends LinkedHashSet<T> {
    @Nullable
    public T poll() {
        int size = size() - 1;
        if (size < 0) {
            return null;
        }
        T t = (T) toArray()[size];
        remove(t);
        return t;
    }
}

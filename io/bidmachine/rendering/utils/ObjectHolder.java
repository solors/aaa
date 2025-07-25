package io.bidmachine.rendering.utils;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class ObjectHolder<T> {

    /* renamed from: a */
    private Object f97959a;

    public ObjectHolder() {
        this(null);
    }

    @Nullable
    public T get() {
        return (T) this.f97959a;
    }

    public void set(@Nullable T t) {
        this.f97959a = t;
    }

    public ObjectHolder(@Nullable T t) {
        this.f97959a = t;
    }
}

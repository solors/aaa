package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* loaded from: classes4.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: b */
    private static final InstanceFactory<Object> f31105b = new InstanceFactory<>(null);

    /* renamed from: a */
    private final T f31106a;

    private InstanceFactory(T t) {
        this.f31106a = t;
    }

    /* renamed from: a */
    private static <T> InstanceFactory<T> m76294a() {
        return (InstanceFactory<T>) f31105b;
    }

    public static <T> Factory<T> create(T t) {
        return new InstanceFactory(Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t) {
        if (t == null) {
            return m76294a();
        }
        return new InstanceFactory(t);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public T get() {
        return this.f31106a;
    }
}

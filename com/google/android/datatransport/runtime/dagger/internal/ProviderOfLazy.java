package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import md.Provider;

/* loaded from: classes4.dex */
public final class ProviderOfLazy<T> implements Provider<Lazy<T>> {

    /* renamed from: a */
    private final Provider<T> f31110a;

    private ProviderOfLazy(Provider<T> provider) {
        this.f31110a = provider;
    }

    public static <T> Provider<Lazy<T>> create(Provider<T> provider) {
        return new ProviderOfLazy((Provider) Preconditions.checkNotNull(provider));
    }

    @Override // md.Provider
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.f31110a);
    }
}

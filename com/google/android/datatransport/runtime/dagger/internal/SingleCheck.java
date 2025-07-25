package com.google.android.datatransport.runtime.dagger.internal;

import md.Provider;

/* loaded from: classes4.dex */
public final class SingleCheck<T> implements Provider<T> {

    /* renamed from: c */
    private static final Object f31117c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f31118a;

    /* renamed from: b */
    private volatile Object f31119b = f31117c;

    private SingleCheck(Provider<T> provider) {
        this.f31118a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        if (!(p instanceof SingleCheck) && !(p instanceof DoubleCheck)) {
            return new SingleCheck((Provider) Preconditions.checkNotNull(p));
        }
        return p;
    }

    @Override // md.Provider
    public T get() {
        T t = (T) this.f31119b;
        if (t == f31117c) {
            Provider<T> provider = this.f31118a;
            if (provider == null) {
                return (T) this.f31119b;
            }
            T t2 = provider.get();
            this.f31119b = t2;
            this.f31118a = null;
            return t2;
        }
        return t;
    }
}

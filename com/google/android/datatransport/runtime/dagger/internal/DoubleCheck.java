package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import md.Provider;

/* loaded from: classes4.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* renamed from: c */
    private static final Object f31102c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f31103a;

    /* renamed from: b */
    private volatile Object f31104b = f31102c;

    private DoubleCheck(Provider<T> provider) {
        this.f31103a = provider;
    }

    public static <P extends Provider<T>, T> Lazy<T> lazy(P p) {
        if (p instanceof Lazy) {
            return (Lazy) p;
        }
        return new DoubleCheck((Provider) Preconditions.checkNotNull(p));
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p) {
        Preconditions.checkNotNull(p);
        if (p instanceof DoubleCheck) {
            return p;
        }
        return new DoubleCheck(p);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        boolean z;
        if (obj != f31102c && !(obj instanceof MemoizedSentinel)) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // md.Provider
    public T get() {
        T t = (T) this.f31104b;
        Object obj = f31102c;
        if (t == obj) {
            synchronized (this) {
                t = this.f31104b;
                if (t == obj) {
                    t = this.f31103a.get();
                    this.f31104b = reentrantCheck(this.f31104b, t);
                    this.f31103a = null;
                }
            }
        }
        return t;
    }
}

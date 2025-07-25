package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes4.dex */
public class OptionalProvider<T> implements Provider<T>, Deferred<T> {

    /* renamed from: c */
    private static final Deferred.DeferredHandler<Object> f42125c = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.o
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            OptionalProvider.m67320b(provider);
        }
    };

    /* renamed from: d */
    private static final Provider<Object> f42126d = new Provider() { // from class: com.google.firebase.components.p
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return OptionalProvider.m67321a();
        }
    };
    @GuardedBy("this")

    /* renamed from: a */
    private Deferred.DeferredHandler<T> f42127a;

    /* renamed from: b */
    private volatile Provider<T> f42128b;

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.f42127a = deferredHandler;
        this.f42128b = provider;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m67321a() {
        return m67316f();
    }

    /* renamed from: b */
    public static /* synthetic */ void m67320b(Provider provider) {
        m67317e(provider);
    }

    /* renamed from: c */
    public static /* synthetic */ void m67319c(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        m67315g(deferredHandler, deferredHandler2, provider);
    }

    /* renamed from: d */
    public static <T> OptionalProvider<T> m67318d() {
        return new OptionalProvider<>(f42125c, f42126d);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m67316f() {
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ void m67315g(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    /* renamed from: h */
    public static <T> OptionalProvider<T> m67314h(Provider<T> provider) {
        return new OptionalProvider<>(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.f42128b.get();
    }

    /* renamed from: i */
    public void m67313i(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.f42128b == f42126d) {
            synchronized (this) {
                deferredHandler = this.f42127a;
                this.f42127a = null;
                this.f42128b = provider;
            }
            deferredHandler.handle(provider);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(@NonNull final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.f42128b;
        Provider<Object> provider4 = f42126d;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f42128b;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler<T> deferredHandler2 = this.f42127a;
                this.f42127a = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.q
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        OptionalProvider.m67319c(Deferred.DeferredHandler.this, deferredHandler, provider5);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m67317e(Provider provider) {
    }
}

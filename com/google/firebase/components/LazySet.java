package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class LazySet<T> implements Provider<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f42124b = null;

    /* renamed from: a */
    private volatile Set<Provider<T>> f42123a = Collections.newSetFromMap(new ConcurrentHashMap());

    LazySet(Collection<Provider<T>> collection) {
        this.f42123a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static LazySet<?> m67323b(Collection<Provider<?>> collection) {
        return new LazySet<>((Set) collection);
    }

    /* renamed from: c */
    private synchronized void m67322c() {
        for (Provider<T> provider : this.f42123a) {
            this.f42124b.add(provider.get());
        }
        this.f42123a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m67324a(Provider<T> provider) {
        if (this.f42124b == null) {
            this.f42123a.add(provider);
        } else {
            this.f42124b.add(provider.get());
        }
    }

    @Override // com.google.firebase.inject.Provider
    public Set<T> get() {
        if (this.f42124b == null) {
            synchronized (this) {
                if (this.f42124b == null) {
                    this.f42124b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m67322c();
                }
            }
        }
        return Collections.unmodifiableSet(this.f42124b);
    }
}

package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes4.dex */
public class Lazy<T> implements Provider<T> {

    /* renamed from: c */
    private static final Object f42120c = new Object();

    /* renamed from: a */
    private volatile Object f42121a = f42120c;

    /* renamed from: b */
    private volatile Provider<T> f42122b;

    public Lazy(Provider<T> provider) {
        this.f42122b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t = (T) this.f42121a;
        Object obj = f42120c;
        if (t == obj) {
            synchronized (this) {
                t = this.f42121a;
                if (t == obj) {
                    t = this.f42122b.get();
                    this.f42121a = t;
                    this.f42122b = null;
                }
            }
        }
        return t;
    }
}

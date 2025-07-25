package com.smaato.sdk.core.p569di;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.di.c */
/* loaded from: classes7.dex */
public final class SingletonFactory<T> implements ClassFactory<T> {

    /* renamed from: c */
    private static final Object f71477c = new Object();

    /* renamed from: a */
    private volatile ClassFactory<T> f71478a;

    /* renamed from: b */
    private volatile Object f71479b = f71477c;

    private SingletonFactory(ClassFactory<T> classFactory) {
        this.f71478a = (ClassFactory) Objects.requireNonNull(classFactory);
    }

    /* renamed from: a */
    public static <T> ClassFactory<T> m39637a(ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        if (classFactory instanceof SingletonFactory) {
            return classFactory;
        }
        return new SingletonFactory(classFactory);
    }

    @Override // com.smaato.sdk.core.p569di.ClassFactory
    @NonNull
    public T get(DiConstructor diConstructor) {
        T t = (T) this.f71479b;
        Object obj = f71477c;
        if (t == obj) {
            synchronized (this) {
                t = this.f71479b;
                if (t == obj) {
                    T t2 = this.f71478a.get(diConstructor);
                    Object obj2 = this.f71479b;
                    if (obj2 != obj && obj2 != t2) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t2 + ". This is likely due to a circular dependency.");
                    }
                    this.f71479b = t2;
                    this.f71478a = null;
                    t = t2;
                }
            }
        }
        return t;
    }
}

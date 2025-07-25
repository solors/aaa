package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Callables {
    private Callables() {
    }

    /* renamed from: a */
    public static /* synthetic */ Object m67687a(Supplier supplier, Callable callable) {
        return m67681g(supplier, callable);
    }

    @Beta
    @GwtIncompatible
    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable() { // from class: com.google.common.util.concurrent.f
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                return Callables.m67684d(ListeningExecutorService.this, callable);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m67686b(Supplier supplier, Runnable runnable) {
        m67680h(supplier, runnable);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m67685c(Object obj) {
        return m67682f(obj);
    }

    /* renamed from: d */
    public static /* synthetic */ ListenableFuture m67684d(ListeningExecutorService listeningExecutorService, Callable callable) {
        return listeningExecutorService.submit(callable);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m67681g(Supplier supplier, Callable callable) throws Exception {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m67677k = m67677k((String) supplier.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (m67677k) {
                m67677k(name, currentThread);
            }
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m67680h(Supplier supplier, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean m67677k = m67677k((String) supplier.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (m67677k) {
                m67677k(name, currentThread);
            }
        }
    }

    @GwtIncompatible
    /* renamed from: i */
    public static Runnable m67679i(final Runnable runnable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable() { // from class: com.google.common.util.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                Callables.m67686b(Supplier.this, runnable);
            }
        };
    }

    @GwtIncompatible
    /* renamed from: j */
    public static <T> Callable<T> m67678j(final Callable<T> callable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable() { // from class: com.google.common.util.concurrent.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.m67687a(Supplier.this, callable);
            }
        };
    }

    @GwtIncompatible
    /* renamed from: k */
    private static boolean m67677k(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static <T> Callable<T> returning(@ParametricNullness final T t) {
        return new Callable() { // from class: com.google.common.util.concurrent.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Callables.m67685c(t);
            }
        };
    }

    /* renamed from: f */
    public static /* synthetic */ Object m67682f(Object obj) throws Exception {
        return obj;
    }
}

package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.google.errorprone.annotations.CheckReturnValue;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public abstract class CacheLoader<K, V> {

    /* loaded from: classes4.dex */
    private static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {

        /* renamed from: b */
        private final Function<K, V> f39548b;

        public FunctionToCacheLoader(Function<K, V> function) {
            this.f39548b = (Function) Preconditions.checkNotNull(function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return (V) this.f39548b.apply(Preconditions.checkNotNull(k));
        }
    }

    /* loaded from: classes4.dex */
    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
    private static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {

        /* renamed from: b */
        private final Supplier<V> f39549b;

        public SupplierToCacheLoader(Supplier<V> supplier) {
            this.f39549b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            Preconditions.checkNotNull(obj);
            return this.f39549b.get();
        }
    }

    /* loaded from: classes4.dex */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    @CheckReturnValue
    @GwtIncompatible
    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, final Executor executor) {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(executor);
        return new CacheLoader<K, V>() { // from class: com.google.common.cache.CacheLoader.1
            @Override // com.google.common.cache.CacheLoader
            public V load(K k) throws Exception {
                return (V) CacheLoader.this.load(k);
            }

            @Override // com.google.common.cache.CacheLoader
            public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
                return CacheLoader.this.loadAll(iterable);
            }

            @Override // com.google.common.cache.CacheLoader
            public ListenableFuture<V> reload(final K k, final V v) throws Exception {
                ListenableFutureTask create = ListenableFutureTask.create(new Callable<V>() { // from class: com.google.common.cache.CacheLoader.1.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public V call() throws Exception {
                        return CacheLoader.this.reload(k, v).get();
                    }
                });
                executor.execute(create);
                return create;
            }
        };
    }

    @CheckReturnValue
    public static <K, V> CacheLoader<K, V> from(Function<K, V> function) {
        return new FunctionToCacheLoader(function);
    }

    public abstract V load(K k) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    @GwtIncompatible
    public ListenableFuture<V> reload(K k, V v) throws Exception {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        return Futures.immediateFuture(load(k));
    }

    @CheckReturnValue
    public static <V> CacheLoader<Object, V> from(Supplier<V> supplier) {
        return new SupplierToCacheLoader(supplier);
    }
}

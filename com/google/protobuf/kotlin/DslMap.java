package com.google.protobuf.kotlin;

import ae.KMarkers;
import com.google.protobuf.kotlin.DslProxy;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DslMap.kt */
@Metadata
/* loaded from: classes5.dex */
public final class DslMap<K, V, P extends DslProxy> implements Map<K, V>, KMarkers {
    @NotNull
    private final Map<K, V> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    @OnlyForUseByGeneratedProtoCode
    public DslMap(@NotNull Map<K, ? extends V> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.delegate.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return Intrinsics.m17075f(this.delegate, obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return this.delegate.get(obj);
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new UnmodifiableMapEntries(this.delegate.entrySet());
    }

    @NotNull
    public Set<K> getKeys() {
        return new UnmodifiableSet(this.delegate.keySet());
    }

    public int getSize() {
        return this.delegate.size();
    }

    @NotNull
    public Collection<V> getValues() {
        return new UnmodifiableCollections(this.delegate.values());
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        return this.delegate.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

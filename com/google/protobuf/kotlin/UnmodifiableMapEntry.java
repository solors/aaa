package com.google.protobuf.kotlin;

import ae.KMarkers;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnmodifiableCollections.kt */
@Metadata
/* loaded from: classes5.dex */
public final class UnmodifiableMapEntry<K, V> implements Map.Entry<K, V>, KMarkers {
    private final /* synthetic */ Map.Entry<K, V> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntry(@NotNull Map.Entry<? extends K, ? extends V> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

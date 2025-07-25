package com.google.protobuf.kotlin;

import ae.KMarkers;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: UnmodifiableCollections.kt */
@Metadata
/* loaded from: classes5.dex */
public final class UnmodifiableMapEntries$iterator$1<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, KMarkers {
    private final /* synthetic */ Iterator<Map.Entry<K, V>> $$delegate_0;
    final /* synthetic */ Iterator<Map.Entry<K, V>> $itr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries$iterator$1(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.$itr = it;
        this.$$delegate_0 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        return new UnmodifiableMapEntry(this.$itr.next());
    }
}

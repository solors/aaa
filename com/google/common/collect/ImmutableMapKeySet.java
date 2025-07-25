package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {

    /* renamed from: d */
    private final ImmutableMap<K, V> f40068d;

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static class KeySetSerializedForm<K> implements Serializable {

        /* renamed from: b */
        final ImmutableMap<K, ?> f40069b;

        KeySetSerializedForm(ImmutableMap<K, ?> immutableMap) {
            this.f40069b = immutableMap;
        }

        Object readResolve() {
            return this.f40069b.keySet();
        }
    }

    public ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.f40068d = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f40068d.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    K get(int i) {
        return this.f40068d.entrySet().asList().get(i).getKey();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f40068d.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    Object writeReplace() {
        return new KeySetSerializedForm(this.f40068d);
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<K> iterator() {
        return this.f40068d.mo69398j();
    }
}

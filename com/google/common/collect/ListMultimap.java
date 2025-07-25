package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public interface ListMultimap<K, V> extends Multimap<K, V> {
    @Override // 
    Map<K, Collection<V>> asMap();

    @Override // 
    boolean equals(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    /* bridge */ /* synthetic */ default Collection get(@ParametricNullness Object obj) {
        return get((ListMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    List<V> get(@ParametricNullness K k);

    @Override // 
    @CanIgnoreReturnValue
    List<V> removeAll(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ default Collection replaceValues(@ParametricNullness Object obj, Iterable iterable) {
        return replaceValues((ListMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    List<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable);
}

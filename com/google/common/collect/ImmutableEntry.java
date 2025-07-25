package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {
    @ParametricNullness

    /* renamed from: b */
    final K f40030b;
    @ParametricNullness

    /* renamed from: c */
    final V f40031c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmutableEntry(@ParametricNullness K k, @ParametricNullness V v) {
        this.f40030b = k;
        this.f40031c = v;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.f40030b;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        return this.f40031c;
    }

    @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v) {
        throw new UnsupportedOperationException();
    }
}

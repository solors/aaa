package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingMapEntry<K, V> extends ForwardingObject implements Map.Entry<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: c */
    public abstract Map.Entry<K, V> delegate();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public K getKey() {
        return delegate().getKey();
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public V getValue() {
        return delegate().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return delegate().hashCode();
    }

    @ParametricNullness
    public V setValue(@ParametricNullness V v) {
        return delegate().setValue(v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean standardEquals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!Objects.equal(getKey(), entry.getKey()) || !Objects.equal(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }
}

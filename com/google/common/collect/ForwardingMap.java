package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {

    @Beta
    /* loaded from: classes4.dex */
    protected abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        public StandardEntrySet() {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        /* renamed from: c */
        Map<K, V> mo68588c() {
            return ForwardingMap.this;
        }
    }

    @Beta
    /* loaded from: classes4.dex */
    protected class StandardKeySet extends Maps.KeySet<K, V> {
        public StandardKeySet(ForwardingMap forwardingMap) {
            super(forwardingMap);
        }
    }

    @Beta
    /* loaded from: classes4.dex */
    protected class StandardValues extends Maps.Values<K, V> {
        public StandardValues(ForwardingMap forwardingMap) {
            super(forwardingMap);
        }
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this && !delegate().equals(obj)) {
            return false;
        }
        return true;
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    protected void standardClear() {
        Iterators.m69223c(entrySet().iterator());
    }

    @Beta
    protected boolean standardContainsKey(Object obj) {
        return Maps.m69034m(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean standardContainsValue(Object obj) {
        return Maps.m69033n(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean standardEquals(Object obj) {
        return Maps.m69031p(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int standardHashCode() {
        return Sets.m68786b(entrySet());
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.m69065A(this, map);
    }

    @Beta
    protected V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (Objects.equal(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String standardToString() {
        return Maps.m69057I(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}

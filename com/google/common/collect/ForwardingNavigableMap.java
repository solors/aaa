package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: Access modifiers changed from: protected */
    @Beta
    /* loaded from: classes4.dex */
    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        public StandardDescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        /* renamed from: d */
        protected Iterator<Map.Entry<K, V>> mo69014d() {
            return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1

                /* renamed from: b */
                private Map.Entry<K, V> f39976b = null;

                /* renamed from: c */
                private Map.Entry<K, V> f39977c;

                {
                    this.f39977c = StandardDescendingMap.this.mo69013f().lastEntry();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f39977c != null) {
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.f39976b != null) {
                        StandardDescendingMap.this.mo69013f().remove(this.f39976b.getKey());
                        this.f39976b = null;
                        return;
                    }
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    Map.Entry<K, V> entry = this.f39977c;
                    if (entry != null) {
                        this.f39976b = entry;
                        this.f39977c = StandardDescendingMap.this.mo69013f().lowerEntry(this.f39977c.getKey());
                        return entry;
                    }
                    throw new NoSuchElementException();
                }
            };
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        /* renamed from: f */
        NavigableMap<K, V> mo69013f() {
            return ForwardingNavigableMap.this;
        }
    }

    @Beta
    /* loaded from: classes4.dex */
    protected class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet(ForwardingNavigableMap forwardingNavigableMap) {
            super(forwardingNavigableMap);
        }
    }

    protected ForwardingNavigableMap() {
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
        return delegate().ceilingEntry(k);
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(@ParametricNullness K k) {
        return delegate().ceilingKey(k);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: f */
    public abstract NavigableMap<K, V> delegate();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
        return delegate().floorEntry(k);
    }

    @Override // java.util.NavigableMap
    public K floorKey(@ParametricNullness K k) {
        return delegate().floorKey(k);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
        return delegate().headMap(k, z);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
        return delegate().higherEntry(k);
    }

    @Override // java.util.NavigableMap
    public K higherKey(@ParametricNullness K k) {
        return delegate().higherKey(k);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
        return delegate().lowerEntry(k);
    }

    @Override // java.util.NavigableMap
    public K lowerKey(@ParametricNullness K k) {
        return delegate().lowerKey(k);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        return delegate().subMap(k, z, k2, z2);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
        return delegate().tailMap(k, z);
    }
}

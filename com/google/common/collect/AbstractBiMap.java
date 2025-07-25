package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

    /* renamed from: b */
    private transient Map<K, V> f39705b;
    @RetainedWith

    /* renamed from: c */
    transient AbstractBiMap<V, K> f39706c;

    /* renamed from: d */
    private transient Set<K> f39707d;

    /* renamed from: f */
    private transient Set<V> f39708f;

    /* renamed from: g */
    private transient Set<Map.Entry<K, V>> f39709g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class BiMapEntry extends ForwardingMapEntry<K, V> {

        /* renamed from: b */
        private final Map.Entry<K, V> f39713b;

        BiMapEntry(Map.Entry<K, V> entry) {
            this.f39713b = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public Map.Entry<K, V> delegate() {
            return this.f39713b;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            AbstractBiMap.this.mo69554h(v);
            Preconditions.checkState(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (Objects.equal(v, getValue())) {
                return v;
            }
            Preconditions.checkArgument(!AbstractBiMap.this.containsValue(v), "value already present: %s", v);
            V value = this.f39713b.setValue(v);
            Preconditions.checkState(Objects.equal(v, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.m69808q(getKey(), true, value, v);
            return value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class EntrySet extends ForwardingSet<Map.Entry<K, V>> {

        /* renamed from: b */
        final Set<Map.Entry<K, V>> f39715b;

        private EntrySet() {
            this.f39715b = AbstractBiMap.this.f39705b.entrySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Maps.m69035l(delegate(), obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m69519f(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractBiMap.this.m69815i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Set<Map.Entry<K, V>> delegate() {
            return this.f39715b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (this.f39715b.contains(obj) && (obj instanceof Map.Entry)) {
                Map.Entry entry = (Map.Entry) obj;
                ((AbstractBiMap) AbstractBiMap.this.f39706c).f39705b.remove(entry.getValue());
                this.f39715b.remove(entry);
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return m69508l(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return m69518g(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m69517h();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m69516i(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            m69809p((AbstractBiMap) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        @Override // com.google.common.collect.AbstractBiMap
        @ParametricNullness
        /* renamed from: g */
        K mo69549g(@ParametricNullness K k) {
            return this.f39706c.mo69554h(k);
        }

        @Override // com.google.common.collect.AbstractBiMap
        @ParametricNullness
        /* renamed from: h */
        V mo69554h(@ParametricNullness V v) {
            return this.f39706c.mo69549g(v);
        }

        @GwtIncompatible
        Object readResolve() {
            return inverse().inverse();
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class KeySet extends ForwardingSet<K> {
        private KeySet() {
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.m69024w(AbstractBiMap.this.entrySet().iterator());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Set<K> delegate() {
            return AbstractBiMap.this.f39705b.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                AbstractBiMap.this.m69812m(obj);
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return m69508l(collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return m69518g(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class ValueSet extends ForwardingSet<V> {

        /* renamed from: b */
        final Set<V> f39718b;

        private ValueSet() {
            this.f39718b = AbstractBiMap.this.f39706c.keySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return Maps.m69049Q(AbstractBiMap.this.entrySet().iterator());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Set<V> delegate() {
            return this.f39718b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m69517h();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m69516i(tArr);
        }
    }

    /* renamed from: l */
    private V m69813l(@ParametricNullness K k, @ParametricNullness V v, boolean z) {
        mo69549g(k);
        mo69554h(v);
        boolean containsKey = containsKey(k);
        if (containsKey && Objects.equal(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            Preconditions.checkArgument(!containsValue(v), "value already present: %s", v);
        }
        V put = this.f39705b.put(k, v);
        m69808q(k, containsKey, put, v);
        return put;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ParametricNullness
    @CanIgnoreReturnValue
    /* renamed from: m */
    public V m69812m(Object obj) {
        V v = (V) NullnessCasts.m68906a(this.f39705b.remove(obj));
        m69811n(v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m69811n(@ParametricNullness V v) {
        this.f39706c.f39705b.remove(v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public void m69808q(@ParametricNullness K k, boolean z, V v, @ParametricNullness V v2) {
        if (z) {
            m69811n(NullnessCasts.m68906a(v));
        }
        this.f39706c.f39705b.put(v2, k);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public void clear() {
        this.f39705b.clear();
        this.f39706c.f39705b.clear();
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public boolean containsValue(Object obj) {
        return this.f39706c.containsKey(obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f39709g;
        if (set == null) {
            EntrySet entrySet = new EntrySet();
            this.f39709g = entrySet;
            return entrySet;
        }
        return set;
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@ParametricNullness K k, @ParametricNullness V v) {
        return m69813l(k, v, true);
    }

    /* renamed from: i */
    Iterator<Map.Entry<K, V>> m69815i() {
        final Iterator<Map.Entry<K, V>> it = this.f39705b.entrySet().iterator();
        return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.AbstractBiMap.1

            /* renamed from: b */
            Map.Entry<K, V> f39710b;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                Map.Entry<K, V> entry = this.f39710b;
                if (entry != null) {
                    V value = entry.getValue();
                    it.remove();
                    AbstractBiMap.this.m69811n(value);
                    this.f39710b = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = (Map.Entry) it.next();
                this.f39710b = entry;
                return new BiMapEntry(entry);
            }
        };
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        return this.f39706c;
    }

    /* renamed from: j */
    AbstractBiMap<V, K> m69814j(Map<V, K> map) {
        return new Inverse(map, this);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f39707d;
        if (set == null) {
            KeySet keySet = new KeySet();
            this.f39707d = keySet;
            return keySet;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m69810o(Map<K, V> map, Map<V, K> map2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f39705b == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (this.f39706c == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2);
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkArgument(map2.isEmpty());
        if (map == map2) {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        this.f39705b = map;
        this.f39706c = m69814j(map2);
    }

    /* renamed from: p */
    void m69809p(AbstractBiMap<V, K> abstractBiMap) {
        this.f39706c = abstractBiMap;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return m69813l(k, v, false);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (containsKey(obj)) {
            return m69812m(obj);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBiMap(Map<K, V> map, Map<V, K> map2) {
        m69810o(map, map2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public Map<K, V> delegate() {
        return this.f39705b;
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.f39708f;
        if (set == null) {
            ValueSet valueSet = new ValueSet();
            this.f39708f = valueSet;
            return valueSet;
        }
        return set;
    }

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        this.f39705b = map;
        this.f39706c = abstractBiMap;
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    /* renamed from: g */
    K mo69549g(@ParametricNullness K k) {
        return k;
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    /* renamed from: h */
    V mo69554h(@ParametricNullness V v) {
        return v;
    }
}

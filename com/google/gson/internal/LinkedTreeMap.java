package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j */
    private static final Comparator<Comparable> f43980j = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: b */
    Comparator<? super K> f43981b;

    /* renamed from: c */
    Node<K, V> f43982c;

    /* renamed from: d */
    int f43983d;

    /* renamed from: f */
    int f43984f;

    /* renamed from: g */
    final Node<K, V> f43985g;

    /* renamed from: h */
    private LinkedTreeMap<K, V>.EntrySet f43986h;

    /* renamed from: i */
    private LinkedTreeMap<K, V>.KeySet f43987i;

    /* loaded from: classes5.dex */
    class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && LinkedTreeMap.this.m66201c((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedTreeMap.EntrySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    return m66193a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node<K, V> m66201c;
            if (!(obj instanceof Map.Entry) || (m66201c = LinkedTreeMap.this.m66201c((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.m66198g(m66201c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f43983d;
        }
    }

    /* loaded from: classes5.dex */
    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.google.gson.internal.LinkedTreeMap.KeySet.1
                {
                    LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return m66193a().f44001h;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LinkedTreeMap.this.m66197h(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f43983d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: b */
        Node<K, V> f43992b;

        /* renamed from: c */
        Node<K, V> f43993c = null;

        /* renamed from: d */
        int f43994d;

        LinkedTreeMapIterator() {
            this.f43992b = LinkedTreeMap.this.f43985g.f43999f;
            this.f43994d = LinkedTreeMap.this.f43984f;
        }

        /* renamed from: a */
        final Node<K, V> m66193a() {
            Node<K, V> node = this.f43992b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (node != linkedTreeMap.f43985g) {
                if (linkedTreeMap.f43984f == this.f43994d) {
                    this.f43992b = node.f43999f;
                    this.f43993c = node;
                    return node;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f43992b != LinkedTreeMap.this.f43985g) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> node = this.f43993c;
            if (node != null) {
                LinkedTreeMap.this.m66198g(node, true);
                this.f43993c = null;
                this.f43994d = LinkedTreeMap.this.f43984f;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedTreeMap() {
        this(f43980j);
    }

    /* renamed from: a */
    private boolean m66203a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m66199f(Node<K, V> node, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (node != null) {
            Node<K, V> node2 = node.f43997c;
            Node<K, V> node3 = node.f43998d;
            int i5 = 0;
            if (node2 != null) {
                i = node2.f44003j;
            } else {
                i = 0;
            }
            if (node3 != null) {
                i2 = node3.f44003j;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                Node<K, V> node4 = node3.f43997c;
                Node<K, V> node5 = node3.f43998d;
                if (node5 != null) {
                    i4 = node5.f44003j;
                } else {
                    i4 = 0;
                }
                if (node4 != null) {
                    i5 = node4.f44003j;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m66194l(node3);
                    m66195j(node);
                } else {
                    m66195j(node);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                Node<K, V> node6 = node2.f43997c;
                Node<K, V> node7 = node2.f43998d;
                if (node7 != null) {
                    i3 = node7.f44003j;
                } else {
                    i3 = 0;
                }
                if (node6 != null) {
                    i5 = node6.f44003j;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m66195j(node2);
                    m66194l(node);
                } else {
                    m66194l(node);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                node.f44003j = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.f44003j = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.f43996b;
        }
    }

    /* renamed from: i */
    private void m66196i(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.f43996b;
        node.f43996b = null;
        if (node2 != null) {
            node2.f43996b = node3;
        }
        if (node3 != null) {
            if (node3.f43997c == node) {
                node3.f43997c = node2;
                return;
            } else {
                node3.f43998d = node2;
                return;
            }
        }
        this.f43982c = node2;
    }

    /* renamed from: j */
    private void m66195j(Node<K, V> node) {
        int i;
        int i2;
        Node<K, V> node2 = node.f43997c;
        Node<K, V> node3 = node.f43998d;
        Node<K, V> node4 = node3.f43997c;
        Node<K, V> node5 = node3.f43998d;
        node.f43998d = node4;
        if (node4 != null) {
            node4.f43996b = node;
        }
        m66196i(node, node3);
        node3.f43997c = node;
        node.f43996b = node3;
        int i3 = 0;
        if (node2 != null) {
            i = node2.f44003j;
        } else {
            i = 0;
        }
        if (node4 != null) {
            i2 = node4.f44003j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        node.f44003j = max;
        if (node5 != null) {
            i3 = node5.f44003j;
        }
        node3.f44003j = Math.max(max, i3) + 1;
    }

    /* renamed from: l */
    private void m66194l(Node<K, V> node) {
        int i;
        int i2;
        Node<K, V> node2 = node.f43997c;
        Node<K, V> node3 = node.f43998d;
        Node<K, V> node4 = node2.f43997c;
        Node<K, V> node5 = node2.f43998d;
        node.f43997c = node5;
        if (node5 != null) {
            node5.f43996b = node;
        }
        m66196i(node, node2);
        node2.f43998d = node;
        node.f43996b = node2;
        int i3 = 0;
        if (node3 != null) {
            i = node3.f44003j;
        } else {
            i = 0;
        }
        if (node5 != null) {
            i2 = node5.f44003j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        node.f44003j = max;
        if (node4 != null) {
            i3 = node4.f44003j;
        }
        node2.f44003j = Math.max(max, i3) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: b */
    Node<K, V> m66202b(K k, boolean z) {
        int i;
        Node<K, V> node;
        Comparable comparable;
        Node<K, V> node2;
        Comparator<? super K> comparator = this.f43981b;
        Node<K, V> node3 = this.f43982c;
        if (node3 != null) {
            if (comparator == f43980j) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(node3.f44001h);
                } else {
                    i = comparator.compare(k, (K) node3.f44001h);
                }
                if (i == 0) {
                    return node3;
                }
                if (i < 0) {
                    node2 = node3.f43997c;
                } else {
                    node2 = node3.f43998d;
                }
                if (node2 == null) {
                    break;
                }
                node3 = node2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        Node<K, V> node4 = this.f43985g;
        if (node3 == null) {
            if (comparator == f43980j && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            node = new Node<>(node3, k, node4, node4.f44000g);
            this.f43982c = node;
        } else {
            node = new Node<>(node3, k, node4, node4.f44000g);
            if (i < 0) {
                node3.f43997c = node;
            } else {
                node3.f43998d = node;
            }
            m66199f(node3, true);
        }
        this.f43983d++;
        this.f43984f++;
        return node;
    }

    /* renamed from: c */
    Node<K, V> m66201c(Map.Entry<?, ?> entry) {
        boolean z;
        Node<K, V> m66200d = m66200d(entry.getKey());
        if (m66200d != null && m66203a(m66200d.f44002i, entry.getValue())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return m66200d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f43982c = null;
        this.f43983d = 0;
        this.f43984f++;
        Node<K, V> node = this.f43985g;
        node.f44000g = node;
        node.f43999f = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (m66200d(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    Node<K, V> m66200d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m66202b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.EntrySet entrySet = this.f43986h;
        if (entrySet == null) {
            LinkedTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
            this.f43986h = entrySet2;
            return entrySet2;
        }
        return entrySet;
    }

    /* renamed from: g */
    void m66198g(Node<K, V> node, boolean z) {
        Node<K, V> first;
        int i;
        if (z) {
            Node<K, V> node2 = node.f44000g;
            node2.f43999f = node.f43999f;
            node.f43999f.f44000g = node2;
        }
        Node<K, V> node3 = node.f43997c;
        Node<K, V> node4 = node.f43998d;
        Node<K, V> node5 = node.f43996b;
        int i2 = 0;
        if (node3 != null && node4 != null) {
            if (node3.f44003j > node4.f44003j) {
                first = node3.last();
            } else {
                first = node4.first();
            }
            m66198g(first, false);
            Node<K, V> node6 = node.f43997c;
            if (node6 != null) {
                i = node6.f44003j;
                first.f43997c = node6;
                node6.f43996b = first;
                node.f43997c = null;
            } else {
                i = 0;
            }
            Node<K, V> node7 = node.f43998d;
            if (node7 != null) {
                i2 = node7.f44003j;
                first.f43998d = node7;
                node7.f43996b = first;
                node.f43998d = null;
            }
            first.f44003j = Math.max(i, i2) + 1;
            m66196i(node, first);
            return;
        }
        if (node3 != null) {
            m66196i(node, node3);
            node.f43997c = null;
        } else if (node4 != null) {
            m66196i(node, node4);
            node.f43998d = null;
        } else {
            m66196i(node, null);
        }
        m66199f(node5, false);
        this.f43983d--;
        this.f43984f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> m66200d = m66200d(obj);
        if (m66200d != null) {
            return m66200d.f44002i;
        }
        return null;
    }

    /* renamed from: h */
    Node<K, V> m66197h(Object obj) {
        Node<K, V> m66200d = m66200d(obj);
        if (m66200d != null) {
            m66198g(m66200d, true);
        }
        return m66200d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.KeySet keySet = this.f43987i;
        if (keySet == null) {
            LinkedTreeMap<K, V>.KeySet keySet2 = new KeySet();
            this.f43987i = keySet2;
            return keySet2;
        }
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            Node<K, V> m66202b = m66202b(k, true);
            V v2 = m66202b.f44002i;
            m66202b.f44002i = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> m66197h = m66197h(obj);
        if (m66197h != null) {
            return m66197h.f44002i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f43983d;
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.f43983d = 0;
        this.f43984f = 0;
        this.f43985g = new Node<>();
        this.f43981b = comparator == null ? f43980j : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        Node<K, V> f43996b;

        /* renamed from: c */
        Node<K, V> f43997c;

        /* renamed from: d */
        Node<K, V> f43998d;

        /* renamed from: f */
        Node<K, V> f43999f;

        /* renamed from: g */
        Node<K, V> f44000g;

        /* renamed from: h */
        final K f44001h;

        /* renamed from: i */
        V f44002i;

        /* renamed from: j */
        int f44003j;

        Node() {
            this.f44001h = null;
            this.f44000g = this;
            this.f43999f = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f44001h;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f44002i;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Node<K, V> first() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f43997c; node2 != null; node2 = node2.f43997c) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f44001h;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f44002i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.f44001h;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.f44002i;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f43998d; node2 != null; node2 = node2.f43998d) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f44002i;
            this.f44002i = v;
            return v2;
        }

        public String toString() {
            return this.f44001h + "=" + this.f44002i;
        }

        Node(Node<K, V> node, K k, Node<K, V> node2, Node<K, V> node3) {
            this.f43996b = node;
            this.f44001h = k;
            this.f44003j = 1;
            this.f43999f = node2;
            this.f44000g = node3;
            node3.f43999f = this;
            node2.f44000g = this;
        }
    }
}

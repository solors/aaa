package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: k */
    private static final Comparator<Comparable> f43949k = new Comparator<Comparable>() { // from class: com.google.gson.internal.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: b */
    Comparator<? super K> f43950b;

    /* renamed from: c */
    Node<K, V>[] f43951c;

    /* renamed from: d */
    final Node<K, V> f43952d;

    /* renamed from: f */
    int f43953f;

    /* renamed from: g */
    int f43954g;

    /* renamed from: h */
    int f43955h;

    /* renamed from: i */
    private LinkedHashTreeMap<K, V>.EntrySet f43956i;

    /* renamed from: j */
    private LinkedHashTreeMap<K, V>.KeySet f43957j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class AvlBuilder<K, V> {

        /* renamed from: a */
        private Node<K, V> f43958a;

        /* renamed from: b */
        private int f43959b;

        /* renamed from: c */
        private int f43960c;

        /* renamed from: d */
        private int f43961d;

        AvlBuilder() {
        }

        /* renamed from: a */
        void m66208a(Node<K, V> node) {
            node.f43973d = null;
            node.f43971b = null;
            node.f43972c = null;
            node.f43979k = 1;
            int i = this.f43959b;
            if (i > 0) {
                int i2 = this.f43961d;
                if ((i2 & 1) == 0) {
                    this.f43961d = i2 + 1;
                    this.f43959b = i - 1;
                    this.f43960c++;
                }
            }
            node.f43971b = this.f43958a;
            this.f43958a = node;
            int i3 = this.f43961d + 1;
            this.f43961d = i3;
            int i4 = this.f43959b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f43961d = i3 + 1;
                this.f43959b = i4 - 1;
                this.f43960c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f43961d & i6) == i6) {
                    int i7 = this.f43960c;
                    if (i7 == 0) {
                        Node<K, V> node2 = this.f43958a;
                        Node<K, V> node3 = node2.f43971b;
                        Node<K, V> node4 = node3.f43971b;
                        node3.f43971b = node4.f43971b;
                        this.f43958a = node3;
                        node3.f43972c = node4;
                        node3.f43973d = node2;
                        node3.f43979k = node2.f43979k + 1;
                        node4.f43971b = node3;
                        node2.f43971b = node3;
                    } else if (i7 == 1) {
                        Node<K, V> node5 = this.f43958a;
                        Node<K, V> node6 = node5.f43971b;
                        this.f43958a = node6;
                        node6.f43973d = node5;
                        node6.f43979k = node5.f43979k + 1;
                        node5.f43971b = node6;
                        this.f43960c = 0;
                    } else if (i7 == 2) {
                        this.f43960c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        void m66207b(int i) {
            this.f43959b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f43961d = 0;
            this.f43960c = 0;
            this.f43958a = null;
        }

        /* renamed from: c */
        Node<K, V> m66206c() {
            Node<K, V> node = this.f43958a;
            if (node.f43971b == null) {
                return node;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class AvlIterator<K, V> {

        /* renamed from: a */
        private Node<K, V> f43962a;

        AvlIterator() {
        }

        /* renamed from: a */
        void m66205a(Node<K, V> node) {
            Node<K, V> node2 = null;
            while (node != null) {
                node.f43971b = node2;
                node2 = node;
                node = node.f43972c;
            }
            this.f43962a = node2;
        }

        public Node<K, V> next() {
            Node<K, V> node = this.f43962a;
            if (node == null) {
                return null;
            }
            Node<K, V> node2 = node.f43971b;
            node.f43971b = null;
            Node<K, V> node3 = node.f43973d;
            while (true) {
                Node<K, V> node4 = node2;
                node2 = node3;
                if (node2 != null) {
                    node2.f43971b = node4;
                    node3 = node2.f43972c;
                } else {
                    this.f43962a = node4;
                    return node;
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && LinkedHashTreeMap.this.m66217f((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>>() { // from class: com.google.gson.internal.LinkedHashTreeMap.EntrySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    return m66204a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Node<K, V> m66217f;
            if (!(obj instanceof Map.Entry) || (m66217f = LinkedHashTreeMap.this.m66217f((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedHashTreeMap.this.m66214i(m66217f, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f43953f;
        }
    }

    /* loaded from: classes5.dex */
    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.google.gson.internal.LinkedHashTreeMap.KeySet.1
                {
                    LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return m66204a().f43976h;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LinkedHashTreeMap.this.m66213j(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.f43953f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {

        /* renamed from: b */
        Node<K, V> f43967b;

        /* renamed from: c */
        Node<K, V> f43968c = null;

        /* renamed from: d */
        int f43969d;

        LinkedTreeMapIterator() {
            this.f43967b = LinkedHashTreeMap.this.f43952d.f43974f;
            this.f43969d = LinkedHashTreeMap.this.f43954g;
        }

        /* renamed from: a */
        final Node<K, V> m66204a() {
            Node<K, V> node = this.f43967b;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (node != linkedHashTreeMap.f43952d) {
                if (linkedHashTreeMap.f43954g == this.f43969d) {
                    this.f43967b = node.f43974f;
                    this.f43968c = node;
                    return node;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f43967b != LinkedHashTreeMap.this.f43952d) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node<K, V> node = this.f43968c;
            if (node != null) {
                LinkedHashTreeMap.this.m66214i(node, true);
                this.f43968c = null;
                this.f43969d = LinkedHashTreeMap.this.f43954g;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public LinkedHashTreeMap() {
        this(f43949k);
    }

    /* renamed from: a */
    private void m66221a() {
        Node<K, V>[] m66220b = m66220b(this.f43951c);
        this.f43951c = m66220b;
        this.f43955h = (m66220b.length / 2) + (m66220b.length / 4);
    }

    /* renamed from: b */
    static <K, V> Node<K, V>[] m66220b(Node<K, V>[] nodeArr) {
        Node<K, V> node;
        int length = nodeArr.length;
        Node<K, V>[] nodeArr2 = new Node[length * 2];
        AvlIterator avlIterator = new AvlIterator();
        AvlBuilder avlBuilder = new AvlBuilder();
        AvlBuilder avlBuilder2 = new AvlBuilder();
        for (int i = 0; i < length; i++) {
            Node<K, V> node2 = nodeArr[i];
            if (node2 != null) {
                avlIterator.m66205a(node2);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    Node<K, V> next = avlIterator.next();
                    if (next == null) {
                        break;
                    } else if ((next.f43977i & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                avlBuilder.m66207b(i2);
                avlBuilder2.m66207b(i3);
                avlIterator.m66205a(node2);
                while (true) {
                    Node<K, V> next2 = avlIterator.next();
                    if (next2 == null) {
                        break;
                    } else if ((next2.f43977i & length) == 0) {
                        avlBuilder.m66208a(next2);
                    } else {
                        avlBuilder2.m66208a(next2);
                    }
                }
                Node<K, V> node3 = null;
                if (i2 > 0) {
                    node = avlBuilder.m66206c();
                } else {
                    node = null;
                }
                nodeArr2[i] = node;
                int i4 = i + length;
                if (i3 > 0) {
                    node3 = avlBuilder2.m66206c();
                }
                nodeArr2[i4] = node3;
            }
        }
        return nodeArr2;
    }

    /* renamed from: c */
    private boolean m66219c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m66215h(Node<K, V> node, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (node != null) {
            Node<K, V> node2 = node.f43972c;
            Node<K, V> node3 = node.f43973d;
            int i5 = 0;
            if (node2 != null) {
                i = node2.f43979k;
            } else {
                i = 0;
            }
            if (node3 != null) {
                i2 = node3.f43979k;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                Node<K, V> node4 = node3.f43972c;
                Node<K, V> node5 = node3.f43973d;
                if (node5 != null) {
                    i4 = node5.f43979k;
                } else {
                    i4 = 0;
                }
                if (node4 != null) {
                    i5 = node4.f43979k;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m66210n(node3);
                    m66211m(node);
                } else {
                    m66211m(node);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                Node<K, V> node6 = node2.f43972c;
                Node<K, V> node7 = node2.f43973d;
                if (node7 != null) {
                    i3 = node7.f43979k;
                } else {
                    i3 = 0;
                }
                if (node6 != null) {
                    i5 = node6.f43979k;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m66211m(node2);
                    m66210n(node);
                } else {
                    m66210n(node);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                node.f43979k = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.f43979k = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.f43971b;
        }
    }

    /* renamed from: l */
    private void m66212l(Node<K, V> node, Node<K, V> node2) {
        Node<K, V> node3 = node.f43971b;
        node.f43971b = null;
        if (node2 != null) {
            node2.f43971b = node3;
        }
        if (node3 != null) {
            if (node3.f43972c == node) {
                node3.f43972c = node2;
                return;
            } else {
                node3.f43973d = node2;
                return;
            }
        }
        int i = node.f43977i;
        Node<K, V>[] nodeArr = this.f43951c;
        nodeArr[i & (nodeArr.length - 1)] = node2;
    }

    /* renamed from: m */
    private void m66211m(Node<K, V> node) {
        int i;
        int i2;
        Node<K, V> node2 = node.f43972c;
        Node<K, V> node3 = node.f43973d;
        Node<K, V> node4 = node3.f43972c;
        Node<K, V> node5 = node3.f43973d;
        node.f43973d = node4;
        if (node4 != null) {
            node4.f43971b = node;
        }
        m66212l(node, node3);
        node3.f43972c = node;
        node.f43971b = node3;
        int i3 = 0;
        if (node2 != null) {
            i = node2.f43979k;
        } else {
            i = 0;
        }
        if (node4 != null) {
            i2 = node4.f43979k;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        node.f43979k = max;
        if (node5 != null) {
            i3 = node5.f43979k;
        }
        node3.f43979k = Math.max(max, i3) + 1;
    }

    /* renamed from: n */
    private void m66210n(Node<K, V> node) {
        int i;
        int i2;
        Node<K, V> node2 = node.f43972c;
        Node<K, V> node3 = node.f43973d;
        Node<K, V> node4 = node2.f43972c;
        Node<K, V> node5 = node2.f43973d;
        node.f43972c = node5;
        if (node5 != null) {
            node5.f43971b = node;
        }
        m66212l(node, node2);
        node2.f43973d = node;
        node.f43971b = node2;
        int i3 = 0;
        if (node3 != null) {
            i = node3.f43979k;
        } else {
            i = 0;
        }
        if (node5 != null) {
            i2 = node5.f43979k;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        node.f43979k = max;
        if (node4 != null) {
            i3 = node4.f43979k;
        }
        node2.f43979k = Math.max(max, i3) + 1;
    }

    /* renamed from: o */
    private static int m66209o(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f43951c, (Object) null);
        this.f43953f = 0;
        this.f43954g++;
        Node<K, V> node = this.f43952d;
        Node<K, V> node2 = node.f43974f;
        while (node2 != node) {
            Node<K, V> node3 = node2.f43974f;
            node2.f43975g = null;
            node2.f43974f = null;
            node2 = node3;
        }
        node.f43975g = node;
        node.f43974f = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (m66216g(obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    Node<K, V> m66218d(K k, boolean z) {
        int i;
        Node<K, V> node;
        Comparable comparable;
        Node<K, V> node2;
        Comparator<? super K> comparator = this.f43950b;
        Node<K, V>[] nodeArr = this.f43951c;
        int m66209o = m66209o(k.hashCode());
        int length = (nodeArr.length - 1) & m66209o;
        Node<K, V> node3 = nodeArr[length];
        if (node3 != null) {
            if (comparator == f43949k) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(node3.f43976h);
                } else {
                    i = comparator.compare(k, (K) node3.f43976h);
                }
                if (i == 0) {
                    return node3;
                }
                if (i < 0) {
                    node2 = node3.f43972c;
                } else {
                    node2 = node3.f43973d;
                }
                if (node2 == null) {
                    break;
                }
                node3 = node2;
            }
        } else {
            i = 0;
        }
        Node<K, V> node4 = node3;
        int i2 = i;
        if (!z) {
            return null;
        }
        Node<K, V> node5 = this.f43952d;
        if (node4 == null) {
            if (comparator == f43949k && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            node = new Node<>(node4, k, m66209o, node5, node5.f43975g);
            nodeArr[length] = node;
        } else {
            node = new Node<>(node4, k, m66209o, node5, node5.f43975g);
            if (i2 < 0) {
                node4.f43972c = node;
            } else {
                node4.f43973d = node;
            }
            m66215h(node4, true);
        }
        int i3 = this.f43953f;
        this.f43953f = i3 + 1;
        if (i3 > this.f43955h) {
            m66221a();
        }
        this.f43954g++;
        return node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.EntrySet entrySet = this.f43956i;
        if (entrySet == null) {
            LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
            this.f43956i = entrySet2;
            return entrySet2;
        }
        return entrySet;
    }

    /* renamed from: f */
    Node<K, V> m66217f(Map.Entry<?, ?> entry) {
        boolean z;
        Node<K, V> m66216g = m66216g(entry.getKey());
        if (m66216g != null && m66219c(m66216g.f43978j, entry.getValue())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return m66216g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    Node<K, V> m66216g(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m66218d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> m66216g = m66216g(obj);
        if (m66216g != null) {
            return m66216g.f43978j;
        }
        return null;
    }

    /* renamed from: i */
    void m66214i(Node<K, V> node, boolean z) {
        Node<K, V> first;
        int i;
        if (z) {
            Node<K, V> node2 = node.f43975g;
            node2.f43974f = node.f43974f;
            node.f43974f.f43975g = node2;
            node.f43975g = null;
            node.f43974f = null;
        }
        Node<K, V> node3 = node.f43972c;
        Node<K, V> node4 = node.f43973d;
        Node<K, V> node5 = node.f43971b;
        int i2 = 0;
        if (node3 != null && node4 != null) {
            if (node3.f43979k > node4.f43979k) {
                first = node3.last();
            } else {
                first = node4.first();
            }
            m66214i(first, false);
            Node<K, V> node6 = node.f43972c;
            if (node6 != null) {
                i = node6.f43979k;
                first.f43972c = node6;
                node6.f43971b = first;
                node.f43972c = null;
            } else {
                i = 0;
            }
            Node<K, V> node7 = node.f43973d;
            if (node7 != null) {
                i2 = node7.f43979k;
                first.f43973d = node7;
                node7.f43971b = first;
                node.f43973d = null;
            }
            first.f43979k = Math.max(i, i2) + 1;
            m66212l(node, first);
            return;
        }
        if (node3 != null) {
            m66212l(node, node3);
            node.f43972c = null;
        } else if (node4 != null) {
            m66212l(node, node4);
            node.f43973d = null;
        } else {
            m66212l(node, null);
        }
        m66215h(node5, false);
        this.f43953f--;
        this.f43954g++;
    }

    /* renamed from: j */
    Node<K, V> m66213j(Object obj) {
        Node<K, V> m66216g = m66216g(obj);
        if (m66216g != null) {
            m66214i(m66216g, true);
        }
        return m66216g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.KeySet keySet = this.f43957j;
        if (keySet == null) {
            LinkedHashTreeMap<K, V>.KeySet keySet2 = new KeySet();
            this.f43957j = keySet2;
            return keySet2;
        }
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            Node<K, V> m66218d = m66218d(k, true);
            V v2 = m66218d.f43978j;
            m66218d.f43978j = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> m66213j = m66213j(obj);
        if (m66213j != null) {
            return m66213j.f43978j;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f43953f;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.f43953f = 0;
        this.f43954g = 0;
        this.f43950b = comparator == null ? f43949k : comparator;
        this.f43952d = new Node<>();
        Node<K, V>[] nodeArr = new Node[16];
        this.f43951c = nodeArr;
        this.f43955h = (nodeArr.length / 2) + (nodeArr.length / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class Node<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        Node<K, V> f43971b;

        /* renamed from: c */
        Node<K, V> f43972c;

        /* renamed from: d */
        Node<K, V> f43973d;

        /* renamed from: f */
        Node<K, V> f43974f;

        /* renamed from: g */
        Node<K, V> f43975g;

        /* renamed from: h */
        final K f43976h;

        /* renamed from: i */
        final int f43977i;

        /* renamed from: j */
        V f43978j;

        /* renamed from: k */
        int f43979k;

        Node() {
            this.f43976h = null;
            this.f43977i = -1;
            this.f43975g = this;
            this.f43974f = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f43976h;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f43978j;
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
            for (Node<K, V> node2 = this.f43972c; node2 != null; node2 = node2.f43972c) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f43976h;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f43978j;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.f43976h;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.f43978j;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public Node<K, V> last() {
            Node<K, V> node = this;
            for (Node<K, V> node2 = this.f43973d; node2 != null; node2 = node2.f43973d) {
                node = node2;
            }
            return node;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f43978j;
            this.f43978j = v;
            return v2;
        }

        public String toString() {
            return this.f43976h + "=" + this.f43978j;
        }

        Node(Node<K, V> node, K k, int i, Node<K, V> node2, Node<K, V> node3) {
            this.f43971b = node;
            this.f43976h = k;
            this.f43977i = i;
            this.f43979k = 1;
            this.f43974f = node2;
            this.f43975g = node3;
            node3.f43974f = this;
            node2.f43975g = this;
        }
    }
}

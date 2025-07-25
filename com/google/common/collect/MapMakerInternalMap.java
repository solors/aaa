package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtIncompatible
/* loaded from: classes4.dex */
public class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: l */
    static final WeakValueReference<Object, Object, DummyInternalEntry> f40324l = new WeakValueReference<Object, Object, DummyInternalEntry>() { // from class: com.google.common.collect.MapMakerInternalMap.1
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<Object, Object, DummyInternalEntry> copyFor(ReferenceQueue<Object> referenceQueue, DummyInternalEntry dummyInternalEntry) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public Object get() {
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public DummyInternalEntry getEntry() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }
    };

    /* renamed from: b */
    final transient int f40325b;

    /* renamed from: c */
    final transient int f40326c;

    /* renamed from: d */
    final transient Segment<K, V, E, S>[] f40327d;

    /* renamed from: f */
    final int f40328f;

    /* renamed from: g */
    final Equivalence<Object> f40329g;

    /* renamed from: h */
    final transient InternalEntryHelper<K, V, E, S> f40330h;

    /* renamed from: i */
    transient Set<K> f40331i;

    /* renamed from: j */
    transient Collection<V> f40332j;

    /* renamed from: k */
    transient Set<Map.Entry<K, V>> f40333k;

    /* loaded from: classes4.dex */
    static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {

        /* renamed from: b */
        final Strength f40334b;

        /* renamed from: c */
        final Strength f40335c;

        /* renamed from: d */
        final Equivalence<Object> f40336d;

        /* renamed from: f */
        final Equivalence<Object> f40337f;

        /* renamed from: g */
        final int f40338g;

        /* renamed from: h */
        transient ConcurrentMap<K, V> f40339h;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.f40334b = strength;
            this.f40335c = strength2;
            this.f40336d = equivalence;
            this.f40337f = equivalence2;
            this.f40338g = i;
            this.f40339h = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public ConcurrentMap<K, V> delegate() {
            return this.f40339h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        void m69138d(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.f40339h.put(readObject, objectInputStream.readObject());
            }
        }

        /* renamed from: f */
        MapMaker m69137f(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().initialCapacity(objectInputStream.readInt()).m69157g(this.f40334b).m69156h(this.f40335c).m69158f(this.f40336d).concurrencyLevel(this.f40338g);
        }

        /* renamed from: g */
        void m69136g(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f40339h.size());
            for (Map.Entry<K, V> entry : this.f40339h.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {

        /* renamed from: b */
        final K f40340b;

        /* renamed from: c */
        final int f40341c;

        /* renamed from: d */
        final E f40342d;

        AbstractStrongKeyEntry(K k, int i, E e) {
            this.f40340b = k;
            this.f40341c = i;
            this.f40342d = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
            return this.f40341c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
            return this.f40340b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return this.f40342d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {

        /* renamed from: b */
        final int f40343b;

        /* renamed from: c */
        final E f40344c;

        AbstractWeakKeyEntry(ReferenceQueue<K> referenceQueue, K k, int i, E e) {
            super(k, referenceQueue);
            this.f40343b = i;
            this.f40344c = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
            return this.f40343b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public K getKey() {
            return get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public E getNext() {
            return this.f40344c;
        }
    }

    /* loaded from: classes4.dex */
    static final class CleanupMapTask implements Runnable {

        /* renamed from: b */
        final WeakReference<MapMakerInternalMap<?, ?, ?, ?>> f40345b;

        public CleanupMapTask(MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap) {
            this.f40345b = new WeakReference<>(mapMakerInternalMap);
        }

        @Override // java.lang.Runnable
        public void run() {
            MapMakerInternalMap<?, ?, ?, ?> mapMakerInternalMap = this.f40345b.get();
            if (mapMakerInternalMap != null) {
                for (Segment<?, ?, ?, ?> segment : mapMakerInternalMap.f40327d) {
                    segment.m69129B();
                }
                return;
            }
            throw new CancellationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class DummyInternalEntry implements InternalEntry<Object, Object, DummyInternalEntry> {
        private DummyInternalEntry() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
            throw new AssertionError();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public DummyInternalEntry getNext() {
            throw new AssertionError();
        }
    }

    /* loaded from: classes4.dex */
    final class EntryIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        EntryIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
            return m69133c();
        }
    }

    /* loaded from: classes4.dex */
    final class EntrySet extends SafeToArraySet<Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = MapMakerInternalMap.this.get(key)) == null || !MapMakerInternalMap.this.m69140q().equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !MapMakerInternalMap.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: b */
        int f40347b;

        /* renamed from: c */
        int f40348c = -1;

        /* renamed from: d */
        Segment<K, V, E, S> f40349d;

        /* renamed from: f */
        AtomicReferenceArray<E> f40350f;

        /* renamed from: g */
        E f40351g;

        /* renamed from: h */
        MapMakerInternalMap<K, V, E, S>.WriteThroughEntry f40352h;

        /* renamed from: i */
        MapMakerInternalMap<K, V, E, S>.WriteThroughEntry f40353i;

        HashIterator() {
            this.f40347b = MapMakerInternalMap.this.f40327d.length - 1;
            m69135a();
        }

        /* renamed from: a */
        final void m69135a() {
            this.f40352h = null;
            if (m69132d() || m69131e()) {
                return;
            }
            while (true) {
                int i = this.f40347b;
                if (i >= 0) {
                    Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.f40327d;
                    this.f40347b = i - 1;
                    Segment<K, V, E, S> segment = segmentArr[i];
                    this.f40349d = segment;
                    if (segment.f40357c != 0) {
                        AtomicReferenceArray<E> atomicReferenceArray = this.f40349d.f40360g;
                        this.f40350f = atomicReferenceArray;
                        this.f40348c = atomicReferenceArray.length() - 1;
                        if (m69131e()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        boolean m69134b(E e) {
            try {
                Object key = e.getKey();
                Object m69149g = MapMakerInternalMap.this.m69149g(e);
                if (m69149g != null) {
                    this.f40352h = new WriteThroughEntry(key, m69149g);
                    this.f40349d.m69110r();
                    return true;
                }
                this.f40349d.m69110r();
                return false;
            } catch (Throwable th) {
                this.f40349d.m69110r();
                throw th;
            }
        }

        /* renamed from: c */
        MapMakerInternalMap<K, V, E, S>.WriteThroughEntry m69133c() {
            MapMakerInternalMap<K, V, E, S>.WriteThroughEntry writeThroughEntry = this.f40352h;
            if (writeThroughEntry != null) {
                this.f40353i = writeThroughEntry;
                m69135a();
                return this.f40353i;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        boolean m69132d() {
            E e = this.f40351g;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f40351g = (E) e.getNext();
                E e2 = this.f40351g;
                if (e2 != null) {
                    if (m69134b(e2)) {
                        return true;
                    }
                    e = this.f40351g;
                } else {
                    return false;
                }
            }
        }

        /* renamed from: e */
        boolean m69131e() {
            while (true) {
                int i = this.f40348c;
                if (i >= 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f40350f;
                    this.f40348c = i - 1;
                    E e = atomicReferenceArray.get(i);
                    this.f40351g = e;
                    if (e != null && (m69134b(e) || m69132d())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f40352h != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f40353i != null) {
                z = true;
            } else {
                z = false;
            }
            CollectPreconditions.m69724e(z);
            MapMakerInternalMap.this.remove(this.f40353i.getKey());
            this.f40353i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        E copy(S s, E e, E e2);

        Strength keyStrength();

        E newEntry(S s, K k, int i, E e);

        S newSegment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2);

        void setValue(S s, E e, V v);

        Strength valueStrength();
    }

    /* loaded from: classes4.dex */
    final class KeyIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        KeyIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
            return m69133c().getKey();
        }
    }

    /* loaded from: classes4.dex */
    final class KeySet extends SafeToArraySet<K> {
        KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (MapMakerInternalMap.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* loaded from: classes4.dex */
    private static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        private SafeToArraySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return MapMakerInternalMap.m69142o(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.m69142o(this).toArray(tArr);
        }
    }

    /* loaded from: classes4.dex */
    private static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f40339h = m69137f(objectInputStream).makeMap();
            m69138d(objectInputStream);
        }

        private Object readResolve() {
            return this.f40339h;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            m69136g(objectOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            /* renamed from: c */
            Equivalence<Object> mo69100c() {
                return Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            /* renamed from: c */
            Equivalence<Object> mo69100c() {
                return Equivalence.identity();
            }
        };

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Equivalence<Object> mo69100c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class StrongKeyDummyValueEntry<K> extends AbstractStrongKeyEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>> {

        /* loaded from: classes4.dex */
        static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {

            /* renamed from: a */
            private static final Helper<?> f40364a = new Helper<>();

            Helper() {
            }

            /* renamed from: a */
            static <K> Helper<K> m69098a() {
                return (Helper<K>) f40364a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                return copy((StrongKeyDummyValueSegment) ((StrongKeyDummyValueSegment) segment), (StrongKeyDummyValueEntry) ((StrongKeyDummyValueEntry) internalEntry), (StrongKeyDummyValueEntry) ((StrongKeyDummyValueEntry) internalEntry2));
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((StrongKeyDummyValueSegment<StrongKeyDummyValueSegment<K>>) segment, (StrongKeyDummyValueSegment<K>) obj, i, (StrongKeyDummyValueEntry<StrongKeyDummyValueSegment<K>>) internalEntry);
            }

            public void setValue(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            public StrongKeyDummyValueEntry<K> copy(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry2) {
                return strongKeyDummyValueEntry.m69099a(strongKeyDummyValueEntry2);
            }

            public StrongKeyDummyValueEntry<K> newEntry(StrongKeyDummyValueSegment<K> strongKeyDummyValueSegment, K k, int i, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
                return new StrongKeyDummyValueEntry<>(k, i, strongKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
                setValue((StrongKeyDummyValueSegment) ((StrongKeyDummyValueSegment) segment), (StrongKeyDummyValueEntry) ((StrongKeyDummyValueEntry) internalEntry), dummy);
            }
        }

        StrongKeyDummyValueEntry(K k, int i, StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
            super(k, i, strongKeyDummyValueEntry);
        }

        /* renamed from: a */
        StrongKeyDummyValueEntry<K> m69099a(StrongKeyDummyValueEntry<K> strongKeyDummyValueEntry) {
            return new StrongKeyDummyValueEntry<>(this.f40340b, this.f40341c, strongKeyDummyValueEntry);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class StrongKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> {
        StrongKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, StrongKeyDummyValueEntry<K>, StrongKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public StrongKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
            return (StrongKeyDummyValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: G */
        public StrongKeyDummyValueSegment<K> mo69071D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class StrongKeyStrongValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, StrongKeyStrongValueEntry<K, V>> {

        /* renamed from: f */
        private volatile V f40365f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f40366a = new Helper<>();

            Helper() {
            }

            /* renamed from: a */
            static <K, V> Helper<K, V> m69094a() {
                return (Helper<K, V>) f40366a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                return copy((StrongKeyStrongValueSegment) ((StrongKeyStrongValueSegment) segment), (StrongKeyStrongValueEntry) ((StrongKeyStrongValueEntry) internalEntry), (StrongKeyStrongValueEntry) ((StrongKeyStrongValueEntry) internalEntry2));
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((StrongKeyStrongValueSegment<StrongKeyStrongValueSegment<K, V>, V>) segment, (StrongKeyStrongValueSegment<K, V>) obj, i, (StrongKeyStrongValueEntry<StrongKeyStrongValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((StrongKeyStrongValueSegment<K, StrongKeyStrongValueEntry<K, V>>) segment, (StrongKeyStrongValueEntry<K, StrongKeyStrongValueEntry<K, V>>) internalEntry, (StrongKeyStrongValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            public StrongKeyStrongValueEntry<K, V> copy(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2) {
                return strongKeyStrongValueEntry.m69096a(strongKeyStrongValueEntry2);
            }

            public StrongKeyStrongValueEntry<K, V> newEntry(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
                return new StrongKeyStrongValueEntry<>(k, i, strongKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            public void setValue(StrongKeyStrongValueSegment<K, V> strongKeyStrongValueSegment, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry, V v) {
                strongKeyStrongValueEntry.m69095b(v);
            }
        }

        StrongKeyStrongValueEntry(K k, int i, StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            super(k, i, strongKeyStrongValueEntry);
            this.f40365f = null;
        }

        /* renamed from: a */
        StrongKeyStrongValueEntry<K, V> m69096a(StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry) {
            StrongKeyStrongValueEntry<K, V> strongKeyStrongValueEntry2 = new StrongKeyStrongValueEntry<>(this.f40340b, this.f40341c, strongKeyStrongValueEntry);
            strongKeyStrongValueEntry2.f40365f = this.f40365f;
            return strongKeyStrongValueEntry2;
        }

        /* renamed from: b */
        void m69095b(V v) {
            this.f40365f = v;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
            return this.f40365f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> {
        StrongKeyStrongValueSegment(MapMakerInternalMap<K, V, StrongKeyStrongValueEntry<K, V>, StrongKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
        }

        public StrongKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (StrongKeyStrongValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: G */
        public StrongKeyStrongValueSegment<K, V> mo69071D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class StrongKeyWeakValueEntry<K, V> extends AbstractStrongKeyEntry<K, V, StrongKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, StrongKeyWeakValueEntry<K, V>> {

        /* renamed from: f */
        private volatile WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> f40367f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f40368a = new Helper<>();

            Helper() {
            }

            /* renamed from: a */
            static <K, V> Helper<K, V> m69088a() {
                return (Helper<K, V>) f40368a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                return copy((StrongKeyWeakValueSegment) ((StrongKeyWeakValueSegment) segment), (StrongKeyWeakValueEntry) ((StrongKeyWeakValueEntry) internalEntry), (StrongKeyWeakValueEntry) ((StrongKeyWeakValueEntry) internalEntry2));
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((StrongKeyWeakValueSegment<StrongKeyWeakValueSegment<K, V>, V>) segment, (StrongKeyWeakValueSegment<K, V>) obj, i, (StrongKeyWeakValueEntry<StrongKeyWeakValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((StrongKeyWeakValueSegment<K, StrongKeyWeakValueEntry<K, V>>) segment, (StrongKeyWeakValueEntry<K, StrongKeyWeakValueEntry<K, V>>) internalEntry, (StrongKeyWeakValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            public StrongKeyWeakValueEntry<K, V> copy(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2) {
                if (Segment.m69112n(strongKeyWeakValueEntry)) {
                    return null;
                }
                return strongKeyWeakValueEntry.m69090c(((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).f40369j, strongKeyWeakValueEntry2);
            }

            public StrongKeyWeakValueEntry<K, V> newEntry(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
                return new StrongKeyWeakValueEntry<>(k, i, strongKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public StrongKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new StrongKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            public void setValue(StrongKeyWeakValueSegment<K, V> strongKeyWeakValueSegment, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry, V v) {
                strongKeyWeakValueEntry.m69089d(v, ((StrongKeyWeakValueSegment) strongKeyWeakValueSegment).f40369j);
            }
        }

        StrongKeyWeakValueEntry(K k, int i, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            super(k, i, strongKeyWeakValueEntry);
            this.f40367f = MapMakerInternalMap.m69141p();
        }

        /* renamed from: c */
        StrongKeyWeakValueEntry<K, V> m69090c(ReferenceQueue<V> referenceQueue, StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry) {
            StrongKeyWeakValueEntry<K, V> strongKeyWeakValueEntry2 = new StrongKeyWeakValueEntry<>(this.f40340b, this.f40341c, strongKeyWeakValueEntry);
            strongKeyWeakValueEntry2.f40367f = this.f40367f.copyFor(referenceQueue, strongKeyWeakValueEntry2);
            return strongKeyWeakValueEntry2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
            this.f40367f.clear();
        }

        /* renamed from: d */
        void m69089d(V v, ReferenceQueue<V> referenceQueue) {
            WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> weakValueReference = this.f40367f;
            this.f40367f = new WeakValueReferenceImpl(referenceQueue, v, this);
            weakValueReference.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
            return this.f40367f.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getValueReference() {
            return this.f40367f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> {

        /* renamed from: j */
        private final ReferenceQueue<V> f40369j;

        StrongKeyWeakValueSegment(MapMakerInternalMap<K, V, StrongKeyWeakValueEntry<K, V>, StrongKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.f40369j = new ReferenceQueue<>();
        }

        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((InternalEntry) internalEntry).getValueReference();
        }

        public WeakValueReference<K, V, StrongKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            return new WeakValueReferenceImpl(this.f40369j, v, castForTesting((InternalEntry) internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: o */
        void mo69067o() {
            m69124b((ReferenceQueue<V>) this.f40369j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: p */
        void mo69066p() {
            m69120f(this.f40369j);
        }

        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            StrongKeyWeakValueEntry<K, V> castForTesting = castForTesting((InternalEntry) internalEntry);
            WeakValueReference weakValueReference2 = ((StrongKeyWeakValueEntry) castForTesting).f40367f;
            ((StrongKeyWeakValueEntry) castForTesting).f40367f = weakValueReference;
            weakValueReference2.clear();
        }

        public StrongKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (StrongKeyWeakValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: H */
        public StrongKeyWeakValueSegment<K, V> mo69071D() {
            return this;
        }
    }

    /* loaded from: classes4.dex */
    interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    /* loaded from: classes4.dex */
    final class ValueIterator extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        ValueIterator(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
            return m69133c().getValue();
        }
    }

    /* loaded from: classes4.dex */
    final class Values extends AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return MapMakerInternalMap.m69142o(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.m69142o(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WeakKeyDummyValueEntry<K> extends AbstractWeakKeyEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> implements StrongValueEntry<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>> {

        /* loaded from: classes4.dex */
        static final class Helper<K> implements InternalEntryHelper<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {

            /* renamed from: a */
            private static final Helper<?> f40371a = new Helper<>();

            Helper() {
            }

            /* renamed from: a */
            static <K> Helper<K> m69084a() {
                return (Helper<K>) f40371a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                return copy((WeakKeyDummyValueSegment) ((WeakKeyDummyValueSegment) segment), (WeakKeyDummyValueEntry) ((WeakKeyDummyValueEntry) internalEntry), (WeakKeyDummyValueEntry) ((WeakKeyDummyValueEntry) internalEntry2));
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((WeakKeyDummyValueSegment<WeakKeyDummyValueSegment<K>>) segment, (WeakKeyDummyValueSegment<K>) obj, i, (WeakKeyDummyValueEntry<WeakKeyDummyValueSegment<K>>) internalEntry);
            }

            public void setValue(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, MapMaker.Dummy dummy) {
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            public WeakKeyDummyValueEntry<K> copy(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry2) {
                if (weakKeyDummyValueEntry.getKey() == null) {
                    return null;
                }
                return weakKeyDummyValueEntry.m69085a(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).f40372j, weakKeyDummyValueEntry2);
            }

            public WeakKeyDummyValueEntry<K> newEntry(WeakKeyDummyValueSegment<K> weakKeyDummyValueSegment, K k, int i, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
                return new WeakKeyDummyValueEntry<>(((WeakKeyDummyValueSegment) weakKeyDummyValueSegment).f40372j, k, i, weakKeyDummyValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyDummyValueSegment<K> newSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyDummyValueSegment<>(mapMakerInternalMap, i, i2);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, MapMaker.Dummy dummy) {
                setValue((WeakKeyDummyValueSegment) ((WeakKeyDummyValueSegment) segment), (WeakKeyDummyValueEntry) ((WeakKeyDummyValueEntry) internalEntry), dummy);
            }
        }

        WeakKeyDummyValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
            super(referenceQueue, k, i, weakKeyDummyValueEntry);
        }

        /* renamed from: a */
        WeakKeyDummyValueEntry<K> m69085a(ReferenceQueue<K> referenceQueue, WeakKeyDummyValueEntry<K> weakKeyDummyValueEntry) {
            return new WeakKeyDummyValueEntry<>(referenceQueue, getKey(), this.f40343b, weakKeyDummyValueEntry);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public MapMaker.Dummy getValue() {
            return MapMaker.Dummy.VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WeakKeyDummyValueSegment<K> extends Segment<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> {

        /* renamed from: j */
        private final ReferenceQueue<K> f40372j;

        WeakKeyDummyValueSegment(MapMakerInternalMap<K, MapMaker.Dummy, WeakKeyDummyValueEntry<K>, WeakKeyDummyValueSegment<K>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.f40372j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: o */
        void mo69067o() {
            m69124b((ReferenceQueue<K>) this.f40372j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: p */
        void mo69066p() {
            m69121e(this.f40372j);
        }

        public WeakKeyDummyValueEntry<K> castForTesting(InternalEntry<K, MapMaker.Dummy, ?> internalEntry) {
            return (WeakKeyDummyValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: H */
        public WeakKeyDummyValueSegment<K> mo69071D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WeakKeyStrongValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyStrongValueEntry<K, V>> implements StrongValueEntry<K, V, WeakKeyStrongValueEntry<K, V>> {

        /* renamed from: d */
        private volatile V f40373d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f40374a = new Helper<>();

            Helper() {
            }

            /* renamed from: a */
            static <K, V> Helper<K, V> m69079a() {
                return (Helper<K, V>) f40374a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                return copy((WeakKeyStrongValueSegment) ((WeakKeyStrongValueSegment) segment), (WeakKeyStrongValueEntry) ((WeakKeyStrongValueEntry) internalEntry), (WeakKeyStrongValueEntry) ((WeakKeyStrongValueEntry) internalEntry2));
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((WeakKeyStrongValueSegment<WeakKeyStrongValueSegment<K, V>, V>) segment, (WeakKeyStrongValueSegment<K, V>) obj, i, (WeakKeyStrongValueEntry<WeakKeyStrongValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((WeakKeyStrongValueSegment<K, WeakKeyStrongValueEntry<K, V>>) segment, (WeakKeyStrongValueEntry<K, WeakKeyStrongValueEntry<K, V>>) internalEntry, (WeakKeyStrongValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            public WeakKeyStrongValueEntry<K, V> copy(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2) {
                if (weakKeyStrongValueEntry.getKey() == null) {
                    return null;
                }
                return weakKeyStrongValueEntry.m69081a(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).f40375j, weakKeyStrongValueEntry2);
            }

            public WeakKeyStrongValueEntry<K, V> newEntry(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
                return new WeakKeyStrongValueEntry<>(((WeakKeyStrongValueSegment) weakKeyStrongValueSegment).f40375j, k, i, weakKeyStrongValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyStrongValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyStrongValueSegment<>(mapMakerInternalMap, i, i2);
            }

            public void setValue(WeakKeyStrongValueSegment<K, V> weakKeyStrongValueSegment, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry, V v) {
                weakKeyStrongValueEntry.m69080b(v);
            }
        }

        WeakKeyStrongValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            super(referenceQueue, k, i, weakKeyStrongValueEntry);
            this.f40373d = null;
        }

        /* renamed from: a */
        WeakKeyStrongValueEntry<K, V> m69081a(ReferenceQueue<K> referenceQueue, WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry) {
            WeakKeyStrongValueEntry<K, V> weakKeyStrongValueEntry2 = new WeakKeyStrongValueEntry<>(referenceQueue, getKey(), this.f40343b, weakKeyStrongValueEntry);
            weakKeyStrongValueEntry2.m69080b(this.f40373d);
            return weakKeyStrongValueEntry2;
        }

        /* renamed from: b */
        void m69080b(V v) {
            this.f40373d = v;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
            return this.f40373d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> {

        /* renamed from: j */
        private final ReferenceQueue<K> f40375j;

        WeakKeyStrongValueSegment(MapMakerInternalMap<K, V, WeakKeyStrongValueEntry<K, V>, WeakKeyStrongValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.f40375j = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: o */
        void mo69067o() {
            m69124b((ReferenceQueue<K>) this.f40375j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: p */
        void mo69066p() {
            m69121e(this.f40375j);
        }

        public WeakKeyStrongValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (WeakKeyStrongValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: H */
        public WeakKeyStrongValueSegment<K, V> mo69071D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WeakKeyWeakValueEntry<K, V> extends AbstractWeakKeyEntry<K, V, WeakKeyWeakValueEntry<K, V>> implements WeakValueEntry<K, V, WeakKeyWeakValueEntry<K, V>> {

        /* renamed from: d */
        private volatile WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> f40376d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class Helper<K, V> implements InternalEntryHelper<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* renamed from: a */
            private static final Helper<?, ?> f40377a = new Helper<>();

            Helper() {
            }

            /* renamed from: a */
            static <K, V> Helper<K, V> m69072a() {
                return (Helper<K, V>) f40377a;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry copy(Segment segment, InternalEntry internalEntry, InternalEntry internalEntry2) {
                return copy((WeakKeyWeakValueSegment) ((WeakKeyWeakValueSegment) segment), (WeakKeyWeakValueEntry) ((WeakKeyWeakValueEntry) internalEntry), (WeakKeyWeakValueEntry) ((WeakKeyWeakValueEntry) internalEntry2));
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ InternalEntry newEntry(Segment segment, Object obj, int i, InternalEntry internalEntry) {
                return newEntry((WeakKeyWeakValueSegment<WeakKeyWeakValueSegment<K, V>, V>) segment, (WeakKeyWeakValueSegment<K, V>) obj, i, (WeakKeyWeakValueEntry<WeakKeyWeakValueSegment<K, V>, V>) internalEntry);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public /* bridge */ /* synthetic */ void setValue(Segment segment, InternalEntry internalEntry, Object obj) {
                setValue((WeakKeyWeakValueSegment<K, WeakKeyWeakValueEntry<K, V>>) segment, (WeakKeyWeakValueEntry<K, WeakKeyWeakValueEntry<K, V>>) internalEntry, (WeakKeyWeakValueEntry<K, V>) obj);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            public WeakKeyWeakValueEntry<K, V> copy(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2) {
                if (weakKeyWeakValueEntry.getKey() == null || Segment.m69112n(weakKeyWeakValueEntry)) {
                    return null;
                }
                return weakKeyWeakValueEntry.m69074c(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f40378j, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f40379k, weakKeyWeakValueEntry2);
            }

            public WeakKeyWeakValueEntry<K, V> newEntry(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
                return new WeakKeyWeakValueEntry<>(((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f40378j, k, i, weakKeyWeakValueEntry);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public WeakKeyWeakValueSegment<K, V> newSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
                return new WeakKeyWeakValueSegment<>(mapMakerInternalMap, i, i2);
            }

            public void setValue(WeakKeyWeakValueSegment<K, V> weakKeyWeakValueSegment, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry, V v) {
                weakKeyWeakValueEntry.m69073d(v, ((WeakKeyWeakValueSegment) weakKeyWeakValueSegment).f40379k);
            }
        }

        WeakKeyWeakValueEntry(ReferenceQueue<K> referenceQueue, K k, int i, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            super(referenceQueue, k, i, weakKeyWeakValueEntry);
            this.f40376d = MapMakerInternalMap.m69141p();
        }

        /* renamed from: c */
        WeakKeyWeakValueEntry<K, V> m69074c(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry) {
            WeakKeyWeakValueEntry<K, V> weakKeyWeakValueEntry2 = new WeakKeyWeakValueEntry<>(referenceQueue, getKey(), this.f40343b, weakKeyWeakValueEntry);
            weakKeyWeakValueEntry2.f40376d = this.f40376d.copyFor(referenceQueue2, weakKeyWeakValueEntry2);
            return weakKeyWeakValueEntry2;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public void clearValue() {
            this.f40376d.clear();
        }

        /* renamed from: d */
        void m69073d(V v, ReferenceQueue<V> referenceQueue) {
            WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> weakValueReference = this.f40376d;
            this.f40376d = new WeakValueReferenceImpl(referenceQueue, v, this);
            weakValueReference.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public V getValue() {
            return this.f40376d.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getValueReference() {
            return this.f40376d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> {

        /* renamed from: j */
        private final ReferenceQueue<K> f40378j;

        /* renamed from: k */
        private final ReferenceQueue<V> f40379k;

        WeakKeyWeakValueSegment(MapMakerInternalMap<K, V, WeakKeyWeakValueEntry<K, V>, WeakKeyWeakValueSegment<K, V>> mapMakerInternalMap, int i, int i2) {
            super(mapMakerInternalMap, i, i2);
            this.f40378j = new ReferenceQueue<>();
            this.f40379k = new ReferenceQueue<>();
        }

        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting((InternalEntry) internalEntry).getValueReference();
        }

        public WeakValueReference<K, V, WeakKeyWeakValueEntry<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            return new WeakValueReferenceImpl(this.f40379k, v, castForTesting((InternalEntry) internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: o */
        void mo69067o() {
            m69124b((ReferenceQueue<K>) this.f40378j);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: p */
        void mo69066p() {
            m69121e(this.f40378j);
            m69120f(this.f40379k);
        }

        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            WeakKeyWeakValueEntry<K, V> castForTesting = castForTesting((InternalEntry) internalEntry);
            WeakValueReference weakValueReference2 = ((WeakKeyWeakValueEntry) castForTesting).f40376d;
            ((WeakKeyWeakValueEntry) castForTesting).f40376d = weakValueReference;
            weakValueReference2.clear();
        }

        public WeakKeyWeakValueEntry<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (WeakKeyWeakValueEntry) internalEntry;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* renamed from: I */
        public WeakKeyWeakValueSegment<K, V> mo69071D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        void clearValue();

        WeakValueReference<K, V, E> getValueReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        void clear();

        WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e);

        V get();

        E getEntry();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WeakValueReferenceImpl<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        @Weak

        /* renamed from: b */
        final E f40380b;

        WeakValueReferenceImpl(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f40380b = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e) {
            return new WeakValueReferenceImpl(referenceQueue, get(), e);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
            return this.f40380b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class WriteThroughEntry extends AbstractMapEntry<K, V> {

        /* renamed from: b */
        final K f40381b;

        /* renamed from: c */
        V f40382c;

        WriteThroughEntry(K k, V v) {
            this.f40381b = k;
            this.f40382c = v;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f40381b.equals(entry.getKey()) || !this.f40382c.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.f40381b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.f40382c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
            return this.f40381b.hashCode() ^ this.f40382c.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) MapMakerInternalMap.this.put(this.f40381b, v);
            this.f40382c = v;
            return v2;
        }
    }

    private MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper<K, V, E, S> internalEntryHelper) {
        this.f40328f = Math.min(mapMaker.m69163a(), 65536);
        this.f40329g = mapMaker.m69161c();
        this.f40330h = internalEntryHelper;
        int min = Math.min(mapMaker.m69162b(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f40328f) {
            i3++;
            i4 <<= 1;
        }
        this.f40326c = 32 - i3;
        this.f40325b = i4 - 1;
        this.f40327d = m69147i(i4);
        int i5 = min / i4;
        while (i2 < (i4 * i5 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.f40327d;
            if (i < segmentArr.length) {
                segmentArr[i] = m69152c(i2, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <K, V> MapMakerInternalMap<K, V, ? extends InternalEntry<K, V, ?>, ?> m69153b(MapMaker mapMaker) {
        Strength m69160d = mapMaker.m69160d();
        Strength strength = Strength.STRONG;
        if (m69160d == strength && mapMaker.m69159e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyStrongValueEntry.Helper.m69094a());
        }
        if (mapMaker.m69160d() == strength && mapMaker.m69159e() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyWeakValueEntry.Helper.m69088a());
        }
        Strength m69160d2 = mapMaker.m69160d();
        Strength strength2 = Strength.WEAK;
        if (m69160d2 == strength2 && mapMaker.m69159e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyStrongValueEntry.Helper.m69079a());
        }
        if (mapMaker.m69160d() == strength2 && mapMaker.m69159e() == strength2) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyWeakValueEntry.Helper.m69072a());
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <K> MapMakerInternalMap<K, MapMaker.Dummy, ? extends InternalEntry<K, MapMaker.Dummy, ?>, ?> m69151d(MapMaker mapMaker) {
        Strength m69160d = mapMaker.m69160d();
        Strength strength = Strength.STRONG;
        if (m69160d == strength && mapMaker.m69159e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, StrongKeyDummyValueEntry.Helper.m69098a());
        }
        Strength m69160d2 = mapMaker.m69160d();
        Strength strength2 = Strength.WEAK;
        if (m69160d2 == strength2 && mapMaker.m69159e() == strength) {
            return new MapMakerInternalMap<>(mapMaker, WeakKeyDummyValueEntry.Helper.m69084a());
        }
        if (mapMaker.m69159e() == strength2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    /* renamed from: m */
    static int m69144m(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static <E> ArrayList<E> m69142o(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: p */
    static <K, V, E extends InternalEntry<K, V, E>> WeakValueReference<K, V, E> m69141p() {
        return (WeakValueReference<K, V, E>) f40324l;
    }

    /* renamed from: c */
    Segment<K, V, E, S> m69152c(int i, int i2) {
        return (S) this.f40330h.newSegment(this, i, i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.f40327d) {
            segment.m69125a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int m69148h = m69148h(obj);
        return m69143n(m69148h).m69123c(obj, m69148h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.common.collect.MapMakerInternalMap$Segment] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.MapMakerInternalMap$Segment<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.f40327d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (int i2 = z; i2 < length; i2++) {
                ?? r11 = segmentArr[i2];
                int i3 = r11.f40357c;
                AtomicReferenceArray<E> atomicReferenceArray = r11.f40360g;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    for (E e = atomicReferenceArray.get(i4); e != null; e = e.getNext()) {
                        Object m69114l = r11.m69114l(e);
                        if (m69114l != null && m69140q().equivalent(obj, m69114l)) {
                            return true;
                        }
                    }
                }
                j2 += r11.f40358d;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f40333k;
        if (set == null) {
            EntrySet entrySet = new EntrySet();
            this.f40333k = entrySet;
            return entrySet;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public E m69150f(Object obj) {
        if (obj == null) {
            return null;
        }
        int m69148h = m69148h(obj);
        return m69143n(m69148h).m69117i(obj, m69148h);
    }

    /* renamed from: g */
    V m69149g(E e) {
        if (e.getKey() == null) {
            return null;
        }
        return (V) e.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int m69148h = m69148h(obj);
        return m69143n(m69148h).m69118h(obj, m69148h);
    }

    /* renamed from: h */
    int m69148h(Object obj) {
        return m69144m(this.f40329g.hash(obj));
    }

    /* renamed from: i */
    final Segment<K, V, E, S>[] m69147i(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.f40327d;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].f40357c != 0) {
                return false;
            }
            j += segmentArr[i].f40358d;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].f40357c != 0) {
                return false;
            }
            j -= segmentArr[i2].f40358d;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    void m69146j(E e) {
        int hash = e.getHash();
        m69143n(hash).m69107u(e, hash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f40331i;
        if (set == null) {
            KeySet keySet = new KeySet();
            this.f40331i = keySet;
            return keySet;
        }
        return set;
    }

    /* renamed from: l */
    void m69145l(WeakValueReference<K, V, E> weakValueReference) {
        E entry = weakValueReference.getEntry();
        int hash = entry.getHash();
        m69143n(hash).m69106v((K) entry.getKey(), hash, weakValueReference);
    }

    /* renamed from: n */
    Segment<K, V, E, S> m69143n(int i) {
        return this.f40327d[(i >>> this.f40326c) & this.f40325b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int m69148h = m69148h(k);
        return m69143n(m69148h).m69108t(k, m69148h, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V putIfAbsent(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int m69148h = m69148h(k);
        return m69143n(m69148h).m69108t(k, m69148h, v, true);
    }

    @VisibleForTesting
    /* renamed from: q */
    Equivalence<Object> m69140q() {
        return this.f40330h.valueStrength().mo69100c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int m69148h = m69148h(obj);
        return m69143n(m69148h).m69105w(obj, m69148h);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k, V v, V v2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int m69148h = m69148h(k);
        return m69143n(m69148h).m69130A(k, m69148h, v, v2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (Segment<K, V, E, S> segment : this.f40327d) {
            j += segment.f40357c;
        }
        return Ints.saturatedCast(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f40332j;
        if (collection == null) {
            Values values = new Values();
            this.f40332j = values;
            return values;
        }
        return collection;
    }

    Object writeReplace() {
        return new SerializationProxy(this.f40330h.keyStrength(), this.f40330h.valueStrength(), this.f40329g, this.f40330h.valueStrength().mo69100c(), this.f40328f, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int m69148h = m69148h(obj);
        return m69143n(m69148h).m69104x(obj, m69148h, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V replace(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int m69148h = m69148h(k);
        return m69143n(m69148h).m69102z(k, m69148h, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        @Weak

        /* renamed from: b */
        final MapMakerInternalMap<K, V, E, S> f40356b;

        /* renamed from: c */
        volatile int f40357c;

        /* renamed from: d */
        int f40358d;

        /* renamed from: f */
        int f40359f;

        /* renamed from: g */
        volatile AtomicReferenceArray<E> f40360g;

        /* renamed from: h */
        final int f40361h;

        /* renamed from: i */
        final AtomicInteger f40362i = new AtomicInteger();

        Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i, int i2) {
            this.f40356b = mapMakerInternalMap;
            this.f40361h = i2;
            m69113m(m69111q(i));
        }

        /* renamed from: n */
        static <K, V, E extends InternalEntry<K, V, E>> boolean m69112n(E e) {
            if (e.getValue() == null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: A */
        boolean m69130A(K k, int i, V v, V v2) {
            lock();
            try {
                m69109s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry internalEntry = e; internalEntry != null; internalEntry = internalEntry.getNext()) {
                    Object key = internalEntry.getKey();
                    if (internalEntry.getHash() == i && key != null && this.f40356b.f40329g.equivalent(k, key)) {
                        Object value = internalEntry.getValue();
                        if (value == null) {
                            if (m69112n(internalEntry)) {
                                this.f40358d++;
                                atomicReferenceArray.set(length, m69103y(e, internalEntry));
                                this.f40357c--;
                            }
                            return false;
                        } else if (!this.f40356b.m69140q().equivalent(v, value)) {
                            return false;
                        } else {
                            this.f40358d++;
                            m69127E(internalEntry, v2);
                            return true;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* renamed from: B */
        void m69129B() {
            m69128C();
        }

        /* renamed from: C */
        void m69128C() {
            if (tryLock()) {
                try {
                    mo69066p();
                    this.f40362i.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: D */
        abstract S mo69071D();

        /* renamed from: E */
        void m69127E(E e, V v) {
            this.f40356b.f40330h.setValue(mo69071D(), e, v);
        }

        /* renamed from: F */
        void m69126F() {
            if (tryLock()) {
                try {
                    mo69066p();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: a */
        void m69125a() {
            if (this.f40357c != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    mo69067o();
                    this.f40362i.set(0);
                    this.f40358d++;
                    this.f40357c = 0;
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: b */
        <T> void m69124b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        /* renamed from: c */
        boolean m69123c(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f40357c == 0) {
                    return false;
                }
                E m69115k = m69115k(obj, i);
                if (m69115k != null) {
                    if (m69115k.getValue() != null) {
                        z = true;
                    }
                }
                return z;
            } finally {
                m69110r();
            }
        }

        /* renamed from: d */
        E m69122d(E e, E e2) {
            return this.f40356b.f40330h.copy(mo69071D(), e, e2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        /* renamed from: e */
        void m69121e(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f40356b.m69146j((InternalEntry) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        /* renamed from: f */
        void m69120f(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f40356b.m69145l((WeakValueReference) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        /* renamed from: g */
        void m69119g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f40357c;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) m69111q(length << 1);
            this.f40359f = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E e = atomicReferenceArray.get(i2);
                if (e != null) {
                    InternalEntry next = e.getNext();
                    int hash = e.getHash() & length2;
                    if (next == null) {
                        atomicReferenceArray2.set(hash, e);
                    } else {
                        InternalEntry internalEntry = e;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                internalEntry = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        atomicReferenceArray2.set(hash, internalEntry);
                        while (e != internalEntry) {
                            int hash3 = e.getHash() & length2;
                            InternalEntry m69122d = m69122d(e, (InternalEntry) atomicReferenceArray2.get(hash3));
                            if (m69122d != null) {
                                atomicReferenceArray2.set(hash3, m69122d);
                            } else {
                                i--;
                            }
                            e = e.getNext();
                        }
                    }
                }
            }
            this.f40360g = atomicReferenceArray2;
            this.f40357c = i;
        }

        /* renamed from: h */
        V m69118h(Object obj, int i) {
            try {
                E m69115k = m69115k(obj, i);
                if (m69115k == null) {
                    m69110r();
                    return null;
                }
                V v = (V) m69115k.getValue();
                if (v == null) {
                    m69126F();
                }
                return v;
            } finally {
                m69110r();
            }
        }

        /* renamed from: i */
        E m69117i(Object obj, int i) {
            if (this.f40357c != 0) {
                for (E m69116j = m69116j(i); m69116j != null; m69116j = (E) m69116j.getNext()) {
                    if (m69116j.getHash() == i) {
                        Object key = m69116j.getKey();
                        if (key == null) {
                            m69126F();
                        } else if (this.f40356b.f40329g.equivalent(obj, key)) {
                            return m69116j;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: j */
        E m69116j(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: k */
        E m69115k(Object obj, int i) {
            return m69117i(obj, i);
        }

        /* renamed from: l */
        V m69114l(E e) {
            if (e.getKey() == null) {
                m69126F();
                return null;
            }
            V v = (V) e.getValue();
            if (v == null) {
                m69126F();
                return null;
            }
            return v;
        }

        /* renamed from: m */
        void m69113m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f40359f = length;
            if (length == this.f40361h) {
                this.f40359f = length + 1;
            }
            this.f40360g = atomicReferenceArray;
        }

        /* renamed from: q */
        AtomicReferenceArray<E> m69111q(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: r */
        void m69110r() {
            if ((this.f40362i.incrementAndGet() & 63) == 0) {
                m69129B();
            }
        }

        @GuardedBy("this")
        /* renamed from: s */
        void m69109s() {
            m69128C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: t */
        V m69108t(K k, int i, V v, boolean z) {
            lock();
            try {
                m69109s();
                int i2 = this.f40357c + 1;
                if (i2 > this.f40359f) {
                    m69119g();
                    i2 = this.f40357c + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry internalEntry = e; internalEntry != null; internalEntry = internalEntry.getNext()) {
                    Object key = internalEntry.getKey();
                    if (internalEntry.getHash() == i && key != null && this.f40356b.f40329g.equivalent(k, key)) {
                        V v2 = (V) internalEntry.getValue();
                        if (v2 == null) {
                            this.f40358d++;
                            m69127E(internalEntry, v);
                            this.f40357c = this.f40357c;
                            return null;
                        } else if (z) {
                            return v2;
                        } else {
                            this.f40358d++;
                            m69127E(internalEntry, v);
                            return v2;
                        }
                    }
                }
                this.f40358d++;
                E newEntry = this.f40356b.f40330h.newEntry(mo69071D(), k, i, e);
                m69127E(newEntry, v);
                atomicReferenceArray.set(length, newEntry);
                this.f40357c = i2;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        /* renamed from: u */
        boolean m69107u(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InternalEntry internalEntry = e2; internalEntry != null; internalEntry = internalEntry.getNext()) {
                    if (internalEntry == e) {
                        this.f40358d++;
                        atomicReferenceArray.set(length, m69103y(e2, internalEntry));
                        this.f40357c--;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        /* renamed from: v */
        boolean m69106v(K k, int i, WeakValueReference<K, V, E> weakValueReference) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry internalEntry = e; internalEntry != null; internalEntry = internalEntry.getNext()) {
                    Object key = internalEntry.getKey();
                    if (internalEntry.getHash() == i && key != null && this.f40356b.f40329g.equivalent(k, key)) {
                        if (((WeakValueEntry) internalEntry).getValueReference() != weakValueReference) {
                            return false;
                        }
                        this.f40358d++;
                        atomicReferenceArray.set(length, m69103y(e, internalEntry));
                        this.f40357c--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        /* renamed from: w */
        V m69105w(Object obj, int i) {
            lock();
            try {
                m69109s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry internalEntry = e; internalEntry != null; internalEntry = internalEntry.getNext()) {
                    Object key = internalEntry.getKey();
                    if (internalEntry.getHash() == i && key != null && this.f40356b.f40329g.equivalent(obj, key)) {
                        V v = (V) internalEntry.getValue();
                        if (v == null && !m69112n(internalEntry)) {
                            return null;
                        }
                        this.f40358d++;
                        atomicReferenceArray.set(length, m69103y(e, internalEntry));
                        this.f40357c--;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.f40356b.m69140q().equivalent(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (m69112n(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.f40358d++;
            r0.set(r1, m69103y(r3, r4));
            r8.f40357c--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean m69104x(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.m69109s()     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>> r0 = r8.f40360g     // Catch: java.lang.Throwable -> L69
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.MapMakerInternalMap$InternalEntry r3 = (com.google.common.collect.MapMakerInternalMap.InternalEntry) r3     // Catch: java.lang.Throwable -> L69
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L65
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L69
                int r7 = r4.getHash()     // Catch: java.lang.Throwable -> L69
                if (r7 != r10) goto L60
                if (r6 == 0) goto L60
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r7 = r8.f40356b     // Catch: java.lang.Throwable -> L69
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.f40329g     // Catch: java.lang.Throwable -> L69
                boolean r6 = r7.equivalent(r9, r6)     // Catch: java.lang.Throwable -> L69
                if (r6 == 0) goto L60
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.MapMakerInternalMap<K, V, E extends com.google.common.collect.MapMakerInternalMap$InternalEntry<K, V, E>, S extends com.google.common.collect.MapMakerInternalMap$Segment<K, V, E, S>> r10 = r8.f40356b     // Catch: java.lang.Throwable -> L69
                com.google.common.base.Equivalence r10 = r10.m69140q()     // Catch: java.lang.Throwable -> L69
                boolean r9 = r10.equivalent(r11, r9)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = m69112n(r4)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L5c
            L47:
                int r9 = r8.f40358d     // Catch: java.lang.Throwable -> L69
                int r9 = r9 + r2
                r8.f40358d = r9     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.MapMakerInternalMap$InternalEntry r9 = r8.m69103y(r3, r4)     // Catch: java.lang.Throwable -> L69
                int r10 = r8.f40357c     // Catch: java.lang.Throwable -> L69
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L69
                r8.f40357c = r10     // Catch: java.lang.Throwable -> L69
                r8.unlock()
                return r5
            L5c:
                r8.unlock()
                return r5
            L60:
                com.google.common.collect.MapMakerInternalMap$InternalEntry r4 = r4.getNext()     // Catch: java.lang.Throwable -> L69
                goto L16
            L65:
                r8.unlock()
                return r5
            L69:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.Segment.m69104x(java.lang.Object, int, java.lang.Object):boolean");
        }

        @GuardedBy("this")
        /* renamed from: y */
        E m69103y(E e, E e2) {
            int i = this.f40357c;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                E m69122d = m69122d(e, e3);
                if (m69122d != null) {
                    e3 = m69122d;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.f40357c = i;
            return e3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: z */
        V m69102z(K k, int i, V v) {
            lock();
            try {
                m69109s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f40360g;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry internalEntry = e; internalEntry != null; internalEntry = internalEntry.getNext()) {
                    Object key = internalEntry.getKey();
                    if (internalEntry.getHash() == i && key != null && this.f40356b.f40329g.equivalent(k, key)) {
                        V v2 = (V) internalEntry.getValue();
                        if (v2 == null) {
                            if (m69112n(internalEntry)) {
                                this.f40358d++;
                                atomicReferenceArray.set(length, m69103y(e, internalEntry));
                                this.f40357c--;
                            }
                            return null;
                        }
                        this.f40358d++;
                        m69127E(internalEntry, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* renamed from: o */
        void mo69067o() {
        }

        @GuardedBy("this")
        /* renamed from: p */
        void mo69066p() {
        }
    }
}

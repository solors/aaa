package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* renamed from: b */
    final int f39561b;

    /* renamed from: c */
    final int f39562c;

    /* renamed from: d */
    final Segment<K, V>[] f39563d;

    /* renamed from: f */
    final int f39564f;

    /* renamed from: g */
    final Equivalence<Object> f39565g;

    /* renamed from: h */
    final Equivalence<Object> f39566h;

    /* renamed from: i */
    final Strength f39567i;

    /* renamed from: j */
    final Strength f39568j;

    /* renamed from: k */
    final long f39569k;

    /* renamed from: l */
    final Weigher<K, V> f39570l;

    /* renamed from: m */
    final long f39571m;

    /* renamed from: n */
    final long f39572n;

    /* renamed from: o */
    final long f39573o;

    /* renamed from: p */
    final Queue<RemovalNotification<K, V>> f39574p;

    /* renamed from: q */
    final RemovalListener<K, V> f39575q;

    /* renamed from: r */
    final Ticker f39576r;

    /* renamed from: s */
    final EntryFactory f39577s;

    /* renamed from: t */
    final AbstractCache.StatsCounter f39578t;

    /* renamed from: u */
    final CacheLoader<? super K, V> f39579u;
    @RetainedWith

    /* renamed from: v */
    Set<K> f39580v;
    @RetainedWith

    /* renamed from: w */
    Collection<V> f39581w;
    @RetainedWith

    /* renamed from: x */
    Set<Map.Entry<K, V>> f39582x;

    /* renamed from: y */
    static final Logger f39559y = Logger.getLogger(LocalCache.class.getName());

    /* renamed from: z */
    static final ValueReference<Object, Object> f39560z = new ValueReference<Object, Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<Object, Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object waitForValue() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }
    };

    /* renamed from: A */
    static final Queue<?> f39558A = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.m69331of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    };

    /* loaded from: classes4.dex */
    abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.m69942J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m69942J(this).toArray(eArr);
        }
    }

    /* loaded from: classes4.dex */
    static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: b */
        final ReferenceEntry<K, V> f39584b = new AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.AccessQueue.1
            @Weak

            /* renamed from: b */
            ReferenceEntry<K, V> f39585b = this;
            @Weak

            /* renamed from: c */
            ReferenceEntry<K, V> f39586c = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.f39585b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.f39586c;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f39585b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f39586c = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j) {
            }
        };

        AccessQueue() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f39584b.getNextInAccessQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f39584b;
                if (nextInAccessQueue != referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.m69913x(nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                } else {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f39584b;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (((ReferenceEntry) obj).getNextInAccessQueue() != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.f39584b.getNextInAccessQueue() == this.f39584b) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.AccessQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                /* renamed from: b */
                public ReferenceEntry<K, V> mo68840a(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
                    if (nextInAccessQueue == AccessQueue.this.f39584b) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(Object obj) {
            return offer((ReferenceEntry) ((ReferenceEntry) obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            LocalCache.m69933b(previousInAccessQueue, nextInAccessQueue);
            LocalCache.m69913x(referenceEntry);
            if (nextInAccessQueue != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> nextInAccessQueue = this.f39584b.getNextInAccessQueue(); nextInAccessQueue != this.f39584b; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.m69933b(referenceEntry.getPreviousInAccessQueue(), referenceEntry.getNextInAccessQueue());
            LocalCache.m69933b(this.f39584b.getPreviousInAccessQueue(), referenceEntry);
            LocalCache.m69933b(referenceEntry, this.f39584b);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f39584b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f39584b) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f39584b.getNextInAccessQueue();
            if (nextInAccessQueue == this.f39584b) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            <K, V> ReferenceEntry<K, V> mo69905d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo69905d = super.mo69905d(segment, referenceEntry, referenceEntry2);
                m69908c(referenceEntry, mo69905d);
                return mo69905d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k, i, referenceEntry);
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            <K, V> ReferenceEntry<K, V> mo69905d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo69905d = super.mo69905d(segment, referenceEntry, referenceEntry2);
                m69907e(referenceEntry, mo69905d);
                return mo69905d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            <K, V> ReferenceEntry<K, V> mo69905d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo69905d = super.mo69905d(segment, referenceEntry, referenceEntry2);
                m69908c(referenceEntry, mo69905d);
                m69907e(referenceEntry, mo69905d);
                return mo69905d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k, i, referenceEntry);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.f39628j, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            <K, V> ReferenceEntry<K, V> mo69905d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo69905d = super.mo69905d(segment, referenceEntry, referenceEntry2);
                m69908c(referenceEntry, mo69905d);
                return mo69905d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.f39628j, k, i, referenceEntry);
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            <K, V> ReferenceEntry<K, V> mo69905d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo69905d = super.mo69905d(segment, referenceEntry, referenceEntry2);
                m69907e(referenceEntry, mo69905d);
                return mo69905d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.f39628j, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: d */
            <K, V> ReferenceEntry<K, V> mo69905d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> mo69905d = super.mo69905d(segment, referenceEntry, referenceEntry2);
                m69908c(referenceEntry, mo69905d);
                m69907e(referenceEntry, mo69905d);
                return mo69905d;
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            /* renamed from: g */
            <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.f39628j, k, i, referenceEntry);
            }
        };
        

        /* renamed from: b */
        static final EntryFactory[] f39588b;

        static {
            EntryFactory entryFactory;
            EntryFactory entryFactory2;
            EntryFactory entryFactory3;
            EntryFactory entryFactory4;
            EntryFactory entryFactory5;
            EntryFactory entryFactory6;
            EntryFactory entryFactory7;
            EntryFactory entryFactory8;
            f39588b = new EntryFactory[]{entryFactory, entryFactory2, entryFactory3, entryFactory4, entryFactory5, entryFactory6, entryFactory7, entryFactory8};
        }

        /* renamed from: f */
        static EntryFactory m69906f(Strength strength, boolean z, boolean z2) {
            int i;
            int i2 = 0;
            if (strength == Strength.WEAK) {
                i = 4;
            } else {
                i = 0;
            }
            int i3 = i | (z ? 1 : 0);
            if (z2) {
                i2 = 2;
            }
            return f39588b[i3 | i2];
        }

        /* renamed from: c */
        <K, V> void m69908c(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            LocalCache.m69933b(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
            LocalCache.m69933b(referenceEntry2, referenceEntry.getNextInAccessQueue());
            LocalCache.m69913x(referenceEntry);
        }

        /* renamed from: d */
        <K, V> ReferenceEntry<K, V> mo69905d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return mo69904g(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
        }

        /* renamed from: e */
        <K, V> void m69907e(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            LocalCache.m69932c(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
            LocalCache.m69932c(referenceEntry2, referenceEntry.getNextInWriteQueue());
            LocalCache.m69912y(referenceEntry);
        }

        /* renamed from: g */
        abstract <K, V> ReferenceEntry<K, V> mo69904g(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry);
    }

    /* loaded from: classes4.dex */
    final class EntryIterator extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        EntryIterator(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public Map.Entry<K, V> next() {
            return m69901c();
        }
    }

    /* loaded from: classes4.dex */
    final class EntrySet extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = LocalCache.this.get(key)) == null || !LocalCache.this.f39566h.equivalent(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !LocalCache.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public abstract class HashIterator<T> implements Iterator<T> {

        /* renamed from: b */
        int f39591b;

        /* renamed from: c */
        int f39592c = -1;

        /* renamed from: d */
        Segment<K, V> f39593d;

        /* renamed from: f */
        AtomicReferenceArray<ReferenceEntry<K, V>> f39594f;

        /* renamed from: g */
        ReferenceEntry<K, V> f39595g;

        /* renamed from: h */
        LocalCache<K, V>.WriteThroughEntry f39596h;

        /* renamed from: i */
        LocalCache<K, V>.WriteThroughEntry f39597i;

        HashIterator() {
            this.f39591b = LocalCache.this.f39563d.length - 1;
            m69903a();
        }

        /* renamed from: a */
        final void m69903a() {
            this.f39596h = null;
            if (m69900d() || m69899e()) {
                return;
            }
            while (true) {
                int i = this.f39591b;
                if (i >= 0) {
                    Segment<K, V>[] segmentArr = LocalCache.this.f39563d;
                    this.f39591b = i - 1;
                    Segment<K, V> segment = segmentArr[i];
                    this.f39593d = segment;
                    if (segment.f39622c != 0) {
                        AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39593d.f39626h;
                        this.f39594f = atomicReferenceArray;
                        this.f39592c = atomicReferenceArray.length() - 1;
                        if (m69899e()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        boolean m69902b(ReferenceEntry<K, V> referenceEntry) {
            try {
                long read = LocalCache.this.f39576r.read();
                K key = referenceEntry.getKey();
                Object m69922o = LocalCache.this.m69922o(referenceEntry, read);
                if (m69922o != null) {
                    this.f39596h = new WriteThroughEntry(key, m69922o);
                    this.f39593d.m69890E();
                    return true;
                }
                this.f39593d.m69890E();
                return false;
            } catch (Throwable th) {
                this.f39593d.m69890E();
                throw th;
            }
        }

        /* renamed from: c */
        LocalCache<K, V>.WriteThroughEntry m69901c() {
            LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.f39596h;
            if (writeThroughEntry != null) {
                this.f39597i = writeThroughEntry;
                m69903a();
                return this.f39597i;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: d */
        boolean m69900d() {
            ReferenceEntry<K, V> referenceEntry = this.f39595g;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.f39595g = referenceEntry.getNext();
                ReferenceEntry<K, V> referenceEntry2 = this.f39595g;
                if (referenceEntry2 != null) {
                    if (m69902b(referenceEntry2)) {
                        return true;
                    }
                    referenceEntry = this.f39595g;
                } else {
                    return false;
                }
            }
        }

        /* renamed from: e */
        boolean m69899e() {
            while (true) {
                int i = this.f39592c;
                if (i >= 0) {
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39594f;
                    this.f39592c = i - 1;
                    ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                    this.f39595g = referenceEntry;
                    if (referenceEntry != null && (m69902b(referenceEntry) || m69900d())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f39596h != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            if (this.f39597i != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            LocalCache.this.remove(this.f39597i.getKey());
            this.f39597i = null;
        }
    }

    /* loaded from: classes4.dex */
    final class KeyIterator extends LocalCache<K, V>.HashIterator<K> {
        KeyIterator(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
            return m69901c().getKey();
        }
    }

    /* loaded from: classes4.dex */
    final class KeySet extends LocalCache<K, V>.AbstractCacheSet<K> {
        KeySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LocalCache.this.remove(obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    static final class LoadingSerializationProxy<K, V> extends ManualSerializationProxy<K, V> implements LoadingCache<K, V> {

        /* renamed from: p */
        transient LoadingCache<K, V> f39600p;

        LoadingSerializationProxy(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f39600p = (LoadingCache<K, V>) m69896d().build((CacheLoader<? super K, V>) this.f39618n);
        }

        private Object readResolve() {
            return this.f39600p;
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return this.f39600p.apply(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return this.f39600p.get(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f39600p.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            return this.f39600p.getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.f39600p.refresh(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class LoadingValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: b */
        volatile ValueReference<K, V> f39601b;

        /* renamed from: c */
        final SettableFuture<V> f39602c;

        /* renamed from: d */
        final Stopwatch f39603d;

        public LoadingValueReference() {
            this(LocalCache.m69941K());
        }

        /* renamed from: a */
        private ListenableFuture<V> m69898a(Throwable th) {
            return Futures.immediateFailedFuture(th);
        }

        public long elapsedNanos() {
            return this.f39603d.elapsed(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.f39601b.get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        public ValueReference<K, V> getOldValue() {
            return this.f39601b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f39601b.getWeight();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return this.f39601b.isActive();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }

        public ListenableFuture<V> loadFuture(K k, CacheLoader<? super K, V> cacheLoader) {
            ListenableFuture<V> m69898a;
            try {
                this.f39603d.start();
                V v = this.f39601b.get();
                if (v == null) {
                    V load = cacheLoader.load(k);
                    if (set(load)) {
                        return this.f39602c;
                    }
                    return Futures.immediateFuture(load);
                }
                ListenableFuture<V> reload = cacheLoader.reload(k, v);
                if (reload == null) {
                    return Futures.immediateFuture(null);
                }
                return Futures.transform(reload, new Function<V, V>() { // from class: com.google.common.cache.LocalCache.LoadingValueReference.1
                    @Override // com.google.common.base.Function
                    public V apply(V v2) {
                        LoadingValueReference.this.set(v2);
                        return v2;
                    }
                }, MoreExecutors.directExecutor());
            } catch (Throwable th) {
                if (setException(th)) {
                    m69898a = this.f39602c;
                } else {
                    m69898a = m69898a(th);
                }
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return m69898a;
            }
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
            if (v != null) {
                set(v);
            } else {
                this.f39601b = LocalCache.m69941K();
            }
        }

        public boolean set(V v) {
            return this.f39602c.set(v);
        }

        public boolean setException(Throwable th) {
            return this.f39602c.setException(th);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws ExecutionException {
            return (V) Uninterruptibles.getUninterruptibly(this.f39602c);
        }

        public LoadingValueReference(ValueReference<K, V> valueReference) {
            this.f39602c = SettableFuture.create();
            this.f39603d = Stopwatch.createUnstarted();
            this.f39601b = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class LocalLoadingCache<K, V> extends LocalManualCache<K, V> implements LoadingCache<K, V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public LocalLoadingCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super();
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return this.f39605b.m69921p(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f39605b.m69924m(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.f39605b.m69946F(k);
        }

        @Override // com.google.common.cache.LocalCache.LocalManualCache
        Object writeReplace() {
            return new LoadingSerializationProxy(this.f39605b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {

        /* renamed from: b */
        final LocalCache<K, V> f39605b;

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.f39605b;
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.f39605b.cleanUp();
        }

        @Override // com.google.common.cache.Cache
        public V get(K k, final Callable<? extends V> callable) throws ExecutionException {
            Preconditions.checkNotNull(callable);
            return this.f39605b.m69925l(k, new CacheLoader<Object, V>(this) { // from class: com.google.common.cache.LocalCache.LocalManualCache.1
                @Override // com.google.common.cache.CacheLoader
                public V load(Object obj) throws Exception {
                    return (V) callable.call();
                }
            });
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.f39605b.m69923n(iterable);
        }

        @Override // com.google.common.cache.Cache
        public V getIfPresent(Object obj) {
            return this.f39605b.getIfPresent(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.f39605b.remove(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
            this.f39605b.m69919r(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void put(K k, V v) {
            this.f39605b.put(k, v);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f39605b.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.f39605b.m69916u();
        }

        @Override // com.google.common.cache.Cache
        public CacheStats stats() {
            AbstractCache.SimpleStatsCounter simpleStatsCounter = new AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.f39605b.f39578t);
            for (Segment<K, V> segment : this.f39605b.f39563d) {
                simpleStatsCounter.incrementBy(segment.f39634p);
            }
            return simpleStatsCounter.snapshot();
        }

        Object writeReplace() {
            return new ManualSerializationProxy(this.f39605b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
            this.f39605b.clear();
        }

        private LocalManualCache(LocalCache<K, V> localCache) {
            this.f39605b = localCache;
        }
    }

    /* loaded from: classes4.dex */
    static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {

        /* renamed from: b */
        final Strength f39607b;

        /* renamed from: c */
        final Strength f39608c;

        /* renamed from: d */
        final Equivalence<Object> f39609d;

        /* renamed from: f */
        final Equivalence<Object> f39610f;

        /* renamed from: g */
        final long f39611g;

        /* renamed from: h */
        final long f39612h;

        /* renamed from: i */
        final long f39613i;

        /* renamed from: j */
        final Weigher<K, V> f39614j;

        /* renamed from: k */
        final int f39615k;

        /* renamed from: l */
        final RemovalListener<? super K, ? super V> f39616l;

        /* renamed from: m */
        final Ticker f39617m;

        /* renamed from: n */
        final CacheLoader<? super K, V> f39618n;

        /* renamed from: o */
        transient Cache<K, V> f39619o;

        ManualSerializationProxy(LocalCache<K, V> localCache) {
            this(localCache.f39567i, localCache.f39568j, localCache.f39565g, localCache.f39566h, localCache.f39572n, localCache.f39571m, localCache.f39569k, localCache.f39570l, localCache.f39564f, localCache.f39575q, localCache.f39576r, localCache.f39579u);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f39619o = (Cache<K, V>) m69896d().build();
        }

        private Object readResolve() {
            return this.f39619o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public Cache<K, V> delegate() {
            return this.f39619o;
        }

        /* renamed from: d */
        CacheBuilder<K, V> m69896d() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.newBuilder().m69964s(this.f39607b).m69963t(this.f39608c).m69966q(this.f39609d).m69962u(this.f39610f).concurrencyLevel(this.f39615k).removalListener((RemovalListener<? super K, ? super V>) this.f39616l);
            cacheBuilder.f39505a = false;
            long j = this.f39611g;
            if (j > 0) {
                cacheBuilder.expireAfterWrite(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.f39612h;
            if (j2 > 0) {
                cacheBuilder.expireAfterAccess(j2, TimeUnit.NANOSECONDS);
            }
            Weigher weigher = this.f39614j;
            if (weigher != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.weigher(weigher);
                long j3 = this.f39613i;
                if (j3 != -1) {
                    cacheBuilder.maximumWeight(j3);
                }
            } else {
                long j4 = this.f39613i;
                if (j4 != -1) {
                    cacheBuilder.maximumSize(j4);
                }
            }
            Ticker ticker = this.f39617m;
            if (ticker != null) {
                cacheBuilder.ticker(ticker);
            }
            return cacheBuilder;
        }

        private ManualSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, Weigher<K, V> weigher, int i, RemovalListener<? super K, ? super V> removalListener, Ticker ticker, CacheLoader<? super K, V> cacheLoader) {
            this.f39607b = strength;
            this.f39608c = strength2;
            this.f39609d = equivalence;
            this.f39610f = equivalence2;
            this.f39611g = j;
            this.f39612h = j2;
            this.f39613i = j3;
            this.f39614j = weigher;
            this.f39615k = i;
            this.f39616l = removalListener;
            this.f39617m = (ticker == Ticker.systemTicker() || ticker == CacheBuilder.f39503t) ? null : null;
            this.f39618n = cacheLoader;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class Segment<K, V> extends ReentrantLock {
        @Weak

        /* renamed from: b */
        final LocalCache<K, V> f39621b;

        /* renamed from: c */
        volatile int f39622c;
        @GuardedBy("this")

        /* renamed from: d */
        long f39623d;

        /* renamed from: f */
        int f39624f;

        /* renamed from: g */
        int f39625g;

        /* renamed from: h */
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> f39626h;

        /* renamed from: i */
        final long f39627i;

        /* renamed from: j */
        final ReferenceQueue<K> f39628j;

        /* renamed from: k */
        final ReferenceQueue<V> f39629k;

        /* renamed from: l */
        final Queue<ReferenceEntry<K, V>> f39630l;

        /* renamed from: m */
        final AtomicInteger f39631m = new AtomicInteger();
        @GuardedBy("this")

        /* renamed from: n */
        final Queue<ReferenceEntry<K, V>> f39632n;
        @GuardedBy("this")

        /* renamed from: o */
        final Queue<ReferenceEntry<K, V>> f39633o;

        /* renamed from: p */
        final AbstractCache.StatsCounter f39634p;

        Segment(LocalCache<K, V> localCache, int i, long j, AbstractCache.StatsCounter statsCounter) {
            ReferenceQueue<K> referenceQueue;
            Queue<ReferenceEntry<K, V>> m69929g;
            Queue<ReferenceEntry<K, V>> m69929g2;
            Queue<ReferenceEntry<K, V>> m69929g3;
            this.f39621b = localCache;
            this.f39627i = j;
            this.f39634p = (AbstractCache.StatsCounter) Preconditions.checkNotNull(statsCounter);
            m69840x(m69891D(i));
            if (localCache.m69938N()) {
                referenceQueue = new ReferenceQueue<>();
            } else {
                referenceQueue = null;
            }
            this.f39628j = referenceQueue;
            this.f39629k = localCache.m69937O() ? new ReferenceQueue<>() : null;
            if (localCache.m69939M()) {
                m69929g = new ConcurrentLinkedQueue<>();
            } else {
                m69929g = LocalCache.m69929g();
            }
            this.f39630l = m69929g;
            if (localCache.m69935Q()) {
                m69929g2 = new WriteQueue<>();
            } else {
                m69929g2 = LocalCache.m69929g();
            }
            this.f39632n = m69929g2;
            if (localCache.m69939M()) {
                m69929g3 = new AccessQueue<>();
            } else {
                m69929g3 = LocalCache.m69929g();
            }
            this.f39633o = m69929g3;
        }

        /* renamed from: A */
        V m69894A(K k, int i, LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return m69846r(k, i, loadingValueReference, loadingValueReference.loadFuture(k, cacheLoader));
        }

        /* renamed from: B */
        V m69893B(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            LoadingValueReference<K, V> loadingValueReference;
            boolean z;
            ValueReference<K, V> valueReference;
            V m69894A;
            lock();
            try {
                long read = this.f39621b.f39576r.read();
                m69888G(read);
                int i2 = this.f39622c - 1;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    loadingValueReference = null;
                    if (referenceEntry2 != null) {
                        K key = referenceEntry2.getKey();
                        if (referenceEntry2.getHash() == i && key != null && this.f39621b.f39565g.equivalent(k, key)) {
                            ValueReference<K, V> valueReference2 = referenceEntry2.getValueReference();
                            if (valueReference2.isLoading()) {
                                z = false;
                            } else {
                                V v = valueReference2.get();
                                if (v == null) {
                                    m69852l(key, i, v, valueReference2.getWeight(), RemovalCause.COLLECTED);
                                } else if (this.f39621b.m69918s(referenceEntry2, read)) {
                                    m69852l(key, i, v, valueReference2.getWeight(), RemovalCause.EXPIRED);
                                } else {
                                    m69884K(referenceEntry2, read);
                                    this.f39634p.recordHits(1);
                                    return v;
                                }
                                this.f39632n.remove(referenceEntry2);
                                this.f39633o.remove(referenceEntry2);
                                this.f39622c = i2;
                                z = true;
                            }
                            valueReference = valueReference2;
                        } else {
                            referenceEntry2 = referenceEntry2.getNext();
                        }
                    } else {
                        z = true;
                        valueReference = null;
                        break;
                    }
                }
                if (z) {
                    loadingValueReference = new LoadingValueReference<>();
                    if (referenceEntry2 == null) {
                        referenceEntry2 = m69892C(k, i, referenceEntry);
                        referenceEntry2.setValueReference(loadingValueReference);
                        atomicReferenceArray.set(length, referenceEntry2);
                    } else {
                        referenceEntry2.setValueReference(loadingValueReference);
                    }
                }
                if (z) {
                    try {
                        synchronized (referenceEntry2) {
                            m69894A = m69894A(k, i, loadingValueReference, cacheLoader);
                        }
                        return m69894A;
                    } finally {
                        this.f39634p.recordMisses(1);
                    }
                }
                return m69859e0(referenceEntry2, k, valueReference);
            } finally {
                unlock();
                m69889F();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        /* renamed from: C */
        ReferenceEntry<K, V> m69892C(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            return this.f39621b.f39577s.mo69904g(this, Preconditions.checkNotNull(k), i, referenceEntry);
        }

        /* renamed from: D */
        AtomicReferenceArray<ReferenceEntry<K, V>> m69891D(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* renamed from: E */
        void m69890E() {
            if ((this.f39631m.incrementAndGet() & 63) == 0) {
                m69868a();
            }
        }

        /* renamed from: F */
        void m69889F() {
            m69870Y();
        }

        @GuardedBy("this")
        /* renamed from: G */
        void m69888G(long j) {
            m69871X(j);
        }

        /* renamed from: H */
        V m69887H(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long read = this.f39621b.f39576r.read();
                m69888G(read);
                if (this.f39622c + 1 > this.f39625g) {
                    m69850n();
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 != null) {
                        K key = referenceEntry2.getKey();
                        if (referenceEntry2.getHash() == i && key != null && this.f39621b.f39565g.equivalent(k, key)) {
                            ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                            V v2 = valueReference.get();
                            if (v2 == null) {
                                this.f39624f++;
                                if (valueReference.isActive()) {
                                    m69852l(k, i, v2, valueReference.getWeight(), RemovalCause.COLLECTED);
                                    m69867a0(referenceEntry2, k, v, read);
                                    i2 = this.f39622c;
                                } else {
                                    m69867a0(referenceEntry2, k, v, read);
                                    i2 = this.f39622c + 1;
                                }
                                this.f39622c = i2;
                                m69851m(referenceEntry2);
                            } else {
                                if (z) {
                                    m69884K(referenceEntry2, read);
                                } else {
                                    this.f39624f++;
                                    m69852l(k, i, v2, valueReference.getWeight(), RemovalCause.REPLACED);
                                    m69867a0(referenceEntry2, k, v, read);
                                    m69851m(referenceEntry2);
                                }
                                return v2;
                            }
                        } else {
                            referenceEntry2 = referenceEntry2.getNext();
                        }
                    } else {
                        this.f39624f++;
                        ReferenceEntry<K, V> m69892C = m69892C(k, i, referenceEntry);
                        m69867a0(m69892C, k, v, read);
                        atomicReferenceArray.set(length, m69892C);
                        this.f39622c++;
                        m69851m(m69892C);
                        break;
                    }
                }
                return null;
            } finally {
                unlock();
                m69889F();
            }
        }

        /* renamed from: I */
        boolean m69886I(ReferenceEntry<K, V> referenceEntry, int i) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                    if (referenceEntry3 == referenceEntry) {
                        this.f39624f++;
                        atomicReferenceArray.set(length, m69874U(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), RemovalCause.COLLECTED));
                        this.f39622c--;
                        return true;
                    }
                }
                unlock();
                m69889F();
                return false;
            } finally {
                unlock();
                m69889F();
            }
        }

        /* renamed from: J */
        boolean m69885J(K k, int i, ValueReference<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null && this.f39621b.f39565g.equivalent(k, key)) {
                        if (referenceEntry2.getValueReference() == valueReference) {
                            this.f39624f++;
                            atomicReferenceArray.set(length, m69874U(referenceEntry, referenceEntry2, key, i, valueReference.get(), valueReference, RemovalCause.COLLECTED));
                            this.f39622c--;
                            return true;
                        }
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            m69889F();
                        }
                        return false;
                    }
                }
                unlock();
                if (!isHeldByCurrentThread()) {
                    m69889F();
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    m69889F();
                }
            }
        }

        @GuardedBy("this")
        /* renamed from: K */
        void m69884K(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.f39621b.m69949C()) {
                referenceEntry.setAccessTime(j);
            }
            this.f39633o.add(referenceEntry);
        }

        /* renamed from: L */
        void m69883L(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.f39621b.m69949C()) {
                referenceEntry.setAccessTime(j);
            }
            this.f39630l.add(referenceEntry);
        }

        @GuardedBy("this")
        /* renamed from: M */
        void m69882M(ReferenceEntry<K, V> referenceEntry, int i, long j) {
            m69855i();
            this.f39623d += i;
            if (this.f39621b.m69949C()) {
                referenceEntry.setAccessTime(j);
            }
            if (this.f39621b.m69947E()) {
                referenceEntry.setWriteTime(j);
            }
            this.f39633o.add(referenceEntry);
            this.f39632n.add(referenceEntry);
        }

        /* renamed from: N */
        V m69881N(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            LoadingValueReference<K, V> m69839y = m69839y(k, i, z);
            if (m69839y == null) {
                return null;
            }
            ListenableFuture<V> m69838z = m69838z(k, i, m69839y, cacheLoader);
            if (m69838z.isDone()) {
                try {
                    return (V) Uninterruptibles.getUninterruptibly(m69838z);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
            r9 = r5.getValueReference();
            r12 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
            if (r12 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            r2 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            r10 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
            if (r9.isActive() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
            r2 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
            r11.f39624f++;
            r0.set(r1, m69874U(r4, r5, r6, r13, r12, r9, r10));
            r11.f39622c--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
            return r12;
         */
        /* renamed from: O */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        V m69880O(java.lang.Object r12, int r13) {
            /*
                r11 = this;
                r11.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r11.f39621b     // Catch: java.lang.Throwable -> L78
                com.google.common.base.Ticker r0 = r0.f39576r     // Catch: java.lang.Throwable -> L78
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L78
                r11.m69888G(r0)     // Catch: java.lang.Throwable -> L78
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r11.f39626h     // Catch: java.lang.Throwable -> L78
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L78
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L78
                r4 = r2
                com.google.common.cache.ReferenceEntry r4 = (com.google.common.cache.ReferenceEntry) r4     // Catch: java.lang.Throwable -> L78
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L6c
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L78
                int r3 = r5.getHash()     // Catch: java.lang.Throwable -> L78
                if (r3 != r13) goto L73
                if (r6 == 0) goto L73
                com.google.common.cache.LocalCache<K, V> r3 = r11.f39621b     // Catch: java.lang.Throwable -> L78
                com.google.common.base.Equivalence<java.lang.Object> r3 = r3.f39565g     // Catch: java.lang.Throwable -> L78
                boolean r3 = r3.equivalent(r12, r6)     // Catch: java.lang.Throwable -> L78
                if (r3 == 0) goto L73
                com.google.common.cache.LocalCache$ValueReference r9 = r5.getValueReference()     // Catch: java.lang.Throwable -> L78
                java.lang.Object r12 = r9.get()     // Catch: java.lang.Throwable -> L78
                if (r12 == 0) goto L46
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L78
            L44:
                r10 = r2
                goto L4f
            L46:
                boolean r3 = r9.isActive()     // Catch: java.lang.Throwable -> L78
                if (r3 == 0) goto L6c
                com.google.common.cache.RemovalCause r2 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L78
                goto L44
            L4f:
                int r2 = r11.f39624f     // Catch: java.lang.Throwable -> L78
                int r2 = r2 + 1
                r11.f39624f = r2     // Catch: java.lang.Throwable -> L78
                r3 = r11
                r7 = r13
                r8 = r12
                com.google.common.cache.ReferenceEntry r13 = r3.m69874U(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L78
                int r2 = r11.f39622c     // Catch: java.lang.Throwable -> L78
                int r2 = r2 + (-1)
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L78
                r11.f39622c = r2     // Catch: java.lang.Throwable -> L78
                r11.unlock()
                r11.m69889F()
                return r12
            L6c:
                r11.unlock()
                r11.m69889F()
                return r2
            L73:
                com.google.common.cache.ReferenceEntry r5 = r5.getNext()     // Catch: java.lang.Throwable -> L78
                goto L1f
            L78:
                r12 = move-exception
                r11.unlock()
                r11.m69889F()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.m69880O(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
            r10 = r6.getValueReference();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
            if (r12.f39621b.f39566h.equivalent(r15, r9) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
            r13 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
            if (r9 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
            if (r10.isActive() == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
            r13 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
            r12.f39624f++;
            r0.set(r1, m69874U(r5, r6, r7, r14, r9, r10, r13));
            r12.f39622c--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
            if (r13 != com.google.common.cache.RemovalCause.EXPLICIT) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
            return r2;
         */
        /* renamed from: P */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean m69879P(java.lang.Object r13, int r14, java.lang.Object r15) {
            /*
                r12 = this;
                r12.lock()
                com.google.common.cache.LocalCache<K, V> r0 = r12.f39621b     // Catch: java.lang.Throwable -> L84
                com.google.common.base.Ticker r0 = r0.f39576r     // Catch: java.lang.Throwable -> L84
                long r0 = r0.read()     // Catch: java.lang.Throwable -> L84
                r12.m69888G(r0)     // Catch: java.lang.Throwable -> L84
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r0 = r12.f39626h     // Catch: java.lang.Throwable -> L84
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L84
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L84
                r5 = r3
                com.google.common.cache.ReferenceEntry r5 = (com.google.common.cache.ReferenceEntry) r5     // Catch: java.lang.Throwable -> L84
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L78
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L84
                int r4 = r6.getHash()     // Catch: java.lang.Throwable -> L84
                if (r4 != r14) goto L7f
                if (r7 == 0) goto L7f
                com.google.common.cache.LocalCache<K, V> r4 = r12.f39621b     // Catch: java.lang.Throwable -> L84
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.f39565g     // Catch: java.lang.Throwable -> L84
                boolean r4 = r4.equivalent(r13, r7)     // Catch: java.lang.Throwable -> L84
                if (r4 == 0) goto L7f
                com.google.common.cache.LocalCache$ValueReference r10 = r6.getValueReference()     // Catch: java.lang.Throwable -> L84
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L84
                com.google.common.cache.LocalCache<K, V> r13 = r12.f39621b     // Catch: java.lang.Throwable -> L84
                com.google.common.base.Equivalence<java.lang.Object> r13 = r13.f39566h     // Catch: java.lang.Throwable -> L84
                boolean r13 = r13.equivalent(r15, r9)     // Catch: java.lang.Throwable -> L84
                if (r13 == 0) goto L4d
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L84
                goto L57
            L4d:
                if (r9 != 0) goto L78
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L84
                if (r13 == 0) goto L78
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L84
            L57:
                int r15 = r12.f39624f     // Catch: java.lang.Throwable -> L84
                int r15 = r15 + r2
                r12.f39624f = r15     // Catch: java.lang.Throwable -> L84
                r4 = r12
                r8 = r14
                r11 = r13
                com.google.common.cache.ReferenceEntry r14 = r4.m69874U(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L84
                int r15 = r12.f39622c     // Catch: java.lang.Throwable -> L84
                int r15 = r15 - r2
                r0.set(r1, r14)     // Catch: java.lang.Throwable -> L84
                r12.f39622c = r15     // Catch: java.lang.Throwable -> L84
                com.google.common.cache.RemovalCause r14 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L84
                if (r13 != r14) goto L70
                goto L71
            L70:
                r2 = r3
            L71:
                r12.unlock()
                r12.m69889F()
                return r2
            L78:
                r12.unlock()
                r12.m69889F()
                return r3
            L7f:
                com.google.common.cache.ReferenceEntry r6 = r6.getNext()     // Catch: java.lang.Throwable -> L84
                goto L1f
            L84:
                r13 = move-exception
                r12.unlock()
                r12.m69889F()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.m69879P(java.lang.Object, int, java.lang.Object):boolean");
        }

        @GuardedBy("this")
        /* renamed from: Q */
        void m69878Q(ReferenceEntry<K, V> referenceEntry) {
            m69852l(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.f39632n.remove(referenceEntry);
            this.f39633o.remove(referenceEntry);
        }

        @VisibleForTesting
        @GuardedBy("this")
        /* renamed from: R */
        boolean m69877R(ReferenceEntry<K, V> referenceEntry, int i, RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
            int length = (atomicReferenceArray.length() - 1) & i;
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                if (referenceEntry3 == referenceEntry) {
                    this.f39624f++;
                    atomicReferenceArray.set(length, m69874U(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), removalCause));
                    this.f39622c--;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("this")
        /* renamed from: S */
        ReferenceEntry<K, V> m69876S(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i = this.f39622c;
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> m69857g = m69857g(referenceEntry, next);
                if (m69857g != null) {
                    next = m69857g;
                } else {
                    m69878Q(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.f39622c = i;
            return next;
        }

        /* renamed from: T */
        boolean m69875T(K k, int i, LoadingValueReference<K, V> loadingValueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null && this.f39621b.f39565g.equivalent(k, key)) {
                        if (referenceEntry2.getValueReference() == loadingValueReference) {
                            if (loadingValueReference.isActive()) {
                                referenceEntry2.setValueReference(loadingValueReference.getOldValue());
                            } else {
                                atomicReferenceArray.set(length, m69876S(referenceEntry, referenceEntry2));
                            }
                            return true;
                        }
                    } else {
                        referenceEntry2 = referenceEntry2.getNext();
                    }
                }
                return false;
            } finally {
                unlock();
                m69889F();
            }
        }

        @GuardedBy("this")
        /* renamed from: U */
        ReferenceEntry<K, V> m69874U(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k, int i, V v, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            m69852l(k, i, v, valueReference.getWeight(), removalCause);
            this.f39632n.remove(referenceEntry2);
            this.f39633o.remove(referenceEntry2);
            if (valueReference.isLoading()) {
                valueReference.notifyNewValue(null);
                return referenceEntry;
            }
            return m69876S(referenceEntry, referenceEntry2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
            return null;
         */
        /* renamed from: V */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        V m69873V(K r18, int r19, V r20) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r9.f39621b     // Catch: java.lang.Throwable -> La7
                com.google.common.base.Ticker r1 = r1.f39576r     // Catch: java.lang.Throwable -> La7
                long r7 = r1.read()     // Catch: java.lang.Throwable -> La7
                r9.m69888G(r7)     // Catch: java.lang.Throwable -> La7
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.f39626h     // Catch: java.lang.Throwable -> La7
                int r1 = r10.length()     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + (-1)
                r11 = r0 & r1
                java.lang.Object r1 = r10.get(r11)     // Catch: java.lang.Throwable -> La7
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> La7
                r12 = r2
            L24:
                r13 = 0
                if (r12 == 0) goto L6c
                java.lang.Object r4 = r12.getKey()     // Catch: java.lang.Throwable -> La7
                int r1 = r12.getHash()     // Catch: java.lang.Throwable -> La7
                if (r1 != r0) goto L9f
                if (r4 == 0) goto L9f
                com.google.common.cache.LocalCache<K, V> r1 = r9.f39621b     // Catch: java.lang.Throwable -> La7
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f39565g     // Catch: java.lang.Throwable -> La7
                r14 = r18
                boolean r1 = r1.equivalent(r14, r4)     // Catch: java.lang.Throwable -> La7
                if (r1 == 0) goto La1
                com.google.common.cache.LocalCache$ValueReference r15 = r12.getValueReference()     // Catch: java.lang.Throwable -> La7
                java.lang.Object r16 = r15.get()     // Catch: java.lang.Throwable -> La7
                if (r16 != 0) goto L73
                boolean r1 = r15.isActive()     // Catch: java.lang.Throwable -> La7
                if (r1 == 0) goto L6c
                int r1 = r9.f39624f     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + 1
                r9.f39624f = r1     // Catch: java.lang.Throwable -> La7
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> La7
                r1 = r17
                r3 = r12
                r5 = r19
                r6 = r16
                r7 = r15
                com.google.common.cache.ReferenceEntry r0 = r1.m69874U(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La7
                int r1 = r9.f39622c     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + (-1)
                r10.set(r11, r0)     // Catch: java.lang.Throwable -> La7
                r9.f39622c = r1     // Catch: java.lang.Throwable -> La7
            L6c:
                r17.unlock()
                r17.m69889F()
                return r13
            L73:
                int r1 = r9.f39624f     // Catch: java.lang.Throwable -> La7
                int r1 = r1 + 1
                r9.f39624f = r1     // Catch: java.lang.Throwable -> La7
                int r5 = r15.getWeight()     // Catch: java.lang.Throwable -> La7
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> La7
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r16
                r1.m69852l(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La7
                r1 = r17
                r2 = r12
                r3 = r18
                r4 = r20
                r5 = r7
                r1.m69867a0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
                r9.m69851m(r12)     // Catch: java.lang.Throwable -> La7
                r17.unlock()
                r17.m69889F()
                return r16
            L9f:
                r14 = r18
            La1:
                com.google.common.cache.ReferenceEntry r12 = r12.getNext()     // Catch: java.lang.Throwable -> La7
                goto L24
            La7:
                r0 = move-exception
                r17.unlock()
                r17.m69889F()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.m69873V(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
            return false;
         */
        /* renamed from: W */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        boolean m69872W(K r18, int r19, V r20, V r21) {
            /*
                r17 = this;
                r9 = r17
                r0 = r19
                r17.lock()
                com.google.common.cache.LocalCache<K, V> r1 = r9.f39621b     // Catch: java.lang.Throwable -> Lb5
                com.google.common.base.Ticker r1 = r1.f39576r     // Catch: java.lang.Throwable -> Lb5
                long r7 = r1.read()     // Catch: java.lang.Throwable -> Lb5
                r9.m69888G(r7)     // Catch: java.lang.Throwable -> Lb5
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r10 = r9.f39626h     // Catch: java.lang.Throwable -> Lb5
                int r1 = r10.length()     // Catch: java.lang.Throwable -> Lb5
                r11 = 1
                int r1 = r1 - r11
                r12 = r0 & r1
                java.lang.Object r1 = r10.get(r12)     // Catch: java.lang.Throwable -> Lb5
                r2 = r1
                com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2     // Catch: java.lang.Throwable -> Lb5
                r13 = r2
            L24:
                r14 = 0
                if (r13 == 0) goto L69
                java.lang.Object r4 = r13.getKey()     // Catch: java.lang.Throwable -> Lb5
                int r1 = r13.getHash()     // Catch: java.lang.Throwable -> Lb5
                if (r1 != r0) goto Lab
                if (r4 == 0) goto Lab
                com.google.common.cache.LocalCache<K, V> r1 = r9.f39621b     // Catch: java.lang.Throwable -> Lb5
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f39565g     // Catch: java.lang.Throwable -> Lb5
                r15 = r18
                boolean r1 = r1.equivalent(r15, r4)     // Catch: java.lang.Throwable -> Lb5
                if (r1 == 0) goto Lad
                com.google.common.cache.LocalCache$ValueReference r16 = r13.getValueReference()     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r6 = r16.get()     // Catch: java.lang.Throwable -> Lb5
                if (r6 != 0) goto L70
                boolean r1 = r16.isActive()     // Catch: java.lang.Throwable -> Lb5
                if (r1 == 0) goto L69
                int r1 = r9.f39624f     // Catch: java.lang.Throwable -> Lb5
                int r1 = r1 + r11
                r9.f39624f = r1     // Catch: java.lang.Throwable -> Lb5
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> Lb5
                r1 = r17
                r3 = r13
                r5 = r19
                r7 = r16
                com.google.common.cache.ReferenceEntry r0 = r1.m69874U(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb5
                int r1 = r9.f39622c     // Catch: java.lang.Throwable -> Lb5
                int r1 = r1 - r11
                r10.set(r12, r0)     // Catch: java.lang.Throwable -> Lb5
                r9.f39622c = r1     // Catch: java.lang.Throwable -> Lb5
            L69:
                r17.unlock()
                r17.m69889F()
                return r14
            L70:
                com.google.common.cache.LocalCache<K, V> r1 = r9.f39621b     // Catch: java.lang.Throwable -> Lb5
                com.google.common.base.Equivalence<java.lang.Object> r1 = r1.f39566h     // Catch: java.lang.Throwable -> Lb5
                r3 = r20
                boolean r1 = r1.equivalent(r3, r6)     // Catch: java.lang.Throwable -> Lb5
                if (r1 == 0) goto La7
                int r1 = r9.f39624f     // Catch: java.lang.Throwable -> Lb5
                int r1 = r1 + r11
                r9.f39624f = r1     // Catch: java.lang.Throwable -> Lb5
                int r5 = r16.getWeight()     // Catch: java.lang.Throwable -> Lb5
                com.google.common.cache.RemovalCause r10 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> Lb5
                r1 = r17
                r2 = r18
                r3 = r19
                r4 = r6
                r6 = r10
                r1.m69852l(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb5
                r1 = r17
                r2 = r13
                r3 = r18
                r4 = r21
                r5 = r7
                r1.m69867a0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb5
                r9.m69851m(r13)     // Catch: java.lang.Throwable -> Lb5
                r17.unlock()
                r17.m69889F()
                return r11
            La7:
                r9.m69884K(r13, r7)     // Catch: java.lang.Throwable -> Lb5
                goto L69
            Lab:
                r15 = r18
            Lad:
                r3 = r20
                com.google.common.cache.ReferenceEntry r13 = r13.getNext()     // Catch: java.lang.Throwable -> Lb5
                goto L24
            Lb5:
                r0 = move-exception
                r17.unlock()
                r17.m69889F()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.m69872W(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* renamed from: X */
        void m69871X(long j) {
            if (tryLock()) {
                try {
                    m69854j();
                    m69849o(j);
                    this.f39631m.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: Y */
        void m69870Y() {
            if (!isHeldByCurrentThread()) {
                this.f39621b.m69911z();
            }
        }

        /* renamed from: Z */
        V m69869Z(ReferenceEntry<K, V> referenceEntry, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            V m69881N;
            if (this.f39621b.m69945G() && j - referenceEntry.getWriteTime() > this.f39621b.f39573o && !referenceEntry.getValueReference().isLoading() && (m69881N = m69881N(k, i, cacheLoader, true)) != null) {
                return m69881N;
            }
            return v;
        }

        /* renamed from: a */
        void m69868a() {
            m69871X(this.f39621b.f39576r.read());
            m69870Y();
        }

        @GuardedBy("this")
        /* renamed from: a0 */
        void m69867a0(ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
            boolean z;
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            int weigh = this.f39621b.f39570l.weigh(k, v);
            if (weigh >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Weights must be non-negative");
            referenceEntry.setValueReference(this.f39621b.f39568j.mo69835d(this, referenceEntry, v, weigh));
            m69882M(referenceEntry, weigh, j);
            valueReference.notifyNewValue(v);
        }

        /* renamed from: b */
        void m69866b() {
            RemovalCause removalCause;
            if (this.f39622c != 0) {
                lock();
                try {
                    m69888G(this.f39621b.f39576r.read());
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                            if (referenceEntry.getValueReference().isActive()) {
                                K key = referenceEntry.getKey();
                                V v = referenceEntry.getValueReference().get();
                                if (key != null && v != null) {
                                    removalCause = RemovalCause.EXPLICIT;
                                    m69852l(key, referenceEntry.getHash(), v, referenceEntry.getValueReference().getWeight(), removalCause);
                                }
                                removalCause = RemovalCause.COLLECTED;
                                m69852l(key, referenceEntry.getHash(), v, referenceEntry.getValueReference().getWeight(), removalCause);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    m69862d();
                    this.f39632n.clear();
                    this.f39633o.clear();
                    this.f39631m.set(0);
                    this.f39624f++;
                    this.f39622c = 0;
                } finally {
                    unlock();
                    m69889F();
                }
            }
        }

        /* renamed from: b0 */
        boolean m69865b0(K k, int i, LoadingValueReference<K, V> loadingValueReference, V v) {
            RemovalCause removalCause;
            lock();
            try {
                long read = this.f39621b.f39576r.read();
                m69888G(read);
                int i2 = this.f39622c + 1;
                if (i2 > this.f39625g) {
                    m69850n();
                    i2 = this.f39622c + 1;
                }
                int i3 = i2;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 != null) {
                        K key = referenceEntry2.getKey();
                        if (referenceEntry2.getHash() == i && key != null && this.f39621b.f39565g.equivalent(k, key)) {
                            ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                            V v2 = valueReference.get();
                            if (loadingValueReference != valueReference && (v2 != null || valueReference == LocalCache.f39560z)) {
                                m69852l(k, i, v, 0, RemovalCause.REPLACED);
                                unlock();
                                m69889F();
                                return false;
                            }
                            this.f39624f++;
                            if (loadingValueReference.isActive()) {
                                if (v2 == null) {
                                    removalCause = RemovalCause.COLLECTED;
                                } else {
                                    removalCause = RemovalCause.REPLACED;
                                }
                                m69852l(k, i, v2, loadingValueReference.getWeight(), removalCause);
                                i3--;
                            }
                            m69867a0(referenceEntry2, k, v, read);
                            this.f39622c = i3;
                            m69851m(referenceEntry2);
                        } else {
                            referenceEntry2 = referenceEntry2.getNext();
                        }
                    } else {
                        this.f39624f++;
                        ReferenceEntry<K, V> m69892C = m69892C(k, i, referenceEntry);
                        m69867a0(m69892C, k, v, read);
                        atomicReferenceArray.set(length, m69892C);
                        this.f39622c = i3;
                        m69851m(m69892C);
                        break;
                    }
                }
                return true;
            } finally {
                unlock();
                m69889F();
            }
        }

        /* renamed from: c */
        void m69864c() {
            do {
            } while (this.f39628j.poll() != null);
        }

        /* renamed from: c0 */
        void m69863c0() {
            if (tryLock()) {
                try {
                    m69854j();
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: d */
        void m69862d() {
            if (this.f39621b.m69938N()) {
                m69864c();
            }
            if (this.f39621b.m69937O()) {
                m69860e();
            }
        }

        /* renamed from: d0 */
        void m69861d0(long j) {
            if (tryLock()) {
                try {
                    m69849o(j);
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: e */
        void m69860e() {
            do {
            } while (this.f39629k.poll() != null);
        }

        /* renamed from: e0 */
        V m69859e0(ReferenceEntry<K, V> referenceEntry, K k, ValueReference<K, V> valueReference) throws ExecutionException {
            if (valueReference.isLoading()) {
                Preconditions.checkState(!Thread.holdsLock(referenceEntry), "Recursive load of: %s", k);
                try {
                    V waitForValue = valueReference.waitForValue();
                    if (waitForValue != null) {
                        m69883L(referenceEntry, this.f39621b.f39576r.read());
                        return waitForValue;
                    }
                    String valueOf = String.valueOf(k);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
                    sb2.append("CacheLoader returned null for key ");
                    sb2.append(valueOf);
                    sb2.append(".");
                    throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                } finally {
                    this.f39634p.recordMisses(1);
                }
            }
            throw new AssertionError();
        }

        /* renamed from: f */
        boolean m69858f(Object obj, int i) {
            try {
                boolean z = false;
                if (this.f39622c == 0) {
                    return false;
                }
                ReferenceEntry<K, V> m69843u = m69843u(obj, i, this.f39621b.f39576r.read());
                if (m69843u == null) {
                    return false;
                }
                if (m69843u.getValueReference().get() != null) {
                    z = true;
                }
                return z;
            } finally {
                m69890E();
            }
        }

        @GuardedBy("this")
        /* renamed from: g */
        ReferenceEntry<K, V> m69857g(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            if (referenceEntry.getKey() == null) {
                return null;
            }
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            V v = valueReference.get();
            if (v == null && valueReference.isActive()) {
                return null;
            }
            ReferenceEntry<K, V> mo69905d = this.f39621b.f39577s.mo69905d(this, referenceEntry, referenceEntry2);
            mo69905d.setValueReference(valueReference.copyFor(this.f39629k, v, mo69905d));
            return mo69905d;
        }

        @GuardedBy("this")
        /* renamed from: h */
        void m69856h() {
            int i = 0;
            do {
                Reference<? extends K> poll = this.f39628j.poll();
                if (poll != null) {
                    this.f39621b.m69951A((ReferenceEntry) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        /* renamed from: i */
        void m69855i() {
            while (true) {
                ReferenceEntry<K, V> poll = this.f39630l.poll();
                if (poll != null) {
                    if (this.f39633o.contains(poll)) {
                        this.f39633o.add(poll);
                    }
                } else {
                    return;
                }
            }
        }

        @GuardedBy("this")
        /* renamed from: j */
        void m69854j() {
            if (this.f39621b.m69938N()) {
                m69856h();
            }
            if (this.f39621b.m69937O()) {
                m69853k();
            }
        }

        @GuardedBy("this")
        /* renamed from: k */
        void m69853k() {
            int i = 0;
            do {
                Reference<? extends V> poll = this.f39629k.poll();
                if (poll != null) {
                    this.f39621b.m69950B((ValueReference) poll);
                    i++;
                } else {
                    return;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        /* renamed from: l */
        void m69852l(K k, int i, V v, int i2, RemovalCause removalCause) {
            this.f39623d -= i2;
            if (removalCause.mo69832c()) {
                this.f39634p.recordEviction();
            }
            if (this.f39621b.f39574p != LocalCache.f39558A) {
                this.f39621b.f39574p.offer(RemovalNotification.create(k, v, removalCause));
            }
        }

        @GuardedBy("this")
        /* renamed from: m */
        void m69851m(ReferenceEntry<K, V> referenceEntry) {
            if (!this.f39621b.m69928h()) {
                return;
            }
            m69855i();
            if (referenceEntry.getValueReference().getWeight() > this.f39627i && !m69877R(referenceEntry, referenceEntry.getHash(), RemovalCause.SIZE)) {
                throw new AssertionError();
            }
            while (this.f39623d > this.f39627i) {
                ReferenceEntry<K, V> m69841w = m69841w();
                if (!m69877R(m69841w, m69841w.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
            }
        }

        @GuardedBy("this")
        /* renamed from: n */
        void m69850n() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f39622c;
            AtomicReferenceArray<ReferenceEntry<K, V>> m69891D = m69891D(length << 1);
            this.f39625g = (m69891D.length() * 3) / 4;
            int length2 = m69891D.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i2);
                if (referenceEntry != null) {
                    ReferenceEntry<K, V> next = referenceEntry.getNext();
                    int hash = referenceEntry.getHash() & length2;
                    if (next == null) {
                        m69891D.set(hash, referenceEntry);
                    } else {
                        ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                        while (next != null) {
                            int hash2 = next.getHash() & length2;
                            if (hash2 != hash) {
                                referenceEntry2 = next;
                                hash = hash2;
                            }
                            next = next.getNext();
                        }
                        m69891D.set(hash, referenceEntry2);
                        while (referenceEntry != referenceEntry2) {
                            int hash3 = referenceEntry.getHash() & length2;
                            ReferenceEntry<K, V> m69857g = m69857g(referenceEntry, m69891D.get(hash3));
                            if (m69857g != null) {
                                m69891D.set(hash3, m69857g);
                            } else {
                                m69878Q(referenceEntry);
                                i--;
                            }
                            referenceEntry = referenceEntry.getNext();
                        }
                    }
                }
            }
            this.f39626h = m69891D;
            this.f39622c = i;
        }

        @GuardedBy("this")
        /* renamed from: o */
        void m69849o(long j) {
            ReferenceEntry<K, V> peek;
            ReferenceEntry<K, V> peek2;
            m69855i();
            do {
                peek = this.f39632n.peek();
                if (peek == null || !this.f39621b.m69918s(peek, j)) {
                    do {
                        peek2 = this.f39633o.peek();
                        if (peek2 == null || !this.f39621b.m69918s(peek2, j)) {
                            return;
                        }
                    } while (m69877R(peek2, peek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (m69877R(peek, peek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        /* renamed from: p */
        V m69848p(Object obj, int i) {
            try {
                if (this.f39622c != 0) {
                    long read = this.f39621b.f39576r.read();
                    ReferenceEntry<K, V> m69843u = m69843u(obj, i, read);
                    if (m69843u == null) {
                        return null;
                    }
                    V v = m69843u.getValueReference().get();
                    if (v != null) {
                        m69883L(m69843u, read);
                        return m69869Z(m69843u, m69843u.getKey(), i, v, read, this.f39621b.f39579u);
                    }
                    m69863c0();
                }
                return null;
            } finally {
                m69890E();
            }
        }

        /* renamed from: q */
        V m69847q(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            ReferenceEntry<K, V> m69845s;
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    if (this.f39622c != 0 && (m69845s = m69845s(k, i)) != null) {
                        long read = this.f39621b.f39576r.read();
                        V m69842v = m69842v(m69845s, read);
                        if (m69842v != null) {
                            m69883L(m69845s, read);
                            this.f39634p.recordHits(1);
                            return m69869Z(m69845s, k, i, m69842v, read, cacheLoader);
                        }
                        ValueReference<K, V> valueReference = m69845s.getValueReference();
                        if (valueReference.isLoading()) {
                            return m69859e0(m69845s, k, valueReference);
                        }
                    }
                    return m69893B(k, i, cacheLoader);
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (!(cause instanceof Error)) {
                        if (cause instanceof RuntimeException) {
                            throw new UncheckedExecutionException(cause);
                        }
                        throw e;
                    }
                    throw new ExecutionError((Error) cause);
                }
            } finally {
                m69890E();
            }
        }

        /* renamed from: r */
        V m69846r(K k, int i, LoadingValueReference<K, V> loadingValueReference, ListenableFuture<V> listenableFuture) throws ExecutionException {
            V v;
            try {
                v = (V) Uninterruptibles.getUninterruptibly(listenableFuture);
            } catch (Throwable th) {
                th = th;
                v = null;
            }
            try {
                if (v != null) {
                    this.f39634p.recordLoadSuccess(loadingValueReference.elapsedNanos());
                    m69865b0(k, i, loadingValueReference, v);
                    return v;
                }
                String valueOf = String.valueOf(k);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 35);
                sb2.append("CacheLoader returned null for key ");
                sb2.append(valueOf);
                sb2.append(".");
                throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
            } catch (Throwable th2) {
                th = th2;
                if (v == null) {
                    this.f39634p.recordLoadException(loadingValueReference.elapsedNanos());
                    m69875T(k, i, loadingValueReference);
                }
                throw th;
            }
        }

        /* renamed from: s */
        ReferenceEntry<K, V> m69845s(Object obj, int i) {
            for (ReferenceEntry<K, V> m69844t = m69844t(i); m69844t != null; m69844t = m69844t.getNext()) {
                if (m69844t.getHash() == i) {
                    K key = m69844t.getKey();
                    if (key == null) {
                        m69863c0();
                    } else if (this.f39621b.f39565g.equivalent(obj, key)) {
                        return m69844t;
                    }
                }
            }
            return null;
        }

        /* renamed from: t */
        ReferenceEntry<K, V> m69844t(int i) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* renamed from: u */
        ReferenceEntry<K, V> m69843u(Object obj, int i, long j) {
            ReferenceEntry<K, V> m69845s = m69845s(obj, i);
            if (m69845s == null) {
                return null;
            }
            if (this.f39621b.m69918s(m69845s, j)) {
                m69861d0(j);
                return null;
            }
            return m69845s;
        }

        /* renamed from: v */
        V m69842v(ReferenceEntry<K, V> referenceEntry, long j) {
            if (referenceEntry.getKey() == null) {
                m69863c0();
                return null;
            }
            V v = referenceEntry.getValueReference().get();
            if (v == null) {
                m69863c0();
                return null;
            } else if (this.f39621b.m69918s(referenceEntry, j)) {
                m69861d0(j);
                return null;
            } else {
                return v;
            }
        }

        @GuardedBy("this")
        /* renamed from: w */
        ReferenceEntry<K, V> m69841w() {
            for (ReferenceEntry<K, V> referenceEntry : this.f39633o) {
                if (referenceEntry.getValueReference().getWeight() > 0) {
                    return referenceEntry;
                }
            }
            throw new AssertionError();
        }

        /* renamed from: x */
        void m69840x(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
            this.f39625g = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f39621b.m69930f()) {
                int i = this.f39625g;
                if (i == this.f39627i) {
                    this.f39625g = i + 1;
                }
            }
            this.f39626h = atomicReferenceArray;
        }

        /* renamed from: y */
        LoadingValueReference<K, V> m69839y(K k, int i, boolean z) {
            lock();
            try {
                long read = this.f39621b.f39576r.read();
                m69888G(read);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f39626h;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> referenceEntry2 = referenceEntry; referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() == i && key != null && this.f39621b.f39565g.equivalent(k, key)) {
                        ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                        if (!valueReference.isLoading() && (!z || read - referenceEntry2.getWriteTime() >= this.f39621b.f39573o)) {
                            this.f39624f++;
                            LoadingValueReference<K, V> loadingValueReference = new LoadingValueReference<>(valueReference);
                            referenceEntry2.setValueReference(loadingValueReference);
                            return loadingValueReference;
                        }
                        unlock();
                        m69889F();
                        return null;
                    }
                }
                this.f39624f++;
                LoadingValueReference<K, V> loadingValueReference2 = new LoadingValueReference<>();
                ReferenceEntry<K, V> m69892C = m69892C(k, i, referenceEntry);
                m69892C.setValueReference(loadingValueReference2);
                atomicReferenceArray.set(length, m69892C);
                return loadingValueReference2;
            } finally {
                unlock();
                m69889F();
            }
        }

        /* renamed from: z */
        ListenableFuture<V> m69838z(final K k, final int i, final LoadingValueReference<K, V> loadingValueReference, CacheLoader<? super K, V> cacheLoader) {
            final ListenableFuture<V> loadFuture = loadingValueReference.loadFuture(k, cacheLoader);
            loadFuture.addListener(new Runnable() { // from class: com.google.common.cache.LocalCache.Segment.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Segment.this.m69846r(k, i, loadingValueReference, loadFuture);
                    } catch (Throwable th) {
                        LocalCache.f39559y.log(Level.WARNING, "Exception thrown during refresh", th);
                        loadingValueReference.setException(th);
                    }
                }
            }, MoreExecutors.directExecutor());
            return loadFuture;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: c */
            Equivalence<Object> mo69836c() {
                return Equivalence.equals();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: d */
            <K, V> ValueReference<K, V> mo69835d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new StrongValueReference(v);
                }
                return new WeightedStrongValueReference(v, i);
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: c */
            Equivalence<Object> mo69836c() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: d */
            <K, V> ValueReference<K, V> mo69835d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new SoftValueReference(segment.f39629k, v, referenceEntry);
                }
                return new WeightedSoftValueReference(segment.f39629k, v, referenceEntry, i);
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: c */
            Equivalence<Object> mo69836c() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.LocalCache.Strength
            /* renamed from: d */
            <K, V> ValueReference<K, V> mo69835d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new WeakValueReference(segment.f39629k, v, referenceEntry);
                }
                return new WeightedWeakValueReference(segment.f39629k, v, referenceEntry, i);
            }
        };

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Equivalence<Object> mo69836c();

        /* renamed from: d */
        abstract <K, V> ValueReference<K, V> mo69835d(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i);
    }

    /* loaded from: classes4.dex */
    static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: g */
        volatile long f39642g;
        @Weak

        /* renamed from: h */
        ReferenceEntry<K, V> f39643h;
        @Weak

        /* renamed from: i */
        ReferenceEntry<K, V> f39644i;

        StrongAccessEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.f39642g = Long.MAX_VALUE;
            this.f39643h = LocalCache.m69914w();
            this.f39644i = LocalCache.m69914w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f39642g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f39643h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f39644i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.f39642g = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39643h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39644i = referenceEntry;
        }
    }

    /* loaded from: classes4.dex */
    static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: g */
        volatile long f39645g;
        @Weak

        /* renamed from: h */
        ReferenceEntry<K, V> f39646h;
        @Weak

        /* renamed from: i */
        ReferenceEntry<K, V> f39647i;

        /* renamed from: j */
        volatile long f39648j;
        @Weak

        /* renamed from: k */
        ReferenceEntry<K, V> f39649k;
        @Weak

        /* renamed from: l */
        ReferenceEntry<K, V> f39650l;

        StrongAccessWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.f39645g = Long.MAX_VALUE;
            this.f39646h = LocalCache.m69914w();
            this.f39647i = LocalCache.m69914w();
            this.f39648j = Long.MAX_VALUE;
            this.f39649k = LocalCache.m69914w();
            this.f39650l = LocalCache.m69914w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f39645g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f39646h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f39649k;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f39647i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f39650l;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f39648j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.f39645g = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39646h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39649k = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39647i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39650l = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.f39648j = j;
        }
    }

    /* loaded from: classes4.dex */
    static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {

        /* renamed from: b */
        final K f39651b;

        /* renamed from: c */
        final int f39652c;

        /* renamed from: d */
        final ReferenceEntry<K, V> f39653d;

        /* renamed from: f */
        volatile ValueReference<K, V> f39654f = LocalCache.m69941K();

        StrongEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            this.f39651b = k;
            this.f39652c = i;
            this.f39653d = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.f39652c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.f39651b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.f39653d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.f39654f;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.f39654f = valueReference;
        }
    }

    /* loaded from: classes4.dex */
    static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {

        /* renamed from: g */
        volatile long f39656g;
        @Weak

        /* renamed from: h */
        ReferenceEntry<K, V> f39657h;
        @Weak

        /* renamed from: i */
        ReferenceEntry<K, V> f39658i;

        StrongWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.f39656g = Long.MAX_VALUE;
            this.f39657h = LocalCache.m69914w();
            this.f39658i = LocalCache.m69914w();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f39657h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f39658i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f39656g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39657h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39658i = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.f39656g = j;
        }
    }

    /* loaded from: classes4.dex */
    final class ValueIterator extends LocalCache<K, V>.HashIterator<V> {
        ValueIterator(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
            return m69901c().getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry);

        V get();

        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(V v);

        V waitForValue() throws ExecutionException;
    }

    /* loaded from: classes4.dex */
    final class Values extends AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.m69942J(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.m69942J(this).toArray(eArr);
        }
    }

    /* loaded from: classes4.dex */
    static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: f */
        volatile long f39660f;
        @Weak

        /* renamed from: g */
        ReferenceEntry<K, V> f39661g;
        @Weak

        /* renamed from: h */
        ReferenceEntry<K, V> f39662h;

        WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.f39660f = Long.MAX_VALUE;
            this.f39661g = LocalCache.m69914w();
            this.f39662h = LocalCache.m69914w();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f39660f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f39661g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f39662h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.f39660f = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39661g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39662h = referenceEntry;
        }
    }

    /* loaded from: classes4.dex */
    static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: f */
        volatile long f39663f;
        @Weak

        /* renamed from: g */
        ReferenceEntry<K, V> f39664g;
        @Weak

        /* renamed from: h */
        ReferenceEntry<K, V> f39665h;

        /* renamed from: i */
        volatile long f39666i;
        @Weak

        /* renamed from: j */
        ReferenceEntry<K, V> f39667j;
        @Weak

        /* renamed from: k */
        ReferenceEntry<K, V> f39668k;

        WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.f39663f = Long.MAX_VALUE;
            this.f39664g = LocalCache.m69914w();
            this.f39665h = LocalCache.m69914w();
            this.f39666i = Long.MAX_VALUE;
            this.f39667j = LocalCache.m69914w();
            this.f39668k = LocalCache.m69914w();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f39663f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f39664g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f39667j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f39665h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f39668k;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f39666i;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.f39663f = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39664g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39667j = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39665h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39668k = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.f39666i = j;
        }
    }

    /* loaded from: classes4.dex */
    static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {

        /* renamed from: b */
        final int f39669b;

        /* renamed from: c */
        final ReferenceEntry<K, V> f39670c;

        /* renamed from: d */
        volatile ValueReference<K, V> f39671d;

        WeakEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, referenceQueue);
            this.f39671d = LocalCache.m69941K();
            this.f39669b = i;
            this.f39670c = referenceEntry;
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.f39669b;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.f39670c;
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.f39671d;
        }

        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.f39671d = valueReference;
        }

        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes4.dex */
    static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {

        /* renamed from: f */
        volatile long f39673f;
        @Weak

        /* renamed from: g */
        ReferenceEntry<K, V> f39674g;
        @Weak

        /* renamed from: h */
        ReferenceEntry<K, V> f39675h;

        WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.f39673f = Long.MAX_VALUE;
            this.f39674g = LocalCache.m69914w();
            this.f39675h = LocalCache.m69914w();
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f39674g;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f39675h;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f39673f;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39674g = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f39675h = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.f39673f = j;
        }
    }

    /* loaded from: classes4.dex */
    static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {

        /* renamed from: c */
        final int f39676c;

        WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.f39676c = i;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v, referenceEntry, this.f39676c);
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f39676c;
        }
    }

    /* loaded from: classes4.dex */
    static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {

        /* renamed from: c */
        final int f39677c;

        WeightedStrongValueReference(V v, int i) {
            super(v);
            this.f39677c = i;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f39677c;
        }
    }

    /* loaded from: classes4.dex */
    static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {

        /* renamed from: c */
        final int f39678c;

        WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.f39678c = i;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v, referenceEntry, this.f39678c);
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f39678c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* renamed from: b */
        final ReferenceEntry<K, V> f39679b = new AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.WriteQueue.1
            @Weak

            /* renamed from: b */
            ReferenceEntry<K, V> f39680b = this;
            @Weak

            /* renamed from: c */
            ReferenceEntry<K, V> f39681c = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.f39680b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.f39681c;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f39680b = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f39681c = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j) {
            }
        };

        WriteQueue() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f39679b.getNextInWriteQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f39679b;
                if (nextInWriteQueue != referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.m69912y(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                } else {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f39679b;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (((ReferenceEntry) obj).getNextInWriteQueue() != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            if (this.f39679b.getNextInWriteQueue() == this.f39679b) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.WriteQueue.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                /* renamed from: b */
                public ReferenceEntry<K, V> mo68840a(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
                    if (nextInWriteQueue == WriteQueue.this.f39679b) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }

        @Override // java.util.Queue
        public /* bridge */ /* synthetic */ boolean offer(Object obj) {
            return offer((ReferenceEntry) ((ReferenceEntry) obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            LocalCache.m69932c(previousInWriteQueue, nextInWriteQueue);
            LocalCache.m69912y(referenceEntry);
            if (nextInWriteQueue != NullEntry.INSTANCE) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> nextInWriteQueue = this.f39679b.getNextInWriteQueue(); nextInWriteQueue != this.f39679b; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.m69932c(referenceEntry.getPreviousInWriteQueue(), referenceEntry.getNextInWriteQueue());
            LocalCache.m69932c(this.f39679b.getPreviousInWriteQueue(), referenceEntry);
            LocalCache.m69932c(referenceEntry, this.f39679b);
            return true;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f39679b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f39679b) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f39679b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f39679b) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class WriteThroughEntry implements Map.Entry<K, V> {

        /* renamed from: b */
        final K f39683b;

        /* renamed from: c */
        V f39684c;

        WriteThroughEntry(K k, V v) {
            this.f39683b = k;
            this.f39684c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f39683b.equals(entry.getKey()) || !this.f39684c.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f39683b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f39684c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f39683b.hashCode() ^ this.f39684c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) LocalCache.this.put(this.f39683b, v);
            this.f39684c = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(getKey());
            String valueOf2 = String.valueOf(getValue());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }
    }

    LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
        Queue<RemovalNotification<K, V>> concurrentLinkedQueue;
        this.f39564f = Math.min(cacheBuilder.m69980c(), 65536);
        Strength m69975h = cacheBuilder.m69975h();
        this.f39567i = m69975h;
        this.f39568j = cacheBuilder.m69968o();
        this.f39565g = cacheBuilder.m69976g();
        this.f39566h = cacheBuilder.m69969n();
        long m69974i = cacheBuilder.m69974i();
        this.f39569k = m69974i;
        this.f39570l = (Weigher<K, V>) cacheBuilder.m69967p();
        this.f39571m = cacheBuilder.m69979d();
        this.f39572n = cacheBuilder.m69978e();
        this.f39573o = cacheBuilder.m69973j();
        RemovalListener<K, V> removalListener = (RemovalListener<K, V>) cacheBuilder.m69972k();
        this.f39575q = removalListener;
        if (removalListener == CacheBuilder.NullListener.INSTANCE) {
            concurrentLinkedQueue = m69929g();
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        }
        this.f39574p = concurrentLinkedQueue;
        this.f39576r = cacheBuilder.m69970m(m69948D());
        this.f39577s = EntryFactory.m69906f(m69975h, m69940L(), m69936P());
        this.f39578t = cacheBuilder.m69971l().get();
        this.f39579u = cacheLoader;
        int min = Math.min(cacheBuilder.m69977f(), 1073741824);
        if (m69928h() && !m69930f()) {
            min = (int) Math.min(min, m69974i);
        }
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        while (i4 < this.f39564f && (!m69928h() || i4 * 20 <= this.f39569k)) {
            i3++;
            i4 <<= 1;
        }
        this.f39562c = 32 - i3;
        this.f39561b = i4 - 1;
        this.f39563d = m69915v(i4);
        int i5 = min / i4;
        while (i2 < (i5 * i4 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (m69928h()) {
            long j = this.f39569k;
            long j2 = i4;
            long j3 = (j / j2) + 1;
            long j4 = j % j2;
            while (true) {
                Segment<K, V>[] segmentArr = this.f39563d;
                if (i < segmentArr.length) {
                    if (i == j4) {
                        j3--;
                    }
                    segmentArr[i] = m69931d(i2, j3, cacheBuilder.m69971l().get());
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                Segment<K, V>[] segmentArr2 = this.f39563d;
                if (i < segmentArr2.length) {
                    segmentArr2[i] = m69931d(i2, -1L, cacheBuilder.m69971l().get());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: H */
    static int m69944H(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static <E> ArrayList<E> m69942J(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    /* renamed from: K */
    static <K, V> ValueReference<K, V> m69941K() {
        return (ValueReference<K, V>) f39560z;
    }

    /* renamed from: b */
    static <K, V> void m69933b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    /* renamed from: c */
    static <K, V> void m69932c(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    /* renamed from: g */
    static <E> Queue<E> m69929g() {
        return (Queue<E>) f39558A;
    }

    /* renamed from: w */
    static <K, V> ReferenceEntry<K, V> m69914w() {
        return NullEntry.INSTANCE;
    }

    /* renamed from: x */
    static <K, V> void m69913x(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> m69914w = m69914w();
        referenceEntry.setNextInAccessQueue(m69914w);
        referenceEntry.setPreviousInAccessQueue(m69914w);
    }

    /* renamed from: y */
    static <K, V> void m69912y(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> m69914w = m69914w();
        referenceEntry.setNextInWriteQueue(m69914w);
        referenceEntry.setPreviousInWriteQueue(m69914w);
    }

    /* renamed from: A */
    void m69951A(ReferenceEntry<K, V> referenceEntry) {
        int hash = referenceEntry.getHash();
        m69943I(hash).m69886I(referenceEntry, hash);
    }

    /* renamed from: B */
    void m69950B(ValueReference<K, V> valueReference) {
        ReferenceEntry<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        m69943I(hash).m69885J(entry.getKey(), hash, valueReference);
    }

    /* renamed from: C */
    boolean m69949C() {
        return m69927i();
    }

    /* renamed from: D */
    boolean m69948D() {
        if (!m69947E() && !m69949C()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    boolean m69947E() {
        if (!m69926j() && !m69945G()) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    void m69946F(K k) {
        int m69920q = m69920q(Preconditions.checkNotNull(k));
        m69943I(m69920q).m69881N(k, m69920q, this.f39579u, false);
    }

    /* renamed from: G */
    boolean m69945G() {
        if (this.f39573o > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    Segment<K, V> m69943I(int i) {
        return this.f39563d[(i >>> this.f39562c) & this.f39561b];
    }

    /* renamed from: L */
    boolean m69940L() {
        if (!m69939M() && !m69949C()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    boolean m69939M() {
        if (!m69927i() && !m69928h()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    boolean m69938N() {
        if (this.f39567i != Strength.STRONG) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    boolean m69937O() {
        if (this.f39568j != Strength.STRONG) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    boolean m69936P() {
        if (!m69935Q() && !m69947E()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    boolean m69935Q() {
        return m69926j();
    }

    public void cleanUp() {
        for (Segment<K, V> segment : this.f39563d) {
            segment.m69868a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V> segment : this.f39563d) {
            segment.m69866b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int m69920q = m69920q(obj);
        return m69943I(m69920q).m69858f(obj, m69920q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        long read = this.f39576r.read();
        Segment<K, V>[] segmentArr = this.f39563d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = segmentArr.length;
            long j2 = 0;
            for (int i2 = z; i2 < length; i2++) {
                Segment<K, V> segment = segmentArr[i2];
                int i3 = segment.f39622c;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.f39626h;
                for (int i4 = z; i4 < atomicReferenceArray.length(); i4++) {
                    ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i4);
                    while (referenceEntry != null) {
                        Segment<K, V>[] segmentArr2 = segmentArr;
                        V m69842v = segment.m69842v(referenceEntry, read);
                        long j3 = read;
                        if (m69842v != null && this.f39566h.equivalent(obj, m69842v)) {
                            return true;
                        }
                        referenceEntry = referenceEntry.getNext();
                        segmentArr = segmentArr2;
                        read = j3;
                    }
                }
                j2 += segment.f39624f;
                read = read;
                z = false;
            }
            long j4 = read;
            Segment<K, V>[] segmentArr3 = segmentArr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            segmentArr = segmentArr3;
            read = j4;
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    Segment<K, V> m69931d(int i, long j, AbstractCache.StatsCounter statsCounter) {
        return new Segment<>(this, i, j, statsCounter);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f39582x;
        if (set == null) {
            EntrySet entrySet = new EntrySet();
            this.f39582x = entrySet;
            return entrySet;
        }
        return set;
    }

    /* renamed from: f */
    boolean m69930f() {
        if (this.f39570l != CacheBuilder.OneWeigher.INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int m69920q = m69920q(obj);
        return m69943I(m69920q).m69848p(obj, m69920q);
    }

    public V getIfPresent(Object obj) {
        int m69920q = m69920q(Preconditions.checkNotNull(obj));
        V m69848p = m69943I(m69920q).m69848p(obj, m69920q);
        if (m69848p == null) {
            this.f39578t.recordMisses(1);
        } else {
            this.f39578t.recordHits(1);
        }
        return m69848p;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    /* renamed from: h */
    boolean m69928h() {
        if (this.f39569k >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    boolean m69927i() {
        if (this.f39571m > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.f39563d;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].f39622c != 0) {
                return false;
            }
            j += segmentArr[i].f39624f;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].f39622c != 0) {
                return false;
            }
            j -= segmentArr[i2].f39624f;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    boolean m69926j() {
        if (this.f39572n > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f39580v;
        if (set == null) {
            KeySet keySet = new KeySet();
            this.f39580v = keySet;
            return keySet;
        }
        return set;
    }

    /* renamed from: l */
    V m69925l(K k, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int m69920q = m69920q(Preconditions.checkNotNull(k));
        return m69943I(m69920q).m69847q(k, m69920q, cacheLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    ImmutableMap<K, V> m69924m(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap newLinkedHashMap = Maps.newLinkedHashMap();
        LinkedHashSet newLinkedHashSet = Sets.newLinkedHashSet();
        int i = 0;
        int i2 = 0;
        for (K k : iterable) {
            Object obj = get(k);
            if (!newLinkedHashMap.containsKey(k)) {
                newLinkedHashMap.put(k, obj);
                if (obj == null) {
                    i2++;
                    newLinkedHashSet.add(k);
                } else {
                    i++;
                }
            }
        }
        try {
            if (!newLinkedHashSet.isEmpty()) {
                try {
                    Map m69917t = m69917t(Collections.unmodifiableSet(newLinkedHashSet), this.f39579u);
                    for (Object obj2 : newLinkedHashSet) {
                        Object obj3 = m69917t.get(obj2);
                        if (obj3 != null) {
                            newLinkedHashMap.put(obj2, obj3);
                        } else {
                            String valueOf = String.valueOf(obj2);
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
                            sb2.append("loadAll failed to return a value for ");
                            sb2.append(valueOf);
                            throw new CacheLoader.InvalidCacheLoadException(sb2.toString());
                        }
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : newLinkedHashSet) {
                        i2--;
                        newLinkedHashMap.put(obj4, m69925l(obj4, this.f39579u));
                    }
                }
            }
            return ImmutableMap.copyOf((Map) newLinkedHashMap);
        } finally {
            this.f39578t.recordHits(i);
            this.f39578t.recordMisses(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    ImmutableMap<K, V> m69923n(Iterable<?> iterable) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i = 0;
        int i2 = 0;
        for (Object obj : iterable) {
            V v = get(obj);
            if (v == null) {
                i2++;
            } else {
                builder.put(obj, v);
                i++;
            }
        }
        this.f39578t.recordHits(i);
        this.f39578t.recordMisses(i2);
        return builder.buildKeepingLast();
    }

    /* renamed from: o */
    V m69922o(ReferenceEntry<K, V> referenceEntry, long j) {
        V v;
        if (referenceEntry.getKey() == null || (v = referenceEntry.getValueReference().get()) == null || m69918s(referenceEntry, j)) {
            return null;
        }
        return v;
    }

    /* renamed from: p */
    V m69921p(K k) throws ExecutionException {
        return m69925l(k, this.f39579u);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int m69920q = m69920q(k);
        return m69943I(m69920q).m69887H(k, m69920q, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int m69920q = m69920q(k);
        return m69943I(m69920q).m69887H(k, m69920q, v, true);
    }

    /* renamed from: q */
    int m69920q(Object obj) {
        return m69944H(this.f39565g.hash(obj));
    }

    /* renamed from: r */
    void m69919r(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int m69920q = m69920q(obj);
        return m69943I(m69920q).m69880O(obj, m69920q);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int m69920q = m69920q(k);
        return m69943I(m69920q).m69872W(k, m69920q, v, v2);
    }

    /* renamed from: s */
    boolean m69918s(ReferenceEntry<K, V> referenceEntry, long j) {
        Preconditions.checkNotNull(referenceEntry);
        if (m69927i() && j - referenceEntry.getAccessTime() >= this.f39571m) {
            return true;
        }
        if (m69926j() && j - referenceEntry.getWriteTime() >= this.f39572n) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.saturatedCast(m69916u());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.util.Map<K, V> m69917t(java.util.Set<? extends K> r7, com.google.common.cache.CacheLoader<? super K, V> r8) throws java.util.concurrent.ExecutionException {
        /*
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.base.Preconditions.checkNotNull(r7)
            com.google.common.base.Stopwatch r0 = com.google.common.base.Stopwatch.createStarted()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.loadAll(r7)     // Catch: java.lang.Throwable -> La2 java.lang.Error -> La5 java.lang.Exception -> Lac java.lang.RuntimeException -> Lb3 java.lang.InterruptedException -> Lba com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> Lc8
            if (r7 == 0) goto L76
            r0.stop()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = r1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.f39578t
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadSuccess(r0)
            return r7
        L4a:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.f39578t
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r0 = r8.length()
            int r0 = r0 + 42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            throw r7
        L76:
            com.google.common.cache.AbstractCache$StatsCounter r7 = r6.f39578t
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r7.recordLoadException(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r0 = r8.length()
            int r0 = r0 + 31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            throw r7
        La2:
            r7 = move-exception
            r1 = r2
            goto Lcb
        La5:
            r7 = move-exception
            com.google.common.util.concurrent.ExecutionError r8 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> La2
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La2
            throw r8     // Catch: java.lang.Throwable -> La2
        Lac:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> La2
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La2
            throw r8     // Catch: java.lang.Throwable -> La2
        Lb3:
            r7 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r8 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> La2
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La2
            throw r8     // Catch: java.lang.Throwable -> La2
        Lba:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La2
            r8.interrupt()     // Catch: java.lang.Throwable -> La2
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> La2
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La2
            throw r8     // Catch: java.lang.Throwable -> La2
        Lc8:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lca
        Lca:
            r7 = move-exception
        Lcb:
            if (r1 != 0) goto Ld8
            com.google.common.cache.AbstractCache$StatsCounter r8 = r6.f39578t
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.elapsed(r1)
            r8.recordLoadException(r0)
        Ld8:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.m69917t(java.util.Set, com.google.common.cache.CacheLoader):java.util.Map");
    }

    /* renamed from: u */
    long m69916u() {
        Segment<K, V>[] segmentArr;
        long j = 0;
        for (int i = 0; i < this.f39563d.length; i++) {
            j += Math.max(0, segmentArr[i].f39622c);
        }
        return j;
    }

    /* renamed from: v */
    final Segment<K, V>[] m69915v(int i) {
        return new Segment[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f39581w;
        if (collection == null) {
            Values values = new Values();
            this.f39581w = values;
            return values;
        }
        return collection;
    }

    /* renamed from: z */
    void m69911z() {
        while (true) {
            RemovalNotification<K, V> poll = this.f39574p.poll();
            if (poll != null) {
                try {
                    this.f39575q.onRemoval(poll);
                } catch (Throwable th) {
                    f39559y.log(Level.WARNING, "Exception thrown by removal listener", th);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int m69920q = m69920q(obj);
        return m69943I(m69920q).m69879P(obj, m69920q, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        int m69920q = m69920q(k);
        return m69943I(m69920q).m69873V(k, m69920q, v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
        }
    }

    /* loaded from: classes4.dex */
    static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {

        /* renamed from: b */
        final ReferenceEntry<K, V> f39640b;

        SoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f39640b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.f39640b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }
    }

    /* loaded from: classes4.dex */
    static class StrongValueReference<K, V> implements ValueReference<K, V> {

        /* renamed from: b */
        final V f39655b;

        StrongValueReference(V v) {
            this.f39655b = v;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.f39655b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }
    }

    /* loaded from: classes4.dex */
    static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {

        /* renamed from: b */
        final ReferenceEntry<K, V> f39672b;

        WeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f39672b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.f39672b;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }
    }
}

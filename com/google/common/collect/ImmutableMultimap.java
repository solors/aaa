package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableMultimap<K, V> extends BaseImmutableMultimap<K, V> implements Serializable {

    /* renamed from: h */
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> f40075h;

    /* renamed from: i */
    final transient int f40076i;

    /* loaded from: classes4.dex */
    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        @Weak

        /* renamed from: c */
        final ImmutableMultimap<K, V> f40087c;

        EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.f40087c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f40087c.containsEntry(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f40087c.m69373l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f40087c.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f40087c.mo68933f();
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    static class FieldSettersHolder {

        /* renamed from: a */
        static final Serialization.FieldSetter<ImmutableMultimap> f40088a = Serialization.m68800a(ImmutableMultimap.class, "map");

        /* renamed from: b */
        static final Serialization.FieldSetter<ImmutableMultimap> f40089b = Serialization.m68800a(ImmutableMultimap.class, "size");

        FieldSettersHolder() {
        }
    }

    /* loaded from: classes4.dex */
    public class Keys extends ImmutableMultiset<K> {
        Keys() {
            ImmutableMultimap.this = r1;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            ImmutableCollection<V> immutableCollection = ImmutableMultimap.this.f40075h.get(obj);
            if (immutableCollection == null) {
                return 0;
            }
            return immutableCollection.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        /* renamed from: i */
        Multiset.Entry<K> mo68822i(int i) {
            Map.Entry<K, ? extends ImmutableCollection<V>> entry = ImmutableMultimap.this.f40075h.entrySet().asList().get(i);
            return Multisets.immutableEntry(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return ImmutableMultimap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }
    }

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static final class KeysSerializedForm implements Serializable {

        /* renamed from: b */
        final ImmutableMultimap<?, ?> f40091b;

        KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.f40091b = immutableMultimap;
        }

        Object readResolve() {
            return this.f40091b.keys();
        }
    }

    /* loaded from: classes4.dex */
    public static final class Values<K, V> extends ImmutableCollection<V> {
        @Weak

        /* renamed from: c */
        private final transient ImmutableMultimap<K, V> f40092c;

        Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f40092c = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        /* renamed from: a */
        public int mo68773a(Object[] objArr, int i) {
            UnmodifiableIterator<? extends ImmutableCollection<V>> it = this.f40092c.f40075h.values().iterator();
            while (it.hasNext()) {
                i = it.next().mo68773a(objArr, i);
            }
            return i;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f40092c.containsValue(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f40092c.size();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<V> iterator() {
            return this.f40092c.mo69201g();
        }
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.f40075h = immutableMap;
        this.f40076i = i;
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) multimap;
            if (!immutableMultimap.m69373l()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf((Multimap) multimap);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m69371of() {
        return ImmutableListMultimap.m69407of();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: a */
    Map<K, Collection<V>> mo68668a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    Set<K> mo68936c() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.Multimap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.f40075h.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        if (obj != null && super.containsValue(obj)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public abstract ImmutableCollection<V> get(K k);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((ImmutableMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: h */
    public ImmutableCollection<Map.Entry<K, V>> mo68937b() {
        return new EntryCollection(this);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: i */
    public ImmutableMultiset<K> mo68935d() {
        return new Keys();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: j */
    public ImmutableCollection<V> mo68934e() {
        return new Values(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: k */
    public UnmodifiableIterator<Map.Entry<K, V>> mo68933f() {
        return new UnmodifiableIterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableMultimap.1

            /* renamed from: b */
            final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f40077b;

            /* renamed from: c */
            K f40078c = null;

            /* renamed from: d */
            Iterator<V> f40079d = Iterators.m69220f();

            {
                ImmutableMultimap.this = this;
                this.f40077b = this.f40075h.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (!this.f40079d.hasNext() && !this.f40077b.hasNext()) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                if (!this.f40079d.hasNext()) {
                    Map.Entry<K, ? extends ImmutableCollection<V>> next = this.f40077b.next();
                    this.f40078c = next.getKey();
                    this.f40079d = next.getValue().iterator();
                }
                K k = this.f40078c;
                Objects.requireNonNull(k);
                return Maps.immutableEntry(k, this.f40079d.next());
            }
        };
    }

    /* renamed from: l */
    public boolean m69373l() {
        return this.f40075h.mo68833i();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: m */
    public UnmodifiableIterator<V> mo69201g() {
        return new UnmodifiableIterator<V>() { // from class: com.google.common.collect.ImmutableMultimap.2

            /* renamed from: b */
            Iterator<? extends ImmutableCollection<V>> f40081b;

            /* renamed from: c */
            Iterator<V> f40082c = Iterators.m69220f();

            {
                ImmutableMultimap.this = this;
                this.f40081b = this.f40075h.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (!this.f40082c.hasNext() && !this.f40081b.hasNext()) {
                    return false;
                }
                return true;
            }

            @Override // java.util.Iterator
            public V next() {
                if (!this.f40082c.hasNext()) {
                    this.f40082c = this.f40081b.next().iterator();
                }
                return this.f40082c.next();
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((ImmutableMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f40076i;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @DoNotMock
    /* loaded from: classes4.dex */
    public static class Builder<K, V> {

        /* renamed from: a */
        final Map<K, Collection<V>> f40084a = Platform.m68855h();

        /* renamed from: b */
        Comparator<? super K> f40085b;

        /* renamed from: c */
        Comparator<? super V> f40086c;

        /* renamed from: a */
        Collection<V> mo69311a() {
            return new ArrayList();
        }

        public ImmutableMultimap<K, V> build() {
            Collection entrySet = this.f40084a.entrySet();
            Comparator<? super K> comparator = this.f40085b;
            if (comparator != null) {
                entrySet = Ordering.from(comparator).m68865a().immutableSortedCopy(entrySet);
            }
            return ImmutableListMultimap.m69409n(entrySet, this.f40086c);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            this.f40085b = (Comparator) Preconditions.checkNotNull(comparator);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            this.f40086c = (Comparator) Preconditions.checkNotNull(comparator);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            CollectPreconditions.m69728a(k, v);
            Collection<V> collection = this.f40084a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f40084a;
                Collection<V> mo69311a = mo69311a();
                map.put(k, mo69311a);
                collection = mo69311a;
            }
            collection.add(v);
            return this;
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                put(entry);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k, Iterable<? extends V> iterable) {
            if (k == null) {
                String valueOf = String.valueOf(Iterables.toString(iterable));
                throw new NullPointerException(valueOf.length() != 0 ? "null key in entry: null=".concat(valueOf) : new String("null key in entry: null="));
            }
            Collection<V> collection = this.f40084a.get(k);
            if (collection != null) {
                for (V v : iterable) {
                    CollectPreconditions.m69728a(k, v);
                    collection.add(v);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (it.hasNext()) {
                Collection<V> mo69311a = mo69311a();
                while (it.hasNext()) {
                    V next = it.next();
                    CollectPreconditions.m69728a(k, next);
                    mo69311a.add(next);
                }
                this.f40084a.put(k, mo69311a);
                return this;
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k, V... vArr) {
            return putAll((Builder<K, V>) k, Arrays.asList(vArr));
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll((Builder<K, V>) entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m69370of(K k, V v) {
        return ImmutableListMultimap.m69406of((Object) k, (Object) v);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableMap<K, Collection<V>> asMap() {
        return (ImmutableMap<K, ? extends ImmutableCollection<V>>) this.f40075h;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableSet<K> keySet() {
        return this.f40075h.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m69369of(K k, V v, K k2, V v2) {
        return ImmutableListMultimap.m69405of((Object) k, (Object) v, (Object) k2, (Object) v2);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m69368of(K k, V v, K k2, V v2, K k3, V v3) {
        return ImmutableListMultimap.m69404of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    @Beta
    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf((Iterable) iterable);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m69367of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ImmutableListMultimap.m69403of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m69366of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ImmutableListMultimap.m69402of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5);
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    /* renamed from: h */
    final Multimap<K, V> f39962h;

    /* renamed from: i */
    final Predicate<? super K> f39963i;

    /* loaded from: classes4.dex */
    static class AddRejectingList<K, V> extends ForwardingList<V> {
        @ParametricNullness

        /* renamed from: b */
        final K f39964b;

        AddRejectingList(@ParametricNullness K k) {
            this.f39964b = k;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness V v) {
            add(0, v);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public List<V> delegate() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int i, @ParametricNullness V v) {
            Preconditions.checkPositionIndex(i, 0);
            String valueOf = String.valueOf(this.f39964b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        @CanIgnoreReturnValue
        public boolean addAll(int i, Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            Preconditions.checkPositionIndex(i, 0);
            String valueOf = String.valueOf(this.f39964b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* loaded from: classes4.dex */
    static class AddRejectingSet<K, V> extends ForwardingSet<V> {
        @ParametricNullness

        /* renamed from: b */
        final K f39965b;

        AddRejectingSet(@ParametricNullness K k) {
            this.f39965b = k;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(@ParametricNullness V v) {
            String valueOf = String.valueOf(this.f39965b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Preconditions.checkNotNull(collection);
            String valueOf = String.valueOf(this.f39965b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
            sb2.append("Key does not satisfy predicate: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: j */
        public Set<V> delegate() {
            return Collections.emptySet();
        }
    }

    /* loaded from: classes4.dex */
    class Entries extends ForwardingCollection<Map.Entry<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public Entries() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: c */
        public Collection<Map.Entry<K, V>> delegate() {
            return Collections2.filter(FilteredKeyMultimap.this.f39962h.entries(), FilteredKeyMultimap.this.entryPredicate());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (FilteredKeyMultimap.this.f39962h.containsKey(entry.getKey()) && FilteredKeyMultimap.this.f39963i.apply((Object) entry.getKey())) {
                    return FilteredKeyMultimap.this.f39962h.remove(entry.getKey(), entry.getValue());
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FilteredKeyMultimap(Multimap<K, V> multimap, Predicate<? super K> predicate) {
        this.f39962h = (Multimap) Preconditions.checkNotNull(multimap);
        this.f39963i = (Predicate) Preconditions.checkNotNull(predicate);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: a */
    Map<K, Collection<V>> mo68668a() {
        return Maps.filterKeys(this.f39962h.asMap(), this.f39963i);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: b */
    Collection<Map.Entry<K, V>> mo68937b() {
        return new Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    Set<K> mo68936c() {
        return Sets.filter(this.f39962h.keySet(), this.f39963i);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        if (this.f39962h.containsKey(obj)) {
            return this.f39963i.apply(obj);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    Multiset<K> mo68935d() {
        return Multisets.filter(this.f39962h.keys(), this.f39963i);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    Collection<V> mo68934e() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Predicate<? super Map.Entry<K, V>> entryPredicate() {
        return Maps.m69022y(this.f39963i);
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: f */
    Iterator<Map.Entry<K, V>> mo68933f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k) {
        if (this.f39963i.apply(k)) {
            return this.f39962h.get(k);
        }
        if (this.f39962h instanceof SetMultimap) {
            return new AddRejectingSet(k);
        }
        return new AddRejectingList(k);
    }

    /* renamed from: h */
    Collection<V> m69527h() {
        if (this.f39962h instanceof SetMultimap) {
            return Collections.emptySet();
        }
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
        if (containsKey(obj)) {
            return this.f39962h.removeAll(obj);
        }
        return m69527h();
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        int i = 0;
        for (Collection<V> collection : asMap().values()) {
            i += collection.size();
        }
        return i;
    }

    public Multimap<K, V> unfiltered() {
        return this.f39962h;
    }
}

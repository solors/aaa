package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Map;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    @GwtIncompatible
    /* loaded from: classes4.dex */
    private static class EntrySetSerializedForm<K, V> implements Serializable {

        /* renamed from: b */
        final ImmutableMap<K, V> f40065b;

        EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.f40065b = immutableMap;
        }

        Object readResolve() {
            return this.f40065b.entrySet();
        }
    }

    /* loaded from: classes4.dex */
    static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {

        /* renamed from: d */
        private final transient ImmutableMap<K, V> f40066d;

        /* renamed from: f */
        private final transient ImmutableList<Map.Entry<K, V>> f40067f;

        @Override // com.google.common.collect.ImmutableCollection
        @GwtIncompatible("not used in GWT")
        /* renamed from: a */
        public int mo68773a(Object[] objArr, int i) {
            return this.f40067f.mo68773a(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableSet
        /* renamed from: j */
        public ImmutableList<Map.Entry<K, V>> mo68824j() {
            return this.f40067f;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        /* renamed from: m */
        ImmutableMap<K, V> mo69289m() {
            return this.f40066d;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.f40067f.iterator();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v = mo69289m().get(entry.getKey());
        if (v == null || !v.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return mo69289m().hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return mo69289m().mo68833i();
    }

    @Override // com.google.common.collect.ImmutableSet
    @GwtIncompatible
    /* renamed from: k */
    boolean mo68823k() {
        return mo69289m().mo69381h();
    }

    /* renamed from: m */
    abstract ImmutableMap<K, V> mo69289m();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return mo69289m().size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    Object writeReplace() {
        return new EntrySetSerializedForm(mo69289m());
    }
}

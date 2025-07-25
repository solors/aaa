package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {

    /* loaded from: classes4.dex */
    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ ImmutableMap.Builder put(Object obj, Object obj2) {
            return put((Builder<K, V>) obj, obj2);
        }

        Builder(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public ImmutableBiMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> buildOrThrow() {
            int i = this.f40053c;
            if (i == 0) {
                return ImmutableBiMap.m69448of();
            }
            if (this.f40051a != null) {
                if (this.f40054d) {
                    this.f40052b = Arrays.copyOf(this.f40052b, i * 2);
                }
                ImmutableMap.Builder.m69383d(this.f40052b, this.f40053c, this.f40051a);
            }
            this.f40054d = true;
            return new RegularImmutableBiMap(this.f40052b, this.f40053c);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k, V v) {
            super.put((Builder<K, V>) k, (K) v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        /* renamed from: c */
        public Builder<K, V> mo69287b(int i) {
            return new Builder<>(i);
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i) {
        CollectPreconditions.m69727b(i, "expectedSize");
        return new Builder<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.mo68833i()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69448of() {
        return RegularImmutableBiMap.f40593m;
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: l */
    public final ImmutableSet<V> mo68834f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69447of(K k, V v) {
        CollectPreconditions.m69728a(k, v);
        return new RegularImmutableBiMap(new Object[]{k, v}, 1);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69446of(K k, V v, K k2, V v2) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2}, 2);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    @Beta
    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable) iterable).build();
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69445of(K k, V v, K k2, V v2, K k3, V v3) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69444of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69443of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69442of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 6);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69441of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7}, 7);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69440of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        CollectPreconditions.m69728a(k8, v8);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8}, 8);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69439of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        CollectPreconditions.m69728a(k8, v8);
        CollectPreconditions.m69728a(k9, v9);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9}, 9);
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m69438of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        CollectPreconditions.m69728a(k, v);
        CollectPreconditions.m69728a(k2, v2);
        CollectPreconditions.m69728a(k3, v3);
        CollectPreconditions.m69728a(k4, v4);
        CollectPreconditions.m69728a(k5, v5);
        CollectPreconditions.m69728a(k6, v6);
        CollectPreconditions.m69728a(k7, v7);
        CollectPreconditions.m69728a(k8, v8);
        CollectPreconditions.m69728a(k9, v9);
        CollectPreconditions.m69728a(k10, v10);
        return new RegularImmutableBiMap(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10}, 10);
    }
}

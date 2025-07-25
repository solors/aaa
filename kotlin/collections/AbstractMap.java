package kotlin.collections;

import ae.KMarkers;
import com.ironsource.C20517nb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.collections.d */
/* loaded from: classes7.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, KMarkers {
    @NotNull
    public static final C37537a Companion = new C37537a(null);
    @Nullable
    private volatile Set<? extends K> _keys;
    @Nullable
    private volatile Collection<? extends V> _values;

    /* compiled from: AbstractMap.kt */
    @Metadata
    /* renamed from: kotlin.collections.d$a */
    /* loaded from: classes7.dex */
    public static final class C37537a {
        private C37537a() {
        }

        public /* synthetic */ C37537a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata
    /* renamed from: kotlin.collections.d$b */
    /* loaded from: classes7.dex */
    public static final class C37538b extends AbstractSet<K> {

        /* renamed from: b */
        final /* synthetic */ AbstractMap<K, V> f99237b;

        /* compiled from: AbstractMap.kt */
        @Metadata
        /* renamed from: kotlin.collections.d$b$a */
        /* loaded from: classes7.dex */
        public static final class C37539a implements Iterator<K>, KMarkers {

            /* renamed from: b */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f99238b;

            /* JADX WARN: Multi-variable type inference failed */
            C37539a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f99238b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f99238b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.f99238b.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C37538b(AbstractMap<K, ? extends V> abstractMap) {
            this.f99237b = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f99237b.containsKey(obj);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f99237b.size();
        }

        @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<K> iterator() {
            return new C37539a(this.f99237b.entrySet().iterator());
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata
    /* renamed from: kotlin.collections.d$c */
    /* loaded from: classes7.dex */
    static final class C37540c extends Lambda implements Function1<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: g */
        final /* synthetic */ AbstractMap<K, V> f99239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C37540c(AbstractMap<K, ? extends V> abstractMap) {
            super(1);
            this.f99239g = abstractMap;
        }

        @NotNull
        public final CharSequence invoke(@NotNull Map.Entry<? extends K, ? extends V> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f99239g.toString((Map.Entry) it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
            return invoke((Map.Entry) ((Map.Entry) obj));
        }
    }

    /* compiled from: AbstractMap.kt */
    @Metadata
    /* renamed from: kotlin.collections.d$d */
    /* loaded from: classes7.dex */
    public static final class C37541d extends AbstractCollection<V> {

        /* renamed from: b */
        final /* synthetic */ AbstractMap<K, V> f99240b;

        /* compiled from: AbstractMap.kt */
        @Metadata
        /* renamed from: kotlin.collections.d$d$a */
        /* loaded from: classes7.dex */
        public static final class C37542a implements Iterator<V>, KMarkers {

            /* renamed from: b */
            final /* synthetic */ Iterator<Map.Entry<K, V>> f99241b;

            /* JADX WARN: Multi-variable type inference failed */
            C37542a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f99241b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f99241b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.f99241b.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C37541d(AbstractMap<K, ? extends V> abstractMap) {
            this.f99240b = abstractMap;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.f99240b.containsValue(obj);
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f99240b.size();
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<V> iterator() {
            return new C37542a(this.f99240b.entrySet().iterator());
        }
    }

    private final Map.Entry<K, V> implFindEntry(K k) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.m17075f(((Map.Entry) obj).getKey(), k)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsEntry$kotlin_stdlib(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.m17073h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v = get(key);
        if (!Intrinsics.m17075f(value, v)) {
            return false;
        }
        if (v == null) {
            Intrinsics.m17073h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
            if (!containsKey(key)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (implFindEntry(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m17075f(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Map.Entry<K, V> implFindEntry = implFindEntry(obj);
        if (implFindEntry != null) {
            return implFindEntry.getValue();
        }
        return null;
    }

    public abstract Set getEntries();

    @NotNull
    public Set<K> getKeys() {
        if (this._keys == null) {
            this._keys = new C37538b(this);
        }
        Set set = (Set<? extends K>) this._keys;
        Intrinsics.m17074g(set);
        return set;
    }

    public int getSize() {
        return entrySet().size();
    }

    @NotNull
    public Collection<V> getValues() {
        if (this._values == null) {
            this._values = new C37541d(this);
        }
        Collection collection = (Collection<? extends V>) this._values;
        Intrinsics.m17074g(collection);
        return collection;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        String m17521z0;
        m17521z0 = _Collections.m17521z0(entrySet(), ", ", "{", "}", 0, null, new C37540c(this), 24, null);
        return m17521z0;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toString(Map.Entry<? extends K, ? extends V> entry) {
        return toString(entry.getKey()) + C20517nb.f52173T + toString(entry.getValue());
    }

    private final String toString(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }
}

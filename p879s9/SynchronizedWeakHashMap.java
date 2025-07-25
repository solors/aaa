package p879s9;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

@Metadata
/* renamed from: s9.p */
/* loaded from: classes8.dex */
public final class SynchronizedWeakHashMap<K, N> extends WeakHashMap<K, N> {
    @NotNull

    /* renamed from: b */
    private final Object f104120b = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public final Map<K, N> m12023a() {
        int m17154x;
        int m17292f;
        int m16917e;
        LinkedHashMap linkedHashMap;
        synchronized (this.f104120b) {
            Set<Map.Entry<K, N>> entrySet = entrySet();
            m17154x = C37566w.m17154x(entrySet, 10);
            m17292f = MapsJVM.m17292f(m17154x);
            m16917e = _Ranges.m16917e(m17292f, 16);
            linkedHashMap = new LinkedHashMap(m16917e);
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples m14532a = C38513v.m14532a(entry.getKey(), entry.getValue());
                linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: b */
    public Set<Map.Entry<K, N>> m12022b() {
        Set<Map.Entry<K, N>> entrySet;
        synchronized (this.f104120b) {
            entrySet = super.entrySet();
        }
        Intrinsics.checkNotNullExpressionValue(entrySet, "synchronized(lock) { super.entries }");
        return entrySet;
    }

    @NotNull
    /* renamed from: c */
    public Set<K> m12021c() {
        Set<K> keySet;
        synchronized (this.f104120b) {
            keySet = super.keySet();
        }
        Intrinsics.checkNotNullExpressionValue(keySet, "synchronized(lock) { super.keys }");
        return keySet;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        synchronized (this.f104120b) {
            super.clear();
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: d */
    public /* bridge */ int m12020d() {
        return super.size();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, N>> entrySet() {
        return m12022b();
    }

    @NotNull
    /* renamed from: f */
    public Collection<N> m12019f() {
        Collection<N> values;
        synchronized (this.f104120b) {
            values = super.values();
        }
        Intrinsics.checkNotNullExpressionValue(values, "synchronized(lock) { super.values }");
        return values;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N get(@Nullable Object obj) {
        N n;
        synchronized (this.f104120b) {
            n = (N) super.get(obj);
        }
        return n;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m12021c();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N put(@NotNull K key, @NotNull N value) {
        N n;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f104120b) {
            n = (N) super.put(key, value);
        }
        return n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends N> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        synchronized (this.f104120b) {
            super.putAll(from);
            Unit unit = Unit.f99208a;
        }
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public N remove(@Nullable Object obj) {
        N n;
        synchronized (this.f104120b) {
            n = (N) super.remove(obj);
        }
        return n;
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m12020d();
    }

    @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<N> values() {
        return m12019f();
    }

    @Override // java.util.Map
    public boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        boolean remove;
        if (obj == null || obj2 == null) {
            return false;
        }
        synchronized (this.f104120b) {
            remove = super.remove(obj, obj2);
        }
        return remove;
    }
}

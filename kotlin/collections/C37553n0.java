package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapWithDefault.kt */
@Metadata
/* renamed from: kotlin.collections.n0 */
/* loaded from: classes7.dex */
public final class C37553n0<K, V> implements MapWithDefault<K, V> {
    @NotNull

    /* renamed from: b */
    private final Map<K, V> f99259b;
    @NotNull

    /* renamed from: c */
    private final Function1<K, V> f99260c;

    /* JADX WARN: Multi-variable type inference failed */
    public C37553n0(@NotNull Map<K, ? extends V> map, @NotNull Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f99259b = map;
        this.f99260c = function1;
    }

    @NotNull
    /* renamed from: a */
    public Set<Map.Entry<K, V>> m17413a() {
        return mo17408k().entrySet();
    }

    @NotNull
    /* renamed from: b */
    public Set<K> m17412b() {
        return mo17408k().keySet();
    }

    /* renamed from: c */
    public int m17411c() {
        return mo17408k().size();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo17408k().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo17408k().containsValue(obj);
    }

    @NotNull
    /* renamed from: d */
    public Collection<V> m17410d() {
        return mo17408k().values();
    }

    @Override // kotlin.collections.MapWithDefault
    /* renamed from: e */
    public V mo17409e(K k) {
        Map<K, V> mo17408k = mo17408k();
        V v = mo17408k.get(k);
        if (v == null && !mo17408k.containsKey(k)) {
            return this.f99260c.invoke(k);
        }
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m17413a();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return mo17408k().equals(obj);
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return mo17408k().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo17408k().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo17408k().isEmpty();
    }

    @Override // kotlin.collections.MapWithDefault
    @NotNull
    /* renamed from: k */
    public Map<K, V> mo17408k() {
        return this.f99259b;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m17412b();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m17411c();
    }

    @NotNull
    public String toString() {
        return mo17408k().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m17410d();
    }
}

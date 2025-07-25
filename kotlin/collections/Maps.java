package kotlin.collections;

import ae.KMarkers;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.collections.g0 */
/* loaded from: classes7.dex */
public final class Maps implements Map, Serializable, KMarkers {
    @NotNull

    /* renamed from: b */
    public static final Maps f99247b = new Maps();

    private Maps() {
    }

    private final Object readResolve() {
        return f99247b;
    }

    /* renamed from: a */
    public boolean m17512a(@NotNull Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return false;
    }

    @Override // java.util.Map
    @Nullable
    /* renamed from: b */
    public Void get(@Nullable Object obj) {
        return null;
    }

    @NotNull
    /* renamed from: c */
    public Set<Map.Entry> m17510c() {
        return Sets.f99248b;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m17512a((Void) obj);
    }

    @NotNull
    /* renamed from: d */
    public Set<Object> m17509d() {
        return Sets.f99248b;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m17510c();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m17508f() {
        return 0;
    }

    @NotNull
    /* renamed from: g */
    public Collection m17507g() {
        return C37546f0.f99246b;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m17509d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m17508f();
    }

    @NotNull
    public String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m17507g();
    }
}

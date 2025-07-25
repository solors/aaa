package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import ae.KMarkers;
import com.ironsource.C20517nb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry */
/* loaded from: classes.dex */
public class PersistentHashMapContentIterators<K, V> implements Map.Entry<K, V>, KMarkers {
    private final K key;
    private final V value;

    public PersistentHashMapContentIterators(K k, V v) {
        this.key = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !Intrinsics.m17075f(entry.getKey(), getKey()) || !Intrinsics.m17075f(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i;
        K key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        V value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(C20517nb.f52173T);
        sb2.append(getValue());
        return sb2.toString();
    }
}

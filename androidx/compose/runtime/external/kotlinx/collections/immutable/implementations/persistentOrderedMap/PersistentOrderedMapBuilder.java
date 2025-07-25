package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PersistentOrderedMapBuilder.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    @Nullable
    private Object firstKey;
    @NotNull
    private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder;
    @Nullable
    private Object lastKey;
    @NotNull
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(@NotNull PersistentOrderedMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.firstKey = map.getFirstKey$runtime_release();
        this.lastKey = this.map.getLastKey$runtime_release();
        this.hashMapBuilder = this.map.getHashMap$runtime_release().builder();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @NotNull
    public PersistentMap<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        boolean z;
        PersistentHashMap<K, LinkedValue<V>> build = this.hashMapBuilder.build();
        if (build == this.map.getHashMap$runtime_release()) {
            boolean z2 = true;
            if (this.firstKey == this.map.getFirstKey$runtime_release()) {
                z = true;
            } else {
                z = false;
            }
            commonFunctions.m107194assert(z);
            if (this.lastKey != this.map.getLastKey$runtime_release()) {
                z2 = false;
            }
            commonFunctions.m107194assert(z2);
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, build);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.lastKey = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderContentViews(this);
    }

    @Nullable
    public final Object getFirstKey$runtime_release() {
        return this.firstKey;
    }

    @NotNull
    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k, V v) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(k);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v) {
                return v;
            }
            this.hashMapBuilder.put(k, linkedValue.withValue(v));
            return linkedValue.getValue();
        } else if (isEmpty()) {
            this.firstKey = k;
            this.lastKey = k;
            this.hashMapBuilder.put(k, new LinkedValue<>(v));
            return null;
        } else {
            Object obj = this.lastKey;
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(obj);
            Intrinsics.m17074g(linkedValue2);
            LinkedValue<V> linkedValue3 = linkedValue2;
            commonFunctions.m107194assert(!linkedValue3.getHasNext());
            this.hashMapBuilder.put(obj, linkedValue3.withNext(k));
            this.hashMapBuilder.put(k, new LinkedValue<>(v, obj));
            this.lastKey = k;
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object obj) {
        LinkedValue<V> remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.getHasPrevious()) {
            LinkedValue<V> linkedValue = this.hashMapBuilder.get(remove.getPrevious());
            Intrinsics.m17074g(linkedValue);
            this.hashMapBuilder.put(remove.getPrevious(), linkedValue.withNext(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.getHasNext()) {
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(remove.getNext());
            Intrinsics.m17074g(linkedValue2);
            this.hashMapBuilder.put(remove.getNext(), linkedValue2.withPrevious(remove.getPrevious()));
        } else {
            this.lastKey = remove.getPrevious();
        }
        return remove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null && Intrinsics.m17075f(linkedValue.getValue(), obj2)) {
            remove(obj);
            return true;
        }
        return false;
    }
}

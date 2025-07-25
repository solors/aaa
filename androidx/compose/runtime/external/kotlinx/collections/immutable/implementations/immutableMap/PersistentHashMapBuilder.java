package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutableCounter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PersistentHashMapBuilder.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    @NotNull
    private PersistentHashMap<K, V> map;
    private int modCount;
    @NotNull
    private TrieNode<K, V> node;
    @Nullable
    private V operationResult;
    @NotNull
    private MutabilityOwnership ownership;
    private int size;

    public PersistentHashMapBuilder(@NotNull PersistentHashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.ownership = new MutabilityOwnership();
        this.node = this.map.getNode$runtime_release();
        this.size = this.map.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.node = TrieNode.Companion.getEMPTY$runtime_release();
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        TrieNode<K, V> trieNode = this.node;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return trieNode.containsKey(i, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object obj) {
        int i;
        TrieNode<K, V> trieNode = this.node;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return trieNode.get(i, obj, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @NotNull
    public final TrieNode<K, V> getNode$runtime_release() {
        return this.node;
    }

    @Nullable
    public final V getOperationResult$runtime_release() {
        return this.operationResult;
    }

    @NotNull
    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k, V v) {
        int i;
        this.operationResult = null;
        TrieNode<K, V> trieNode = this.node;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.node = trieNode.mutablePut(i, k, v, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        PersistentHashMap<K, V> persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        Intrinsics.checkNotNullParameter(from, "from");
        if (from instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) from;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (from instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) from;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMap = persistentHashMapBuilder.build();
            } else {
                persistentHashMap = null;
            }
        }
        if (persistentHashMap != null) {
            MutableCounter mutableCounter = new MutableCounter(0, 1, null);
            int size = size();
            this.node = this.node.mutablePutAll(persistentHashMap.getNode$runtime_release(), 0, mutableCounter, this);
            int size2 = (persistentHashMap.size() + size) - mutableCounter.getCount();
            if (size != size2) {
                setSize(size2);
                return;
            }
            return;
        }
        super.putAll(from);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object obj) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    public final void setModCount$runtime_release(int i) {
        this.modCount = i;
    }

    public final void setNode$runtime_release(@NotNull TrieNode<K, V> trieNode) {
        Intrinsics.checkNotNullParameter(trieNode, "<set-?>");
        this.node = trieNode;
    }

    public final void setOperationResult$runtime_release(@Nullable V v) {
        this.operationResult = v;
    }

    public void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @NotNull
    public PersistentHashMap<K, V> build() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$runtime_release()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$runtime_release();
        }
        this.node = mutableRemove;
        return size != size();
    }
}

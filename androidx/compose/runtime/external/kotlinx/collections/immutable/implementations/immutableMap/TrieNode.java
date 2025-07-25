package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutableCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45270p;

/* compiled from: TrieNode.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieNode<K, V> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);
    @NotNull
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    @Nullable
    private final MutabilityOwnership ownedBy;

    /* compiled from: TrieNode.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }

    /* compiled from: TrieNode.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class ModificationResult<K, V> {
        @NotNull
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(@NotNull TrieNode<K, V> node, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.sizeDelta = i;
        }

        @NotNull
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @NotNull
        public final ModificationResult<K, V> replaceNode(@NotNull Function1<? super TrieNode<K, V>, TrieNode<K, V>> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            setNode(operation.invoke(getNode()));
            return this;
        }

        public final void setNode(@NotNull TrieNode<K, V> trieNode) {
            Intrinsics.checkNotNullParameter(trieNode, "<set-?>");
            this.node = trieNode;
        }
    }

    public TrieNode(int i, int i2, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = buffer;
    }

    private final void accept(InterfaceC45270p<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC45270p, int i, int i2) {
        interfaceC45270p.invoke(this, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i3 = this.nodeMap;
        while (i3 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i3);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(lowestOneBit)).accept(interfaceC45270p, (Integer.numberOfTrailingZeros(lowestOneBit) << i2) + i, i2 + 5);
            i3 -= lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        int i5;
        Object[] replaceEntryWithNode;
        K keyAtIndex = keyAtIndex(i);
        if (keyAtIndex != null) {
            i5 = keyAtIndex.hashCode();
        } else {
            i5 = 0;
        }
        TrieNode<K, V> makeNode = makeNode(i5, keyAtIndex, valueAtKeyIndex(i), i3, k, v, i4 + 5, mutabilityOwnership);
        replaceEntryWithNode = TrieNodeKt.replaceEntryWithNode(this.buffer, i, nodeIndex$runtime_release(i2) + 1, makeNode);
        return replaceEntryWithNode;
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime_release(i).calculateSize();
        }
        return bitCount;
    }

    private final boolean collisionContainsKey(K k) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (!Intrinsics.m17075f(k, this.buffer[m16953c])) {
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (!Intrinsics.m17075f(k, keyAtIndex(m16953c))) {
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                } else {
                    return null;
                }
            }
            return valueAtKeyIndex(m16953c);
        }
        return null;
    }

    private final ModificationResult<K, V> collisionPut(K k, V v) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        Object[] insertEntryAtIndex;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (!Intrinsics.m17075f(k, keyAtIndex(m16953c))) {
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                }
            }
            if (v == valueAtKeyIndex(m16953c)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[m16953c + 1] = v;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k, v);
        return new TrieNode(0, 0, insertEntryAtIndex).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (!Intrinsics.m17075f(k, keyAtIndex(m16953c))) {
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                }
            }
            return collisionRemoveEntryAtIndex(m16953c);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length != 2) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
            return new TrieNode<>(0, 0, removeEntryAtIndex);
        }
        return null;
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != trieNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNodeAt(int i) {
        if ((i & this.nodeMap) != 0) {
            return true;
        }
        return false;
    }

    private final TrieNode<K, V> insertEntryAt(int i, K k, V v) {
        Object[] insertEntryAtIndex;
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i), k, v);
        return new TrieNode<>(i | this.dataMap, this.nodeMap, insertEntryAtIndex);
    }

    private final K keyAtIndex(int i) {
        return (K) this.buffer[i];
    }

    private final TrieNode<K, V> makeNode(int i, K k, V v, int i2, K k2, V v2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k, v, k2, v2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, indexSegment < indexSegment2 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i, k, v, i2, k2, v2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i, int i2, int i3, K k, V v, int i4) {
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        Object[] insertEntryAtIndex;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (!Intrinsics.m17075f(k, keyAtIndex(m16953c))) {
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(m16953c));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
                this.buffer[m16953c + 1] = v;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[m16953c + 1] = v;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership$runtime_release());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k, v);
        return new TrieNode<>(0, 0, insertEntryAtIndex, persistentHashMapBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, MutableCounter mutableCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        PrimitiveRanges m16900v;
        C37629d m16901u;
        if (this.nodeMap == 0) {
            z = true;
        } else {
            z = false;
        }
        commonFunctions.m107194assert(z);
        if (this.dataMap == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        commonFunctions.m107194assert(z2);
        if (trieNode.nodeMap == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        commonFunctions.m107194assert(z3);
        if (trieNode.dataMap == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        commonFunctions.m107194assert(z4);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        m16900v = _Ranges.m16900v(0, trieNode.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (true) {
                if (!collisionContainsKey(trieNode.buffer[m16953c])) {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[m16953c];
                    copyOf[length + 1] = objArr2[m16953c + 1];
                    length += 2;
                } else {
                    mutableCounter.setCount(mutableCounter.getCount() + 1);
                }
                if (m16953c == m16952d) {
                    break;
                }
                m16953c += m16951f;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length != trieNode.buffer.length) {
            if (length == copyOf.length) {
                return new TrieNode<>(0, 0, copyOf, mutabilityOwnership);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            return new TrieNode<>(0, 0, copyOf2, mutabilityOwnership);
        }
        return trieNode;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (!Intrinsics.m17075f(k, keyAtIndex(m16953c))) {
                if (m16953c != m16952d) {
                    m16953c += m16951f;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(m16953c, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
            removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
            this.buffer = removeEntryAtIndex2;
            return this;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
        return new TrieNode<>(0, 0, removeEntryAtIndex, persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i, K k, V v, MutabilityOwnership mutabilityOwnership) {
        Object[] insertEntryAtIndex;
        Object[] insertEntryAtIndex2;
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i);
        if (this.ownedBy == mutabilityOwnership) {
            insertEntryAtIndex2 = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k, v);
            this.buffer = insertEntryAtIndex2;
            this.dataMap = i | this.dataMap;
            return this;
        }
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k, v);
        return new TrieNode<>(i | this.dataMap, this.nodeMap, insertEntryAtIndex, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i, int i2, int i3, K k, V v, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership);
            this.dataMap ^= i2;
            this.nodeMap |= i2;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i2, i2 | this.nodeMap, bufferMoveEntryToNode(i, i2, i3, k, v, i4, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i, int i2, MutableCounter mutableCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int i3;
        int i4;
        int i5 = 0;
        if (hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i));
            if (trieNode.hasNodeAt(i)) {
                return nodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i)), i2 + 5, mutableCounter, persistentHashMapBuilder);
            }
            if (trieNode.hasEntryAt$runtime_release(i)) {
                int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i);
                K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$runtime_release);
                V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
                int size = persistentHashMapBuilder.size();
                if (keyAtIndex != null) {
                    i5 = keyAtIndex.hashCode();
                }
                TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(i5, keyAtIndex, valueAtKeyIndex, i2 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    mutableCounter.setCount(mutableCounter.getCount() + 1);
                    return mutablePut;
                }
                return mutablePut;
            }
            return nodeAtIndex$runtime_release;
        } else if (trieNode.hasNodeAt(i)) {
            TrieNode<K, V> nodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i));
            if (hasEntryAt$runtime_release(i)) {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i);
                K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime_release2);
                if (keyAtIndex2 != null) {
                    i4 = keyAtIndex2.hashCode();
                } else {
                    i4 = 0;
                }
                int i6 = i2 + 5;
                if (nodeAtIndex$runtime_release2.containsKey(i4, keyAtIndex2, i6)) {
                    mutableCounter.setCount(mutableCounter.getCount() + 1);
                } else {
                    V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    if (keyAtIndex2 != null) {
                        i5 = keyAtIndex2.hashCode();
                    }
                    return nodeAtIndex$runtime_release2.mutablePut(i5, keyAtIndex2, valueAtKeyIndex2, i6, persistentHashMapBuilder);
                }
            }
            return nodeAtIndex$runtime_release2;
        } else {
            int entryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i);
            K keyAtIndex3 = keyAtIndex(entryKeyIndex$runtime_release3);
            V valueAtKeyIndex3 = valueAtKeyIndex(entryKeyIndex$runtime_release3);
            int entryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i);
            K keyAtIndex4 = trieNode.keyAtIndex(entryKeyIndex$runtime_release4);
            V valueAtKeyIndex4 = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release4);
            if (keyAtIndex3 != null) {
                i3 = keyAtIndex3.hashCode();
            } else {
                i3 = 0;
            }
            if (keyAtIndex4 != null) {
                i5 = keyAtIndex4.hashCode();
            }
            return makeNode(i3, keyAtIndex3, valueAtKeyIndex3, i5, keyAtIndex4, valueAtKeyIndex4, i2 + 5, persistentHashMapBuilder.getOwnership$runtime_release());
        }
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i, int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
            removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
            this.buffer = removeEntryAtIndex2;
            this.dataMap ^= i2;
            return this;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
        return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, removeEntryAtIndex, persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] removeNodeAtIndex;
        Object[] removeNodeAtIndex2;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == mutabilityOwnership) {
            removeNodeAtIndex2 = TrieNodeKt.removeNodeAtIndex(objArr, i);
            this.buffer = removeNodeAtIndex2;
            this.nodeMap ^= i2;
            return this;
        }
        removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, i);
        return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, removeNodeAtIndex, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return mutableRemoveNodeAtIndex(i, i2, mutabilityOwnership);
        }
        if (this.ownedBy != mutabilityOwnership && trieNode == trieNode2) {
            return this;
        }
        return mutableUpdateNodeAtIndex(i, trieNode2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        } else if (this.ownedBy == mutabilityOwnership) {
            objArr[i] = trieNode;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
        }
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership$runtime_release()) {
            this.buffer[i + 1] = v;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i, int i2) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length != 2) {
            removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
            return new TrieNode<>(i2 ^ this.dataMap, this.nodeMap, removeEntryAtIndex);
        }
        return null;
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i, int i2) {
        Object[] removeNodeAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length != 1) {
            removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, i);
            return new TrieNode<>(this.dataMap, i2 ^ this.nodeMap, removeNodeAtIndex);
        }
        return null;
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i, int i2) {
        if (trieNode2 == null) {
            return removeNodeAtIndex(i, i2);
        }
        if (trieNode != trieNode2) {
            return updateNodeAtIndex(i, i2, trieNode2);
        }
        return this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i, int i2, TrieNode<K, V> trieNode) {
        Object[] replaceNodeWithEntry;
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 2 && trieNode.nodeMap == 0) {
            if (this.buffer.length == 1) {
                trieNode.dataMap = this.nodeMap;
                return trieNode;
            }
            replaceNodeWithEntry = TrieNodeKt.replaceNodeWithEntry(this.buffer, i, entryKeyIndex$runtime_release(i2), objArr[0], objArr[1]);
            return new TrieNode<>(this.dataMap ^ i2, i2 ^ this.nodeMap, replaceNodeWithEntry);
        }
        Object[] objArr2 = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i, V v) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int i) {
        return (V) this.buffer[i + 1];
    }

    public final void accept$runtime_release(@NotNull InterfaceC45270p<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        accept(visitor, 0, 0);
    }

    public final boolean containsKey(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$runtime_release.collisionContainsKey(k);
            }
            return nodeAtIndex$runtime_release.containsKey(i, k, i2 + 5);
        }
        return false;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.dataMap) * 2;
    }

    @Nullable
    public final V get(int i, K k, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (!Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                return null;
            }
            return valueAtKeyIndex(entryKeyIndex$runtime_release);
        } else if (!hasNodeAt(indexSegment)) {
            return null;
        } else {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i2 == 30) {
                return nodeAtIndex$runtime_release.collisionGet(k);
            }
            return nodeAtIndex$runtime_release.get(i, k, i2 + 5);
        }
    }

    @NotNull
    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i) {
        if ((i & this.dataMap) != 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final TrieNode<K, V> mutablePut(int i, K k, V v, int i2, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutablePut;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                mutator.setOperationResult$runtime_release(valueAtKeyIndex(entryKeyIndex$runtime_release));
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v) {
                    return this;
                }
                return mutableUpdateValueAtIndex(entryKeyIndex$runtime_release, v, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2, mutator.getOwnership$runtime_release());
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutablePut = nodeAtIndex$runtime_release.mutableCollisionPut(k, v, mutator);
            } else {
                mutablePut = nodeAtIndex$runtime_release.mutablePut(i, k, v, i2 + 5, mutator);
            }
            if (nodeAtIndex$runtime_release == mutablePut) {
                return this;
            }
            return mutableUpdateNodeAtIndex(nodeIndex$runtime_release, mutablePut, mutator.getOwnership$runtime_release());
        } else {
            mutator.setSize(mutator.size() + 1);
            return mutableInsertEntryAt(indexSegment, k, v, mutator.getOwnership$runtime_release());
        }
    }

    @NotNull
    public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int i, @NotNull MutableCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        boolean z;
        TrieNode<K, V> trieNode;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.plusAssign(calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionPutAll(otherNode, intersectionCounter, mutator.getOwnership$runtime_release());
        } else {
            int i2 = this.nodeMap | otherNode.nodeMap;
            int i3 = this.dataMap;
            int i4 = otherNode.dataMap;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (Intrinsics.m17075f(keyAtIndex(entryKeyIndex$runtime_release(lowestOneBit)), otherNode.keyAtIndex(otherNode.entryKeyIndex$runtime_release(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            int i7 = 0;
            if ((i2 & i6) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Intrinsics.m17075f(this.ownedBy, mutator.getOwnership$runtime_release()) && this.dataMap == i6 && this.nodeMap == i2) {
                    trieNode = this;
                } else {
                    trieNode = new TrieNode<>(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
                }
                int i8 = i2;
                int i9 = 0;
                while (i8 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i8);
                    Object[] objArr = trieNode.buffer;
                    objArr[(objArr.length - 1) - i9] = mutablePutAllFromOtherNodeCell(otherNode, lowestOneBit2, i, intersectionCounter, mutator);
                    i9++;
                    i8 ^= lowestOneBit2;
                }
                while (i6 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i6);
                    int i10 = i7 * 2;
                    if (!otherNode.hasEntryAt$runtime_release(lowestOneBit3)) {
                        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode.buffer[i10] = keyAtIndex(entryKeyIndex$runtime_release);
                        trieNode.buffer[i10 + 1] = valueAtKeyIndex(entryKeyIndex$runtime_release);
                    } else {
                        int entryKeyIndex$runtime_release2 = otherNode.entryKeyIndex$runtime_release(lowestOneBit3);
                        trieNode.buffer[i10] = otherNode.keyAtIndex(entryKeyIndex$runtime_release2);
                        trieNode.buffer[i10 + 1] = otherNode.valueAtKeyIndex(entryKeyIndex$runtime_release2);
                        if (hasEntryAt$runtime_release(lowestOneBit3)) {
                            intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                        }
                    }
                    i7++;
                    i6 ^= lowestOneBit3;
                }
                if (elementsIdentityEquals(trieNode)) {
                    return this;
                }
                if (otherNode.elementsIdentityEquals(trieNode)) {
                    return otherNode;
                }
                return trieNode;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int i, K k, int i2, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release)) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, mutator) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k, mutator);
            } else {
                mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i, k, i2 + 5, mutator);
            }
            return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
        } else {
            return this;
        }
    }

    @NotNull
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i) {
        Object obj = this.buffer[i];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
    }

    public final int nodeIndex$runtime_release(int i) {
        return (this.buffer.length - 1) - Integer.bitCount((i - 1) & this.nodeMap);
    }

    @Nullable
    public final ModificationResult<K, V> put(int i, K k, V v, int i2) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release))) {
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v) {
                    return null;
                }
                return updateValueAtIndex(entryKeyIndex$runtime_release, v).asUpdateResult();
            }
            return moveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i, k, v, i2).asInsertResult();
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                put = nodeAtIndex$runtime_release.collisionPut(k, v);
                if (put == null) {
                    return null;
                }
            } else {
                put = nodeAtIndex$runtime_release.put(i, k, v, i2 + 5);
                if (put == null) {
                    return null;
                }
            }
            put.setNode(updateNodeAtIndex(nodeIndex$runtime_release, indexSegment, put.getNode()));
            return put;
        } else {
            return insertEntryAt(indexSegment, k, v).asInsertResult();
        }
    }

    @Nullable
    public final TrieNode<K, V> remove(int i, K k, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release)) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                remove = nodeAtIndex$runtime_release.collisionRemove(k);
            } else {
                remove = nodeAtIndex$runtime_release.remove(i, k, i2 + 5);
            }
            return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
        } else {
            return this;
        }
    }

    private final TrieNode<K, V> collisionRemove(K k, V v) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (true) {
                if (!Intrinsics.m17075f(k, keyAtIndex(m16953c)) || !Intrinsics.m17075f(v, valueAtKeyIndex(m16953c))) {
                    if (m16953c == m16952d) {
                        break;
                    }
                    m16953c += m16951f;
                } else {
                    return collisionRemoveEntryAtIndex(m16953c);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(0, this.buffer.length);
        m16901u = _Ranges.m16901u(m16900v, 2);
        int m16953c = m16901u.m16953c();
        int m16952d = m16901u.m16952d();
        int m16951f = m16901u.m16951f();
        if ((m16951f > 0 && m16953c <= m16952d) || (m16951f < 0 && m16952d <= m16953c)) {
            while (true) {
                if (!Intrinsics.m17075f(k, keyAtIndex(m16953c)) || !Intrinsics.m17075f(v, valueAtKeyIndex(m16953c))) {
                    if (m16953c == m16952d) {
                        break;
                    }
                    m16953c += m16951f;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(m16953c, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, int i2, @NotNull Object[] buffer) {
        this(i, i2, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int i, K k, V v, int i2, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release)) && Intrinsics.m17075f(v, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, mutator) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k, v, mutator);
            } else {
                mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i, k, v, i2 + 5, mutator);
            }
            return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
        } else {
            return this;
        }
    }

    @Nullable
    public final TrieNode<K, V> remove(int i, K k, V v, int i2) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (Intrinsics.m17075f(k, keyAtIndex(entryKeyIndex$runtime_release)) && Intrinsics.m17075f(v, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        } else if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i2 == 30) {
                remove = nodeAtIndex$runtime_release.collisionRemove(k, v);
            } else {
                remove = nodeAtIndex$runtime_release.remove(i, k, v, i2 + 5);
            }
            return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
        } else {
            return this;
        }
    }
}

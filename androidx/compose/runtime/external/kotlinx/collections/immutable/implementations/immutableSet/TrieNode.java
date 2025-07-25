package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutableCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TrieNode.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieNode<E> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);
    private int bitmap;
    @NotNull
    private Object[] buffer;
    @Nullable
    private MutabilityOwnership ownedBy;

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

    public TrieNode(int i, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.bitmap = i;
        this.buffer = buffer;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i, E e) {
        return new TrieNode<>(i | this.bitmap, TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i), e));
    }

    private final int calculateSize() {
        Object[] objArr;
        int i;
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i2 = 0;
        for (Object obj : this.buffer) {
            if (obj instanceof TrieNode) {
                i = ((TrieNode) obj).calculateSize();
            } else {
                i = 1;
            }
            i2 += i;
        }
        return i2;
    }

    private final TrieNode<E> collisionAdd(E e) {
        if (collisionContainsElement(e)) {
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e));
    }

    private final boolean collisionContainsElement(E e) {
        boolean m17338N;
        m17338N = _Arrays.m17338N(this.buffer, e);
        return m17338N;
    }

    private final TrieNode<E> collisionRemove(E e) {
        int m17319g0;
        m17319g0 = _Arrays.m17319g0(this.buffer, e);
        if (m17319g0 != -1) {
            return collisionRemoveElementAtIndex(m17319g0);
        }
        return this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i) {
        return new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(this.buffer, i));
    }

    private final E elementAtIndex(int i) {
        return (E) this.buffer[i];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
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

    private final boolean hasNoCellAt(int i) {
        if ((i & this.bitmap) == 0) {
            return true;
        }
        return false;
    }

    private final TrieNode<E> makeNode(int i, E e, int i2, E e2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode<>(0, new Object[]{e, e2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), indexSegment < indexSegment2 ? new Object[]{e, e2} : new Object[]{e2, e}, mutabilityOwnership);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i, e, i2, e2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        int i4;
        E elementAtIndex = elementAtIndex(i);
        if (elementAtIndex != null) {
            i4 = elementAtIndex.hashCode();
        } else {
            i4 = 0;
        }
        return makeNode(i4, elementAtIndex, i2, e, i3 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i, int i2, E e, int i3) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i, E e, MutabilityOwnership mutabilityOwnership) {
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e);
            this.bitmap = i | this.bitmap;
            return this;
        }
        return new TrieNode<>(i | this.bitmap, TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e), mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionAdd(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (collisionContainsElement(e)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e), persistentHashSetBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, MutableCounter mutableCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z;
        if (this == trieNode) {
            mutableCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i = 0;
        for (int i2 = 0; i2 < objArr2.length; i2++) {
            boolean z2 = true;
            if (i <= i2) {
                z = true;
            } else {
                z = false;
            }
            commonFunctions.m107194assert(z);
            if (!collisionContainsElement((E) objArr2[i2])) {
                copyOf[length + i] = objArr2[i2];
                i++;
                if (length + i > copyOf.length) {
                    z2 = false;
                }
                commonFunctions.m107194assert(z2);
            }
        }
        int length2 = i + this.buffer.length;
        mutableCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        }
        if (Intrinsics.m17075f(this.ownedBy, mutabilityOwnership)) {
            this.buffer = copyOf;
            return this;
        }
        return new TrieNode<>(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemove(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int m17319g0;
        m17319g0 = _Arrays.m17319g0(this.buffer, e);
        if (m17319g0 != -1) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return mutableCollisionRemoveElementAtIndex(m17319g0, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, MutableCounter mutableCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z;
        if (this == trieNode) {
            mutableCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        if (Intrinsics.m17075f(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[this.buffer.length];
        }
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            commonFunctions.m107194assert(z);
            if (!trieNode.collisionContainsElement((E) objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                if (0 + i2 > objArr.length) {
                    z2 = false;
                }
                commonFunctions.m107194assert(z2);
            }
            i++;
        }
        mutableCounter.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(this.buffer, i), mutabilityOwnership);
    }

    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, MutableCounter mutableCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z;
        if (this == trieNode) {
            mutableCounter.plusAssign(this.buffer.length);
            return this;
        }
        if (Intrinsics.m17075f(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        }
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= objArr2.length) {
                break;
            }
            if (i2 <= i) {
                z = true;
            } else {
                z = false;
            }
            commonFunctions.m107194assert(z);
            if (trieNode.collisionContainsElement((E) objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                if (0 + i2 > objArr.length) {
                    z2 = false;
                }
                commonFunctions.m107194assert(z2);
            }
            i++;
        }
        mutableCounter.plusAssign(i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 != trieNode.buffer.length) {
            if (i2 == objArr.length) {
                return new TrieNode(0, objArr, mutabilityOwnership);
            }
            Object[] copyOf = Arrays.copyOf(objArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            return new TrieNode(0, copyOf, mutabilityOwnership);
        }
        return trieNode;
    }

    private final TrieNode<E> mutableMoveElementToNode(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i);
            this.bitmap ^= i2;
            return this;
        }
        return new TrieNode<>(i2 ^ this.bitmap, TrieNodeKt.access$removeCellAtIndex(this.buffer, i), mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r0 = trieNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i] = trieNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i) {
        Object obj = this.buffer[i];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
    }

    private final TrieNode<E> removeCellAtIndex(int i, int i2) {
        return new TrieNode<>(i2 ^ this.bitmap, TrieNodeKt.access$removeCellAtIndex(this.buffer, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i, TrieNode<E> trieNode) {
        ?? r0 = trieNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf);
    }

    @NotNull
    public final TrieNode<E> add(int i, E e, int i2) {
        TrieNode<E> add;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                add = nodeAtIndex.collisionAdd(e);
            } else {
                add = nodeAtIndex.add(i, e, i2 + 5);
            }
            if (nodeAtIndex == add) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, add);
        } else if (Intrinsics.m17075f(e, obj)) {
            return this;
        } else {
            return moveElementToNode(indexOfCellAt$runtime_release, i, e, i2);
        }
    }

    public final boolean contains(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                return nodeAtIndex.collisionContainsElement(e);
            }
            return nodeAtIndex.contains(i, e, i2 + 5);
        }
        return Intrinsics.m17075f(e, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@NotNull TrieNode<E> otherNode, int i) {
        int i2;
        boolean m17338N;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        if (this == otherNode) {
            return true;
        }
        if (i > 30) {
            for (Object obj : otherNode.buffer) {
                m17338N = _Arrays.m17338N(this.buffer, obj);
                if (!m17338N) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.bitmap;
        int i4 = otherNode.bitmap;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj2 = this.buffer[indexOfCellAt$runtime_release];
            Object obj3 = otherNode.buffer[indexOfCellAt$runtime_release2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                if (obj2 != null) {
                    TrieNode trieNode = (TrieNode) obj2;
                    if (obj3 != null) {
                        if (!trieNode.containsAll((TrieNode) obj3, i + 5)) {
                            return false;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
            } else if (z) {
                if (obj2 != null) {
                    TrieNode trieNode2 = (TrieNode) obj2;
                    if (obj3 != null) {
                        i2 = obj3.hashCode();
                    } else {
                        i2 = 0;
                    }
                    if (!trieNode2.contains(i2, obj3, i + 5)) {
                        return false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
            } else if (z2 || !Intrinsics.m17075f(obj2, obj3)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @Nullable
    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.bitmap);
    }

    @NotNull
    public final TrieNode<E> mutableAdd(int i, E e, int i2, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableAdd;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableAddElementAt(indexSegment, e, mutator.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                mutableAdd = nodeAtIndex.mutableCollisionAdd(e, mutator);
            } else {
                mutableAdd = nodeAtIndex.mutableAdd(i, e, i2 + 5, mutator);
            }
            if (nodeAtIndex == mutableAdd) {
                return this;
            }
            return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableAdd, mutator.getOwnership$runtime_release());
        } else if (Intrinsics.m17075f(e, obj)) {
            return this;
        } else {
            mutator.setSize(mutator.size() + 1);
            return mutableMoveElementToNode(indexOfCellAt$runtime_release, i, e, i2, mutator.getOwnership$runtime_release());
        }
    }

    @NotNull
    public final TrieNode<E> mutableAddAll(@NotNull TrieNode<E> otherNode, int i, @NotNull MutableCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Object makeNode;
        int i5;
        Object mutableAdd;
        int i6;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i7 = this.bitmap;
            int i8 = otherNode.bitmap | i7;
            if (i8 == i7 && Intrinsics.m17075f(this.ownedBy, mutator.getOwnership$runtime_release())) {
                trieNode = this;
            } else {
                trieNode = new TrieNode<>(i8, new Object[Integer.bitCount(i8)], mutator.getOwnership$runtime_release());
            }
            int i9 = i8;
            int i10 = 0;
            while (i9 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i9);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object[] objArr2 = trieNode.buffer;
                if (hasNoCellAt(lowestOneBit)) {
                    makeNode = (TrieNode<E>) otherNode.buffer[indexOfCellAt$runtime_release2];
                } else if (otherNode.hasNoCellAt(lowestOneBit)) {
                    makeNode = this.buffer[indexOfCellAt$runtime_release];
                } else {
                    E e = (E) this.buffer[indexOfCellAt$runtime_release];
                    E e2 = (E) otherNode.buffer[indexOfCellAt$runtime_release2];
                    boolean z = e instanceof TrieNode;
                    boolean z2 = e2 instanceof TrieNode;
                    if (z && z2) {
                        if (e != null) {
                            TrieNode trieNode2 = (TrieNode) e;
                            if (e2 != null) {
                                makeNode = trieNode2.mutableAddAll((TrieNode) e2, i + 5, intersectionSizeRef, mutator);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                        }
                    } else {
                        if (z) {
                            if (e != null) {
                                TrieNode trieNode3 = (TrieNode) e;
                                int size = mutator.size();
                                if (e2 != null) {
                                    i6 = e2.hashCode();
                                } else {
                                    i6 = 0;
                                }
                                mutableAdd = trieNode3.mutableAdd(i6, e2, i + 5, mutator);
                                if (mutator.size() == size) {
                                    intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                                }
                                Unit unit = Unit.f99208a;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                            }
                        } else if (z2) {
                            if (e2 != null) {
                                TrieNode trieNode4 = (TrieNode) e2;
                                int size2 = mutator.size();
                                if (e != null) {
                                    i5 = e.hashCode();
                                } else {
                                    i5 = 0;
                                }
                                mutableAdd = trieNode4.mutableAdd(i5, e, i + 5, mutator);
                                if (mutator.size() == size2) {
                                    intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                                }
                                Unit unit2 = Unit.f99208a;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                            }
                        } else if (Intrinsics.m17075f(e, e2)) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            Unit unit3 = Unit.f99208a;
                            makeNode = e;
                        } else {
                            if (e != null) {
                                i2 = e.hashCode();
                            } else {
                                i2 = 0;
                            }
                            if (e2 != null) {
                                i3 = e2.hashCode();
                            } else {
                                i3 = 0;
                            }
                            objArr = objArr2;
                            i4 = lowestOneBit;
                            makeNode = makeNode(i2, e, i3, e2, i + 5, mutator.getOwnership$runtime_release());
                            objArr[i10] = makeNode;
                            i10++;
                            i9 ^= i4;
                        }
                        makeNode = mutableAdd;
                    }
                }
                objArr = objArr2;
                i4 = lowestOneBit;
                objArr[i10] = makeNode;
                i10++;
                i9 ^= i4;
            }
            if (elementsIdentityEquals(trieNode)) {
                return this;
            }
            if (otherNode.elementsIdentityEquals(trieNode)) {
                return otherNode;
            }
            return trieNode;
        }
    }

    @NotNull
    public final TrieNode<E> mutableRemove(int i, E e, int i2, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex.mutableCollisionRemove(e, mutator);
            } else {
                mutableRemove = nodeAtIndex.mutableRemove(i, e, i2 + 5, mutator);
            }
            if (this.ownedBy != mutator.getOwnership$runtime_release() && nodeAtIndex == mutableRemove) {
                return this;
            }
            return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableRemove, mutator.getOwnership$runtime_release());
        } else if (Intrinsics.m17075f(e, obj)) {
            mutator.setSize(mutator.size() - 1);
            return mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
        } else {
            return this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mutableRemoveAll(@org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r17, int r18, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutableCounter r19, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object mutableRetainAll(@NotNull TrieNode<E> otherNode, int i, @NotNull MutableCounter intersectionSizeRef, @NotNull PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        TrieNode trieNode2;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionRetainAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i4 = this.bitmap & otherNode.bitmap;
            if (i4 == 0) {
                return EMPTY;
            }
            if (Intrinsics.m17075f(this.ownedBy, mutator.getOwnership$runtime_release()) && i4 == this.bitmap) {
                trieNode = this;
            } else {
                trieNode = new TrieNode<>(i4, new Object[Integer.bitCount(i4)], mutator.getOwnership$runtime_release());
            }
            int i5 = i4;
            int i6 = 0;
            int i7 = 0;
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object obj = this.buffer[indexOfCellAt$runtime_release];
                Object obj2 = otherNode.buffer[indexOfCellAt$runtime_release2];
                boolean z4 = obj instanceof TrieNode;
                boolean z5 = obj2 instanceof TrieNode;
                if (z4 && z5) {
                    if (obj != null) {
                        TrieNode trieNode3 = (TrieNode) obj;
                        if (obj2 != null) {
                            obj = trieNode3.mutableRetainAll((TrieNode) obj2, i + 5, intersectionSizeRef, mutator);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                    }
                } else if (z4) {
                    if (obj != null) {
                        TrieNode trieNode4 = (TrieNode) obj;
                        if (obj2 != null) {
                            i3 = obj2.hashCode();
                        } else {
                            i3 = 0;
                        }
                        if (trieNode4.contains(i3, obj2, i + 5)) {
                            intersectionSizeRef.plusAssign(1);
                            obj = obj2;
                        } else {
                            obj = EMPTY;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                    }
                } else if (z5) {
                    if (obj2 != null) {
                        TrieNode trieNode5 = (TrieNode) obj2;
                        if (obj != null) {
                            i2 = obj.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (trieNode5.contains(i2, obj, i + 5)) {
                            intersectionSizeRef.plusAssign(1);
                        } else {
                            obj = EMPTY;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                    }
                } else if (Intrinsics.m17075f(obj, obj2)) {
                    intersectionSizeRef.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
                if (obj != EMPTY) {
                    i6 |= lowestOneBit;
                }
                trieNode.buffer[i7] = obj;
                i7++;
                i5 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i6);
            if (i6 == 0) {
                return EMPTY;
            }
            if (i6 == i4) {
                if (trieNode.elementsIdentityEquals(this)) {
                    return this;
                }
                if (trieNode.elementsIdentityEquals(otherNode)) {
                    return otherNode;
                }
                return trieNode;
            }
            if (bitCount == 1 && i != 0) {
                Object obj3 = trieNode.buffer[trieNode.indexOfCellAt$runtime_release(i6)];
                if (obj3 instanceof TrieNode) {
                    trieNode2 = new TrieNode(i6, new Object[]{obj3}, mutator.getOwnership$runtime_release());
                } else {
                    return obj3;
                }
            } else {
                Object[] objArr = new Object[bitCount];
                Object[] objArr2 = trieNode.buffer;
                int i8 = 0;
                for (int i9 = 0; i9 < objArr2.length; i9++) {
                    if (i8 <= i9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    commonFunctions.m107194assert(z);
                    if (objArr2[i9] != Companion.getEMPTY$runtime_release()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        objArr[0 + i8] = objArr2[i9];
                        i8++;
                        if (0 + i8 <= bitCount) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        commonFunctions.m107194assert(z3);
                    }
                }
                trieNode2 = new TrieNode(i6, objArr, mutator.getOwnership$runtime_release());
            }
            return trieNode2;
        }
    }

    @NotNull
    public final TrieNode<E> remove(int i, E e, int i2) {
        TrieNode<E> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                remove = nodeAtIndex.collisionRemove(e);
            } else {
                remove = nodeAtIndex.remove(i, e, i2 + 5);
            }
            if (nodeAtIndex == remove) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, remove);
        } else if (Intrinsics.m17075f(e, obj)) {
            return removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment);
        } else {
            return this;
        }
    }

    public final void setBitmap(int i) {
        this.bitmap = i;
    }

    public final void setBuffer(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.buffer = objArr;
    }

    public final void setOwnedBy(@Nullable MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, @NotNull Object[] buffer) {
        this(i, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }
}

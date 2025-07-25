package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrieNode.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final /* synthetic */ Object[] access$insertEntryAtIndex(Object[] objArr, int i, Object obj, Object obj2) {
        return insertEntryAtIndex(objArr, i, obj, obj2);
    }

    public static final /* synthetic */ Object[] access$removeEntryAtIndex(Object[] objArr, int i) {
        return removeEntryAtIndex(objArr, i);
    }

    public static final /* synthetic */ Object[] access$removeNodeAtIndex(Object[] objArr, int i) {
        return removeNodeAtIndex(objArr, i);
    }

    public static final /* synthetic */ Object[] access$replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode trieNode) {
        return replaceEntryWithNode(objArr, i, i2, trieNode);
    }

    public static final /* synthetic */ Object[] access$replaceNodeWithEntry(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        return replaceNodeWithEntry(objArr, i, i2, obj, obj2);
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        _ArraysJvm.m17389p(objArr, objArr2, 0, 0, i, 6, null);
        _ArraysJvm.m17393l(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final Object[] removeEntryAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        _ArraysJvm.m17389p(objArr, objArr2, 0, 0, i, 6, null);
        _ArraysJvm.m17393l(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] removeNodeAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        _ArraysJvm.m17389p(objArr, objArr2, 0, 0, i, 6, null);
        _ArraysJvm.m17393l(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode<?, ?> trieNode) {
        int i3 = i2 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        _ArraysJvm.m17389p(objArr, objArr2, 0, 0, i, 6, null);
        _ArraysJvm.m17393l(objArr, objArr2, i, i + 2, i2);
        objArr2[i3] = trieNode;
        _ArraysJvm.m17393l(objArr, objArr2, i3 + 1, i2, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        _ArraysJvm.m17393l(copyOf, copyOf, i + 2, i + 1, objArr.length);
        _ArraysJvm.m17393l(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}

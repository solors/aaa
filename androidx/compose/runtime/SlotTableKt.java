package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;

/* compiled from: SlotTable.kt */
@Metadata
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int NodeKey = 125;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    public static final /* synthetic */ int access$auxIndex(int[] iArr, int i) {
        return auxIndex(iArr, i);
    }

    public static final /* synthetic */ boolean access$containsAnyMark(int[] iArr, int i) {
        return containsAnyMark(iArr, i);
    }

    public static final /* synthetic */ boolean access$containsMark(int[] iArr, int i) {
        return containsMark(iArr, i);
    }

    public static final /* synthetic */ int access$dataAnchor(int[] iArr, int i) {
        return dataAnchor(iArr, i);
    }

    public static final /* synthetic */ List access$dataAnchors(int[] iArr, int i) {
        return dataAnchors(iArr, i);
    }

    public static final /* synthetic */ int access$groupSize(int[] iArr, int i) {
        return groupSize(iArr, i);
    }

    public static final /* synthetic */ List access$groupSizes(int[] iArr, int i) {
        return groupSizes(iArr, i);
    }

    public static final /* synthetic */ boolean access$hasAux(int[] iArr, int i) {
        return hasAux(iArr, i);
    }

    public static final /* synthetic */ boolean access$hasMark(int[] iArr, int i) {
        return hasMark(iArr, i);
    }

    public static final /* synthetic */ boolean access$hasObjectKey(int[] iArr, int i) {
        return hasObjectKey(iArr, i);
    }

    public static final /* synthetic */ boolean access$isNode(int[] iArr, int i) {
        return isNode(iArr, i);
    }

    public static final /* synthetic */ int access$key(int[] iArr, int i) {
        return key(iArr, i);
    }

    public static final /* synthetic */ List access$keys(int[] iArr, int i) {
        return keys(iArr, i);
    }

    public static final /* synthetic */ int access$nodeCount(int[] iArr, int i) {
        return nodeCount(iArr, i);
    }

    public static final /* synthetic */ List access$nodeCounts(int[] iArr, int i) {
        return nodeCounts(iArr, i);
    }

    public static final /* synthetic */ int access$nodeIndex(int[] iArr, int i) {
        return nodeIndex(iArr, i);
    }

    public static final /* synthetic */ int access$objectKeyIndex(int[] iArr, int i) {
        return objectKeyIndex(iArr, i);
    }

    public static final /* synthetic */ int access$parentAnchor(int[] iArr, int i) {
        return parentAnchor(iArr, i);
    }

    public static final /* synthetic */ List access$parentAnchors(int[] iArr, int i) {
        return parentAnchors(iArr, i);
    }

    public static final /* synthetic */ int access$search(ArrayList arrayList, int i, int i2) {
        return search(arrayList, i, i2);
    }

    public static final /* synthetic */ int access$slotAnchor(int[] iArr, int i) {
        return slotAnchor(iArr, i);
    }

    public static final void addAux(int[] iArr, int i) {
        int i2 = (i * 5) + 1;
        iArr[i2] = iArr[i2] | 268435456;
    }

    public static final int auxIndex(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    public static final boolean containsAnyMark(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsMark(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & ContainsMark_Mask) != 0) {
            return true;
        }
        return false;
    }

    public static final int countOneBits(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int dataAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final List<Integer> dataAnchors(int[] iArr, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(4, i);
        m16901u = _Ranges.m16901u(m16900v, 5);
        return slice(iArr, m16901u);
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return dataAnchors(iArr, i);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i, int i2, Functions<Anchor> functions) {
        int search = search(arrayList, i, i2);
        if (search < 0) {
            Anchor invoke = functions.invoke();
            arrayList.add(-(search + 1), invoke);
            return invoke;
        }
        Anchor anchor = arrayList.get(search);
        Intrinsics.checkNotNullExpressionValue(anchor, "get(location)");
        return anchor;
    }

    public static final int groupInfo(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    public static final int groupSize(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final List<Integer> groupSizes(int[] iArr, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(3, i);
        m16901u = _Ranges.m16901u(m16900v, 5);
        return slice(iArr, m16901u);
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return groupSizes(iArr, i);
    }

    public static final boolean hasAux(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasMark(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasObjectKey(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public static final void initGroup(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (z) {
            i5 = 1073741824;
        } else {
            i5 = 0;
        }
        if (z2) {
            i6 = 536870912;
        } else {
            i6 = 0;
        }
        if (z3) {
            i7 = 268435456;
        } else {
            i7 = 0;
        }
        int i8 = i * 5;
        iArr[i8 + 0] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    public static final boolean isNode(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public static final int key(int[] iArr, int i) {
        return iArr[i * 5];
    }

    public static final List<Integer> keys(int[] iArr, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(0, i);
        m16901u = _Ranges.m16901u(m16900v, 5);
        return slice(iArr, m16901u);
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return keys(iArr, i);
    }

    public static final int locationOf(ArrayList<Anchor> arrayList, int i, int i2) {
        int search = search(arrayList, i, i2);
        if (search < 0) {
            return -(search + 1);
        }
        return search;
    }

    public static final int nodeCount(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & NodeCount_Mask;
    }

    public static final List<Integer> nodeCounts(int[] iArr, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(1, i);
        m16901u = _Ranges.m16901u(m16900v, 5);
        List<Integer> slice = slice(iArr, m16901u);
        ArrayList arrayList = new ArrayList(slice.size());
        int size = slice.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(slice.get(i2).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return nodeCounts(iArr, i);
    }

    public static final int nodeIndex(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final int objectKeyIndex(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + countOneBits(iArr[i2 + 1] >> 30);
    }

    public static final int parentAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    public static final List<Integer> parentAnchors(int[] iArr, int i) {
        PrimitiveRanges m16900v;
        C37629d m16901u;
        m16900v = _Ranges.m16900v(2, i);
        m16901u = _Ranges.m16901u(m16900v, 5);
        return slice(iArr, m16901u);
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return parentAnchors(iArr, i);
    }

    public static final int search(ArrayList<Anchor> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int location$runtime_release = arrayList.get(i4).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i2;
            }
            int m17071j = Intrinsics.m17071j(location$runtime_release, i);
            if (m17071j < 0) {
                i3 = i4 + 1;
            } else if (m17071j > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : iterable) {
            arrayList.add(Integer.valueOf(iArr[num.intValue()]));
        }
        return arrayList;
    }

    public static final int slotAnchor(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + countOneBits(iArr[i2 + 1] >> 28);
    }

    public static final void updateContainsMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | ContainsMark_Mask;
        } else {
            iArr[i2] = iArr[i2] & (-67108865);
        }
    }

    public static final void updateDataAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    private static final void updateGroupKey(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 0] = i2;
    }

    public static final void updateGroupSize(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iArr[(i * 5) + 3] = i2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final void updateMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & (-134217729);
        }
    }

    public static final void updateNodeCount(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0 && i2 < NodeCount_Mask) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = (i * 5) + 1;
            iArr[i3] = i2 | (iArr[i3] & (-67108864));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final void updateParentAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }
}

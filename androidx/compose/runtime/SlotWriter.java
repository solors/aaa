package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._ArraysJvm;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

/* compiled from: SlotTable.kt */
@Metadata
/* loaded from: classes.dex */
public final class SlotWriter {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    @NotNull
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    @NotNull
    private final IntStack nodeCountStack;
    private int parent;
    @Nullable
    private PrioritySet pendingRecalculateMarks;
    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    @NotNull
    private final IntStack startStack;
    @NotNull
    private final SlotTable table;

    /* compiled from: SlotTable.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2) {
            int i2;
            int locationOf;
            int locationOf2;
            List<Anchor> m17166m;
            ArrayList arrayList;
            boolean z3;
            boolean isNode;
            int locationOf3;
            int i3;
            int parentAnchor;
            int groupSize = slotWriter.groupSize(i);
            int i4 = i + groupSize;
            int dataIndex = slotWriter.dataIndex(i);
            int dataIndex2 = slotWriter.dataIndex(i4);
            int i5 = dataIndex2 - dataIndex;
            boolean containsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i);
            slotWriter2.insertGroups(groupSize);
            slotWriter2.insertSlots(i5, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i4) {
                slotWriter.moveGroupGapTo(i4);
            }
            if (slotWriter.slotsGapStart < dataIndex2) {
                slotWriter.moveSlotGapTo(dataIndex2, i4);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            _ArraysJvm.m17395j(slotWriter.groups, iArr, currentGroup * 5, i * 5, i4 * 5);
            Object[] objArr = slotWriter2.slots;
            int i6 = slotWriter2.currentSlot;
            _ArraysJvm.m17393l(slotWriter.slots, objArr, i6, dataIndex, dataIndex2);
            int parent = slotWriter2.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i7 = currentGroup - i;
            int i8 = currentGroup + groupSize;
            int dataIndex3 = i6 - slotWriter2.dataIndex(iArr, currentGroup);
            int i9 = slotWriter2.slotsGapOwner;
            int i10 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i11 = i9;
            int i12 = currentGroup;
            while (true) {
                i2 = 0;
                if (i12 >= i8) {
                    break;
                }
                if (i12 != currentGroup) {
                    parentAnchor = SlotTableKt.parentAnchor(iArr, i12);
                    i3 = i8;
                    SlotTableKt.updateParentAnchor(iArr, i12, parentAnchor + i7);
                } else {
                    i3 = i8;
                }
                int dataIndex4 = slotWriter2.dataIndex(iArr, i12) + dataIndex3;
                if (i11 >= i12) {
                    i2 = slotWriter2.slotsGapStart;
                }
                int i13 = dataIndex3;
                SlotTableKt.updateDataAnchor(iArr, i12, slotWriter2.dataIndexToDataAnchor(dataIndex4, i2, i10, length));
                if (i12 == i11) {
                    i11++;
                }
                i12++;
                dataIndex3 = i13;
                i8 = i3;
            }
            int i14 = i8;
            slotWriter2.slotsGapOwner = i11;
            locationOf = SlotTableKt.locationOf(slotWriter.anchors, i, slotWriter.getSize$runtime_release());
            locationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i4, slotWriter.getSize$runtime_release());
            if (locationOf < locationOf2) {
                ArrayList arrayList2 = slotWriter.anchors;
                ArrayList arrayList3 = new ArrayList(locationOf2 - locationOf);
                for (int i15 = locationOf; i15 < locationOf2; i15++) {
                    Object obj = arrayList2.get(i15);
                    Intrinsics.checkNotNullExpressionValue(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i7);
                    arrayList3.add(anchor);
                }
                locationOf3 = SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release());
                slotWriter2.anchors.addAll(locationOf3, arrayList3);
                arrayList2.subList(locationOf, locationOf2).clear();
                arrayList = arrayList3;
            } else {
                m17166m = C37563v.m17166m();
                arrayList = m17166m;
            }
            int parent2 = slotWriter.parent(i);
            int i16 = 1;
            if (!z) {
                boolean removeGroups = slotWriter.removeGroups(i, groupSize);
                slotWriter.removeSlots(dataIndex, i5, i - 1);
                z3 = removeGroups;
            } else {
                if (parent2 >= 0) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    slotWriter.startGroup();
                    slotWriter.advanceBy(parent2 - slotWriter.getCurrentGroup());
                    slotWriter.startGroup();
                }
                slotWriter.advanceBy(i - slotWriter.getCurrentGroup());
                z3 = slotWriter.removeGroup();
                if (i2 != 0) {
                    slotWriter.skipToGroupEnd();
                    slotWriter.endGroup();
                    slotWriter.skipToGroupEnd();
                    slotWriter.endGroup();
                }
            }
            if (!z3) {
                int i17 = slotWriter2.nodeCount;
                isNode = SlotTableKt.isNode(iArr, currentGroup);
                if (!isNode) {
                    i16 = SlotTableKt.nodeCount(iArr, currentGroup);
                }
                slotWriter2.nodeCount = i17 + i16;
                if (z2) {
                    slotWriter2.currentGroup = i14;
                    slotWriter2.currentSlot = i6 + i5;
                }
                if (containsAnyGroupMarks) {
                    slotWriter2.updateContainsMark(parent);
                }
                return arrayList;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new ExceptionsH();
        }
    }

    public SlotWriter(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        this.slots = table.getSlots();
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - table.getGroupsSize();
        this.currentGroupEnd = table.getGroupsSize();
        this.slotsGapStart = table.getSlotsSize();
        this.slotsGapLen = this.slots.length - table.getSlotsSize();
        this.slotsGapOwner = table.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    private final int auxIndex(int[] iArr, int i) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i);
        groupInfo = SlotTableKt.groupInfo(iArr, i);
        countOneBits = SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final boolean childContainsAnyMarks(int i) {
        boolean containsAnyMark;
        int i2 = i + 1;
        int groupSize = i + groupSize(i);
        while (i2 < groupSize) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i2));
            if (containsAnyMark) {
                return true;
            }
            i2 += groupSize(i2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int i) {
        boolean containsAnyMark;
        if (i >= 0) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i));
            if (containsAnyMark) {
                return true;
            }
        }
        return false;
    }

    private final boolean containsGroupMark(int i) {
        boolean containsMark;
        if (i >= 0) {
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress(i));
            if (containsMark) {
                return true;
            }
        }
        return false;
    }

    private final int dataAnchorToDataIndex(int i, int i2, int i3) {
        if (i < 0) {
            return (i3 - i2) + i + 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int i) {
        return dataIndex(this.groups, groupIndexToAddress(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i) {
        if (i >= this.slotsGapStart) {
            return i + this.slotsGapLen;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        PrimitiveRanges m16900v;
        List m17562Q0;
        PrimitiveRanges m16900v2;
        List m17562Q02;
        List m17569J0;
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        m16900v = _Ranges.m16900v(0, this.groupGapStart);
        m17562Q0 = _Collections.m17562Q0(dataAnchors$default, m16900v);
        m16900v2 = _Ranges.m16900v(this.groupGapStart + this.groupGapLen, iArr.length / 5);
        m17562Q02 = _Collections.m17562Q0(dataAnchors$default, m16900v2);
        m17569J0 = _Collections.m17569J0(m17562Q0, m17562Q02);
        ArrayList arrayList = new ArrayList(m17569J0.size());
        int size = m17569J0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) m17569J0.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i, int i2, int i3) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i, this.groupGapStart);
        while (i3 < i2) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i3), parentIndexToAnchor);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i3));
            int i4 = groupSize + i3;
            fixParentAnchorsFor(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb2, int i) {
        int groupSize;
        int parentAnchor;
        int key;
        int nodeCount;
        int dataAnchor;
        int parentAnchor2;
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        sb2.append("Group(");
        if (i < 10) {
            sb2.append(' ');
        }
        if (i < 100) {
            sb2.append(' ');
        }
        if (i < 1000) {
            sb2.append(' ');
        }
        sb2.append(i);
        if (groupIndexToAddress != i) {
            sb2.append("(");
            sb2.append(groupIndexToAddress);
            sb2.append(")");
        }
        sb2.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb2.append(groupSize);
        boolean groupAsString$isStarted = groupAsString$isStarted(this, i);
        if (groupAsString$isStarted) {
            sb2.append('?');
        }
        sb2.append('^');
        parentAnchor = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb2.append(parentAnchorToIndex(parentAnchor));
        sb2.append(": key=");
        key = SlotTableKt.key(this.groups, groupIndexToAddress);
        sb2.append(key);
        sb2.append(", nodes=");
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        sb2.append(nodeCount);
        if (groupAsString$isStarted) {
            sb2.append('?');
        }
        sb2.append(", dataAnchor=");
        dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
        sb2.append(dataAnchor);
        sb2.append(", parentAnchor=");
        parentAnchor2 = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb2.append(parentAnchor2);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            sb2.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]);
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress + 1);
        if (dataIndex > slotIndex) {
            sb2.append(", [");
            for (int i2 = slotIndex; i2 < dataIndex; i2++) {
                if (i2 != slotIndex) {
                    sb2.append(", ");
                }
                sb2.append(String.valueOf(this.slots[dataIndexToDataAddress(i2)]));
            }
            sb2.append(']');
        }
        sb2.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i) {
        if (i < slotWriter.currentGroup && (i == slotWriter.parent || slotWriter.startStack.indexOf(i) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i)))) {
            return true;
        }
        return false;
    }

    private final int groupIndexToAddress(int i) {
        if (i >= this.groupGapStart) {
            return i + this.groupGapLen;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.currentGroup;
            moveGroupGapTo(i3);
            int i4 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                _ArraysJvm.m17395j(iArr, iArr2, 0, 0, i4 * 5);
                _ArraysJvm.m17395j(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.groups = iArr2;
                i5 = i8;
            }
            int i9 = this.currentGroupEnd;
            if (i9 >= i4) {
                this.currentGroupEnd = i9 + i;
            }
            int i10 = i4 + i;
            this.groupGapStart = i10;
            this.groupGapLen = i5 - i;
            if (i6 > 0) {
                i2 = dataIndex(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.slotsGapOwner >= i4) {
                i7 = this.slotsGapStart;
            }
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i2, i7, this.slotsGapLen, this.slots.length);
            for (int i11 = i4; i11 < i10; i11++) {
                SlotTableKt.updateDataAnchor(this.groups, i11, dataIndexToDataAnchor);
            }
            int i12 = this.slotsGapOwner;
            if (i12 >= i4) {
                this.slotsGapOwner = i12 + i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int i, int i2) {
        if (i > 0) {
            moveSlotGapTo(this.currentSlot, i2);
            int i3 = this.slotsGapStart;
            int i4 = this.slotsGapLen;
            if (i4 < i) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                _ArraysJvm.m17393l(objArr, objArr2, 0, 0, i3);
                _ArraysJvm.m17393l(objArr, objArr2, i3 + i7, i8, length);
                this.slots = objArr2;
                i4 = i7;
            }
            int i9 = this.currentSlotEnd;
            if (i9 >= i3) {
                this.currentSlotEnd = i9 + i;
            }
            this.slotsGapStart = i3 + i;
            this.slotsGapLen = i4 - i;
        }
    }

    private final List<Integer> keys() {
        boolean z;
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i = 0; i < size; i++) {
            Object obj = keys$default.get(i);
            ((Number) obj).intValue();
            int i2 = this.groupGapStart;
            if (i >= i2 && i < i2 + this.groupGapLen) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    private final void moveAnchors(int i, int i2, int i3) {
        int locationOf;
        int locationOf2;
        int i4 = i3 + i;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(locationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int anchorIndex = anchorIndex(anchor2);
                if (anchorIndex < i || anchorIndex >= i4) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(locationOf);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Anchor anchor3 = (Anchor) arrayList.get(i6);
            int anchorIndex2 = anchorIndex(anchor3) + i5;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i) {
        int parentAnchor;
        int i2 = this.groupGapLen;
        int i3 = this.groupGapStart;
        if (i3 != i) {
            boolean z = true;
            if (!this.anchors.isEmpty()) {
                updateAnchors(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.groups;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    _ArraysJvm.m17395j(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    _ArraysJvm.m17395j(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int capacity = getCapacity();
            if (i3 >= capacity) {
                z = false;
            }
            ComposerKt.runtimeCheck(z);
            while (i3 < capacity) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, i3);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), i);
                if (parentIndexToAnchor != parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i3, parentIndexToAnchor);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.groupGapStart = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int i, int i2) {
        int dataAnchor;
        boolean z;
        int dataAnchor2;
        boolean z2;
        int i3 = this.slotsGapLen;
        int i4 = this.slotsGapStart;
        int i5 = this.slotsGapOwner;
        if (i4 != i) {
            Object[] objArr = this.slots;
            if (i < i4) {
                _ArraysJvm.m17393l(objArr, objArr, i + i3, i, i4);
            } else {
                _ArraysJvm.m17393l(objArr, objArr, i4, i4 + i3, i + i3);
            }
            _ArraysJvm.m17383v(objArr, null, i, i + i3);
        }
        int min = Math.min(i2 + 1, getSize$runtime_release());
        if (i5 != min) {
            int length = this.slots.length - i3;
            if (min < i5) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i5);
                int i6 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (dataAnchor2 >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                        groupIndexToAddress++;
                        if (groupIndexToAddress == i6) {
                            groupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new ExceptionsH();
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i5);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (dataAnchor < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                        groupIndexToAddress3++;
                        if (groupIndexToAddress3 == this.groupGapStart) {
                            groupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new ExceptionsH();
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i;
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int parentAnchorToIndex(int i) {
        if (i <= -2) {
            return getSize$runtime_release() + i + 2;
        }
        return i;
    }

    private final int parentIndexToAnchor(int i, int i2) {
        if (i >= i2) {
            return -((getSize$runtime_release() - i) + 2);
        }
        return i;
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int i, int i2) {
        int locationOf;
        int i3 = i2 + i;
        locationOf = SlotTableKt.locationOf(this.anchors, i3, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i4 = locationOf + 1;
        boolean z = false;
        int i5 = 0;
        while (locationOf >= 0) {
            Anchor anchor = this.anchors.get(locationOf);
            Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int anchorIndex = anchorIndex(anchor2);
            if (anchorIndex < i) {
                break;
            }
            if (anchorIndex < i3) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = locationOf + 1;
                }
                i4 = locationOf;
            }
            locationOf--;
        }
        if (i4 < i5) {
            z = true;
        }
        if (z) {
            this.anchors.subList(i4, i5).clear();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i);
            if (!arrayList.isEmpty()) {
                z = removeAnchors(i, i2);
            }
            this.groupGapStart = i;
            this.groupGapLen += i2;
            int i3 = this.slotsGapOwner;
            if (i3 > i) {
                this.slotsGapOwner = Math.max(i, i3 - i2);
            }
            int i4 = this.currentGroupEnd;
            if (i4 >= this.groupGapStart) {
                this.currentGroupEnd = i4 - i2;
            }
            if (containsGroupMark(this.parent)) {
                updateContainsMark(this.parent);
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.slotsGapLen;
            int i5 = i + i2;
            moveSlotGapTo(i5, i3);
            this.slotsGapStart = i;
            this.slotsGapLen = i4 + i2;
            _ArraysJvm.m17383v(this.slots, null, i, i5);
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 - i2;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i) {
        int slotAnchor;
        if (i < getCapacity()) {
            slotAnchor = SlotTableKt.slotAnchor(iArr, i);
            return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
        }
        return this.slots.length - this.slotsGapLen;
    }

    private final void updateAnchors(int i, int i2) {
        int locationOf;
        int locationOf2;
        int i3;
        int capacity = getCapacity() - this.groupGapLen;
        if (i < i2) {
            for (locationOf2 = SlotTableKt.locationOf(this.anchors, i, capacity); locationOf2 < this.anchors.size(); locationOf2++) {
                Anchor anchor = this.anchors.get(locationOf2);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location$runtime_release = anchor2.getLocation$runtime_release();
                if (location$runtime_release < 0 && (i3 = location$runtime_release + capacity) < i2) {
                    anchor2.setLocation$runtime_release(i3);
                } else {
                    return;
                }
            }
            return;
        }
        for (locationOf = SlotTableKt.locationOf(this.anchors, i2, capacity); locationOf < this.anchors.size(); locationOf++) {
            Anchor anchor3 = this.anchors.get(locationOf);
            Intrinsics.checkNotNullExpressionValue(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location$runtime_release2 = anchor4.getLocation$runtime_release();
            if (location$runtime_release2 >= 0) {
                anchor4.setLocation$runtime_release(-(capacity - location$runtime_release2));
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int i) {
        if (i >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, null);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i);
        }
    }

    private final void updateContainsMarkNow(int i, PrioritySet prioritySet) {
        boolean containsMark;
        boolean z;
        int groupIndexToAddress = groupIndexToAddress(i);
        boolean childContainsAnyMarks = childContainsAnyMarks(i);
        containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark != childContainsAnyMarks) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SlotTableKt.updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(i);
            if (parent >= 0) {
                prioritySet.add(parent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        SlotTableKt.updateDataAnchor(iArr, i, dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateNodeOfGroup(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.groupIndexToAddress(r4)
            int[] r1 = r3.groups
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = androidx.compose.runtime.SlotTableKt.access$isNode(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.slots
            int[] r1 = r3.groups
            int r0 = r3.nodeIndex(r1, r0)
            int r0 = r3.dataIndexToDataAddress(r0)
            r4[r0] = r5
            return
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Updating the node of a group at "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            androidx.compose.runtime.ComposerKt.composeRuntimeError(r4)
            nd.i r4 = new nd.i
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void addToGroupSizeAlongSpine(int i, int i2) {
        int groupSize;
        int parentAnchor;
        while (i > 0) {
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, i);
            SlotTableKt.updateGroupSize(iArr, i, groupSize + i2);
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i);
            i = groupIndexToAddress(parentAnchorToIndex(parentAnchor));
        }
    }

    public final void advanceBy(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.insertCount <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i2 = this.currentGroup + i;
                if (i2 < this.parent || i2 > this.currentGroupEnd) {
                    z3 = false;
                }
                if (z3) {
                    this.currentGroup = i2;
                    int dataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
                    this.currentSlot = dataIndex;
                    this.currentSlotEnd = dataIndex;
                    return;
                }
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
                throw new ExceptionsH();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        throw new IllegalArgumentException("Cannot seek backwards".toString());
    }

    @NotNull
    public final Anchor anchor(int i) {
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i, getSize$runtime_release());
        if (search < 0) {
            if (i > this.groupGapStart) {
                i = -(getSize$runtime_release() - i);
            }
            Anchor anchor = new Anchor(i);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = arrayList.get(search);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int location$runtime_release = anchor.getLocation$runtime_release();
        if (location$runtime_release < 0) {
            return location$runtime_release + getSize$runtime_release();
        }
        return location$runtime_release;
    }

    public final void bashGroup$runtime_release() {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int endGroup() {
        boolean z;
        boolean isNode;
        int groupSize;
        int nodeCount;
        int i;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        int i2 = 1;
        int i3 = 0;
        if (this.insertCount > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.currentGroup;
        int i5 = this.currentGroupEnd;
        int i6 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i6);
        int i7 = this.nodeCount;
        int i8 = i4 - i6;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i8);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i7);
            int pop = this.nodeCountStack.pop();
            if (!isNode) {
                i2 = i7;
            }
            this.nodeCount = pop + i2;
            this.parent = parent(this.groups, i6);
        } else {
            if (i4 != i5) {
                i2 = 0;
            }
            if (i2 != 0) {
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i8);
                SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i7);
                int pop2 = this.startStack.pop();
                restoreCurrentGroupEnd();
                this.parent = pop2;
                int parent = parent(this.groups, i6);
                int pop3 = this.nodeCountStack.pop();
                this.nodeCount = pop3;
                if (parent == pop2) {
                    if (!isNode) {
                        i3 = i7 - nodeCount;
                    }
                    this.nodeCount = pop3 + i3;
                } else {
                    int i9 = i8 - groupSize;
                    if (isNode) {
                        i = 0;
                    } else {
                        i = i7 - nodeCount;
                    }
                    if (i9 != 0 || i != 0) {
                        while (parent != 0 && parent != pop2 && (i != 0 || i9 != 0)) {
                            int groupIndexToAddress2 = groupIndexToAddress(parent);
                            if (i9 != 0) {
                                groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i9);
                            }
                            if (i != 0) {
                                int[] iArr = this.groups;
                                nodeCount2 = SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                                SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i);
                            }
                            isNode2 = SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                            if (isNode2) {
                                i = 0;
                            }
                            parent = parent(this.groups, parent);
                        }
                    }
                    this.nodeCount += i;
                }
            } else {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
        }
        return i7;
    }

    public final void endInsert() {
        boolean z;
        int i = this.insertCount;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.insertCount = i2;
            if (i2 == 0) {
                if (this.nodeCountStack.getSize() != this.startStack.getSize()) {
                    z2 = false;
                }
                if (z2) {
                    restoreCurrentGroupEnd();
                    return;
                } else {
                    ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                    throw new ExceptionsH();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void ensureStarted(int i) {
        boolean z = true;
        if (this.insertCount <= 0) {
            int i2 = this.parent;
            if (i2 != i) {
                if (i < i2 || i >= this.currentGroupEnd) {
                    z = false;
                }
                if (z) {
                    int i3 = this.currentGroup;
                    int i4 = this.currentSlot;
                    int i5 = this.currentSlotEnd;
                    this.currentGroup = i;
                    startGroup();
                    this.currentGroup = i3;
                    this.currentSlot = i4;
                    this.currentSlotEnd = i5;
                    return;
                }
                throw new IllegalArgumentException(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int i) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            return this.slots[auxIndex(this.groups, groupIndexToAddress)];
        }
        return Composer.Companion.getEmpty();
    }

    public final int groupKey(int i) {
        int key;
        key = SlotTableKt.key(this.groups, groupIndexToAddress(i));
        return key;
    }

    @Nullable
    public final Object groupObjectKey(int i) {
        boolean hasObjectKey;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final int groupSize(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i));
        return groupSize;
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    @NotNull
    public final String groupsAsString() {
        StringBuilder sb2 = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            groupAsString(sb2, i);
            sb2.append('\n');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final boolean indexInCurrentGroup(int i) {
        return indexInGroup(i, this.currentGroup);
    }

    public final boolean indexInGroup(int i, int i2) {
        int capacity;
        int groupSize;
        if (i2 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (i2 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i2);
            } else {
                int indexOf = this.startStack.indexOf(i2);
                if (indexOf < 0) {
                    groupSize = groupSize(i2);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + i2;
        }
        if (i <= i2 || i >= capacity) {
            return false;
        }
        return true;
    }

    public final boolean indexInParent(int i) {
        int i2 = this.parent;
        if ((i > i2 && i < this.currentGroupEnd) || (i2 == 0 && i == 0)) {
            return true;
        }
        return false;
    }

    public final void insertAux(@Nullable Object obj) {
        boolean z;
        boolean hasAux;
        boolean z2 = false;
        if (this.insertCount >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.parent;
            int groupIndexToAddress = groupIndexToAddress(i);
            hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
            if (!hasAux) {
                insertSlots(1, i);
                int auxIndex = auxIndex(this.groups, groupIndexToAddress);
                int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
                int i2 = this.currentSlot;
                if (i2 > auxIndex) {
                    int i3 = i2 - auxIndex;
                    if (i3 < 3) {
                        z2 = true;
                    }
                    if (z2) {
                        if (i3 > 1) {
                            Object[] objArr = this.slots;
                            objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
                        }
                        Object[] objArr2 = this.slots;
                        objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
                    } else {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                }
                SlotTableKt.addAux(this.groups, groupIndexToAddress);
                this.slots[dataIndexToDataAddress] = obj;
                this.currentSlot++;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new ExceptionsH();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new ExceptionsH();
    }

    public final void insertParentGroup(int i) {
        boolean z;
        int dataAnchor;
        int nodeCount;
        int groupSize;
        int i2 = 0;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (isGroupEnd()) {
                beginInsert();
                startGroup(i);
                endGroup();
                endInsert();
                return;
            }
            int i3 = this.currentGroup;
            int parent = parent(this.groups, i3);
            int groupSize2 = parent + groupSize(parent);
            int i4 = groupSize2 - i3;
            int i5 = i3;
            while (i5 < groupSize2) {
                int groupIndexToAddress = groupIndexToAddress(i5);
                nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                i2 += nodeCount;
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                i5 += groupSize;
            }
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress(i3));
            beginInsert();
            insertGroups(1);
            endInsert();
            int groupIndexToAddress2 = groupIndexToAddress(i3);
            SlotTableKt.initGroup(this.groups, groupIndexToAddress2, i, false, false, false, parent, dataAnchor);
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, i4 + 1);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress2, i2);
            addToGroupSizeAlongSpine(groupIndexToAddress(parent), 1);
            fixParentAnchorsFor(parent, groupSize2, i3);
            this.currentGroup = groupSize2;
            return;
        }
        ComposerKt.composeRuntimeError("Writer cannot be inserting".toString());
        throw new ExceptionsH();
    }

    public final boolean isGroupEnd() {
        if (this.currentGroup == this.currentGroupEnd) {
            return true;
        }
        return false;
    }

    public final boolean isNode() {
        boolean isNode;
        int i = this.currentGroup;
        if (i < this.currentGroupEnd) {
            isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
            if (isNode) {
                return true;
            }
        }
        return false;
    }

    public final void markGroup(int i) {
        boolean hasMark;
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i);
        hasMark = SlotTableKt.hasMark(this.groups, groupIndexToAddress);
        if (!hasMark) {
            SlotTableKt.updateMark(this.groups, groupIndexToAddress, true);
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
            if (!containsMark) {
                updateContainsMark(parent(i));
            }
        }
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(table, "table");
        if (this.insertCount > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList = this.anchors;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                this.groups = groups;
                this.slots = slots;
                this.anchors = table.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
                return this.anchors;
            }
            SlotWriter openWriter = table.openWriter();
            try {
                return Companion.moveGroup(openWriter, i, this, true, true);
            } finally {
                openWriter.close();
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void moveGroup(int i) {
        boolean z;
        boolean z2;
        int groupSize;
        int i2;
        int groupSize2;
        boolean z3;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i3 = this.currentGroup;
                int i4 = this.parent;
                int i5 = this.currentGroupEnd;
                int i6 = i3;
                for (int i7 = i; i7 > 0; i7--) {
                    groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i6));
                    i6 += groupSize2;
                    if (i6 <= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
                    }
                }
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i6));
                int i8 = this.currentSlot;
                int dataIndex = dataIndex(this.groups, groupIndexToAddress(i6));
                int i9 = i6 + groupSize;
                int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i9));
                int i10 = dataIndex2 - dataIndex;
                insertSlots(i10, Math.max(this.currentGroup - 1, 0));
                insertGroups(groupSize);
                int[] iArr = this.groups;
                int groupIndexToAddress = groupIndexToAddress(i9) * 5;
                _ArraysJvm.m17395j(iArr, iArr, groupIndexToAddress(i3) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
                if (i10 > 0) {
                    Object[] objArr = this.slots;
                    _ArraysJvm.m17393l(objArr, objArr, i8, dataIndexToDataAddress(dataIndex + i10), dataIndexToDataAddress(dataIndex2 + i10));
                }
                int i11 = dataIndex + i10;
                int i12 = i11 - i8;
                int i13 = this.slotsGapStart;
                int i14 = this.slotsGapLen;
                int length = this.slots.length;
                int i15 = this.slotsGapOwner;
                int i16 = i3 + groupSize;
                int i17 = i3;
                while (i17 < i16) {
                    int groupIndexToAddress2 = groupIndexToAddress(i17);
                    int i18 = i13;
                    int dataIndex3 = dataIndex(iArr, groupIndexToAddress2) - i12;
                    int i19 = i12;
                    if (i15 < groupIndexToAddress2) {
                        i2 = 0;
                    } else {
                        i2 = i18;
                    }
                    updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex3, i2, i14, length));
                    i17++;
                    i13 = i18;
                    i12 = i19;
                }
                moveAnchors(i9, i3, groupSize);
                if (!removeGroups(i9, groupSize)) {
                    fixParentAnchorsFor(i4, this.currentGroupEnd, i3);
                    if (i10 > 0) {
                        removeSlots(i11, i10, i9 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                throw new ExceptionsH();
            }
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        throw new IllegalArgumentException("Cannot move a group while inserting".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (groupSize(r9.currentGroup + r10) == 1) goto L5;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r10, @org.jetbrains.annotations.NotNull androidx.compose.runtime.SlotTable r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r9.insertCount
            if (r0 > 0) goto L14
            int r0 = r9.currentGroup
            int r0 = r0 + r10
            int r0 = r9.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r9.currentGroup
            int r1 = r9.currentSlot
            int r2 = r9.currentSlotEnd
            r9.advanceBy(r10)
            r9.startGroup()
            r9.beginInsert()
            androidx.compose.runtime.SlotWriter r10 = r11.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.Companion     // Catch: java.lang.Throwable -> L46
            r7 = 0
            r8 = 1
            r4 = r10
            r5 = r12
            r6 = r9
            java.util.List r11 = androidx.compose.runtime.SlotWriter.Companion.access$moveGroup(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L46
            r10.close()
            r9.endInsert()
            r9.endGroup()
            r9.currentGroup = r0
            r9.currentSlot = r1
            r9.currentSlotEnd = r2
            return r11
        L46:
            r11 = move-exception
            r10.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    @NotNull
    public final List<Anchor> moveTo(@NotNull Anchor anchor, int i, @NotNull SlotWriter writer) {
        boolean z;
        boolean z2;
        boolean z3;
        int nodeCount;
        boolean z4;
        int groupSize;
        boolean isNode;
        int nodeCount2;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        boolean z5 = true;
        if (writer.insertCount > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.insertCount == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (anchor.getValid()) {
                    int anchorIndex = anchorIndex(anchor) + i;
                    int i2 = this.currentGroup;
                    if (i2 <= anchorIndex && anchorIndex < this.currentGroupEnd) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        int parent = parent(anchorIndex);
                        int groupSize2 = groupSize(anchorIndex);
                        if (isNode(anchorIndex)) {
                            nodeCount = 1;
                        } else {
                            nodeCount = nodeCount(anchorIndex);
                        }
                        List<Anchor> moveGroup = Companion.moveGroup(this, anchorIndex, writer, false, false);
                        updateContainsMark(parent);
                        if (nodeCount > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        while (parent >= i2) {
                            int groupIndexToAddress = groupIndexToAddress(parent);
                            int[] iArr = this.groups;
                            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
                            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
                            if (z4) {
                                isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
                                if (isNode) {
                                    z4 = false;
                                } else {
                                    int[] iArr2 = this.groups;
                                    nodeCount2 = SlotTableKt.nodeCount(iArr2, groupIndexToAddress);
                                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, nodeCount2 - nodeCount);
                                }
                            }
                            parent = parent(parent);
                        }
                        if (z4) {
                            if (this.nodeCount < nodeCount) {
                                z5 = false;
                            }
                            ComposerKt.runtimeCheck(z5);
                            this.nodeCount -= nodeCount;
                        }
                        return moveGroup;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Nullable
    public final Object node(int i) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i));
        return nodeCount;
    }

    public final int parent(int i) {
        return parent(this.groups, i);
    }

    public final boolean removeGroup() {
        boolean z;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.currentGroup;
            int i2 = this.currentSlot;
            int skipGroup = skipGroup();
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                    prioritySet.takeMax();
                }
            }
            boolean removeGroups = removeGroups(i, this.currentGroup - i);
            removeSlots(i2, this.currentSlot - i2, i - 1);
            this.currentGroup = i;
            this.currentSlot = i2;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    public final void reset() {
        boolean z;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new ExceptionsH();
    }

    public final void seek(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(@Nullable Object obj) {
        int i = this.currentSlot;
        if (i <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new ExceptionsH();
        }
    }

    @Nullable
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i2 = i + groupSize;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (!isNode) {
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
            return nodeCount;
        }
        return 1;
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor, int i) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return slot(anchorIndex(anchor), i);
    }

    public final void startData(int i, @Nullable Object obj, @Nullable Object obj2) {
        startGroup(i, obj, false, obj2);
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            Composer.Companion companion = Composer.Companion;
            startGroup(0, companion.getEmpty(), false, companion.getEmpty());
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }

    public final void startNode(@Nullable Object obj) {
        startGroup(125, obj, true, Composer.Companion.getEmpty());
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    @Nullable
    public final Object update(@Nullable Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(@Nullable Object obj) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new ExceptionsH();
        }
    }

    public final void updateNode(@Nullable Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(@Nullable Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        int dataAnchor;
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        while (i2 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i2);
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (dataIndex >= i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (dataIndex <= length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (dataAnchor < 0 && !z4) {
                        if (i == i2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            throw new IllegalStateException(("Expected the slot gap owner to be " + i + " found gap at " + i2).toString());
                        }
                    }
                    i2++;
                    i3 = dataIndex;
                } else {
                    throw new IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i2).toString());
                }
            } else {
                throw new IllegalStateException(("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + dataIndex).toString());
            }
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int parentAnchor;
        boolean z;
        boolean z2;
        int parentAnchor2;
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < i) {
                parentAnchor2 = SlotTableKt.parentAnchor(this.groups, i3);
                if (parentAnchor2 <= -2) {
                    z3 = false;
                }
                if (z3) {
                    i3++;
                } else {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i3).toString());
                }
            } else {
                for (int i4 = i2 + i; i4 < capacity; i4++) {
                    parentAnchor = SlotTableKt.parentAnchor(this.groups, i4);
                    if (parentAnchorToIndex(parentAnchor) < i) {
                        if (parentAnchor > -2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i4).toString());
                        }
                    } else {
                        if (parentAnchor <= -2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i4).toString());
                        }
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        int dataAnchor;
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        dataAnchor = SlotTableKt.dataAnchor(iArr, i);
        return dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
    }

    public final boolean isNode(int i) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
        return isNode;
    }

    public final int parent(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    @Nullable
    public final Object slot(int i, int i2) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        boolean z = true;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        int i3 = i2 + slotIndex;
        if (slotIndex > i3 || i3 >= dataIndex) {
            z = false;
        }
        if (!z) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i3)];
    }

    public final void startData(int i, @Nullable Object obj) {
        startGroup(i, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(@Nullable Object obj, @Nullable Object obj2) {
        startGroup(125, obj, true, obj2);
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    private final int parent(int[] iArr, int i) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i));
        return parentAnchorToIndex(parentAnchor);
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    @Nullable
    public final Object set(int i, @Nullable Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        boolean z = true;
        int i2 = slotIndex + i;
        if ((i2 < slotIndex || i2 >= dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1))) ? false : false) {
            int dataIndexToDataAddress = dataIndexToDataAddress(i2);
            Object[] objArr = this.slots;
            Object obj2 = objArr[dataIndexToDataAddress];
            objArr[dataIndexToDataAddress] = obj;
            return obj2;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i + " for group " + this.currentGroup).toString());
        throw new ExceptionsH();
    }

    public final void startGroup(int i) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i, @Nullable Object obj) {
        startGroup(i, obj, false, Composer.Companion.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i, Object obj, boolean z, Object obj2) {
        int nodeCount;
        int groupSize;
        int i2;
        byte b = this.insertCount > 0 ? (byte) 1 : (byte) 0;
        this.nodeCountStack.push(this.nodeCount);
        if (b != 0) {
            insertGroups(1);
            int i3 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i3);
            Composer.Companion companion = Composer.Companion;
            int i4 = obj != companion.getEmpty() ? 1 : 0;
            int i5 = (z || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i, z, i4, i5, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i6 = (z ? 1 : 0) + i4 + i5;
            if (i6 > 0) {
                insertSlots(i6, i3);
                Object[] objArr = this.slots;
                int i7 = this.currentSlot;
                if (z) {
                    objArr[i7] = obj2;
                    i7++;
                }
                if (i4 != 0) {
                    objArr[i7] = obj;
                    i7++;
                }
                if (i5 != 0) {
                    objArr[i7] = obj2;
                    i7++;
                }
                this.currentSlot = i7;
            }
            this.nodeCount = 0;
            i2 = i3 + 1;
            this.parent = i3;
            this.currentGroup = i2;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i8 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i8);
            if (!Intrinsics.m17075f(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i8;
            this.currentGroup = i8 + 1;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i2 = i8 + groupSize;
        }
        this.currentGroupEnd = i2;
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }
}

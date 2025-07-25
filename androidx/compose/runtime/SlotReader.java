package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlotTable.kt */
@Metadata
/* loaded from: classes.dex */
public final class SlotReader {
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    @NotNull
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    @NotNull
    private final Object[] slots;
    private final int slotsSize;
    @NotNull
    private final SlotTable table;

    public SlotReader(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = table.getSlots();
        this.slotsSize = table.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.currentGroup;
        }
        return slotReader.anchor(i);
    }

    private final Object aux(int[] iArr, int i) {
        boolean hasAux;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(iArr, i);
        if (hasAux) {
            Object[] objArr = this.slots;
            auxIndex = SlotTableKt.auxIndex(iArr, i);
            return objArr[auxIndex];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        boolean hasObjectKey;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(iArr, i);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, i);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    @NotNull
    public final Anchor anchor(int i) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int search = SlotTableKt.search(anchors$runtime_release, i, this.groupsSize);
        if (search < 0) {
            Anchor anchor = new Anchor(i);
            anchors$runtime_release.add(-(search + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(search);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.table.close$runtime_release(this);
    }

    public final boolean containsMark(int i) {
        boolean containsMark;
        containsMark = SlotTableKt.containsMark(this.groups, i);
        return containsMark;
    }

    public final void endEmpty() {
        boolean z;
        int i = this.emptyCount;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.emptyCount = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void endGroup() {
        boolean z;
        int parentAnchor;
        int groupSize;
        int i;
        if (this.emptyCount == 0) {
            if (this.currentGroup == this.currentEnd) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
                this.parent = parentAnchor;
                if (parentAnchor >= 0) {
                    groupSize = SlotTableKt.groupSize(this.groups, parentAnchor);
                    i = parentAnchor + groupSize;
                } else {
                    i = this.groupsSize;
                }
                this.currentEnd = i;
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        int key;
        boolean isNode;
        int nodeCount;
        int groupSize;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i = this.currentGroup;
        int i2 = 0;
        while (i < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i);
            Object objectKey = objectKey(this.groups, i);
            isNode = SlotTableKt.isNode(this.groups, i);
            if (!isNode) {
                nodeCount = SlotTableKt.nodeCount(this.groups, i);
            } else {
                nodeCount = 1;
            }
            arrayList.add(new KeyInfo(key, objectKey, i, nodeCount, i2));
            groupSize = SlotTableKt.groupSize(this.groups, i);
            i += groupSize;
            i2++;
        }
        return arrayList;
    }

    public final void forEachData$runtime_release(int i, @NotNull Function2<? super Integer, Object, Unit> block) {
        int slotAnchor;
        int slotsSize;
        Intrinsics.checkNotNullParameter(block, "block");
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i2 = i + 1;
        if (i2 < this.table.getGroupsSize()) {
            slotsSize = SlotTableKt.dataAnchor(this.table.getGroups(), i2);
        } else {
            slotsSize = this.table.getSlotsSize();
        }
        for (int i3 = slotAnchor; i3 < slotsSize; i3++) {
            block.mo105910invoke(Integer.valueOf(i3 - slotAnchor), this.slots[i3]);
        }
    }

    @Nullable
    public final Object get(int i) {
        int i2 = this.currentSlot + i;
        if (i2 < this.currentSlotEnd) {
            return this.slots[i2];
        }
        return Composer.Companion.getEmpty();
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    @Nullable
    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int key;
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i);
            return key;
        }
        return 0;
    }

    @Nullable
    public final Object getGroupNode() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return node(this.groups, i);
        }
        return null;
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int getGroupSlotCount() {
        int slotAnchor;
        int i;
        int i2 = this.currentGroup;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i3 = i2 + 1;
        if (i3 < this.groupsSize) {
            i = SlotTableKt.dataAnchor(this.groups, i3);
        } else {
            i = this.slotsSize;
        }
        return i - slotAnchor;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i - slotAnchor;
    }

    public final boolean getInEmpty() {
        if (this.emptyCount > 0) {
            return true;
        }
        return false;
    }

    public final int getNodeCount() {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, this.currentGroup);
        return nodeCount;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int nodeCount;
        int i = this.parent;
        if (i >= 0) {
            nodeCount = SlotTableKt.nodeCount(this.groups, i);
            return nodeCount;
        }
        return 0;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        int slotAnchor;
        int i = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i - slotAnchor;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int i) {
        return aux(this.groups, i);
    }

    public final int groupEnd(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        return i + groupSize;
    }

    @Nullable
    public final Object groupGet(int i) {
        return groupGet(this.currentGroup, i);
    }

    public final int groupKey(int i) {
        int key;
        key = SlotTableKt.key(this.groups, i);
        return key;
    }

    @Nullable
    public final Object groupObjectKey(int i) {
        return objectKey(this.groups, i);
    }

    public final int groupSize(int i) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        return groupSize;
    }

    public final boolean hasMark(int i) {
        boolean hasMark;
        hasMark = SlotTableKt.hasMark(this.groups, i);
        return hasMark;
    }

    public final boolean hasObjectKey(int i) {
        boolean hasObjectKey;
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, i);
        return hasObjectKey;
    }

    public final boolean isGroupEnd() {
        if (!getInEmpty() && this.currentGroup != this.currentEnd) {
            return false;
        }
        return true;
    }

    public final boolean isNode() {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
        return isNode;
    }

    @Nullable
    public final Object next() {
        int i;
        if (this.emptyCount <= 0 && (i = this.currentSlot) < this.currentSlotEnd) {
            Object[] objArr = this.slots;
            this.currentSlot = i + 1;
            return objArr[i];
        }
        return Composer.Companion.getEmpty();
    }

    @Nullable
    public final Object node(int i) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i);
        if (isNode) {
            return node(this.groups, i);
        }
        return null;
    }

    public final int nodeCount(int i) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, i);
        return nodeCount;
    }

    public final int parent(int i) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(this.groups, i);
        return parentAnchor;
    }

    public final int parentOf(int i) {
        boolean z;
        int parentAnchor;
        if (i >= 0 && i < this.groupsSize) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i);
            return parentAnchor;
        }
        throw new IllegalArgumentException(("Invalid group index " + i).toString());
    }

    public final void reposition(int i) {
        boolean z;
        int i2;
        int groupSize;
        if (this.emptyCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.currentGroup = i;
            if (i < this.groupsSize) {
                i2 = SlotTableKt.parentAnchor(this.groups, i);
            } else {
                i2 = -1;
            }
            this.parent = i2;
            if (i2 >= 0) {
                groupSize = SlotTableKt.groupSize(this.groups, i2);
                this.currentEnd = i2 + groupSize;
            } else {
                this.currentEnd = this.groupsSize;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    public final void restoreParent(int i) {
        int groupSize;
        boolean z;
        groupSize = SlotTableKt.groupSize(this.groups, i);
        int i2 = groupSize + i;
        int i3 = this.currentGroup;
        if (i3 >= i && i3 <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.parent = i;
            this.currentEnd = i2;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i + " is not a parent of " + i3).toString());
    }

    public final int skipGroup() {
        boolean z;
        boolean isNode;
        int groupSize;
        int i = 1;
        if (this.emptyCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (!isNode) {
                i = SlotTableKt.nodeCount(this.groups, this.currentGroup);
            }
            int i2 = this.currentGroup;
            groupSize = SlotTableKt.groupSize(this.groups, i2);
            this.currentGroup = i2 + groupSize;
            return i;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    public final void skipToGroupEnd() {
        boolean z;
        if (this.emptyCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.currentGroup = this.currentEnd;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    public final void startGroup() {
        int parentAnchor;
        boolean z;
        int groupSize;
        int slotAnchor;
        int dataAnchor;
        if (this.emptyCount <= 0) {
            parentAnchor = SlotTableKt.parentAnchor(this.groups, this.currentGroup);
            if (parentAnchor == this.parent) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = this.currentGroup;
                this.parent = i;
                groupSize = SlotTableKt.groupSize(this.groups, i);
                this.currentEnd = i + groupSize;
                int i2 = this.currentGroup;
                int i3 = i2 + 1;
                this.currentGroup = i3;
                slotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
                this.currentSlot = slotAnchor;
                if (i2 < this.groupsSize - 1) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, i3);
                } else {
                    dataAnchor = this.slotsSize;
                }
                this.currentSlotEnd = dataAnchor;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void startNode() {
        boolean isNode;
        if (this.emptyCount <= 0) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (isNode) {
                startGroup();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    @NotNull
    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    private final Object node(int[] iArr, int i) {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(iArr, i);
        if (isNode) {
            Object[] objArr = this.slots;
            nodeIndex = SlotTableKt.nodeIndex(iArr, i);
            return objArr[nodeIndex];
        }
        return Composer.Companion.getEmpty();
    }

    @Nullable
    public final Object groupGet(int i, int i2) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i3 = i + 1;
        int i4 = slotAnchor + i2;
        return i4 < (i3 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i3) : this.slotsSize) ? this.slots[i4] : Composer.Companion.getEmpty();
    }

    public final int groupKey(@NotNull Anchor anchor) {
        int key;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            key = SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
            return key;
        }
        return 0;
    }

    public final boolean isNode(int i) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i);
        return isNode;
    }
}

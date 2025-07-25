package androidx.compose.runtime;

import ae.KMarkers;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import com.ironsource.C21114v8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

/* compiled from: SlotTable.kt */
@Metadata
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMarkers {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private int version;
    private boolean writer;
    @NotNull
    private int[] groups = new int[0];
    @NotNull
    private Object[] slots = new Object[0];
    @NotNull
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.access$dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb2, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i);
        sb2.append(") key=");
        sb2.append(SlotTableKt.access$key(this.groups, i));
        int access$groupSize = SlotTableKt.access$groupSize(this.groups, i);
        sb2.append(", nodes=");
        sb2.append(SlotTableKt.access$nodeCount(this.groups, i));
        sb2.append(", size=");
        sb2.append(access$groupSize);
        if (SlotTableKt.access$hasMark(this.groups, i)) {
            sb2.append(", mark");
        }
        if (SlotTableKt.access$containsMark(this.groups, i)) {
            sb2.append(", contains mark");
        }
        int emitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int i4 = i + 1;
        int emitGroup$dataIndex2 = emitGroup$dataIndex(this, i4);
        if (emitGroup$dataIndex >= 0 && emitGroup$dataIndex <= emitGroup$dataIndex2) {
            z = true;
        }
        if (z && emitGroup$dataIndex2 <= this.slotsSize) {
            if (SlotTableKt.access$hasObjectKey(this.groups, i)) {
                sb2.append(" objectKey=" + this.slots[SlotTableKt.access$objectKeyIndex(this.groups, i)]);
            }
            if (SlotTableKt.access$isNode(this.groups, i)) {
                sb2.append(" node=" + this.slots[SlotTableKt.access$nodeIndex(this.groups, i)]);
            }
            if (SlotTableKt.access$hasAux(this.groups, i)) {
                sb2.append(" aux=" + this.slots[SlotTableKt.access$auxIndex(this.groups, i)]);
            }
            int access$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, i);
            if (access$slotAnchor < emitGroup$dataIndex2) {
                sb2.append(", slots=[");
                sb2.append(access$slotAnchor);
                sb2.append(": ");
                for (int i5 = access$slotAnchor; i5 < emitGroup$dataIndex2; i5++) {
                    if (i5 != access$slotAnchor) {
                        sb2.append(", ");
                    }
                    sb2.append(String.valueOf(this.slots[i5]));
                }
                sb2.append(C21114v8.C21123i.f54139e);
            }
        } else {
            sb2.append(", *invalid data offsets " + emitGroup$dataIndex + '-' + emitGroup$dataIndex2 + '*');
        }
        sb2.append('\n');
        int i6 = i + access$groupSize;
        while (i4 < i6) {
            i4 += emitGroup(sb2, i4, i2 + 1);
        }
        return access$groupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        if (i >= slotTable.groupsSize) {
            return slotTable.slotsSize;
        }
        return SlotTableKt.access$dataAnchor(slotTable.groups, i);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i) {
        while (i > 0) {
            Iterator<Object> it = new DataIterator(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) next;
                }
            }
            i = SlotTableKt.access$parentAnchor(this.groups, i);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.access$groupSizes(this.groups, this.groupsSize * 5);
    }

    private final boolean invalidateGroup(int i) {
        while (i >= 0) {
            Iterator<Object> it = new DataIterator(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    recomposeScopeImpl.setRequiresRecompose(true);
                    if (recomposeScopeImpl.invalidateForResult(null) == InvalidationResult.IGNORED) {
                        return false;
                    }
                    return true;
                }
            }
            i = SlotTableKt.access$parentAnchor(this.groups, i);
        }
        return false;
    }

    /* renamed from: invalidateGroupsWithKey$lambda-14$scanGroup */
    private static final void m107180invalidateGroupsWithKey$lambda14$scanGroup(SlotReader slotReader, int i, List<Anchor> list, Ref ref, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        if (slotReader.getGroupKey() == i) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
            if (ref.f99319b) {
                RecomposeScopeImpl findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
                if (findEffectiveRecomposeScope != null) {
                    list2.add(findEffectiveRecomposeScope);
                } else {
                    ref.f99319b = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            m107180invalidateGroupsWithKey$lambda14$scanGroup(slotReader, i, list, ref, slotTable, list2);
        }
        slotReader.endGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.access$keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.access$nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.access$parentAnchors(this.groups, this.groupsSize * 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    private static final int verifyWellFormed$validateGroup(C37607l0 c37607l0, SlotTable slotTable, int i, int i2) {
        ?? r5;
        ?? r52;
        ?? r12;
        int access$dataAnchor;
        ?? r53;
        ?? r54;
        ?? r55;
        ?? r122;
        ?? r1;
        ?? r6;
        ?? r2;
        int i3 = c37607l0.f99325b;
        int i4 = i3 + 1;
        c37607l0.f99325b = i4;
        int access$parentAnchor = SlotTableKt.access$parentAnchor(slotTable.groups, i3);
        boolean z = false;
        if (access$parentAnchor == i) {
            r5 = true;
        } else {
            r5 = false;
        }
        if (r5 != false) {
            int access$groupSize = SlotTableKt.access$groupSize(slotTable.groups, i3) + i3;
            if (access$groupSize <= slotTable.groupsSize) {
                r52 = true;
            } else {
                r52 = false;
            }
            if (r52 != false) {
                if (access$groupSize <= i2) {
                    r12 = true;
                } else {
                    r12 = false;
                }
                if (r12 != false) {
                    int access$dataAnchor2 = SlotTableKt.access$dataAnchor(slotTable.groups, i3);
                    if (i3 >= slotTable.groupsSize - 1) {
                        access$dataAnchor = slotTable.slotsSize;
                    } else {
                        access$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.groups, i4);
                    }
                    if (access$dataAnchor <= slotTable.slots.length) {
                        r53 = true;
                    } else {
                        r53 = false;
                    }
                    if (r53 != false) {
                        if (access$dataAnchor2 <= access$dataAnchor) {
                            r54 = true;
                        } else {
                            r54 = false;
                        }
                        if (r54 != false) {
                            if (SlotTableKt.access$slotAnchor(slotTable.groups, i3) <= access$dataAnchor) {
                                r55 = true;
                            } else {
                                r55 = false;
                            }
                            if (r55 != false) {
                                if (access$dataAnchor - access$dataAnchor2 >= (SlotTableKt.access$isNode(slotTable.groups, i3) ? 1 : 0) + (SlotTableKt.access$hasObjectKey(slotTable.groups, i3) ? 1 : 0) + (SlotTableKt.access$hasAux(slotTable.groups, i3) ? 1 : 0)) {
                                    r122 = true;
                                } else {
                                    r122 = false;
                                }
                                if (r122 != false) {
                                    boolean access$isNode = SlotTableKt.access$isNode(slotTable.groups, i3);
                                    if (access$isNode && slotTable.slots[SlotTableKt.access$nodeIndex(slotTable.groups, i3)] == null) {
                                        r1 = false;
                                    } else {
                                        r1 = true;
                                    }
                                    if (r1 != false) {
                                        int i5 = 0;
                                        while (c37607l0.f99325b < access$groupSize) {
                                            i5 += verifyWellFormed$validateGroup(c37607l0, slotTable, i3, access$groupSize);
                                        }
                                        int access$nodeCount = SlotTableKt.access$nodeCount(slotTable.groups, i3);
                                        int access$groupSize2 = SlotTableKt.access$groupSize(slotTable.groups, i3);
                                        if (access$nodeCount == i5) {
                                            r6 = true;
                                        } else {
                                            r6 = false;
                                        }
                                        if (r6 != false) {
                                            int i6 = c37607l0.f99325b - i3;
                                            if (access$groupSize2 == i6) {
                                                r2 = true;
                                            } else {
                                                r2 = false;
                                            }
                                            if (r2 != false) {
                                                if (SlotTableKt.access$containsAnyMark(slotTable.groups, i3)) {
                                                    if (i3 <= 0 || SlotTableKt.access$containsMark(slotTable.groups, i)) {
                                                        z = true;
                                                    }
                                                    if (!z) {
                                                        throw new IllegalStateException(("Expected group " + i + " to record it contains a mark because " + i3 + " does").toString());
                                                    }
                                                }
                                                if (access$isNode) {
                                                    return 1;
                                                }
                                                return i5;
                                            }
                                            throw new IllegalStateException(("Incorrect slot count detected at " + i3 + ", expected " + access$groupSize2 + ", received " + i6).toString());
                                        }
                                        throw new IllegalStateException(("Incorrect node count detected at " + i3 + ", expected " + access$nodeCount + ", received " + i5).toString());
                                    }
                                    throw new IllegalStateException(("No node recorded for a node group at " + i3).toString());
                                }
                                throw new IllegalStateException(("Not enough slots added for group " + i3).toString());
                            }
                            throw new IllegalStateException(("Slots start out of range at " + i3).toString());
                        }
                        throw new IllegalStateException(("Invalid data anchor at " + i3).toString());
                    }
                    throw new IllegalStateException(("Slots for " + i3 + " extend past the end of the slot table").toString());
                }
                throw new IllegalStateException(("A group extends past its parent group at " + i3).toString());
            }
            throw new IllegalStateException(("A group extends past the end of the table at " + i3).toString());
        }
        throw new IllegalStateException(("Invalid parent index detected at " + i3 + ", expected parent index to be " + i + " found " + access$parentAnchor).toString());
    }

    @NotNull
    public final Anchor anchor(int i) {
        if (!this.writer) {
            boolean z = false;
            if (i >= 0 && i < this.groupsSize) {
                z = true;
            }
            if (z) {
                ArrayList<Anchor> arrayList = this.anchors;
                int access$search = SlotTableKt.access$search(arrayList, i, this.groupsSize);
                if (access$search < 0) {
                    Anchor anchor = new Anchor(i);
                    arrayList.add(-(access$search + 1), anchor);
                    return anchor;
                }
                Anchor anchor2 = arrayList.get(access$search);
                Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
                return anchor2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead ".toString());
        throw new ExceptionsH();
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!this.writer) {
            if (anchor.getValid()) {
                return anchor.getLocation$runtime_release();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new ExceptionsH();
    }

    @NotNull
    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append('\n');
        int i = this.groupsSize;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2 += emitGroup(sb2, i2, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void close$runtime_release(@NotNull SlotReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.getTable$runtime_release() == this && this.readers > 0) {
            this.readers--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int i, @NotNull Anchor anchor) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!this.writer) {
            if (i >= 0 && i < this.groupsSize) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (ownsAnchor(anchor)) {
                    int access$groupSize = SlotTableKt.access$groupSize(this.groups, i) + i;
                    int location$runtime_release = anchor.getLocation$runtime_release();
                    if (i <= location$runtime_release && location$runtime_release < access$groupSize) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new ExceptionsH();
        }
        ComposerKt.composeRuntimeError("Writer is active".toString());
        throw new ExceptionsH();
    }

    @Nullable
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref ref = new Ref();
        ref.f99319b = true;
        SlotReader openReader = openReader();
        try {
            m107180invalidateGroupsWithKey$lambda14$scanGroup(openReader, i, arrayList, ref, this, arrayList2);
            Unit unit = Unit.f99208a;
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Anchor anchor = (Anchor) arrayList.get(i2);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashGroup$runtime_release();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close();
                if (!ref.f99319b) {
                    return null;
                }
                return arrayList2;
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        if (this.groupsSize == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @NotNull
    public final SlotReader openReader() {
        if (!this.writer) {
            this.readers++;
            return new SlotReader(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    @NotNull
    public final SlotWriter openWriter() {
        boolean z;
        if (!this.writer) {
            if (this.readers <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.writer = true;
                this.version++;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new ExceptionsH();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new ExceptionsH();
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        boolean z;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!anchor.getValid()) {
            return false;
        }
        int access$search = SlotTableKt.access$search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize);
        if (access$search >= 0 && Intrinsics.m17075f(this.anchors.get(access$search), anchor)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final <T> T read(@NotNull Function1<? super SlotReader, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotReader openReader = openReader();
        try {
            return block.invoke(openReader);
        } finally {
            InlineMarker.m17017b(1);
            openReader.close();
            InlineMarker.m17018a(1);
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int i, @NotNull Object[] slots, int i2, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.groups = groups;
        this.groupsSize = i;
        this.slots = slots;
        this.slotsSize = i2;
        this.anchors = anchors;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int i) {
        int length;
        List m17348D0;
        int access$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, i);
        int i2 = i + 1;
        if (i2 < this.groupsSize) {
            length = SlotTableKt.access$dataAnchor(this.groups, i2);
        } else {
            length = this.slots.length;
        }
        m17348D0 = _Arrays.m17348D0(this.slots);
        return m17348D0.subList(access$dataAnchor, length);
    }

    public final void verifyWellFormed() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        C37607l0 c37607l0 = new C37607l0();
        int i3 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i = c37607l0.f99325b;
                i2 = this.groupsSize;
                if (i >= i2) {
                    break;
                }
                verifyWellFormed$validateGroup(c37607l0, this, -1, i + SlotTableKt.access$groupSize(this.groups, i));
            }
            if (i == i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalStateException(("Incomplete group at root " + c37607l0.f99325b + " expected to be " + this.groupsSize).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int indexFor = arrayList.get(i4).toIndexFor(this);
            if (indexFor >= 0 && indexFor <= this.groupsSize) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i3 < indexFor) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i4++;
                    i3 = indexFor;
                } else {
                    throw new IllegalArgumentException("Anchor is out of order".toString());
                }
            } else {
                throw new IllegalArgumentException("Location out of bound".toString());
            }
        }
    }

    public final <T> T write(@NotNull Function1<? super SlotWriter, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotWriter openWriter = openWriter();
        try {
            return block.invoke(openWriter);
        } finally {
            InlineMarker.m17017b(1);
            openWriter.close();
            InlineMarker.m17018a(1);
        }
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int i, @NotNull Object[] slots, int i2, @NotNull ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (writer.getTable$runtime_release() == this && this.writer) {
            this.writer = false;
            setTo$runtime_release(groups, i, slots, i2, anchors);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}

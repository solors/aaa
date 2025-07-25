package androidx.compose.runtime;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlotTable.kt */
@Metadata
/* loaded from: classes.dex */
public final class DataIterator implements Iterable<Object>, Iterator<Object>, KMarkers {
    private final int end;
    private final int group;
    private int index;
    private final int start;
    @NotNull
    private final SlotTable table;

    public DataIterator(@NotNull SlotTable table, int i) {
        int dataAnchor;
        int slotsSize;
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.group = i;
        dataAnchor = SlotTableKt.dataAnchor(table.getGroups(), i);
        this.start = dataAnchor;
        if (i + 1 < table.getGroupsSize()) {
            slotsSize = SlotTableKt.dataAnchor(table.getGroups(), i + 1);
        } else {
            slotsSize = table.getSlotsSize();
        }
        this.end = slotsSize;
        this.index = dataAnchor;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStart() {
        return this.start;
    }

    @NotNull
    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.end) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        Object obj;
        int i = this.index;
        if (i >= 0 && i < this.table.getSlots().length) {
            obj = this.table.getSlots()[this.index];
        } else {
            obj = null;
        }
        this.index++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this;
    }
}

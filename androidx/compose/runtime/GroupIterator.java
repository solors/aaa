package androidx.compose.runtime;

import ae.KMarkers;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SlotTable.kt */
@Metadata
/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, KMarkers {
    private final int end;
    private int index;
    @NotNull
    private final SlotTable table;
    private final int version;

    public GroupIterator(@NotNull SlotTable table, int i, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.end = i2;
        this.index = i;
        this.version = table.getVersion$runtime_release();
        if (!table.getWriter$runtime_release()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateRead() {
        if (this.table.getVersion$runtime_release() == this.version) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int getEnd() {
        return this.end;
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
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public CompositionGroup next() {
        int groupSize;
        validateRead();
        int i = this.index;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), i);
        this.index = groupSize + i;
        return new GroupIterator$next$1(this, i);
    }
}

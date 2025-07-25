package androidx.compose.runtime;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: SlotTable.kt */
@Metadata
/* loaded from: classes.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, KMarkers {
    final /* synthetic */ int $end;
    private int current;
    final /* synthetic */ SlotWriter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SlotWriter$groupSlots$1(int i, int i2, SlotWriter slotWriter) {
        this.$end = i2;
        this.this$0 = slotWriter;
        this.current = i;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.current < this.$end) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        int dataIndexToDataAddress;
        if (hasNext()) {
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i = this.current;
            this.current = i + 1;
            dataIndexToDataAddress = slotWriter.dataIndexToDataAddress(i);
            return objArr[dataIndexToDataAddress];
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i) {
        this.current = i;
    }
}

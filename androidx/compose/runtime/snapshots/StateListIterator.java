package androidx.compose.runtime.snapshots;

import ae.KMarkers;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateList.kt */
@Metadata
/* loaded from: classes.dex */
public final class StateListIterator<T> implements ListIterator<T>, KMarkers {
    private int index;
    @NotNull
    private final SnapshotStateList<T> list;
    private int modification;

    public StateListIterator(@NotNull SnapshotStateList<T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        this.index = i - 1;
        this.modification = list.getModification$runtime_release();
    }

    private final void validateModification() {
        if (this.list.getModification$runtime_release() == this.modification) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        validateModification();
        this.list.add(this.index + 1, t);
        this.index++;
        this.modification = this.list.getModification$runtime_release();
    }

    @NotNull
    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.index >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i = this.index + 1;
        SnapshotStateListKt.validateRange(i, this.list.size());
        T t = this.list.get(i);
        this.index = i;
        return t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        this.index--;
        return this.list.get(this.index);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.index);
        this.index--;
        this.modification = this.list.getModification$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        validateModification();
        this.list.set(this.index, t);
        this.modification = this.list.getModification$runtime_release();
    }
}

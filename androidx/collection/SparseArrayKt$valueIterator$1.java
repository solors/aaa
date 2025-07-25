package androidx.collection;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SparseArray.kt */
@Metadata
/* loaded from: classes.dex */
public final class SparseArrayKt$valueIterator$1<T> implements Iterator<T>, KMarkers {
    final /* synthetic */ SparseArrayCompat $this_valueIterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArrayKt$valueIterator$1(SparseArrayCompat<T> sparseArrayCompat) {
        this.$this_valueIterator = sparseArrayCompat;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.$this_valueIterator.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        SparseArrayCompat sparseArrayCompat = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return (T) sparseArrayCompat.valueAt(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}

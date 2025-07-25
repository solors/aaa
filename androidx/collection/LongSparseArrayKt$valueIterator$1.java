package androidx.collection;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: LongSparseArray.kt */
@Metadata
/* loaded from: classes.dex */
public final class LongSparseArrayKt$valueIterator$1<T> implements Iterator<T>, KMarkers {
    final /* synthetic */ LongSparseArray $this_valueIterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LongSparseArrayKt$valueIterator$1(LongSparseArray<T> longSparseArray) {
        this.$this_valueIterator = longSparseArray;
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
        LongSparseArray longSparseArray = this.$this_valueIterator;
        int i = this.index;
        this.index = i + 1;
        return (T) longSparseArray.valueAt(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}

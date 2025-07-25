package kotlin.jvm.internal;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.jvm.internal.b */
/* loaded from: classes7.dex */
final class ArrayIterator<T> implements Iterator<T>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final T[] f99306b;

    /* renamed from: c */
    private int f99307c;

    public ArrayIterator(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f99306b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f99307c < this.f99306b.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f99306b;
            int i = this.f99307c;
            this.f99307c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f99307c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

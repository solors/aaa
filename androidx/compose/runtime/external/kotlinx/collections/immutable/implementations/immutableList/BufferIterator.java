package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferIterator.kt */
@Metadata
/* loaded from: classes.dex */
public final class BufferIterator<T> extends AbstractListIterator<T> {
    @NotNull
    private final T[] buffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferIterator(@NotNull T[] buffer, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        if (hasNext()) {
            T[] tArr = this.buffer;
            int index = getIndex();
            setIndex(index + 1);
            return tArr[index];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.buffer;
            setIndex(getIndex() - 1);
            return tArr[getIndex()];
        }
        throw new NoSuchElementException();
    }
}

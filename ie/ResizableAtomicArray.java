package ie;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ie.c0 */
/* loaded from: classes8.dex */
public final class ResizableAtomicArray<T> {
    @NotNull
    private volatile AtomicReferenceArray<T> array;

    public ResizableAtomicArray(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int m23008a() {
        return this.array.length();
    }

    @Nullable
    /* renamed from: b */
    public final T m23007b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void m23006c(int i, @Nullable T t) {
        int m16917e;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i >= length) {
            m16917e = _Ranges.m16917e(i + 1, length * 2);
            AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(m16917e);
            for (int i2 = 0; i2 < length; i2++) {
                atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
            }
            atomicReferenceArray2.set(i, t);
            this.array = atomicReferenceArray2;
            return;
        }
        atomicReferenceArray.set(i, t);
    }
}

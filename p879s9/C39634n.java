package p879s9;

import ae.KMarkers;
import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SparseArrays.kt */
@Metadata
/* renamed from: s9.n */
/* loaded from: classes8.dex */
final class C39634n<T> implements Iterator<T>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final SparseArrayCompat<T> f104118b;

    /* renamed from: c */
    private int f104119c;

    public C39634n(@NotNull SparseArrayCompat<T> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f104118b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f104118b.size() > this.f104119c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        SparseArrayCompat<T> sparseArrayCompat = this.f104118b;
        int i = this.f104119c;
        this.f104119c = i + 1;
        return sparseArrayCompat.valueAt(i);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

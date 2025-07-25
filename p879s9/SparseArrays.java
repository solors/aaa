package p879s9;

import ae.KMarkers;
import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: s9.m */
/* loaded from: classes8.dex */
public final class SparseArrays<T> implements Iterable<T>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final SparseArrayCompat<T> f104117b;

    public SparseArrays(@NotNull SparseArrayCompat<T> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f104117b = array;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new C39634n(this.f104117b);
    }
}

package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Iterators.kt */
@Metadata
/* renamed from: kotlin.collections.j0 */
/* loaded from: classes7.dex */
public final class C37549j0<T> implements Iterator<IndexedValue<? extends T>>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final Iterator<T> f99252b;

    /* renamed from: c */
    private int f99253c;

    /* JADX WARN: Multi-variable type inference failed */
    public C37549j0(@NotNull Iterator<? extends T> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f99252b = iterator;
    }

    @Override // java.util.Iterator
    @NotNull
    /* renamed from: a */
    public final IndexedValue<T> next() {
        int i = this.f99253c;
        this.f99253c = i + 1;
        if (i < 0) {
            C37563v.m17156w();
        }
        return new IndexedValue<>(i, this.f99252b.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f99252b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

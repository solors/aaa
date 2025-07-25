package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.collections.i0 */
/* loaded from: classes7.dex */
public final class Iterables<T> implements Iterable<IndexedValue<? extends T>>, KMarkers {
    @NotNull

    /* renamed from: b */
    private final Functions<Iterator<T>> f99249b;

    /* JADX WARN: Multi-variable type inference failed */
    public Iterables(@NotNull Functions<? extends Iterator<? extends T>> iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f99249b = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<IndexedValue<T>> iterator() {
        return new C37549j0(this.f99249b.invoke());
    }
}

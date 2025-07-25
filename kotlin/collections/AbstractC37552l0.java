package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveIterators.kt */
@Metadata
/* renamed from: kotlin.collections.l0 */
/* loaded from: classes7.dex */
public abstract class AbstractC37552l0 implements Iterator<Long>, KMarkers {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}

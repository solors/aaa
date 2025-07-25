package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.collections.k0 */
/* loaded from: classes7.dex */
public abstract class PrimitiveIterators implements Iterator<Integer>, KMarkers {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}

package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimitiveIterators.kt */
@Metadata
/* renamed from: kotlin.collections.r */
/* loaded from: classes7.dex */
public abstract class AbstractC37558r implements Iterator<Boolean>, KMarkers {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }

    public abstract boolean nextBoolean();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }
}

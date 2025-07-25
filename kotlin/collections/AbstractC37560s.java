package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PrimitiveIterators.kt */
@Metadata
/* renamed from: kotlin.collections.s */
/* loaded from: classes7.dex */
public abstract class AbstractC37560s implements Iterator<Character>, KMarkers {
    /* renamed from: a */
    public abstract char mo17267a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(mo17267a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

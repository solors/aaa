package androidx.compose.p015ui.graphics.vector;

import ae.KMarkers;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageVector.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1 */
/* loaded from: classes.dex */
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, KMarkers {
    @NotNull

    /* renamed from: it */
    private final Iterator<VectorNode> f455it;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VectorGroup$iterator$1(VectorGroup vectorGroup) {
        List list;
        list = vectorGroup.children;
        this.f455it = list.iterator();
    }

    @NotNull
    public final Iterator<VectorNode> getIt() {
        return this.f455it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f455it.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public VectorNode next() {
        return this.f455it.next();
    }
}

package androidx.compose.runtime.collection;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: IdentityArraySet.kt */
@Metadata
/* loaded from: classes.dex */
public final class IdentityArraySet$iterator$1<T> implements Iterator<T>, KMarkers {
    private int index;
    final /* synthetic */ IdentityArraySet<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArraySet$iterator$1(IdentityArraySet<T> identityArraySet) {
        this.this$0 = identityArraySet;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.this$0.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @NotNull
    public T next() {
        Object[] values = this.this$0.getValues();
        int i = this.index;
        this.index = i + 1;
        T t = (T) values[i];
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }
}

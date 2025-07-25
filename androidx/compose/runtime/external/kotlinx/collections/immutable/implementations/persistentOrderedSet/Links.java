package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PersistentOrderedSet.kt */
@Metadata
/* loaded from: classes.dex */
public final class Links {
    @Nullable
    private final Object next;
    @Nullable
    private final Object previous;

    public Links(@Nullable Object obj, @Nullable Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean getHasNext() {
        if (this.next != EndOfChain.INSTANCE) {
            return true;
        }
        return false;
    }

    public final boolean getHasPrevious() {
        if (this.previous != EndOfChain.INSTANCE) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object getNext() {
        return this.next;
    }

    @Nullable
    public final Object getPrevious() {
        return this.previous;
    }

    @NotNull
    public final Links withNext(@Nullable Object obj) {
        return new Links(this.previous, obj);
    }

    @NotNull
    public final Links withPrevious(@Nullable Object obj) {
        return new Links(obj, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Links() {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links.<init>():void");
    }

    public Links(@Nullable Object obj) {
        this(obj, EndOfChain.INSTANCE);
    }
}

package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ListImplementation.kt */
@Metadata
/* loaded from: classes.dex */
public final class ListImplementation {
    @NotNull
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    public static final void checkElementIndex$runtime_release(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public static final void checkPositionIndex$runtime_release(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public static final void checkRangeIndexes$runtime_release(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static final boolean orderedEquals$runtime_release(@NotNull Collection<?> c, @NotNull Collection<?> other) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(other, "other");
        if (c.size() != other.size()) {
            return false;
        }
        Iterator<?> it = other.iterator();
        Iterator<?> it2 = c.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.m17075f(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final int orderedHashCode$runtime_release(@NotNull Collection<?> c) {
        int i;
        Intrinsics.checkNotNullParameter(c, "c");
        int i2 = 1;
        for (Object obj : c) {
            int i3 = i2 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }
}

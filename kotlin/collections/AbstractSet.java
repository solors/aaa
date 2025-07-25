package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.collections.i */
/* loaded from: classes7.dex */
public abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E> {
    @NotNull
    public static final C37547a Companion = new C37547a(null);

    /* compiled from: AbstractSet.kt */
    @Metadata
    /* renamed from: kotlin.collections.i$a */
    /* loaded from: classes7.dex */
    public static final class C37547a {
        private C37547a() {
        }

        public /* synthetic */ C37547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m17503a(@NotNull Set<?> c, @NotNull Set<?> other) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c.size() != other.size()) {
                return false;
            }
            return c.containsAll(other);
        }

        /* renamed from: b */
        public final int m17502b(@NotNull Collection<?> c) {
            int i;
            Intrinsics.checkNotNullParameter(c, "c");
            int i2 = 0;
            for (Object obj : c) {
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 += i;
            }
            return i2;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return Companion.m17503a(this, (Set) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.m17502b(this);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

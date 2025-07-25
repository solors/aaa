package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries */
/* loaded from: classes.dex */
public abstract class PersistentHashMapBuilderContentViews<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((PersistentHashMapBuilderContentViews<E, K, V>) ((Map.Entry) obj));
        }
        return false;
    }

    public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((PersistentHashMapBuilderContentViews<E, K, V>) ((Map.Entry) obj));
        }
        return false;
    }

    public abstract boolean removeEntry(@NotNull Map.Entry<? extends K, ? extends V> entry);

    public final boolean contains(@NotNull E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return containsEntry(element);
        }
        return false;
    }

    public final boolean remove(@NotNull E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if ((element instanceof Object ? element : null) instanceof Map.Entry) {
            return removeEntry(element);
        }
        return false;
    }
}

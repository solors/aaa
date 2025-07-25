package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotStateMap.kt */
@Metadata
/* loaded from: classes.dex */
abstract class StateMapMutableIterator<K, V> {
    @Nullable
    private Map.Entry<? extends K, ? extends V> current;
    @NotNull
    private final Iterator<Map.Entry<K, V>> iterator;
    @NotNull
    private final SnapshotStateMap<K, V> map;
    private int modification;
    @Nullable
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(@NotNull SnapshotStateMap<K, V> map, @NotNull Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.map = map;
        this.iterator = iterator;
        this.modification = map.getModification$runtime_release();
        advance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void advance() {
        Map.Entry<K, V> entry;
        this.current = this.next;
        if (this.iterator.hasNext()) {
            entry = this.iterator.next();
        } else {
            entry = null;
        }
        this.next = entry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final Map.Entry<K, V> getCurrent() {
        return (Map.Entry<? extends K, ? extends V>) this.current;
    }

    @NotNull
    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @NotNull
    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    protected final int getModification() {
        return this.modification;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    public final Map.Entry<K, V> getNext() {
        return (Map.Entry<? extends K, ? extends V>) this.next;
    }

    public final boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    protected final <T> T modify(@NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (getMap().getModification$runtime_release() == this.modification) {
            T invoke = block.invoke();
            this.modification = getMap().getModification$runtime_release();
            return invoke;
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() == this.modification) {
            Map.Entry<? extends K, ? extends V> entry = this.current;
            if (entry != null) {
                this.map.remove(entry.getKey());
                this.current = null;
                Unit unit = Unit.f99208a;
                this.modification = getMap().getModification$runtime_release();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    protected final void setCurrent(@Nullable Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    protected final void setModification(int i) {
        this.modification = i;
    }

    protected final void setNext(@Nullable Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }
}

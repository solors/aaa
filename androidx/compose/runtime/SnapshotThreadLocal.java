package androidx.compose.runtime;

import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMapKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActualJvm.jvm.kt */
@Metadata
/* loaded from: classes.dex */
public final class SnapshotThreadLocal<T> {
    @NotNull
    private final AtomicReference<ThreadMap> map = new AtomicReference<>(ThreadMapKt.getEmptyThreadMap());
    @NotNull
    private final Object writeMutex = new Object();

    @Nullable
    public final T get() {
        return (T) this.map.get().get(Thread.currentThread().getId());
    }

    public final void set(@Nullable T t) {
        long id2 = Thread.currentThread().getId();
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(id2, t)) {
                return;
            }
            this.map.set(threadMap.newWith(id2, t));
            Unit unit = Unit.f99208a;
        }
    }
}

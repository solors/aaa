package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C37586g;
import org.jetbrains.annotations.NotNull;

/* compiled from: Executors.kt */
@Metadata
/* renamed from: kotlinx.coroutines.d1 */
/* loaded from: classes7.dex */
final class ExecutorC37716d1 implements Executor {
    @NotNull

    /* renamed from: b */
    public final CoroutineDispatcher f99529b;

    public ExecutorC37716d1(@NotNull CoroutineDispatcher coroutineDispatcher) {
        this.f99529b = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f99529b;
        C37586g c37586g = C37586g.f99289b;
        if (coroutineDispatcher.isDispatchNeeded(c37586g)) {
            this.f99529b.dispatch(c37586g, runnable);
        } else {
            runnable.run();
        }
    }

    @NotNull
    public String toString() {
        return this.f99529b.toString();
    }
}

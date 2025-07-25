package ne;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tasks.kt */
@Metadata
/* renamed from: ne.a */
/* loaded from: classes8.dex */
final class ExecutorC38518a implements Executor {
    @NotNull

    /* renamed from: b */
    public static final ExecutorC38518a f101894b = new ExecutorC38518a();

    private ExecutorC38518a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}

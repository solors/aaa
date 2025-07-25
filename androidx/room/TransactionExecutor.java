package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransactionExecutor.kt */
@Metadata
/* loaded from: classes2.dex */
public final class TransactionExecutor implements Executor {
    @Nullable
    private Runnable active;
    @NotNull
    private final Executor executor;
    @NotNull
    private final Object syncLock;
    @NotNull
    private final ArrayDeque<Runnable> tasks;

    public TransactionExecutor(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* renamed from: a */
    public static /* synthetic */ void m104087a(Runnable runnable, TransactionExecutor transactionExecutor) {
        execute$lambda$1$lambda$0(runnable, transactionExecutor);
    }

    public static final void execute$lambda$1$lambda$0(Runnable command, TransactionExecutor this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.syncLock) {
            this.tasks.offer(new Runnable() { // from class: androidx.room.a0
                @Override // java.lang.Runnable
                public final void run() {
                    TransactionExecutor.m104087a(command, this);
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
            Unit unit = Unit.f99208a;
        }
    }

    public final void scheduleNext() {
        synchronized (this.syncLock) {
            Runnable poll = this.tasks.poll();
            Runnable runnable = poll;
            this.active = runnable;
            if (poll != null) {
                this.executor.execute(runnable);
            }
            Unit unit = Unit.f99208a;
        }
    }
}

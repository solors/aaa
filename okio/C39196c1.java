package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Timeout.kt */
@Metadata
/* renamed from: okio.c1 */
/* loaded from: classes10.dex */
public class C39196c1 {
    @NotNull
    public static final C39198b Companion = new C39198b(null);
    @NotNull
    public static final C39196c1 NONE = new C39197a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout.kt */
    @Metadata
    /* renamed from: okio.c1$b */
    /* loaded from: classes10.dex */
    public static final class C39198b {
        private C39198b() {
        }

        public /* synthetic */ C39198b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m13613a(long j, long j2) {
            if (j == 0 || (j2 != 0 && j >= j2)) {
                return j2;
            }
            return j;
        }
    }

    public final void awaitSignal(@NotNull Condition condition) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                j = System.nanoTime() - nanoTime;
            }
            if (j < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public C39196c1 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @NotNull
    public C39196c1 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @NotNull
    public final C39196c1 deadline(long j, @NotNull TimeUnit unit) {
        boolean z;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(@NotNull C39196c1 other, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(block, "block");
        long timeoutNanos = timeoutNanos();
        long m13613a = Companion.m13613a(other.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(m13613a, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (other.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
            }
            try {
                T invoke = block.invoke();
                InlineMarker.m17017b(1);
                timeout(timeoutNanos, timeUnit);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                InlineMarker.m17018a(1);
                return invoke;
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        if (other.hasDeadline()) {
            deadlineNanoTime(other.deadlineNanoTime());
        }
        try {
            T invoke2 = block.invoke();
            InlineMarker.m17017b(1);
            timeout(timeoutNanos, timeUnit);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            InlineMarker.m17018a(1);
            return invoke2;
        } catch (Throwable th2) {
            InlineMarker.m17017b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            InlineMarker.m17018a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @NotNull
    public C39196c1 timeout(long j, @NotNull TimeUnit unit) {
        boolean z;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.timeoutNanos = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@NotNull Object monitor) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j2 = timeoutNanos / 1000000;
                monitor.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @NotNull
    public C39196c1 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    /* compiled from: Timeout.kt */
    @Metadata
    /* renamed from: okio.c1$a */
    /* loaded from: classes10.dex */
    public static final class C39197a extends C39196c1 {
        C39197a() {
        }

        @Override // okio.C39196c1
        @NotNull
        public C39196c1 timeout(long j, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }

        @Override // okio.C39196c1
        public void throwIfReached() {
        }

        @Override // okio.C39196c1
        @NotNull
        public C39196c1 deadlineNanoTime(long j) {
            return this;
        }
    }
}

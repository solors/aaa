package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: okio.c */
/* loaded from: classes10.dex */
public class AsyncTimeout extends C39196c1 {
    @NotNull
    public static final C39191a Companion = new C39191a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    @NotNull
    private static final Condition condition;
    @Nullable
    private static AsyncTimeout head;
    @NotNull
    private static final ReentrantLock lock;
    private boolean inQueue;
    @Nullable
    private AsyncTimeout next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    @Metadata
    /* renamed from: okio.c$a */
    /* loaded from: classes10.dex */
    public static final class C39191a {
        private C39191a() {
        }

        public /* synthetic */ C39191a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m13620d(AsyncTimeout asyncTimeout) {
            ReentrantLock m13618f = AsyncTimeout.Companion.m13618f();
            m13618f.lock();
            try {
                if (asyncTimeout.inQueue) {
                    asyncTimeout.inQueue = false;
                    for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                        if (asyncTimeout2.next == asyncTimeout) {
                            asyncTimeout2.next = asyncTimeout.next;
                            asyncTimeout.next = null;
                            return false;
                        }
                    }
                    m13618f.unlock();
                    return true;
                }
                return false;
            } finally {
                m13618f.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public final void m13617g(AsyncTimeout asyncTimeout, long j, boolean z) {
            ReentrantLock m13618f = AsyncTimeout.Companion.m13618f();
            m13618f.lock();
            try {
                if (!asyncTimeout.inQueue) {
                    asyncTimeout.inQueue = true;
                    if (AsyncTimeout.head == null) {
                        AsyncTimeout.head = new AsyncTimeout();
                        new C39192b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i != 0 && z) {
                        asyncTimeout.timeoutAt = Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (i != 0) {
                        asyncTimeout.timeoutAt = j + nanoTime;
                    } else if (z) {
                        asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long remainingNanos = asyncTimeout.remainingNanos(nanoTime);
                    AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
                    Intrinsics.m17074g(asyncTimeout2);
                    while (asyncTimeout2.next != null) {
                        AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                        Intrinsics.m17074g(asyncTimeout3);
                        if (remainingNanos < asyncTimeout3.remainingNanos(nanoTime)) {
                            break;
                        }
                        asyncTimeout2 = asyncTimeout2.next;
                        Intrinsics.m17074g(asyncTimeout2);
                    }
                    asyncTimeout.next = asyncTimeout2.next;
                    asyncTimeout2.next = asyncTimeout;
                    if (asyncTimeout2 == AsyncTimeout.head) {
                        AsyncTimeout.Companion.m13619e().signal();
                    }
                    Unit unit = Unit.f99208a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } finally {
                m13618f.unlock();
            }
        }

        @Nullable
        /* renamed from: c */
        public final AsyncTimeout m13621c() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            Intrinsics.m17074g(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 != null) {
                long remainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
                if (remainingNanos <= 0) {
                    AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                    Intrinsics.m17074g(asyncTimeout3);
                    asyncTimeout3.next = asyncTimeout2.next;
                    asyncTimeout2.next = null;
                    return asyncTimeout2;
                }
                m13619e().await(remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            m13619e().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            Intrinsics.m17074g(asyncTimeout4);
            if (asyncTimeout4.next == null && System.nanoTime() - nanoTime >= AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                return AsyncTimeout.head;
            }
            return null;
        }

        @NotNull
        /* renamed from: e */
        public final Condition m13619e() {
            return AsyncTimeout.condition;
        }

        @NotNull
        /* renamed from: f */
        public final ReentrantLock m13618f() {
            return AsyncTimeout.lock;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.kt */
    @Metadata
    /* renamed from: okio.c$b */
    /* loaded from: classes10.dex */
    public static final class C39192b extends Thread {
        public C39192b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock m13618f;
            AsyncTimeout m13621c;
            while (true) {
                try {
                    C39191a c39191a = AsyncTimeout.Companion;
                    m13618f = c39191a.m13618f();
                    m13618f.lock();
                    m13621c = c39191a.m13621c();
                } catch (InterruptedException unused) {
                }
                if (m13621c == AsyncTimeout.head) {
                    AsyncTimeout.head = null;
                    m13618f.unlock();
                    return;
                }
                Unit unit = Unit.f99208a;
                m13618f.unlock();
                if (m13621c != null) {
                    m13621c.timedOut();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata
    /* renamed from: okio.c$c */
    /* loaded from: classes10.dex */
    public static final class C39193c implements Sink {

        /* renamed from: c */
        final /* synthetic */ Sink f102934c;

        C39193c(Sink sink) {
            this.f102934c = sink;
        }

        @Override // okio.Sink
        @NotNull
        /* renamed from: a */
        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Sink sink = this.f102934c;
            asyncTimeout.enter();
            try {
                sink.close();
                Unit unit = Unit.f99208a;
                if (!asyncTimeout.exit()) {
                    return;
                }
                throw asyncTimeout.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Sink sink = this.f102934c;
            asyncTimeout.enter();
            try {
                sink.flush();
                Unit unit = Unit.f99208a;
                if (!asyncTimeout.exit()) {
                    return;
                }
                throw asyncTimeout.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.sink(" + this.f102934c + ')';
        }

        @Override // okio.Sink
        public void write(@NotNull C39200e source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            C39189b.m13633b(source.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    Segment segment = source.f102937b;
                    Intrinsics.m17074g(segment);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += segment.f103023c - segment.f103022b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            segment = segment.f103026f;
                            Intrinsics.m17074g(segment);
                        }
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    Sink sink = this.f102934c;
                    asyncTimeout.enter();
                    try {
                        sink.write(source, j2);
                        Unit unit = Unit.f99208a;
                        if (!asyncTimeout.exit()) {
                            j -= j2;
                        } else {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        if (!asyncTimeout.exit()) {
                            throw e;
                        }
                        throw asyncTimeout.access$newTimeoutException(e);
                    } finally {
                        asyncTimeout.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata
    /* renamed from: okio.c$d */
    /* loaded from: classes10.dex */
    public static final class C39194d implements Source {

        /* renamed from: c */
        final /* synthetic */ Source f102936c;

        C39194d(Source source) {
            this.f102936c = source;
        }

        @Override // okio.Source
        @NotNull
        /* renamed from: a */
        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Source source = this.f102936c;
            asyncTimeout.enter();
            try {
                source.close();
                Unit unit = Unit.f99208a;
                if (!asyncTimeout.exit()) {
                    return;
                }
                throw asyncTimeout.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @Override // okio.Source
        public long read(@NotNull C39200e sink, long j) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Source source = this.f102936c;
            asyncTimeout.enter();
            try {
                long read = source.read(sink, j);
                if (!asyncTimeout.exit()) {
                    return read;
                }
                throw asyncTimeout.access$newTimeoutException(null);
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.source(" + this.f102936c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "lock.newCondition()");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.m13617g(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.m13620d(this);
    }

    @NotNull
    protected IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final Sink sink(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C39193c(sink);
    }

    @NotNull
    public final Source source(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new C39194d(source);
    }

    public final <T> T withTimeout(@NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T invoke = block.invoke();
                InlineMarker.m17017b(1);
                if (!exit()) {
                    InlineMarker.m17018a(1);
                    return invoke;
                }
                throw access$newTimeoutException(null);
            } catch (IOException e) {
                if (!exit()) {
                    throw e;
                }
                throw access$newTimeoutException(e);
            }
        } catch (Throwable th) {
            InlineMarker.m17017b(1);
            exit();
            InlineMarker.m17018a(1);
            throw th;
        }
    }

    protected void timedOut() {
    }
}

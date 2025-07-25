package com.facebook.bolts;

import com.facebook.bolts.BoltsExecutors;
import com.facebook.bolts.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Task.kt */
@Metadata
/* loaded from: classes2.dex */
public final class Task<TResult> {
    @NotNull
    public static final ExecutorService BACKGROUND_EXECUTOR;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Executor IMMEDIATE_EXECUTOR;
    @NotNull
    private static final Task<?> TASK_CANCELLED;
    @NotNull
    private static final Task<Boolean> TASK_FALSE;
    @NotNull
    private static final Task<?> TASK_NULL;
    @NotNull
    private static final Task<Boolean> TASK_TRUE;
    @NotNull
    public static final Executor UI_THREAD_EXECUTOR;
    @Nullable
    private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelledField;
    private boolean completeField;
    private final Condition condition;
    @Nullable
    private List<Continuation<TResult, Void>> continuations;
    @Nullable
    private Exception errorField;
    private boolean errorHasBeenObserved;
    @NotNull
    private final ReentrantLock lock;
    @Nullable
    private TResult resultField;
    @Nullable
    private UnobservedErrorNotifier unobservedErrorNotifier;

    /* compiled from: Task.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* compiled from: Task.kt */
        @Metadata
        /* renamed from: com.facebook.bolts.Task$Companion$a */
        /* loaded from: classes2.dex */
        public static final class C13342a<TTaskResult, TContinuationResult> implements Continuation {

            /* renamed from: a */
            final /* synthetic */ ReentrantLock f24609a;

            /* renamed from: b */
            final /* synthetic */ AtomicBoolean f24610b;

            /* renamed from: c */
            final /* synthetic */ AtomicInteger f24611c;

            /* renamed from: d */
            final /* synthetic */ ArrayList<Exception> f24612d;

            /* renamed from: e */
            final /* synthetic */ com.facebook.bolts.TaskCompletionSource<Void> f24613e;

            C13342a(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ArrayList<Exception> arrayList, com.facebook.bolts.TaskCompletionSource<Void> taskCompletionSource) {
                this.f24609a = reentrantLock;
                this.f24610b = atomicBoolean;
                this.f24611c = atomicInteger;
                this.f24612d = arrayList;
                this.f24613e = taskCompletionSource;
            }

            @Override // com.facebook.bolts.Continuation
            @Nullable
            /* renamed from: a */
            public final Void then(@NotNull Task<Object> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isFaulted()) {
                    ReentrantLock reentrantLock = this.f24609a;
                    ArrayList<Exception> arrayList = this.f24612d;
                    reentrantLock.lock();
                    try {
                        arrayList.add(it.getError());
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                if (it.isCancelled()) {
                    this.f24610b.set(true);
                }
                if (this.f24611c.decrementAndGet() == 0) {
                    if (this.f24612d.size() != 0) {
                        if (this.f24612d.size() == 1) {
                            this.f24613e.setError(this.f24612d.get(0));
                        } else {
                            C37612s0 c37612s0 = C37612s0.f99333a;
                            String format = String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(this.f24612d.size())}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                            this.f24613e.setError(new AggregateException(format, this.f24612d));
                        }
                    } else if (this.f24610b.get()) {
                        this.f24613e.setCancelled();
                    } else {
                        this.f24613e.setResult(null);
                    }
                }
                return null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: call$lambda-2 */
        public static final void m110109call$lambda2(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Callable callable) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(callable, "$callable");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(callable.call());
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e) {
                tcs.setError(e);
            }
        }

        public final <TContinuationResult, TResult> void completeAfterTask(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, Task<TContinuationResult>> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m110110completeAfterTask$lambda7(cancellationToken, taskCompletionSource, continuation, task);
                    }
                });
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
        }

        /* renamed from: completeAfterTask$lambda-7 */
        public static final void m110110completeAfterTask$lambda7(final CancellationToken cancellationToken, final com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                Task task2 = (Task) continuation.then(task);
                if (task2 == null) {
                    tcs.setResult(null);
                } else {
                    task2.continueWith(new Continuation() { // from class: com.facebook.bolts.n
                        @Override // com.facebook.bolts.Continuation
                        public final Object then(Task task3) {
                            Void m110111completeAfterTask$lambda7$lambda6;
                            m110111completeAfterTask$lambda7$lambda6 = Task.Companion.m110111completeAfterTask$lambda7$lambda6(cancellationToken, tcs, task3);
                            return m110111completeAfterTask$lambda7$lambda6;
                        }
                    });
                }
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e) {
                tcs.setError(e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeAfterTask$lambda-7$lambda-6 */
        public static final Void m110111completeAfterTask$lambda7$lambda6(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(task, "task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return null;
            }
            if (task.isCancelled()) {
                tcs.setCancelled();
            } else if (task.isFaulted()) {
                tcs.setError(task.getError());
            } else {
                tcs.setResult(task.getResult());
            }
            return null;
        }

        public final <TContinuationResult, TResult> void completeImmediately(final com.facebook.bolts.TaskCompletionSource<TContinuationResult> taskCompletionSource, final Continuation<TResult, TContinuationResult> continuation, final Task<TResult> task, Executor executor, final CancellationToken cancellationToken) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m110112completeImmediately$lambda5(cancellationToken, taskCompletionSource, continuation, task);
                    }
                });
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: completeImmediately$lambda-5 */
        public static final void m110112completeImmediately$lambda5(CancellationToken cancellationToken, com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Task task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                tcs.setCancelled();
                return;
            }
            try {
                tcs.setResult(continuation.then(task));
            } catch (CancellationException unused) {
                tcs.setCancelled();
            } catch (Exception e) {
                tcs.setError(e);
            }
        }

        /* renamed from: delay$lambda-0 */
        public static final void m110113delay$lambda0(com.facebook.bolts.TaskCompletionSource tcs) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            tcs.trySetResult(null);
        }

        /* renamed from: delay$lambda-1 */
        public static final void m110114delay$lambda1(ScheduledFuture scheduledFuture, com.facebook.bolts.TaskCompletionSource tcs) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            scheduledFuture.cancel(true);
            tcs.trySetCancelled();
        }

        /* renamed from: whenAny$lambda-4 */
        public static final Void m110115whenAny$lambda4(AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, Task it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        /* renamed from: whenAnyResult$lambda-3 */
        public static final Void m110116whenAnyResult$lambda3(AtomicBoolean isAnyTaskComplete, com.facebook.bolts.TaskCompletionSource firstCompleted, Task it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.setResult(it);
                return null;
            }
            it.getError();
            return null;
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            return call(callable, executor, null);
        }

        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, null);
        }

        @NotNull
        public final <TResult> Task<TResult> cancelled() {
            return Task.TASK_CANCELLED;
        }

        @NotNull
        public final Task<Void> delay(long j) {
            return delay$facebook_bolts_release(j, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), null);
        }

        @NotNull
        public final Task<Void> delay$facebook_bolts_release(long j, @NotNull ScheduledExecutorService executor, @Nullable CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
                return cancelled();
            }
            if (j <= 0) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final ScheduledFuture<?> schedule = executor.schedule(new Runnable() { // from class: com.facebook.bolts.k
                @Override // java.lang.Runnable
                public final void run() {
                    Task.Companion.m110113delay$lambda0(taskCompletionSource);
                }
            }, j, TimeUnit.MILLISECONDS);
            if (cancellationToken != null) {
                cancellationToken.register(new Runnable() { // from class: com.facebook.bolts.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m110114delay$lambda1(schedule, taskCompletionSource);
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> forError(@Nullable Exception exc) {
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setError(exc);
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> forResult(@Nullable TResult tresult) {
            if (tresult == null) {
                return Task.TASK_NULL;
            }
            if (tresult instanceof Boolean) {
                return ((Boolean) tresult).booleanValue() ? Task.TASK_TRUE : Task.TASK_FALSE;
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            taskCompletionSource.setResult(tresult);
            return taskCompletionSource.getTask();
        }

        @Nullable
        public final UnobservedExceptionHandler getUnobservedExceptionHandler() {
            return Task.unobservedExceptionHandler;
        }

        public final void setUnobservedExceptionHandler(@Nullable UnobservedExceptionHandler unobservedExceptionHandler) {
            Task.unobservedExceptionHandler = unobservedExceptionHandler;
        }

        @NotNull
        public final Task<Void> whenAll(@NotNull Collection<? extends Task<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = new ReentrantLock();
            AtomicInteger atomicInteger = new AtomicInteger(tasks.size());
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                task.continueWith(new C13342a(reentrantLock, atomicBoolean, atomicInteger, arrayList, taskCompletionSource));
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<List<TResult>> whenAllResult(@NotNull final Collection<Task<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            return (Task<List<TResult>>) whenAll(tasks).onSuccess((Continuation<Void, List<? extends TResult>>) new Continuation<Void, List<? extends TResult>>() { // from class: com.facebook.bolts.Task$Companion$whenAllResult$1
                @Override // com.facebook.bolts.Continuation
                @NotNull
                public List<TResult> then(@NotNull Task<Void> task) {
                    List<TResult> m17166m;
                    Intrinsics.checkNotNullParameter(task, "task");
                    if (tasks.isEmpty()) {
                        m17166m = C37563v.m17166m();
                        return m17166m;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Task<TResult> task2 : tasks) {
                        arrayList.add(task2.getResult());
                    }
                    return arrayList;
                }
            });
        }

        @NotNull
        public final Task<Task<?>> whenAny(@NotNull Collection<? extends Task<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<?> task : tasks) {
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.m
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task2) {
                        Void m110115whenAny$lambda4;
                        m110115whenAny$lambda4 = Task.Companion.m110115whenAny$lambda4(atomicBoolean, taskCompletionSource, task2);
                        return m110115whenAny$lambda4;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<Task<TResult>> whenAnyResult(@NotNull Collection<Task<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return forResult(null);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (Task<TResult> task : tasks) {
                task.continueWith(new Continuation() { // from class: com.facebook.bolts.g
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task2) {
                        Void m110116whenAnyResult$lambda3;
                        m110116whenAnyResult$lambda3 = Task.Companion.m110116whenAnyResult$lambda3(atomicBoolean, taskCompletionSource, task2);
                        return m110116whenAnyResult$lambda3;
                    }
                });
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull final Callable<TResult> callable, @NotNull Executor executor, @Nullable final CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task.Companion.m110109call$lambda2(cancellationToken, taskCompletionSource, callable);
                    }
                });
            } catch (Exception e) {
                taskCompletionSource.setError(new ExecutorException(e));
            }
            return taskCompletionSource.getTask();
        }

        @NotNull
        public final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.BACKGROUND_EXECUTOR, cancellationToken);
        }

        @NotNull
        public final Task<Void> delay(long j, @Nullable CancellationToken cancellationToken) {
            return delay$facebook_bolts_release(j, BoltsExecutors.Companion.scheduled$facebook_bolts_release(), cancellationToken);
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, null);
        }

        @NotNull
        public final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return call(callable, Task.IMMEDIATE_EXECUTOR, cancellationToken);
        }
    }

    /* compiled from: Task.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public final class TaskCompletionSource extends com.facebook.bolts.TaskCompletionSource<TResult> {
        final /* synthetic */ Task<TResult> this$0;

        public TaskCompletionSource(Task this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }
    }

    /* compiled from: Task.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public interface UnobservedExceptionHandler {
        void unobservedException(@NotNull Task<?> task, @NotNull UnobservedTaskException unobservedTaskException);
    }

    static {
        BoltsExecutors.Companion companion = BoltsExecutors.Companion;
        BACKGROUND_EXECUTOR = companion.background();
        IMMEDIATE_EXECUTOR = companion.immediate$facebook_bolts_release();
        UI_THREAD_EXECUTOR = AndroidExecutors.Companion.uiThread();
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    public Task() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable) {
        return Companion.call(callable);
    }

    @NotNull
    public static final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable) {
        return Companion.callInBackground(callable);
    }

    @NotNull
    public static final <TResult> Task<TResult> cancelled() {
        return Companion.cancelled();
    }

    public static /* synthetic */ Task continueWhile$default(Task task, Callable callable, Continuation continuation, Executor executor, CancellationToken cancellationToken, int i, Object obj) {
        if ((i & 4) != 0) {
            executor = IMMEDIATE_EXECUTOR;
        }
        if ((i & 8) != 0) {
            cancellationToken = null;
        }
        return task.continueWhile(callable, continuation, executor, cancellationToken);
    }

    /* renamed from: continueWith$lambda-10$lambda-9 */
    public static final Void m110104continueWith$lambda10$lambda9(com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        Companion.completeImmediately(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    /* renamed from: continueWithTask$lambda-12$lambda-11 */
    public static final Void m110105continueWithTask$lambda12$lambda11(com.facebook.bolts.TaskCompletionSource tcs, Continuation continuation, Executor executor, CancellationToken cancellationToken, Task task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        Companion.completeAfterTask(tcs, continuation, task, executor, cancellationToken);
        return null;
    }

    @NotNull
    public static final Task<Void> delay(long j) {
        return Companion.delay(j);
    }

    @NotNull
    public static final <TResult> Task<TResult> forError(@Nullable Exception exc) {
        return Companion.forError(exc);
    }

    @NotNull
    public static final <TResult> Task<TResult> forResult(@Nullable TResult tresult) {
        return Companion.forResult(tresult);
    }

    @Nullable
    public static final UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return Companion.getUnobservedExceptionHandler();
    }

    /* renamed from: makeVoid$lambda-8 */
    public static final Task m110106makeVoid$lambda8(Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        return Companion.forResult(null);
    }

    /* renamed from: onSuccess$lambda-13 */
    public static final Task m110107onSuccess$lambda13(CancellationToken cancellationToken, Continuation continuation, Task task) {
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        return task.continueWith(continuation);
    }

    /* renamed from: onSuccessTask$lambda-14 */
    public static final Task m110108onSuccessTask$lambda14(CancellationToken cancellationToken, Continuation continuation, Task task) {
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(task, "task");
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return Companion.cancelled();
        }
        if (task.isFaulted()) {
            return Companion.forError(task.getError());
        }
        if (task.isCancelled()) {
            return Companion.cancelled();
        }
        return task.continueWithTask(continuation);
    }

    private final void runContinuations() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List<Continuation<TResult, Void>> list = this.continuations;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((Continuation) it.next()).then(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
            this.continuations = null;
            Unit unit = Unit.f99208a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void setUnobservedExceptionHandler(@Nullable UnobservedExceptionHandler unobservedExceptionHandler2) {
        Companion.setUnobservedExceptionHandler(unobservedExceptionHandler2);
    }

    @NotNull
    public static final Task<Void> whenAll(@NotNull Collection<? extends Task<?>> collection) {
        return Companion.whenAll(collection);
    }

    @NotNull
    public static final <TResult> Task<List<TResult>> whenAllResult(@NotNull Collection<Task<TResult>> collection) {
        return Companion.whenAllResult(collection);
    }

    @NotNull
    public static final Task<Task<?>> whenAny(@NotNull Collection<? extends Task<?>> collection) {
        return Companion.whenAny(collection);
    }

    @NotNull
    public static final <TResult> Task<Task<TResult>> whenAnyResult(@NotNull Collection<Task<TResult>> collection) {
        return Companion.whenAnyResult(collection);
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull Callable<Boolean> predicate, @NotNull Continuation<Void, Task<Void>> continuation) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWith(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(continuation, executor, null);
    }

    @Nullable
    public final Exception getError() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                this.errorHasBeenObserved = true;
                UnobservedErrorNotifier unobservedErrorNotifier = this.unobservedErrorNotifier;
                if (unobservedErrorNotifier != null) {
                    unobservedErrorNotifier.setObserved();
                    this.unobservedErrorNotifier = null;
                }
            }
            return this.errorField;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Nullable
    public final TResult getResult() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.resultField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.cancelledField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isCompleted() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return this.completeField;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isFaulted() {
        boolean z;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.errorField != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final Task<Void> makeVoid() {
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.e
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                Task m110106makeVoid$lambda8;
                m110106makeVoid$lambda8 = Task.m110106makeVoid$lambda8(task);
                return m110106makeVoid$lambda8;
            }
        });
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return onSuccess(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return onSuccessTask(continuation, executor, null);
    }

    public final boolean trySetCancelled() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.cancelledField = true;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetError(@Nullable Exception exc) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                return false;
            }
            this.completeField = true;
            this.errorField = exc;
            this.errorHasBeenObserved = false;
            this.condition.signalAll();
            runContinuations();
            if (!this.errorHasBeenObserved && unobservedExceptionHandler != null) {
                this.unobservedErrorNotifier = new UnobservedErrorNotifier(this);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean trySetResult(@Nullable TResult tresult) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.completeField) {
                reentrantLock.unlock();
                return false;
            }
            this.completeField = true;
            this.resultField = tresult;
            this.condition.signalAll();
            runContinuations();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void waitForCompletion() throws InterruptedException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await();
            }
            Unit unit = Unit.f99208a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
        return Companion.call(callable, cancellationToken);
    }

    @NotNull
    public static final <TResult> Task<TResult> callInBackground(@NotNull Callable<TResult> callable, @Nullable CancellationToken cancellationToken) {
        return Companion.callInBackground(callable, cancellationToken);
    }

    @NotNull
    public static final Task<Void> delay(long j, @Nullable CancellationToken cancellationToken) {
        return Companion.delay(j, cancellationToken);
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull Callable<Boolean> predicate, @NotNull Continuation<Void, Task<Void>> continuation, @Nullable CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull final Continuation<TResult, TContinuationResult> continuation, @NotNull final Executor executor, @Nullable final CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new Continuation() { // from class: com.facebook.bolts.c
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task) {
                        Void m110104continueWith$lambda10$lambda9;
                        m110104continueWith$lambda10$lambda9 = Task.m110104continueWith$lambda10$lambda9(taskCompletionSource, continuation, executor, cancellationToken, task);
                        return m110104continueWith$lambda10$lambda9;
                    }
                });
            }
            Unit unit = Unit.f99208a;
            if (isCompleted) {
                Companion.completeImmediately(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull final Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull final Executor executor, @Nullable final CancellationToken cancellationToken) {
        List<Continuation<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean isCompleted = isCompleted();
            if (!isCompleted && (list = this.continuations) != null) {
                list.add(new Continuation() { // from class: com.facebook.bolts.d
                    @Override // com.facebook.bolts.Continuation
                    public final Object then(Task task) {
                        Void m110105continueWithTask$lambda12$lambda11;
                        m110105continueWithTask$lambda12$lambda11 = Task.m110105continueWithTask$lambda12$lambda11(taskCompletionSource, continuation, executor, cancellationToken, task);
                        return m110105continueWithTask$lambda12$lambda11;
                    }
                });
            }
            Unit unit = Unit.f99208a;
            if (isCompleted) {
                Companion.completeAfterTask(taskCompletionSource, continuation, this, executor, cancellationToken);
            }
            return taskCompletionSource.getTask();
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull final Continuation<TResult, TContinuationResult> continuation, @NotNull Executor executor, @Nullable final CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.b
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                Task m110107onSuccess$lambda13;
                m110107onSuccess$lambda13 = Task.m110107onSuccess$lambda13(cancellationToken, continuation, task);
                return m110107onSuccess$lambda13;
            }
        }, executor);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull final Continuation<TResult, Task<TContinuationResult>> continuation, @NotNull Executor executor, @Nullable final CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return continueWithTask(new Continuation() { // from class: com.facebook.bolts.f
            @Override // com.facebook.bolts.Continuation
            public final Object then(Task task) {
                Task m110108onSuccessTask$lambda14;
                m110108onSuccessTask$lambda14 = Task.m110108onSuccessTask$lambda14(cancellationToken, continuation, task);
                return m110108onSuccessTask$lambda14;
            }
        }, executor);
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
        return Companion.call(callable, executor);
    }

    @NotNull
    public final Task<Void> continueWhile(@NotNull final Callable<Boolean> predicate, @NotNull final Continuation<Void, Task<Void>> continuation, @NotNull final Executor executor, @Nullable final CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return makeVoid().continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.facebook.bolts.Task$continueWhile$predicateContinuation$1
            @Override // com.facebook.bolts.Continuation
            @NotNull
            public Task<Void> then(@NotNull Task<Void> task) throws Exception {
                Intrinsics.checkNotNullParameter(task, "task");
                CancellationToken cancellationToken2 = cancellationToken;
                if (cancellationToken2 != null && cancellationToken2.isCancellationRequested()) {
                    return Task.Companion.cancelled();
                }
                Boolean call = predicate.call();
                Intrinsics.checkNotNullExpressionValue(call, "predicate.call()");
                if (call.booleanValue()) {
                    return Task.Companion.forResult(null).onSuccessTask(continuation, executor).onSuccessTask(this, executor);
                }
                return Task.Companion.forResult(null);
            }
        }, executor);
    }

    @NotNull
    public static final <TResult> Task<TResult> call(@NotNull Callable<TResult> callable, @NotNull Executor executor, @Nullable CancellationToken cancellationToken) {
        return Companion.call(callable, executor, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
    }

    private Task(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        trySetResult(tresult);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccess(@NotNull Continuation<TResult, TContinuationResult> continuation, @Nullable CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @Nullable CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public final boolean waitForCompletion(long j, @NotNull TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!isCompleted()) {
                this.condition.await(j, timeUnit);
            }
            return isCompleted();
        } finally {
            reentrantLock.unlock();
        }
    }

    private Task(boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.continuations = new ArrayList();
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, null);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NotNull Continuation<TResult, TContinuationResult> continuation, @Nullable CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    @NotNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NotNull Continuation<TResult, Task<TContinuationResult>> continuation, @Nullable CancellationToken cancellationToken) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <TOut> Task<TOut> cast() {
        return this;
    }
}

package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.CollectionFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.Partially;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C21114v8;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* loaded from: classes4.dex */
    public static final class CallbackListener<V> implements Runnable {

        /* renamed from: b */
        final Future<V> f41839b;

        /* renamed from: c */
        final FutureCallback<? super V> f41840c;

        CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.f41839b = future;
            this.f41840c = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable tryInternalFastPathGetFailure;
            Future<V> future = this.f41839b;
            if ((future instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) future)) != null) {
                this.f41840c.onFailure(tryInternalFastPathGetFailure);
                return;
            }
            try {
                this.f41840c.onSuccess(Futures.getDone(this.f41839b));
            } catch (Error e) {
                e = e;
                this.f41840c.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f41840c.onFailure(e);
            } catch (ExecutionException e3) {
                this.f41840c.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).addValue(this.f41840c).toString();
        }
    }

    @Beta
    @GwtCompatible
    @CanIgnoreReturnValue
    /* loaded from: classes4.dex */
    public static final class FutureCombiner<V> {

        /* renamed from: a */
        private final boolean f41841a;

        /* renamed from: b */
        private final ImmutableList<ListenableFuture<? extends V>> f41842b;

        @CanIgnoreReturnValue
        public <C> ListenableFuture<C> call(Callable<C> callable, Executor executor) {
            return new CombinedFuture(this.f41842b, this.f41841a, executor, callable);
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> asyncCallable, Executor executor) {
            return new CombinedFuture(this.f41842b, this.f41841a, executor, asyncCallable);
        }

        public ListenableFuture<?> run(final Runnable runnable, Executor executor) {
            return call(new Callable<Void>(this) { // from class: com.google.common.util.concurrent.Futures.FutureCombiner.1
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    runnable.run();
                    return null;
                }
            }, executor);
        }

        private FutureCombiner(boolean z, ImmutableList<ListenableFuture<? extends V>> immutableList) {
            this.f41841a = z;
            this.f41842b = immutableList;
        }
    }

    /* loaded from: classes4.dex */
    private static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {

        /* renamed from: j */
        private InCompletionOrderState<T> f41844j;

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            InCompletionOrderState<T> inCompletionOrderState = this.f41844j;
            if (super.cancel(z)) {
                Objects.requireNonNull(inCompletionOrderState);
                inCompletionOrderState.m67582g(z);
                return true;
            }
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: m */
        public void mo67441m() {
            this.f41844j = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: y */
        public String mo67440y() {
            InCompletionOrderState<T> inCompletionOrderState = this.f41844j;
            if (inCompletionOrderState != null) {
                int length = ((InCompletionOrderState) inCompletionOrderState).f41848d.length;
                int i = ((InCompletionOrderState) inCompletionOrderState).f41847c.get();
                StringBuilder sb2 = new StringBuilder(49);
                sb2.append("inputCount=[");
                sb2.append(length);
                sb2.append("], remaining=[");
                sb2.append(i);
                sb2.append(C21114v8.C21123i.f54139e);
                return sb2.toString();
            }
            return null;
        }

        private InCompletionOrderFuture(InCompletionOrderState<T> inCompletionOrderState) {
            this.f41844j = inCompletionOrderState;
        }
    }

    /* loaded from: classes4.dex */
    public static final class InCompletionOrderState<T> {

        /* renamed from: a */
        private boolean f41845a;

        /* renamed from: b */
        private boolean f41846b;

        /* renamed from: c */
        private final AtomicInteger f41847c;

        /* renamed from: d */
        private final ListenableFuture<? extends T>[] f41848d;

        /* renamed from: e */
        private volatile int f41849e;

        /* renamed from: e */
        private void m67584e() {
            ListenableFuture<? extends T>[] listenableFutureArr;
            if (this.f41847c.decrementAndGet() == 0 && this.f41845a) {
                for (ListenableFuture<? extends T> listenableFuture : this.f41848d) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.f41846b);
                    }
                }
            }
        }

        /* renamed from: f */
        public void m67583f(ImmutableList<AbstractFuture<T>> immutableList, int i) {
            ListenableFuture<? extends T> listenableFuture = this.f41848d[i];
            Objects.requireNonNull(listenableFuture);
            ListenableFuture<? extends T> listenableFuture2 = listenableFuture;
            this.f41848d[i] = null;
            for (int i2 = this.f41849e; i2 < immutableList.size(); i2++) {
                if (immutableList.get(i2).setFuture(listenableFuture2)) {
                    m67584e();
                    this.f41849e = i2 + 1;
                    return;
                }
            }
            this.f41849e = immutableList.size();
        }

        /* renamed from: g */
        public void m67582g(boolean z) {
            this.f41845a = true;
            if (!z) {
                this.f41846b = false;
            }
            m67584e();
        }

        private InCompletionOrderState(ListenableFuture<? extends T>[] listenableFutureArr) {
            this.f41845a = false;
            this.f41846b = true;
            this.f41849e = 0;
            this.f41848d = listenableFutureArr;
            this.f41847c = new AtomicInteger(listenableFutureArr.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {

        /* renamed from: j */
        private ListenableFuture<V> f41850j;

        NonCancellationPropagatingFuture(ListenableFuture<V> listenableFuture) {
            this.f41850j = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: m */
        public void mo67441m() {
            this.f41850j = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<V> listenableFuture = this.f41850j;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: y */
        public String mo67440y() {
            ListenableFuture<V> listenableFuture = this.f41850j;
            if (listenableFuture != null) {
                String valueOf = String.valueOf(listenableFuture);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 11);
                sb2.append("delegate=[");
                sb2.append(valueOf);
                sb2.append(C21114v8.C21123i.f54139e);
                return sb2.toString();
            }
            return null;
        }
    }

    private Futures() {
    }

    /* renamed from: a */
    private static <T> ListenableFuture<? extends T>[] m67591a(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        Collection copyOf;
        if (iterable instanceof Collection) {
            copyOf = (Collection) iterable;
        } else {
            copyOf = ImmutableList.copyOf(iterable);
        }
        return (ListenableFuture[]) copyOf.toArray(new ListenableFuture[0]);
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(listenableFutureArr), true);
    }

    /* renamed from: b */
    private static void m67590b(Throwable th) {
        if (th instanceof Error) {
            throw new ExecutionError((Error) th);
        }
        throw new UncheckedExecutionException(th);
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @Beta
    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
        return AbstractCatchingFuture.m67805C(listenableFuture, cls, function, executor);
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @Beta
    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        return AbstractCatchingFuture.m67804D(listenableFuture, cls, asyncFunction, executor);
    }

    @Beta
    @GwtIncompatible
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) FuturesGetChecked.m67578d(future, cls);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getDone(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) Uninterruptibles.getUninterruptibly(future);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUnchecked(Future<V> future) {
        Preconditions.checkNotNull(future);
        try {
            return (V) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e) {
            m67590b(e.getCause());
            throw new AssertionError();
        }
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
        ImmediateFuture.ImmediateCancelledFuture<Object> immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.f41858j;
        if (immediateCancelledFuture != null) {
            return immediateCancelledFuture;
        }
        return new ImmediateFuture.ImmediateCancelledFuture();
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th) {
        Preconditions.checkNotNull(th);
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> ListenableFuture<V> immediateFuture(@ParametricNullness V v) {
        if (v == null) {
            return (ListenableFuture<V>) ImmediateFuture.f41855c;
        }
        return new ImmediateFuture(v);
    }

    public static ListenableFuture<Void> immediateVoidFuture() {
        return ImmediateFuture.f41855c;
    }

    public static <T> ImmutableList<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        ListenableFuture[] m67591a = m67591a(iterable);
        final InCompletionOrderState inCompletionOrderState = new InCompletionOrderState(m67591a);
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(m67591a.length);
        for (int i = 0; i < m67591a.length; i++) {
            builderWithExpectedSize.add((ImmutableList.Builder) new InCompletionOrderFuture(inCompletionOrderState));
        }
        final ImmutableList<ListenableFuture<T>> build = builderWithExpectedSize.build();
        for (final int i2 = 0; i2 < m67591a.length; i2++) {
            m67591a[i2].addListener(new Runnable() { // from class: com.google.common.util.concurrent.Futures.3
                @Override // java.lang.Runnable
                public void run() {
                    inCompletionOrderState.m67583f(build, i2);
                }
            }, MoreExecutors.directExecutor());
        }
        return build;
    }

    @Beta
    @GwtIncompatible
    public static <I, O> Future<O> lazyTransform(final Future<I> future, final Function<? super I, ? extends O> function) {
        Preconditions.checkNotNull(future);
        Preconditions.checkNotNull(function);
        return new Future<O>() { // from class: com.google.common.util.concurrent.Futures.2
            /* renamed from: a */
            private O m67589a(I i) throws ExecutionException {
                try {
                    return (O) function.apply(i);
                } catch (Throwable th) {
                    throw new ExecutionException(th);
                }
            }

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z) {
                return future.cancel(z);
            }

            @Override // java.util.concurrent.Future
            public O get() throws InterruptedException, ExecutionException {
                return m67589a(future.get());
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return future.isCancelled();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return future.isDone();
            }

            @Override // java.util.concurrent.Future
            public O get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
                return m67589a(future.get(j, timeUnit));
            }
        };
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new NonCancellationPropagatingFuture(listenableFuture);
        listenableFuture.addListener(nonCancellationPropagatingFuture, MoreExecutors.directExecutor());
        return nonCancellationPropagatingFuture;
    }

    @GwtIncompatible
    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> asyncCallable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TrustedListenableFutureTask m67444C = TrustedListenableFutureTask.m67444C(asyncCallable);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(m67444C, j, timeUnit);
        m67444C.addListener(new Runnable() { // from class: com.google.common.util.concurrent.Futures.1
            @Override // java.lang.Runnable
            public void run() {
                schedule.cancel(false);
            }
        }, MoreExecutors.directExecutor());
        return m67444C;
    }

    public static <O> ListenableFuture<O> submit(Callable<O> callable, Executor executor) {
        TrustedListenableFutureTask m67442E = TrustedListenableFutureTask.m67442E(callable);
        executor.execute(m67442E);
        return m67442E;
    }

    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> asyncCallable, Executor executor) {
        TrustedListenableFutureTask m67444C = TrustedListenableFutureTask.m67444C(asyncCallable);
        executor.execute(m67444C);
        return m67444C;
    }

    @SafeVarargs
    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(listenableFutureArr), false);
    }

    @Beta
    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        return AbstractTransformFuture.m67717C(listenableFuture, function, executor);
    }

    @Beta
    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        return AbstractTransformFuture.m67716D(listenableFuture, asyncFunction, executor);
    }

    @SafeVarargs
    @Beta
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(listenableFutureArr));
    }

    @SafeVarargs
    @Beta
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(listenableFutureArr));
    }

    @Beta
    @GwtIncompatible
    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return TimeoutFuture.m67445F(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    @Beta
    @GwtIncompatible
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        return (V) FuturesGetChecked.m67577e(future, cls, j, timeUnit);
    }

    @Beta
    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(iterable), false);
    }

    @Beta
    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(iterable));
    }

    @Beta
    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(iterable));
    }

    @Beta
    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(iterable), true);
    }

    public static ListenableFuture<Void> submit(Runnable runnable, Executor executor) {
        TrustedListenableFutureTask m67443D = TrustedListenableFutureTask.m67443D(runnable, null);
        executor.execute(m67443D);
        return m67443D;
    }
}

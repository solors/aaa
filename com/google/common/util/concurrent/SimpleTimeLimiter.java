package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.SimpleTimeLimiter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class SimpleTimeLimiter implements TimeLimiter {

    /* renamed from: a */
    private final ExecutorService f41936a;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1 */
    /* loaded from: classes4.dex */
    class C171501 implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Object f41937a;

        /* renamed from: b */
        final /* synthetic */ long f41938b;

        /* renamed from: c */
        final /* synthetic */ TimeUnit f41939c;

        /* renamed from: d */
        final /* synthetic */ Set f41940d;

        C171501(Object obj, long j, TimeUnit timeUnit, Set set) {
            SimpleTimeLimiter.this = r1;
            this.f41937a = obj;
            this.f41938b = j;
            this.f41939c = timeUnit;
            this.f41940d = set;
        }

        /* renamed from: b */
        public static /* synthetic */ Object m67477b(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw SimpleTimeLimiter.m67481h(e, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
            final Object obj2 = this.f41937a;
            return SimpleTimeLimiter.this.m67486c(new Callable() { // from class: com.google.common.util.concurrent.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m67477b;
                    m67477b = SimpleTimeLimiter.C171501.m67477b(method, obj2, objArr);
                    return m67477b;
                }
            }, this.f41938b, this.f41939c, this.f41940d.contains(method));
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
        this.f41936a = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    /* renamed from: c */
    public <T> T m67486c(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        m67485d(j);
        Future<T> submit = this.f41936a.submit(callable);
        try {
            if (z) {
                try {
                    return submit.get(j, timeUnit);
                } catch (InterruptedException e) {
                    submit.cancel(true);
                    throw e;
                }
            }
            return (T) Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e2) {
            throw m67481h(e2, true);
        } catch (TimeoutException e3) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e3);
        }
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        return new SimpleTimeLimiter(executorService);
    }

    /* renamed from: d */
    private static void m67485d(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "timeout must be positive: %s", j);
    }

    /* renamed from: e */
    private static boolean m67484e(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static Set<Method> m67483f(Class<?> cls) {
        Method[] methods;
        HashSet newHashSet = Sets.newHashSet();
        for (Method method : cls.getMethods()) {
            if (m67484e(method)) {
                newHashSet.add(method);
            }
        }
        return newHashSet;
    }

    /* renamed from: g */
    private static <T> T m67482g(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: h */
    public static Exception m67481h(Exception exc, boolean z) throws Exception {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z) {
                cause.setStackTrace((StackTraceElement[]) ObjectArrays.concat(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
            }
            if (!(cause instanceof Exception)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw exc;
            }
            throw ((Exception) cause);
        }
        throw exc;
    }

    /* renamed from: i */
    private void m67480i(Throwable th) throws ExecutionException {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                throw new UncheckedExecutionException(th);
            }
            throw new ExecutionException(th);
        }
        throw new ExecutionError((Error) th);
    }

    /* renamed from: j */
    private void m67479j(Throwable th) {
        if (th instanceof Error) {
            throw new ExecutionError((Error) th);
        }
        throw new UncheckedExecutionException(th);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        m67485d(j);
        Future<T> submit = this.f41936a.submit(callable);
        try {
            return (T) Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e) {
            m67480i(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @CanIgnoreReturnValue
    public <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        m67485d(j);
        Future<T> submit = this.f41936a.submit(callable);
        try {
            return submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            m67480i(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        m67485d(j);
        Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) m67482g(cls, new C171501(t, j, timeUnit, m67483f(cls)));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        m67485d(j);
        Future<?> submit = this.f41936a.submit(runnable);
        try {
            Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e) {
            m67479j(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeUnit);
        m67485d(j);
        Future<?> submit = this.f41936a.submit(runnable);
        try {
            submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            m67479j(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }
}

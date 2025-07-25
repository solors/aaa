package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class FuturesGetChecked {

    /* renamed from: a */
    private static final Ordering<Constructor<?>> f41851a = Ordering.natural().onResultOf(new Function<Constructor<?>, Boolean>() { // from class: com.google.common.util.concurrent.FuturesGetChecked.1
        @Override // com.google.common.base.Function
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }).reverse();

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes4.dex */
    public interface GetCheckedTypeValidator {
        void validateClass(Class<? extends Exception> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static class GetCheckedTypeValidatorHolder {

        /* renamed from: a */
        static final GetCheckedTypeValidator f41852a = m67569a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public enum WeakSetValidator implements GetCheckedTypeValidator {
            INSTANCE;
            

            /* renamed from: b */
            private static final Set<WeakReference<Class<? extends Exception>>> f41853b = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator
            public void validateClass(Class<? extends Exception> cls) {
                for (WeakReference<Class<? extends Exception>> weakReference : f41853b) {
                    if (cls.equals(weakReference.get())) {
                        return;
                    }
                }
                FuturesGetChecked.m67580b(cls);
                Set<WeakReference<Class<? extends Exception>>> set = f41853b;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        GetCheckedTypeValidatorHolder() {
        }

        /* renamed from: a */
        static GetCheckedTypeValidator m67569a() {
            return FuturesGetChecked.m67571k();
        }
    }

    private FuturesGetChecked() {
    }

    /* renamed from: a */
    private static GetCheckedTypeValidator m67581a() {
        return GetCheckedTypeValidatorHolder.f41852a;
    }

    @VisibleForTesting
    /* renamed from: b */
    static void m67580b(Class<? extends Exception> cls) {
        Preconditions.checkArgument(m67575g(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        Preconditions.checkArgument(m67576f(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    @ParametricNullness
    /* renamed from: c */
    static <V, X extends Exception> V m67579c(GetCheckedTypeValidator getCheckedTypeValidator, Future<V> future, Class<X> cls) throws Exception {
        getCheckedTypeValidator.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m67573i(cls, e);
        } catch (ExecutionException e2) {
            m67570l(e2.getCause(), cls);
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    @ParametricNullness
    /* renamed from: d */
    public static <V, X extends Exception> V m67578d(Future<V> future, Class<X> cls) throws Exception {
        return (V) m67579c(m67581a(), future, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    @ParametricNullness
    /* renamed from: e */
    public static <V, X extends Exception> V m67577e(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        m67581a().validateClass(cls);
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m67573i(cls, e);
        } catch (ExecutionException e2) {
            m67570l(e2.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            throw m67573i(cls, e3);
        }
    }

    /* renamed from: f */
    private static boolean m67576f(Class<? extends Exception> cls) {
        try {
            m67573i(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: g */
    static boolean m67575g(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    /* renamed from: h */
    private static <X> X m67574h(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: i */
    private static <X extends Exception> X m67573i(Class<X> cls, Throwable th) {
        for (Constructor constructor : m67572j(Arrays.asList(cls.getConstructors()))) {
            X x = (X) m67574h(constructor, th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 82);
        sb2.append("No appropriate constructor for exception of type ");
        sb2.append(valueOf);
        sb2.append(" in response to chained exception");
        throw new IllegalArgumentException(sb2.toString(), th);
    }

    /* renamed from: j */
    private static <X extends Exception> List<Constructor<X>> m67572j(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f41851a.sortedCopy(list);
    }

    @VisibleForTesting
    /* renamed from: k */
    static GetCheckedTypeValidator m67571k() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    /* renamed from: l */
    private static <X extends Exception> void m67570l(Throwable th, Class<X> cls) throws Exception {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                throw new UncheckedExecutionException(th);
            }
            throw m67573i(cls, th);
        }
        throw new ExecutionError((Error) th);
    }
}

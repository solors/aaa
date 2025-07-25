package com.google.common.util.concurrent;

import androidx.concurrent.futures.C1074a;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.internal.ads.C16278h;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C21114v8;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
/* loaded from: classes4.dex */
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {

    /* renamed from: f */
    static final boolean f41596f;

    /* renamed from: g */
    private static final Logger f41597g;

    /* renamed from: h */
    private static final AtomicHelper f41598h;

    /* renamed from: i */
    private static final Object f41599i;

    /* renamed from: b */
    private volatile Object f41600b;

    /* renamed from: c */
    private volatile Listener f41601c;

    /* renamed from: d */
    private volatile Waiter f41602d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        /* renamed from: a */
        abstract boolean mo67767a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2);

        /* renamed from: b */
        abstract boolean mo67766b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo67765c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2);

        /* renamed from: d */
        abstract Listener mo67764d(AbstractFuture<?> abstractFuture, Listener listener);

        /* renamed from: e */
        abstract Waiter mo67763e(AbstractFuture<?> abstractFuture, Waiter waiter);

        /* renamed from: f */
        abstract void mo67762f(Waiter waiter, Waiter waiter2);

        /* renamed from: g */
        abstract void mo67761g(Waiter waiter, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Cancellation {

        /* renamed from: c */
        static final Cancellation f41603c;

        /* renamed from: d */
        static final Cancellation f41604d;

        /* renamed from: a */
        final boolean f41605a;

        /* renamed from: b */
        final Throwable f41606b;

        static {
            if (AbstractFuture.f41596f) {
                f41604d = null;
                f41603c = null;
                return;
            }
            f41604d = new Cancellation(false, null);
            f41603c = new Cancellation(true, null);
        }

        Cancellation(boolean z, Throwable th) {
            this.f41605a = z;
            this.f41606b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Failure {

        /* renamed from: b */
        static final Failure f41607b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a */
        final Throwable f41608a;

        Failure(Throwable th) {
            this.f41608a = (Throwable) Preconditions.checkNotNull(th);
        }
    }

    /* loaded from: classes4.dex */
    private static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<Waiter, Thread> f41613a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<Waiter, Waiter> f41614b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractFuture, Waiter> f41615c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractFuture, Listener> f41616d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> f41617e;

        SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, Waiter> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, Listener> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f41613a = atomicReferenceFieldUpdater;
            this.f41614b = atomicReferenceFieldUpdater2;
            this.f41615c = atomicReferenceFieldUpdater3;
            this.f41616d = atomicReferenceFieldUpdater4;
            this.f41617e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: a */
        boolean mo67767a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return C1074a.m105283a(this.f41616d, abstractFuture, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: b */
        boolean mo67766b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C1074a.m105283a(this.f41617e, abstractFuture, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: c */
        boolean mo67765c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return C1074a.m105283a(this.f41615c, abstractFuture, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: d */
        Listener mo67764d(AbstractFuture<?> abstractFuture, Listener listener) {
            return this.f41616d.getAndSet(abstractFuture, listener);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: e */
        Waiter mo67763e(AbstractFuture<?> abstractFuture, Waiter waiter) {
            return this.f41615c.getAndSet(abstractFuture, waiter);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: f */
        void mo67762f(Waiter waiter, Waiter waiter2) {
            this.f41614b.lazySet(waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: g */
        void mo67761g(Waiter waiter, Thread thread) {
            this.f41613a.lazySet(waiter, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SetFuture<V> implements Runnable {

        /* renamed from: b */
        final AbstractFuture<V> f41618b;

        /* renamed from: c */
        final ListenableFuture<? extends V> f41619c;

        SetFuture(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.f41618b = abstractFuture;
            this.f41619c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractFuture) this.f41618b).f41600b == this) {
                if (AbstractFuture.f41598h.mo67766b(this.f41618b, this, AbstractFuture.m67771u(this.f41619c))) {
                    AbstractFuture.m67774r(this.f41618b);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private static final class SynchronizedHelper extends AtomicHelper {
        private SynchronizedHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: a */
        boolean mo67767a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                if (((AbstractFuture) abstractFuture).f41601c == listener) {
                    ((AbstractFuture) abstractFuture).f41601c = listener2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: b */
        boolean mo67766b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (((AbstractFuture) abstractFuture).f41600b == obj) {
                    ((AbstractFuture) abstractFuture).f41600b = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: c */
        boolean mo67765c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                if (((AbstractFuture) abstractFuture).f41602d == waiter) {
                    ((AbstractFuture) abstractFuture).f41602d = waiter2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: d */
        Listener mo67764d(AbstractFuture<?> abstractFuture, Listener listener) {
            Listener listener2;
            synchronized (abstractFuture) {
                listener2 = ((AbstractFuture) abstractFuture).f41601c;
                if (listener2 != listener) {
                    ((AbstractFuture) abstractFuture).f41601c = listener;
                }
            }
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: e */
        Waiter mo67763e(AbstractFuture<?> abstractFuture, Waiter waiter) {
            Waiter waiter2;
            synchronized (abstractFuture) {
                waiter2 = ((AbstractFuture) abstractFuture).f41602d;
                if (waiter2 != waiter) {
                    ((AbstractFuture) abstractFuture).f41602d = waiter;
                }
            }
            return waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: f */
        void mo67762f(Waiter waiter, Waiter waiter2) {
            waiter.f41628b = waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: g */
        void mo67761g(Waiter waiter, Thread thread) {
            waiter.f41627a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface Trusted<V> extends ListenableFuture<V> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @CanIgnoreReturnValue
        @ParametricNullness
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    /* loaded from: classes4.dex */
    private static final class UnsafeAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        static final Unsafe f41620a;

        /* renamed from: b */
        static final long f41621b;

        /* renamed from: c */
        static final long f41622c;

        /* renamed from: d */
        static final long f41623d;

        /* renamed from: e */
        static final long f41624e;

        /* renamed from: f */
        static final long f41625f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.1
                        @Override // java.security.PrivilegedExceptionAction
                        public Unsafe run() throws Exception {
                            Field[] declaredFields;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    f41622c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("d"));
                    f41621b = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM));
                    f41623d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("b"));
                    f41624e = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("a"));
                    f41625f = unsafe.objectFieldOffset(Waiter.class.getDeclaredField("b"));
                    f41620a = unsafe;
                } catch (Exception e) {
                    Throwables.throwIfUnchecked(e);
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        private UnsafeAtomicHelper() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: a */
        boolean mo67767a(AbstractFuture<?> abstractFuture, Listener listener, Listener listener2) {
            return C16278h.m72294a(f41620a, abstractFuture, f41621b, listener, listener2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: b */
        boolean mo67766b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return C16278h.m72294a(f41620a, abstractFuture, f41623d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: c */
        boolean mo67765c(AbstractFuture<?> abstractFuture, Waiter waiter, Waiter waiter2) {
            return C16278h.m72294a(f41620a, abstractFuture, f41622c, waiter, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: d */
        Listener mo67764d(AbstractFuture<?> abstractFuture, Listener listener) {
            Listener listener2;
            do {
                listener2 = ((AbstractFuture) abstractFuture).f41601c;
                if (listener == listener2) {
                    return listener2;
                }
            } while (!mo67767a(abstractFuture, listener2, listener));
            return listener2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: e */
        Waiter mo67763e(AbstractFuture<?> abstractFuture, Waiter waiter) {
            Waiter waiter2;
            do {
                waiter2 = ((AbstractFuture) abstractFuture).f41602d;
                if (waiter == waiter2) {
                    return waiter2;
                }
            } while (!mo67765c(abstractFuture, waiter2, waiter));
            return waiter2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: f */
        void mo67762f(Waiter waiter, Waiter waiter2) {
            f41620a.putObject(waiter, f41625f, waiter2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        /* renamed from: g */
        void mo67761g(Waiter waiter, Thread thread) {
            f41620a.putObject(waiter, f41624e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Waiter {

        /* renamed from: c */
        static final Waiter f41626c = new Waiter(false);

        /* renamed from: a */
        volatile Thread f41627a;

        /* renamed from: b */
        volatile Waiter f41628b;

        Waiter() {
            AbstractFuture.f41598h.mo67761g(this, Thread.currentThread());
        }

        Waiter(boolean z) {
        }

        /* renamed from: a */
        void m67760a(Waiter waiter) {
            AbstractFuture.f41598h.mo67762f(this, waiter);
        }

        /* renamed from: b */
        void m67759b() {
            Thread thread = this.f41627a;
            if (thread != null) {
                this.f41627a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        boolean z;
        AtomicHelper synchronizedHelper;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f41596f = z;
        f41597g = Logger.getLogger(AbstractFuture.class.getName());
        Throwable th = null;
        try {
            synchronizedHelper = new UnsafeAtomicHelper();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "b"));
            } catch (Throwable th3) {
                synchronizedHelper = new SynchronizedHelper();
                th = th3;
            }
        }
        f41598h = synchronizedHelper;
        if (th != null) {
            Logger logger = f41597g;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f41599i = new Object();
    }

    /* renamed from: A */
    private void m67791A(Waiter waiter) {
        waiter.f41627a = null;
        while (true) {
            Waiter waiter2 = this.f41602d;
            if (waiter2 == Waiter.f41626c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f41628b;
                if (waiter2.f41627a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f41628b = waiter4;
                    if (waiter3.f41627a == null) {
                        break;
                    }
                } else if (!f41598h.mo67765c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    /* renamed from: k */
    private void m67780k(StringBuilder sb2) {
        try {
            Object m67770v = m67770v(this);
            sb2.append("SUCCESS, result=[");
            m67778n(sb2, m67770v);
            sb2.append(C21114v8.C21123i.f54139e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e2.getCause());
            sb2.append(C21114v8.C21123i.f54139e);
        }
    }

    /* renamed from: l */
    private void m67779l(StringBuilder sb2) {
        String sb3;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f41600b;
        if (obj instanceof SetFuture) {
            sb2.append(", setFuture=[");
            m67777o(sb2, ((SetFuture) obj).f41619c);
            sb2.append(C21114v8.C21123i.f54139e);
        } else {
            try {
                sb3 = Strings.emptyToNull(mo67440y());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 38);
                sb4.append("Exception thrown from implementation: ");
                sb4.append(valueOf);
                sb3 = sb4.toString();
            }
            if (sb3 != null) {
                sb2.append(", info=[");
                sb2.append(sb3);
                sb2.append(C21114v8.C21123i.f54139e);
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            m67780k(sb2);
        }
    }

    /* renamed from: n */
    private void m67778n(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: o */
    private void m67777o(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e.getClass());
        }
    }

    /* renamed from: p */
    private static CancellationException m67776p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: q */
    private Listener m67775q(Listener listener) {
        Listener listener2 = listener;
        Listener mo67764d = f41598h.mo67764d(this, Listener.f41609d);
        while (mo67764d != null) {
            Listener listener3 = mo67764d.f41612c;
            mo67764d.f41612c = listener2;
            listener2 = mo67764d;
            mo67764d = listener3;
        }
        return listener2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.AbstractFuture$AtomicHelper] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.AbstractFuture<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.AbstractFuture] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.common.util.concurrent.AbstractFuture<V>, com.google.common.util.concurrent.AbstractFuture] */
    /* renamed from: r */
    public static void m67774r(AbstractFuture<?> abstractFuture) {
        Listener listener = null;
        while (true) {
            abstractFuture.m67768z();
            abstractFuture.mo67441m();
            Listener m67775q = abstractFuture.m67775q(listener);
            while (m67775q != null) {
                listener = m67775q.f41612c;
                Runnable runnable = m67775q.f41610a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof SetFuture) {
                    SetFuture setFuture = (SetFuture) runnable2;
                    abstractFuture = setFuture.f41618b;
                    if (((AbstractFuture) abstractFuture).f41600b == setFuture) {
                        if (f41598h.mo67766b(abstractFuture, setFuture, m67771u(setFuture.f41619c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = m67775q.f41611b;
                    Objects.requireNonNull(executor);
                    m67773s(runnable2, executor);
                }
                m67775q = listener;
            }
            return;
        }
    }

    /* renamed from: s */
    private static void m67773s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f41597g;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.log(level, sb2.toString(), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    /* renamed from: t */
    private V m67772t(Object obj) throws ExecutionException {
        if (!(obj instanceof Cancellation)) {
            if (!(obj instanceof Failure)) {
                if (obj == f41599i) {
                    return (V) NullnessCasts.m67528b();
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f41608a);
        }
        throw m67776p("Task was cancelled.", ((Cancellation) obj).f41606b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static Object m67771u(ListenableFuture<?> listenableFuture) {
        Throwable tryInternalFastPathGetFailure;
        if (listenableFuture instanceof Trusted) {
            Object obj = ((AbstractFuture) listenableFuture).f41600b;
            if (obj instanceof Cancellation) {
                Cancellation cancellation = (Cancellation) obj;
                if (cancellation.f41605a) {
                    obj = cancellation.f41606b != null ? new Cancellation(false, cancellation.f41606b) : Cancellation.f41604d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((listenableFuture instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new Failure(tryInternalFastPathGetFailure);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!f41596f) & isCancelled) {
                Cancellation cancellation2 = Cancellation.f41604d;
                Objects.requireNonNull(cancellation2);
                return cancellation2;
            }
            try {
                Object m67770v = m67770v(listenableFuture);
                if (isCancelled) {
                    String valueOf = String.valueOf(listenableFuture);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
                    sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb2.append(valueOf);
                    return new Cancellation(false, new IllegalArgumentException(sb2.toString()));
                } else if (m67770v == null) {
                    return f41599i;
                } else {
                    return m67770v;
                }
            } catch (CancellationException e) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(listenableFuture);
                    StringBuilder sb3 = new StringBuilder(valueOf2.length() + 77);
                    sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb3.append(valueOf2);
                    return new Failure(new IllegalArgumentException(sb3.toString(), e));
                }
                return new Cancellation(false, e);
            } catch (ExecutionException e2) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(listenableFuture);
                    StringBuilder sb4 = new StringBuilder(valueOf3.length() + 84);
                    sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb4.append(valueOf3);
                    return new Cancellation(false, new IllegalArgumentException(sb4.toString(), e2));
                }
                return new Failure(e2.getCause());
            } catch (Throwable th) {
                return new Failure(th);
            }
        }
    }

    @ParametricNullness
    /* renamed from: v */
    private static <V> V m67770v(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: z */
    private void m67768z() {
        for (Waiter mo67763e = f41598h.mo67763e(this, Waiter.f41626c); mo67763e != null; mo67763e = mo67763e.f41628b) {
            mo67763e.m67759b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean m67790B() {
        Object obj = this.f41600b;
        if ((obj instanceof Cancellation) && ((Cancellation) obj).f41605a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    /* renamed from: a */
    public final Throwable mo67427a() {
        if (this instanceof Trusted) {
            Object obj = this.f41600b;
            if (obj instanceof Failure) {
                return ((Failure) obj).f41608a;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (listener = this.f41601c) != Listener.f41609d) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f41612c = listener;
                if (f41598h.mo67767a(this, listener, listener2)) {
                    return;
                }
                listener = this.f41601c;
            } while (listener != Listener.f41609d);
            m67773s(runnable, executor);
        }
        m67773s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        boolean z2;
        Cancellation cancellation;
        boolean z3;
        Object obj = this.f41600b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof SetFuture))) {
            return false;
        }
        if (f41596f) {
            cancellation = new Cancellation(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                cancellation = Cancellation.f41603c;
            } else {
                cancellation = Cancellation.f41604d;
            }
            Objects.requireNonNull(cancellation);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z4 = false;
        while (true) {
            if (f41598h.mo67766b(abstractFuture, obj, cancellation)) {
                if (z) {
                    abstractFuture.mo67629w();
                }
                m67774r(abstractFuture);
                if (!(obj instanceof SetFuture)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((SetFuture) obj).f41619c;
                if (listenableFuture instanceof Trusted) {
                    abstractFuture = (AbstractFuture) listenableFuture;
                    obj = abstractFuture.f41600b;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(z3 | (obj instanceof SetFuture))) {
                        return true;
                    }
                    z4 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj = abstractFuture.f41600b;
                if (!(obj instanceof SetFuture)) {
                    return z4;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f41600b;
            if ((obj != null) & (!(obj instanceof SetFuture))) {
                return m67772t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                Waiter waiter = this.f41602d;
                if (waiter != Waiter.f41626c) {
                    Waiter waiter2 = new Waiter();
                    do {
                        waiter2.m67760a(waiter);
                        if (f41598h.mo67765c(this, waiter, waiter2)) {
                            do {
                                OverflowAvoidingLockSupport.m67527a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f41600b;
                                    if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                                        return m67772t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m67791A(waiter2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m67791A(waiter2);
                        } else {
                            waiter = this.f41602d;
                        }
                    } while (waiter != Waiter.f41626c);
                    Object obj3 = this.f41600b;
                    Objects.requireNonNull(obj3);
                    return m67772t(obj3);
                }
                Object obj32 = this.f41600b;
                Objects.requireNonNull(obj32);
                return m67772t(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f41600b;
                if ((obj4 != null) & (!(obj4 instanceof SetFuture))) {
                    return m67772t(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb2.append("Waited ");
            sb2.append(j);
            sb2.append(" ");
            sb2.append(lowerCase2);
            String sb3 = sb2.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb3).concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb4.append(valueOf);
                    sb4.append(convert);
                    sb4.append(" ");
                    sb4.append(lowerCase);
                    String sb5 = sb4.toString();
                    if (z) {
                        sb5 = String.valueOf(sb5).concat(",");
                    }
                    concat = String.valueOf(sb5).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                    sb6.append(valueOf2);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    concat = sb6.toString();
                }
                sb3 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(sb3).length() + 5 + String.valueOf(abstractFuture).length());
            sb7.append(sb3);
            sb7.append(" for ");
            sb7.append(abstractFuture);
            throw new TimeoutException(sb7.toString());
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f41600b instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj;
        boolean z;
        if (this.f41600b != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof SetFuture)) & z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    public boolean set(@ParametricNullness V v) {
        if (v == null) {
            v = (V) f41599i;
        }
        if (f41598h.mo67766b(this, null, v)) {
            m67774r(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    public boolean setException(Throwable th) {
        if (f41598h.mo67766b(this, null, new Failure((Throwable) Preconditions.checkNotNull(th)))) {
            m67774r(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        Preconditions.checkNotNull(listenableFuture);
        Object obj = this.f41600b;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f41598h.mo67766b(this, null, m67771u(listenableFuture))) {
                    return false;
                }
                m67774r(this);
                return true;
            }
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (f41598h.mo67766b(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f41607b;
                    }
                    f41598h.mo67766b(this, setFuture, failure);
                }
                return true;
            }
            obj = this.f41600b;
        }
        if (obj instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj).f41605a);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m67780k(sb2);
        } else {
            m67779l(sb2);
        }
        sb2.append(C21114v8.C21123i.f54139e);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final void m67769x(Future<?> future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(m67790B());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public String mo67440y() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("remaining delay=[");
            sb2.append(delay);
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Listener {

        /* renamed from: d */
        static final Listener f41609d = new Listener();

        /* renamed from: a */
        final Runnable f41610a;

        /* renamed from: b */
        final Executor f41611b;

        /* renamed from: c */
        Listener f41612c;

        Listener(Runnable runnable, Executor executor) {
            this.f41610a = runnable;
            this.f41611b = executor;
        }

        Listener() {
            this.f41610a = null;
            this.f41611b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Beta
    @ForOverride
    /* renamed from: m */
    public void mo67441m() {
    }

    /* renamed from: w */
    protected void mo67629w() {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f41600b;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return m67772t(obj2);
            }
            Waiter waiter = this.f41602d;
            if (waiter != Waiter.f41626c) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.m67760a(waiter);
                    if (f41598h.mo67765c(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f41600b;
                            } else {
                                m67791A(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return m67772t(obj);
                    }
                    waiter = this.f41602d;
                } while (waiter != Waiter.f41626c);
                Object obj3 = this.f41600b;
                Objects.requireNonNull(obj3);
                return m67772t(obj3);
            }
            Object obj32 = this.f41600b;
            Objects.requireNonNull(obj32);
            return m67772t(obj32);
        }
        throw new InterruptedException();
    }
}

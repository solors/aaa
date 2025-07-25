package com.yandex.mobile.ads.impl;

import androidx.concurrent.futures.C1074a;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C21114v8;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

@ReflectionSupport(ReflectionSupport.Level.FULL)
/* renamed from: com.yandex.mobile.ads.impl.i */
/* loaded from: classes8.dex */
public abstract class AbstractFutureC30516i<V> extends tm0 implements Future {

    /* renamed from: e */
    private static final boolean f80249e;

    /* renamed from: f */
    private static final Logger f80250f;

    /* renamed from: g */
    private static final AbstractC30517a f80251g;

    /* renamed from: h */
    private static final Object f80252h;

    /* renamed from: b */
    private volatile Object f80253b;

    /* renamed from: c */
    private volatile C30521d f80254c;

    /* renamed from: d */
    private volatile C30526i f80255d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.i$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC30517a {
        /* renamed from: a */
        abstract void mo33414a(C30526i c30526i, C30526i c30526i2);

        /* renamed from: a */
        abstract void mo33413a(C30526i c30526i, Thread thread);

        /* renamed from: a */
        abstract boolean mo33412a(AbstractFutureC30516i<?> abstractFutureC30516i, C30521d c30521d, C30521d c30521d2);

        /* renamed from: a */
        abstract boolean mo33411a(AbstractFutureC30516i<?> abstractFutureC30516i, C30526i c30526i, C30526i c30526i2);

        /* renamed from: a */
        abstract boolean mo33410a(AbstractFutureC30516i<?> abstractFutureC30516i, Object obj, Object obj2);

        private AbstractC30517a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.i$b */
    /* loaded from: classes8.dex */
    public static final class C30518b {

        /* renamed from: b */
        static final C30518b f80256b;

        /* renamed from: c */
        static final C30518b f80257c;

        /* renamed from: a */
        final Throwable f80258a;

        static {
            if (AbstractFutureC30516i.f80249e) {
                f80257c = null;
                f80256b = null;
                return;
            }
            f80257c = new C30518b(false, null);
            f80256b = new C30518b(true, null);
        }

        C30518b(boolean z, Throwable th) {
            this.f80258a = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.i$c */
    /* loaded from: classes8.dex */
    public static final class C30519c {

        /* renamed from: a */
        final Throwable f80259a;

        /* renamed from: com.yandex.mobile.ads.impl.i$c$a */
        /* loaded from: classes8.dex */
        final class C30520a extends Throwable {
            C30520a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new C30519c(new C30520a());
        }

        C30519c(Throwable th) {
            this.f80259a = (Throwable) uf1.m28793a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.i$d */
    /* loaded from: classes8.dex */
    public static final class C30521d {

        /* renamed from: b */
        static final C30521d f80260b = new C30521d();

        /* renamed from: a */
        C30521d f80261a;

        C30521d() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i$e */
    /* loaded from: classes8.dex */
    private static final class C30522e extends AbstractC30517a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C30526i, Thread> f80262a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C30526i, C30526i> f80263b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractFutureC30516i, C30526i> f80264c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractFutureC30516i, C30521d> f80265d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractFutureC30516i, Object> f80266e;

        C30522e(AtomicReferenceFieldUpdater<C30526i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C30526i, C30526i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFutureC30516i, C30526i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFutureC30516i, C30521d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFutureC30516i, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f80262a = atomicReferenceFieldUpdater;
            this.f80263b = atomicReferenceFieldUpdater2;
            this.f80264c = atomicReferenceFieldUpdater3;
            this.f80265d = atomicReferenceFieldUpdater4;
            this.f80266e = atomicReferenceFieldUpdater5;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final boolean mo33412a(AbstractFutureC30516i<?> abstractFutureC30516i, C30521d c30521d, C30521d c30521d2) {
            return C1074a.m105283a(this.f80265d, abstractFutureC30516i, c30521d, c30521d2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final boolean mo33410a(AbstractFutureC30516i<?> abstractFutureC30516i, Object obj, Object obj2) {
            return C1074a.m105283a(this.f80266e, abstractFutureC30516i, obj, obj2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final boolean mo33411a(AbstractFutureC30516i<?> abstractFutureC30516i, C30526i c30526i, C30526i c30526i2) {
            return C1074a.m105283a(this.f80264c, abstractFutureC30516i, c30526i, c30526i2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final void mo33414a(C30526i c30526i, C30526i c30526i2) {
            this.f80263b.lazySet(c30526i, c30526i2);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final void mo33413a(C30526i c30526i, Thread thread) {
            this.f80262a.lazySet(c30526i, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.i$f */
    /* loaded from: classes8.dex */
    public static final class RunnableC30523f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i$g */
    /* loaded from: classes8.dex */
    private static final class C30524g extends AbstractC30517a {
        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final boolean mo33412a(AbstractFutureC30516i<?> abstractFutureC30516i, C30521d c30521d, C30521d c30521d2) {
            synchronized (abstractFutureC30516i) {
                if (((AbstractFutureC30516i) abstractFutureC30516i).f80254c == c30521d) {
                    ((AbstractFutureC30516i) abstractFutureC30516i).f80254c = c30521d2;
                    return true;
                }
                return false;
            }
        }

        private C30524g() {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final boolean mo33410a(AbstractFutureC30516i<?> abstractFutureC30516i, Object obj, Object obj2) {
            synchronized (abstractFutureC30516i) {
                if (((AbstractFutureC30516i) abstractFutureC30516i).f80253b == obj) {
                    ((AbstractFutureC30516i) abstractFutureC30516i).f80253b = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final boolean mo33411a(AbstractFutureC30516i<?> abstractFutureC30516i, C30526i c30526i, C30526i c30526i2) {
            synchronized (abstractFutureC30516i) {
                if (((AbstractFutureC30516i) abstractFutureC30516i).f80255d == c30526i) {
                    ((AbstractFutureC30516i) abstractFutureC30516i).f80255d = c30526i2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final void mo33414a(C30526i c30526i, C30526i c30526i2) {
            c30526i.f80269b = c30526i2;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i.AbstractC30517a
        /* renamed from: a */
        final void mo33413a(C30526i c30526i, Thread thread) {
            c30526i.f80268a = thread;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.i$h */
    /* loaded from: classes8.dex */
    static abstract class AbstractC30525h<V> extends AbstractFutureC30516i<V> {
        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i, java.util.concurrent.Future
        public final boolean isCancelled() {
            return ((AbstractFutureC30516i) this).f80253b instanceof C30518b;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractFutureC30516i, java.util.concurrent.Future
        @CanIgnoreReturnValue
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    static {
        boolean z;
        AbstractC30517a c30524g;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f80249e = z;
        f80250f = Logger.getLogger(AbstractFutureC30516i.class.getName());
        Throwable th = null;
        try {
            c30524g = new C30522e(AtomicReferenceFieldUpdater.newUpdater(C30526i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C30526i.class, C30526i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC30516i.class, C30526i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC30516i.class, C30521d.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC30516i.class, Object.class, "b"));
        } catch (Throwable th2) {
            c30524g = new C30524g();
            th = th2;
        }
        f80251g = c30524g;
        if (th != null) {
            f80250f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f80252h = new Object();
    }

    protected AbstractFutureC30516i() {
    }

    /* renamed from: a */
    private void m33426a(StringBuilder sb2) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e2.getCause());
                    sb2.append(C21114v8.C21123i.f54139e);
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        m33425a(sb2, v);
        sb2.append(C21114v8.C21123i.f54139e);
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        boolean z2;
        C30518b c30518b;
        C30518b c30518b2;
        Object obj = this.f80253b;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof RunnableC30523f))) {
            return false;
        }
        if (f80249e) {
            c30518b2 = new C30518b(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                c30518b = C30518b.f80256b;
            } else {
                c30518b = C30518b.f80257c;
            }
            c30518b2 = c30518b;
            Objects.requireNonNull(c30518b2);
        }
        while (!f80251g.mo33410a((AbstractFutureC30516i<?>) this, obj, (Object) c30518b2)) {
            obj = this.f80253b;
            if (!(obj instanceof RunnableC30523f)) {
                return false;
            }
        }
        m33428a((AbstractFutureC30516i<?>) this);
        if (!(obj instanceof RunnableC30523f)) {
            return true;
        }
        ((RunnableC30523f) obj).getClass();
        throw null;
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f80253b;
            if ((obj != null) & (!(obj instanceof RunnableC30523f))) {
                return (V) m33427a(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C30526i c30526i = this.f80255d;
                if (c30526i != C30526i.f80267c) {
                    C30526i c30526i2 = new C30526i();
                    do {
                        AbstractC30517a abstractC30517a = f80251g;
                        abstractC30517a.mo33414a(c30526i2, c30526i);
                        if (abstractC30517a.mo33411a((AbstractFutureC30516i<?>) this, c30526i, c30526i2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f80253b;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC30523f))) {
                                        return (V) m33427a(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m33429a(c30526i2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m33429a(c30526i2);
                        } else {
                            c30526i = this.f80255d;
                        }
                    } while (c30526i != C30526i.f80267c);
                    Object obj3 = this.f80253b;
                    Objects.requireNonNull(obj3);
                    return (V) m33427a(obj3);
                }
                Object obj32 = this.f80253b;
                Objects.requireNonNull(obj32);
                return (V) m33427a(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f80253b;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC30523f))) {
                    return (V) m33427a(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFutureC30516i = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractFutureC30516i);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f80253b instanceof C30518b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj;
        boolean z;
        if (this.f80253b != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof RunnableC30523f)) & z;
    }

    public final String toString() {
        String str;
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
            m33426a(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.f80253b;
            if (obj instanceof RunnableC30523f) {
                sb2.append(", setFuture=[");
                ((RunnableC30523f) obj).getClass();
                try {
                    sb2.append((Object) null);
                } catch (RuntimeException | StackOverflowError e) {
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e.getClass());
                }
                sb2.append(C21114v8.C21123i.f54139e);
            } else {
                try {
                    str = jy1.m32698a(m33430a());
                } catch (RuntimeException | StackOverflowError e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null) {
                    sb2.append(", info=[");
                    sb2.append(str);
                    sb2.append(C21114v8.C21123i.f54139e);
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                m33426a(sb2);
            }
        }
        sb2.append(C21114v8.C21123i.f54139e);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.i$i */
    /* loaded from: classes8.dex */
    public static final class C30526i {

        /* renamed from: c */
        static final C30526i f80267c = new C30526i(0);

        /* renamed from: a */
        volatile Thread f80268a;

        /* renamed from: b */
        volatile C30526i f80269b;

        C30526i() {
            AbstractFutureC30516i.f80251g.mo33413a(this, Thread.currentThread());
        }

        C30526i(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public boolean mo33422b(V v) {
        if (f80251g.mo33410a((AbstractFutureC30516i<?>) this, (Object) null, (Object) v)) {
            m33428a((AbstractFutureC30516i<?>) this);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m33425a(StringBuilder sb2, Object obj) {
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

    /* renamed from: a */
    private static void m33428a(AbstractFutureC30516i<?> abstractFutureC30516i) {
        C30526i c30526i;
        C30521d c30521d;
        do {
            c30526i = ((AbstractFutureC30516i) abstractFutureC30516i).f80255d;
        } while (!f80251g.mo33411a(abstractFutureC30516i, c30526i, C30526i.f80267c));
        while (c30526i != null) {
            Thread thread = c30526i.f80268a;
            if (thread != null) {
                c30526i.f80268a = null;
                LockSupport.unpark(thread);
            }
            c30526i = c30526i.f80269b;
        }
        do {
            c30521d = ((AbstractFutureC30516i) abstractFutureC30516i).f80254c;
        } while (!f80251g.mo33412a(abstractFutureC30516i, c30521d, C30521d.f80260b));
        C30521d c30521d2 = null;
        while (c30521d != null) {
            C30521d c30521d3 = c30521d.f80261a;
            c30521d.f80261a = c30521d2;
            c30521d2 = c30521d;
            c30521d = c30521d3;
        }
        if (c30521d2 != null) {
            throw null;
        }
    }

    /* renamed from: a */
    private static Object m33427a(Object obj) throws ExecutionException {
        if (!(obj instanceof C30518b)) {
            if (!(obj instanceof C30519c)) {
                if (obj == f80252h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C30519c) obj).f80259a);
        }
        Throwable th = ((C30518b) obj).f80258a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* renamed from: a */
    protected final String m33430a() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* renamed from: a */
    private void m33429a(C30526i c30526i) {
        c30526i.f80268a = null;
        while (true) {
            C30526i c30526i2 = this.f80255d;
            if (c30526i2 == C30526i.f80267c) {
                return;
            }
            C30526i c30526i3 = null;
            while (c30526i2 != null) {
                C30526i c30526i4 = c30526i2.f80269b;
                if (c30526i2.f80268a != null) {
                    c30526i3 = c30526i2;
                } else if (c30526i3 != null) {
                    c30526i3.f80269b = c30526i4;
                    if (c30526i3.f80268a == null) {
                        break;
                    }
                } else if (!f80251g.mo33411a((AbstractFutureC30516i<?>) this, c30526i2, c30526i4)) {
                    break;
                }
                c30526i2 = c30526i4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f80253b;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC30523f))) {
                return (V) m33427a(obj2);
            }
            C30526i c30526i = this.f80255d;
            if (c30526i != C30526i.f80267c) {
                C30526i c30526i2 = new C30526i();
                do {
                    AbstractC30517a abstractC30517a = f80251g;
                    abstractC30517a.mo33414a(c30526i2, c30526i);
                    if (abstractC30517a.mo33411a((AbstractFutureC30516i<?>) this, c30526i, c30526i2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f80253b;
                            } else {
                                m33429a(c30526i2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC30523f))));
                        return (V) m33427a(obj);
                    }
                    c30526i = this.f80255d;
                } while (c30526i != C30526i.f80267c);
                Object obj3 = this.f80253b;
                Objects.requireNonNull(obj3);
                return (V) m33427a(obj3);
            }
            Object obj32 = this.f80253b;
            Objects.requireNonNull(obj32);
            return (V) m33427a(obj32);
        }
        throw new InterruptedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: a */
    public boolean mo33424a(Throwable th) {
        if (f80251g.mo33410a((AbstractFutureC30516i<?>) this, (Object) null, (Object) new C30519c(th))) {
            m33428a((AbstractFutureC30516i<?>) this);
            return true;
        }
        return false;
    }
}

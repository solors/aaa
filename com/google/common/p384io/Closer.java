package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* renamed from: com.google.common.io.Closer */
/* loaded from: classes4.dex */
public final class Closer implements Closeable {

    /* renamed from: f */
    private static final Suppressor f41280f;
    @VisibleForTesting

    /* renamed from: b */
    final Suppressor f41281b;

    /* renamed from: c */
    private final Deque<Closeable> f41282c = new ArrayDeque(4);

    /* renamed from: d */
    private Throwable f41283d;

    @VisibleForTesting
    /* renamed from: com.google.common.io.Closer$LoggingSuppressor */
    /* loaded from: classes4.dex */
    static final class LoggingSuppressor implements Suppressor {

        /* renamed from: a */
        static final LoggingSuppressor f41284a = new LoggingSuppressor();

        LoggingSuppressor() {
        }

        @Override // com.google.common.p384io.Closer.Suppressor
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = Closeables.f41279a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(closeable);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 42);
            sb2.append("Suppressing exception thrown when closing ");
            sb2.append(valueOf);
            logger.log(level, sb2.toString(), th2);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.common.io.Closer$SuppressingSuppressor */
    /* loaded from: classes4.dex */
    static final class SuppressingSuppressor implements Suppressor {

        /* renamed from: a */
        private final Method f41285a;

        private SuppressingSuppressor(Method method) {
            this.f41285a = method;
        }

        /* renamed from: a */
        static SuppressingSuppressor m68229a() {
            try {
                return new SuppressingSuppressor(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.google.common.p384io.Closer.Suppressor
        public void suppress(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f41285a.invoke(th, th2);
            } catch (Throwable unused) {
                LoggingSuppressor.f41284a.suppress(closeable, th, th2);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.common.io.Closer$Suppressor */
    /* loaded from: classes4.dex */
    interface Suppressor {
        void suppress(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        Suppressor m68229a = SuppressingSuppressor.m68229a();
        if (m68229a == null) {
            m68229a = LoggingSuppressor.f41284a;
        }
        f41280f = m68229a;
    }

    @VisibleForTesting
    Closer(Suppressor suppressor) {
        this.f41281b = (Suppressor) Preconditions.checkNotNull(suppressor);
    }

    public static Closer create() {
        return new Closer(f41280f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th = this.f41283d;
        while (!this.f41282c.isEmpty()) {
            Closeable removeFirst = this.f41282c.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f41281b.suppress(removeFirst, th, th2);
                }
            }
        }
        if (this.f41283d == null && th != null) {
            Throwables.propagateIfPossible(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public <C extends Closeable> C register(@ParametricNullness C c) {
        if (c != null) {
            this.f41282c.addFirst(c);
        }
        return c;
    }

    public RuntimeException rethrow(Throwable th) throws IOException {
        Preconditions.checkNotNull(th);
        this.f41283d = th;
        Throwables.propagateIfPossible(th, IOException.class);
        throw new RuntimeException(th);
    }

    public <X extends Exception> RuntimeException rethrow(Throwable th, Class<X> cls) throws IOException, Exception {
        Preconditions.checkNotNull(th);
        this.f41283d = th;
        Throwables.propagateIfPossible(th, IOException.class);
        Throwables.propagateIfPossible(th, cls);
        throw new RuntimeException(th);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException rethrow(Throwable th, Class<X1> cls, Class<X2> cls2) throws IOException, Exception, Exception {
        Preconditions.checkNotNull(th);
        this.f41283d = th;
        Throwables.propagateIfPossible(th, IOException.class);
        Throwables.propagateIfPossible(th, cls, cls2);
        throw new RuntimeException(th);
    }
}

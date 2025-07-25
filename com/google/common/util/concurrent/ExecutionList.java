package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class ExecutionList {

    /* renamed from: c */
    private static final Logger f41811c = Logger.getLogger(ExecutionList.class.getName());
    @GuardedBy("this")

    /* renamed from: a */
    private RunnableExecutorPair f41812a;
    @GuardedBy("this")

    /* renamed from: b */
    private boolean f41813b;

    /* loaded from: classes4.dex */
    private static final class RunnableExecutorPair {

        /* renamed from: a */
        final Runnable f41814a;

        /* renamed from: b */
        final Executor f41815b;

        /* renamed from: c */
        RunnableExecutorPair f41816c;

        RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f41814a = runnable;
            this.f41815b = executor;
            this.f41816c = runnableExecutorPair;
        }
    }

    /* renamed from: a */
    private static void m67609a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f41811c;
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

    public void add(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            if (!this.f41813b) {
                this.f41812a = new RunnableExecutorPair(runnable, executor, this.f41812a);
            } else {
                m67609a(runnable, executor);
            }
        }
    }

    public void execute() {
        synchronized (this) {
            if (this.f41813b) {
                return;
            }
            this.f41813b = true;
            RunnableExecutorPair runnableExecutorPair = this.f41812a;
            RunnableExecutorPair runnableExecutorPair2 = null;
            this.f41812a = null;
            while (runnableExecutorPair != null) {
                RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.f41816c;
                runnableExecutorPair.f41816c = runnableExecutorPair2;
                runnableExecutorPair2 = runnableExecutorPair;
                runnableExecutorPair = runnableExecutorPair3;
            }
            while (runnableExecutorPair2 != null) {
                m67609a(runnableExecutorPair2.f41814a, runnableExecutorPair2.f41815b);
                runnableExecutorPair2 = runnableExecutorPair2.f41816c;
            }
        }
    }
}

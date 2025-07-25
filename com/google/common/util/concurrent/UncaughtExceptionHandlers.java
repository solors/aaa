package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class UncaughtExceptionHandlers {

    @VisibleForTesting
    /* loaded from: classes4.dex */
    static final class Exiter implements Thread.UncaughtExceptionHandler {

        /* renamed from: b */
        private static final Logger f41985b = Logger.getLogger(Exiter.class.getName());

        /* renamed from: a */
        private final Runtime f41986a;

        Exiter(Runtime runtime) {
            this.f41986a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                f41985b.log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    private UncaughtExceptionHandlers() {
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new Exiter(Runtime.getRuntime());
    }
}

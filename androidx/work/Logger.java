package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static final int MAX_TAG_LENGTH = 23;
    private static final String TAG_PREFIX = "WM-";
    private static final Object sLock = new Object();
    private static volatile Logger sLogger;

    public Logger(int i) {
    }

    @NonNull
    public static Logger get() {
        Logger logger;
        synchronized (sLock) {
            if (sLogger == null) {
                sLogger = new LogcatLogger(3);
            }
            logger = sLogger;
        }
        return logger;
    }

    public static void setLogger(@NonNull Logger logger) {
        synchronized (sLock) {
            sLogger = logger;
        }
    }

    @NonNull
    public static String tagWithPrefix(@NonNull String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(TAG_PREFIX);
        int i = MAX_PREFIXED_TAG_LENGTH;
        if (length >= i) {
            sb2.append(str.substring(0, i));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void debug(@NonNull String str, @NonNull String str2);

    public abstract void debug(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    public abstract void error(@NonNull String str, @NonNull String str2);

    public abstract void error(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    public abstract void info(@NonNull String str, @NonNull String str2);

    public abstract void info(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    public abstract void verbose(@NonNull String str, @NonNull String str2);

    public abstract void verbose(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    public abstract void warning(@NonNull String str, @NonNull String str2);

    public abstract void warning(@NonNull String str, @NonNull String str2, @NonNull Throwable th);

    /* loaded from: classes2.dex */
    public static class LogcatLogger extends Logger {
        private final int mLoggingLevel;

        public LogcatLogger(int i) {
            super(i);
            this.mLoggingLevel = i;
        }

        @Override // androidx.work.Logger
        public void debug(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String str, @NonNull String str2) {
            if (this.mLoggingLevel <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public void debug(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.mLoggingLevel <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public void error(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.mLoggingLevel <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public void info(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.mLoggingLevel <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public void verbose(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.mLoggingLevel <= 2) {
                Log.v(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public void warning(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
            if (this.mLoggingLevel <= 5) {
                Log.w(str, str2, th);
            }
        }
    }
}

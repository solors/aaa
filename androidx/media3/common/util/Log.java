package androidx.media3.common.util;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

@UnstableApi
/* loaded from: classes2.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    @GuardedBy("lock")
    private static int logLevel = 0;
    @GuardedBy("lock")
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();
    @GuardedBy("lock")
    private static Logger logger = Logger.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface LogLevel {
    }

    /* loaded from: classes2.dex */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: d */
            public void mo104562d(String str, String str2, @Nullable Throwable th) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: e */
            public void mo104561e(String str, String str2, @Nullable Throwable th) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: i */
            public void mo104560i(String str, String str2, @Nullable Throwable th) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            /* renamed from: w */
            public void mo104559w(String str, String str2, @Nullable Throwable th) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th));
            }
        };

        /* renamed from: d */
        void mo104562d(String str, String str2, @Nullable Throwable th);

        /* renamed from: e */
        void mo104561e(String str, String str2, @Nullable Throwable th);

        /* renamed from: i */
        void mo104560i(String str, String str2, @Nullable Throwable th);

        /* renamed from: w */
        void mo104559w(String str, String str2, @Nullable Throwable th);
    }

    private Log() {
    }

    public static String appendThrowableString(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    /* renamed from: d */
    public static void m104570d(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.mo104562d(str, str2, null);
            }
        }
    }

    /* renamed from: e */
    public static void m104568e(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.mo104561e(str, str2, null);
            }
        }
    }

    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    @Nullable
    public static String getThrowableString(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (lock) {
            if (isCausedByUnknownHostException(th)) {
                return "UnknownHostException (no network)";
            }
            if (!logStackTraces) {
                return th.getMessage();
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    /* renamed from: i */
    public static void m104566i(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.mo104560i(str, str2, null);
            }
        }
    }

    private static boolean isCausedByUnknownHostException(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    /* renamed from: w */
    public static void m104564w(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.mo104559w(str, str2, null);
            }
        }
    }

    /* renamed from: d */
    public static void m104569d(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.mo104562d(str, str2, th);
            }
        }
    }

    /* renamed from: e */
    public static void m104567e(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.mo104561e(str, str2, th);
            }
        }
    }

    /* renamed from: i */
    public static void m104565i(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.mo104560i(str, str2, th);
            }
        }
    }

    /* renamed from: w */
    public static void m104563w(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.mo104559w(str, str2, th);
            }
        }
    }
}

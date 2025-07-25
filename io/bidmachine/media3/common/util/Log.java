package io.bidmachine.media3.common.util;

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
/* loaded from: classes9.dex */
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
    /* loaded from: classes9.dex */
    public @interface LogLevel {
    }

    /* loaded from: classes9.dex */
    public interface Logger {
        public static final Logger DEFAULT = new C35905a();

        /* renamed from: io.bidmachine.media3.common.util.Log$Logger$a */
        /* loaded from: classes9.dex */
        class C35905a implements Logger {
            C35905a() {
            }

            @Override // io.bidmachine.media3.common.util.Log.Logger
            /* renamed from: d */
            public void mo19943d(String str, String str2) {
                android.util.Log.d(str, str2);
            }

            @Override // io.bidmachine.media3.common.util.Log.Logger
            /* renamed from: e */
            public void mo19942e(String str, String str2) {
                android.util.Log.e(str, str2);
            }

            @Override // io.bidmachine.media3.common.util.Log.Logger
            /* renamed from: i */
            public void mo19941i(String str, String str2) {
                android.util.Log.i(str, str2);
            }

            @Override // io.bidmachine.media3.common.util.Log.Logger
            /* renamed from: w */
            public void mo19940w(String str, String str2) {
                android.util.Log.w(str, str2);
            }
        }

        /* renamed from: d */
        void mo19943d(String str, String str2);

        /* renamed from: e */
        void mo19942e(String str, String str2);

        /* renamed from: i */
        void mo19941i(String str, String str2);

        /* renamed from: w */
        void mo19940w(String str, String str2);
    }

    private Log() {
    }

    private static String appendThrowableString(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    /* renamed from: d */
    public static void m19951d(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.mo19943d(str, str2);
            }
        }
    }

    /* renamed from: e */
    public static void m19949e(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.mo19942e(str, str2);
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
        synchronized (lock) {
            if (th == null) {
                return null;
            }
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
    public static void m19947i(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.mo19941i(str, str2);
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
    public static void m19945w(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.mo19940w(str, str2);
            }
        }
    }

    /* renamed from: d */
    public static void m19950d(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m19951d(str, appendThrowableString(str2, th));
    }

    /* renamed from: e */
    public static void m19948e(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m19949e(str, appendThrowableString(str2, th));
    }

    /* renamed from: i */
    public static void m19946i(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m19947i(str, appendThrowableString(str2, th));
    }

    /* renamed from: w */
    public static void m19944w(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m19945w(str, appendThrowableString(str2, th));
    }
}

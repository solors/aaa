package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    @GuardedBy("lock")

    /* renamed from: b */
    private static int f36113b = 0;
    @GuardedBy("lock")

    /* renamed from: c */
    private static boolean f36114c = true;

    /* renamed from: a */
    private static final Object f36112a = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private static Logger f36115d = Logger.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LogLevel {
    }

    /* loaded from: classes4.dex */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: com.google.android.exoplayer2.util.Log.Logger.1
            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: d */
            public void mo72600d(String str, String str2) {
                android.util.Log.d(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: e */
            public void mo72599e(String str, String str2) {
                android.util.Log.e(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: i */
            public void mo72598i(String str, String str2) {
                android.util.Log.i(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            /* renamed from: w */
            public void mo72597w(String str, String str2) {
                android.util.Log.w(str, str2);
            }
        };

        /* renamed from: d */
        void mo72600d(String str, String str2);

        /* renamed from: e */
        void mo72599e(String str, String str2);

        /* renamed from: i */
        void mo72598i(String str, String str2);

        /* renamed from: w */
        void mo72597w(String str, String str2);
    }

    private Log() {
    }

    /* renamed from: a */
    private static String m72610a(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    /* renamed from: b */
    private static boolean m72609b(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: d */
    public static void m72608d(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (f36112a) {
            if (f36113b == 0) {
                f36115d.mo72600d(str, str2);
            }
        }
    }

    /* renamed from: e */
    public static void m72606e(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (f36112a) {
            if (f36113b <= 3) {
                f36115d.mo72599e(str, str2);
            }
        }
    }

    public static int getLogLevel() {
        int i;
        synchronized (f36112a) {
            i = f36113b;
        }
        return i;
    }

    @Nullable
    public static String getThrowableString(@Nullable Throwable th) {
        synchronized (f36112a) {
            if (th == null) {
                return null;
            }
            if (m72609b(th)) {
                return "UnknownHostException (no network)";
            }
            if (!f36114c) {
                return th.getMessage();
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    /* renamed from: i */
    public static void m72604i(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (f36112a) {
            if (f36113b <= 1) {
                f36115d.mo72598i(str, str2);
            }
        }
    }

    public static void setLogLevel(int i) {
        synchronized (f36112a) {
            f36113b = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (f36112a) {
            f36114c = z;
        }
    }

    public static void setLogger(Logger logger) {
        synchronized (f36112a) {
            f36115d = logger;
        }
    }

    /* renamed from: w */
    public static void m72602w(@androidx.annotation.Size(max = 23) String str, String str2) {
        synchronized (f36112a) {
            if (f36113b <= 2) {
                f36115d.mo72597w(str, str2);
            }
        }
    }

    /* renamed from: d */
    public static void m72607d(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m72608d(str, m72610a(str2, th));
    }

    /* renamed from: e */
    public static void m72605e(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m72606e(str, m72610a(str2, th));
    }

    /* renamed from: i */
    public static void m72603i(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m72604i(str, m72610a(str2, th));
    }

    /* renamed from: w */
    public static void m72601w(@androidx.annotation.Size(max = 23) String str, String str2, @Nullable Throwable th) {
        m72602w(str, m72610a(str2, th));
    }
}

package com.chartboost.sdk.impl;

import android.util.Log;
import com.chartboost.sdk.LoggingLevel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37686h;
import td.C44401b;
import td.EnumEntries;

/* renamed from: com.chartboost.sdk.impl.c7 */
/* loaded from: classes3.dex */
public final class C9763c7 {

    /* renamed from: a */
    public static final C9763c7 f21794a = new C9763c7();

    /* renamed from: b */
    public static LoggingLevel f21795b = LoggingLevel.INTEGRATION;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.c7$a */
    /* loaded from: classes3.dex */
    public static final class EnumC9764a {

        /* renamed from: b */
        public static final EnumC9764a f21796b = new EnumC9764a("DEBUG", 0);

        /* renamed from: c */
        public static final EnumC9764a f21797c = new EnumC9764a("ERROR", 1);

        /* renamed from: d */
        public static final EnumC9764a f21798d = new EnumC9764a("WARNING", 2);

        /* renamed from: e */
        public static final EnumC9764a f21799e = new EnumC9764a("INFO", 3);

        /* renamed from: f */
        public static final EnumC9764a f21800f = new EnumC9764a("VERBOSE", 4);

        /* renamed from: g */
        public static final EnumC9764a f21801g = new EnumC9764a("WTF", 5);

        /* renamed from: h */
        public static final /* synthetic */ EnumC9764a[] f21802h;

        /* renamed from: i */
        public static final /* synthetic */ EnumEntries f21803i;

        static {
            EnumC9764a[] m81913a = m81913a();
            f21802h = m81913a;
            f21803i = C44401b.m3113a(m81913a);
        }

        public EnumC9764a(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC9764a[] m81913a() {
            return new EnumC9764a[]{f21796b, f21797c, f21798d, f21799e, f21800f, f21801g};
        }

        public static EnumC9764a valueOf(String str) {
            return (EnumC9764a) Enum.valueOf(EnumC9764a.class, str);
        }

        public static EnumC9764a[] values() {
            return (EnumC9764a[]) f21802h.clone();
        }
    }

    /* renamed from: com.chartboost.sdk.impl.c7$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9765b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21804a;

        static {
            int[] iArr = new int[EnumC9764a.values().length];
            try {
                iArr[EnumC9764a.f21796b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9764a.f21797c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9764a.f21798d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9764a.f21799e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC9764a.f21800f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC9764a.f21801g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f21804a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m81923a(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f21794a.m81925a(EnumC9764a.f21796b, msg, th);
    }

    /* renamed from: b */
    public static final void m81920b(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f21794a.m81925a(EnumC9764a.f21797c, msg, th);
    }

    /* renamed from: c */
    public static final void m81918c(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f21794a.m81925a(EnumC9764a.f21799e, msg, th);
    }

    /* renamed from: d */
    public static final void m81916d(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f21794a.m81925a(EnumC9764a.f21800f, msg, th);
    }

    /* renamed from: e */
    public static final void m81914e(String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f21794a.m81925a(EnumC9764a.f21798d, msg, th);
    }

    /* renamed from: a */
    public static /* synthetic */ void m81922a(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m81923a(str, th);
    }

    /* renamed from: b */
    public static /* synthetic */ void m81919b(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m81920b(str, th);
    }

    /* renamed from: c */
    public static /* synthetic */ void m81917c(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m81918c(str, th);
    }

    /* renamed from: d */
    public static /* synthetic */ void m81915d(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m81914e(str, th);
    }

    /* renamed from: a */
    public final String m81926a(int i) {
        StackTraceElement m81921b = m81921b(i);
        if (m81921b != null) {
            String className = m81921b.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            String str = C37686h.m16707Q0(className, '.', null, 2, null) + "." + m81921b.getMethodName() + "():";
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: b */
    public final StackTraceElement m81921b(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i) {
            return stackTrace[i];
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ String m81924a(C9763c7 c9763c7, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return c9763c7.m81926a(i);
    }

    /* renamed from: a */
    public final void m81925a(EnumC9764a enumC9764a, String str, Throwable th) {
        if (f21795b == LoggingLevel.ALL || f21795b == LoggingLevel.INTEGRATION) {
            String str2 = m81924a(this, 0, 1, (Object) null) + " " + str;
            switch (C9765b.f21804a[enumC9764a.ordinal()]) {
                case 1:
                    Log.d("[ChartboostMonetization]", str2, th);
                    return;
                case 2:
                    Log.e("[ChartboostMonetization]", str2, th);
                    return;
                case 3:
                    Log.w("[ChartboostMonetization]", str2, th);
                    return;
                case 4:
                    Log.i("[ChartboostMonetization]", str2, th);
                    return;
                case 5:
                    Log.v("[ChartboostMonetization]", str2, th);
                    return;
                case 6:
                    Log.wtf("[ChartboostMonetization]", str2, th);
                    return;
                default:
                    return;
            }
        }
    }
}

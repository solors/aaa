package com.moloco.sdk.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p867rd.Thread;

@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes7.dex */
public final class MolocoLogger {
    @NotNull
    private static final String MOLOCO_TAG = "Moloco";
    @NotNull
    public static final MolocoLogger INSTANCE = new MolocoLogger();
    @NotNull
    private static InterfaceC23931c configuration = new C23932d(new C23928b());
    @NotNull
    private static final LinkedHashSet<LoggerListener> listeners = new LinkedHashSet<>();
    public static final int $stable = 8;

    @Metadata
    /* loaded from: classes7.dex */
    public interface LoggerListener {
        void onLog(@NotNull String str, @NotNull String str2);
    }

    /* renamed from: com.moloco.sdk.internal.MolocoLogger$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC23927a {
        /* renamed from: a */
        boolean mo47329a();
    }

    /* renamed from: com.moloco.sdk.internal.MolocoLogger$b */
    /* loaded from: classes7.dex */
    public static final class C23928b implements InterfaceC23927a {
        @NotNull

        /* renamed from: b */
        public static final C23930b f61950b = new C23930b(null);

        /* renamed from: a */
        public boolean f61951a;

        /* renamed from: com.moloco.sdk.internal.MolocoLogger$b$a */
        /* loaded from: classes7.dex */
        public static final class C23929a extends Lambda implements Functions<Unit> {
            public C23929a() {
                super(0);
            }

            /* renamed from: a */
            public final void m47324a() {
                C23928b c23928b = C23928b.this;
                c23928b.m47327b(c23928b.m47325d());
            }

            @Override // kotlin.jvm.functions.Functions
            public /* bridge */ /* synthetic */ Unit invoke() {
                m47324a();
                return Unit.f99208a;
            }
        }

        /* renamed from: com.moloco.sdk.internal.MolocoLogger$b$b */
        /* loaded from: classes7.dex */
        public static final class C23930b {
            public /* synthetic */ C23930b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C23930b() {
            }
        }

        public C23928b() {
            Thread.m12522b(false, false, null, null, 0, new C23929a(), 31, null);
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.InterfaceC23927a
        /* renamed from: a */
        public boolean mo47329a() {
            return this.f61951a;
        }

        /* renamed from: b */
        public void m47327b(boolean z) {
            this.f61951a = z;
        }

        /* renamed from: d */
        public final boolean m47325d() {
            return Boolean.parseBoolean(m47328a("debug.moloco.internal_logging"));
        }

        /* renamed from: a */
        public final String m47328a(String str) {
            try {
                Object invoke = Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class).invoke(null, str);
                Intrinsics.m17073h(invoke, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) invoke;
                try {
                    if (TextUtils.isEmpty(str2)) {
                        return null;
                    }
                } catch (Exception unused) {
                }
                return str2;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: com.moloco.sdk.internal.MolocoLogger$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC23931c {
        /* renamed from: a */
        void mo47322a(boolean z);

        /* renamed from: a */
        boolean mo47323a();

        /* renamed from: b */
        boolean mo47321b();

        /* renamed from: c */
        boolean mo47320c();
    }

    /* renamed from: com.moloco.sdk.internal.MolocoLogger$d */
    /* loaded from: classes7.dex */
    public static final class C23932d implements InterfaceC23931c {
        @NotNull

        /* renamed from: a */
        public final InterfaceC23927a f61953a;

        /* renamed from: b */
        public boolean f61954b;

        public C23932d(@NotNull InterfaceC23927a adb) {
            Intrinsics.checkNotNullParameter(adb, "adb");
            this.f61953a = adb;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.InterfaceC23931c
        /* renamed from: a */
        public boolean mo47323a() {
            return this.f61953a.mo47329a();
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.InterfaceC23931c
        /* renamed from: b */
        public boolean mo47321b() {
            return this.f61954b;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.InterfaceC23931c
        /* renamed from: c */
        public boolean mo47320c() {
            return false;
        }

        @Override // com.moloco.sdk.internal.MolocoLogger.InterfaceC23931c
        /* renamed from: a */
        public void mo47322a(boolean z) {
            this.f61954b = z;
        }
    }

    private MolocoLogger() {
    }

    public static final void addListener(@NotNull LoggerListener loggerListener) {
        Intrinsics.checkNotNullParameter(loggerListener, "loggerListener");
        listeners.add(loggerListener);
    }

    public static /* synthetic */ void debug$default(MolocoLogger molocoLogger, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        molocoLogger.debug(str, str2, z);
    }

    public static /* synthetic */ void debugBuildLog$default(MolocoLogger molocoLogger, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        molocoLogger.debugBuildLog(str, str2, z);
    }

    public static /* synthetic */ void error$default(MolocoLogger molocoLogger, String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        molocoLogger.error(str, str2, th, z);
    }

    private final StackTraceElement findMostRelevantStackTrace(StackTraceElement[] stackTraceElementArr) {
        Object m17331U;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!Intrinsics.m17075f(stackTraceElement.getClassName(), INSTANCE.getClass().getCanonicalName())) {
                return stackTraceElement;
            }
        }
        m17331U = _Arrays.m17331U(stackTraceElementArr);
        return (StackTraceElement) m17331U;
    }

    private final void fireListeners(String str, String str2) {
        for (LoggerListener loggerListener : listeners) {
            loggerListener.onLog(INSTANCE.prefixWithMolocoName(str), str2);
        }
    }

    public static final boolean getLogEnabled() {
        InterfaceC23931c interfaceC23931c = configuration;
        if (!interfaceC23931c.mo47320c() && !interfaceC23931c.mo47323a() && !interfaceC23931c.mo47321b()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void info$default(MolocoLogger molocoLogger, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        molocoLogger.info(str, str2, z);
    }

    private final String prefixWithMethodName(String str) {
        try {
            return '[' + getCallingMethodName() + "] " + str;
        } catch (Exception unused) {
            return str;
        }
    }

    private final String prefixWithMolocoName(String str) {
        boolean m16624M;
        m16624M = StringsJVM.m16624M(str, MOLOCO_TAG, false, 2, null);
        if (!m16624M) {
            return MOLOCO_TAG + str;
        }
        return str;
    }

    public static final void removeListener(@NotNull LoggerListener loggerListener) {
        Intrinsics.checkNotNullParameter(loggerListener, "loggerListener");
        listeners.remove(loggerListener);
    }

    public static final void setLogEnabled(boolean z) {
        configuration.mo47322a(z);
    }

    public static /* synthetic */ void tlog$default(MolocoLogger molocoLogger, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        molocoLogger.tlog(str, th);
    }

    public static /* synthetic */ void warn$default(MolocoLogger molocoLogger, String str, String str2, Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = MOLOCO_TAG;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        molocoLogger.warn(str, str2, th, z);
    }

    public final void adapter(@NotNull String tag, boolean z, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!getLogEnabled() && !z) {
            return;
        }
        Log.i(prefixWithMolocoName(tag), prefixWithMethodName(msg));
    }

    public final void debug(@NotNull String tag, @NotNull String msg, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!getLogEnabled() && !z) {
            return;
        }
        String prefixWithMolocoName = prefixWithMolocoName(tag);
        String prefixWithMethodName = prefixWithMethodName(msg);
        Log.d(prefixWithMolocoName, prefixWithMethodName);
        fireListeners(prefixWithMolocoName, prefixWithMethodName);
    }

    public final void debugBuildLog(@NotNull String tag, @NotNull String msg, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public final void error(@NotNull String tag, @NotNull String msg, @Nullable Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!getLogEnabled() && !z) {
            return;
        }
        String prefixWithMolocoName = prefixWithMolocoName(tag);
        String prefixWithMethodName = prefixWithMethodName(msg);
        Log.e(prefixWithMolocoName, prefixWithMethodName, th);
        fireListeners(prefixWithMolocoName, prefixWithMethodName);
    }

    @NotNull
    public final String getCallingMethodName() {
        String m16546w0;
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        StackTraceElement findMostRelevantStackTrace = findMostRelevantStackTrace(stackTrace);
        String className = findMostRelevantStackTrace.getClassName();
        findMostRelevantStackTrace.getMethodName();
        Class<?> cls = Class.forName(className);
        cls.isAnonymousClass();
        cls.getDeclaredMethods();
        String methodName = findMostRelevantStackTrace.getMethodName();
        if (Intrinsics.m17075f(methodName, "invokeSuspend")) {
            String className2 = findMostRelevantStackTrace.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "stackTraceElement.className");
            m16546w0 = C37690r.m16546w0(className2, "$1");
            methodName = C37690r.m16591R0(m16546w0, "$", null, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(methodName, "stackTraceElement.method…t\n            }\n        }");
        return methodName;
    }

    public final void info(@NotNull String tag, @NotNull String msg, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!getLogEnabled() && !z) {
            return;
        }
        String prefixWithMolocoName = prefixWithMolocoName(tag);
        String prefixWithMethodName = prefixWithMethodName(msg);
        Log.i(prefixWithMolocoName, prefixWithMethodName);
        fireListeners(prefixWithMolocoName, prefixWithMethodName);
    }

    @VisibleForTesting(otherwise = 5)
    public final void setConfiguration$moloco_sdk_release(@NotNull InterfaceC23931c configuration2) {
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        configuration = configuration2;
    }

    public final void tlog(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i("==tlog==", prefixWithMethodName(msg), th);
    }

    public final void warn(@NotNull String tag, @NotNull String msg, @Nullable Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!getLogEnabled() && !z) {
            return;
        }
        String prefixWithMolocoName = prefixWithMolocoName(tag);
        String prefixWithMethodName = prefixWithMethodName(msg);
        Log.w(prefixWithMolocoName, prefixWithMethodName, th);
        fireListeners(prefixWithMolocoName, prefixWithMethodName);
    }

    public static /* synthetic */ void getLogEnabled$annotations() {
    }
}

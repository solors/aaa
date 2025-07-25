package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: Logger.kt */
@Metadata
/* loaded from: classes4.dex */
public abstract class Logger {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: d */
    private static final ConcurrentHashMap<String, Logger> f43148d = new ConcurrentHashMap<>();
    @NotNull

    /* renamed from: a */
    private final String f43149a;

    /* renamed from: b */
    private boolean f43150b;
    @NotNull

    /* renamed from: c */
    private Level f43151c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Logger.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class AndroidLogger extends Logger {

        /* compiled from: Logger.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(@NotNull String tag, boolean z, @NotNull Level minLevel) {
            super(tag, z, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
            boolean z;
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (args.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            }
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                String tag = getTag();
                                if (th != null) {
                                    return Log.e(tag, format, th);
                                }
                                return Log.e(tag, format);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        String tag2 = getTag();
                        if (th != null) {
                            return Log.w(tag2, format, th);
                        }
                        return Log.w(tag2, format);
                    }
                    String tag3 = getTag();
                    if (th != null) {
                        return Log.i(tag3, format, th);
                    }
                    return Log.i(tag3, format);
                }
                String tag4 = getTag();
                if (th != null) {
                    return Log.d(tag4, format, th);
                }
                return Log.d(tag4, format);
            }
            String tag5 = getTag();
            if (th != null) {
                return Log.v(tag5, format, th);
            }
            return Log.v(tag5, format);
        }
    }

    /* compiled from: Logger.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        @NotNull
        public final Logger getLogger(@NotNull String tag, boolean z, @NotNull Level minLevel) {
            Object putIfAbsent;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.f43148d;
            Object obj = concurrentHashMap.get(tag);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (obj = new AndroidLogger(tag, z, minLevel)))) != null) {
                obj = putIfAbsent;
            }
            Intrinsics.checkNotNullExpressionValue(obj, "loggers.getOrPut(tag) { …tag, enabled, minLevel) }");
            return (Logger) obj;
        }

        @VisibleForTesting
        @NotNull
        public final FakeLogger setupFakeLogger(@NotNull String tag, boolean z, @NotNull Level minLevel) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, z, minLevel);
            Logger.f43148d.put(tag, fakeLogger);
            return fakeLogger;
        }
    }

    /* compiled from: Logger.kt */
    @Metadata
    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class FakeLogger extends Logger {
        @NotNull

        /* renamed from: e */
        private final List<String> f43152e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(@NotNull String tag, boolean z, @NotNull Level minLevel) {
            super(tag, z, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            this.f43152e = new ArrayList();
        }

        /* renamed from: c */
        private final String m66717c(Level level, String str, Object[] objArr, Throwable th) {
            boolean z;
            if (objArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            }
            if (th != null) {
                String str2 = level + ' ' + str + ' ' + Log.getStackTraceString(th);
                if (str2 != null) {
                    return str2;
                }
            }
            return level + ' ' + str;
        }

        @VisibleForTesting
        public final void clearLogMessages() {
            this.f43152e.clear();
        }

        @VisibleForTesting
        public final boolean hasLogMessage(@NotNull String message) {
            boolean m16592R;
            Intrinsics.checkNotNullParameter(message, "message");
            List<String> list = this.f43152e;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (String str : list) {
                m16592R = C37690r.m16592R(str, message, false, 2, null);
                if (m16592R) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @VisibleForTesting
        public final boolean hasLogMessageThat(@NotNull Function1<? super String, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            List<String> list = this.f43152e;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (Object obj : list) {
                if (predicate.invoke(obj).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            String m66717c = m66717c(level, format, args, th);
            System.out.println((Object) ("Log: " + m66717c));
            this.f43152e.add(m66717c);
            return m66717c.length();
        }
    }

    /* compiled from: Logger.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);
        

        /* renamed from: b */
        private final int f43154b;

        Level(int i) {
            this.f43154b = i;
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.f43154b;
        }
    }

    public /* synthetic */ Logger(String str, boolean z, Level level, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, level);
    }

    /* renamed from: a */
    private final int m66719a(Level level, String str, Object[] objArr, Throwable th) {
        if (this.f43150b && (this.f43151c.getPriority$com_google_firebase_firebase_common() <= level.getPriority$com_google_firebase_firebase_common() || Log.isLoggable(this.f43149a, level.getPriority$com_google_firebase_firebase_common()))) {
            return log(level, str, objArr, th);
        }
        return 0;
    }

    /* renamed from: b */
    static /* synthetic */ int m66718b(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                objArr = new Object[0];
            }
            return logger.m66719a(level, str, objArr, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                th = null;
            }
            return logger.debug(str, objArr, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                th = null;
            }
            return logger.error(str, objArr, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
    }

    @NotNull
    public static final Logger getLogger(@NotNull String str, boolean z, @NotNull Level level) {
        return Companion.getLogger(str, z, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                th = null;
            }
            return logger.info(str, objArr, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
    }

    @VisibleForTesting
    @NotNull
    public static final FakeLogger setupFakeLogger(@NotNull String str, boolean z, @NotNull Level level) {
        return Companion.setupFakeLogger(str, z, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                th = null;
            }
            return logger.verbose(str, objArr, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                th = null;
            }
            return logger.warn(str, objArr, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
    }

    public final int debug(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    public final int error(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.f43150b;
    }

    @NotNull
    public final Level getMinLevel() {
        return this.f43151c;
    }

    @NotNull
    public final String getTag() {
        return this.f43149a;
    }

    public final int info(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public abstract int log(@NotNull Level level, @NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th);

    public final void setEnabled(boolean z) {
        this.f43150b = z;
    }

    public final void setMinLevel(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.f43151c = level;
    }

    public final int verbose(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    public final int warn(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    private Logger(String str, boolean z, Level level) {
        this.f43149a = str;
        this.f43150b = z;
        this.f43151c = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            return logger.debug(str, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            return logger.error(str, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            return logger.info(str, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            return logger.verbose(str, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            return logger.warn(str, th);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
    }

    public final int debug(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    public final int error(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    public final int info(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    public final int verbose(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    public final int warn(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    public final int debug(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return m66719a(Level.DEBUG, format, args, th);
    }

    public final int error(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return m66719a(Level.ERROR, format, args, th);
    }

    public final int info(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return m66719a(Level.INFO, format, args, th);
    }

    public final int verbose(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return m66719a(Level.VERBOSE, format, args, th);
    }

    public final int warn(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return m66719a(Level.WARN, format, args, th);
    }

    public final int debug(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return m66718b(this, Level.DEBUG, msg, null, th, 4, null);
    }

    public final int error(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return m66718b(this, Level.ERROR, msg, null, th, 4, null);
    }

    public final int info(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return m66718b(this, Level.INFO, msg, null, th, 4, null);
    }

    public final int verbose(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return m66718b(this, Level.VERBOSE, msg, null, th, 4, null);
    }

    public final int warn(@NotNull String msg, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return m66718b(this, Level.WARN, msg, null, th, 4, null);
    }
}

package com.vungle.ads.internal.util;

import android.util.Log;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: Logger.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.util.o */
/* loaded from: classes7.dex */
public final class C29518o {
    @NotNull
    public static final C29519a Companion = new C29519a(null);
    private static boolean enabled;

    /* renamed from: d */
    public static final int m37475d(@NotNull String str, @NotNull String str2) {
        return Companion.m37468d(str, str2);
    }

    /* renamed from: e */
    public static final int m37474e(@NotNull String str, @NotNull String str2) {
        return Companion.m37467e(str, str2);
    }

    /* renamed from: i */
    public static final int m37472i(@NotNull String str, @NotNull String str2) {
        return Companion.m37465i(str, str2);
    }

    /* renamed from: w */
    public static final int m37470w(@NotNull String str, @NotNull String str2) {
        return Companion.m37463w(str, str2);
    }

    /* compiled from: Logger.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.o$a */
    /* loaded from: classes7.dex */
    public static final class C29519a {
        private C29519a() {
        }

        public /* synthetic */ C29519a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final int m37468d(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (!C29518o.enabled) {
                return -1;
            }
            return Log.d(tag, eraseSensitiveData(message));
        }

        /* renamed from: e */
        public final int m37467e(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (C29518o.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final void enable(boolean z) {
            C29518o.enabled = z;
        }

        @NotNull
        public final String eraseSensitiveData(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pattern compile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            Intrinsics.checkNotNullExpressionValue(compile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new Regex(compile).replace(str, "xxx.xxx.xxx.xxx");
        }

        /* renamed from: i */
        public final int m37465i(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (C29518o.enabled) {
                return Log.i(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        /* renamed from: w */
        public final int m37463w(@NotNull String tag, @NotNull String message) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            if (C29518o.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        /* renamed from: e */
        public final int m37466e(@NotNull String tag, @NotNull String message, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (C29518o.enabled) {
                return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
            }
            return -1;
        }

        /* renamed from: i */
        public final int m37464i(@NotNull String tag, @NotNull String message, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (C29518o.enabled) {
                return Log.i(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
            }
            return -1;
        }

        /* renamed from: w */
        public final int m37462w(@NotNull String tag, @NotNull String message, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (C29518o.enabled) {
                return Log.w(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
            }
            return -1;
        }
    }

    /* renamed from: e */
    public static final int m37473e(@NotNull String str, @NotNull String str2, @NotNull Throwable th) {
        return Companion.m37466e(str, str2, th);
    }

    /* renamed from: i */
    public static final int m37471i(@NotNull String str, @NotNull String str2, @NotNull Throwable th) {
        return Companion.m37464i(str, str2, th);
    }

    /* renamed from: w */
    public static final int m37469w(@NotNull String str, @NotNull String str2, @NotNull Throwable th) {
        return Companion.m37462w(str, str2, th);
    }
}

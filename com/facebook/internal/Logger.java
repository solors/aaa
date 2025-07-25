package com.facebook.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: Logger.kt */
@Metadata
/* loaded from: classes4.dex */
public final class Logger {
    @NotNull
    public static final String LOG_TAG_BASE = "FacebookSDK.";
    @NotNull
    private final LoggingBehavior behavior;
    @NotNull
    private StringBuilder contents;
    private int priority;
    @NotNull
    private final String tag;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final HashMap<String, String> stringsToReplace = new HashMap<>();

    /* compiled from: Logger.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String replaceStrings(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : Logger.stringsToReplace.entrySet()) {
                str2 = StringsJVM.m16628I(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return str2;
        }

        public final void log(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            log(behavior, 3, tag, string);
        }

        public final synchronized void registerAccessToken(@NotNull String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void registerStringToReplace(@NotNull String original, @NotNull String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            Logger.stringsToReplace.put(original, replace);
        }

        public final void log(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                log(behavior, 3, tag, format2);
            }
        }

        public final void log(@NotNull LoggingBehavior behavior, int i, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                log(behavior, i, tag, format2);
            }
        }

        public final void log(@NotNull LoggingBehavior behavior, int i, @NotNull String tag, @NotNull String string) {
            boolean m16624M;
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                String replaceStrings = replaceStrings(string);
                m16624M = StringsJVM.m16624M(tag, Logger.LOG_TAG_BASE, false, 2, null);
                if (!m16624M) {
                    tag = Intrinsics.m17064q(Logger.LOG_TAG_BASE, tag);
                }
                Log.println(i, tag, replaceStrings);
                if (behavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }
    }

    public Logger(@NotNull LoggingBehavior behavior, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.priority = 3;
        this.behavior = behavior;
        this.tag = Intrinsics.m17064q(LOG_TAG_BASE, Validate.notNullOrEmpty(tag, "tag"));
        this.contents = new StringBuilder();
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, int i, @NotNull String str, @NotNull String str2) {
        Companion.log(loggingBehavior, i, str, str2);
    }

    public static final synchronized void registerAccessToken(@NotNull String str) {
        synchronized (Logger.class) {
            Companion.registerAccessToken(str);
        }
    }

    public static final synchronized void registerStringToReplace(@NotNull String str, @NotNull String str2) {
        synchronized (Logger.class) {
            Companion.registerStringToReplace(str, str2);
        }
    }

    private final boolean shouldLog() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    public final void append(@NotNull StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        if (shouldLog()) {
            this.contents.append((CharSequence) stringBuilder);
        }
    }

    public final void appendKeyValue(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        append("  %s:\t%s\n", key, value);
    }

    @NotNull
    public final String getContents() {
        Companion companion = Companion;
        String sb2 = this.contents.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "contents.toString()");
        return companion.replaceStrings(sb2);
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void logString(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Companion.log(this.behavior, this.priority, this.tag, string);
    }

    public final void setPriority(int i) {
        Validate validate = Validate.INSTANCE;
        Validate.oneOf(Integer.valueOf(i), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i);
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, int i, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        Companion.log(loggingBehavior, i, str, str2, objArr);
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2) {
        Companion.log(loggingBehavior, str, str2);
    }

    public final void append(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (shouldLog()) {
            this.contents.append(string);
        }
    }

    public static final void log(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        Companion.log(loggingBehavior, str, str2, objArr);
    }

    public final void append(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (shouldLog()) {
            StringBuilder sb2 = this.contents;
            C37612s0 c37612s0 = C37612s0.f99333a;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            sb2.append(format2);
        }
    }

    public final void log() {
        String sb2 = this.contents.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "contents.toString()");
        logString(sb2);
        this.contents = new StringBuilder();
    }
}

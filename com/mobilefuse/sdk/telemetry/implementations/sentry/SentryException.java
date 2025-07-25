package com.mobilefuse.sdk.telemetry.implementations.sentry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SentryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SentryException {
    @NotNull
    private final String module;
    @NotNull
    private final SentryStackTrace stacktrace;
    @NotNull
    private final String type;
    @NotNull
    private final String value;

    public SentryException(@NotNull String type, @NotNull String value, @NotNull String module, @NotNull SentryStackTrace stacktrace) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        this.type = type;
        this.value = value;
        this.module = module;
        this.stacktrace = stacktrace;
    }

    public static /* synthetic */ SentryException copy$default(SentryException sentryException, String str, String str2, String str3, SentryStackTrace sentryStackTrace, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sentryException.type;
        }
        if ((i & 2) != 0) {
            str2 = sentryException.value;
        }
        if ((i & 4) != 0) {
            str3 = sentryException.module;
        }
        if ((i & 8) != 0) {
            sentryStackTrace = sentryException.stacktrace;
        }
        return sentryException.copy(str, str2, str3, sentryStackTrace);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.value;
    }

    @NotNull
    public final String component3() {
        return this.module;
    }

    @NotNull
    public final SentryStackTrace component4() {
        return this.stacktrace;
    }

    @NotNull
    public final SentryException copy(@NotNull String type, @NotNull String value, @NotNull String module, @NotNull SentryStackTrace stacktrace) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(stacktrace, "stacktrace");
        return new SentryException(type, value, module, stacktrace);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof SentryException) {
                SentryException sentryException = (SentryException) obj;
                if (!Intrinsics.m17075f(this.type, sentryException.type) || !Intrinsics.m17075f(this.value, sentryException.value) || !Intrinsics.m17075f(this.module, sentryException.module) || !Intrinsics.m17075f(this.stacktrace, sentryException.stacktrace)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    @NotNull
    public final SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.type;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.module;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        SentryStackTrace sentryStackTrace = this.stacktrace;
        if (sentryStackTrace != null) {
            i4 = sentryStackTrace.hashCode();
        }
        return i7 + i4;
    }

    @NotNull
    public String toString() {
        return "SentryException(type=" + this.type + ", value=" + this.value + ", module=" + this.module + ", stacktrace=" + this.stacktrace + ")";
    }
}

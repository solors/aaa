package com.mobilefuse.sdk.telemetry.implementations.sentry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SentryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SentryStackFrame {
    @NotNull
    private final String filename;
    @NotNull
    private final String function;
    private final int lineNumber;
    @NotNull
    private final String module;

    public SentryStackFrame(@NotNull String function, @NotNull String filename, int i, @NotNull String module) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(module, "module");
        this.function = function;
        this.filename = filename;
        this.lineNumber = i;
        this.module = module;
    }

    public static /* synthetic */ SentryStackFrame copy$default(SentryStackFrame sentryStackFrame, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sentryStackFrame.function;
        }
        if ((i2 & 2) != 0) {
            str2 = sentryStackFrame.filename;
        }
        if ((i2 & 4) != 0) {
            i = sentryStackFrame.lineNumber;
        }
        if ((i2 & 8) != 0) {
            str3 = sentryStackFrame.module;
        }
        return sentryStackFrame.copy(str, str2, i, str3);
    }

    @NotNull
    public final String component1() {
        return this.function;
    }

    @NotNull
    public final String component2() {
        return this.filename;
    }

    public final int component3() {
        return this.lineNumber;
    }

    @NotNull
    public final String component4() {
        return this.module;
    }

    @NotNull
    public final SentryStackFrame copy(@NotNull String function, @NotNull String filename, int i, @NotNull String module) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(module, "module");
        return new SentryStackFrame(function, filename, i, module);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof SentryStackFrame) {
                SentryStackFrame sentryStackFrame = (SentryStackFrame) obj;
                if (!Intrinsics.m17075f(this.function, sentryStackFrame.function) || !Intrinsics.m17075f(this.filename, sentryStackFrame.filename) || this.lineNumber != sentryStackFrame.lineNumber || !Intrinsics.m17075f(this.module, sentryStackFrame.module)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final String getFunction() {
        return this.function;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.function;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.filename;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((i4 + i2) * 31) + Integer.hashCode(this.lineNumber)) * 31;
        String str3 = this.module;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode + i3;
    }

    @NotNull
    public String toString() {
        return "SentryStackFrame(function=" + this.function + ", filename=" + this.filename + ", lineNumber=" + this.lineNumber + ", module=" + this.module + ")";
    }
}

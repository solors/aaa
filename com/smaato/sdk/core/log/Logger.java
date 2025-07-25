package com.smaato.sdk.core.log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface Logger {
    void debug(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr);

    void debug(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr);

    void error(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr);

    void error(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr);

    void info(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr);

    void info(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr);

    void log(@NonNull LogLevel logLevel, @NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr);

    void log(@NonNull LogLevel logLevel, @NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr);

    void setExplicitOneShotTag(@NonNull String str);

    void warning(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr);

    void warning(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr);
}

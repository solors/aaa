package com.smaato.sdk.core.log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class EmptyLogger implements Logger {
    @Override // com.smaato.sdk.core.log.Logger
    public void debug(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void error(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void info(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void log(@NonNull LogLevel logLevel, @NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void warning(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void debug(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void error(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void info(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void log(@NonNull LogLevel logLevel, @NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void warning(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void setExplicitOneShotTag(@NonNull String str) {
    }
}

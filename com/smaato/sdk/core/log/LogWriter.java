package com.smaato.sdk.core.log;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.core.log.b */
/* loaded from: classes7.dex */
abstract class LogWriter {

    /* renamed from: a */
    private final LogLevel f71646a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogWriter(@NonNull LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        this.f71646a = logLevel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final LogLevel m39497a() {
        return this.f71646a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo39496b(@NonNull LogLevel logLevel);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo39495c(@NonNull LogLevel logLevel, @NonNull String str, @NonNull String str2);
}

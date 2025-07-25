package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface ICrashTransformer {
    @Nullable
    Throwable process(@NonNull Throwable th);
}

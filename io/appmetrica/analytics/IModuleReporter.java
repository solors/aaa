package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface IModuleReporter {
    void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z);

    void reportEvent(@NonNull ModuleEvent moduleEvent);

    void setSessionExtra(@NonNull String str, @Nullable byte[] bArr);
}

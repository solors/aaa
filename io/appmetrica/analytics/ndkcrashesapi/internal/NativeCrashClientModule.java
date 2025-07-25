package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public abstract class NativeCrashClientModule {
    public abstract void initHandling(@NotNull Context context, @NotNull NativeCrashClientConfig nativeCrashClientConfig);

    public abstract void updateAppMetricaMetadata(@NotNull String str);
}

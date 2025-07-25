package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class NativeCrashClientModuleDummy extends NativeCrashClientModule {
    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule
    public void updateAppMetricaMetadata(@NotNull String str) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule
    public void initHandling(@NotNull Context context, @NotNull NativeCrashClientConfig nativeCrashClientConfig) {
    }
}

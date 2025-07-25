package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class NativeCrashServiceModuleDummy extends NativeCrashServiceModule {
    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    @NotNull
    public List<NativeCrash> getAllCrashes() {
        List<NativeCrash> m17166m;
        m17166m = C37563v.m17166m();
        return m17166m;
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void deleteCompletedCrashes() {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void markCrashCompleted(@NotNull String str) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void setDefaultCrashHandler(@Nullable NativeCrashHandler nativeCrashHandler) {
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule
    public void init(@NotNull Context context, @NotNull NativeCrashServiceConfig nativeCrashServiceConfig) {
    }
}

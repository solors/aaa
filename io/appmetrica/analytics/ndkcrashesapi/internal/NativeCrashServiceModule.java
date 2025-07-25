package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public abstract class NativeCrashServiceModule {
    public abstract void deleteCompletedCrashes();

    @NotNull
    public abstract List<NativeCrash> getAllCrashes();

    public abstract void init(@NotNull Context context, @NotNull NativeCrashServiceConfig nativeCrashServiceConfig);

    public abstract void markCrashCompleted(@NotNull String str);

    public abstract void setDefaultCrashHandler(@Nullable NativeCrashHandler nativeCrashHandler);
}

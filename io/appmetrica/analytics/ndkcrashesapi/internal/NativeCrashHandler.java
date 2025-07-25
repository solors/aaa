package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface NativeCrashHandler {
    void newCrash(@NotNull NativeCrash nativeCrash);
}

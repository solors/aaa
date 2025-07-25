package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LogLevel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class LogLevelKt {
    public static final boolean contains(@NotNull LogLevel contains, @NotNull LogLevel childLevel) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        Intrinsics.checkNotNullParameter(childLevel, "childLevel");
        if (childLevel == contains) {
            return true;
        }
        while (childLevel != null) {
            if (childLevel == contains) {
                return true;
            }
            childLevel = childLevel.getParent();
        }
        return false;
    }
}

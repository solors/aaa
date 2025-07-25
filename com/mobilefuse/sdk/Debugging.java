package com.mobilefuse.sdk;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.DebuggingKt */
/* loaded from: classes7.dex */
public final class Debugging {
    public static final void logDebug(@NotNull Object logDebug, @NotNull String msg, @Nullable String str) {
        Intrinsics.checkNotNullParameter(logDebug, "$this$logDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (str == null) {
            str = logDebug.getClass().getSimpleName();
        }
        Log.d(str, msg);
    }

    public static /* synthetic */ void logDebug$default(Object obj, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logDebug(obj, str, str2);
    }

    public static final void logError(@NotNull Object logError, @NotNull String msg, @Nullable String str) {
        Intrinsics.checkNotNullParameter(logError, "$this$logError");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (str == null) {
            str = logError.getClass().getSimpleName();
        }
        Log.e(str, msg);
    }

    public static /* synthetic */ void logError$default(Object obj, String str, String str2, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        logError(obj, str, str2);
    }
}

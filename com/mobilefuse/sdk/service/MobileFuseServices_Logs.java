package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.Debugging;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.service.MobileFuseServices_LogsKt */
/* loaded from: classes7.dex */
public final class MobileFuseServices_Logs {
    public static final void logServiceDebug(@NotNull MobileFuseServices logServiceDebug, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(logServiceDebug, "$this$logServiceDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(msg);
        sb2.append(" on thread: ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        Debugging.logDebug(logServiceDebug, sb2.toString(), "MobileFuseServices");
    }

    public static final void logServiceDebug(@NotNull MobileFuseService logServiceDebug, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(logServiceDebug, "$this$logServiceDebug");
        Intrinsics.checkNotNullParameter(msg, "msg");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("** Service ");
        sb2.append(logServiceDebug);
        sb2.append(": ");
        sb2.append(msg);
        sb2.append(" on thread: ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        Debugging.logDebug(logServiceDebug, sb2.toString(), "MobileFuseService");
    }
}

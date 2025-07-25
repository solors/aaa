package com.mobilefuse.sdk;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StabilityHelperBridge.kt */
@Metadata
/* loaded from: classes7.dex */
public final class StabilityHelperBridge {
    @NotNull
    public static final StabilityHelperBridge INSTANCE = new StabilityHelperBridge();
    @Nullable
    private static Function2<? super Class<?>, ? super Throwable, Unit> logExceptionFn;
    @Nullable
    private static Function2<? super String, ? super String, Unit> registerExceptionHandlerVariableFn;

    private StabilityHelperBridge() {
    }

    public static final void logException(@NotNull Class<?> senderClass, @NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(senderClass, "senderClass");
        Intrinsics.checkNotNullParameter(e, "e");
        Function2<? super Class<?>, ? super Throwable, Unit> function2 = logExceptionFn;
        if (function2 == null || function2.mo105910invoke(senderClass, e) == null) {
            StabilityHelperBridge stabilityHelperBridge = INSTANCE;
            Debugging.logDebug$default(stabilityHelperBridge, "Stability log exception function is not configured. Will ignore an error: " + e.getMessage(), null, 2, null);
            Unit unit = Unit.f99208a;
        }
    }

    @Nullable
    public final Function2<Class<?>, Throwable, Unit> getLogExceptionFn() {
        return logExceptionFn;
    }

    @Nullable
    public final Function2<String, String, Unit> getRegisterExceptionHandlerVariableFn() {
        return registerExceptionHandlerVariableFn;
    }

    public final void setLogExceptionFn(@Nullable Function2<? super Class<?>, ? super Throwable, Unit> function2) {
        logExceptionFn = function2;
    }

    public final void setRegisterExceptionHandlerVariableFn(@Nullable Function2<? super String, ? super String, Unit> function2) {
        registerExceptionHandlerVariableFn = function2;
    }
}

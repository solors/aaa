package com.yandex.mobile.ads.impl;

import java.lang.Thread;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class a32 implements Thread.UncaughtExceptionHandler {
    @NotNull

    /* renamed from: a */
    private final jl1 f76686a;
    @Nullable

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f76687b;
    @NotNull

    /* renamed from: c */
    private final yp1 f76688c;

    public a32(@NotNull jl1 reporter, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NotNull yp1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f76686a = reporter;
        this.f76687b = uncaughtExceptionHandler;
        this.f76688c = sdkConfiguration;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@NotNull Thread thread, @NotNull Throwable throwable) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            Set<t30> m26738q = this.f76688c.m26738q();
            if (m26738q == null) {
                m26738q = C37572z0.m17123f();
            }
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            if (mx1.m31750a(stackTrace, m26738q)) {
                this.f76686a.reportUnhandledException(throwable);
            }
            if (this.f76688c.m26740p() || (uncaughtExceptionHandler = this.f76687b) == null) {
                return;
            }
        } catch (Throwable th) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                this.f76686a.reportError("Failed to report uncaught exception", th);
                Result.m14549b(Unit.f99208a);
            } finally {
                try {
                    if (!this.f76688c.m26740p() || (uncaughtExceptionHandler = this.f76687b) == null) {
                        return;
                    }
                } catch (Throwable th2) {
                }
            }
            if (!this.f76688c.m26740p()) {
                return;
            }
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, throwable);
    }
}

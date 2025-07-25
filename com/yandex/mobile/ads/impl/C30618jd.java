package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jd */
/* loaded from: classes8.dex */
public final class C30618jd {
    @NotNull

    /* renamed from: a */
    private final jl1 f80866a;

    public C30618jd(@NotNull jl1 reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f80866a = reporter;
    }

    /* renamed from: a */
    public final void m32943a(@NotNull StackTraceElement[] reportedStackTrace) {
        Intrinsics.checkNotNullParameter(reportedStackTrace, "reportedStackTrace");
        StackTraceElement m31751a = mx1.m31751a(reportedStackTrace);
        if (m31751a != null) {
            jl1 jl1Var = this.f80866a;
            String stackTraceElement = m31751a.toString();
            Intrinsics.checkNotNullExpressionValue(stackTraceElement, "toString(...)");
            Intrinsics.checkNotNullParameter(reportedStackTrace, "<this>");
            Throwable th = new Throwable();
            th.setStackTrace(reportedStackTrace);
            jl1Var.mo27967a(stackTraceElement, th);
        }
    }
}

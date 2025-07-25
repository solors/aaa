package com.moloco.sdk.internal.error.crash.filters;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.internal.error.crash.filters.b */
/* loaded from: classes7.dex */
public final class C23977b implements InterfaceC23976a {
    @NotNull

    /* renamed from: a */
    public final String f62056a = "MolocoSDKExceptionFilter";

    @Override // com.moloco.sdk.internal.error.crash.filters.InterfaceC23976a
    /* renamed from: a */
    public boolean mo47247a(@NotNull Throwable crash) {
        boolean m16592R;
        boolean m16592R2;
        Intrinsics.checkNotNullParameter(crash, "crash");
        StackTraceElement[] stackTrace = crash.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "crash.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "stackTraceElement.className");
            m16592R2 = C37690r.m16592R(className, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
            if (m16592R2) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f62056a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        Throwable cause = crash.getCause();
        if (cause == null) {
            return false;
        }
        StackTraceElement[] stackTrace2 = cause.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
        for (StackTraceElement stackTraceElement2 : stackTrace2) {
            String className2 = stackTraceElement2.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "stackTraceElement.className");
            m16592R = C37690r.m16592R(className2, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
            if (m16592R) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f62056a, "SDK detected in stacktrace", null, false, 12, null);
                return true;
            }
        }
        return false;
    }
}

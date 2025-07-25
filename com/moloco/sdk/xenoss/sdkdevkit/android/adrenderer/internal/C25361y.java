package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.InterfaceC23967b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24650f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y */
/* loaded from: classes7.dex */
public final class C25361y {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC24797u m44677a(@NotNull InterfaceC24650f mediaCacheRepository, @NotNull InterfaceC23967b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        return new C24908v(mediaCacheRepository, errorReportingService);
    }

    /* renamed from: c */
    public static final void m44675c(String str) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "DECLoaderImpl", str, false, 4, null);
    }
}

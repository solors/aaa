package com.moloco.sdk.internal.error;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.api.InterfaceC23965a;
import com.moloco.sdk.internal.services.config.InterfaceC24321a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.error.c */
/* loaded from: classes7.dex */
public final class C23969c implements InterfaceC23967b {
    @NotNull

    /* renamed from: a */
    public final InterfaceC24321a f62045a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC23965a f62046b;
    @NotNull

    /* renamed from: c */
    public final String f62047c;

    public C23969c(@NotNull InterfaceC24321a configService, @NotNull InterfaceC23965a errorReportingApi) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(errorReportingApi, "errorReportingApi");
        this.f62045a = configService;
        this.f62046b = errorReportingApi;
        this.f62047c = "ErrorReportingServiceImpl";
    }

    @Override // com.moloco.sdk.internal.error.InterfaceC23967b
    /* renamed from: a */
    public void mo47256a(@NotNull String error, @NotNull C23964a errorMetadata) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        if (!this.f62045a.mo46604a("ReportSDKError")) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String str = this.f62047c;
            MolocoLogger.warn$default(molocoLogger, str, "Error reporting is disabled. Tried to report error: " + error, null, false, 12, null);
            return;
        }
        String mo46602b = this.f62045a.mo46602b("ReportSDKError");
        if (mo46602b == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f62047c, "Error reporting is enabled but with invalid url", null, false, 12, null);
        } else {
            this.f62046b.mo47259a(error, mo46602b, errorMetadata);
        }
    }
}

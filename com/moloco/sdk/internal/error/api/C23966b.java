package com.moloco.sdk.internal.error.api;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.C23964a;
import com.moloco.sdk.internal.services.InterfaceC24382o;
import com.moloco.sdk.internal.utils.C24412c;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.InterfaceC25416a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.error.api.b */
/* loaded from: classes7.dex */
public final class C23966b implements InterfaceC23965a {
    @NotNull

    /* renamed from: a */
    public final InterfaceC24382o f62042a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC25416a f62043b;
    @NotNull

    /* renamed from: c */
    public final String f62044c;

    public C23966b(@NotNull InterfaceC24382o timeProviderService, @NotNull InterfaceC25416a httpClient) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f62042a = timeProviderService;
        this.f62043b = httpClient;
        this.f62044c = "ErrorReportingApi";
    }

    @Override // com.moloco.sdk.internal.error.api.InterfaceC23965a
    /* renamed from: a */
    public void mo47258a(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f62044c, "SDK Crashed", error, false, 8, null);
    }

    @Override // com.moloco.sdk.internal.error.api.InterfaceC23965a
    /* renamed from: a */
    public void mo47259a(@NotNull String error, @NotNull String url, @NotNull C23964a errorMetadata) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        String m46478e = C24412c.m46478e(C24412c.m46479d(url, error, this.f62042a.invoke()), errorMetadata.m47260a());
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str = this.f62044c;
        MolocoLogger.info$default(molocoLogger, str, "Reporting error: " + error + " to url: " + m46478e, false, 4, null);
        this.f62043b.mo44572a(m46478e);
    }
}

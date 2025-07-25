package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.IReporter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;

/* renamed from: com.yandex.mobile.ads.impl.we */
/* loaded from: classes8.dex */
public final class C31738we implements jl1 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38501j f87215a;

    public C31738we(@NotNull InterfaceC38501j<? extends IReporter> lazyReporter) {
        Intrinsics.checkNotNullParameter(lazyReporter, "lazyReporter");
        this.f87215a = lazyReporter;
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    /* renamed from: a */
    public final void mo27967a(@NotNull String message, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            ((IReporter) this.f87215a.getValue()).reportError("[ANR] " + message, "[ANR]", error);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    public final void reportError(@NotNull String message, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            ((IReporter) this.f87215a.getValue()).reportError(message, error);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    public final void reportUnhandledException(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            ((IReporter) this.f87215a.getValue()).reportUnhandledException(throwable);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    /* renamed from: a */
    public final void mo27968a(@NotNull fl1 report) {
        Intrinsics.checkNotNullParameter(report, "report");
        try {
            ((IReporter) this.f87215a.getValue()).reportEvent(report.m34120c(), report.m34121b());
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jl1
    /* renamed from: a */
    public final void mo27966a(boolean z) {
        try {
            ((IReporter) this.f87215a.getValue()).setDataSendingEnabled(z);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
        }
    }
}

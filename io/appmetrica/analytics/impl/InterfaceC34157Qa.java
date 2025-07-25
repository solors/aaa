package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.Qa */
/* loaded from: classes9.dex */
public interface InterfaceC34157Qa extends InterfaceC34180Ra {
    @NonNull
    @WorkerThread
    /* renamed from: a */
    InterfaceC33916Ga mo22342a(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC34180Ra
    @NonNull
    /* renamed from: a */
    /* synthetic */ InterfaceC34157Qa mo20848a();

    /* renamed from: a */
    void mo22341a(@NonNull ReporterConfig reporterConfig);

    @NonNull
    @WorkerThread
    /* renamed from: b */
    InterfaceC33916Ga mo22339b(@NonNull AppMetricaConfig appMetricaConfig, @NonNull PublicLogger publicLogger, boolean z);

    @NonNull
    /* renamed from: b */
    InterfaceC34133Pa mo22338b(@NonNull ReporterConfig reporterConfig);

    @NonNull
    /* renamed from: b */
    InterfaceC34204Sa mo22340b(@NonNull AppMetricaConfig appMetricaConfig);
}

package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.Ub */
/* loaded from: classes9.dex */
public final class C34253Ub extends AbstractC34288Vm {

    /* renamed from: b */
    public final AppMetricaConfig f93570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34253Ub(@NonNull InterfaceC34180Ra interfaceC34180Ra, @NonNull AppMetricaConfig appMetricaConfig) {
        super(interfaceC34180Ra);
        String str = appMetricaConfig.apiKey;
        this.f93570b = appMetricaConfig;
    }

    @NonNull
    /* renamed from: a */
    public final InterfaceC34204Sa m22176a() {
        return this.f93623a.mo20848a().mo22340b(this.f93570b);
    }
}

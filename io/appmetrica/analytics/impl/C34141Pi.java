package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.Pi */
/* loaded from: classes9.dex */
public final class C34141Pi implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ Revenue f93365a;

    public C34141Pi(Revenue revenue) {
        this.f93365a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportRevenue(this.f93365a);
    }
}

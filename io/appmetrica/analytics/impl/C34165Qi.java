package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.Qi */
/* loaded from: classes9.dex */
public final class C34165Qi implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ ECommerceEvent f93413a;

    public C34165Qi(ECommerceEvent eCommerceEvent) {
        this.f93413a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportECommerce(this.f93413a);
    }
}

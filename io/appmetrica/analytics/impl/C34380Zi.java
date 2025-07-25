package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.Zi */
/* loaded from: classes9.dex */
public final class C34380Zi implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f93894a;

    /* renamed from: b */
    public final /* synthetic */ boolean f93895b;

    public C34380Zi(AdRevenue adRevenue, boolean z) {
        this.f93894a = adRevenue;
        this.f93895b = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportAdRevenue(this.f93894a, this.f93895b);
    }
}

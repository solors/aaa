package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.Oi */
/* loaded from: classes9.dex */
public final class C34117Oi implements InterfaceC34109Oa {

    /* renamed from: a */
    public final /* synthetic */ UserProfile f93315a;

    public C34117Oi(UserProfile userProfile) {
        this.f93315a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34109Oa
    /* renamed from: a */
    public final void mo21570a(InterfaceC34133Pa interfaceC34133Pa) {
        interfaceC34133Pa.reportUserProfile(this.f93315a);
    }
}

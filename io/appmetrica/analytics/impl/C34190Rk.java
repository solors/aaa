package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: io.appmetrica.analytics.impl.Rk */
/* loaded from: classes9.dex */
public final class C34190Rk implements InterfaceC33787B6 {

    /* renamed from: a */
    public final /* synthetic */ StartupParamsCallback f93455a;

    /* renamed from: b */
    public final /* synthetic */ C34214Sk f93456b;

    public C34190Rk(C34214Sk c34214Sk, StartupParamsCallback startupParamsCallback) {
        this.f93456b = c34214Sk;
        this.f93455a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33787B6
    /* renamed from: a */
    public final void mo20847a(int i, Bundle bundle) {
        this.f93456b.m22253b(bundle, this.f93455a);
    }
}

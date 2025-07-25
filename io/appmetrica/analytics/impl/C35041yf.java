package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.appmetrica.analytics.impl.yf */
/* loaded from: classes9.dex */
public final class C35041yf implements InstallReferrerStateListener {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC34018Kf f95658a;

    /* renamed from: b */
    public final /* synthetic */ C33771Af f95659b;

    public C35041yf(C33771Af c33771Af, InterfaceC34018Kf interfaceC34018Kf) {
        this.f95659b = c33771Af;
        this.f95658a = interfaceC34018Kf;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        if (i == 0) {
            try {
                ReferrerDetails installReferrer = this.f95659b.f92569a.getInstallReferrer();
                this.f95659b.f92570b.execute(new RunnableC35015xf(this, new C33896Ff(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC33871Ef.f92793c)));
            } catch (Throwable th) {
                this.f95659b.f92570b.execute(new RunnableC35067zf(this.f95658a, th));
            }
        } else {
            C33771Af c33771Af = this.f95659b;
            InterfaceC34018Kf interfaceC34018Kf = this.f95658a;
            c33771Af.f92570b.execute(new RunnableC35067zf(interfaceC34018Kf, new IllegalStateException("Referrer check failed with error " + i)));
        }
        try {
            this.f95659b.f92569a.endConnection();
        } catch (Throwable unused) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}

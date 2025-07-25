package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.yandex.mobile.ads.impl.q6 */
/* loaded from: classes8.dex */
public final class C31178q6 implements InterfaceC30223e7 {
    @NotNull

    /* renamed from: a */
    private final AdQualityVerifierAdapter f84238a;

    public /* synthetic */ C31178q6(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j, C30074c7 c30074c7, C31725w6 c31725w6) {
        this(adQualityVerifierAdapter, adQualityVerifierAdapterConfiguration, j, c30074c7, c31725w6, new C31796x6());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30223e7
    public final void onAdClicked() {
        try {
            Result.C38506a c38506a = Result.f101870c;
            this.f84238a.onAdClicked();
            Result.m14549b(Unit.f99208a);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            Result.m14549b(C38508r.m14540a(th));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30223e7
    public final void onAdClosed() {
        try {
            Result.C38506a c38506a = Result.f101870c;
            this.f84238a.onAdClosed();
            Result.m14549b(Unit.f99208a);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            Result.m14549b(C38508r.m14540a(th));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30223e7
    public final void onAdWillDisplay() {
        try {
            Result.C38506a c38506a = Result.f101870c;
            this.f84238a.onAdWillDisplay();
            Result.m14549b(Unit.f99208a);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            Result.m14549b(C38508r.m14540a(th));
        }
    }

    public C31178q6(@NotNull AdQualityVerifierAdapter verifierAdapter, @NotNull AdQualityVerifierAdapterConfiguration verifierAdapterConfiguration, long j, @NotNull C30074c7 policyAcceptor, @NotNull C31725w6 statusHandler, @NotNull C31796x6 verifierAdConfigurationCreator) {
        Intrinsics.checkNotNullParameter(verifierAdapter, "verifierAdapter");
        Intrinsics.checkNotNullParameter(verifierAdapterConfiguration, "verifierAdapterConfiguration");
        Intrinsics.checkNotNullParameter(policyAcceptor, "policyAcceptor");
        Intrinsics.checkNotNullParameter(statusHandler, "statusHandler");
        Intrinsics.checkNotNullParameter(verifierAdConfigurationCreator, "verifierAdConfigurationCreator");
        this.f84238a = verifierAdapter;
    }
}

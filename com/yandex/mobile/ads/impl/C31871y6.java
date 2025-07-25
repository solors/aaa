package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.yandex.mobile.ads.impl.ak1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.yandex.mobile.ads.impl.y6 */
/* loaded from: classes8.dex */
public final class C31871y6 {
    @Nullable
    /* renamed from: a */
    public static AdQualityVerifierAdapter m27023a() {
        Object m14549b;
        AdQualityVerifierAdapter adQualityVerifierAdapter;
        Intrinsics.checkNotNullParameter("com.monetization.ads.quality.appharbr.AppHarbrAdQualityVerifierAdapter", "adapterName");
        AdQualityVerifierAdapter adQualityVerifierAdapter2 = null;
        try {
            Result.C38506a c38506a = Result.f101870c;
            Object m35838a = ak1.C29944a.m35838a("com.monetization.ads.quality.appharbr.AppHarbrAdQualityVerifierAdapter", new Object[0]);
            if (m35838a instanceof AdQualityVerifierAdapter) {
                adQualityVerifierAdapter = (AdQualityVerifierAdapter) m35838a;
            } else {
                adQualityVerifierAdapter = null;
            }
            m14549b = Result.m14549b(adQualityVerifierAdapter);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        Throwable m14546e = Result.m14546e(m14549b);
        if (m14546e != null) {
            m14546e.getMessage();
            um0.m28727b(new Object[0]);
        }
        if (!Result.m14544g(m14549b)) {
            adQualityVerifierAdapter2 = m14549b;
        }
        return adQualityVerifierAdapter2;
    }
}

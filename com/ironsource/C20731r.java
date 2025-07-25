package com.ironsource;

import com.ironsource.InterfaceC20684qd;
import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

@Metadata
/* renamed from: com.ironsource.r */
/* loaded from: classes6.dex */
public final class C20731r implements InterfaceC20684qd, InterfaceC20684qd.InterfaceC20685a {
    @NotNull

    /* renamed from: a */
    private final Map<IronSource.AD_UNIT, AtomicBoolean> f52684a;

    public C20731r() {
        Map<IronSource.AD_UNIT, AtomicBoolean> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(IronSource.AD_UNIT.REWARDED_VIDEO, new AtomicBoolean(false)), C38513v.m14532a(IronSource.AD_UNIT.INTERSTITIAL, new AtomicBoolean(false)), C38513v.m14532a(IronSource.AD_UNIT.BANNER, new AtomicBoolean(false)));
        this.f52684a = m17281m;
    }

    @Override // com.ironsource.InterfaceC20684qd.InterfaceC20685a
    /* renamed from: a */
    public void mo55579a(@NotNull IronSource.AD_UNIT adFormat, boolean z) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f52684a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC20684qd
    /* renamed from: a */
    public boolean mo55580a(@NotNull IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f52684a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}

package com.ironsource;

import com.ironsource.C19869f3;
import com.ironsource.InterfaceC19668c3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.eb */
/* loaded from: classes6.dex */
public final class C19810eb {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20128j3 f49876a;

    public C19810eb(@NotNull InterfaceC20128j3 analytics, @NotNull String adRequestAdId, @NotNull InterfaceC20599oo adRequestProviderName) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        Intrinsics.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.f49876a = analytics;
        analytics.mo57899a(new C19869f3.C19888s(adRequestProviderName.value()), new C19869f3.C19871b(adRequestAdId));
    }

    /* renamed from: a */
    public final void m58820a() {
        InterfaceC19668c3.C19673c.f49384a.m59230a().mo59236a(this.f49876a);
    }

    /* renamed from: a */
    public final void m58819a(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC19668c3.C19673c.f49384a.m59229a(new C19869f3.C19879j(error.getErrorCode()), new C19869f3.C19880k(error.getErrorMessage()), new C19869f3.C19875f(0L)).mo59236a(this.f49876a);
    }
}

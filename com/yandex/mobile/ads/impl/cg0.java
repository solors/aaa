package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cg0 {
    @NotNull

    /* renamed from: a */
    private final f30 f77620a;
    @NotNull

    /* renamed from: b */
    private final C30361g4 f77621b;

    public cg0(@NotNull f30 environmentConfiguration, @NotNull C30361g4 adHostConfigurator) {
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(adHostConfigurator, "adHostConfigurator");
        this.f77620a = environmentConfiguration;
        this.f77621b = adHostConfigurator;
    }

    /* renamed from: a */
    public final void m35236a(@NotNull Context context, @NotNull bg0 identifiers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        C30723ke m35480a = identifiers.m35480a();
        String m35478c = identifiers.m35478c();
        this.f77620a.m34378a(this.f77621b.m33934a(context, m35480a, identifiers.m35479b()));
        this.f77620a.m34376b(m35480a.m32572b());
        this.f77620a.m34372d(m35480a.m32571c());
        this.f77620a.m34374c(m35478c);
    }
}

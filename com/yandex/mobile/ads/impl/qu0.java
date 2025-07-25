package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.base.model.MediationNetwork;
import com.monetization.ads.mediation.base.C25606a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qu0<T extends C25606a> {
    @NotNull

    /* renamed from: a */
    private final T f84537a;
    @NotNull

    /* renamed from: b */
    private final MediationNetwork f84538b;
    @NotNull

    /* renamed from: c */
    private final s50 f84539c;

    public qu0(@NotNull T mediatedAdapter, @NotNull MediationNetwork mediationNetwork, @NotNull s50 extrasCreator) {
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(extrasCreator, "extrasCreator");
        this.f84537a = mediatedAdapter;
        this.f84538b = mediationNetwork;
        this.f84539c = extrasCreator;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m30216a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f84539c.mo29851a(context);
    }

    @NotNull
    /* renamed from: b */
    public final MediationNetwork m30215b() {
        return this.f84538b;
    }

    @NotNull
    /* renamed from: c */
    public final Map<String, String> m30214c() {
        return this.f84539c.mo29850a(this.f84538b);
    }

    @NotNull
    /* renamed from: a */
    public final T m30217a() {
        return this.f84537a;
    }
}

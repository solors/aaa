package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.MediationNetwork;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dv0 implements InterfaceC31080p1 {
    @Nullable

    /* renamed from: a */
    private final qu0<?> f78251a;
    @NotNull

    /* renamed from: b */
    private final cv0 f78252b;

    public dv0(@Nullable qu0<?> qu0Var, @NotNull cv0 mediatedAdapterInfoReportDataProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f78251a = qu0Var;
        this.f78252b = mediatedAdapterInfoReportDataProvider;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.monetization.ads.mediation.base.a] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC31080p1
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo30857a() {
        gl1 gl1Var = new gl1((Map) null, 3);
        qu0<?> qu0Var = this.f78251a;
        if (qu0Var != null) {
            MediationNetwork m30215b = qu0Var.m30215b();
            ?? m30217a = this.f78251a.m30217a();
            gl1Var.m33814b(m30215b.m44556e(), "adapter");
            gl1Var.m33814b(m30215b.m44552i(), "adapter_parameters");
            this.f78252b.getClass();
            gl1Var.m33816a(new HashMap(cv0.m35148a(m30217a)));
        }
        return gl1Var.m33815b();
    }
}

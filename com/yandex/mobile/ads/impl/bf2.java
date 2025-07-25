package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fl1;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class bf2 implements dm1<z52, List<? extends z52>> {
    @NotNull

    /* renamed from: a */
    private final w72 f77283a;

    public bf2(@NotNull w72 reportParametersProvider) {
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        this.f77283a = reportParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27572a(z52 z52Var) {
        Map reportData;
        Map m17285D;
        z52 request = z52Var;
        Intrinsics.checkNotNullParameter(request, "request");
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79151o;
        reportData = C37559r0.m17281m(C38513v.m14532a("page_id", this.f77283a.mo28016a()), C38513v.m14532a("imp_id", this.f77283a.mo28015b()));
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        return new fl1(m34119a, m17285D, (C30280f) null);
    }

    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27573a(om1<List<? extends z52>> om1Var, int i, z52 z52Var) {
        fl1.EnumC30325c enumC30325c;
        Map m17281m;
        Map m17291g;
        Map reportData;
        Map m17285D;
        z52 request = z52Var;
        Intrinsics.checkNotNullParameter(request, "request");
        List<? extends z52> list = om1Var != null ? om1Var.f83557a : null;
        if (204 == i) {
            enumC30325c = fl1.EnumC30325c.f79166e;
        } else if (list != null && i == 200) {
            enumC30325c = list.isEmpty() ? fl1.EnumC30325c.f79166e : fl1.EnumC30325c.f79164c;
        } else {
            enumC30325c = fl1.EnumC30325c.f79165d;
        }
        m17281m = C37559r0.m17281m(C38513v.m14532a("page_id", this.f77283a.mo28016a()), C38513v.m14532a("imp_id", this.f77283a.mo28015b()));
        m17291g = MapsJVM.m17291g(C38513v.m14532a("status", enumC30325c.m34118a()));
        reportData = C37559r0.m17276r(m17281m, m17291g);
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79152p;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        return new fl1(m34119a, m17285D, (C30280f) null);
    }
}

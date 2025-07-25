package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.fl1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rt1 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f84883a;
    @Nullable

    /* renamed from: b */
    private final m41 f84884b;
    @NotNull

    /* renamed from: c */
    private final jl1 f84885c;

    public rt1(@NotNull Context context, @NotNull C30149d8<?> adResponse, @NotNull C30359g3 adConfiguration, @Nullable m41 m41Var, @NotNull jl1 metricaReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        this.f84883a = adResponse;
        this.f84884b = m41Var;
        this.f84885c = metricaReporter;
    }

    /* renamed from: a */
    public final void m29952a(@NotNull List<hw1> socialActionItems) {
        int m17154x;
        Map m17285D;
        Intrinsics.checkNotNullParameter(socialActionItems, "socialActionItems");
        gl1 gl1Var = new gl1((Map) null, 3);
        gl1Var.m33814b(fl1.C30323a.f79112a, "adapter");
        m17154x = C37566w.m17154x(socialActionItems, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (hw1 hw1Var : socialActionItems) {
            arrayList.add(hw1Var.m33448b());
        }
        gl1Var.m33814b((String[]) arrayList.toArray(new String[0]), "social_actions");
        m41 m41Var = this.f84884b;
        if (m41Var != null) {
            gl1Var = hl1.m33525a(gl1Var, m41Var.m32102a());
        }
        gl1Var.m33819a(this.f84883a.m35068a());
        fl1.EnumC30324b enumC30324b = fl1.EnumC30324b.f79119G;
        Map<String, Object> m33815b = gl1Var.m33815b();
        C30280f m33891a = gb1.m33891a(gl1Var, enumC30324b, "reportType", m33815b, "reportData");
        String m34119a = enumC30324b.m34119a();
        m17285D = C37559r0.m17285D(m33815b);
        this.f84885c.mo27968a(new fl1(m34119a, m17285D, m33891a));
    }
}

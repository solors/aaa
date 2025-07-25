package com.yandex.mobile.ads.impl;

import java.util.Objects;
import java.util.Set;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j42 {
    /* renamed from: a */
    public static final void m33045a(@NotNull i42 i42Var, @NotNull fl1 report) {
        Set<Long> m17123f;
        Intrinsics.checkNotNullParameter(i42Var, "<this>");
        Intrinsics.checkNotNullParameter(report, "report");
        try {
            C30280f m34122a = report.m34122a();
            String str = (m34122a == null || (str = m34122a.m34406a()) == null) ? "" : "";
            C30280f m34122a2 = report.m34122a();
            if (m34122a2 == null || (m17123f = m34122a2.m34405b()) == null) {
                m17123f = C37572z0.m17123f();
            }
            i42Var.setExperiments(str);
            i42Var.setTriggeredTestIds(m17123f);
            Objects.toString(m17123f);
            um0.m28728a(new Object[0]);
        } catch (Throwable th) {
            th.toString();
            um0.m28727b(new Object[0]);
        }
    }
}

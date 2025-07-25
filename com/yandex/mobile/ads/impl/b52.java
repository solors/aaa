package com.yandex.mobile.ads.impl;

import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.yandex.mobile.ads.impl.fl1;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class b52 implements dm1<y42, q42> {
    @NotNull

    /* renamed from: a */
    private final C31093p7 f77123a;

    public b52(@NotNull C31093p7 adRequestParametersProvider) {
        Intrinsics.checkNotNullParameter(adRequestParametersProvider, "adRequestParametersProvider");
        this.f77123a = adRequestParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27572a(y42 y42Var) {
        Map m17285D;
        y42 requestConfiguration = y42Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Map<String, Object> reportData = m35639a();
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79149m;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        return new fl1(m34119a, m17285D, (C30280f) null);
    }

    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27573a(om1<q42> om1Var, int i, y42 y42Var) {
        Map reportData;
        Map m17285D;
        y42 requestConfiguration = y42Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        reportData = C37559r0.m17285D(m35639a());
        if (i != -1) {
            reportData.put(C26559a.f69635d, Integer.valueOf(i));
        }
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79150n;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        return new fl1(m34119a, m17285D, (C30280f) null);
    }

    /* renamed from: a */
    private final Map<String, Object> m35639a() {
        Map<String, Object> m17281m;
        Tuples[] tuplesArr = new Tuples[2];
        String m30828d = this.f77123a.m30828d();
        if (m30828d == null) {
            m30828d = "";
        }
        if (m30828d.length() == 0) {
            m30828d = "null";
        }
        tuplesArr[0] = C38513v.m14532a("page_id", m30828d);
        String m30829c = this.f77123a.m30829c();
        String str = m30829c != null ? m30829c : "";
        tuplesArr[1] = C38513v.m14532a("imp_id", str.length() != 0 ? str : "null");
        m17281m = C37559r0.m17281m(tuplesArr);
        return m17281m;
    }
}

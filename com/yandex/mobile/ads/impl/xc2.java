package com.yandex.mobile.ads.impl;

import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.yandex.mobile.ads.impl.fl1;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class xc2 implements dm1<uc2, qc2> {
    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27572a(uc2 uc2Var) {
        Map reportData;
        Map m17285D;
        uc2 requestConfiguration = uc2Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        reportData = C37559r0.m17281m(C38513v.m14532a("page_id", requestConfiguration.mo28824a()), C38513v.m14532a(Reporting.Key.CATEGORY_ID, requestConfiguration.mo28823b()));
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79156t;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        return new fl1(m34119a, m17285D, (C30280f) null);
    }

    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27573a(om1<qc2> om1Var, int i, uc2 uc2Var) {
        Map m17281m;
        Map reportData;
        Map m17285D;
        uc2 requestConfiguration = uc2Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        m17281m = C37559r0.m17281m(C38513v.m14532a("page_id", requestConfiguration.mo28824a()), C38513v.m14532a(Reporting.Key.CATEGORY_ID, requestConfiguration.mo28823b()));
        reportData = C37559r0.m17285D(m17281m);
        if (i != -1) {
            reportData.put(C26559a.f69635d, Integer.valueOf(i));
        }
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79157u;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        return new fl1(m34119a, m17285D, (C30280f) null);
    }
}

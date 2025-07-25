package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsJVM;
import p1046xd.C44980k;

/* renamed from: com.chartboost.sdk.impl.k9 */
/* loaded from: classes3.dex */
public final class C10003k9 {
    /* renamed from: a */
    public final String m81216a(File htmlFile, String params, String adm) {
        String m1185h;
        String m16628I;
        String m16628I2;
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(adm, "adm");
        try {
            m1185h = C44980k.m1185h(htmlFile, Charsets.UTF_8);
            m16628I = StringsJVM.m16628I(m1185h, "\"{% params %}\"", params, false, 4, null);
            m16628I2 = StringsJVM.m16628I(m16628I, "{% adm %}", adm, false, 4, null);
            return m16628I2;
        } catch (Exception e) {
            C9763c7.m81920b("Parse sdk bidding template exception", e);
            return null;
        }
    }
}

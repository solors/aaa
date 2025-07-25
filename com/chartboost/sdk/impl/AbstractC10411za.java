package com.chartboost.sdk.impl;

import java.util.Arrays;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* renamed from: com.chartboost.sdk.impl.za */
/* loaded from: classes3.dex */
public abstract class AbstractC10411za {

    /* renamed from: a */
    public static final Regex f23680a = new Regex("^market://details\\?id=(.*)$");

    /* renamed from: a */
    public static final String m79789a(C10357xa c10357xa) {
        List<String> mo16748c;
        Object m17528s0;
        MatchResult m16767d = f23680a.m16767d(c10357xa.m80061b());
        if (m16767d != null && (mo16748c = m16767d.mo16748c()) != null) {
            m17528s0 = _Collections.m17528s0(mo16748c, 1);
            return (String) m17528s0;
        }
        return null;
    }

    /* renamed from: b */
    public static final C10357xa m79788b(C10357xa c10357xa) {
        Intrinsics.checkNotNullParameter(c10357xa, "<this>");
        String m79789a = m79789a(c10357xa);
        if (m79789a != null) {
            String format = String.format("https://play.google.com/store/apps/details?id=%s", Arrays.copyOf(new Object[]{m79789a}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            C10357xa m80063a = C10357xa.m80063a(c10357xa, format, null, 2, null);
            if (m80063a != null) {
                return m80063a;
            }
            return c10357xa;
        }
        return c10357xa;
    }
}

package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.T5 */
/* loaded from: classes6.dex */
public abstract class AbstractC19109T5 {
    /* renamed from: a */
    public static final EnumC19096S5 m60674a(String logLevel) {
        boolean m16615y;
        boolean m16615y2;
        boolean m16615y3;
        boolean m16615y4;
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        m16615y = StringsJVM.m16615y(logLevel, "DEBUG", true);
        if (!m16615y) {
            m16615y2 = StringsJVM.m16615y(logLevel, "ERROR", true);
            if (!m16615y2) {
                m16615y3 = StringsJVM.m16615y(logLevel, "INFO", true);
                if (!m16615y3) {
                    m16615y4 = StringsJVM.m16615y(logLevel, "STATE", true);
                    if (m16615y4) {
                        return EnumC19096S5.f47691d;
                    }
                    return EnumC19096S5.f47690c;
                }
                return EnumC19096S5.f47688a;
            }
            return EnumC19096S5.f47690c;
        }
        return EnumC19096S5.f47689b;
    }
}

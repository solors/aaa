package com.yandex.mobile.ads.impl;

import com.facebook.internal.AnalyticsEvents;
import java.util.Map;
import kotlin.collections.C37559r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* renamed from: com.yandex.mobile.ads.impl.je */
/* loaded from: classes8.dex */
public final class C30620je {
    @NotNull

    /* renamed from: a */
    private static final Map<EnumC31348se, String> f80877a;

    static {
        Map<EnumC31348se, String> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(EnumC31348se.f85201c, "Network error"), C38513v.m14532a(EnumC31348se.f85202d, "Invalid response"), C38513v.m14532a(EnumC31348se.f85200b, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN));
        f80877a = m17281m;
    }

    @NotNull
    /* renamed from: a */
    public static String m32942a(@Nullable EnumC31348se enumC31348se) {
        String str = f80877a.get(enumC31348se);
        if (str == null) {
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        return str;
    }
}

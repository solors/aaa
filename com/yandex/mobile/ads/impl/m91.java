package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class m91 {
    @NotNull

    /* renamed from: a */
    private static final Object f82098a = new Object();
    @Nullable

    /* renamed from: b */
    private static volatile am1 f82099b;

    @NotNull
    /* renamed from: a */
    public static final am1 m32067a(@NotNull Context context) {
        am1 am1Var;
        int i;
        Integer m26793D;
        Intrinsics.checkNotNullParameter(context, "context");
        am1 am1Var2 = f82099b;
        if (am1Var2 == null) {
            synchronized (f82098a) {
                am1 am1Var3 = f82099b;
                if (am1Var3 == null) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    int i2 = as1.f76895l;
                    yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
                    if (m35796a != null && (m26793D = m35796a.m26793D()) != null) {
                        if (m26793D.intValue() == 0) {
                            m26793D = null;
                        }
                        if (m26793D != null) {
                            i = m26793D.intValue();
                            am1Var = bm1.m35458a(context, i);
                            f82099b = am1Var;
                            am1Var.m35828a();
                        }
                    }
                    i = 1;
                    am1Var = bm1.m35458a(context, i);
                    f82099b = am1Var;
                    am1Var.m35828a();
                } else {
                    am1Var = am1Var3;
                }
            }
            return am1Var;
        }
        return am1Var2;
    }
}

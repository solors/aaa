package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class lh2 implements k42 {
    @NotNull

    /* renamed from: a */
    public static final lh2 f81817a = new lh2();
    @NotNull

    /* renamed from: b */
    private static final Object f81818b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile kh2 f81819c;

    private lh2() {
    }

    @Override // com.yandex.mobile.ads.impl.k42
    @NotNull
    /* renamed from: a */
    public final i42 mo32263a(@NotNull Context context) {
        kh2 kh2Var;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        kh2 kh2Var2 = f81819c;
        if (kh2Var2 == null) {
            synchronized (f81818b) {
                kh2Var = f81819c;
                if (kh2Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    if (C30155da.m34982a(applicationContext)) {
                        str = "322a737a-a0ca-44e0-bc85-649b1c7c1db6";
                    } else {
                        str = "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    }
                    C30163de c30163de = new C30163de(applicationContext);
                    c30163de.m34957a(str);
                    int i = as1.f76895l;
                    kh2Var = new kh2(c30163de, applicationContext, as1.C29962a.m35776a().m35796a(applicationContext));
                    f81819c = kh2Var;
                }
            }
            return kh2Var;
        }
        return kh2Var2;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ey1 {
    @NotNull

    /* renamed from: a */
    private final C31824xi f78843a;

    public /* synthetic */ ey1() {
        this(new C31824xi());
    }

    @Nullable
    /* renamed from: a */
    public final String m34410a(@NotNull Context context, @NotNull String body) {
        c30 c30Var;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a == null || (c30Var = m35796a.m26730u()) == null) {
            c30Var = c30.f77485c;
        }
        sx0 sx0Var = new sx0(c30Var.m35372c(), c30Var.m35373b());
        byte[] bytes = body.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] m29346a = sx0Var.m29346a(bytes);
        if (m29346a != null) {
            this.f78843a.getClass();
            return C31824xi.m27476a(m29346a);
        }
        return null;
    }

    public ey1(@NotNull C31824xi base64Encoder) {
        Intrinsics.checkNotNullParameter(base64Encoder, "base64Encoder");
        this.f78843a = base64Encoder;
    }
}

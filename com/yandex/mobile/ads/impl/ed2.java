package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31287rj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ed2 implements AbstractC31287rj.InterfaceC31288a<c91> {
    @Nullable

    /* renamed from: a */
    private final vl1<c91> f78508a = null;

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
    /* renamed from: a */
    public final void mo29243a(@NotNull yc2 error) {
        f62 f62Var;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.f88158b == null) {
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            f62Var = new f62(2, message);
        } else {
            Intrinsics.checkNotNullParameter("Ping error", "description");
            f62Var = new f62(1, "Ping error");
        }
        vl1<c91> vl1Var = this.f78508a;
        if (vl1Var != null) {
            vl1Var.mo26878a(f62Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31054b
    /* renamed from: a */
    public final void mo28555a(Object obj) {
        c91 response = (c91) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        vl1<c91> vl1Var = this.f78508a;
        if (vl1Var != null) {
            vl1Var.mo26877a((vl1<c91>) response);
        }
    }
}

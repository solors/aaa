package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class av0 implements InterfaceC30449h8 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f76919a;

    public av0(@NotNull C30149d8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f76919a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30449h8
    @NotNull
    /* renamed from: a */
    public final gl1 mo32469a() {
        gl1 gl1Var = new gl1(new HashMap(), 2);
        gl1Var.m33814b(this.f76919a.m35056m(), FirebaseAnalytics.Param.AD_SOURCE);
        gl1Var.m33814b(this.f76919a.m35053p(), "block_id");
        gl1Var.m33814b(this.f76919a.m35053p(), "ad_unit_id");
        gl1Var.m33818a(this.f76919a.m35078J(), "server_log_id");
        gl1Var.m33819a(this.f76919a.m35068a());
        return gl1Var;
    }
}

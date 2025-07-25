package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class kp1 implements InterfaceC30449h8 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f81515a;

    public kp1(@NotNull C30149d8<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f81515a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30449h8
    @NotNull
    /* renamed from: a */
    public final gl1 mo32469a() {
        gl1 gl1Var = new gl1((Map) null, 3);
        gl1Var.m33814b(this.f81515a.m35056m(), FirebaseAnalytics.Param.AD_SOURCE);
        gl1Var.m33814b(this.f81515a.m35054o(), "ad_type_format");
        gl1Var.m33814b(this.f81515a.m35053p(), "block_id");
        gl1Var.m33814b(this.f81515a.m35053p(), "ad_unit_id");
        gl1Var.m33814b(this.f81515a.m35082F(), "product_type");
        gl1Var.m33818a(this.f81515a.m35078J(), "server_log_id");
        gl1Var.m33814b(this.f81515a.m35077K().mo29654a().m30213a(), "size_type");
        gl1Var.m33814b(Integer.valueOf(this.f81515a.m35077K().getWidth()), "width");
        gl1Var.m33814b(Integer.valueOf(this.f81515a.m35077K().getHeight()), "height");
        gl1Var.m33819a(this.f81515a.m35068a());
        return gl1Var;
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ng0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class s51 implements ng0.InterfaceC30944a {

    /* renamed from: a */
    private final boolean f85020a;

    public s51(@NotNull C30149d8<?> adResponse) {
        boolean z;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (!Intrinsics.m17075f(adResponse.m35085C(), r51.f84634c.m30146a()) && !Intrinsics.m17075f(adResponse.m35085C(), r51.f84635d.m30146a())) {
            z = false;
        } else {
            z = true;
        }
        this.f85020a = z;
    }

    @Override // com.yandex.mobile.ads.impl.ng0.InterfaceC30944a
    /* renamed from: a */
    public final boolean mo27472a() {
        return this.f85020a;
    }
}

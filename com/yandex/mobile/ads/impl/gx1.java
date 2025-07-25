package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gx1 {
    @NotNull

    /* renamed from: a */
    private final C31732wb f79800a;

    public gx1(@NotNull C31732wb advertiserPresentController) {
        Intrinsics.checkNotNullParameter(advertiserPresentController, "advertiserPresentController");
        this.f79800a = advertiserPresentController;
    }

    @NotNull
    /* renamed from: a */
    public final fx1 m33757a(@NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        if (videoAdInfo.m32083f() != null) {
            return fx1.f79342c;
        }
        if (this.f79800a.m27996a()) {
            return fx1.f79343d;
        }
        return fx1.f79341b;
    }
}

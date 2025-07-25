package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class pk0 {
    @NotNull

    /* renamed from: a */
    private final qk0 f84004a;

    public pk0(@NotNull C31920yr coreInstreamAdBreak, @NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f84004a = new qk0(coreInstreamAdBreak, videoAdInfo);
    }

    /* renamed from: a */
    public final void m30620a(@NotNull b62 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        uiElements.m35633a().setTag(this.f84004a.m30282a());
    }
}

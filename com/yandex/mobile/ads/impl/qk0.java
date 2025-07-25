package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qk0 {
    @NotNull

    /* renamed from: a */
    private final C31920yr f84413a;
    @NotNull

    /* renamed from: b */
    private final m62<kl0> f84414b;

    public qk0(@NotNull C31920yr adBreak, @NotNull m62<kl0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        this.f84413a = adBreak;
        this.f84414b = videoAdInfo;
    }

    @NotNull
    /* renamed from: a */
    public final String m30282a() {
        int m33355a = this.f84414b.m32085d().m32504b().m33355a();
        C31920yr c31920yr = this.f84413a;
        return "yma_" + c31920yr + "_position_" + m33355a;
    }
}

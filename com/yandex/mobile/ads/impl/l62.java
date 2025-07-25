package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l62 {
    @NotNull
    /* renamed from: a */
    public static String m32341a(long j, @NotNull i72 adPodInfo, @NotNull z52 videoAd) {
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        int m33355a = adPodInfo.m33355a();
        String m26364g = videoAd.m26364g();
        if (m26364g == null) {
            m26364g = String.valueOf(ag0.m35902a());
        }
        return "ad_break_#" + j + "|position_" + m33355a + "|video_ad_#" + m26364g;
    }
}

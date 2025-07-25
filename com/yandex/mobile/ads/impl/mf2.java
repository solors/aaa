package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mf2 implements AdPodInfo {
    @NotNull

    /* renamed from: a */
    private final i72 f82172a;

    public mf2(@NotNull i72 adPodInfo) {
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        this.f82172a = adPodInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mf2) && Intrinsics.m17075f(this.f82172a, ((mf2) obj).f82172a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdPosition() {
        return this.f82172a.m33355a();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.AdPodInfo
    public final int getAdsCount() {
        return this.f82172a.m33354b();
    }

    public final int hashCode() {
        return this.f82172a.hashCode();
    }

    @NotNull
    public final String toString() {
        i72 i72Var = this.f82172a;
        return "YandexAdPodInfo(adPodInfo=" + i72Var + ")";
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ih2 implements SkipInfo {
    @NotNull

    /* renamed from: a */
    private final x72 f80465a;

    public ih2(@NotNull x72 skipInfo) {
        Intrinsics.checkNotNullParameter(skipInfo, "skipInfo");
        this.f80465a = skipInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ih2) && Intrinsics.m17075f(this.f80465a, ((ih2) obj).f80465a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f80465a.m27626a();
    }

    public final int hashCode() {
        return this.f80465a.hashCode();
    }

    @NotNull
    public final String toString() {
        x72 x72Var = this.f80465a;
        return "YandexSkipInfo(skipInfo=" + x72Var + ")";
    }
}

package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.t4 */
/* loaded from: classes8.dex */
public final class C31423t4 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f85497a = new LinkedHashMap();
    @NotNull

    /* renamed from: b */
    private final LinkedHashMap f85498b = new LinkedHashMap();

    @Nullable
    /* renamed from: a */
    public final C31015o4 m29308a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return (C31015o4) this.f85497a.get(videoAd);
    }

    @Nullable
    /* renamed from: a */
    public final kl0 m29307a(@NotNull C31015o4 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        return (kl0) this.f85498b.get(adInfo);
    }

    /* renamed from: a */
    public final void m29306a(@NotNull C31015o4 adInfo, @NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f85497a.put(videoAd, adInfo);
        this.f85498b.put(adInfo, videoAd);
    }
}

package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s4 */
/* loaded from: classes8.dex */
public final class C31329s4 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f85012a = new LinkedHashMap();
    @NotNull

    /* renamed from: b */
    private final LinkedHashMap f85013b = new LinkedHashMap();

    @Nullable
    /* renamed from: a */
    public final C30909n4 m29868a(@NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        return (C30909n4) this.f85012a.get(videoAd);
    }

    @Nullable
    /* renamed from: a */
    public final kl0 m29867a(@NotNull C30909n4 adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        return (kl0) this.f85013b.get(adInfo);
    }

    /* renamed from: a */
    public final void m29866a(@NotNull C30909n4 adInfo, @NotNull kl0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f85012a.put(videoAd, adInfo);
        this.f85013b.put(adInfo, videoAd);
    }
}

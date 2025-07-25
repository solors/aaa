package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rk0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ky */
/* loaded from: classes8.dex */
public final class C30757ky {
    @NotNull

    /* renamed from: a */
    private final rk0 f81633a;

    public C30757ky(@NotNull ze1 playerVolumeProvider) {
        Intrinsics.checkNotNullParameter(playerVolumeProvider, "playerVolumeProvider");
        rk0.C31295a c31295a = new rk0.C31295a();
        float volume = playerVolumeProvider.getVolume();
        if (volume == 0.0f) {
            c31295a.m29995a(1.0f);
            c31295a.m29991b(true);
        } else {
            c31295a.m29995a(volume);
            c31295a.m29991b(false);
        }
        this.f81633a = c31295a.m29996a();
    }

    @NotNull
    /* renamed from: a */
    public final rk0 m32401a() {
        return this.f81633a;
    }
}

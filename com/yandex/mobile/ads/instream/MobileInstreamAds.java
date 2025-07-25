package com.yandex.mobile.ads.instream;

import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.fl0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@MainThread
/* loaded from: classes8.dex */
public final class MobileInstreamAds {
    @NotNull
    public static final MobileInstreamAds INSTANCE = new MobileInstreamAds();

    private MobileInstreamAds() {
    }

    public static final void setAdGroupPreloading(boolean z) {
        int i = fl0.f79105f;
        fl0.C30322a.m34123a().m34130a(z);
    }
}

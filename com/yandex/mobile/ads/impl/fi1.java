package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class fi1 implements l51 {
    @Override // com.yandex.mobile.ads.impl.l51
    @NotNull
    /* renamed from: a */
    public final f31 mo27118a(@NotNull Context context, @NotNull z01 nativeAd, @NotNull b31 nativeAdManager, @NotNull wg0 imageProvider, @NotNull C30630jk binderConfiguration, @NotNull u11 nativeAdControllers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdManager, "nativeAdManager");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(binderConfiguration, "binderConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        return new g61(context, nativeAd, nativeAdManager, imageProvider, binderConfiguration, nativeAdControllers);
    }
}

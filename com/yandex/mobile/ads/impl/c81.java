package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c81 {
    @NotNull

    /* renamed from: a */
    private final C30272eu f77548a;

    public /* synthetic */ c81() {
        this(new C30272eu());
    }

    @NotNull
    /* renamed from: a */
    public final ea2 m35340a(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f77548a.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        ea2 videoScaleType = mediaView.getVideoScaleType();
        if (videoScaleType == null) {
            return ea2.f78497b;
        }
        return videoScaleType;
    }

    public c81(@NotNull C30272eu customizableMediaViewManager) {
        Intrinsics.checkNotNullParameter(customizableMediaViewManager, "customizableMediaViewManager");
        this.f77548a = customizableMediaViewManager;
    }
}

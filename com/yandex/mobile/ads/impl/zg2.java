package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.video.InterfaceC32049b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zg2 implements InterfaceC32049b {
    @NotNull

    /* renamed from: a */
    private final C31149ps f88858a;

    public zg2(@NotNull C31149ps nativeAdVideoController) {
        Intrinsics.checkNotNullParameter(nativeAdVideoController, "nativeAdVideoController");
        this.f88858a = nativeAdVideoController;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zg2) && Intrinsics.m17075f(this.f88858a, ((zg2) obj).f88858a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f88858a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.InterfaceC32049b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void pauseAd() {
        this.f88858a.m30589a();
    }

    @Override // com.yandex.mobile.ads.nativeads.video.InterfaceC32049b, com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public final void resumeAd() {
        this.f88858a.m30588b();
    }

    @NotNull
    public final String toString() {
        C31149ps c31149ps = this.f88858a;
        return "YandexNativeAdVideoControllerAdapter(nativeAdVideoController=" + c31149ps + ")";
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xg2 implements NativeAdMedia {
    @NotNull

    /* renamed from: a */
    private final C31062os f87687a;

    public xg2(@NotNull C31062os media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f87687a = media;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xg2) && Intrinsics.m17075f(this.f87687a, ((xg2) obj).f87687a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdMedia
    public final float getAspectRatio() {
        return this.f87687a.m30932a();
    }

    public final int hashCode() {
        return this.f87687a.hashCode();
    }

    @NotNull
    public final String toString() {
        C31062os c31062os = this.f87687a;
        return "YandexNativeAdMediaAdapter(media=" + c31062os + ")";
    }
}

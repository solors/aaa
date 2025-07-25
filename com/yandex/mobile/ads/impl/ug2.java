package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ug2 implements NativeAdImage {
    @NotNull

    /* renamed from: a */
    private final C30745ks f86270a;

    public ug2(@NotNull C30745ks image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f86270a = image;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ug2) && Intrinsics.m17075f(this.f86270a, ((ug2) obj).f86270a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    @Nullable
    public final Bitmap getBitmap() {
        return this.f86270a.m32450a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getHeight() {
        return this.f86270a.m32449b();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final int getWidth() {
        return this.f86270a.m32447d();
    }

    public final int hashCode() {
        return this.f86270a.hashCode();
    }

    @NotNull
    public final String toString() {
        C30745ks c30745ks = this.f86270a;
        return "YandexNativeAdImageAdapter(image=" + c30745ks + ")";
    }
}

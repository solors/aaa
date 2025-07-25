package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.n91;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class j32 implements n91.InterfaceC30921c {
    @NotNull

    /* renamed from: a */
    private final LruCache<String, Bitmap> f80739a;
    @NotNull

    /* renamed from: b */
    private final lg0 f80740b;

    public j32(@NotNull o91 bitmapLruCache, @NotNull lg0 imageCacheKeyGenerator) {
        Intrinsics.checkNotNullParameter(bitmapLruCache, "bitmapLruCache");
        Intrinsics.checkNotNullParameter(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.f80739a = bitmapLruCache;
        this.f80740b = imageCacheKeyGenerator;
    }

    @Nullable
    /* renamed from: a */
    public final Bitmap m33047a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f80740b.getClass();
        return this.f80739a.get(lg0.m32273a(url));
    }

    @Override // com.yandex.mobile.ads.impl.n91.InterfaceC30921c
    /* renamed from: a */
    public final void mo31631a(@NotNull String url, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f80740b.getClass();
        this.f80739a.put(lg0.m32273a(url), bitmap);
    }
}

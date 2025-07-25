package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.yandex.mobile.ads.impl.n91;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class tu1 extends sg0 {
    @NotNull

    /* renamed from: g */
    private final lg0 f85879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu1(@NotNull am1 queue, @NotNull n91.C30920b imageCache, @NotNull lg0 imageCacheKeyGenerator) {
        super(queue, imageCache);
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.f85879g = imageCacheKeyGenerator;
    }

    @Override // com.yandex.mobile.ads.impl.sg0
    @NotNull
    /* renamed from: a */
    public final String mo28994a(@NotNull String url, int i, int i2, @NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f85879g.getClass();
        return lg0.m32271b(url, scaleType);
    }
}

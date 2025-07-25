package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class x51 implements kh0 {

    /* renamed from: a */
    final /* synthetic */ wg0 f87555a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x51(wg1 wg1Var) {
        this.f87555a = wg1Var;
    }

    @Override // com.yandex.mobile.ads.impl.kh0
    /* renamed from: a */
    public final void mo25986a(@NotNull String url, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f87555a.mo27908a(url, bitmap);
    }

    @Override // com.yandex.mobile.ads.impl.kh0
    /* renamed from: a */
    public final void mo25985a(@NotNull Map<String, Bitmap> images) {
        Intrinsics.checkNotNullParameter(images, "images");
    }
}

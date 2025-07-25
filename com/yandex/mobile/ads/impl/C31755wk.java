package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wk */
/* loaded from: classes8.dex */
public final class C31755wk {
    @NotNull

    /* renamed from: a */
    private final ft0 f87292a;

    public C31755wk(@NotNull ft0 referenceMediaFileInfo) {
        Intrinsics.checkNotNullParameter(referenceMediaFileInfo, "referenceMediaFileInfo");
        this.f87292a = referenceMediaFileInfo;
    }

    /* renamed from: a */
    public final int m27878a(@NotNull et0 mediaFile) {
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        int m34449b = mediaFile.m34449b();
        if (m34449b == 0) {
            return (int) (((mediaFile.m34447d() * mediaFile.m34443h()) / (this.f87292a.m34082b() * this.f87292a.m34081c())) * this.f87292a.m34083a());
        }
        return m34449b;
    }
}

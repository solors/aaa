package com.moloco.sdk.publisher;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MolocoAdKt {
    @NotNull
    public static final MolocoAd createAdInfo(@NotNull String adUnitId, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new MolocoAd("Moloco", adUnitId, f);
    }

    public static /* synthetic */ MolocoAd createAdInfo$default(String str, Float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = null;
        }
        return createAdInfo(str, f);
    }
}

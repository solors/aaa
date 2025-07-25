package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class MolocoAdErrorKt {
    @NotNull
    public static final MolocoAdError createAdErrorInfo(@NotNull String adUnitId, @NotNull MolocoAdError.ErrorType errorType) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        return new MolocoAdError("Moloco", adUnitId, errorType, null, 8, null);
    }
}

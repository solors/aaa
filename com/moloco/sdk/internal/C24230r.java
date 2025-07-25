package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.InterfaceC24576c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.r */
/* loaded from: classes7.dex */
public final class C24230r {
    @NotNull
    /* renamed from: a */
    public static final C24229q m46750a(@NotNull String adUnitId, @NotNull MolocoAdError.ErrorType errorType, @NotNull InterfaceC24576c subErrorType) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        return new C24229q(new MolocoAdError("Moloco", adUnitId, errorType, null, 8, null), subErrorType);
    }
}
